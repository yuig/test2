package aq;

import androidx.appcompat.widget.q;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.kg0;
import com.pinterest.api.model.ng0;
import com.pinterest.api.model.rg0;
import com.pinterest.api.model.rj0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import cp.b0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import lh0.n1;
import nm.o;
import v.q1;
import zp.n0;

/* loaded from: classes3.dex */
public final class m extends j {

    /* renamed from: c, reason: collision with root package name */
    public final kg0 f20354c;

    /* renamed from: d, reason: collision with root package name */
    public final n22.a f20355d;

    /* renamed from: e, reason: collision with root package name */
    public final b60.b f20356e;

    /* renamed from: f, reason: collision with root package name */
    public final n1 f20357f;

    public m(kg0 scheduledPin, n22.a scheduledPinService, b60.b activeUserManager, n1 experiments) {
        Intrinsics.checkNotNullParameter(scheduledPin, "scheduledPin");
        Intrinsics.checkNotNullParameter(scheduledPinService, "scheduledPinService");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f20354c = scheduledPin;
        this.f20355d = scheduledPinService;
        this.f20356e = activeUserManager;
        this.f20357f = experiments;
    }

    @Override // aq.j
    public final String A() {
        rg0 E = this.f20354c.E();
        String C = E != null ? E.C() : null;
        return C == null ? "" : C;
    }

    @Override // aq.j
    public final String B() {
        String uid = this.f20354c.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }

    @Override // aq.j
    public final String C() {
        o oVar = vd0.c.f125622b;
        rg0 E = this.f20354c.E();
        String k13 = oVar.k(E != null ? E.F() : null);
        return k13 == null ? "" : k13;
    }

    @Override // aq.j
    public final String D() {
        rg0 E = this.f20354c.E();
        return String.valueOf(E != null ? E.G() : null);
    }

    @Override // aq.j
    public final String E() {
        sr srVar;
        Map D = this.f20354c.D();
        String j13 = (D == null || (srVar = (sr) D.get("750x")) == null) ? null : srVar.j();
        return j13 == null ? "" : j13;
    }

    @Override // aq.j
    public final String F() {
        rg0 E = this.f20354c.E();
        String I = E != null ? E.I() : null;
        return I == null ? "" : I;
    }

    @Override // aq.j
    public final String G() {
        rg0 E = this.f20354c.E();
        String H = E != null ? E.H() : null;
        return H == null ? "" : H;
    }

