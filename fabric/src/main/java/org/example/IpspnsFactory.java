package org.example;

import org.example.model.*;

public class IpspnsFactory {


    public Ipspns createIpspnsTeam(String role) {
        Ipspns ipspns = null;

        switch (role) {
            case "QA":
                ipspns = new QA();
                break;
            case "Dev":
                ipspns = new Dev();
                break;
            case "Mobile":
                ipspns = new Mobile();
                break;
            case "Management":
                ipspns = new Management();
                break;
            case "Analytics":
                ipspns = new Analytics();
                break;
        }
        return ipspns;
    }
}
