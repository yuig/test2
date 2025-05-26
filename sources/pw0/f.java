package pw0;

import com.pinterest.component.alert.AlertContainer;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.feature.mediagallery.MediaGalleryActivity;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaGalleryActivity f101514a;

    public f(MediaGalleryActivity mediaGalleryActivity) {
        this.f101514a = mediaGalleryActivity;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ff0.d e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f101514a.f46710c;
        if (modalContainer != null) {
            ff0.a.a(modalContainer);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ff0.g e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (this.f101514a.f46710c != null) {
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.s e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f101514a.f46709b;
        if (modalContainer != null) {
            modalContainer.f(jc0.a.Bottom, true);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull jc0.v e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f101514a.f46709b;
        if (modalContainer != null) {
            modalContainer.k(e13);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull yb0.c e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        AlertContainer alertContainer = this.f101514a.f46711d;
        if (alertContainer != null) {
            alertContainer.b(e13.f138475a);
        } else {
            Intrinsics.r("alertContainer");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull yb0.e e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        AlertContainer alertContainer = this.f101514a.f46711d;
        if (alertContainer != null) {
            alertContainer.c(e13.f138476a);
        } else {
            Intrinsics.r("alertContainer");
            throw null;
        }
    }
}
