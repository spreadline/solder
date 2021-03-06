package org.jboss.seam.solder.test.core;

import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

import org.jboss.seam.solder.core.FullyQualified;

@FullyQualified
@Model
public class FullyQualifiedModelBean
{
   @Produces @FullyQualified @Named
   private boolean model = true;
   
   @Produces @FullyQualified @Named
   public String getWordOfTheDay()
   {
      return "Dragon";
   }
   
   @Produces @FullyQualified @Named
   public Integer size()
   {
      return 0;
   }
}
