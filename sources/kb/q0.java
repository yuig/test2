package kb;

import androidx.work.RxWorker;
import io.reactivex.exceptions.CompositeException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q0 implements uj2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79022a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f79023b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f79024c;

    public /* synthetic */ q0(int i13, Object obj, Object obj2) {
        this.f79022a = i13;
        this.f79024c = obj;
        this.f79023b = obj2;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        int i13 = this.f79022a;
        Object obj = this.f79023b;
        switch (i13) {
            case 0:
                Objects.requireNonNull(cVar);
                ((r4.i) obj).a(new androidx.activity.d(cVar, 14), RxWorker.f19995e);
                break;
            case 1:
                ((uj2.d0) obj).b(cVar);
                break;
            case 2:
                ((uj2.d0) obj).b(cVar);
                break;
            case 3:
                ((uj2.d0) obj).b(cVar);
                break;
            case 4:
                ((uj2.d0) obj).b(cVar);
                break;
            default:
                ((uj2.d0) obj).b(cVar);
                break;
        }
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        Object apply;
        int i13 = this.f79022a;
        Object obj = this.f79024c;
        Object obj2 = this.f79023b;
        switch (i13) {
            case 0:
                ((r4.i) obj2).d(th3);
                break;
            case 1:
                try {
                    ((kk2.g) obj).f79945c.accept(th3);
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    th3 = new CompositeException(th3, th4);
                }
                ((uj2.d0) obj2).onError(th3);
                break;
            case 2:
                try {
                    ((ak2.b) ((hk2.o) obj).f69430c).accept(null, th3);
                } catch (Throwable th5) {
                    bp1.h.H(th5);
                    th3 = new CompositeException(th3, th5);
                }
                ((uj2.d0) obj2).onError(th3);
                break;
            case 3:
                ((uj2.d0) obj2).onError(th3);
                break;
            case 4:
                ((uj2.d0) obj2).onError(th3);
                break;
            default:
                fk2.f0 f0Var = (fk2.f0) obj;
                if (((ak2.f) f0Var.f62437d) != null) {
                    try {
                        apply = ((ak2.f) ((fk2.f0) obj).f62437d).apply(th3);
                    } catch (Throwable th6) {
                        bp1.h.H(th6);
                        ((uj2.d0) obj2).onError(new CompositeException(th3, th6));
                        return;
                    }
                } else {
                    apply = f0Var.f62435b;
                }
                if (apply != null) {
                    ((uj2.d0) obj2).onSuccess(apply);
                    break;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                    nullPointerException.initCause(th3);
                    ((uj2.d0) obj2).onError(nullPointerException);
                    break;
                }
        }
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        int i13 = this.f79022a;
        Object obj2 = this.f79024c;
        Object obj3 = this.f79023b;
        switch (i13) {
            case 0:
                ((r4.i) obj3).b(obj);
                break;
            case 1:
                ((uj2.d0) obj3).onSuccess(obj);
                break;
            case 2:
                try {
                    ((ak2.b) ((hk2.o) obj2).f69430c).accept(obj, null);
                    ((uj2.d0) obj3).onSuccess(obj);
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    ((uj2.d0) obj3).onError(th3);
                    return;
                }
            case 3:
                try {
                    ((kk2.g) obj2).f79945c.accept(obj);
                    ((uj2.d0) obj3).onSuccess(obj);
                    break;
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    ((uj2.d0) obj3).onError(th4);
                    return;
                }
            case 4:
                try {
                    Object apply = ((ak2.f) obj2).apply(obj);
                    ck2.i.b(apply, "The mapper function returned a null value.");
                    ((uj2.d0) obj3).onSuccess(apply);
                    break;
                } catch (Throwable th5) {
                    bp1.h.H(th5);
                    onError(th5);
                    return;
                }
            default:
                ((uj2.d0) obj3).onSuccess(obj);
                break;
        }
    }

    public q0(uj2.d0 d0Var, ak2.f fVar) {
        this.f79022a = 4;
        this.f79023b = d0Var;
        this.f79024c = fVar;
    }
}
