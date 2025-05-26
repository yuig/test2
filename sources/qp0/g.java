package qp0;

import android.animation.Animator;
import android.widget.FrameLayout;
import com.pinterest.feature.comment.reactions.view.CommentReactionsContextMenuView;
import com.pinterest.feature.conversationmessage.reactions.view.ConversationMessageReactionsContextMenuView;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes5.dex */
public final class g extends e21.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f104746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f104747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f104748d;

    public g(int i13, FrameLayout frameLayout, Object obj) {
        this.f104746b = i13;
        this.f104747c = frameLayout;
        this.f104748d = obj;
    }

    @Override // e21.a, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        int i13 = this.f104746b;
        Object obj = this.f104748d;
        FrameLayout frameLayout = this.f104747c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationCancel(animation);
                ((CommentReactionsContextMenuView) frameLayout).f45494m = (v32.c) obj;
                break;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationCancel(animation);
                ((ConversationMessageReactionsContextMenuView) frameLayout).f45632a = (String) obj;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        String str;
        int i13 = this.f104746b;
        FrameLayout frameLayout = this.f104747c;
        Object obj = this.f104748d;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f56931a) {
                    return;
                }
                CommentReactionsContextMenuView commentReactionsContextMenuView = (CommentReactionsContextMenuView) frameLayout;
                op0.c cVar = commentReactionsContextMenuView.f45486e;
                if (cVar == null) {
                    Intrinsics.r("commonReactionContextMenuLogicHandler");
                    throw null;
                }
                s sVar = commentReactionsContextMenuView.f45485d;
                if (sVar == null) {
                    Intrinsics.r("comment");
                    throw null;
                }
                commentReactionsContextMenuView.f45484c = cVar.a(sVar, (v32.c) obj);
                commentReactionsContextMenuView.setVisibility(8);
                return;
            default:
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (this.f56931a || (str = (String) obj) == null || z.j(str)) {
                    return;
                }
                ConversationMessageReactionsContextMenuView conversationMessageReactionsContextMenuView = (ConversationMessageReactionsContextMenuView) frameLayout;
                conversationMessageReactionsContextMenuView.getClass();
                conversationMessageReactionsContextMenuView.setVisibility(8);
                return;
        }
    }
}
