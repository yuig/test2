package qq2;

import bp1.h;
import io.reactivex.exceptions.CompositeException;
import lb.l0;
import pq2.a1;
import retrofit2.adapter.rxjava2.HttpException;
import uj2.v;

/* loaded from: classes2.dex */
public final class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final v f104878a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f104879b;

    public a(v vVar) {
        this.f104878a = vVar;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f104879b) {
            return;
        }
        this.f104878a.a();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        this.f104878a.b(cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        a1 a1Var = (a1) obj;
        boolean d2 = a1Var.f100989a.d();
        v vVar = this.f104878a;
        if (d2) {
            vVar.c(a1Var.f100990b);
            return;
        }
        this.f104879b = true;
        HttpException httpException = new HttpException(a1Var);
        try {
            vVar.onError(httpException);
        } catch (Throwable th3) {
            h.H(th3);
            l0.R0(new CompositeException(httpException, th3));
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (!this.f104879b) {
            this.f104878a.onError(th3);
            return;
        }
        AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
        assertionError.initCause(th3);
        l0.R0(assertionError);
    }
}
