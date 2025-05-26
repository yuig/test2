package kb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f79048a = new u0(null);

    public final lb.b0 a(String uniqueWorkName, q existingWorkPolicy, f0 request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        List b13 = kotlin.collections.e0.b(request);
        lb.j0 j0Var = (lb.j0) this;
        if (b13.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new lb.b0(j0Var, uniqueWorkName, existingWorkPolicy, b13, null);
    }

    public abstract bk.f b(String str);

    public abstract bk.f c(String str);

    public final void d(f0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        List b13 = kotlin.collections.e0.b(request);
        lb.j0 j0Var = (lb.j0) this;
        if (b13.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new lb.b0(j0Var, null, q.KEEP, b13, null).b();
    }

    public abstract i0 e(String str, p pVar, n0 n0Var);

    public final void f(String uniqueWorkName, q existingWorkPolicy, f0 request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        new lb.b0((lb.j0) this, uniqueWorkName, existingWorkPolicy, kotlin.collections.e0.b(request), null).b();
    }

    public abstract androidx.lifecycle.j0 g(String str);
}
