package org.rb.contacts.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.rb.contacts.config.Resources;

/**
 *
 * @author raitis
 * A class extending {@link Application} and annotated with 
 * @ApplicationPath is the Java EE 6 "no XML" approach to activating
 * JAX-RS.
 * 
 * <p>
 * Resources are served relative to the servlet path specified in the {@link ApplicationPath} annotation.
 * </p>
 */
@ApplicationPath("/rest")
public class JaxRsActivator extends Application{

    /**
     * Inject resources providers
     * @return 
     */
    @Override
    public Set<Object> getSingletons() {
    final Set<Object> singletons = new HashSet<>();
        // Register an instance of LoggingFilter.
        singletons.add(new Resources());
        return singletons;
        
    }

    @Override
    public Set<Class<?>> getClasses() {
    Set<Class<?>> s = new HashSet<>();
        s.add(ContactRESTService.class);
        return s;   
    }
    /**
     * Disable MoxyJson to avoid
     * Error: MessageBodyWriter not found for media type=application/json
     * @return 
     */
    @Override
  public Map<String, Object> getProperties() {
    final Map<String, Object> properties = new HashMap<>();
    properties.put("jersey.config.server.disableMoxyJson", true);

    return properties;
  }
}
