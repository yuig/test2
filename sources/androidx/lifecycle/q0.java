package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q0 extends i {
    final /* synthetic */ s0 this$0;

    public q0(s0 s0Var) {
        this.this$0 = s0Var;
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i13 = a1.f18582b;
            bk.f.M(activity).f18583a = this.this$0.f18683h;
        }
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        s0 s0Var = this.this$0;
        int i13 = s0Var.f18677b - 1;
        s0Var.f18677b = i13;
        if (i13 == 0) {
            Handler handler = s0Var.f18680e;
            Intrinsics.f(handler);
            handler.postDelayed(s0Var.f18682g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(@NotNull Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        o0.a(activity, new p0(this.this$0));
    }

    @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        s0 s0Var = this.this$0;
        int i13 = s0Var.f18676a - 1;
        s0Var.f18676a = i13;
        if (i13 == 0 && s0Var.f18678c) {
            s0Var.f18681f.e(q.ON_STOP);
            s0Var.f18679d = true;
        }
    }
}
