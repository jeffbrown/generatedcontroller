class BootStrap {

    def init = { servletContext ->
        new demo.Person(firstName: 'Keith', lastName: 'Emerson').save()
        new demo.Person(firstName: 'Carl', lastName: 'Palmer').save()
        new demo.Person(firstName: 'Greg', lastName: 'Lake').save()
    }
    def destroy = {
    }
}
