package kk2;

import java.util.concurrent.Callable;
import uj2.f0;

/* loaded from: classes4.dex */
public final class c extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79919a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f79920b;

    public c(Object obj, int i13) {
        this.f79919a = i13;
        this.f79920b = obj;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        int i13 = this.f79919a;
        Object obj = this.f79920b;
        switch (i13) {
            case 0:
                try {
                    Object call = ((Callable) obj).call();
                    ck2.i.b(call, "The singleSupplier returned a null SingleSource");
                    ((uj2.b0) ((f0) call)).p(d0Var);
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    bk2.d.error(th3, d0Var);
                    return;
                }
            default:
                ((uj2.b0) ((f0) obj)).p(d0Var);
                break;
        }
    }
}
