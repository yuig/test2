package et1;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Bundle;
import android.view.Surface;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.pinterest.api.model.f30;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.partnerAnalytics.feature.analytics.toppins.overview.PinsListEmptyView;
import com.pinterest.shuffles.composer.ui.effects.PointPicker;
import com.pinterest.shuffles.scene.composer.x0;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.f1;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.m4;
import lh0.z3;
import ni1.v1;
import qa2.k1;
import r72.a2;
import r72.u1;
import r72.y0;
import so.ba;
import t3.s1;
import v.z1;

/* loaded from: classes4.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60084i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f60085j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f60086k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i13, Object obj, Object obj2) {
        super(0);
        this.f60084i = i13;
        this.f60085j = obj;
        this.f60086k = obj2;
    }

    public final EGLSurface b() {
        int i13 = this.f60084i;
        Object obj = this.f60086k;
        Object obj2 = this.f60085j;
        switch (i13) {
            case 23:
                return EGL14.eglCreatePbufferSurface(xd2.b.f134641a, (EGLConfig) obj2, (int[]) obj, 0);
            default:
                return EGL14.eglCreateWindowSurface(xd2.b.f134641a, (EGLConfig) obj2, (Surface) obj, new int[]{12344}, 0);
        }
    }

    public final String e() {
        int i13 = this.f60084i;
        Object obj = this.f60086k;
        Object obj2 = this.f60085j;
        switch (i13) {
            case 12:
                return s1.c("mapShuffleItems(): failed to map item.id=", ((f72.g0) obj2).f61252a, " from shuffle.id=", (String) obj);
            case 13:
                return s1.c("Failed to load bitmap for item id: ", a2.a(((u1) obj2).f106669a), ", image url: ", URLDecoder.decode(((y0) obj).f106716a, "UTF-8"));
            default:
                PinterestVideoView pinterestVideoView = (PinterestVideoView) obj2;
                ac2.f fVar = pinterestVideoView.V0;
                b60.a m03 = pinterestVideoView.m0();
                fVar.getClass();
                return ac2.f.a((String) obj, m03);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f60084i;
        Object obj = this.f60086k;
        Object obj2 = this.f60085j;
        switch (i13) {
            case 22:
                EGLDisplay eGLDisplay = xd2.b.f134641a;
                EGLSurface eGLSurface = (EGLSurface) ((g01.a) obj2).f63225b;
                return Boolean.valueOf(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) ((mc2.k) obj).f86945b));
            default:
                int[] iArr = (int[]) obj;
                return Boolean.valueOf(EGL14.eglInitialize((EGLDisplay) obj2, iArr, 0, iArr, 1));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f60084i;
        Object obj = this.f60086k;
        Object obj2 = this.f60085j;
        switch (i13) {
            case 0:
                m138invoke();
                return Unit.f80348a;
            case 1:
                m138invoke();
                return Unit.f80348a;
            case 2:
                m138invoke();
                return Unit.f80348a;
            case 3:
                m138invoke();
                return Unit.f80348a;
            case 4:
                return ((so.u0) ((yx.b) obj2)).a(zx.a.FILTER_PIN_STATS, yb2.a.b(((b60.d) ((b60.b) obj)).f()));
            case 5:
                nx.d0 d0Var = ((PinsListEmptyView) obj2).f50123c;
                if (d0Var == null) {
                    return null;
                }
                kg.t.M0(d0Var, (Context) obj, ou1.e.ANALYTICS, null, null, 0, 56);
                return Unit.f80348a;
            case 6:
                m138invoke();
                return Unit.f80348a;
            case 7:
                m138invoke();
                return Unit.f80348a;
            case 8:
                s52.n nVar = (s52.n) obj2;
                Context requireContext = nVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                nx.d0 s73 = nVar.s7();
                androidx.lifecycle.z viewLifecycleOwner = nVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return new v42.k(requireContext, s73, bf.b.S(viewLifecycleOwner), m60.f0.i0(((qa2.n) obj).f103320a), null, false, true, false, false, false, null, 3632);
            case 9:
                m138invoke();
                return Unit.f80348a;
            case 10:
                m138invoke();
                return Unit.f80348a;
            case 11:
                final int i14 = (PointPicker.f51867p >> 24) & 255;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                final PointPicker pointPicker = (PointPicker) obj;
                ofFloat.setDuration(((Context) obj2).getResources().getInteger(R.integer.config_shortAnimTime));
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m62.j1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator it) {
                        PointPicker this$0 = PointPicker.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        Object animatedValue = it.getAnimatedValue();
                        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue = ((Float) animatedValue).floatValue();
                        this$0.f51872e.setAlpha((int) (i14 * floatValue));
                        this$0.f51878k = (floatValue * 0.2f) + 1.0f;
                        this$0.invalidate();
                    }
                });
                return ofFloat;
            case 12:
                return e();
            case 13:
                return e();
            case 14:
                m138invoke();
                return Unit.f80348a;
            case 15:
                k1 k1Var = (k1) obj2;
                ni1.d0 d0Var2 = k1Var.f103286h;
                if (d0Var2 != null) {
                    nx.d0 d0Var3 = (nx.d0) obj;
                    int i15 = 4;
                    return ((ba) d0Var2).a(k1Var.f103282d, new sp.e(d0Var3, i15), new sp.f(d0Var3, i15));
                }
                Intrinsics.r("vmStateConverterFactory");
                throw null;
            case 16:
                Context context = ((LegoPinGridCell) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new va2.d(context, (hs1.q) obj);
            case 17:
                Context context2 = ((LegoPinGridCell) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ua2.b0 b0Var = (ua2.b0) obj;
                return new va2.j(context2, b0Var.f121423j, b0Var.f121424k, b0Var.f121425l, b0Var.f121426m, b0Var.f121427n, b0Var.f121429p, b0Var.f121430q, b0Var.f121431r);
            case 18:
            case 26:
            default:
                m138invoke();
                return Unit.f80348a;
            case 19:
                m138invoke();
                return Unit.f80348a;
            case 20:
                return e();
            case 21:
                m138invoke();
                return Unit.f80348a;
            case 22:
                return invoke();
            case 23:
                return b();
            case 24:
                return b();
            case 25:
                return invoke();
            case 27:
                m138invoke();
                return Unit.f80348a;
            case 28:
                m138invoke();
                return Unit.f80348a;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m138invoke() {
        int i13 = this.f60084i;
        Object obj = this.f60086k;
        Object obj2 = this.f60085j;
        switch (i13) {
            case 0:
                ((u0) obj2).f60106d.remove((mt1.a) obj);
                break;
            case 1:
                ((p0) obj2).f60069b.remove((mt1.d) obj);
                break;
            case 2:
                ((u0) obj2).f60105c.remove((mt1.d) obj);
                break;
            case 3:
                up.c cVar = (up.c) obj2;
                String interestId = ((Bundle) cVar.f122937e).getString("EXTRA_USER_INTEREST_ID");
                if (interestId != null) {
                    no1.d dVar = (no1.d) cVar.f122938f;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(interestId, "interestId");
                    fk2.g i14 = com.bumptech.glide.d.u0(dVar.f91666a.a(new g40.i(interestId))).i();
                    Intrinsics.checkNotNullExpressionValue(i14, "ignoreElement(...)");
                    fk2.c l13 = i14.l(tk2.e.f118017c);
                    Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
                    nl.b.r(l13, null, null, 3);
                }
                Context context = ((PinterestToastContainer) obj).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                super/*we0.a*/.c(context);
                break;
            case 6:
                ((ny1.w) obj2).getClass();
                ny1.w.b((Activity) obj);
                break;
            case 7:
                uz1.u uVar = ((uz1.z) obj2).f123333f;
                Map pushData = (Map) obj;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(pushData, "pushData");
                uVar.f123314a.a(f1.PUSH_NOTIFICATION_RECEIVED_BY, vb0.b.f125448a.a(), false, false);
                String n13 = ((b20.c) uVar.f123316c).n();
                Pair[] pairArr = (Pair[]) b1.t(pushData).toArray(new Pair[0]);
                uVar.f123315b.q("received", n13, e0.t.j((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
                break;
            case 9:
                int i15 = s52.n.f111189g1;
                kh2.j.x2(((s52.n) obj2).n9(), new r52.n((r52.a) obj));
                break;
            case 10:
                com.pinterest.shuffles.scene.composer.y yVar = (com.pinterest.shuffles.scene.composer.y) obj2;
                gw1.i block = new gw1.i(23, yVar, (l62.a) obj);
                yVar.getClass();
                Intrinsics.checkNotNullParameter(block, "block");
                Iterator it = yVar.f52176h.getF52894a().f79314f.iterator();
                while (it.hasNext()) {
                    block.invoke(it.next());
                }
                break;
            case 14:
                int i16 = x0.f52169h;
                ((x0) obj2).k((ke2.d) obj);
                break;
            case 19:
                ab2.n nVar = (ab2.n) obj2;
                m4 m4Var = nVar.f1772f;
                m4Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) m4Var.f83425a;
                if (g1Var.o("android_ads_mrc_btr_1px1s", "enabled", z3Var) || g1Var.l("android_ads_mrc_btr_1px1s")) {
                    nVar.f1769c.a(new v1(new ek1.e0(ro1.c.f108967f.i((f30) obj, nVar.f1778l, nVar.f1775i))));
                    break;
                }
                break;
            case 21:
                int i17 = ad2.h.H0;
                ad2.k kVar = (ad2.k) obj;
                ((ad2.u) ((ad2.h) obj2).F0.getValue()).f2120f.e().a(new ad2.c(kVar.f2103a, kVar.f2104b));
                break;
            case 27:
                id2.c cVar2 = (id2.c) obj2;
                GLES20.glUniform4f(((androidx.appcompat.widget.a) obj).f16502a, cVar2.f72190a, cVar2.f72191b, cVar2.f72192c, cVar2.f72193d);
                break;
            case 28:
                GLES20.glUniform1i(((androidx.appcompat.widget.a) obj2).f16502a, ((ae2.f) obj).f15064c);
                break;
            default:
                int i18 = ((androidx.appcompat.widget.a) obj2).f16502a;
                z1 z1Var = (z1) obj;
                if (!z1Var.f123756a) {
                    Matrix.setIdentityM((float[]) z1Var.f123758c, 0);
                    Iterator it2 = CollectionsKt.q0((List) z1Var.f123757b).iterator();
                    while (it2.hasNext()) {
                        ((Function1) it2.next()).invoke((float[]) z1Var.f123758c);
                    }
                    z1Var.f123756a = true;
                }
                GLES20.glUniformMatrix4fv(i18, 1, false, (float[]) z1Var.f123758c, 0);
                break;
        }
    }
}
