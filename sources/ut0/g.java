package ut0;

import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraSpeedControlView;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraTimerDurationsView;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarButtonView;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarControlsView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123097i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CameraSidebarControlsView f123098j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CameraSidebarControlsView cameraSidebarControlsView, int i13) {
        super(0);
        this.f123097i = i13;
        this.f123098j = cameraSidebarControlsView;
    }

    public final CameraSidebarButtonView b() {
        int i13 = this.f123097i;
        CameraSidebarControlsView cameraSidebarControlsView = this.f123098j;
        switch (i13) {
            case 1:
                return (CameraSidebarButtonView) cameraSidebarControlsView.findViewById(aq1.d.delay_timer_control_button);
            case 2:
                return (CameraSidebarButtonView) cameraSidebarControlsView.findViewById(aq1.d.flash_toggle_button);
            case 3:
                return (CameraSidebarButtonView) cameraSidebarControlsView.findViewById(aq1.d.lens_toggle_button);
            default:
                return (CameraSidebarButtonView) cameraSidebarControlsView.findViewById(aq1.d.speed_control_button);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f123097i;
        CameraSidebarControlsView cameraSidebarControlsView = this.f123098j;
        switch (i13) {
            case 0:
                return (IdeaPinCreationCameraTimerDurationsView) cameraSidebarControlsView.findViewById(aq1.d.delay_timer_controls);
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return (IdeaPinCreationCameraSpeedControlView) cameraSidebarControlsView.findViewById(aq1.d.speed_controls);
            default:
                return b();
        }
    }
}
