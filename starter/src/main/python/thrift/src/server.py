# -*- encoding:utf-8 -*-
from PersonServiceImpl import PersonServiceImpl
from generate import PersonService

from thrift import Thrift
from thrift.transport import TTransport
from thrift.transport import TSocket
from thrift.protocol import TCompactProtocol
from thrift.server import TServer

try:
    processor = PersonService.Processor(PersonServiceImpl())
    serverSocket = TSocket.TServerSocket(host="127.0.0.1", port=8899)
    transportFactory = TTransport.TFramedTransportFactory()
    protocolFactory = TCompactProtocol.TCompactProtocolFactory()

    server = TServer.TSimpleServer(
        processor, serverSocket, transportFactory, protocolFactory)
    server.serve()
except Thrift.TException as tx:
    print(tx)
