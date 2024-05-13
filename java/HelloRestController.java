import javax.annotation.processing.Generated;

@ApplicationScoped
@Path("/hello")
public class HelloRestController {
    @Inject 
    private HelloService helloService;

    @GET    
    @PATH("/{name}")
    @Produces("text/plain")
    public String sayHello(@PathParam("name") String name) {
        return helloService.sayHello(name);
    }
}