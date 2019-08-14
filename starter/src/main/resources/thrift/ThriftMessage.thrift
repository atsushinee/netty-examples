namespace java com.lichunorz.thrift.generate
namespace py generate

typedef i16 short
typedef i32 int
typedef i64 long
typedef bool boolean

struct Person {
    1: optional string username
    2: optional int age
    3: optional boolean married
}

exception DataException {
    1: optional string message
    2: optional string callStack
    3: optional string date
}

service PersonService {
    Person getPersonByUsername(1: required string username) throws (1:DataException dataException)
    void savePerson(1: required Person person) throws (1: DataException dataException)
}
// thrift --gen java starter/src/main/resourses/thrift/ThriftMessage.thrift