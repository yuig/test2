package m11;

import ag1.j;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.component.modal.ModalContainer;
import com.pinterest.feature.pin.creation.CreationActivity;
import ff0.d;
import ff0.g;
import jc0.s;
import jc0.v;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import yb0.e;

/* loaded from: classes5.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CreationActivity f85661a;

    public a(CreationActivity creationActivity) {
        this.f85661a = creationActivity;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull j e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        int i13 = CreationActivity.A;
        this.f85661a.x(true);
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull d e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f85661a.f47081e;
        if (modalContainer != null) {
            ff0.a.a(modalContainer);
        } else {
            Intrinsics.r("adminModalContainer");
            throw null;
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull g e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (this.f85661a.f47081e != null) {
            throw null;
        }
        Intrinsics.r("adminModalContainer");
        throw null;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull s e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f85661a.f47080d;
        if (modalContainer != null) {
            modalContainer.f(jc0.a.Bottom, true);
        } else {
            Intrinsics.r("modalContainer");
            throw null;
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull v e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        ModalContainer modalContainer = this.f85661a.f47080d;
        if (modalContainer != null) {
            modalContainer.k(e13);
        } else {
            Intrinsics.r("modalContainer");
            throw null;
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pt0.a e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        CreationActivity creationActivity = this.f85661a;
        FrameLayout frameLayout = creationActivity.f47078b;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            BottomSheetBehavior bottomSheetBehavior = creationActivity.f47079c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.X(4);
                return;
            } else {
                Intrinsics.r("bottomSheetBehavior");
                throw null;
            }
        }
        Intrinsics.r("bottomSheetContainer");
        throw null;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final <T> void onEventMainThread(@NotNull pt0.b e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        CreationActivity creationActivity = this.f85661a;
        FrameLayout frameLayout = creationActivity.f47078b;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            if (creationActivity.f47078b != null) {
                throw null;
            }
            Intrinsics.r("bottomSheetContainer");
            throw null;
        }
        Intrinsics.r("bottomSheetContainer");
        throw null;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pt0.c e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (this.f85661a.f47078b != null) {
            throw null;
        }
        Intrinsics.r("bottomSheetContainer");
        throw null;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final <T> void onEventMainThread(@NotNull pt0.d e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        FrameLayout frameLayout = this.f85661a.f47078b;
        if (frameLayout != null) {
            frameLayout.getChildAt(0);
        } else {
            Intrinsics.r("bottomSheetContainer");
            throw null;
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull yb0.c e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        AlertContainer alertContainer = this.f85661a.f47084h;
        if (alertContainer != null) {
            alertContainer.b(e13.f138475a);
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull e e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        AlertContainer alertContainer = this.f85661a.f47084h;
        if (alertContainer != null) {
            alertContainer.c(e13.f138476a);
        }
    }
}
