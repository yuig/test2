package m60;

import android.app.Activity;
import jk2.a1;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;

/* loaded from: classes.dex */
public final class b0 implements f {

    /* renamed from: b, reason: collision with root package name */
    public final uk2.d f85887b = s1.h("create(...)");

    /* renamed from: a, reason: collision with root package name */
    public int f85886a = 0;

    public final jk2.v a() {
        uk2.d dVar = this.f85887b;
        dVar.getClass();
        jk2.v o13 = new a1(dVar).o();
        Intrinsics.checkNotNullExpressionValue(o13, "distinctUntilChanged(...)");
        return o13;
    }

    @Override // m60.f, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f85886a != 1 || activity.isChangingConfigurations()) {
            return;
        }
        this.f85887b.c(a.BACKGROUNDING);
    }

    @Override // m60.f, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i13 = this.f85886a + 1;
        this.f85886a = i13;
        if (i13 >= 1) {
            this.f85887b.c(a.FOREGROUND);
        }
    }

    @Override // m60.f, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i13 = this.f85886a;
        if (i13 > 0) {
            this.f85886a = i13 - 1;
        }
        if (this.f85886a == 0) {
            this.f85887b.c(a.BACKGROUND);
        }
    }
}
