package vo;

import com.pinterest.activity.SendShareActivity;
import com.pinterest.component.modal.ModalContainer;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SendShareActivity f126381a;

    public t(SendShareActivity sendShareActivity) {
        this.f126381a = sendShareActivity;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ff0.d e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f126381a.f34838f;
        if (modalContainer != null) {
            ff0.a.a(modalContainer);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ff0.g e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (this.f126381a.f34838f != null) {
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i91.f e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        jc0.s sVar = new jc0.s();
        SendShareActivity sendShareActivity = this.f126381a;
        sendShareActivity.getEventManager().i(sVar);
        ModalContainer modalContainer = sendShareActivity.f34837e;
        if (modalContainer != null) {
            modalContainer.e(sVar);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.q e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        SendShareActivity sendShareActivity = this.f126381a;
        sendShareActivity.getEventManager().i(e13);
        ModalContainer modalContainer = sendShareActivity.f34837e;
        if (modalContainer != null) {
            modalContainer.g(e13);
            sendShareActivity.finish();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.s e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        SendShareActivity sendShareActivity = this.f126381a;
        sendShareActivity.getEventManager().i(e13);
        ModalContainer modalContainer = sendShareActivity.f34837e;
        if (modalContainer != null) {
            modalContainer.e(e13);
            sendShareActivity.finish();
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.v e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        SendShareActivity sendShareActivity = this.f126381a;
        sendShareActivity.getEventManager().i(e13);
        ModalContainer modalContainer = sendShareActivity.f34837e;
        if (modalContainer == null || modalContainer == null) {
            return;
        }
        modalContainer.k(e13);
    }
}
