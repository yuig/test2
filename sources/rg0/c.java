package rg0;

import com.pinterest.api.model.tr;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final String f107965c;

    /* renamed from: d, reason: collision with root package name */
    public final String f107966d;

    /* renamed from: e, reason: collision with root package name */
    public final String f107967e;

    /* renamed from: f, reason: collision with root package name */
    public final i32.o f107968f;

    /* renamed from: g, reason: collision with root package name */
    public final i32.r f107969g;

    /* renamed from: h, reason: collision with root package name */
    public final i32.r f107970h;

    /* renamed from: i, reason: collision with root package name */
    public final String f107971i;

    /* renamed from: j, reason: collision with root package name */
    public final String f107972j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vd0.c json) {
        super(null, null);
        nm.u x13;
        nm.s v13;
        nm.u x14;
        nm.s v14;
        Intrinsics.checkNotNullParameter(json, "json");
        String str = null;
        String o13 = json.o("text", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        this.f107965c = o13;
        vd0.c m13 = json.m("complete_button");
        this.f107966d = m13 != null ? m13.o("text", "") : null;
        vd0.c m14 = json.m("dismiss_button");
        this.f107967e = m14 != null ? m14.o("text", "") : null;
        i32.m mVar = i32.o.Companion;
        int j13 = json.j(0, "layout_type");
        mVar.getClass();
        this.f107968f = i32.m.a(j13);
        vd0.c m15 = json.m("custom_properties");
        if (m15 != null) {
            m15.p("section_name");
        }
        vd0.c m16 = json.m("custom_properties");
        if (m16 != null) {
            m16.p("cluster_id");
        }
        i32.r rVar = i32.r.GROUP_YOUR_PINS;
        this.f107969g = rVar;
        i32.r rVar2 = i32.r.DISMISS_UPSELL;
        this.f107970h = rVar2;
        vd0.c m17 = json.m("complete_button");
        if (m17 != null) {
            int j14 = m17.j(0, "action_type");
            i32.r.Companion.getClass();
            i32.r a13 = i32.p.a(j14);
            this.f107969g = a13 != null ? a13 : rVar;
        }
        vd0.c m18 = json.m("dismiss_button");
        if (m18 != null) {
            int j15 = m18.j(0, "action_type");
            i32.r.Companion.getClass();
            i32.r a14 = i32.p.a(j15);
            this.f107970h = a14 != null ? a14 : rVar2;
        }
        nm.q qVar = json.k("thumbnail_image_urls").f125618a;
        if (qVar.f91364a.size() > 0) {
            nm.s u13 = qVar.u(0);
            nm.u uVar = u13 instanceof nm.u ? (nm.u) u13 : null;
            this.f107971i = (uVar == null || (x14 = uVar.x(tr.SIZE236x.getValue())) == null || (v14 = x14.v("url")) == null) ? null : v14.p();
        }
        if (qVar.f91364a.size() > 1) {
            nm.s u14 = qVar.u(1);
            nm.u uVar2 = u14 instanceof nm.u ? (nm.u) u14 : null;
            if (uVar2 != null && (x13 = uVar2.x(tr.SIZE236x.getValue())) != null && (v13 = x13.v("url")) != null) {
                str = v13.p();
            }
            this.f107972j = str;
        }
    }
}
