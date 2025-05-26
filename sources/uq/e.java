package uq;

import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import com.pinterest.api.model.f30;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.p implements Function0 {
    public e(Object obj) {
        super(0, obj, CommentComposerView.class, "onTextFieldFocused", "onTextFieldFocused()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CommentComposerView commentComposerView = (CommentComposerView) this.receiver;
        d0 pinalytics = commentComposerView.f35090w;
        Intrinsics.checkNotNullExpressionValue(pinalytics, "pinalytics");
        u0 u0Var = u0.PIN_COMMENT_TEXTVIEW;
        g0 g0Var = g0.PIN_CLOSEUP_COMMENTS;
        f30 f30Var = commentComposerView.E;
        pinalytics.b0(u0Var, g0Var, f30Var != null ? f30Var.getUid() : null, false);
        if (!commentComposerView.g0(null)) {
            commentComposerView.H0();
        }
        return Unit.f80348a;
    }
}
