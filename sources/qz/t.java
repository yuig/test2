package qz;

import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t implements CookieStore {

    /* renamed from: a, reason: collision with root package name */
    public final f30.b f105433a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f105434b;

    public t(f30.b apiUtils) {
        Intrinsics.checkNotNullParameter(apiUtils, "apiUtils");
        this.f105433a = apiUtils;
        this.f105434b = new c0();
    }

    public final boolean a() {
        ArrayList arrayList = new ArrayList();
        String host = new URI(kotlin.text.z.n(this.f105433a.f60985e, "%s", "")).getHost();
        Intrinsics.f(host);
        if (kotlin.text.z.p(host, "www.", false)) {
            host = host.substring(4);
            Intrinsics.checkNotNullExpressionValue(host, "substring(...)");
        }
        Iterator it = ((ArrayList) getCookies()).iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it.next();
            String name = httpCookie.getName();
            String domain = httpCookie.getDomain();
            if (Intrinsics.d(name, "_b") && kotlin.text.z.h(host, String.valueOf(domain), false) && !httpCookie.hasExpired()) {
                arrayList.add(httpCookie);
            } else {
                z13 = true;
            }
        }
        c0 c0Var = this.f105434b;
        c0Var.removeAll();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            HttpCookie cookie = (HttpCookie) it2.next();
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            c0Var.a(cookie);
        }
        return z13;
    }

    @Override // java.net.CookieStore
    public final void add(URI uri, HttpCookie cookie) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        this.f105434b.a(cookie);
    }

    @Override // java.net.CookieStore
    public final List get(URI uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List list = this.f105434b.get(uri);
        Intrinsics.checkNotNullExpressionValue(list, "get(...)");
        return list;
    }

    @Override // java.net.CookieStore
    public final List getCookies() {
        List cookies = this.f105434b.getCookies();
        Intrinsics.checkNotNullExpressionValue(cookies, "getCookies(...)");
        return cookies;
    }

    @Override // java.net.CookieStore
    public final List getURIs() {
        this.f105434b.getClass();
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullExpressionValue(arrayList, "getURIs(...)");
        return arrayList;
    }

    @Override // java.net.CookieStore
    public final boolean remove(URI uri, HttpCookie cookie) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        return this.f105434b.remove(uri, cookie);
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        return a();
    }
}
