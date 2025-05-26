package sa;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes3.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f112151b;

    public /* synthetic */ f(SwipeRefreshLayout swipeRefreshLayout, int i13) {
        this.f112150a = i13;
        this.f112151b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i13 = this.f112150a;
        SwipeRefreshLayout swipeRefreshLayout = this.f112151b;
        switch (i13) {
            case 0:
                if (!swipeRefreshLayout.f19797b) {
                    swipeRefreshLayout.f();
                    break;
                } else {
                    swipeRefreshLayout.f19817v.setAlpha(255);
                    swipeRefreshLayout.f19817v.start();
                    swipeRefreshLayout.f19806k = swipeRefreshLayout.f19812q.getTop();
                    break;
                }
            default:
                swipeRefreshLayout.getClass();
                g gVar = new g(swipeRefreshLayout, 0);
                swipeRefreshLayout.f19818w = gVar;
                gVar.setDuration(150L);
                a aVar = swipeRefreshLayout.f19812q;
                aVar.f112113a = null;
                aVar.clearAnimation();
                swipeRefreshLayout.f19812q.startAnimation(swipeRefreshLayout.f19818w);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
