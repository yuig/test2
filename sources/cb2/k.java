package cb2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.pinterest.ui.menu.ContextMenuView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContextMenuView f27336b;

    public /* synthetic */ k(ContextMenuView contextMenuView, int i13) {
        this.f27335a = i13;
        this.f27336b = contextMenuView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f27335a;
        ContextMenuView contextMenuView = this.f27336b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                contextMenuView.f52607e.setVisibility(8);
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animator");
                contextMenuView.f52609g.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o oVar;
        switch (this.f27335a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                ContextMenuView contextMenuView = this.f27336b;
                if (contextMenuView.f52622t && (oVar = contextMenuView.f52608f) != null) {
                    Handler handler = oVar.getHandler();
                    if (handler != null) {
                        handler.removeCallbacks(oVar.f27352l);
                    }
                    oVar.b().f2();
                    bs1.c.X0(oVar.b());
                    oVar.c();
                    oVar.setVisibility(8);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }
}
