# -*- encoding:utf-8 -*-

from generate import ttypes


class PersonServiceImpl:

    def getPersonByUsername(self, username):
        print("getPersonByUsername Got username " + username)

        person = ttypes.Person()
        person.username = "哈哈哈"
        person.age = 111
        person.married = True

        return person

    def savePerson(self, person):
        print("savePerson %s" % person)
