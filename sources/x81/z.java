package x81;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.visual.tryon.view.RelatedLooksTitleView;
import com.pinterest.gestalt.text.GestaltText;
import h32.u0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134299i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f134300j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(f0 f0Var, int i13) {
        super(0);
        this.f134299i = i13;
        this.f134300j = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13;
        AttributeSet attributeSet = null;
        int i14 = this.f134299i;
        f0 f0Var = this.f134300j;
        switch (i14) {
            case 0:
                return f0Var.generateLoggingContext();
            case 1:
                return new ca2.e(true, null, 0, 0, null, 0, null, new bh.b(f0Var.s7(), new z(f0Var, 0)), false, false, 894);
            case 2:
                ny1.d dVar = ny1.d.f92664f;
                Context requireContext = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                if (dVar.a(requireContext)) {
                    Integer valueOf = Integer.valueOf(uc2.d.vto_photo_icon);
                    f0Var.f134222t1 = f0Var.f134223u1;
                    f0Var.f134223u1 = valueOf;
                    i13 = uc2.d.vto_camera_icon;
                } else {
                    Integer valueOf2 = Integer.valueOf(uc2.d.vto_camera_icon);
                    f0Var.f134222t1 = f0Var.f134223u1;
                    f0Var.f134223u1 = valueOf2;
                    i13 = uc2.d.vto_photo_icon;
                }
                return Integer.valueOf(i13);
            case 3:
                int i15 = f0.f134193k2;
                f0Var.f7().h(f0Var.f134208h2);
                Context requireContext2 = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                d91.h hVar = new d91.h(requireContext2, f0Var.s7(), f0Var.p7());
                yk1.j a13 = yk1.j.a();
                nx.f0 f0Var2 = f0Var.V0;
                if (f0Var2 == null) {
                    Intrinsics.r("pinalyticsFactory");
                    throw null;
                }
                n nVar = new n(f0Var2);
                uj2.q p73 = f0Var.p7();
                a11.d dVar2 = f0Var.T0;
                if (dVar2 == null) {
                    Intrinsics.r("clickThroughHelperFactory");
                    throw null;
                }
                a13.d(hVar, new f61.a(nVar, p73, dVar2.a(f0Var.s7())));
                f0Var.E1 = hVar;
                return hVar;
            case 4:
                int i16 = f0.f134193k2;
                Context requireContext3 = f0Var.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new RelatedLooksTitleView(6, requireContext3, attributeSet);
            case 5:
                m284invoke();
                return Unit.f80348a;
            case 6:
                m284invoke();
                return Unit.f80348a;
            case 7:
                m284invoke();
                return Unit.f80348a;
            case 8:
                f0Var.s7().X(u0.LENS_PERMISSION_SETTINGS_BUTTON);
                return Boolean.FALSE;
            case 9:
                m284invoke();
                return Unit.f80348a;
            case 10:
                m284invoke();
                return Unit.f80348a;
            case 11:
                m284invoke();
                return Unit.f80348a;
            default:
                m284invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m284invoke() {
        int i13 = this.f134299i;
        boolean z13 = true;
        boolean z14 = true;
        f0 f0Var = this.f134300j;
        switch (i13) {
            case 5:
                u uVar = f0Var.T1;
                if (uVar != null) {
                    ny1.d dVar = ny1.d.f92664f;
                    Context requireContext = f0Var.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    boolean a13 = dVar.a(requireContext);
                    o0 o0Var = (o0) uVar;
                    o0Var.f134261a = a13;
                    if (a13) {
                        o0Var.M3(new m0(o0Var, 1));
                        pp2.a.E0(o0Var.getPinalytics(), u0.LENS_PERMISSION_RESULT_AUTHORIZED, h32.g0.CAMERA_PERMISSIONS);
                        return;
                    }
                    pp2.a.E0(o0Var.getPinalytics(), u0.LENS_PERMISSION_RESULT_DENIED, h32.g0.CAMERA_PERMISSIONS);
                    o0Var.a4(i0.CAMERA_DENIED);
                    v vVar = (v) o0Var.getView();
                    String text = ((yk1.a) o0Var.A).f139224a.getString(uc2.h.try_on_enable_photos_access_text);
                    f0 f0Var2 = (f0) vVar;
                    f0Var2.getClass();
                    Intrinsics.checkNotNullParameter(text, "text");
                    GestaltText gestaltText = f0Var2.f134200d1;
                    if (gestaltText != null) {
                        pk.a0.p(gestaltText, text);
                        return;
                    } else {
                        Intrinsics.r("missingCameraPermissionText");
                        throw null;
                    }
                }
                return;
            case 6:
                u uVar2 = f0Var.T1;
                if (uVar2 != null) {
                    ny1.f fVar = ny1.f.f92666f;
                    Context requireContext2 = f0Var.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    boolean a14 = fVar.a(requireContext2);
                    boolean p93 = f0Var.p9();
                    o0 o0Var2 = (o0) uVar2;
                    o0Var2.f134263b = a14;
                    o0Var2.f134265c = p93;
                    if (!a14 && !p93) {
                        pp2.a.E0(o0Var2.getPinalytics(), u0.LENS_PERMISSION_RESULT_DENIED, h32.g0.PHOTO_LIBRARY_PERMISSIONS);
                        o0Var2.a4(i0.GALLERY_DENIED);
                        return;
                    }
                    o0Var2.M3(new m0(o0Var2, 2));
                    pp2.a.E0(o0Var2.getPinalytics(), u0.LENS_PERMISSION_RESULT_AUTHORIZED, h32.g0.PHOTO_LIBRARY_PERMISSIONS);
                    f30 f30Var = o0Var2.f134283s;
                    if (f30Var != null) {
                        o0Var2.I3(f30Var, null);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                u uVar3 = f0Var.T1;
                if (uVar3 != null) {
                    ny1.f fVar2 = ny1.f.f92666f;
                    Context requireContext3 = f0Var.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                    ((o0) uVar3).Q3(fVar2.a(requireContext3), f0Var.p9());
                    return;
                }
                return;
            case 8:
            default:
                u uVar4 = f0Var.T1;
                if (uVar4 != null) {
                    ((o0) uVar4).U3();
                    return;
                }
                return;
            case 9:
                u uVar5 = f0Var.T1;
                if (uVar5 != null) {
                    o0 o0Var3 = (o0) uVar5;
                    Uri imageUri = o0Var3.z3();
                    if (imageUri == null) {
                        imageUri = o0Var3.H;
                    }
                    if (imageUri != null) {
                        v vVar2 = (v) o0Var3.getView();
                        String virtualTryOnPinIds = o0Var3.f134287w == i0.TRY_ON_CAPTURED_PHOTO ? CollectionsKt.Z(o0Var3.L, ",", null, null, 0, null, null, 62) : "";
                        f0 f0Var3 = (f0) vVar2;
                        f0Var3.getClass();
                        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
                        Intrinsics.checkNotNullParameter(virtualTryOnPinIds, "virtualTryOnPinIds");
                        Context context = f0Var3.getContext();
                        if (context != null) {
                            Intent b13 = f0Var3.a7().b(context, lu1.a.PIN_IT_ACTIVITY);
                            b13.putExtra("com.pinterest.EXTRA_PIN_CREATE_TYPE", "virtual_try_on_camera");
                            b13.putExtra("com.pinterest.EXTRA_URI", imageUri);
                            b13.putExtra("com.pinterest.EXTRA_VIRTUAL_TRY_ON_TAGGED_IDS", virtualTryOnPinIds);
                            FragmentActivity E4 = f0Var3.E4();
                            if (E4 != null) {
                                E4.startActivityForResult(b13, RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                f0Var.s9(true);
                return;
            case 11:
                ny1.w m93 = f0Var.m9();
                FragmentActivity requireActivity = f0Var.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                m93.c(requireActivity, ny1.f.f92666f, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : new e0(z13, f0Var, z14 ? 1 : 0), (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : new z(f0Var, 6), (r23 & 1024) != 0 ? ny1.t.f92703n : null);
                return;
        }
    }
}
