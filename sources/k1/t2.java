package k1;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t2 implements m1.h2 {

    /* renamed from: i, reason: collision with root package name */
    public static final r2.s f78026i;

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f78027a;

    /* renamed from: e, reason: collision with root package name */
    public float f78031e;

    /* renamed from: f, reason: collision with root package name */
    public final m1.u f78032f;

    /* renamed from: h, reason: collision with root package name */
    public final i2.o0 f78034h;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f78028b = tb.f.X(0);

    /* renamed from: c, reason: collision with root package name */
    public final o1.l f78029c = new o1.l();

    /* renamed from: d, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f78030d = tb.f.X(Integer.MAX_VALUE);

    /* renamed from: g, reason: collision with root package name */
    public final i2.o0 f78033g = bs1.c.S(new r2(this, 1));

    static {
        q2 q2Var = q2.f77981i;
        g1 g1Var = g1.f77869k;
        r2.s sVar = r2.t.f106065a;
        f78026i = new r2.s(q2Var, g1Var);
    }

    public t2(int i13) {
        this.f78027a = tb.f.X(i13);
        int i14 = 0;
        this.f78032f = new m1.u(new s2(this, i14));
        this.f78034h = bs1.c.S(new r2(this, i14));
    }

    @Override // m1.h2
    public final boolean a() {
        return this.f78032f.a();
    }

    @Override // m1.h2
    public final Object b(v1 v1Var, Function2 function2, bl2.c cVar) {
        Object b13 = this.f78032f.b(v1Var, function2, cVar);
        return b13 == cl2.a.COROUTINE_SUSPENDED ? b13 : Unit.f80348a;
    }

    @Override // m1.h2
    public final boolean c() {
        return this.f78032f.c();
    }

    @Override // m1.h2
    public final boolean d() {
        return ((Boolean) this.f78034h.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final boolean e() {
        return ((Boolean) this.f78033g.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final float f(float f13) {
        return this.f78032f.f(f13);
    }

    @Override // m1.h2
    public final boolean g() {
        return this.f78032f.g();
    }

    public final int h() {
        return this.f78027a.h();
    }
}
