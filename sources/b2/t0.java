package b2;

import android.content.ClipData;
import android.view.ActionMode;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import java.util.ArrayList;
import kh2.g3;
import kh2.k3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.a2;
import t3.u3;
import t3.w3;
import w1.g1;
import w1.l1;
import w1.r2;
import w1.x1;
import w1.z2;

/* loaded from: classes2.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final z2 f21216a;

    /* renamed from: b, reason: collision with root package name */
    public h4.y f21217b = g1.f127266c;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f21218c = f0.f21144l;

    /* renamed from: d, reason: collision with root package name */
    public l1 f21219d;

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f21220e;

    /* renamed from: f, reason: collision with root package name */
    public h4.p0 f21221f;

    /* renamed from: g, reason: collision with root package name */
    public a2 f21222g;

    /* renamed from: h, reason: collision with root package name */
    public u3 f21223h;

    /* renamed from: i, reason: collision with root package name */
    public j3.a f21224i;

    /* renamed from: j, reason: collision with root package name */
    public z2.s f21225j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f21226k;

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f21227l;

    /* renamed from: m, reason: collision with root package name */
    public long f21228m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f21229n;

    /* renamed from: o, reason: collision with root package name */
    public long f21230o;

    /* renamed from: p, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f21231p;

    /* renamed from: q, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f21232q;

    /* renamed from: r, reason: collision with root package name */
    public int f21233r;

    /* renamed from: s, reason: collision with root package name */
    public h4.f0 f21234s;

    /* renamed from: t, reason: collision with root package name */
    public o0 f21235t;

    /* renamed from: u, reason: collision with root package name */
    public final q0 f21236u;

    /* renamed from: v, reason: collision with root package name */
    public final s0 f21237v;

    public t0(z2 z2Var) {
        this.f21216a = z2Var;
        h4.f0 f0Var = new h4.f0((String) null, 0L, 7);
        y3 y3Var = y3.f71400a;
        this.f21220e = bs1.c.u1(f0Var, y3Var);
        this.f21221f = h4.o0.f67604a;
        Boolean bool = Boolean.TRUE;
        this.f21226k = bs1.c.u1(bool, y3Var);
        this.f21227l = bs1.c.u1(bool, y3Var);
        this.f21228m = 0L;
        this.f21230o = 0L;
        this.f21231p = bs1.c.u1(null, y3Var);
        this.f21232q = bs1.c.u1(null, y3Var);
        this.f21233r = -1;
        this.f21234s = new h4.f0((String) null, 0L, 7);
        this.f21236u = new q0(this, 1);
        this.f21237v = new s0(this);
    }

    public static final void a(t0 t0Var, a3.c cVar) {
        t0Var.f21232q.setValue(cVar);
    }

    public static final void b(t0 t0Var, w1.v0 v0Var) {
        t0Var.f21231p.setValue(v0Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v1 b2.o0, still in use, count: 2, list:
          (r10v1 b2.o0) from 0x008c: MOVE (r20v0 b2.o0) = (r10v1 b2.o0)
          (r10v1 b2.o0) from 0x0067: MOVE (r20v2 b2.o0) = (r10v1 b2.o0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final long c(b2.t0 r21, h4.f0 r22, long r23, boolean r25, boolean r26, b2.r r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.t0.c(b2.t0, h4.f0, long, boolean, boolean, b2.r, boolean):long");
    }

    public static h4.f0 e(b4.g gVar, long j13) {
        return new h4.f0(gVar, j13, (b4.p0) null);
    }

    public final void d(boolean z13) {
        if (b4.p0.b(l().f67560b)) {
            return;
        }
        a2 a2Var = this.f21222g;
        if (a2Var != null) {
            ((t3.j) a2Var).f116039a.setPrimaryClip(ClipData.newPlainText("plain text", androidx.compose.ui.platform.a.d(g3.h0(l()))));
        }
        if (z13) {
            int d2 = b4.p0.d(l().f67560b);
            this.f21218c.invoke(e(l().f67559a, b7.c.h(d2, d2)));
            r(w1.w0.None);
        }
    }

    public final void f() {
        if (b4.p0.b(l().f67560b)) {
            return;
        }
        a2 a2Var = this.f21222g;
        if (a2Var != null) {
            ((t3.j) a2Var).f116039a.setPrimaryClip(ClipData.newPlainText("plain text", androidx.compose.ui.platform.a.d(g3.h0(l()))));
        }
        b4.g l03 = g3.l0(l(), l().f67559a.f21571a.length());
        b4.g k03 = g3.k0(l(), l().f67559a.f21571a.length());
        b4.d dVar = new b4.d(l03);
        dVar.b(k03);
        b4.g e13 = dVar.e();
        int e14 = b4.p0.e(l().f67560b);
        this.f21218c.invoke(e(e13, b7.c.h(e14, e14)));
        r(w1.w0.None);
        z2 z2Var = this.f21216a;
        if (z2Var != null) {
            z2Var.f127599f = true;
        }
    }

    public final void g(a3.c cVar) {
        if (!b4.p0.b(l().f67560b)) {
            l1 l1Var = this.f21219d;
            r2 d2 = l1Var != null ? l1Var.d() : null;
            int d13 = (cVar == null || d2 == null) ? b4.p0.d(l().f67560b) : this.f21217b.a(d2.b(cVar.f482a, true));
            this.f21218c.invoke(h4.f0.a(l(), null, b7.c.h(d13, d13), 5));
        }
        r((cVar == null || l().f67559a.f21571a.length() <= 0) ? w1.w0.None : w1.w0.Cursor);
        u(false);
    }

    public final void h(boolean z13) {
        z2.s sVar;
        l1 l1Var = this.f21219d;
        if (l1Var != null && !l1Var.b() && (sVar = this.f21225j) != null) {
            sVar.a(z2.m.f140632l);
        }
        this.f21234s = l();
        u(z13);
        r(w1.w0.Selection);
    }

    public final a3.c i() {
        return (a3.c) this.f21232q.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.f21227l.getValue()).booleanValue();
    }

    public final long k(boolean z13) {
        r2 d2;
        b4.m0 m0Var;
        long j13;
        x1 x1Var;
        l1 l1Var = this.f21219d;
        if (l1Var == null || (d2 = l1Var.d()) == null || (m0Var = d2.f127471a) == null) {
            return y2.h.f136670b;
        }
        l1 l1Var2 = this.f21219d;
        b4.g gVar = (l1Var2 == null || (x1Var = l1Var2.f127355a) == null) ? null : x1Var.f127567a;
        if (gVar == null) {
            return y2.h.f136670b;
        }
        if (!Intrinsics.d(gVar.f21571a, m0Var.f21615a.f21603a.f21571a)) {
            return y2.h.f136670b;
        }
        h4.f0 l13 = l();
        if (z13) {
            long j14 = l13.f67560b;
            int i13 = b4.p0.f21640c;
            j13 = j14 >> 32;
        } else {
            long j15 = l13.f67560b;
            int i14 = b4.p0.f21640c;
            j13 = j15 & 4294967295L;
        }
        int b13 = this.f21217b.b((int) j13);
        boolean f13 = b4.p0.f(l().f67560b);
        int f14 = m0Var.f(b13);
        b4.o oVar = m0Var.f21616b;
        if (f14 >= oVar.f21630f) {
            return y2.h.f136670b;
        }
        boolean z14 = m0Var.a(((!z13 || f13) && (z13 || !f13)) ? Math.max(b13 + (-1), 0) : b13) == m0Var.j(b13);
        oVar.j(b13);
        int length = oVar.f21625a.f21642a.f21571a.length();
        ArrayList arrayList = oVar.f21632h;
        b4.s sVar = (b4.s) arrayList.get(b13 == length ? kotlin.collections.f0.i(arrayList) : k3.S(b13, arrayList));
        b4.r rVar = sVar.f21652a;
        int b14 = sVar.b(b13);
        c4.z zVar = ((b4.b) rVar).f21510d;
        float h10 = z14 ? zVar.h(b14, false) : zVar.i(b14, false);
        long j16 = m0Var.f21617c;
        return com.bumptech.glide.c.d(ql2.s.f(h10, 0.0f, (int) (j16 >> 32)), ql2.s.f(oVar.b(f14), 0.0f, (int) (j16 & 4294967295L)));
    }

    public final h4.f0 l() {
        return (h4.f0) this.f21220e.getValue();
    }

    public final void m() {
        u3 u3Var = this.f21223h;
        if ((u3Var != null ? ((t3.l1) u3Var).f116072d : null) != w3.Shown || u3Var == null) {
            return;
        }
        t3.l1 l1Var = (t3.l1) u3Var;
        l1Var.f116072d = w3.Hidden;
        ActionMode actionMode = l1Var.f116070b;
        if (actionMode != null) {
            actionMode.finish();
        }
        l1Var.f116070b = null;
    }

    public final void n() {
        a2 a2Var = this.f21222g;
        if (a2Var != null) {
            ClipData primaryClip = ((t3.j) a2Var).f116039a.getPrimaryClip();
            b4.g gVar = null;
            gVar = null;
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                gVar = androidx.compose.ui.platform.a.c(itemAt != null ? itemAt.getText() : null);
            }
            if (gVar == null) {
                return;
            }
            b4.d dVar = new b4.d(g3.l0(l(), l().f67559a.f21571a.length()));
            dVar.b(gVar);
            b4.g e13 = dVar.e();
            b4.g k03 = g3.k0(l(), l().f67559a.f21571a.length());
            b4.d dVar2 = new b4.d(e13);
            dVar2.b(k03);
            b4.g e14 = dVar2.e();
            int length = gVar.f21571a.length() + b4.p0.e(l().f67560b);
            this.f21218c.invoke(e(e14, b7.c.h(length, length)));
            r(w1.w0.None);
            z2 z2Var = this.f21216a;
            if (z2Var != null) {
                z2Var.f127599f = true;
            }
        }
    }

    public final void o() {
        h4.f0 e13 = e(l().f67559a, b7.c.h(0, l().f67559a.f21571a.length()));
        this.f21218c.invoke(e13);
        this.f21234s = h4.f0.a(this.f21234s, null, e13.f67560b, 5);
        h(true);
    }

    public final void p(boolean z13) {
        this.f21226k.setValue(Boolean.valueOf(z13));
    }

    public final void q(boolean z13) {
        this.f21227l.setValue(Boolean.valueOf(z13));
    }

    public final void r(w1.w0 w0Var) {
        l1 l1Var = this.f21219d;
        if (l1Var != null) {
            if (l1Var.a() == w0Var) {
                l1Var = null;
            }
            if (l1Var != null) {
                l1Var.f127365k.setValue(w0Var);
            }
        }
    }

    public final void s(h4.f0 f0Var) {
        this.f21220e.setValue(f0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.t0.t():void");
    }

    public final void u(boolean z13) {
        l1 l1Var = this.f21219d;
        if (l1Var != null) {
            l1Var.f127366l.setValue(Boolean.valueOf(z13));
        }
        if (z13) {
            t();
        } else {
            m();
        }
    }
}
