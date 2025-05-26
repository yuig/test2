package rh1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.feature.unifiedcomments.view.CommentReactionListModalView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends yk1.l {

    /* renamed from: a, reason: collision with root package name */
    public final rp0.a f108293a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f108294b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f108295c;

    /* renamed from: d, reason: collision with root package name */
    public final uk1.e f108296d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.q f108297e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.fragment.app.w0 f108298f;

    /* renamed from: g, reason: collision with root package name */
    public final p51.d f108299g;

    /* renamed from: h, reason: collision with root package name */
    public CommentReactionListModalView f108300h;

    public u(rp0.a commentReactionListModalConfiguration, Function0 onCompleteCallback, m60.w eventManager, uk1.e presenterPinalyticsFactory, uj2.q networkStateStream, androidx.fragment.app.w0 fragmentManager, p51.d commentUserReactionsListFragment) {
        Intrinsics.checkNotNullParameter(commentReactionListModalConfiguration, "commentReactionListModalConfiguration");
        Intrinsics.checkNotNullParameter(onCompleteCallback, "onCompleteCallback");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(commentUserReactionsListFragment, "commentUserReactionsListFragment");
        this.f108293a = commentReactionListModalConfiguration;
        this.f108294b = onCompleteCallback;
        this.f108295c = eventManager;
        this.f108296d = presenterPinalyticsFactory;
        this.f108297e = networkStateStream;
        this.f108298f = fragmentManager;
        this.f108299g = commentUserReactionsListFragment;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        jc0.n nVar = new jc0.n(context);
        nVar.Z(0, 0, 0, 0);
        nVar.T(false);
        Intrinsics.checkNotNullParameter(context, "context");
        CommentReactionListModalView commentReactionListModalView = new CommentReactionListModalView(context);
        View.inflate(commentReactionListModalView.getContext(), db0.d.comment_reaction_list_modal_view, commentReactionListModalView);
        ((GestaltIconButton) commentReactionListModalView.findViewById(db0.c.close_button)).u(new v(commentReactionListModalView, 2));
        commentReactionListModalView.setMinHeight((int) (hf0.b.f69003c * 0.85d));
        this.f108300h = commentReactionListModalView;
        nVar.x(commentReactionListModalView);
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        rp0.a aVar = this.f108293a;
        String str = aVar.f109049a;
        uk1.d g13 = ((uk1.a) this.f108296d).g();
        oh1.p pVar = new oh1.p(str, aVar.f109050b, aVar.f109051c, false, aVar.f109052d, this.f108294b, this.f108295c, this.f108298f, this.f108299g, g13, this.f108297e);
        pVar.create();
        return pVar;
    }

    @Override // yk1.l
    public final yk1.n getView() {
        CommentReactionListModalView commentReactionListModalView = this.f108300h;
        if (commentReactionListModalView != null) {
            return commentReactionListModalView;
        }
        Intrinsics.r("modalView");
        throw null;
    }
}
