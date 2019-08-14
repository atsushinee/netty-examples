package com.lichunorz.thrift;

import com.lichunorz.netty.starter.util.N;
import com.lichunorz.thrift.generate.DataException;
import com.lichunorz.thrift.generate.Person;
import com.lichunorz.thrift.generate.PersonService;
import org.apache.thrift.TException;

public class PersonServiceImpl implements PersonService.Iface {
    @Override
    public Person getPersonByUsername(String username) throws DataException, TException {
        N.log("getPersonByUsername(username :" + username + ")");
        final Person person = new Person();
        person.setUsername("lucy");
        person.setAge(11);
        person.setMarried(false);
        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {
        N.log("savePerson(person :" + person.toString() + ")");
    }
}
