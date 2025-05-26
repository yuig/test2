package v;

import android.app.Activity;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c1 {

    /* renamed from: a */
    public int f123384a;

    /* renamed from: b */
    public boolean f123385b;

    /* renamed from: c */
    public boolean f123386c;

    /* renamed from: d */
    public final Object f123387d;

    /* renamed from: e */
    public Object f123388e;

    /* renamed from: f */
    public final Object f123389f;

    /* renamed from: g */
    public final Object f123390g;

    /* renamed from: h */
    public Object f123391h;

    public c1(View fragmentView, FragmentActivity activity, b11.u isIdeaAd, boolean z13, int i13) {
        b11.i shouldShowTabletLandscapeCloseup = b11.i.f21000j;
        Intrinsics.checkNotNullParameter(fragmentView, "fragmentView");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(isIdeaAd, "isIdeaAd");
        Intrinsics.checkNotNullParameter(shouldShowTabletLandscapeCloseup, "shouldShowTabletLandscapeCloseup");
        this.f123387d = activity;
        this.f123388e = isIdeaAd;
        this.f123389f = shouldShowTabletLandscapeCloseup;
        this.f123385b = z13;
        this.f123384a = i13;
        View findViewById = fragmentView.findViewById(r80.c.closeup_back_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f123390g = (GestaltIconButton) findViewById;
        View findViewById2 = fragmentView.findViewById(n80.c.back_button_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f123391h = findViewById2;
    }

    public static boolean h(TotalCaptureResult totalCaptureResult, boolean z13) {
        if (totalCaptureResult == null) {
            return false;
        }
        sp2.i iVar = new sp2.i(totalCaptureResult);
        Set set = androidx.camera.core.impl.x0.f16990a;
        boolean z14 = iVar.N() == androidx.camera.core.impl.u.OFF || iVar.N() == androidx.camera.core.impl.u.UNKNOWN || androidx.camera.core.impl.x0.f16990a.contains(iVar.t());
        boolean z15 = iVar.M() == androidx.camera.core.impl.s.OFF;
        boolean z16 = !z13 ? !(z15 || androidx.camera.core.impl.x0.f16992c.contains(iVar.C())) : !(z15 || androidx.camera.core.impl.x0.f16993d.contains(iVar.C()));
        boolean z17 = iVar.O() == androidx.camera.core.impl.w.OFF || androidx.camera.core.impl.x0.f16991b.contains(iVar.y());
        kh2.m0.p("ConvergenceUtils", "checkCaptureResult, AE=" + iVar.C() + " AF =" + iVar.t() + " AWB=" + iVar.y());
        return z14 && z16 && z17;
    }

    public static boolean i(int i13, TotalCaptureResult totalCaptureResult) {
        kh2.m0.p("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i13);
        if (i13 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            kh2.m0.p("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
            return num != null && num.intValue() == 4;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                return false;
            }
            if (i13 != 3) {
                throw new AssertionError(i13);
            }
        }
        return true;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((androidx.camera.core.impl.n) it.next());
        }
    }

    public final void b(androidx.camera.core.impl.n nVar) {
        Object obj = this.f123389f;
        if (((List) obj).contains(nVar)) {
            return;
        }
        ((List) obj).add(nVar);
    }

    public final void c(androidx.camera.core.impl.v0 v0Var) {
        for (androidx.camera.core.impl.c cVar : v0Var.a()) {
            androidx.camera.core.impl.v1 v1Var = (androidx.camera.core.impl.v1) ((androidx.camera.core.impl.p1) this.f123388e);
            v1Var.getClass();
            try {
                v1Var.f(cVar);
            } catch (IllegalArgumentException unused) {
            }
            Object f13 = v0Var.f(cVar);
            ((androidx.camera.core.impl.q1) ((androidx.camera.core.impl.p1) this.f123388e)).q(cVar, v0Var.i(cVar), f13);
        }
    }

    public final void d(float f13, float f14) {
        ViewPropertyAnimator translationY;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        ((View) this.f123391h).setTranslationY(f13);
        ViewPropertyAnimator animate = ((View) this.f123391h).animate();
        if (animate == null || (translationY = animate.translationY(f14)) == null || (interpolator = translationY.setInterpolator(new PathInterpolator(0.45f, 0.0f, 0.55f, 1.0f))) == null || (duration = interpolator.setDuration(400L)) == null || (listener = duration.setListener(new b11.j(f14, this))) == null) {
            return;
        }
        listener.start();
    }

    public final androidx.camera.core.impl.s0 e() {
        ArrayList arrayList = new ArrayList((Set) this.f123387d);
        androidx.camera.core.impl.v1 b13 = androidx.camera.core.impl.v1.b((androidx.camera.core.impl.p1) this.f123388e);
        int i13 = this.f123384a;
        boolean z13 = this.f123385b;
        ArrayList arrayList2 = new ArrayList((List) this.f123389f);
        boolean z14 = this.f123386c;
        androidx.camera.core.impl.s1 s1Var = (androidx.camera.core.impl.s1) this.f123390g;
        androidx.camera.core.impl.u2 u2Var = androidx.camera.core.impl.u2.f16976b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : s1Var.f16977a.keySet()) {
            arrayMap.put(str, s1Var.f16977a.get(str));
        }
        return new androidx.camera.core.impl.s0(arrayList, b13, i13, z13, arrayList2, z14, new androidx.camera.core.impl.u2(arrayMap), (androidx.camera.core.impl.z) this.f123391h);
    }

    public final void f() {
        ((GestaltIconButton) this.f123390g).t(new y01.p1(this, 2));
        if (((Boolean) ((Function1) this.f123389f).invoke((Activity) this.f123387d)).booleanValue()) {
            return;
        }
        k(this.f123385b);
    }

    public final s0 g(int i13, int i14, int i15) {
        boolean z13;
        s0 s0Var;
        androidx.camera.core.impl.r rVar = (androidx.camera.core.impl.r) this.f123389f;
        n3.b bVar = new n3.b(1, rVar);
        int i16 = this.f123384a;
        Executor executor = (Executor) this.f123390g;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f123391h;
        n nVar = (n) this.f123387d;
        s0 s0Var2 = new s0(i16, executor, scheduledExecutorService, nVar, this.f123386c, bVar);
        ArrayList arrayList = s0Var2.f123657h;
        if (i13 == 0) {
            arrayList.add(new n0(nVar));
        }
        if (i14 == 3) {
            arrayList.add(new z0(nVar, executor, (ScheduledExecutorService) this.f123391h, new gc.c(11, rVar)));
        } else if (this.f123385b) {
            boolean z14 = ((q8.m0) this.f123388e).f102963a;
            if (z14 || this.f123384a == 3 || i15 == 1) {
                if (!z14) {
                    int i17 = ((AtomicInteger) nVar.f123559o.f114929c).get();
                    kh2.m0.p("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + i17);
                    if (i17 <= 0) {
                        z13 = true;
                        s0Var = s0Var2;
                        arrayList.add(new b1(nVar, i14, executor, (ScheduledExecutorService) this.f123391h, z13));
                        StringBuilder t13 = a.a.t("createPipeline: captureMode = ", i13, ", flashMode = ", i14, ", flashType = ");
                        t13.append(i15);
                        t13.append(", pipeline tasks = ");
                        t13.append(arrayList);
                        kh2.m0.p("Camera2CapturePipeline", t13.toString());
                        return s0Var;
                    }
                }
                z13 = false;
                s0Var = s0Var2;
                arrayList.add(new b1(nVar, i14, executor, (ScheduledExecutorService) this.f123391h, z13));
                StringBuilder t132 = a.a.t("createPipeline: captureMode = ", i13, ", flashMode = ", i14, ", flashType = ");
                t132.append(i15);
                t132.append(", pipeline tasks = ");
                t132.append(arrayList);
                kh2.m0.p("Camera2CapturePipeline", t132.toString());
                return s0Var;
            }
            arrayList.add(new m0(nVar, i14, bVar));
        }
        s0Var = s0Var2;
        StringBuilder t1322 = a.a.t("createPipeline: captureMode = ", i13, ", flashMode = ", i14, ", flashType = ");
        t1322.append(i15);
        t1322.append(", pipeline tasks = ");
        t1322.append(arrayList);
        kh2.m0.p("Camera2CapturePipeline", t1322.toString());
        return s0Var;
    }

    public final void j(boolean z13) {
        this.f123386c = z13;
    }

    public final void k(boolean z13) {
        View view = (View) this.f123391h;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int W = bs1.c.W((View) this.f123391h, n80.a.pin_closeup_back_button_top_margin);
        if (z13) {
            W += this.f123384a;
        }
        marginLayoutParams.topMargin = W;
        marginLayoutParams.setMarginStart(bs1.c.W((View) this.f123391h, eo1.c.space_200));
        view.setLayoutParams(marginLayoutParams);
    }

    public c1(n nVar, w.l lVar, androidx.camera.core.impl.r rVar, f0.j jVar, f0.g gVar) {
        this.f123384a = 1;
        this.f123387d = nVar;
        Integer num = (Integer) lVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f123386c = num != null && num.intValue() == 2;
        this.f123390g = jVar;
        this.f123391h = gVar;
        this.f123389f = rVar;
        this.f123388e = new q8.m0(3, rVar);
        this.f123385b = kh2.w.g0(new e0(lVar, 1));
    }

    public c1() {
        this.f123387d = new HashSet();
        this.f123388e = androidx.camera.core.impl.q1.c();
        this.f123384a = -1;
        this.f123385b = false;
        this.f123389f = new ArrayList();
        this.f123386c = false;
        this.f123390g = new androidx.camera.core.impl.s1(new ArrayMap());
    }

    public c1(androidx.camera.core.impl.s0 s0Var) {
        HashSet hashSet = new HashSet();
        this.f123387d = hashSet;
        this.f123388e = androidx.camera.core.impl.q1.c();
        this.f123384a = -1;
        this.f123385b = false;
        ArrayList arrayList = new ArrayList();
        this.f123389f = arrayList;
        this.f123386c = false;
        this.f123390g = new androidx.camera.core.impl.s1(new ArrayMap());
        hashSet.addAll(s0Var.f16967a);
        this.f123388e = androidx.camera.core.impl.q1.k(s0Var.f16968b);
        this.f123384a = s0Var.f16969c;
        arrayList.addAll(s0Var.f16971e);
        this.f123386c = s0Var.f16972f;
        ArrayMap arrayMap = new ArrayMap();
        androidx.camera.core.impl.u2 u2Var = s0Var.f16973g;
        for (String str : u2Var.f16977a.keySet()) {
            arrayMap.put(str, u2Var.f16977a.get(str));
        }
        this.f123390g = new androidx.camera.core.impl.s1(arrayMap);
        this.f123385b = s0Var.f16970d;
    }
}
