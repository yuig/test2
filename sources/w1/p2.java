package w1;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;

/* loaded from: classes2.dex */
public final class p2 {

    /* renamed from: f, reason: collision with root package name */
    public static final r2.s f127442f = kh2.j.s2(o2.f127423i, t.f127511v);

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f127443a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f127444b = b7.c.J(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public a3.d f127445c = a3.d.f483e;

    /* renamed from: d, reason: collision with root package name */
    public long f127446d = b4.p0.f21639b;

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f127447e;

    public p2(m1.f1 f1Var, float f13) {
        this.f127443a = b7.c.J(f13);
        this.f127447e = bs1.c.u1(f1Var, y3.f71400a);
    }

    public final void a(m1.f1 f1Var, a3.d dVar, int i13, int i14) {
        float f13 = i14 - i13;
        this.f127444b.i(f13);
        a3.d dVar2 = this.f127445c;
        float f14 = dVar2.f484a;
        float f15 = dVar.f484a;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.f127443a;
        float f16 = dVar.f485b;
        if (f15 != f14 || f16 != dVar2.f485b) {
            boolean z13 = f1Var == m1.f1.Vertical;
            if (z13) {
                f15 = f16;
            }
            float f17 = z13 ? dVar.f487d : dVar.f486c;
            float h10 = parcelableSnapshotMutableFloatState.h();
            float f18 = i13;
            float f19 = h10 + f18;
            parcelableSnapshotMutableFloatState.i(parcelableSnapshotMutableFloatState.h() + ((f17 <= f19 && (f15 >= h10 || f17 - f15 <= f18)) ? (f15 >= h10 || f17 - f15 > f18) ? 0.0f : f15 - h10 : f17 - f19));
            this.f127445c = dVar;
        }
        parcelableSnapshotMutableFloatState.i(ql2.s.f(parcelableSnapshotMutableFloatState.h(), 0.0f, f13));
    }
}
