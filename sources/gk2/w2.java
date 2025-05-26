package gk2;

import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class w2 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f65687c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f65688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2(uj2.h hVar, Object obj, int i13) {
        super(hVar);
        this.f65687c = i13;
        this.f65688d = obj;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        int i13 = this.f65687c;
        uj2.h hVar = this.f65321b;
        Object obj = this.f65688d;
        switch (i13) {
            case 0:
                v2 v2Var = new v2(bVar);
                bVar.d(v2Var);
                ((xp2.a) obj).b(v2Var.f65668e);
                hVar.l(v2Var);
                break;
            case 1:
                hVar.l(new x2(bVar, (ak2.g) obj));
                break;
            case 2:
                try {
                    Object call = ((Callable) obj).call();
                    ck2.i.b(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    Collection collection = (Collection) call;
                    a3 a3Var = new a3(bVar);
                    a3Var.f95469b = collection;
                    hVar.l(a3Var);
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    ok2.d.error(th3, bVar);
                    return;
                }
            default:
                hVar.l(new c3(bVar, (uj2.a0) obj));
                break;
        }
    }
}
