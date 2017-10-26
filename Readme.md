CRUD Example Using HTML5, jQuery Mobile and JAX-RS
======================================================================
Technologies: jQuery Mobile, jQuery, JavaScript, HTML5, REST  

Summary: The `contacts-mobile-basic` quickstart demonstrates a Java EE 6 mobile database application using HTML5, 
jQuery Mobile, JAX-RS, JPA 2.0, and REST.  
Source: <https://github.com/jboss-developer/jboss-wfk-quickstarts>  

 The JaxRS application with Hibernate JPA is for Payara server 4.1
 Produce/Consumes JSON by Jackson provider.

What is it?
-----------

The `contact-mobile-basic` quickstart is a deployable Maven 3 project designed 
written for Payara Server.

Config notes
------------
1. Resources class is loaded as singletone by JaxRsActivator.
    EntityManager and logger is produced by Resources class.

2. Disable MoxyJson to avoid
     * Error: MessageBodyWriter not found for media type=application/json

3. ContactRestService exposes Restful service
    for this it injects: ContactService
    
4.  ContactService injects ContactRepository

5. @JsonFormat is useful for date formating when Jason Jackson is used

Access
------
In browser type: http://localhost:8080/PayaraContactsHibernate/rest/contacts
