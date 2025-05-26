package ss1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import me.o;
import so.s8;

/* loaded from: classes2.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115141a;

    public /* synthetic */ c(int i13) {
        this.f115141a = i13;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f115141a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "p0");
                Intrinsics.checkNotNullParameter(activity, "activity");
                d dVar = new d(activity, 0);
                if (activity instanceof af2.c) {
                    dVar.invoke((f) ((s8) ((g) o.a(activity, g.class))).f114269e.f114656f.get());
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(activity, "activity");
                d dVar2 = new d(activity, 4);
                if (activity instanceof af2.c) {
                    dVar2.invoke((n82.b) ((s8) ((n82.a) o.a(activity, n82.a.class))).f114269e.f114657g.get());
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f115141a) {
            case 0:
                Intrinsics.checkNotNullParameter(activity, "p0");
                Intrinsics.checkNotNullParameter(activity, "activity");
                d dVar = new d(activity, 1);
                if (activity instanceof af2.c) {
                    dVar.invoke((f) ((s8) ((g) o.a(activity, g.class))).f114269e.f114656f.get());
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(activity, "activity");
                d dVar2 = new d(activity, 2);
                if (activity instanceof af2.c) {
                    dVar2.invoke((n82.b) ((s8) ((n82.a) o.a(activity, n82.a.class))).f114269e.f114657g.get());
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity p03) {
        switch (this.f115141a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "activity");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity p03) {
        switch (this.f115141a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "activity");
                Intrinsics.checkNotNullParameter(p03, "activity");
                d dVar = new d(p03, 3);
                if (p03 instanceof af2.c) {
                    dVar.invoke((n82.b) ((s8) ((n82.a) o.a(p03, n82.a.class))).f114269e.f114657g.get());
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity p03, Bundle p13) {
        switch (this.f115141a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "activity");
                Intrinsics.checkNotNullParameter(p13, "outState");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity p03) {
        switch (this.f115141a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "activity");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity p03) {
        switch (this.f115141a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "activity");
                break;
        }
    }
}
