package com.lichunorz.grpc;

import com.lichunorz.grpc.gen.*;
import com.lichunorz.netty.starter.util.N;
import io.grpc.stub.StreamObserver;

import java.util.stream.IntStream;

public class GrpcServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public StreamObserver<Ages> getStudentListByAges(StreamObserver<StudentList> responseObserver) {
        return new StreamObserver<Ages>() {
            @Override
            public void onNext(Ages ages) {
                N.log("getStudentListByAges ==>" + ages);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                Student s1 = Student.newBuilder().setName("stu1").setAge(102).setCity("a1").build();
                Student s2 = Student.newBuilder().setName("stu2").setAge(101).setCity("a2").build();
                responseObserver.onNext(StudentList.newBuilder().addStudentList(s1).addStudentList(s2).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void getStudentsByAge(Age request, StreamObserver<Student> responseObserver) {
        N.log("getStudentsByAge ==>" + request.getAge());
        IntStream.range(0, 5).forEach(i -> {
            responseObserver.onNext(Student.newBuilder().setName("lichun" + i).setAge(i).setCity("city" + i).build());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        responseObserver.onCompleted();
    }

    @Override
    public void getRealNameByUsername(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        N.log("getRealNameByUsername ==>" + request.getUsername());
        responseObserver.onNext(MyResponse.newBuilder().setRealname(request.getUsername().toUpperCase()).build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<MyRequest> talk(StreamObserver<MyResponse> responseObserver) {
        return new StreamObserver<MyRequest>() {
            @Override
            public void onNext(MyRequest myRequest) {
                N.log("talk ==>" + myRequest.getUsername());
                responseObserver.onNext(MyResponse.newBuilder().setRealname(myRequest.getUsername().toUpperCase()).build());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                N.log("talk ==> onCompleted");
                responseObserver.onCompleted();
            }
        };
    }
}
