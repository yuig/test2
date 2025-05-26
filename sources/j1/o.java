package j1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.v3;
import i2.y3;

/* loaded from: classes.dex */
public final class o implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final p2 f74168a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74169b;

    /* renamed from: c, reason: collision with root package name */
    public t f74170c;

    /* renamed from: d, reason: collision with root package name */
    public long f74171d;

    /* renamed from: e, reason: collision with root package name */
    public long f74172e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f74173f;

    public /* synthetic */ o(p2 p2Var, Object obj, t tVar, int i13) {
        this(p2Var, obj, (i13 & 4) != 0 ? null : tVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object b() {
        return this.f74168a.f74198b.invoke(this.f74170c);
    }

    @Override // i2.v3
    public final Object getValue() {
        return this.f74169b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f74169b.getValue() + ", velocity=" + b() + ", isRunning=" + this.f74173f + ", lastFrameTimeNanos=" + this.f74171d + ", finishedTimeNanos=" + this.f74172e + ')';
    }

    public o(p2 p2Var, Object obj, t tVar, long j13, long j14, boolean z13) {
        t tVar2;
        this.f74168a = p2Var;
        this.f74169b = bs1.c.u1(obj, y3.f71400a);
        if (tVar != null) {
            tVar2 = e.k(tVar);
        } else {
            tVar2 = (t) p2Var.f74197a.invoke(obj);
            tVar2.d();
        }
        this.f74170c = tVar2;
        this.f74171d = j13;
        this.f74172e = j14;
        this.f74173f = z13;
    }
}
