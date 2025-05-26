package jk2;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class v extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76717b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76718c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f76719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, ck2.f fVar, u20.c cVar) {
        super(xVar);
        this.f76717b = 2;
        this.f76718c = cVar;
        this.f76719d = fVar;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        int i13 = this.f76717b;
        uj2.t tVar = this.f76382a;
        Object obj = this.f76718c;
        Object obj2 = this.f76719d;
        switch (i13) {
            case 0:
                tVar.d(new u(vVar, (ak2.f) obj, (re2.h) obj2));
                break;
            case 1:
                tVar.d(new ek2.h(vVar, (ak2.e) obj, (ak2.a) obj2, 0));
                break;
            default:
                try {
                    Object call = ((Callable) obj2).call();
                    ck2.i.b(call, "The seed supplied is null");
                    tVar.d(new d(vVar, (ak2.c) obj, call));
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    bk2.d.error(th3, vVar);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(uj2.t tVar, Object obj, Object obj2, int i13) {
        super(tVar);
        this.f76717b = i13;
        this.f76718c = obj;
        this.f76719d = obj2;
    }
}
