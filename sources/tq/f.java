package tq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.Rect;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f118832b;

    public /* synthetic */ f(b bVar, int i13) {
        this.f118831a = i13;
        this.f118832b = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f118831a;
        b bVar = this.f118832b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                bVar.getLayoutParams().height = -2;
                bVar.f118806g = false;
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                bVar.getLayoutParams().height = -2;
                bVar.f118806g = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        switch (this.f118831a) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                int i13 = b.f118799j;
                b bVar = this.f118832b;
                bVar.getClass();
                Rect Q0 = bs1.c.Q0(bVar);
                Activity l03 = bs1.c.l0(bVar);
                PinterestRecyclerView pinterestRecyclerView = l03 != null ? (PinterestRecyclerView) l03.findViewById(r80.c.closeup_recycler_view) : null;
                Object obj = pinterestRecyclerView != null ? pinterestRecyclerView.f52535e : null;
                LinearLayoutManager linearLayoutManager = obj instanceof LinearLayoutManager ? (LinearLayoutManager) obj : null;
                if (Q0.top <= 0 && linearLayoutManager != null) {
                    linearLayoutManager.B1(0, -bVar.getTop());
                    break;
                }
                break;
            default:
                super.onAnimationStart(animation);
                break;
        }
    }
}
