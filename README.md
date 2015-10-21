The controller at `grails-app/controllers/demo/PersonController.groovy` is the default controller created by `generate-controller`.
```
$ curl http://localhost:8080/person.json
[{"class":"demo.Person","id":1,"firstName":"Keith","lastName":"Emerson"},{"class":"demo.Person","id":2,"firstName":"Carl","lastName":"Palmer"},{"class":"demo.Person","id":3,"firstName":"Greg","lastName":"Lake"}]
```

```
$ curl -H "Accept: application/xml" http://localhost:8080/person
<?xml version="1.0" encoding="UTF-8"?><list><person id="1"><firstName>Keith</firstName><lastName>Emerson</lastName></person><person id="2"><firstName>Carl</firstName><lastName>Palmer</lastName></person><person id="3"><firstName>Greg</firstName><lastName>Lake</lastName></person></list>
```
