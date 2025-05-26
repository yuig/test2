package vq1;

import com.pinterest.component.modal.ModalContainer;
import com.pinterest.framework.screens.ScreenModel;
import com.pinterest.framework.screens.s;
import com.pinterest.identity.UnauthActivity;
import com.pinterest.navigation.Navigation;
import jc0.q;
import jc0.v;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnauthActivity f126446a;

    public i(UnauthActivity unauthActivity) {
        this.f126446a = unauthActivity;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        int i13 = UnauthActivity.f49755o;
        s screenManager = this.f126446a.getScreenManager();
        if (screenManager != null) {
            ScreenModel screenDescription = navigation.b1();
            Intrinsics.checkNotNullExpressionValue(screenDescription, "toScreenDescription(...)");
            boolean r13 = navigation.r1();
            Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
            screenManager.c(screenDescription, true, false, true, r13);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ff0.d e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f126446a.f49764j;
        if (modalContainer != null) {
            ff0.a.a(modalContainer);
        } else {
            Intrinsics.r("adminModalContainer");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ff0.g e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (this.f126446a.f49764j != null) {
            throw null;
        }
        Intrinsics.r("adminModalContainer");
        throw null;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull q e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f126446a.f49762h;
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
        ModalContainer modalContainer = this.f126446a.f49762h;
        if (modalContainer != null) {
            modalContainer.e(e13);
        } else {
            Intrinsics.r("modalContainer");
            throw null;
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull v e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f126446a.f49762h;
        if (modalContainer != null) {
            modalContainer.k(e13);
        } else {
            Intrinsics.r("modalContainer");
            throw null;
        }
    }
}
