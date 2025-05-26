package qp0;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.pinterest.feature.comment.reactions.view.CommentReactionsContextMenuView;
import com.pinterest.feature.conversationmessage.reactions.view.ConversationMessageReactionsContextMenuView;
import com.pinterest.feature.pin.reactions.view.ReactionsContextMenuView;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import nt.c2;

/* loaded from: classes5.dex */
public final class e extends e21.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f104738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f104739c;

    public e(FrameLayout frameLayout, int i13) {
        this.f104738b = i13;
        this.f104739c = frameLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        int i13 = this.f104738b;
        FrameLayout frameLayout = this.f104739c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f56931a) {
                    f fVar = (f) frameLayout;
                    fVar.performHapticFeedback(3);
                    fVar.postDelayed(new c2(fVar, 26), 200L);
                }
                ((f) frameLayout).setAlpha(0.0f);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f56931a) {
                    return;
                }
                CommentReactionsContextMenuView commentReactionsContextMenuView = (CommentReactionsContextMenuView) frameLayout;
                v32.c cVar = commentReactionsContextMenuView.f45494m;
                if (cVar != null) {
                    op0.c cVar2 = commentReactionsContextMenuView.f45486e;
                    if (cVar2 == null) {
                        Intrinsics.r("commonReactionContextMenuLogicHandler");
                        throw null;
                    }
                    s sVar = commentReactionsContextMenuView.f45485d;
                    if (sVar == null) {
                        Intrinsics.r("comment");
                        throw null;
                    }
                    commentReactionsContextMenuView.f45484c = cVar2.a(sVar, cVar);
                }
                commentReactionsContextMenuView.setVisibility(8);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (!this.f56931a) {
                    qq0.b bVar = (qq0.b) frameLayout;
                    bVar.performHapticFeedback(3);
                    bVar.postDelayed(new c2(bVar, 28), 200L);
                }
                ((qq0.b) frameLayout).setAlpha(0.0f);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f56931a) {
                    return;
                }
                ConversationMessageReactionsContextMenuView conversationMessageReactionsContextMenuView = (ConversationMessageReactionsContextMenuView) frameLayout;
                String str = conversationMessageReactionsContextMenuView.f45632a;
                conversationMessageReactionsContextMenuView.setVisibility(8);
                return;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f56931a) {
                    return;
                }
                ReactionsContextMenuView reactionsContextMenuView = (ReactionsContextMenuView) frameLayout;
                v32.c cVar3 = reactionsContextMenuView.f47309o;
                if (cVar3 != null) {
                    a21.c cVar4 = reactionsContextMenuView.f47301g;
                    if (cVar4 == null) {
                        Intrinsics.r("commonReactionContextMenuLogicHandler");
                        throw null;
                    }
                    String str2 = reactionsContextMenuView.f47300f;
                    if (str2 == null) {
                        Intrinsics.r("uid");
                        throw null;
                    }
                    reactionsContextMenuView.f47299e = cVar4.a(cVar3, str2);
                }
                reactionsContextMenuView.setVisibility(8);
                return;
        }
    }
}
