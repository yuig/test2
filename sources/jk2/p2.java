package jk2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import retrofit2.HttpException;

/* loaded from: classes4.dex */
public final class p2 implements uj2.v, pq2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76639a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f76640b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76641c;

    public /* synthetic */ p2(int i13, Object obj, Object obj2) {
        this.f76639a = i13;
        this.f76641c = obj;
        this.f76640b = obj2;
    }

    @Override // uj2.v
    public void a() {
        int i13 = this.f76639a;
        Object obj = this.f76640b;
        switch (i13) {
            case 0:
                ((uj2.v) obj).a();
                break;
            case 1:
                break;
            default:
                ((co2.y) ((co2.z) obj)).r(null);
                break;
        }
    }

    @Override // uj2.v
    public void b(xj2.c cVar) {
        int i13 = this.f76639a;
        Object obj = this.f76641c;
        switch (i13) {
            case 0:
                bk2.c.replace((AtomicReference) obj, cVar);
                break;
            case 1:
                bk2.c.setOnce(((z2) this.f76640b).f76787d, cVar);
                break;
            default:
                AtomicReference atomicReference = (AtomicReference) obj;
                while (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        cVar.dispose();
                        break;
                    }
                }
                break;
        }
    }

    @Override // uj2.v
    public void c(Object obj) {
        int i13 = this.f76639a;
        Object obj2 = this.f76640b;
        switch (i13) {
            case 0:
                ((uj2.v) obj2).c(obj);
                break;
            case 1:
                ((z2) obj2).lazySet(obj);
                break;
            default:
                try {
                    co2.y yVar = (co2.y) ((co2.z) obj2);
                    Object g13 = yVar.f28359d.g(obj);
                    if (g13 instanceof co2.s) {
                        Object obj3 = ((co2.t) kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new co2.v(yVar, obj, null))).f28348a;
                    } else {
                        Unit unit = Unit.f80348a;
                    }
                    break;
                } catch (InterruptedException unused) {
                    return;
                }
        }
    }

    @Override // pq2.l
    public void e(Throwable th3, pq2.i iVar) {
        int i13 = this.f76639a;
        Object obj = this.f76640b;
        switch (i13) {
            case 0:
                ((CompletableFuture) obj).completeExceptionally(th3);
                break;
            case 1:
                ((CompletableFuture) obj).completeExceptionally(th3);
                break;
            default:
                ((pq2.r) this.f76641c).f101077a.execute(new x62.c(this, (pq2.l) obj, th3, 7));
                break;
        }
    }

    @Override // pq2.l
    public void l(pq2.i iVar, pq2.a1 a1Var) {
        int i13 = this.f76639a;
        Object obj = this.f76640b;
        switch (i13) {
            case 0:
                if (!a1Var.f100989a.d()) {
                    ((CompletableFuture) obj).completeExceptionally(new HttpException(a1Var));
                    break;
                } else {
                    ((CompletableFuture) obj).complete(a1Var.f100990b);
                    break;
                }
            case 1:
                ((CompletableFuture) obj).complete(a1Var);
                break;
            default:
                ((pq2.r) this.f76641c).f101077a.execute(new x62.c(this, (pq2.l) obj, a1Var, 6));
                break;
        }
    }

    @Override // uj2.v
    public void onError(Throwable th3) {
        int i13 = this.f76639a;
        Object obj = this.f76640b;
        switch (i13) {
            case 0:
                ((uj2.v) obj).onError(th3);
                break;
            case 1:
                z2 z2Var = (z2) obj;
                bk2.c.dispose(z2Var.f76786c);
                z2Var.f76784a.onError(th3);
                break;
            default:
                ((co2.y) ((co2.z) obj)).r(th3);
                break;
        }
    }

    public /* synthetic */ p2(Object obj, AtomicReference atomicReference, int i13) {
        this.f76639a = i13;
        this.f76640b = obj;
        this.f76641c = atomicReference;
    }

    public p2(c cVar, z2 z2Var) {
        this.f76639a = 1;
        this.f76641c = cVar;
        this.f76640b = z2Var;
    }
}
