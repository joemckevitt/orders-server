package com.joe.family;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: pjmckevitt
 * Date: 26/01/2013
 * Time: 23:30
 * To change this template use File | Settings | File Templates.
 */

//http://localhost:9090/family_restful_service/family/list
//curl get http://localhost:9090/family_restful_service/family/list

@Path("family")
public class FamilyController {

    private static List<String> family = new ArrayList<String>();

    static   {
        family.add("Joe");
        family.add("John");
        family.add("James");
        family.add("Mazza");
        family.add("Claire");
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

        return header;
    }
}
