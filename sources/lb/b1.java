package lb;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82583a;

    static {
        String h10 = kb.b0.h("WorkerWrapper");
        Intrinsics.checkNotNullExpressionValue(h10, "tagWithPrefix(\"WorkerWrapper\")");
        f82583a = h10;
    }

    public static final Object a(com.google.common.util.concurrent.c0 c0Var, kb.a0 a0Var, bl2.c frame) {
        try {
            if (c0Var.isDone()) {
                return b(c0Var);
            }
            ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
            oVar.v();
            c0Var.d(new x(c0Var, oVar), kb.o.INSTANCE);
            oVar.e(new i2.i(10, a0Var, c0Var));
            Object u13 = oVar.u();
            if (u13 == cl2.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return u13;
        } catch (ExecutionException e13) {
            throw c(e13);
        }
    }

    public static final Object b(Future future) {
        Object obj;
        boolean z13 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z13 = true;
            } catch (Throwable th3) {
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.f(cause);
        return cause;
    }
}
