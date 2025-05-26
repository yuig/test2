package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.json.GsonFactory;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import um.a;
import um.b;
import um.c;

/* loaded from: classes3.dex */
public abstract class JsonUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final AwsJsonFactory f29058a = new GsonFactory();

    public static Map a(String str) {
        String Y0;
        if (str == null || str.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        StringReader stringReader = new StringReader(str);
        ((GsonFactory) f29058a).getClass();
        GsonFactory.GsonReader gsonReader = new GsonFactory.GsonReader(stringReader);
        try {
            if (gsonReader.a() == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap hashMap = new HashMap();
            a aVar = gsonReader.f29056a;
            aVar.c();
            while (aVar.hasNext()) {
                String k03 = aVar.k0();
                b K = aVar.K();
                if (!b.BEGIN_ARRAY.equals(K) && !b.BEGIN_OBJECT.equals(K)) {
                    b K2 = aVar.K();
                    if (b.NULL.equals(K2)) {
                        aVar.B1();
                        Y0 = null;
                    } else {
                        Y0 = b.BOOLEAN.equals(K2) ? aVar.R0() ? "true" : "false" : aVar.Y0();
                    }
                    hashMap.put(k03, Y0);
                }
                aVar.E();
            }
            aVar.g();
            aVar.close();
            return Collections.unmodifiableMap(hashMap);
        } catch (IOException e13) {
            throw new AmazonClientException("Unable to parse JSON String.", e13);
        }
    }

    public static String b(Map map) {
        if (map == null || map.isEmpty()) {
            return "{}";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            ((GsonFactory) f29058a).getClass();
            c cVar = new GsonFactory.GsonWriter(stringWriter).f29057a;
            cVar.d();
            for (Map.Entry entry : map.entrySet()) {
                cVar.h((String) entry.getKey());
                cVar.M((String) entry.getValue());
            }
            cVar.g();
            cVar.close();
            return stringWriter.toString();
        } catch (IOException e13) {
            throw new AmazonClientException("Unable to serialize to JSON String.", e13);
        }
    }
}
