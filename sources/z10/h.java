package z10;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.s0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.z;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;
import p1.p1;
import pk.a0;
import q5.w0;
import ql2.k;
import ql2.s;
import yn2.c0;
import yn2.m;
import yn2.x;

/* loaded from: classes.dex */
public final class h implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f140593a;

    public h(pb0.a clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f140593a = clock;
    }

    public static Map a(Request request) {
        RequestBody requestBody = request.f95703d;
        if (requestBody == null) {
            return z0.d();
        }
        wo2.j jVar = new wo2.j();
        try {
            requestBody.d(jVar);
            String M = jVar.M();
            dl2.b.J(jVar, null);
            JSONObject jSONObject = new JSONObject(M);
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            Sequence c13 = x.c(keys);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : c13) {
                linkedHashMap.put(obj, jSONObject.getString((String) obj));
            }
            return linkedHashMap;
        } finally {
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Iterable unmodifiableSet;
        Collection collection;
        LinkedHashMap linkedHashMap;
        String str = "";
        Intrinsics.checkNotNullParameter(chain, "chain");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ((pb0.g) this.f140593a).getClass();
        String valueOf = String.valueOf(timeUnit.toSeconds(System.currentTimeMillis()));
        Request f95974e = chain.getF95974e();
        HttpUrl.Builder f13 = f95974e.f95700a.f();
        f13.b("client_id", "1431602");
        f13.b("timestamp", valueOf);
        HttpUrl c13 = f13.c();
        LinkedHashMap params = new LinkedHashMap();
        List list = c13.f95637g;
        if (list == null) {
            unmodifiableSet = s0.f80394a;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            kotlin.ranges.a p13 = s.p(s.q(0, list.size()), 2);
            int i13 = p13.f80453a;
            int i14 = p13.f80454b;
            int i15 = p13.f80455c;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    Object obj = list.get(i13);
                    Intrinsics.f(obj);
                    linkedHashSet.add(obj);
                    if (i13 == i14) {
                        break;
                    }
                    i13 += i15;
                }
            }
            unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
            Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(result)");
        }
        w0 K = CollectionsKt.K(unmodifiableSet);
        p1 transform = new p1(c13, 9);
        Intrinsics.checkNotNullParameter(K, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        params.putAll(z0.o(c0.p(c0.j(new m(K, transform), g.f140590j), g.f140591k)));
        if (StringsKt.E(f95974e.f95700a.b(), "graphql", false)) {
            params.putAll(a(chain.getF95974e()));
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            RequestBody requestBody = f95974e.f95703d;
            FormBody formBody = requestBody instanceof FormBody ? (FormBody) requestBody : null;
            if (formBody != null) {
                List list2 = formBody.f95613b;
                k it = s.q(0, list2.size()).iterator();
                while (it.f104109c) {
                    int b13 = it.b();
                    HttpUrl.Companion companion = HttpUrl.f95629k;
                    linkedHashMap2.put(HttpUrl.Companion.g(companion, (String) list2.get(b13), 0, 0, true, 3), HttpUrl.Companion.g(companion, (String) formBody.f95614c.get(b13), 0, 0, true, 3));
                }
            }
            params.putAll(linkedHashMap2);
        }
        Request f95974e2 = chain.getF95974e();
        String method = f95974e2.f95701b;
        Intrinsics.checkNotNullParameter(method, "method");
        String actualUrl = c13.f95639i;
        Intrinsics.checkNotNullParameter(actualUrl, "actualUrl");
        Intrinsics.checkNotNullParameter(params, "params");
        List f14 = new Regex("\\?").f(0, actualUrl);
        if (!f14.isEmpty()) {
            ListIterator listIterator = f14.listIterator(f14.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = CollectionsKt.y0(f14, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = q0.f80391a;
        String str2 = ((String[]) collection.toArray(new String[0]))[0];
        try {
            str2 = URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(method);
        sb3.append("&");
        sb3.append(str2);
        sb3.append("&");
        Intrinsics.checkNotNullParameter(params, "<this>");
        for (String str3 : new TreeMap(params).keySet()) {
            try {
                Object obj2 = params.get(str3);
                linkedHashMap = params;
                if (obj2 instanceof List) {
                    try {
                        for (Object obj3 : (List) obj2) {
                            sb3.append(str3);
                            sb3.append("=");
                            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.String");
                            sb3.append(a0.n1((String) obj3));
                            sb3.append("&");
                        }
                    } catch (UnsupportedEncodingException unused2) {
                    } catch (Exception e13) {
                        e = e13;
                        HashSet hashSet = tb0.h.f117076w;
                        tb0.g.f117075a.p(e);
                    }
                } else {
                    sb3.append(str3);
                    sb3.append("=");
                    Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.String");
                    sb3.append(a0.n1((String) obj2));
                    sb3.append("&");
                }
            } catch (UnsupportedEncodingException unused3) {
                linkedHashMap = params;
            } catch (Exception e14) {
                e = e14;
                linkedHashMap = params;
            }
            params = linkedHashMap;
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        String substring = sb4.substring(0, sb3.length() - 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        try {
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
            byte[] bytes = "492124fd20e80e0f678f7a03344875f9b6234e2b".getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HMACSHA256");
            Mac mac = Mac.getInstance("HMACSHA256");
            mac.init(secretKeySpec);
            Charset forName2 = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName2, "forName(...)");
            byte[] bytes2 = substring.getBytes(forName2);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            char[] a13 = zo2.a.a(mac.doFinal(bytes2));
            Intrinsics.checkNotNullExpressionValue(a13, "encodeHex(...)");
            str = z.n(z.n(z.n(new String(a13), " ", ""), "<", ""), ">", "");
        } catch (Exception unused4) {
        }
        Request.Builder b14 = f95974e2.b();
        HttpUrl.Builder f15 = c13.f();
        f15.b("oauth_signature", str);
        HttpUrl url = f15.c();
        Intrinsics.checkNotNullParameter(url, "url");
        b14.f95706a = url;
        return chain.b(b14.b());
    }
}
