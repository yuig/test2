package je0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import lb0.n;
import lb0.o;
import nm.p;
import nm.u;
import vy.m;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final o f75839a = n.a();

    /* renamed from: b, reason: collision with root package name */
    public final m f75840b;

    /* renamed from: c, reason: collision with root package name */
    public InstallReferrerClient f75841c;

    public d(m mVar) {
        this.f75840b = mVar;
    }

    public static String a(d dVar, String str) {
        dVar.getClass();
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            if (split.length == 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        if (hashMap.containsKey("af_dp") && hashMap.containsKey("pid") && ((String) hashMap.get("pid")).equals("mweb")) {
            return ((u) vd0.c.f125622b.o(hashMap)).toString();
        }
        vd0.c cVar = new vd0.c();
        if (hashMap.containsKey("utm_content")) {
            String str3 = (String) hashMap.get("utm_content");
            try {
                cVar = new vd0.c(URLDecoder.decode(str3, "UTF-8"));
            } catch (UnsupportedEncodingException e13) {
                e13.toString();
            } catch (IllegalStateException unused) {
                cVar.t("utm_content", str3);
            }
        }
        if ((hashMap.isEmpty() ? Boolean.FALSE : (hashMap.containsKey("utm_source") && ((String) hashMap.get("utm_source")).equals("(not set)") && hashMap.containsKey("utm_medium") && ((String) hashMap.get("utm_medium")).equals("(not set)")) ? Boolean.FALSE : (hashMap.containsKey("utm_medium") && ((String) hashMap.get("utm_medium")).equals("organic")) ? Boolean.FALSE : Boolean.TRUE).booleanValue()) {
            cVar.s("from_play_install_referrer_link", Boolean.TRUE);
        }
        String[] strArr = {"utm_source", "utm_medium", "utm_campaign", "app_upsell_type"};
        for (int i13 = 0; i13 < 4; i13++) {
            String str4 = strArr[i13];
            if (hashMap.containsKey(str4)) {
                cVar.t(str4, (String) hashMap.get(str4));
            }
        }
        return cVar.f125623a.toString();
    }

    public final void b(Integer num, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("app", hf0.b.a().name());
        ((m60.d) m60.d.a()).b();
        hashMap.put("app_version", String.valueOf(13198010));
        if (num != null) {
            hashMap.put("error", num.toString());
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("tags", hashMap);
        nm.o a13 = new p().a();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("aux_data", a13.k(hashMap2));
        this.f75840b.k(str, Collections.unmodifiableMap(hashMap3));
    }
}
