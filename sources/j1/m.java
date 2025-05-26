package j1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import i2.y3;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final p2 f74144a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f74145b;

    /* renamed from: c, reason: collision with root package name */
    public final long f74146c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f74147d;

    /* renamed from: e, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74148e;

    /* renamed from: f, reason: collision with root package name */
    public t f74149f;

    /* renamed from: g, reason: collision with root package name */
    public long f74150g;

    /* renamed from: h, reason: collision with root package name */
    public long f74151h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f74152i;

    public m(Object obj, p2 p2Var, t tVar, long j13, Object obj2, long j14, Function0 function0) {
        this.f74144a = p2Var;
        this.f74145b = obj2;
        this.f74146c = j14;
        this.f74147d = function0;
        y3 y3Var = y3.f71400a;
        this.f74148e = bs1.c.u1(obj, y3Var);
        this.f74149f = e.k(tVar);
        this.f74150g = j13;
        this.f74151h = Long.MIN_VALUE;
        this.f74152i = bs1.c.u1(Boolean.TRUE, y3Var);
    }

    public final void a() {
        this.f74152i.setValue(Boolean.FALSE);
        this.f74147d.invoke();
    }
}
