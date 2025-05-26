package i90;

import o82.r;
import x02.i2;
import x02.x2;

/* loaded from: classes5.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f71771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f71772b;

    public a(i2 i2Var, x2 x2Var) {
        this.f71771a = i2Var;
        this.f71772b = x2Var;
    }

    @Override // o82.r
    public final Object i(Object obj, bl2.c cVar) {
        if (obj instanceof f) {
            Object a13 = d.a(this.f71771a, ((f) obj).f71779a, cVar);
            return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : (xz.b) a13;
        }
        if (!(obj instanceof e)) {
            return d.f71777a;
        }
        Object b13 = d.b(this.f71772b, ((e) obj).f71778a, cVar);
        return b13 == cl2.a.COROUTINE_SUSPENDED ? b13 : (xz.b) b13;
    }
}
