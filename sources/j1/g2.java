package j1;

import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f3;
import i2.y3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final n2 f74075a;

    /* renamed from: b, reason: collision with root package name */
    public final g2 f74076b;

    /* renamed from: c, reason: collision with root package name */
    public final String f74077c;

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74078d;

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74079e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableLongState f74080f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableLongState f74081g;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74082h;

    /* renamed from: i, reason: collision with root package name */
    public final s2.t f74083i;

    /* renamed from: j, reason: collision with root package name */
    public final s2.t f74084j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74085k;

    /* renamed from: l, reason: collision with root package name */
    public long f74086l;

    public g2(n2 n2Var, g2 g2Var, String str) {
        this.f74075a = n2Var;
        this.f74076b = g2Var;
        this.f74077c = str;
        Object c13 = c();
        y3 y3Var = y3.f71400a;
        this.f74078d = bs1.c.u1(c13, y3Var);
        this.f74079e = bs1.c.u1(new a2(c(), c()), y3Var);
        int i13 = i2.c.f71081b;
        this.f74080f = new ParcelableSnapshotMutableLongState(0L);
        this.f74081g = new ParcelableSnapshotMutableLongState(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f74082h = bs1.c.u1(bool, y3Var);
        this.f74083i = new s2.t();
        this.f74084j = new s2.t();
        this.f74085k = bs1.c.u1(bool, y3Var);
        bs1.c.S(new i1.c0(this, 1));
        n2Var.getClass();
    }

    public final void a(Object obj, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1493585151);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? sVar.h(obj) : sVar.j(obj) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.h(this) ? 32 : 16;
        }
        int i15 = 0;
        if ((i14 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else if (g()) {
            sVar.W(1823992347);
            sVar.r(false);
        } else {
            sVar.W(1822507602);
            l(obj);
            if (Intrinsics.d(obj, c())) {
                ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = this.f74081g;
                if (((f3) s2.p.t(parcelableSnapshotMutableLongState.f71120b, parcelableSnapshotMutableLongState)).f71117c == Long.MIN_VALUE && !((Boolean) this.f74082h.getValue()).booleanValue()) {
                    sVar.W(1823982427);
                    sVar.r(false);
                    sVar.r(false);
                }
            }
            sVar.W(1822738893);
            Object J2 = sVar.J();
            am.d dVar = i2.n.f71185a;
            if (J2 == dVar) {
                i2.e0 e0Var = new i2.e0(i2.u.k(kotlin.coroutines.j.f80412a, sVar));
                sVar.g0(e0Var);
                J2 = e0Var;
            }
            ao2.j0 j0Var = ((i2.e0) J2).f71100a;
            int i16 = 1;
            boolean j13 = ((i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 32) | sVar.j(j0Var);
            Object J3 = sVar.J();
            if (j13 || J3 == dVar) {
                J3 = new r1(i16, j0Var, this);
                sVar.g0(J3);
            }
            i2.u.a(j0Var, this, (Function1) J3, sVar);
            sVar.r(false);
            sVar.r(false);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new f2(this, obj, i13, i15);
        }
    }

    public final long b() {
        s2.t tVar = this.f74083i;
        int size = tVar.size();
        long j13 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            j13 = Math.max(j13, ((b2) tVar.get(i13)).c());
        }
        s2.t tVar2 = this.f74084j;
        int size2 = tVar2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            j13 = Math.max(j13, ((g2) tVar2.get(i14)).b());
        }
        return j13;
    }

    public final Object c() {
        return ((g1) this.f74075a).f74073b.getValue();
    }

    public final boolean d() {
        s2.t tVar = this.f74083i;
        int size = tVar.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((b2) tVar.get(i13)).getClass();
        }
        s2.t tVar2 = this.f74084j;
        int size2 = tVar2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            if (((g2) tVar2.get(i14)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        g2 g2Var = this.f74076b;
        if (g2Var != null) {
            return g2Var.e();
        }
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = this.f74080f;
        return ((f3) s2.p.t(parcelableSnapshotMutableLongState.f71120b, parcelableSnapshotMutableLongState)).f71117c;
    }

    public final z1 f() {
        return (z1) this.f74079e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f74085k.getValue()).booleanValue();
    }

    public final void h(long j13, boolean z13) {
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = this.f74081g;
        long j14 = ((f3) s2.p.t(parcelableSnapshotMutableLongState.f71120b, parcelableSnapshotMutableLongState)).f71117c;
        n2 n2Var = this.f74075a;
        if (j14 == Long.MIN_VALUE) {
            parcelableSnapshotMutableLongState.h(j13);
            n2Var.f74167a.setValue(Boolean.TRUE);
        } else if (!((Boolean) n2Var.f74167a.getValue()).booleanValue()) {
            n2Var.f74167a.setValue(Boolean.TRUE);
        }
        this.f74082h.setValue(Boolean.FALSE);
        s2.t tVar = this.f74083i;
        int size = tVar.size();
        boolean z14 = true;
        for (int i13 = 0; i13 < size; i13++) {
            b2 b2Var = (b2) tVar.get(i13);
            boolean booleanValue = ((Boolean) b2Var.f73999e.getValue()).booleanValue();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = b2Var.f73999e;
            if (!booleanValue) {
                long d2 = z13 ? b2Var.b().d() : j13;
                b2Var.f74002h.setValue(b2Var.b().f(d2));
                b2Var.f74003i = b2Var.b().b(d2);
                if (b2Var.b().c(d2)) {
                    parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                z14 = false;
            }
        }
        s2.t tVar2 = this.f74084j;
        int size2 = tVar2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            g2 g2Var = (g2) tVar2.get(i14);
            if (!Intrinsics.d(g2Var.f74078d.getValue(), g2Var.c())) {
                g2Var.h(j13, z13);
            }
            if (!Intrinsics.d(g2Var.f74078d.getValue(), g2Var.c())) {
                z14 = false;
            }
        }
        if (z14) {
            i();
        }
    }

    public final void i() {
        this.f74081g.h(Long.MIN_VALUE);
        n2 n2Var = this.f74075a;
        if (n2Var instanceof g1) {
            ((g1) n2Var).f74073b.setValue(this.f74078d.getValue());
        }
        if (this.f74076b == null) {
            this.f74080f.h(0L);
        }
        n2Var.f74167a.setValue(Boolean.FALSE);
        s2.t tVar = this.f74084j;
        int size = tVar.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((g2) tVar.get(i13)).i();
        }
    }

    public final void j() {
        s2.t tVar = this.f74083i;
        int size = tVar.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((b2) tVar.get(i13)).d();
        }
        s2.t tVar2 = this.f74084j;
        int size2 = tVar2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ((g2) tVar2.get(i14)).j();
        }
    }

    public final void k(long j13, Object obj, Object obj2) {
        this.f74081g.h(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        n2 n2Var = this.f74075a;
        n2Var.f74167a.setValue(bool);
        boolean g13 = g();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f74078d;
        if (!g13 || !Intrinsics.d(c(), obj) || !Intrinsics.d(parcelableSnapshotMutableState.getValue(), obj2)) {
            if (!Intrinsics.d(c(), obj) && (n2Var instanceof g1)) {
                ((g1) n2Var).f74073b.setValue(obj);
            }
            parcelableSnapshotMutableState.setValue(obj2);
            this.f74085k.setValue(Boolean.TRUE);
            this.f74079e.setValue(new a2(obj, obj2));
        }
        s2.t tVar = this.f74084j;
        int size = tVar.size();
        for (int i13 = 0; i13 < size; i13++) {
            g2 g2Var = (g2) tVar.get(i13);
            Intrinsics.g(g2Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (g2Var.g()) {
                g2Var.k(j13, g2Var.c(), g2Var.f74078d.getValue());
            }
        }
        s2.t tVar2 = this.f74083i;
        int size2 = tVar2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ((b2) tVar2.get(i14)).e(j13);
        }
        this.f74086l = j13;
    }

    public final void l(Object obj) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f74078d;
        if (Intrinsics.d(parcelableSnapshotMutableState.getValue(), obj)) {
            return;
        }
        this.f74079e.setValue(new a2(parcelableSnapshotMutableState.getValue(), obj));
        if (!Intrinsics.d(c(), parcelableSnapshotMutableState.getValue())) {
            ((g1) this.f74075a).f74073b.setValue(parcelableSnapshotMutableState.getValue());
        }
        parcelableSnapshotMutableState.setValue(obj);
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = this.f74081g;
        if (((f3) s2.p.t(parcelableSnapshotMutableLongState.f71120b, parcelableSnapshotMutableLongState)).f71117c == Long.MIN_VALUE) {
            this.f74082h.setValue(Boolean.TRUE);
        }
        j();
    }

    public final String toString() {
        s2.t tVar = this.f74083i;
        int size = tVar.size();
        String str = "Transition animation values: ";
        for (int i13 = 0; i13 < size; i13++) {
            str = str + ((b2) tVar.get(i13)) + ", ";
        }
        return str;
    }
}
