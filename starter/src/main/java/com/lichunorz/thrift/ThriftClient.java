package com.lichunorz.thrift;

import com.lichunorz.netty.starter.util.N;
import com.lichunorz.thrift.generate.Person;
import com.lichunorz.thrift.generate.PersonService;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class ThriftClient {

    public static void main(String[] args) {
        TTransport transport = new TFramedTransport(new TSocket("127.0.0.1", 8899), 600);
        final TCompactProtocol protocol = new TCompactProtocol(transport);
        final PersonService.Client client = new PersonService.Client(protocol);
        try {
            transport.open();
            final Person person = client.getPersonByUsername("l");
            N.log(person.toString());
            N.log("===================");
            client.savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            transport.close();
        }
    }
}
