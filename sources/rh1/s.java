package rh1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.feature.unifiedcomments.view.CommentReactionEducationModalView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends yk1.l {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f108281a;

    /* renamed from: b, reason: collision with root package name */
    public final m60.w f108282b;

    /* renamed from: c, reason: collision with root package name */
    public final uk1.e f108283c;

    /* renamed from: d, reason: collision with root package name */
    public final lb0.r f108284d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.q f108285e;

    /* renamed from: f, reason: collision with root package name */
    public CommentReactionEducationModalView f108286f;

    public s(Function0 onCompleteCallback, m60.w eventManager, uk1.e presenterPinalyticsFactory, lb0.r prefsManagerUser, uj2.q networkStateStream) {
        Intrinsics.checkNotNullParameter(onCompleteCallback, "onCompleteCallback");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalyticsFactory, "presenterPinalyticsFactory");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f108281a = onCompleteCallback;
        this.f108282b = eventManager;
        this.f108283c = presenterPinalyticsFactory;
        this.f108284d = prefsManagerUser;
        this.f108285e = networkStateStream;
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        System.out.println();
        jc0.n nVar = new jc0.n(context);
        nVar.Z(0, 0, 0, 0);
        nVar.T(false);
        nVar.setBackground(bs1.c.f0(nVar, fb0.b.comment_reaction_education_modal_bg, null, null, 6));
        Intrinsics.checkNotNullParameter(context, "context");
        CommentReactionEducationModalView commentReactionEducationModalView = new CommentReactionEducationModalView(context);
        View.inflate(commentReactionEducationModalView.getContext(), fb0.d.comment_reaction_education_modal_view, commentReactionEducationModalView);
        commentReactionEducationModalView.setPaddingRelative(0, 0, 0, bs1.c.W(commentReactionEducationModalView, eo1.c.lego_spacing_vertical_xlarge));
        View findViewById = commentReactionEducationModalView.findViewById(fb0.c.close_button);
        ((GestaltIconButton) findViewById).v(new t(commentReactionEducationModalView, 4));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = commentReactionEducationModalView.findViewById(fb0.c.complete_button);
        ((GestaltButton) findViewById2).d(j.f108174l).g(new t(commentReactionEducationModalView, 5));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f108286f = commentReactionEducationModalView;
        nVar.x(commentReactionEducationModalView);
        return nVar;
    }

    @Override // yk1.l
    public final yk1.m createPresenter() {
        oh1.o oVar = new oh1.o(this.f108281a, this.f108282b, ((uk1.a) this.f108283c).g(), this.f108284d, this.f108285e);
        oVar.create();
        return oVar;
    }

    @Override // yk1.l
    public final yk1.n getView() {
        CommentReactionEducationModalView commentReactionEducationModalView = this.f108286f;
        if (commentReactionEducationModalView != null) {
            return commentReactionEducationModalView;
        }
        Intrinsics.r("modalView");
        throw null;
    }
}
