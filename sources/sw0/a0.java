package sw0;

import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a0 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f115403b;

    public /* synthetic */ a0(j0 j0Var, int i13) {
        this.f115402a = i13;
        this.f115403b = j0Var;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        int i13 = this.f115402a;
        j0 this$0 = this.f115403b;
        switch (i13) {
            case 0:
                int i14 = j0.H1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                int j13 = event.j();
                if (j13 == ct1.b.gallery_next_gestalt_button) {
                    uk2.f g93 = this$0.g9();
                    GestaltButton gestaltButton = this$0.f115484o1;
                    if (gestaltButton != null) {
                        g93.c(gestaltButton);
                        return;
                    } else {
                        Intrinsics.r("nextGestaltButton");
                        throw null;
                    }
                }
                if (j13 == ct1.b.enable_permission_gestalt_btn) {
                    this$0.s7().X(u0.STORY_PIN_REQUEST_PERMISSIONS_BUTTON);
                    FragmentActivity requireActivity = this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    if (!ny1.f.f92666f.b(requireActivity, this$0.f9(), false)) {
                        this$0.q9();
                        return;
                    } else {
                        this$0.f9();
                        ny1.w.b(requireActivity);
                        return;
                    }
                }
                if (j13 == ct1.b.remove_profile_cover_gestalt_button) {
                    pw0.d0 d0Var = this$0.f115493x1;
                    if (d0Var != null) {
                        ((qw0.j) d0Var).K3();
                        return;
                    }
                    return;
                }
                if (j13 == ct1.b.partial_photo_info_btn) {
                    this$0.getClass();
                    this$0.Y4(n0.a(new e0(this$0, 10)));
                    return;
                }
                return;
            case 1:
                int i15 = j0.H1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    uk2.f g94 = this$0.g9();
                    GestaltIconButton gestaltIconButton = this$0.f115480k1;
                    if (gestaltIconButton != null) {
                        g94.c(gestaltIconButton);
                        return;
                    } else {
                        Intrinsics.r("cameraButton");
                        throw null;
                    }
                }
                return;
            case 2:
                int i16 = j0.H1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    uk2.f g95 = this$0.g9();
                    GestaltIconButton gestaltIconButton2 = this$0.T0;
                    if (gestaltIconButton2 != null) {
                        g95.c(gestaltIconButton2);
                        return;
                    } else {
                        Intrinsics.r("helpButton");
                        throw null;
                    }
                }
                return;
            case 3:
                int i17 = j0.H1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    uk2.f g96 = this$0.g9();
                    GestaltIconButton gestaltIconButton3 = this$0.f115481l1;
                    if (gestaltIconButton3 != null) {
                        g96.c(gestaltIconButton3);
                        return;
                    } else {
                        Intrinsics.r("saveFromURLButton");
                        throw null;
                    }
                }
                return;
            case 4:
                int i18 = j0.H1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    FragmentActivity requireActivity2 = this$0.requireActivity();
                    if (this$0.m9()) {
                        this$0.D5();
                        return;
                    } else {
                        requireActivity2.finishAfterTransition();
                        return;
                    }
                }
                return;
            default:
                int i19 = j0.H1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    this$0.D5();
                    return;
                }
                return;
        }
    }
}
