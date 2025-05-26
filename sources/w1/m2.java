package w1;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class m2 implements m1.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1.h2 f127393a;

    /* renamed from: b, reason: collision with root package name */
    public final i2.o0 f127394b;

    /* renamed from: c, reason: collision with root package name */
    public final i2.o0 f127395c;

    public m2(m1.h2 h2Var, p2 p2Var) {
        this.f127393a = h2Var;
        this.f127394b = bs1.c.S(new l2(p2Var, 1));
        this.f127395c = bs1.c.S(new l2(p2Var, 0));
    }

    @Override // m1.h2
    public final boolean a() {
        return this.f127393a.a();
    }

    @Override // m1.h2
    public final Object b(k1.v1 v1Var, Function2 function2, bl2.c cVar) {
        return this.f127393a.b(v1Var, function2, cVar);
    }

    @Override // m1.h2
    public final boolean c() {
        return this.f127393a.c();
    }

    @Override // m1.h2
    public final boolean d() {
        return ((Boolean) this.f127395c.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final boolean e() {
        return ((Boolean) this.f127394b.getValue()).booleanValue();
    }

    @Override // m1.h2
    public final float f(float f13) {
        return this.f127393a.f(f13);
    }

    @Override // m1.h2
    public final boolean g() {
        return this.f127393a.g();
    }
}
