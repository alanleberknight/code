
@RequestScoped
public class HelloService {
    public String sayHello(String name) {
        return "Hello test" + name;
    }
}