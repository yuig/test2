package com.amazonaws.util;

import com.amazonaws.ClientConfiguration;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes3.dex */
public abstract class RuntimeHttpUtils {
    public static URI a(ClientConfiguration clientConfiguration, String str) {
        if (clientConfiguration == null) {
            throw new IllegalArgumentException("ClientConfiguration cannot be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("endpoint cannot be null");
        }
        if (!str.contains("://")) {
            str = clientConfiguration.f28528d.toString() + "://" + str;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e13) {
            throw new IllegalArgumentException(e13);
        }
    }
}
