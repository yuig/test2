package fo1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestaltToolbarImpl f62742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fm1.c f62743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f62744c;

    public e(GestaltToolbarImpl gestaltToolbarImpl, fm1.c cVar, float f13) {
        this.f62742a = gestaltToolbarImpl;
        this.f62743b = cVar;
        this.f62744c = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i13 = GestaltToolbarImpl.f49700u;
        GestaltToolbarImpl gestaltToolbarImpl = this.f62742a;
        gestaltToolbarImpl.t().setVisibility(this.f62743b == fm1.c.VISIBLE ? 8 : 0);
        gestaltToolbarImpl.t().setAlpha(this.f62744c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i13 = GestaltToolbarImpl.f49700u;
        this.f62742a.t().setVisibility(0);
    }
}
