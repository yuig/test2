package rg0;

import i32.y0;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final vd0.a f108059a;

    /* renamed from: b, reason: collision with root package name */
    public final int f108060b;

    /* renamed from: c, reason: collision with root package name */
    public final int f108061c;

    /* renamed from: d, reason: collision with root package name */
    public final String f108062d;

    /* renamed from: e, reason: collision with root package name */
    public final String f108063e;

    /* renamed from: f, reason: collision with root package name */
    public final String f108064f;

    /* renamed from: g, reason: collision with root package name */
    public final String f108065g;

    /* renamed from: h, reason: collision with root package name */
    public final String f108066h;

    /* renamed from: i, reason: collision with root package name */
    public final y0 f108067i;

    /* renamed from: j, reason: collision with root package name */
    public ag2.e f108068j;

    /* renamed from: k, reason: collision with root package name */
    public final a f108069k;

    /* renamed from: l, reason: collision with root package name */
    public final vd0.c f108070l;

    /* renamed from: m, reason: collision with root package name */
    public final m.h f108071m;

    /* renamed from: n, reason: collision with root package name */
    public final vd0.c f108072n;

    /* renamed from: o, reason: collision with root package name */
    public final hh0.e f108073o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f108074p;

    public n(vd0.c cVar) {
        this.f108070l = cVar;
        this.f108059a = cVar.k("triggerable_placed_exps");
        int j13 = cVar.j(0, "experience_id");
        this.f108060b = j13;
        int j14 = cVar.j(0, "type");
        this.f108061c = j14;
        String o13 = cVar.o("placement_id", "");
        this.f108063e = o13;
        String o14 = cVar.o("id", "");
        this.f108062d = o14;
        this.f108072n = cVar.m("metadata");
        if (o14 != null && pk.a0.x0(o13)) {
            this.f108063e = o14.split(":")[0];
        }
        y0 findByValue = y0.findByValue(Integer.parseInt(pk.a0.x0(this.f108063e) ? "0" : this.f108063e));
        this.f108067i = findByValue;
        vd0.c m13 = cVar.m("display_data");
        if (m13 != null && ((pm.l) m13.f125623a.f91366a.entrySet()).size() > 0) {
            if (y0.ANDROID_MAIN_USER_ED.equals(findByValue) || i32.a0.NUX.value() == j14) {
                if (findByValue != null) {
                    this.f108068j = new d0(m13, findByValue);
                }
            } else if (j14 == i32.a0.SURVEY.value()) {
                if (j13 == i32.l.ANDROID_IN_APP_BRAND_SURVEY.value()) {
                    this.f108068j = new d(m13);
                } else {
                    this.f108068j = new p0(m13);
                    this.f108064f = m13.o("survey_id", "");
                    this.f108065g = m13.o("survey_type", "");
                    this.f108066h = m13.o("survey_subtype", "");
                    this.f108069k = new a(Integer.valueOf(m13.j(0, "survey_id")), Integer.valueOf(m13.j(0, "survey_type")), Integer.valueOf(m13.j(0, "survey_action_trigger")), m13.n(0L, "survey_time_delay"));
                }
            } else if (j14 == i32.a0.FLASHLIGHT.value()) {
                this.f108068j = new z(m13);
            } else if (j14 == i32.a0.LENS.value()) {
                this.f108068j = new b0(m13);
            } else if (j14 == i32.a0.BANNER.value() && findByValue == y0.ANDROID_BOARD_TAKEOVER) {
                this.f108068j = new c(m13);
            } else if (kh2.s0.B0(j13)) {
                this.f108068j = new m0(m13);
            } else if (j13 == i32.l.ANDROID_GROUP_MY_UNORGANIZED_PINS_UPSELL.value()) {
                this.f108068j = new a0(m13);
            } else if (j14 == i32.a0.MODAL_WINDOW.value()) {
                this.f108068j = eh0.l.c(m13);
            } else if (j14 == i32.a0.ACTION_PROMPT.value() && kh2.s0.A0(j13)) {
                this.f108068j = new k0(m13);
            } else if (j13 == i32.l.ANDROID_BOARD_PREVIEW_SHARE_BOARD_TOOLTIP.value()) {
                this.f108068j = new l0(m13);
            } else if (j14 == i32.a0.POPOVER.value()) {
                this.f108068j = new eg0.e(m13);
            } else if (j13 == i32.l.EU_PERSONALIZED_ADS_PROMPT.value()) {
                this.f108068j = m.c(m13);
            } else if (j13 == i32.l.SCHOOL_TEEN_PROMPT.value()) {
                this.f108068j = j0.c(m13);
            } else if (kh2.s0.C0(j13)) {
                this.f108068j = new f0(m13);
            } else {
                this.f108068j = new g(m13);
            }
        }
        this.f108071m = m.h.G(cVar);
        this.f108073o = gh0.b.J(cVar, j14);
    }

    public static n f(vd0.c cVar) {
        if (cVar == null) {
            return null;
        }
        return new n(cVar);
    }

    public final void a(String str, nx.d dVar) {
        y0 y0Var = this.f108067i;
        if (y0Var != null) {
            ((dh0.d) y.a()).j(y0Var);
        }
        nl.b.p(v.a().c(this.f108063e, String.valueOf(this.f108060b), str, new tg0.c(false, false), dVar).H(tk2.e.f118017c).A(wj2.c.a()), new xo.j(24), new xo.j(25), new ap.e(4));
    }

    public final void b(Map map) {
        a(((nm.u) vd0.c.f125622b.o(map)).toString(), null);
    }

    public final void c(String str, nx.d dVar) {
        y0 y0Var = this.f108067i;
        if (y0Var != null) {
            ((dh0.d) y.a()).j(y0Var);
        }
        nl.b.p(v.a().e(this.f108063e, String.valueOf(this.f108060b), str, new tg0.c(false, false), dVar).H(tk2.e.f118017c).A(wj2.c.a()), new xo.j(26), new xo.j(27), new ap.e(5));
    }

    public final void d(Map map) {
        c(((nm.u) vd0.c.f125622b.o(map)).toString(), null);
    }

    public final boolean e() {
        return this.f108074p;
    }

    public final void g() {
        if (this.f108074p) {
            el.a.o2(this.f108062d);
            return;
        }
        this.f108074p = true;
        ug0.i a13 = v.a();
        String experienceId = String.valueOf(this.f108060b);
        String placementId = this.f108063e;
        a13.getClass();
        tg0.d sideEffect = tg0.d.f117578b;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        jk2.x H = a13.l(placementId, experienceId, null, null).H(tk2.e.f118017c);
        Intrinsics.checkNotNullParameter(H, "<this>");
        nl.b.s(H, null, null, null, 7);
    }

    public final void h(HashMap hashMap) {
        if (this.f108074p) {
            el.a.o2(this.f108062d);
            return;
        }
        this.f108074p = true;
        ug0.i a13 = v.a();
        String experienceId = String.valueOf(this.f108060b);
        String sVar = ((nm.u) vd0.c.f125622b.o(hashMap)).toString();
        String placementId = this.f108063e;
        a13.getClass();
        tg0.d sideEffect = tg0.d.f117578b;
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        jk2.x H = a13.l(placementId, experienceId, sVar, null).H(tk2.e.f118017c);
        Intrinsics.checkNotNullParameter(H, "<this>");
        nl.b.s(H, null, null, null, 7);
    }

    public final void i(nx.d dVar) {
        if (this.f108074p) {
            el.a.o2(this.f108062d);
            return;
        }
        this.f108074p = true;
        jk2.x H = v.a().l(this.f108063e, String.valueOf(this.f108060b), null, dVar).H(tk2.e.f118017c);
        Intrinsics.checkNotNullParameter(H, "<this>");
        nl.b.s(H, null, null, null, 7);
    }
}
