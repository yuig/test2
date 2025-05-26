package androidx.lifecycle;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class p0 extends i {
    final /* synthetic */ s0 this$0;

    public p0(s0 s0Var) {
        this.this$0 = s0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        s0 s0Var = this.this$0;
        int i13 = s0Var.f18676a + 1;
        s0Var.f18676a = i13;
        if (i13 == 1 && s0Var.f18679d) {
            s0Var.f18681f.e(q.ON_START);
            s0Var.f18679d = false;
        }
    }
}
