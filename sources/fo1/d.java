package fo1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kotlin.jvm.internal.Intrinsics;
import qp.j;

/* loaded from: classes5.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestaltToolbarImpl f62740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fm1.c f62741c;

    public /* synthetic */ d(GestaltToolbarImpl gestaltToolbarImpl, fm1.c cVar, int i13) {
        this.f62739a = i13;
        this.f62740b = gestaltToolbarImpl;
        this.f62741c = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f62739a;
        fm1.c cVar = this.f62741c;
        GestaltToolbarImpl gestaltToolbarImpl = this.f62740b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                gestaltToolbarImpl.f49710j = false;
                gestaltToolbarImpl.x().i(new j(4, cVar));
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                gestaltToolbarImpl.f49710j = false;
                gestaltToolbarImpl.x().i(new j(5, cVar));
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        int i13 = this.f62739a;
        GestaltToolbarImpl gestaltToolbarImpl = this.f62740b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                int i14 = GestaltToolbarImpl.f49700u;
                gestaltToolbarImpl.x().i(c.f62734k);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                int i15 = GestaltToolbarImpl.f49700u;
                gestaltToolbarImpl.x().i(c.f62735l);
                break;
        }
    }
}
