package go2;

import ao2.o1;
import com.google.common.util.concurrent.c0;
import com.google.common.util.concurrent.k0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f65925a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f65926b = new k0();

    /* renamed from: c, reason: collision with root package name */
    public boolean f65927c;

    public b(o1 o1Var) {
        this.f65925a = o1Var;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        if (!this.f65926b.cancel(z13)) {
            return false;
        }
        this.f65925a.cancel((CancellationException) null);
        return true;
    }

    @Override // com.google.common.util.concurrent.c0
    public final void d(Runnable runnable, Executor executor) {
        this.f65926b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj = this.f65926b.get();
        if (obj instanceof a) {
            throw new CancellationException().initCause(((a) obj).f65924a);
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        k0 k0Var = this.f65926b;
        if (k0Var.isCancelled()) {
            return true;
        }
        if (k0Var.isDone() && !this.f65927c) {
            try {
                if (com.bumptech.glide.c.c0(k0Var) instanceof a) {
                    return true;
                }
            } catch (CancellationException unused) {
                return true;
            } catch (ExecutionException unused2) {
                this.f65927c = true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f65926b.isDone();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("[status=");
        k0 k0Var = this.f65926b;
        if (k0Var.isDone()) {
            try {
                Object c03 = com.bumptech.glide.c.c0(k0Var);
                if (c03 instanceof a) {
                    sb3.append("CANCELLED, cause=[" + ((a) c03).f65924a + ']');
                } else {
                    sb3.append("SUCCESS, result=[" + c03 + ']');
                }
            } catch (CancellationException unused) {
                sb3.append("CANCELLED");
            } catch (ExecutionException e13) {
                sb3.append("FAILURE, cause=[" + e13.getCause() + ']');
            } catch (Throwable th3) {
                sb3.append("UNKNOWN, cause=[" + th3.getClass() + " thrown from get()]");
            }
        } else {
            sb3.append("PENDING, delegate=[" + k0Var + ']');
        }
        sb3.append(']');
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        Object obj = this.f65926b.get(j13, timeUnit);
        if (obj instanceof a) {
            throw new CancellationException().initCause(((a) obj).f65924a);
        }
        return obj;
    }
}
