package xe2;

import androidx.activity.o;
import androidx.lifecycle.l1;
import androidx.lifecycle.p1;
import df.j1;
import java.util.Map;
import so.s8;

/* loaded from: classes4.dex */
public final class g implements p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final vt1.a f134836d = new vt1.a();

    /* renamed from: a, reason: collision with root package name */
    public final Map f134837a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f134838b;

    /* renamed from: c, reason: collision with root package name */
    public final d f134839c;

    public g(Map map, p1 p1Var, we2.a aVar) {
        this.f134837a = map;
        this.f134838b = p1Var;
        this.f134839c = new d(aVar);
    }

    public static g d(o oVar, p1 p1Var) {
        s8 s8Var = (s8) ((e) j1.b0(e.class, oVar));
        return new g(s8Var.B5(), p1Var, new m.h(s8Var.f114255d, s8Var.f114269e, 0));
    }

    @Override // androidx.lifecycle.p1
    public final l1 b(Class cls) {
        if (!this.f134837a.containsKey(cls)) {
            return this.f134838b.b(cls);
        }
        this.f134839c.b(cls);
        throw null;
    }

    @Override // androidx.lifecycle.p1
    public final l1 c(Class cls, u6.e eVar) {
        return this.f134837a.containsKey(cls) ? this.f134839c.c(cls, eVar) : this.f134838b.c(cls, eVar);
    }
}
