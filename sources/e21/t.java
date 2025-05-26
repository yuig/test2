package e21;

import android.animation.Animator;
import com.pinterest.feature.pin.reactions.view.ReactionsContextMenuView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f56988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReactionsContextMenuView f56989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v32.c f56990d;

    public t(ReactionsContextMenuView reactionsContextMenuView, v32.c cVar, int i13) {
        this.f56988b = i13;
        this.f56989c = reactionsContextMenuView;
        this.f56990d = cVar;
    }

    @Override // e21.a, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f56988b) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationCancel(animation);
                this.f56989c.f47309o = this.f56990d;
                break;
            default:
                super.onAnimationCancel(animation);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f56988b;
        v32.c cVar = this.f56990d;
        ReactionsContextMenuView reactionsContextMenuView = this.f56989c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f56931a) {
                    return;
                }
                a21.c cVar2 = reactionsContextMenuView.f47301g;
                if (cVar2 == null) {
                    Intrinsics.r("commonReactionContextMenuLogicHandler");
                    throw null;
                }
                String str = reactionsContextMenuView.f47300f;
                if (str == null) {
                    Intrinsics.r("uid");
                    throw null;
                }
                reactionsContextMenuView.f47299e = cVar2.a(cVar, str);
                reactionsContextMenuView.setVisibility(8);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f56931a) {
                    return;
                }
                a21.c cVar3 = reactionsContextMenuView.f47301g;
                if (cVar3 == null) {
                    Intrinsics.r("commonReactionContextMenuLogicHandler");
                    throw null;
                }
                String str2 = reactionsContextMenuView.f47300f;
                if (str2 != null) {
                    reactionsContextMenuView.f47299e = cVar3.a(cVar, str2);
                    return;
                } else {
                    Intrinsics.r("uid");
                    throw null;
                }
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f56931a) {
                    return;
                }
                a21.c cVar4 = reactionsContextMenuView.f47301g;
                if (cVar4 == null) {
                    Intrinsics.r("commonReactionContextMenuLogicHandler");
                    throw null;
                }
                String str3 = reactionsContextMenuView.f47300f;
                if (str3 == null) {
                    Intrinsics.r("uid");
                    throw null;
                }
                reactionsContextMenuView.f47299e = cVar4.a(cVar, str3);
                reactionsContextMenuView.setVisibility(8);
                return;
        }
    }
}
