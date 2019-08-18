package com.lichunorz.grpc;

import com.lichunorz.grpc.gen.*;
import com.lichunorz.netty.starter.util.N;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.stream.IntStream;

public class GrpcClient {

    public static void main(String[] args) throws InterruptedException {
        final ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("127.0.0.1", 8899)
                .usePlaintext().build();
        final StudentServiceGrpc.StudentServiceBlockingStub blockingStub = StudentServiceGrpc.newBlockingStub(managedChannel);

        System.out.println("=================getStudentsByAge================");
        final Iterator<Student> studentsByAge = blockingStub.getStudentsByAge(Age.newBuilder().setAge(10).build());
        while (studentsByAge.hasNext()) {
            final Student next = studentsByAge.next();
            N.log(next.getName() + "||" + next.getAge() + "||" + next.getCity());
        }
        System.out.println("==================================================");
        System.out.println("============getRealNameByUsername=================");

        final MyResponse response = blockingStub.getRealNameByUsername(MyRequest.newBuilder().setUsername("lichun").build());
        N.log(response.getRealname());
        System.out.println("==================================================");

        final StudentServiceGrpc.StudentServiceStub studentServiceStub = StudentServiceGrpc.newStub(managedChannel);

        System.out.println("=====================talk=========================");

        final StreamObserver<MyRequest> talk = studentServiceStub.talk(new StreamObserver<MyResponse>() {
            @Override
            public void onNext(MyResponse myResponse) {
                System.out.println(myResponse.getRealname());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("onCompleted!");
            }
        });
        IntStream.range(0, 5).forEach(i -> {
            talk.onNext(MyRequest.newBuilder().setUsername("lichun" + i).build());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        talk.onCompleted();

        Thread.sleep(10000);
    }
}
