package u81;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import h32.u0;
import is1.j0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.o4;
import lh0.z3;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121050i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f121051j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(r rVar, int i13) {
        super(0);
        this.f121050i = i13;
        this.f121051j = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f121050i;
        r rVar = this.f121051j;
        switch (i13) {
            case 7:
                int i14 = r.f121059l2;
                return Boolean.valueOf(rVar.x9(true));
            case 8:
            case 9:
            case 11:
            default:
                o4 o4Var = rVar.S0;
                if (o4Var == null) {
                    Intrinsics.r("visualSearchExperiments");
                    throw null;
                }
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) o4Var.f83453a;
                return Boolean.valueOf(g1Var.o("android_lens_unified_feed", "enabled", z3Var) || g1Var.l("android_lens_unified_feed"));
            case 10:
                rVar.s7().X(u0.LENS_PERMISSION_SETTINGS_BUTTON);
                return Boolean.FALSE;
            case 12:
                o4 o4Var2 = rVar.S0;
                if (o4Var2 == null) {
                    Intrinsics.r("visualSearchExperiments");
                    throw null;
                }
                z3 z3Var2 = a4.f83298b;
                g1 g1Var2 = (g1) o4Var2.f83453a;
                return Boolean.valueOf(g1Var2.o("android_lens_camera_2", "enabled", z3Var2) || g1Var2.l("android_lens_camera_2"));
            case 13:
                b60.b bVar = rVar.f121067e1;
                if (bVar == null) {
                    Intrinsics.r("userManager");
                    throw null;
                }
                wy0 f13 = ((b60.d) bVar).f();
                if (f13 != null && CollectionsKt.L(j0.f73613a, f13.G2()) && !((Boolean) rVar.f121065c2.getValue()).booleanValue()) {
                    r5 = true;
                }
                return Boolean.valueOf(r5);
            case 14:
                int i15 = r.f121059l2;
                if (rVar.m9() != m81.p.ROOM_REPAINT) {
                    b60.b bVar2 = rVar.f121067e1;
                    if (bVar2 == null) {
                        Intrinsics.r("userManager");
                        throw null;
                    }
                    if (d7.b.i0(((b60.d) bVar2).f())) {
                        r5 = true;
                    }
                }
                return Boolean.valueOf(r5);
            case 15:
                o4 o4Var3 = rVar.S0;
                if (o4Var3 == null) {
                    Intrinsics.r("visualSearchExperiments");
                    throw null;
                }
                z3 z3Var3 = a4.f83297a;
                g1 g1Var3 = (g1) o4Var3.f83453a;
                return Boolean.valueOf(g1Var3.o("android_new_lens_permissions", "enabled", z3Var3) || g1Var3.l("android_new_lens_permissions"));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f121050i;
        r rVar = this.f121051j;
        switch (i13) {
            case 1:
                break;
            case 3:
                if (com.bumptech.glide.d.Z(rVar, "extra_room_repaint_source", "").length() <= 0) {
                    break;
                } else {
                    break;
                }
            case 4:
                m269invoke();
                break;
            case 5:
                m269invoke();
                break;
            case 6:
                m269invoke();
                break;
            case 8:
                m269invoke();
                break;
            case 9:
                m269invoke();
                break;
            case 11:
                m269invoke();
                break;
        }
        return invoke();
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m269invoke() {
        s81.p pVar;
        Uri imageUri;
        int i13 = this.f121050i;
        r rVar = this.f121051j;
        switch (i13) {
            case 4:
                GestaltButton gestaltButton = rVar.f121087r1;
                if (gestaltButton != null) {
                    gestaltButton.d(c.f121004m);
                }
                rVar.w9();
                break;
            case 5:
                int i14 = r.f121059l2;
                rVar.w9();
                break;
            case 6:
                int i15 = r.f121059l2;
                rVar.w9();
                break;
            case 7:
            default:
                m81.r rVar2 = rVar.X1;
                if (rVar2 != null && (imageUri = (pVar = (s81.p) rVar2).F3()) != null) {
                    r rVar3 = (r) ((m81.q) pVar.getView());
                    rVar3.getClass();
                    Intrinsics.checkNotNullParameter(imageUri, "imageUri");
                    Context context = rVar3.getContext();
                    if (context != null) {
                        Intent b13 = rVar3.a7().b(context, lu1.a.PIN_IT_ACTIVITY);
                        b13.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", "lens_camera");
                        b13.putExtra("com.pinterest.EXTRA_URI", imageUri);
                        FragmentActivity E4 = rVar3.E4();
                        if (E4 != null) {
                            E4.startActivityForResult(b13, RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION);
                            break;
                        }
                    }
                }
                break;
            case 8:
                m81.r rVar4 = rVar.X1;
                if (rVar4 != null) {
                    ny1.f fVar = ny1.f.f92666f;
                    Context requireContext = rVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    ((s81.p) rVar4).S3(fVar.a(requireContext), rVar.v9());
                    break;
                }
                break;
            case 9:
                m81.r rVar5 = rVar.X1;
                if (rVar5 != null) {
                    ny1.f fVar2 = ny1.f.f92666f;
                    Context requireContext2 = rVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    ((s81.p) rVar5).V3(fVar2.a(requireContext2), rVar.v9());
                    break;
                }
                break;
        }
    }
}
