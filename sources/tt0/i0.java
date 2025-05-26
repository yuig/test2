package tt0;

import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarControlsView;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f119124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f119125b;

    public i0(z zVar, l0 l0Var) {
        this.f119124a = zVar;
        this.f119125b = l0Var;
    }

    public final void a(boolean z13) {
        rm1.q qVar;
        CameraSidebarControlsView cameraSidebarControlsView = this.f119124a.f119237b;
        if (z13) {
            cameraSidebarControlsView.c().announceForAccessibility(bs1.c.f2(cameraSidebarControlsView, aq1.h.idea_pin_flash_on));
            qVar = rm1.q.FLASH;
        } else {
            cameraSidebarControlsView.c().announceForAccessibility(bs1.c.f2(cameraSidebarControlsView, aq1.h.idea_pin_flash_off));
            qVar = rm1.q.FLASH_SLASH;
        }
        cameraSidebarControlsView.c().X(aq1.h.idea_pin_camera_flash_title, aq1.h.idea_pin_camera_flash_content_description, qVar);
        z zVar = this.f119125b.J0;
        if (zVar == null) {
            Intrinsics.r("cameraController");
            throw null;
        }
        h32.u0 u0Var = h32.u0.IDEA_PIN_CAMERA_FLASH_BUTTON;
        HashMap hashMap = new HashMap();
        hashMap.put("is_flash_on", String.valueOf(z13));
        Unit unit = Unit.f80348a;
        zVar.f119238c.Z(u0Var, hashMap);
    }
}
