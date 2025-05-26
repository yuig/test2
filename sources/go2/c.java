package go2;

import com.google.common.util.concurrent.k0;
import fk2.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kh2.m2;
import kotlin.coroutines.CoroutineContext;
import uj2.c0;

/* loaded from: classes4.dex */
public final class c extends ao2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f65928d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f65929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.f65928d = 0;
        this.f65929e = new b(this);
    }

    @Override // ao2.a
    public final void e0(boolean z13, Throwable th3) {
        int i13 = this.f65928d;
        CoroutineContext coroutineContext = this.f20108c;
        Object obj = this.f65929e;
        switch (i13) {
            case 0:
                b bVar = (b) obj;
                bVar.getClass();
                boolean z14 = th3 instanceof CancellationException;
                k0 k0Var = bVar.f65926b;
                if (!z14) {
                    if (k0Var.w(th3)) {
                        bVar.f65927c = true;
                        break;
                    }
                } else {
                    k0Var.v(new a((CancellationException) th3));
                    break;
                }
                break;
            case 1:
                try {
                    if (((f) ((uj2.c) obj)).a(th3)) {
                    }
                } catch (Throwable th4) {
                    xk2.f.a(th3, th4);
                }
                m2.a1(coroutineContext, th3);
                break;
            default:
                try {
                    if (((kk2.a) ((c0) obj)).c(th3)) {
                    }
                } catch (Throwable th5) {
                    xk2.f.a(th3, th5);
                }
                m2.a1(coroutineContext, th3);
                break;
        }
    }

    @Override // ao2.a
    public final void f0(Object obj) {
        int i13 = this.f65928d;
        CoroutineContext coroutineContext = this.f20108c;
        Object obj2 = this.f65929e;
        switch (i13) {
            case 0:
                ((b) obj2).f65926b.v(obj);
                break;
            case 1:
                try {
                    ((f) ((uj2.c) obj2)).b();
                    break;
                } catch (Throwable th3) {
                    m2.a1(coroutineContext, th3);
                }
            default:
                try {
                    ((kk2.a) ((c0) obj2)).b(obj);
                    break;
                } catch (Throwable th4) {
                    m2.a1(coroutineContext, th4);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CoroutineContext coroutineContext, AtomicReference atomicReference, int i13) {
        super(coroutineContext, false, true);
        this.f65928d = i13;
        this.f65929e = atomicReference;
    }
}
