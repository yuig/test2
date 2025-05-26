package jk2;

import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class g2 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76480b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(uj2.t tVar, Object obj, int i13) {
        super(tVar);
        this.f76480b = i13;
        this.f76481c = obj;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        int i13 = this.f76480b;
        uj2.t tVar = this.f76382a;
        Object obj = this.f76481c;
        switch (i13) {
            case 0:
                tVar.d(new f2(vVar, (ak2.g) obj, 0));
                break;
            case 1:
                tVar.d(new f2(vVar, (ak2.g) obj, 1));
                break;
            default:
                try {
                    Object call = ((Callable) obj).call();
                    ck2.i.b(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    tVar.d(new x2(vVar, (Collection) call, 0));
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    bk2.d.error(th3, vVar);
                    return;
                }
        }
    }
}
