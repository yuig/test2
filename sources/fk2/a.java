package fk2;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a implements uj2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62403a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f62404b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f62405c;

    public /* synthetic */ a(Object obj, uj2.d dVar, int i13) {
        this.f62403a = i13;
        this.f62405c = obj;
        this.f62404b = dVar;
    }

    @Override // uj2.d
    public final void a() {
        Object call;
        int i13 = this.f62403a;
        Object obj = this.f62404b;
        switch (i13) {
            case 0:
                ((uj2.d) obj).a();
                break;
            case 1:
                ((uj2.d) obj).a();
                break;
            default:
                f0 f0Var = (f0) obj;
                Callable callable = (Callable) f0Var.f62437d;
                Object obj2 = this.f62405c;
                if (callable != null) {
                    try {
                        call = ((Callable) ((f0) obj).f62437d).call();
                    } catch (Throwable th3) {
                        bp1.h.H(th3);
                        ((uj2.d0) obj2).onError(th3);
                        return;
                    }
                } else {
                    call = f0Var.f62435b;
                }
                if (call != null) {
                    ((uj2.d0) obj2).onSuccess(call);
                    break;
                } else {
                    ((uj2.d0) obj2).onError(new NullPointerException("The value supplied is null"));
                    break;
                }
        }
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        int i13 = this.f62403a;
        Object obj = this.f62405c;
        switch (i13) {
            case 0:
                bk2.c.replace((AtomicReference) obj, cVar);
                break;
            case 1:
                ((uj2.d) this.f62404b).b(cVar);
                break;
            default:
                ((uj2.d0) obj).b(cVar);
                break;
        }
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        int i13 = this.f62403a;
        Object obj = this.f62404b;
        Object obj2 = this.f62405c;
        switch (i13) {
            case 0:
                ((uj2.d) obj).onError(th3);
                break;
            case 1:
                try {
                    if (!((ak2.g) ((c) obj2).f62418c).test(th3)) {
                        ((uj2.d) obj).onError(th3);
                        break;
                    } else {
                        ((uj2.d) obj).a();
                        break;
                    }
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    ((uj2.d) obj).onError(new CompositeException(th3, th4));
                    return;
                }
            default:
                ((uj2.d0) obj2).onError(th3);
                break;
        }
    }

    public a(f0 f0Var, uj2.d0 d0Var) {
        this.f62403a = 2;
        this.f62404b = f0Var;
        this.f62405c = d0Var;
    }
}
