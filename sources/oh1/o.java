package oh1;

import com.pinterest.feature.unifiedcomments.view.CommentReactionEducationModalView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f94549a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f94550b;

    /* renamed from: c, reason: collision with root package name */
    public final lb0.r f94551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Function0 onCompleteCallback, m60.w eventManager, uk1.d pinalytics, lb0.r prefsManagerUser, uj2.q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(onCompleteCallback, "onCompleteCallback");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f94549a = onCompleteCallback;
        this.f94550b = eventManager;
        this.f94551c = prefsManagerUser;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        CommentReactionEducationModalView view = (CommentReactionEducationModalView) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        view.f48928a = this;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        CommentReactionEducationModalView commentReactionEducationModalView = (CommentReactionEducationModalView) getViewIfBound();
        if (commentReactionEducationModalView != null) {
            commentReactionEducationModalView.f48928a = null;
        }
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        CommentReactionEducationModalView view = (CommentReactionEducationModalView) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        view.f48928a = this;
    }
}