    @Override // aq.j
    public final List H() {
        String J2;
        List split$default;
        rg0 E = this.f20354c.E();
        if (E == null || (J2 = E.J()) == null) {
            return null;
        }
        split$default = StringsKt__StringsKt.split$default(J2, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.M(arrayList);
    }

    @Override // aq.j
    public final Boolean I() {
        rg0 E = this.f20354c.E();
        if (E != null) {
            return E.L();
        }
        return null;
    }

    @Override // aq.j
    public final String J() {
        rg0 E = this.f20354c.E();
        String M = E != null ? E.M() : null;
        return M == null ? "" : M;
    }

    @Override // aq.j
    public final List K() {
        return this.f20357f.j() ? H() : r();
    }

    @Override // aq.j
    public final wy0 M() {
        return this.f20354c.I();
    }

    @Override // aq.j
    public final Long N() {
        return Long.valueOf(this.f20354c.G().intValue());
    }

    @Override // aq.j
    public final ba O() {
        return this.f20354c.H();
    }

    @Override // aq.j
    public final String P() {
        ba H = this.f20354c.H();
        String uid = H != null ? H.getUid() : null;
        return uid == null ? "" : uid;
    }

    @Override // aq.j
    public final String Q() {
        rg0 E = this.f20354c.E();
        if (E != null) {
            return E.O();
        }
        return null;
    }

    @Override // aq.j
    public final rj0 R() {
        return null;
    }

    @Override // aq.j
    public final String S() {
        rg0 E = this.f20354c.E();
        String P = E != null ? E.P() : null;
        return P == null ? "" : P;
    }

    @Override // aq.j
    public final String U() {
        o oVar = vd0.c.f125622b;
        rg0 E = this.f20354c.E();
        String k13 = oVar.k(E != null ? E.Q() : null);
        return k13 == null ? "" : k13;
    }

    @Override // aq.j
    public final List V() {
        rg0 E = this.f20354c.E();
        if (E != null) {
            return E.Q();
        }
        return null;
    }

    @Override // aq.j
    public final boolean W() {
        rg0 E = this.f20354c.E();
        Boolean E2 = E != null ? E.E() : null;
        if (E2 == null) {
            return false;
        }
        return E2.booleanValue();
    }

    @Override // aq.j
    public final boolean Y() {
        return false;
    }

    @Override // aq.j
    public final boolean Z() {
        return this.f20354c.F() == kg0.a.IDEA_PIN;
    }

    @Override // aq.j
    public final boolean a() {
        return ng0.a(this.f20354c);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    @Override // aq.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(aq.h r31) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aq.m.a0(aq.h):void");
    }

    @Override // aq.j
    public final boolean b() {
        kg0 kg0Var = this.f20354c;
        rg0 E = kg0Var.E();
        if (E != null) {
            boolean[] zArr = E.f41599z;
            if (zArr.length <= 15 || !zArr[15]) {
                return true;
            }
        }
        rg0 E2 = kg0Var.E();
        Boolean K = E2 != null ? E2.K() : null;
        if (K == null) {
            return true;
        }
        return K.booleanValue();
    }

    @Override // aq.j
    public final boolean c() {
        wy0 f13 = ((b60.d) this.f20356e).f();
        String uid = f13 != null ? f13.getUid() : null;
        wy0 I = this.f20354c.I();
        return Intrinsics.d(uid, I != null ? I.getUid() : null);
    }

    @Override // aq.j
    public final boolean d() {
        rg0 E = this.f20354c.E();
        Boolean z13 = E != null ? E.z() : null;
        if (z13 == null) {
            return true;
        }
        return z13.booleanValue();
    }

    @Override // aq.j
    public final boolean e() {
        return ng0.a(this.f20354c);
    }

    @Override // aq.j
    public final boolean f() {
        return false;
    }

    @Override // aq.j
    public final boolean g() {
        return Z();
    }

    @Override // aq.j
    public final boolean h() {
        return false;
    }

    @Override // aq.j
    public final boolean i() {
        return true;
    }

    @Override // aq.j
    public final boolean j() {
        return true;
    }

    @Override // aq.j
    public final boolean k() {
        Boolean D;
        rg0 E = this.f20354c.E();
        return E == null || (D = E.D()) == null || !D.booleanValue();
    }

    @Override // aq.j
    public final boolean l() {
        return true;
    }

    @Override // aq.j
    public final boolean m() {
        return ng0.a(this.f20354c);
    }

    @Override // aq.j
    public final boolean n() {
        return false;
    }

    @Override // aq.j
    public final boolean o() {
        return true;
    }

    @Override // aq.j
    public final void p(q1 createActionListener) {
        Intrinsics.checkNotNullParameter(createActionListener, "createActionListener");
        a0(new k(createActionListener, this));
    }

    @Override // aq.j
    public final void q(q deleteActionListener) {
        Intrinsics.checkNotNullParameter(deleteActionListener, "deleteActionListener");
        int i13 = 1;
        this.f20355d.c(B()).l(tk2.e.f118017c).h(wj2.c.a()).i(new b0(deleteActionListener, i13), new n0(12, new a(deleteActionListener, i13)));
    }

    @Override // aq.j
    public final List r() {
        List split$default;
        List split$default2;
        kg0 kg0Var = this.f20354c;
        rg0 E = kg0Var.E();
        String N = E != null ? E.N() : null;
        rg0 E2 = kg0Var.E();
        String J2 = E2 != null ? E2.J() : null;
        if (N == null && J2 == null) {
            return null;
        }
        if (N == null) {
            N = "";
        }
        split$default = StringsKt__StringsKt.split$default(N, new String[]{","}, false, 0, 6, null);
        List list = split$default;
        if (J2 == null) {
            J2 = "";
        }
        split$default2 = StringsKt__StringsKt.split$default(J2, new String[]{","}, false, 0, 6, null);
        ArrayList l03 = CollectionsKt.l0(split$default2, list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l03) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.M(arrayList);
    }

    @Override // aq.j
    public final List s() {
        return null;
    }

    @Override // aq.j
    public final String t() {
        rg0 E = this.f20354c.E();
        String A = E != null ? E.A() : null;
        return A == null ? "" : A;
    }

    @Override // aq.j
    public final v7 u() {
        return this.f20354c.C();
    }

    @Override // aq.j
    public final String v() {
        v7 C = this.f20354c.C();
        String uid = C != null ? C.getUid() : null;
        return uid == null ? "" : uid;
    }

    @Override // aq.j
    public final wy0 w() {
        return this.f20354c.I();
    }

    @Override // aq.j
    public final String x() {
        rg0 E = this.f20354c.E();
        String B = E != null ? E.B() : null;
        return B == null ? "" : B;
    }

    @Override // aq.j
    public final e y() {
        return e.SCHEDULED_PIN;
    }
}
