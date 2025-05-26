package vt;

import a.cb;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.pinterest.api.model.ea0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ge0;
import com.pinterest.api.model.z90;
import h32.c1;
import h32.f1;
import h32.g0;
import h32.l2;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import lu.b0;
import nx.d0;
import t3.s1;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public d0 f126574a;

    /* renamed from: b, reason: collision with root package name */
    public final es.a f126575b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f126576c;

    /* renamed from: d, reason: collision with root package name */
    public f30 f126577d;

    /* renamed from: e, reason: collision with root package name */
    public List f126578e;

    /* renamed from: f, reason: collision with root package name */
    public String f126579f;

    /* renamed from: g, reason: collision with root package name */
    public int f126580g;

    /* renamed from: h, reason: collision with root package name */
    public r f126581h;

    /* renamed from: i, reason: collision with root package name */
    public final uk2.d f126582i;

    /* renamed from: j, reason: collision with root package name */
    public final uk2.d f126583j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f126584k;

    /* renamed from: l, reason: collision with root package name */
    public final uk2.d f126585l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f126586m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f126587n;

    /* renamed from: o, reason: collision with root package name */
    public final uk2.d f126588o;

    /* renamed from: p, reason: collision with root package name */
    public final uk2.f f126589p;

    /* renamed from: q, reason: collision with root package name */
    public int f126590q;

    /* renamed from: r, reason: collision with root package name */
    public l f126591r;

    /* renamed from: s, reason: collision with root package name */
    public Integer[] f126592s;

    /* renamed from: t, reason: collision with root package name */
    public final v f126593t;

    /* renamed from: u, reason: collision with root package name */
    public Integer[] f126594u;

    /* renamed from: v, reason: collision with root package name */
    public final v f126595v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f126596w;

    public e(d0 pinalytics, lh0.g experiments, es.a adFormats) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f126574a = pinalytics;
        this.f126575b = adFormats;
        this.f126576c = new HashMap();
        this.f126582i = s1.h("create(...)");
        this.f126583j = s1.h("create(...)");
        this.f126585l = s1.h("create(...)");
        this.f126586m = new ArrayList();
        this.f126588o = s1.h("create(...)");
        this.f126589p = cb.r("create(...)");
        this.f126590q = -1;
        this.f126593t = new v();
        this.f126595v = new v();
    }

    public static boolean h(String str) {
        return str != null && str.length() != 0 && Patterns.WEB_URL.matcher(str).matches() && (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str));
    }

    public final void a() {
        z90 Z5;
        List f13;
        ea0 ea0Var;
        b(g0.AD_QUIZ_PIN_QUESTIONNAIRE, u0.QUIZ_PIN_BACK_BUTTON, f1.QUIZ_PIN_BACK);
        int intValue = ((Number) this.f126593t.removeLast()).intValue();
        Integer[] numArr = this.f126592s;
        if (numArr != null) {
            numArr[intValue] = Integer.valueOf(numArr[intValue].intValue() - 1);
        }
        f30 f30Var = this.f126577d;
        Integer e13 = (f30Var == null || (Z5 = f30Var.Z5()) == null || (f13 = Z5.f()) == null || (ea0Var = (ea0) f13.get(this.f126580g + (-1))) == null) ? null : ea0Var.e();
        Integer[] numArr2 = this.f126594u;
        if (numArr2 != null && e13 != null) {
            numArr2[e13.intValue() - 1] = 0;
            this.f126595v.removeLast();
        }
        this.f126580g--;
        k();
    }

    public final void b(g0 g0Var, u0 u0Var, f1 f1Var) {
        l2 l2Var;
        List g13;
        ge0 ge0Var;
        String g14;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        r2 = null;
        Long l13 = null;
        if (f1Var != f1.QUIZ_PIN_RESULT_OPEN) {
            d0 d0Var = this.f126574a;
            f30 f30Var = this.f126577d;
            d0Var.o(f1Var, (r19 & 2) != 0 ? null : u0Var, (r19 & 4) != 0 ? null : g0Var, (r19 & 8) != 0 ? null : f30Var != null ? f30Var.getId() : null, (r19 & 32) != 0 ? null : null, null, null, null, false);
            return;
        }
        d0 d0Var2 = this.f126574a;
        f30 f30Var2 = this.f126577d;
        String id3 = f30Var2 != null ? f30Var2.getId() : null;
        f30 f30Var3 = this.f126577d;
        int i13 = this.f126590q;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        if (f30Var3 != null) {
            z90 Z5 = f30Var3.Z5();
            if (Z5 != null && (g13 = Z5.g()) != null && (ge0Var = (ge0) g13.get(i13)) != null && (g14 = ge0Var.g()) != null && g14.length() > 0 && TextUtils.isDigitsOnly(g14)) {
                l13 = Long.valueOf(Long.parseLong(g14));
            }
            l2Var = new l2(l13);
        } else {
            l2Var = null;
        }
        d0Var2.o(f1Var, (r19 & 2) != 0 ? null : u0Var, (r19 & 4) != 0 ? null : g0Var, (r19 & 8) != 0 ? null : id3, (r19 & 32) != 0 ? null : null, null, new c1(null, bool, null, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, l2Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, false);
    }

    public final uk2.d c() {
        return this.f126585l;
    }

    public final void d() {
        b(g0.AD_QUIZ_PIN_FALLBACK, u0.QUIZ_PIN_RESULT_FALLBACK, f1.VIEW);
        b(g0.AD_QUIZ_PIN_RESULT, u0.QUIZ_PIN_RESULT, f1.QUIZ_PIN_RESULT_CLOSE);
        int size = this.f126586m.size();
        String str = this.f126579f;
        if (str != null) {
            j(new m(size, str, f(), b0.FALLBACK_VIEW));
        } else {
            Intrinsics.r("promotedByString");
            throw null;
        }
    }

    public final boolean e() {
        return this.f126584k;
    }

    public final boolean f() {
        f30 f30Var = this.f126577d;
        if (f30Var == null) {
            return false;
        }
        nc2.h hVar = nc2.h.f90405a;
        String id3 = f30Var.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return nc2.h.a(id3).f90409a;
    }

    public final boolean g() {
        return this.f126596w;
    }

    public final void i(boolean z13) {
        this.f126585l.c(Boolean.valueOf(z13));
        r rVar = this.f126581h;
        if (rVar == null) {
            Intrinsics.r("viewState");
            throw null;
        }
        if ((rVar instanceof n) || (rVar instanceof p)) {
            b(g0.AD_QUIZ_PIN_QUESTIONNAIRE, null, f1.PIN_CLOSEUP_NUDGE);
        } else if (rVar instanceof m) {
            b(g0.AD_QUIZ_PIN_FALLBACK, null, f1.PIN_CLOSEUP_NUDGE);
        }
    }

    public final void j(r rVar) {
        this.f126581h = rVar;
        this.f126582i.c(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.e.k():void");
    }
}
