package c82;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import kh2.j;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f26953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f26954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f26955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f26956g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f26957h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f26958i;

    public c(HashMap hashMap, d dVar, String str, String str2, String str3, boolean z13) {
        this.f26953d = hashMap;
        this.f26954e = dVar;
        this.f26955f = str;
        this.f26956g = str2;
        this.f26957h = str3;
        this.f26958i = z13;
    }

    @Override // hb0.c
    public final void c() {
        String id3;
        Map map = this.f26953d;
        LinkedHashMap r13 = map != null ? z0.r(map) : new LinkedHashMap();
        d dVar = this.f26954e;
        AdvertisingIdClient.Info a13 = dVar.f26960b.a();
        if (a13 != null && (id3 = a13.getId()) != null && id3.length() > 0) {
            String J2 = j.J2(id3);
            Intrinsics.checkNotNullExpressionValue(J2, "toSha1Hex(...)");
            r13.put("idfa_hash", J2);
            r13.put("idfa", id3);
            r13.put("advertising_tracking_enabled", String.valueOf(!a13.isLimitAdTrackingEnabled()));
        }
        String str = this.f26955f;
        if (str != null) {
            r13.put("client_tracking_params", str);
        }
        TreeMap treeMap = new TreeMap();
        treeMap.put("url", this.f26956g);
        String str2 = this.f26957h;
        if (str2 != null && str2.length() != 0) {
            treeMap.put("pin_id", str2);
        }
        treeMap.put("clickthrough_source", this.f26958i ? "grid" : "closeup");
        if (!r13.isEmpty()) {
            treeMap.putAll(r13);
        }
        dVar.f26959a.b(treeMap).l(tk2.e.f118017c).j(new b());
    }
}
