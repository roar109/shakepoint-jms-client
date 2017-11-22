## Example of usage ##

    public class JmsFactory {
    
    	@Resource(lookup = "java:jboss/exported/ConnectionFactory")
    	private ConnectionFactory connectionFactory;
    
    	@Inject
    	private Logger log;
    
    	@Produces
    	@ApplicationScoped
    	public JmsHandler createJmsHandler() {
    		return new JmsHandler(connectionFactory, log);
    	}
    }