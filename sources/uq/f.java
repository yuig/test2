package uq;

import com.pinterest.activity.pin.view.unifiedcomments.CommentComposerView;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommentComposerView f123001a;

    public f(CommentComposerView commentComposerView) {
        this.f123001a = commentComposerView;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.d(event.f100060a.k(), "userdiditdata")) {
            int i13 = CommentComposerView.L;
            this.f123001a.z0(true);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Intrinsics.d(event.f100064b.k(), "userdiditdata")) {
            int i13 = CommentComposerView.L;
            this.f123001a.z0(false);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull vp.a event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        CommentComposerView commentComposerView = this.f123001a;
        if (commentComposerView.f35070J || (str = event.f126394b) == null) {
            return;
        }
        CommentComposerView.I0(commentComposerView, null, str, 1);
        commentComposerView.G = event.f126393a;
    }
}
