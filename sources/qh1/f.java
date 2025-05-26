package qh1;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import h32.d4;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m.h;
import nx.d0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d4 f103914a;

    /* renamed from: b, reason: collision with root package name */
    public final h f103915b;

    /* renamed from: c, reason: collision with root package name */
    public f30 f103916c;

    /* renamed from: d, reason: collision with root package name */
    public String f103917d;

    public f(d4 viewType, d0 pinalytics) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f103914a = viewType;
        this.f103915b = new h(pinalytics);
    }

    public static String a(int i13) {
        return i13 == 0 ? "0" : i13 == 1 ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : i13 <= 5 ? "1_5" : i13 <= 10 ? "6_10" : i13 <= 20 ? "11_20" : i13 <= 30 ? "21_30" : i13 > 30 ? "31_up" : "unknown";
    }

    public final void b(String name, rp0.d dVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        f30 f30Var = this.f103916c;
        String a13 = a(f30Var == null ? 0 : b40.f0(f30Var));
        f30 f30Var2 = this.f103916c;
        String valueOf = String.valueOf(f30Var2 != null ? b40.Q0(f30Var2) : false);
        f30 f30Var3 = this.f103916c;
        String valueOf2 = String.valueOf(f30Var3 != null ? b40.X0(f30Var3) : false);
        String a14 = a(dVar != null ? dVar.d() : 0);
        String valueOf3 = String.valueOf(dVar != null ? dVar.j() : false);
        String a15 = a(dVar != null ? dVar.h() : 0);
        String valueOf4 = String.valueOf(dVar != null ? dVar.i() : false);
        String valueOf5 = String.valueOf(dVar != null ? dVar.x() : false);
        f30 f30Var4 = this.f103916c;
        String valueOf6 = String.valueOf((f30Var4 != null ? b40.n(f30Var4) : null) != null);
        HashMap hashMap = new HashMap();
        String lowerCase = this.f103914a.toString().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        hashMap.put("source", lowerCase);
        hashMap.put("pin_comment_count_range", a13);
        hashMap.put("comment_helpful_count", a14);
        hashMap.put("comment_marked_helpful_by_viewer", valueOf3);
        hashMap.put("comment_like_count", a15);
        hashMap.put("comment_liked_by_viewer", valueOf4);
        hashMap.put("comment_is_reply", valueOf5);
        hashMap.put("is_story_pin", valueOf);
        hashMap.put("is_video_pin", valueOf2);
        hashMap.put("is_creator_content", valueOf6);
        h hVar = this.f103915b;
        hVar.F(hashMap, null);
        hVar.D(name, this.f103917d, hashMap);
    }
}
