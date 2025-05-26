package qz;

import android.text.TextUtils;
import android.util.Log;
import com.pinterest.api.SerializableCookie;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c0 implements CookieStore {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f105378a;

    /* renamed from: b, reason: collision with root package name */
    public final lb0.o f105379b;

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c0() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qz.c0.<init>():void");
    }

    public final void a(HttpCookie httpCookie) {
        String str;
        if (httpCookie.getMaxAge() < 0) {
            return;
        }
        String str2 = httpCookie.getName() + httpCookie.getDomain();
        boolean hasExpired = httpCookie.hasExpired();
        ConcurrentHashMap concurrentHashMap = this.f105378a;
        if (hasExpired) {
            concurrentHashMap.remove(str2);
        } else {
            concurrentHashMap.put(str2, httpCookie);
        }
        lb0.m c13 = ((lb0.b) this.f105379b).c();
        c13.putString("names", TextUtils.join(",", concurrentHashMap.keySet()));
        String str3 = "cookie_" + str2;
        SerializableCookie serializableCookie = new SerializableCookie(httpCookie);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(serializableCookie);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            StringBuilder sb3 = new StringBuilder(byteArray.length * 2);
            for (byte b13 : byteArray) {
                int i13 = b13 & 255;
                if (i13 < 16) {
                    sb3.append('0');
                }
                sb3.append(Integer.toHexString(i13));
            }
            str = sb3.toString().toUpperCase(Locale.US);
        } catch (IOException e13) {
            Log.d("PersistentCookieStore", "IOException in encodeCookie", e13);
            str = null;
        }
        c13.putString(str3, str);
        c13.apply();
    }

    @Override // java.net.CookieStore
    public final void add(URI uri, HttpCookie httpCookie) {
        a(httpCookie);
    }

    @Override // java.net.CookieStore
    public final List get(URI uri) {
        Collection<HttpCookie> values = this.f105378a.values();
        ArrayList arrayList = new ArrayList();
        String host = uri.getHost();
        for (HttpCookie httpCookie : values) {
            if (host.endsWith(httpCookie.getDomain())) {
                arrayList.add(httpCookie);
            }
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public final List getCookies() {
        Collection<HttpCookie> values = this.f105378a.values();
        ArrayList arrayList = new ArrayList();
        for (HttpCookie httpCookie : values) {
            if (!httpCookie.hasExpired()) {
                arrayList.add(httpCookie);
            }
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public final List getURIs() {
        return new ArrayList();
    }

    @Override // java.net.CookieStore
    public final boolean remove(URI uri, HttpCookie httpCookie) {
        String str = httpCookie.getName() + httpCookie.getDomain();
        boolean z13 = this.f105378a.remove(str) == null;
        lb0.m c13 = ((lb0.b) this.f105379b).c();
        c13.remove("cookie_" + str);
        c13.apply();
        return z13;
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        lb0.m c13 = ((lb0.b) this.f105379b).c();
        ConcurrentHashMap concurrentHashMap = this.f105378a;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            c13.remove("cookie_" + ((String) it.next()));
        }
        c13.remove("names");
        c13.apply();
        concurrentHashMap.clear();
        return true;
    }
}
