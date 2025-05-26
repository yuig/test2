package j1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final k2.e f74245a = new k2.e(new o0[16]);

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74246b;

    /* renamed from: c, reason: collision with root package name */
    public long f74247c;

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74248d;

    public u0() {
        Boolean bool = Boolean.FALSE;
        y3 y3Var = y3.f71400a;
        this.f74246b = bs1.c.u1(bool, y3Var);
        this.f74247c = Long.MIN_VALUE;
        this.f74248d = bs1.c.u1(Boolean.TRUE, y3Var);
    }

    public final void a(i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-318043801);
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = 0;
        if ((i14 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            Object J2 = sVar.J();
            am.d dVar = i2.n.f71185a;
            if (J2 == dVar) {
                J2 = bs1.c.u1(null, y3.f71400a);
                sVar.g0(J2);
            }
            i2.q1 q1Var = (i2.q1) J2;
            if (((Boolean) this.f74248d.getValue()).booleanValue() || ((Boolean) this.f74246b.getValue()).booleanValue()) {
                sVar.W(1719915818);
                boolean j13 = sVar.j(this);
                Object J3 = sVar.J();
                if (j13 || J3 == dVar) {
                    J3 = new s0(q1Var, this, null);
                    sVar.g0(J3);
                }
                i2.u.e(this, (Function2) J3, sVar);
                sVar.r(false);
            } else {
                sVar.W(1721436120);
                sVar.r(false);
            }
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new t0(this, i13, i15);
        }
    }
}
