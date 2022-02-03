package com.edgardev.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet = new AccessToInternet();
    private static List<String> bannedUrl;

    static {
        bannedUrl = new ArrayList<>();
        bannedUrl.add("twitter.com");
        bannedUrl.add("facebook.com");
        bannedUrl.add("instagram.com");
    }

    @Override
    public void connectTo(String url) throws Exception {
        if (bannedUrl.contains(url)) {
            throw new Exception("ULR bloqueada - Acceso Denegado - Consulta com tu administrador");
        }
        internet.connectTo(url);
    }
}
