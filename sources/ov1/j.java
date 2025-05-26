package ov1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.pinterest.ui.grid.PinterestRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f97732b;

    public /* synthetic */ j(k kVar, int i13) {
        this.f97731a = i13;
        this.f97732b = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f97731a;
        k kVar = this.f97732b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                kVar.f97742j.setVisibility(8);
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                PinterestRecyclerView pinterestRecyclerView = kVar.f97743k;
                pinterestRecyclerView.setAlpha(0.0f);
                pinterestRecyclerView.setVisibility(0);
                pinterestRecyclerView.animate().alpha(1.0f).setDuration(200L).start();
                break;
        }
    }
}
