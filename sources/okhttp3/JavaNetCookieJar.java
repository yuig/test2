package okhttp3;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.q0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import okhttp3.Cookie;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/JavaNetCookieJar;", "Lokhttp3/CookieJar;", "okhttp-urlconnection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class JavaNetCookieJar implements CookieJar {

    /* renamed from: b, reason: collision with root package name */
    public final CookieHandler f95650b;

    public JavaNetCookieJar(CookieManager cookieHandler) {
        Intrinsics.checkNotNullParameter(cookieHandler, "cookieHandler");
        this.f95650b = cookieHandler;
    }

    @Override // okhttp3.CookieJar
    public final List a(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Map<String, List<String>> cookieHeaders = this.f95650b.get(url.j(), z0.d());
            Intrinsics.checkNotNullExpressionValue(cookieHeaders, "cookieHeaders");
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : cookieHeaders.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                int i13 = 1;
                if (z.i("Cookie", key, true) || z.i("Cookie2", key, true)) {
                    String str = "value";
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    if (!value.isEmpty()) {
                        Iterator<String> it = value.iterator();
                        while (it.hasNext()) {
                            String header = it.next();
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            Intrinsics.checkNotNullExpressionValue(header, "header");
                            ArrayList arrayList2 = new ArrayList();
                            int length = header.length();
                            boolean z13 = false;
                            int i14 = 0;
                            while (i14 < length) {
                                int f13 = Util.f(header, i14, length, ";,");
                                int e13 = Util.e(header, '=', i14, f13);
                                String name = Util.D(i14, e13, header);
                                if (z.p(name, "$", z13)) {
                                    i14 = f13 + 1;
                                } else {
                                    String D = e13 < f13 ? Util.D(e13 + 1, f13, header) : "";
                                    if (z.p(D, "\"", z13) && z.h(D, "\"", z13)) {
                                        D = D.substring(i13, D.length() - i13);
                                        Intrinsics.checkNotNullExpressionValue(D, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                    Cookie.Builder builder = new Cookie.Builder();
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    if (!Intrinsics.d(StringsKt.i0(name).toString(), name)) {
                                        throw new IllegalArgumentException("name is not trimmed".toString());
                                    }
                                    builder.f95595a = name;
                                    Intrinsics.checkNotNullParameter(D, str);
                                    if (!Intrinsics.d(StringsKt.i0(D).toString(), D)) {
                                        throw new IllegalArgumentException("value is not trimmed".toString());
                                    }
                                    builder.f95596b = D;
                                    String domain = url.f95634d;
                                    Intrinsics.checkNotNullParameter(domain, "domain");
                                    String c13 = HostnamesKt.c(domain);
                                    if (c13 == null) {
                                        throw new IllegalArgumentException("unexpected domain: ".concat(domain));
                                    }
                                    builder.f95598d = c13;
                                    builder.f95600f = z13;
                                    String str2 = builder.f95595a;
                                    if (str2 == null) {
                                        throw new NullPointerException("builder.name == null");
                                    }
                                    String str3 = builder.f95596b;
                                    if (str3 == null) {
                                        throw new NullPointerException("builder.value == null");
                                    }
                                    String str4 = builder.f95598d;
                                    if (str4 == null) {
                                        throw new NullPointerException("builder.domain == null");
                                    }
                                    arrayList2.add(new Cookie(str2, str3, builder.f95597c, str4, builder.f95599e, false, false, false, builder.f95600f));
                                    i14 = f13 + 1;
                                    str = str;
                                    it = it;
                                    i13 = 1;
                                    z13 = false;
                                }
                            }
                            arrayList.addAll(arrayList2);
                            i13 = 1;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (arrayList == null) {
                return q0.f80391a;
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n      Collections.unmo…fiableList(cookies)\n    }");
            return unmodifiableList;
        } catch (IOException e14) {
            Platform.f96214a.getClass();
            Platform platform = Platform.f96215b;
            StringBuilder sb3 = new StringBuilder("Loading cookies failed for ");
            HttpUrl i15 = url.i("/...");
            Intrinsics.f(i15);
            sb3.append(i15);
            String sb4 = sb3.toString();
            platform.getClass();
            Platform.i(5, sb4, e14);
            return q0.f80391a;
        }
    }

    @Override // okhttp3.CookieJar
    public final void b(HttpUrl url, List cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator it = cookies.iterator();
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            arrayList.add(cookie.a(true));
        }
        try {
            this.f95650b.put(url.j(), y0.b(new Pair("Set-Cookie", arrayList)));
        } catch (IOException e13) {
            Platform.f96214a.getClass();
            Platform platform = Platform.f96215b;
            StringBuilder sb3 = new StringBuilder("Saving cookies failed for ");
            HttpUrl i13 = url.i("/...");
            Intrinsics.f(i13);
            sb3.append(i13);
            String sb4 = sb3.toString();
            platform.getClass();
            Platform.i(5, sb4, e13);
        }
    }
}
