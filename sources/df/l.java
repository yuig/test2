package df;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f54789a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f54790b = new f0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f54791c = new f0(1);

    public static final String a() {
        if (p001if.a.b(l.class)) {
            return null;
        }
        try {
            Context a13 = le.v.a();
            List<ResolveInfo> queryIntentServices = a13.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                String[] strArr = f54789a;
                Intrinsics.checkNotNullParameter(strArr, "<this>");
                HashSet hashSet = new HashSet(kotlin.collections.y0.a(3));
                kotlin.collections.c0.V(hashSet, strArr);
                Iterator<ResolveInfo> it = queryIntentServices.iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th3) {
            p001if.a.a(l.class, th3);
            return null;
        }
    }

    public static final String b() {
        if (p001if.a.b(l.class)) {
            return null;
        }
        try {
            return Intrinsics.n(le.v.a().getPackageName(), "fbconnect://cct.");
        } catch (Throwable th3) {
            p001if.a.a(l.class, th3);
            return null;
        }
    }

    public static final String c(String developerDefinedRedirectURI) {
        if (p001if.a.b(l.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(developerDefinedRedirectURI, "developerDefinedRedirectURI");
            String str = k1.f54788a;
            return k1.a(le.v.a(), developerDefinedRedirectURI) ? developerDefinedRedirectURI : k1.a(le.v.a(), b()) ? b() : "";
        } catch (Throwable th3) {
            p001if.a.a(l.class, th3);
            return null;
        }
    }

    public static JSONObject d(BufferedInputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        if (stream.read() != 0) {
            return null;
        }
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < 3; i15++) {
            int read = stream.read();
            if (read == -1) {
                wc.b bVar = u0.f54860d;
                wc.b.x(le.g0.CACHE, k0.f54779h, "readHeader: stream.read returned -1 while reading header size");
                return null;
            }
            i14 = (i14 << 8) + (read & 255);
        }
        byte[] bArr = new byte[i14];
        while (i13 < i14) {
            int read2 = stream.read(bArr, i13, i14 - i13);
            if (read2 < 1) {
                wc.b bVar2 = u0.f54860d;
                wc.b.x(le.g0.CACHE, k0.f54779h, a.a.f("readHeader: stream.read stopped at ", i13, " when expected ", i14));
                return null;
            }
            i13 += read2;
        }
        try {
            Object nextValue = new JSONTokener(new String(bArr, Charsets.UTF_8)).nextValue();
            if (nextValue instanceof JSONObject) {
                return (JSONObject) nextValue;
            }
            wc.b bVar3 = u0.f54860d;
            wc.b.x(le.g0.CACHE, k0.f54779h, Intrinsics.n(nextValue.getClass().getCanonicalName(), "readHeader: expected JSONObject, got "));
            return null;
        } catch (JSONException e13) {
            throw new IOException(e13.getMessage());
        }
    }
}
