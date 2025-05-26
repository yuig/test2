package jk2;

import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76418b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76419c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f76420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uj2.t tVar, ck2.d dVar) {
        super(tVar);
        ck2.e eVar = ck2.i.f27921a;
        this.f76418b = 1;
        this.f76420d = eVar;
        this.f76419c = dVar;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        int i13 = this.f76418b;
        uj2.t tVar = this.f76382a;
        Object obj = this.f76420d;
        Object obj2 = this.f76419c;
        switch (i13) {
            case 0:
                try {
                    Object call = ((Callable) obj2).call();
                    ck2.i.b(call, "The initialSupplier returned a null value");
                    tVar.d(new b(vVar, call, (ak2.b) obj));
                    break;
                } catch (Throwable th3) {
                    bk2.d.error(th3, vVar);
                    return;
                }
            case 1:
                try {
                    Object call2 = ((Callable) obj2).call();
                    ck2.i.b(call2, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    tVar.d(new t(vVar, (ak2.f) obj, (Collection) call2));
                    break;
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    bk2.d.error(th4, vVar);
                    return;
                }
            default:
                rk2.d dVar = new rk2.d(vVar);
                z2 z2Var = new z2(dVar, (ak2.c) obj2);
                dVar.b(z2Var);
                ((uj2.t) obj).d(new p2(this, z2Var));
                tVar.d(z2Var);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(uj2.t tVar, Object obj, Object obj2, int i13) {
        super(tVar);
        this.f76418b = i13;
        this.f76419c = obj;
        this.f76420d = obj2;
    }
}
