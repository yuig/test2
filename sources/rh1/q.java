package rh1;

import com.pinterest.feature.unifiedcomments.view.CommentCountHeaderView;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class q implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommentCountHeaderView f108269a;

    public q(CommentCountHeaderView commentCountHeaderView) {
        this.f108269a = commentCountHeaderView;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.f event) {
        Integer num;
        Intrinsics.checkNotNullParameter(event, "event");
        CommentCountHeaderView commentCountHeaderView = this.f108269a;
        if (!commentCountHeaderView.f48926f || (num = commentCountHeaderView.f48925e) == null) {
            return;
        }
        commentCountHeaderView.L(num.intValue() + 1);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.g event) {
        Integer num;
        Intrinsics.checkNotNullParameter(event, "event");
        CommentCountHeaderView commentCountHeaderView = this.f108269a;
        if (!commentCountHeaderView.f48926f || (num = commentCountHeaderView.f48925e) == null) {
            return;
        }
        commentCountHeaderView.L(num.intValue() - 1);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.h event) {
        Integer num;
        Intrinsics.checkNotNullParameter(event, "event");
        CommentCountHeaderView commentCountHeaderView = this.f108269a;
        if (!commentCountHeaderView.f48926f || (num = commentCountHeaderView.f48925e) == null) {
            return;
        }
        commentCountHeaderView.L(num.intValue() + 1);
    }
}
