# -*- coding:utf-8 -*-

from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TCompactProtocol
from generate import PersonService

try:
    tsocket = TSocket.TSocket('localhost', 8899)
    tsocket.setTimeout(600)

    transport = TTransport.TFramedTransport(tsocket)
    protocol = TCompactProtocol.TCompactProtocol(transport)
    client = PersonService.Client(protocol)

    transport.open()

    person = client.getPersonByUsername("哈哈")
    print(person)
    person.username = "呵呵"
    client.savePerson(person)
except Thrift.TException as tx:
    print(tx)
