package tt0;

import android.content.Context;
import com.pinterest.api.model.bo0;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraSpeedControlView;
import com.pinterest.feature.ideaPinCreation.camera.view.sidebar.CameraSidebarControlsView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq0.f1;
import so.oa;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119105i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f119106j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(l0 l0Var, int i13) {
        super(1);
        this.f119105i = i13;
        this.f119106j = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f119105i;
        int i14 = 0;
        int i15 = 2;
        int i16 = 1;
        l0 l0Var = this.f119106j;
        switch (i13) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                l0Var.w8();
                rt0.b bVar = l0Var.f119180p0;
                bVar.z(true);
                z zVar = l0Var.J0;
                if (zVar == null) {
                    Intrinsics.r("cameraController");
                    throw null;
                }
                zVar.w(s.RECORDING_STARTED);
                z zVar2 = l0Var.J0;
                if (zVar2 == null) {
                    Intrinsics.r("cameraController");
                    throw null;
                }
                String announcement = l0Var.requireContext().getString(aq1.h.idea_pin_recording_started);
                Intrinsics.checkNotNullExpressionValue(announcement, "getString(...)");
                Intrinsics.checkNotNullParameter(announcement, "announcement");
                zVar2.o().announceForAccessibility(announcement);
                fp0.d dVar = l0Var.f119189y0;
                if (dVar == null) {
                    Intrinsics.r("cameraView");
                    throw null;
                }
                zVar.g(dVar.k());
                CameraSidebarControlsView cameraSidebarControlsView = l0Var.I0;
                if (cameraSidebarControlsView == null) {
                    Intrinsics.r("cameraSidebarControls");
                    throw null;
                }
                cameraSidebarControlsView.g();
                Float f13 = (Float) ((IdeaPinCreationCameraSpeedControlView) l0Var.K0.getValue()).f45896b;
                bVar.f109957i.add(new bo0(null, null, 0L, 0L, null, null, f13 != null ? f13.floatValue() : 1.0f, booleanValue, 49, null));
                bVar.s(1);
                return Unit.f80348a;
            case 1:
                l0Var.f119180p0.A(((Number) obj).longValue(), null);
                return Unit.f80348a;
            case 2:
                rt0.b model = (rt0.b) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                GestaltIconButton gestaltIconButton = l0Var.f119184t0;
                if (gestaltIconButton == null) {
                    Intrinsics.r("backButton");
                    throw null;
                }
                gestaltIconButton.t(new f0(model, i14));
                GestaltButton gestaltButton = l0Var.f119186v0;
                if (gestaltButton == null) {
                    Intrinsics.r("nextButton");
                    throw null;
                }
                gestaltButton.d(new f0(model, i16));
                GestaltIconButton gestaltIconButton2 = l0Var.f119185u0;
                if (gestaltIconButton2 == null) {
                    Intrinsics.r("helpButton");
                    throw null;
                }
                gestaltIconButton2.t(new f0(model, i15));
                l0Var.z8();
                rt0.b bVar2 = l0Var.f119180p0;
                if (!bVar2.f109952d) {
                    if (bVar2.f()) {
                        z zVar3 = l0Var.J0;
                        if (zVar3 == null) {
                            Intrinsics.r("cameraController");
                            throw null;
                        }
                        fp0.d dVar2 = l0Var.f119189y0;
                        if (dVar2 == null) {
                            Intrinsics.r("cameraView");
                            throw null;
                        }
                        zVar3.g(dVar2.k());
                    } else {
                        z zVar4 = l0Var.J0;
                        if (zVar4 == null) {
                            Intrinsics.r("cameraController");
                            throw null;
                        }
                        zVar4.e(false);
                    }
                }
                return Unit.f80348a;
            case 3:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                int i17 = l0.Z0;
                l0Var.u8(navigation);
                return Unit.f80348a;
            case 4:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i18 = l0.Z0;
                return om1.c.e(it, null, null, null, pw0.j.a((pw0.x) l0Var.S0.getValue()) ? fm1.c.GONE : fm1.c.VISIBLE, null, false, 0, 1015);
            case 5:
                int i19 = l0.Z0;
                int i23 = c0.f119091a[((pw0.x) l0Var.S0.getValue()).ordinal()];
                rt0.b bVar3 = l0Var.f119180p0;
                ag1.i iVar = i23 != 1 ? i23 != 2 ? null : bVar3.f109957i.size() > 1 ? ag1.i.MULTI_ASSET : bVar3.f109955g ? ag1.i.IMAGE : ag1.i.VIDEO : ag1.i.MULTI_ASSET;
                ag1.h hVar = l0Var.f119175k0;
                if (hVar == null) {
                    Intrinsics.r("ideaPinSessionDataManager");
                    throw null;
                }
                hVar.d(new f1(iVar, 27), false);
                nx.d0 s73 = l0Var.s7();
                h32.u0 u0Var = h32.u0.NEXT_BUTTON;
                HashMap o13 = ep.b.o("is_story_pin", "true");
                if (iVar != null) {
                    o13.put("idea_pin_media_type", iVar.getValue());
                }
                Unit unit = Unit.f80348a;
                s73.Z(u0Var, o13);
                if (((pw0.x) l0Var.S0.getValue()) == pw0.x.IdeaPinAddMediaClip) {
                    int size = bVar3.f109957i.size();
                    Navigation navigation2 = l0Var.I;
                    if (size > (navigation2 != null ? navigation2.J1("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS") : -1)) {
                        Context context = kb0.a.f79058b;
                        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().k(dt1.d.pin_assets_max);
                        return Unit.f80348a;
                    }
                }
                l0Var.p8(new d0(l0Var, 5));
                return Unit.f80348a;
            case 6:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 6:
                        l0Var.b6().q(th3, "IdeaPinCreationCameraFragment: failed to save story pin to repository", tb0.p.IDEA_PINS_CREATION);
                        break;
                    default:
                        l0.Z7(l0Var);
                        break;
                }
                return Unit.f80348a;
            case 7:
                rt0.a aVar = (rt0.a) obj;
                int i24 = aVar != null ? j0.f119137a[aVar.ordinal()] : -1;
                if (i24 == 1) {
                    int i25 = l0.Z0;
                    l0Var.g8().d(h32.u0.IDEA_PIN_PHOTO_TAKING_CAMERA_VIDEO_BUTTON);
                    l0Var.f119180p0.x(false);
                    z zVar5 = l0Var.J0;
                    if (zVar5 == null) {
                        Intrinsics.r("cameraController");
                        throw null;
                    }
                    zVar5.w(s.RECORDING_STOPPING);
                    z zVar6 = l0Var.J0;
                    if (zVar6 == null) {
                        Intrinsics.r("cameraController");
                        throw null;
                    }
                    zVar6.w(s.RECORDING_STOPPED);
                    z zVar7 = l0Var.J0;
                    if (zVar7 == null) {
                        Intrinsics.r("cameraController");
                        throw null;
                    }
                    zVar7.y();
                    fp0.d dVar3 = l0Var.f119189y0;
                    if (dVar3 == null) {
                        Intrinsics.r("cameraView");
                        throw null;
                    }
                    dVar3.i(false);
                } else if (i24 == 2) {
                    int i26 = l0.Z0;
                    l0Var.g8().d(h32.u0.IDEA_PIN_PHOTO_TAKING_CAMERA_PHOTO_BUTTON);
                    l0Var.f119180p0.x(true);
                    z zVar8 = l0Var.J0;
                    if (zVar8 == null) {
                        Intrinsics.r("cameraController");
                        throw null;
                    }
                    zVar8.w(s.PHOTO);
                    z zVar9 = l0Var.J0;
                    if (zVar9 == null) {
                        Intrinsics.r("cameraController");
                        throw null;
                    }
                    zVar9.y();
                    fp0.d dVar4 = l0Var.f119189y0;
                    if (dVar4 == null) {
                        Intrinsics.r("cameraView");
                        throw null;
                    }
                    dVar4.i(true);
                }
                int i27 = l0.Z0;
                l0Var.z8();
                return Unit.f80348a;
            case 8:
                l0.Z7(l0Var);
                return Unit.f80348a;
            default:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 6:
                        l0Var.b6().q(th4, "IdeaPinCreationCameraFragment: failed to save story pin to repository", tb0.p.IDEA_PINS_CREATION);
                        break;
                    default:
                        l0.Z7(l0Var);
                        break;
                }
                return Unit.f80348a;
        }
    }
}
