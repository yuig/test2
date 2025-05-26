package tt0;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraSpeedControlView;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarControlsView;
import com.pinterest.navigation.Navigation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import om0.m1;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119098i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f119099j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(l0 l0Var, int i13) {
        super(0);
        this.f119098i = i13;
        this.f119099j = l0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f119098i;
        l0 l0Var = this.f119099j;
        switch (i13) {
            case 0:
                CameraSidebarControlsView cameraSidebarControlsView = l0Var.I0;
                if (cameraSidebarControlsView == null) {
                    Intrinsics.r("cameraSidebarControls");
                    throw null;
                }
                Object value = cameraSidebarControlsView.f45953c.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                return (IdeaPinCreationCameraSpeedControlView) value;
            case 1:
                Navigation navigation = l0Var.I;
                Intrinsics.f(navigation);
                String v03 = navigation.v0("com.pinterest.EXTRA_STORY_PIN_MEDIA_GALLERY_ENTRY_TYPE");
                return v03 == null ? pw0.x.IdeaPinPageAdd : pw0.x.valueOf(v03);
            case 2:
                m264invoke();
                return Unit.f80348a;
            case 3:
                m264invoke();
                return Unit.f80348a;
            case 4:
                m264invoke();
                return Unit.f80348a;
            case 5:
                m264invoke();
                return Unit.f80348a;
            case 6:
                m264invoke();
                return Unit.f80348a;
            case 7:
                m264invoke();
                return Unit.f80348a;
            case 8:
                m264invoke();
                return Unit.f80348a;
            case 9:
                m264invoke();
                return Unit.f80348a;
            case 10:
                Navigation navigation2 = l0Var.I;
                Intrinsics.f(navigation2);
                return Long.valueOf(navigation2.U(pp2.a.u()));
            case 11:
                return new st0.c(l0Var, l0Var.s7(), l0Var.b6(), pw0.j.a((pw0.x) l0Var.S0.getValue()));
            case 12:
                m264invoke();
                return Unit.f80348a;
            case 13:
                m264invoke();
                return Unit.f80348a;
            case 14:
                m264invoke();
                return Unit.f80348a;
            default:
                m264invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m264invoke() {
        List i13;
        int i14 = this.f119098i;
        l0 l0Var = this.f119099j;
        switch (i14) {
            case 2:
                l0Var.s7().X(h32.u0.STORY_PIN_DISCARD_BUTTON);
                l0Var.D5();
                return;
            case 3:
                l0Var.s7().X(h32.u0.DISMISS_BUTTON);
                return;
            case 4:
                l0Var.f119178n0 = true;
                com.pinterest.framework.screens.s sVar = l0Var.f91293r;
                if (sVar != null && (i13 = sVar.i()) != null && i13.size() == 2) {
                    l0Var.n8();
                    return;
                }
                if (((pw0.x) l0Var.S0.getValue()) == pw0.x.IdeaPinAddMediaClip) {
                    l0Var.z(a.f119059s);
                    return;
                }
                Navigation navigation = l0Var.I;
                if (navigation != null && navigation.S("com.pinterest.EXTRA_IDEA_PIN_EDIT_FLOW", false)) {
                    l0Var.z(a.f119060t);
                    return;
                } else {
                    l0Var.D5();
                    return;
                }
            case 5:
                d0 d0Var = new d0(l0Var, 4);
                int i15 = l0.Z0;
                if (((pw0.x) l0Var.S0.getValue()) == pw0.x.IdeaPinAddMediaClip) {
                    d0Var.invoke();
                    return;
                }
                if (!l0Var.f119180p0.p()) {
                    l0Var.n8();
                    return;
                }
                FragmentActivity requireActivity = l0Var.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                Context requireContext = l0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                kh2.a1.z0(requireActivity, requireContext, new m1(11, d0Var, l0Var));
                return;
            case 6:
                l0Var.f119180p0.f109959k = false;
                l0.Y7(l0Var);
                return;
            case 7:
                l0Var.f119180p0.f109959k = false;
                return;
            case 8:
                int i16 = l0.Z0;
                l0Var.q8();
                return;
            case 9:
                l0Var.f119180p0.f109959k = true;
                l0.Y7(l0Var);
                fp0.d dVar = l0Var.f119189y0;
                if (dVar != null) {
                    if (dVar.k()) {
                        CameraSidebarControlsView cameraSidebarControlsView = l0Var.I0;
                        if (cameraSidebarControlsView != null) {
                            cameraSidebarControlsView.c().X(aq1.h.idea_pin_camera_flash_title, aq1.h.idea_pin_camera_flash_content_description, rm1.q.FLASH_SLASH);
                            cameraSidebarControlsView.c().L(false);
                            return;
                        } else {
                            Intrinsics.r("cameraSidebarControls");
                            throw null;
                        }
                    }
                    CameraSidebarControlsView cameraSidebarControlsView2 = l0Var.I0;
                    if (cameraSidebarControlsView2 != null) {
                        cameraSidebarControlsView2.c().T();
                        return;
                    } else {
                        Intrinsics.r("cameraSidebarControls");
                        throw null;
                    }
                }
                Intrinsics.r("cameraView");
                throw null;
            case 10:
            case 11:
            default:
                z zVar = l0Var.J0;
                if (zVar == null) {
                    Intrinsics.r("cameraController");
                    throw null;
                }
                zVar.w(s.RECORDING_STOPPING);
                return;
            case 12:
                int i17 = l0.Z0;
                l0Var.n8();
                ImageView imageView = l0Var.f119187w0;
                if (imageView == null) {
                    Intrinsics.r("photoPreview");
                    throw null;
                }
                imageView.setVisibility(8);
                return;
            case 13:
                int i18 = l0.Z0;
                l0Var.o8();
                return;
            case 14:
                if (l0Var.R0) {
                    return;
                }
                CameraSidebarControlsView cameraSidebarControlsView3 = l0Var.I0;
                if (cameraSidebarControlsView3 != null) {
                    if (cameraSidebarControlsView3.f() != null) {
                        CameraSidebarControlsView cameraSidebarControlsView4 = l0Var.I0;
                        if (cameraSidebarControlsView4 == null) {
                            Intrinsics.r("cameraSidebarControls");
                            throw null;
                        }
                        if (cameraSidebarControlsView4.f() != rt0.e.OFF) {
                            l0Var.t8();
                            return;
                        }
                    }
                    l0Var.y8();
                    return;
                }
                Intrinsics.r("cameraSidebarControls");
                throw null;
        }
    }
}
