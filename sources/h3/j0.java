package h3;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;

/* loaded from: classes.dex */
public final class j0 extends g3.b {

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f66705e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f66706f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f66707g;

    /* renamed from: h, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f66708h;

    /* renamed from: i, reason: collision with root package name */
    public float f66709i;

    /* renamed from: j, reason: collision with root package name */
    public b3.p f66710j;

    /* renamed from: k, reason: collision with root package name */
    public int f66711k;

    public j0(c cVar) {
        a3.f fVar = new a3.f(0L);
        y3 y3Var = y3.f71400a;
        this.f66705e = bs1.c.u1(fVar, y3Var);
        this.f66706f = bs1.c.u1(Boolean.FALSE, y3Var);
        e0 e0Var = new e0(cVar);
        e0Var.f66642f = new androidx.activity.a0(this, 7);
        this.f66707g = e0Var;
        this.f66708h = tb.f.X(0);
        this.f66709i = 1.0f;
        this.f66711k = -1;
    }

    @Override // g3.b
    public final void a(float f13) {
        this.f66709i = f13;
    }

    @Override // g3.b
    public final void b(b3.p pVar) {
        this.f66710j = pVar;
    }

    @Override // g3.b
    public final long d() {
        return ((a3.f) this.f66705e.getValue()).f497a;
    }

    @Override // g3.b
    public final void e(d3.h hVar) {
        b3.p pVar = this.f66710j;
        e0 e0Var = this.f66707g;
        if (pVar == null) {
            pVar = (b3.p) e0Var.f66643g.getValue();
        }
        if (((Boolean) this.f66706f.getValue()).booleanValue() && hVar.getLayoutDirection() == n4.k.Rtl) {
            long t03 = hVar.t0();
            d3.b p03 = hVar.p0();
            long e13 = p03.e();
            p03.a().j();
            try {
                p03.f53648a.c(t03, -1.0f, 1.0f);
                e0Var.e(hVar, this.f66709i, pVar);
            } finally {
                ep.b.z(p03, e13);
            }
        } else {
            e0Var.e(hVar, this.f66709i, pVar);
        }
        this.f66711k = this.f66708h.h();
    }
}
