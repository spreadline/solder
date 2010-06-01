package org.jboss.weld.extensions.util.properties;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Utility class for working with JavaBean style properties
 * 
 * @author pmuir
 *
 */
public class Properties
{
   
   private Properties() {}
 
   /**
    * Create a JavaBean style property from the field
    * 
    * @param <V>
    * @param field
    * @return
    */
   public static <V> Property<V> createProperty(Field field)
   {
      return new FieldProperty<V>(field);
   }
   
   /**
    * Create a JavaBean style property from the specified method
    * 
    * @param <V>
    * @param method
    * @return
    * @throws IllegalArgumentException if the method does not match JavaBean conventions
    */
   public static <V> Property<V> createProperty(Method method)
   {
      return new MethodProperty<V>(method);
   }

}
