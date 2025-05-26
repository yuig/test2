package se0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;

/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final b20.c f112386a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f112387b = false;

    public l(b20.c cVar) {
        this.f112386a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f112387b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z13 = this.f112387b;
        b20.c cVar = this.f112386a;
        if (z13) {
            cVar.getClass();
        } else {
            PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = (PinterestSwipeRefreshLayout) cVar.f21278a;
            pinterestSwipeRefreshLayout.f44875i = n.IDLE;
            ((q) pinterestSwipeRefreshLayout.f44877k).f112418a.stop();
        }
        this.f112387b = false;
        animator.removeListener(this);
    }
}
