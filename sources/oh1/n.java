package oh1;

import com.pinterest.feature.unifiedcomments.view.CommentCodeModalView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final c30.a f94545a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f94546b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f94547c;

    /* renamed from: d, reason: collision with root package name */
    public final lb0.r f94548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c30.a userStateService, Function0 onCompleteCallback, m60.w eventManager, lb0.r prefsManagerUser, uk1.d pinalytics, uj2.q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(userStateService, "userStateService");
        Intrinsics.checkNotNullParameter(onCompleteCallback, "onCompleteCallback");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f94545a = userStateService;
        this.f94546b = onCompleteCallback;
        this.f94547c = eventManager;
        this.f94548d = prefsManagerUser;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        CommentCodeModalView view = (CommentCodeModalView) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        view.f48919a = this;
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        CommentCodeModalView commentCodeModalView = (CommentCodeModalView) getViewIfBound();
        if (commentCodeModalView != null) {
            commentCodeModalView.f48919a = null;
        }
        super.onUnbind();
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        CommentCodeModalView view = (CommentCodeModalView) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        view.f48919a = this;
    }
}
