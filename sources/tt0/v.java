package tt0;

import androidx.media3.ui.LegacyPlayerView;
import h32.a4;
import h32.d4;
import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119223a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Object obj, int i13) {
        super(1, obj, z.class, "logTapGhostButton", "logTapGhostButton(Z)V", 0);
        this.f119223a = i13;
        if (i13 == 1) {
            super(1, obj, z.class, "logTapStopRecording", "logTapStopRecording(Z)V", 0);
            return;
        }
        if (i13 == 2) {
            super(1, obj, z.class, "logTapOnLensButton", "logTapOnLensButton(Z)V", 0);
            return;
        }
        if (i13 == 3) {
            super(1, obj, l0.class, "toggleGhostMode", "toggleGhostMode(Lkotlin/jvm/functions/Function1;)V", 0);
            return;
        }
        if (i13 == 4) {
            super(1, obj, l0.class, "stopRecording", "stopRecording(Lkotlin/jvm/functions/Function1;)V", 0);
        } else if (i13 != 5) {
        } else {
            super(1, obj, l0.class, "toggleLens", "toggleLens(Lkotlin/jvm/functions/Function1;)V", 0);
        }
    }

    public final void h(Function1 p03) {
        switch (this.f119223a) {
            case 3:
                Intrinsics.checkNotNullParameter(p03, "p0");
                l0 l0Var = (l0) this.receiver;
                rt0.b bVar = l0Var.f119180p0;
                bVar.w(!bVar.f109950b);
                if (bVar.f109950b) {
                    LegacyPlayerView legacyPlayerView = l0Var.B0;
                    if (legacyPlayerView == null) {
                        Intrinsics.r("cameraPlaybackView");
                        throw null;
                    }
                    legacyPlayerView.setVisibility(0);
                    legacyPlayerView.setAlpha(0.5f);
                    legacyPlayerView.setScaleX(bVar.l() ? -1.0f : 1.0f);
                    l0Var.f119181q0.g();
                    z zVar = l0Var.J0;
                    if (zVar == null) {
                        Intrinsics.r("cameraController");
                        throw null;
                    }
                    zVar.t();
                } else {
                    l0Var.w8();
                }
                p03.invoke(Boolean.valueOf(bVar.f109950b));
                return;
            case 4:
                Intrinsics.checkNotNullParameter(p03, "p0");
                l0 l0Var2 = (l0) this.receiver;
                int i13 = l0.Z0;
                l0Var2.v8(p03);
                return;
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                fp0.d dVar = ((l0) this.receiver).f119189y0;
                if (dVar != null) {
                    dVar.g(p03);
                    return;
                } else {
                    Intrinsics.r("cameraView");
                    throw null;
                }
        }
    }

    public final void i(boolean z13) {
        switch (this.f119223a) {
            case 0:
                z zVar = (z) this.receiver;
                zVar.getClass();
                z.s(zVar, z13 ? h32.u0.STORY_PIN_CAMERA_ENABLE_GHOST_BUTTON : h32.u0.STORY_PIN_CAMERA_DISABLE_GHOST_BUTTON);
                break;
            case 1:
                z zVar2 = (z) this.receiver;
                zVar2.getClass();
                h32.u0 u0Var = h32.u0.STORY_PIN_CAMERA_RECORD_STOP_BUTTON;
                HashMap hashMap = new HashMap();
                hashMap.put("story_pin_camera_back_lens_on", String.valueOf(!z13));
                Unit unit = Unit.f80348a;
                f1 f1Var = f1.TAP;
                h32.i0 i0Var = new h32.i0(d4.STORY_PIN_CAMERA, a4.STORY_PIN_CREATE, null, null, null, u0Var);
                nx.d0 d0Var = zVar2.f119238c;
                Intrinsics.f(d0Var);
                d0Var.U(i0Var, f1Var, null, null, hashMap, false);
                break;
            default:
                z zVar3 = (z) this.receiver;
                zVar3.getClass();
                h32.u0 u0Var2 = h32.u0.STORY_PIN_CAMERA_LENS_BUTTON;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("story_pin_camera_back_lens_on", z13 ? "false" : "true");
                Unit unit2 = Unit.f80348a;
                zVar3.f119238c.Z(u0Var2, hashMap2);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f119223a) {
            case 0:
                i(((Boolean) obj).booleanValue());
                break;
            case 1:
                i(((Boolean) obj).booleanValue());
                break;
            case 2:
                i(((Boolean) obj).booleanValue());
                break;
            case 3:
                h((Function1) obj);
                break;
            case 4:
                h((Function1) obj);
                break;
            default:
                h((Function1) obj);
                break;
        }
        return Unit.f80348a;
    }
}
