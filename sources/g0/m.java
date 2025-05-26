package g0;

import androidx.appcompat.app.z;
import androidx.camera.core.impl.c2;
import c0.m1;
import com.google.common.util.concurrent.c0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final c2 f63214a = new c2();

    public static void a(c0 c0Var, c cVar, Executor executor) {
        c0Var.d(new androidx.appcompat.widget.j(c0Var, cVar, 3), executor);
    }

    public static r b(List list) {
        return new r(new ArrayList(list), true, l3.c.s());
    }

    public static Object c(Future future) {
        com.bumptech.glide.d.v("Future was expected to be done, " + future, future.isDone());
        return d(future);
    }

    public static Object d(Future future) {
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

    public static p e(Object obj) {
        return obj == null ? p.f63216b : new p(obj);
    }

    public static c0 f(c0 c0Var) {
        c0Var.getClass();
        return c0Var.isDone() ? c0Var : com.bumptech.glide.d.L(new h(1, c0Var));
    }

    public static void g(c0 c0Var, r4.i iVar) {
        h(true, c0Var, iVar, l3.c.s());
    }

    public static void h(boolean z13, c0 c0Var, r4.i iVar, f0.d dVar) {
        c2 c2Var = f63214a;
        c0Var.getClass();
        iVar.getClass();
        dVar.getClass();
        a(c0Var, new m1(iVar, c2Var, 3), dVar);
        if (z13) {
            iVar.a(new z(c0Var, 5), l3.c.s());
        }
    }

    public static r i(ArrayList arrayList) {
        return new r(new ArrayList(arrayList), false, l3.c.s());
    }

    public static b j(c0 c0Var, a aVar, Executor executor) {
        b bVar = new b(aVar, c0Var);
        c0Var.d(bVar, executor);
        return bVar;
    }
}
