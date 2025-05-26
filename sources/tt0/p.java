package tt0;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraBottomBarControlsView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119196i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinCreationCameraBottomBarControlsView f119197j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(IdeaPinCreationCameraBottomBarControlsView ideaPinCreationCameraBottomBarControlsView, int i13) {
        super(0);
        this.f119196i = i13;
        this.f119197j = ideaPinCreationCameraBottomBarControlsView;
    }

    public final ImageView b() {
        int i13 = this.f119196i;
        IdeaPinCreationCameraBottomBarControlsView ideaPinCreationCameraBottomBarControlsView = this.f119197j;
        switch (i13) {
            case 1:
                return (ImageView) ideaPinCreationCameraBottomBarControlsView.findViewById(aq1.d.delete_button);
            case 2:
                return (ImageView) ideaPinCreationCameraBottomBarControlsView.findViewById(aq1.d.ghost_button);
            default:
                return (ImageView) ideaPinCreationCameraBottomBarControlsView.findViewById(aq1.d.record_button_state);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f119196i;
        IdeaPinCreationCameraBottomBarControlsView ideaPinCreationCameraBottomBarControlsView = this.f119197j;
        switch (i13) {
            case 0:
                return (GestaltText) ideaPinCreationCameraBottomBarControlsView.findViewById(aq1.d.cancel_countdown_button);
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return (FrameLayout) ideaPinCreationCameraBottomBarControlsView.findViewById(aq1.d.record_button);
            case 4:
                return b();
            default:
                return ideaPinCreationCameraBottomBarControlsView.findViewById(aq1.d.record_button_ring);
        }
    }
}
