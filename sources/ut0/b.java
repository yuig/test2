package ut0;

import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarButtonView;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123089i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CameraSidebarButtonView f123090j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CameraSidebarButtonView cameraSidebarButtonView, int i13) {
        super(0);
        this.f123089i = i13;
        this.f123090j = cameraSidebarButtonView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f123089i;
        CameraSidebarButtonView cameraSidebarButtonView = this.f123090j;
        switch (i13) {
            case 0:
                return (GestaltIcon) cameraSidebarButtonView.findViewById(aq1.d.camera_sidebar_button_icon);
            default:
                return (GestaltText) cameraSidebarButtonView.findViewById(aq1.d.button_title);
        }
    }
}
