package j1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.v3;
import i2.y3;

/* loaded from: classes2.dex */
public final class o0 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public Object f74174a;

    /* renamed from: b, reason: collision with root package name */
    public Object f74175b;

    /* renamed from: c, reason: collision with root package name */
    public final p2 f74176c;

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74177d;

    /* renamed from: e, reason: collision with root package name */
    public w1 f74178e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f74179f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f74180g;

    /* renamed from: h, reason: collision with root package name */
    public long f74181h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u0 f74182i;

    public o0(u0 u0Var, Float f13, Float f14, n0 n0Var) {
        p2 p2Var = q2.f74205a;
        this.f74182i = u0Var;
        this.f74174a = f13;
        this.f74175b = f14;
        this.f74176c = p2Var;
        this.f74177d = bs1.c.u1(f13, y3.f71400a);
        this.f74178e = new w1(n0Var, p2Var, this.f74174a, this.f74175b, null);
    }

    @Override // i2.v3
    public final Object getValue() {
        return this.f74177d.getValue();
    }
}
