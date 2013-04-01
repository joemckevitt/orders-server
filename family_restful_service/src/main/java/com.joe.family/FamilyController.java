package com.joe.family;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: pjmckevitt
 * Date: 26/01/2013
 * Time: 23:30
 * Controller to server family queries
 */

//http://localhost:9090/family_restful_service/family/list
//curl get http://localhost:9090/family_restful_service/family/list
//url for tomcat http://127.0.0.1:8080/myfamily/family/list

@Path("family")
public class FamilyController {

    private static List<String> family = new ArrayList<String>();

    static   {
        family.add("Joseph");
        family.add("John");
        family.add("James");
        family.add("Mazza");
        family.add("Claire");
        family.add("Maire");
        family.add("Noel");
        family.add("commit, build, deploy!");
    }


    @Path("/list")
    @GET
    @Produces("text/html")
    public String list()
    {
        String header = "<h2>All the folks</h2>\n";

        header += "<ul>";
        for (String familyMember : family)
        {
            header += "\n<li>#" + familyMember + " McKevitt" + "</li>";
        }

        header += "\n</ul>";
        header += "<h2>Page generated at " + new Date() + "</h2>\n";

        return header;
    }
}
