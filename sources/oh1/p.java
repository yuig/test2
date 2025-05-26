package oh1;

import android.os.Bundle;
import androidx.fragment.app.w0;
import com.pinterest.feature.unifiedcomments.view.CommentReactionListModalView;
import h32.a4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends yk1.c implements rh1.w {

    /* renamed from: a, reason: collision with root package name */
    public final String f94552a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94553b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f94554c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f94555d;

    /* renamed from: e, reason: collision with root package name */
    public final a4 f94556e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f94557f;

    /* renamed from: g, reason: collision with root package name */
    public final m60.w f94558g;

    /* renamed from: h, reason: collision with root package name */
    public final w0 f94559h;

    /* renamed from: i, reason: collision with root package name */
    public final p51.d f94560i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String commentId, String commentType, boolean z13, boolean z14, a4 a4Var, Function0 onCompleteCallback, m60.w eventManager, w0 fragmentManager, p51.d commentUserReactionsListFragment, uk1.d pinalytics, uj2.q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(commentId, "commentId");
        Intrinsics.checkNotNullParameter(commentType, "commentType");
        Intrinsics.checkNotNullParameter(onCompleteCallback, "onCompleteCallback");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(commentUserReactionsListFragment, "commentUserReactionsListFragment");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f94552a = commentId;
        this.f94553b = commentType;
        this.f94554c = z13;
        this.f94555d = z14;
        this.f94556e = a4Var;
        this.f94557f = onCompleteCallback;
        this.f94558g = eventManager;
        this.f94559h = fragmentManager;
        this.f94560i = commentUserReactionsListFragment;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        ((CommentReactionListModalView) getView()).f48929a = null;
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(CommentReactionListModalView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        view.f48929a = this;
        w0 w0Var = this.f94559h;
        w0Var.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(w0Var);
        Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
        p51.d dVar = this.f94560i;
        dVar.getClass();
        String str = this.f94552a;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        dVar.B0 = str;
        String str2 = this.f94553b;
        dVar.C0 = Intrinsics.d(str2, "aggregatedcomment");
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_COMMENT_COMPONENT", !Intrinsics.d(str2, "aggregatedcomment") ? "AGGREGATED_COMMENT_DIDIT" : this.f94554c ? "AGGREGATED_COMMENT_REPLY" : "AGGREGATED_COMMENT_NONREPLY");
        bundle.putString("com.pinterest.EXTRA_COMMENT_VIEW_TYPE", this.f94555d ? "PIN" : "PIN_COMMENTS");
        a4 a4Var = this.f94556e;
        if (a4Var != null) {
            bundle.putString("com.pinterest.EXTRA_COMMENT_VIEW_PARAMETER", a4Var.name());
        }
        dVar.setArguments(bundle);
        aVar.g(db0.c.comment_user_reactions_fragment_container_view, dVar, null, 1);
        aVar.e(false);
    }
}
