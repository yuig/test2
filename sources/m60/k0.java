package m60;

import android.app.Activity;
import com.pinterest.activity.ExperimentsReloaderActivity;
import com.pinterest.activity.PinterestActivity;
import ey.j3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f85917a;

    public k0(m0 m0Var) {
        this.f85917a = m0Var;
    }

    @Override // m60.f, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!(activity instanceof PinterestActivity) && !(activity instanceof ExperimentsReloaderActivity)) {
            boolean z13 = ff0.j.f62103a;
            new ny.h().i();
            dl2.b.f55293b = false;
            j3 j3Var = j3.f60510a;
            j3.j();
        }
        this.f85917a.unregisterActivityLifecycleCallbacks(this);
    }
}
