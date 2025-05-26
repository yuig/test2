package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lra/b;", "Landroidx/lifecycle/z;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements ra.b {
    @Override // ra.b
    public final Object a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ra.a c13 = ra.a.c(context);
        Intrinsics.checkNotNullExpressionValue(c13, "getInstance(context)");
        if (!c13.f106888b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        AtomicBoolean atomicBoolean = w.f18708a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!w.f18708a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new v());
        }
        s0 s0Var = s0.f18675i;
        Intrinsics.checkNotNullParameter(context, "context");
        s0 s0Var2 = s0.f18675i;
        s0Var2.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        s0Var2.f18680e = new Handler();
        s0Var2.f18681f.e(q.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.g(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new q0(s0Var2));
        return s0Var2;
    }

    @Override // ra.b
    public final List b() {
        return kotlin.collections.q0.f80391a;
    }
}
