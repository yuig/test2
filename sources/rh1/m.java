package rh1;

import com.pinterest.component.alert.AlertContainer;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.feature.unifiedcomments.view.CommentActivity;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class m implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommentActivity f108250a;

    public m(CommentActivity commentActivity) {
        this.f108250a = commentActivity;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i92.h e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        CommentActivity commentActivity = this.f108250a;
        commentActivity.getEventManager().i(e13);
        commentActivity.showToast(e13.f71930a);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.q e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        CommentActivity commentActivity = this.f108250a;
        commentActivity.getEventManager().i(e13);
        ModalContainer modalContainer = commentActivity.f48916g;
        if (modalContainer != null) {
            modalContainer.g(e13);
        } else {
            Intrinsics.r("modalContainer");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.s e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        CommentActivity commentActivity = this.f108250a;
        commentActivity.getEventManager().i(e13);
        ModalContainer modalContainer = commentActivity.f48916g;
        if (modalContainer != null) {
            modalContainer.e(e13);
        } else {
            Intrinsics.r("modalContainer");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.v e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        CommentActivity commentActivity = this.f108250a;
        commentActivity.getEventManager().i(e13);
        ModalContainer modalContainer = commentActivity.f48916g;
        if (modalContainer != null) {
            modalContainer.k(e13);
        } else {
            Intrinsics.r("modalContainer");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull yb0.c e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        AlertContainer alertContainer = this.f108250a.f48912c;
        if (alertContainer != null) {
            alertContainer.b(e13.f138475a);
        } else {
            Intrinsics.r("alertContainer");
            throw null;
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull yb0.e e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        CommentActivity commentActivity = this.f108250a;
        commentActivity.getEventManager().i(e13);
        AlertContainer alertContainer = commentActivity.f48912c;
        if (alertContainer != null) {
            alertContainer.c(e13.f138476a);
        } else {
            Intrinsics.r("alertContainer");
            throw null;
        }
    }
}
