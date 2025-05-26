package tt0;

import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraSpeedControlView;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarControlsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119114a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Object obj, int i13) {
        super(0, obj, l0.class, "checkFullPermissionsAndUpdateView", "checkFullPermissionsAndUpdateView()V", 0);
        this.f119114a = i13;
        if (i13 == 1) {
            super(0, obj, l0.class, "startRecording", "startRecording()V", 0);
        } else if (i13 != 2) {
        } else {
            super(0, obj, l0.class, "toggleSpeedControls", "toggleSpeedControls()V", 0);
        }
    }

    public final void h() {
        switch (this.f119114a) {
            case 0:
                l0 l0Var = (l0) this.receiver;
                int i13 = l0.Z0;
                boolean[] b83 = l0Var.b8();
                for (boolean z13 : b83) {
                    if (!z13) {
                        l0Var.r8(b83);
                        return;
                    }
                }
                l0Var.i8();
                fp0.d dVar = l0Var.f119189y0;
                if (dVar != null) {
                    dVar.onResume();
                    return;
                } else {
                    Intrinsics.r("cameraView");
                    throw null;
                }
            case 1:
                l0 l0Var2 = (l0) this.receiver;
                rt0.b bVar = l0Var2.f119180p0;
                if (bVar.f109952d || !bVar.f109959k) {
                    return;
                }
                int i14 = c0.f119091a[((pw0.x) l0Var2.S0.getValue()).ordinal()];
                if (i14 != 1) {
                    if (i14 == 2 && !bVar.f()) {
                        return;
                    }
                } else if (!bVar.f() && bVar.f109957i.size() >= 1) {
                    return;
                }
                z zVar = l0Var2.J0;
                if (zVar == null) {
                    Intrinsics.r("cameraController");
                    throw null;
                }
                zVar.e(true);
                CameraSidebarControlsView cameraSidebarControlsView = l0Var2.I0;
                if (cameraSidebarControlsView == null) {
                    Intrinsics.r("cameraSidebarControls");
                    throw null;
                }
                if (cameraSidebarControlsView.f() != null) {
                    CameraSidebarControlsView cameraSidebarControlsView2 = l0Var2.I0;
                    if (cameraSidebarControlsView2 == null) {
                        Intrinsics.r("cameraSidebarControls");
                        throw null;
                    }
                    if (cameraSidebarControlsView2.f() != rt0.e.OFF) {
                        l0Var2.t8();
                        return;
                    }
                }
                l0Var2.k8();
                return;
            default:
                l0 l0Var3 = (l0) this.receiver;
                int i15 = l0.Z0;
                IdeaPinCreationCameraSpeedControlView ideaPinCreationCameraSpeedControlView = (IdeaPinCreationCameraSpeedControlView) l0Var3.K0.getValue();
                if (ideaPinCreationCameraSpeedControlView.getVisibility() == 0) {
                    kg.a.u(ideaPinCreationCameraSpeedControlView, 0, 0L, 6);
                    return;
                } else {
                    kg.a.s(ideaPinCreationCameraSpeedControlView, 0L, null, 6);
                    return;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f119114a) {
            case 0:
                h();
                break;
            case 1:
                h();
                break;
            default:
                h();
                break;
        }
        return Unit.f80348a;
    }
}
