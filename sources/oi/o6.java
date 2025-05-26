package oi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import com.pinterest.ui.tabs.TabBarPlaceholderLoadingLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetException;
import org.chromium.net.impl.CronetBidirectionalStream;

/* loaded from: classes3.dex */
public final class o6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94998a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f94999b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f95000c;

    public /* synthetic */ o6(int i13, Object obj, Object obj2) {
        this.f94998a = i13;
        this.f95000c = obj;
        this.f94999b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x xVar;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        AnimatorSet animatorSet3;
        View e13;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        Object obj;
        FrameLayout frameLayout;
        float f13 = 1.0f;
        int i13 = 0;
        switch (this.f94998a) {
            case 0:
                ((a7) this.f94999b).M();
                a7 a7Var = (a7) this.f94999b;
                Runnable runnable = (Runnable) this.f95000c;
                a7Var.zzl().p();
                if (a7Var.f94670p == null) {
                    a7Var.f94670p = new ArrayList();
                }
                a7Var.f94670p.add(runnable);
                ((a7) this.f94999b).O();
                return;
            case 1:
                k5 k5Var = ((AppMeasurementDynamiteService) this.f95000c).f32015a.f95212p;
                u4.b(k5Var);
                com.google.android.gms.internal.measurement.x xVar2 = (com.google.android.gms.internal.measurement.x) this.f94999b;
                k5Var.p();
                k5Var.w();
                if (xVar2 != null && xVar2 != (xVar = k5Var.f94907d)) {
                    com.bumptech.glide.d.w("EventInterceptor already set.", xVar == null);
                }
                k5Var.f94907d = xVar2;
                return;
            case 2:
                a7 a7Var2 = (a7) this.f94999b;
                a7Var2.zzl().p();
                a7Var2.f94665k = new i4(a7Var2);
                i iVar = new i(a7Var2);
                iVar.u();
                a7Var2.f94657c = iVar;
                e G = a7Var2.G();
                k4 k4Var = a7Var2.f94655a;
                com.bumptech.glide.d.t(k4Var);
                G.f94734c = k4Var;
                n6 n6Var = new n6(a7Var2);
                n6Var.u();
                a7Var2.f94663i = n6Var;
                i7 i7Var = new i7(a7Var2);
                i7Var.u();
                a7Var2.f94660f = i7Var;
                z5 z5Var = new z5(a7Var2);
                z5Var.u();
                a7Var2.f94662h = z5Var;
                v6 v6Var = new v6(a7Var2);
                v6Var.u();
                a7Var2.f94659e = v6Var;
                a7Var2.f94658d = new f4(a7Var2);
                if (a7Var2.f94672r != a7Var2.f94673s) {
                    a7Var2.zzj().f95268f.a(Integer.valueOf(a7Var2.f94672r), Integer.valueOf(a7Var2.f94673s), "Not all upload components initialized");
                }
                a7Var2.f94667m = true;
                a7 a7Var3 = (a7) this.f94999b;
                a7Var3.zzl().p();
                i iVar2 = a7Var3.f94657c;
                a7.p(iVar2);
                iVar2.l0();
                if (a7Var3.f94663i.f94975g.a() == 0) {
                    h4 h4Var = a7Var3.f94663i.f94975g;
                    ((oh.b) a7Var3.zzb()).getClass();
                    h4Var.b(System.currentTimeMillis());
                }
                a7Var3.v();
                return;
            case 3:
                Context context = (Context) this.f94999b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f95000c;
                try {
                    pi.a.b(context);
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e14) {
                    taskCompletionSource.setException(e14);
                    return;
                }
            case 4:
                try {
                    ik.a aVar = (ik.a) this.f95000c;
                    Set set = (Set) this.f94999b;
                    AtomicReference atomicReference = ik.a.f72383e;
                    aVar.a(set);
                    return;
                } catch (Exception e15) {
                    Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e15);
                    return;
                }
            case 5:
                mk.a aVar2 = (mk.a) this.f94999b;
                jk.d dVar = (jk.d) this.f95000c;
                aVar2.f87291f.J(dVar);
                aVar2.f87292g.J(dVar);
                return;
            case 6:
                ((WebView) this.f94999b).destroy();
                return;
            case 7:
                w6.b bVar = ((p000do.b) this.f95000c).f55642a;
                String str = (String) this.f94999b;
                ((Future) bVar.f128110d).cancel(true);
                bVar.f128107a.remove(str);
                bVar.b(str);
                return;
            case 8:
                int height = ((View) this.f94999b).getHeight();
                rq.w4 w4Var = (rq.w4) this.f95000c;
                if (height < w4Var.getHeight()) {
                    ViewGroup.LayoutParams layoutParams = w4Var.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = -2;
                    w4Var.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 9:
                ((PinterestStaggeredGridLayoutManager) this.f95000c).M0(0);
                return;
            case 10:
                PinterestToastContainer pinterestToastContainer = (PinterestToastContainer) this.f95000c;
                if (pinterestToastContainer.f((View) this.f94999b)) {
                    PinterestToastContainer.g((View) this.f94999b);
                }
                pinterestToastContainer.f44921a.delete(((View) this.f94999b).getId());
                return;
            case 11:
                HomeFeedFragment homeFeedFragment = (HomeFeedFragment) this.f95000c;
                int i14 = HomeFeedFragment.U1;
                ir.c h93 = homeFeedFragment.h9();
                if (h93 != null) {
                    GridPlaceholderLoadingLayout b13 = h93.b();
                    float f14 = 0.0f;
                    if (b13 == null || (linearLayout2 = b13.f52381m) == null) {
                        animatorSet = null;
                    } else {
                        Resources resources = linearLayout2.getResources();
                        ArrayList arrayList = new ArrayList();
                        float dimensionPixelOffset = resources.getDimensionPixelOffset(eo1.c.space_1200);
                        int childCount = linearLayout2.getChildCount();
                        int i15 = 0;
                        long j13 = 0;
                        while (i15 < childCount) {
                            View childAt = linearLayout2.getChildAt(i15);
                            Intrinsics.g(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                            ViewGroup viewGroup = (ViewGroup) childAt;
                            float height2 = (hf0.b.f69003c * 0.4f) + (h93.c() != null ? r6.getHeight() : i13);
                            int childCount2 = viewGroup.getChildCount();
                            int i16 = i13;
                            while (i16 < childCount2) {
                                View childAt2 = viewGroup.getChildAt(i16);
                                float f15 = (i16 == 0 ? f14 : i16 * dimensionPixelOffset) + height2;
                                childAt2.setAlpha(f14);
                                childAt2.setTranslationY(f15);
                                float f16 = dimensionPixelOffset;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.TRANSLATION_Y, f15, 0.0f);
                                int i17 = childCount2;
                                ofFloat.setInterpolator(new PathInterpolator(0.47f, 0.08f, 0.45f, 1.2f));
                                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                                ofFloat2.setInterpolator(new PathInterpolator(0.42f, 0.0f, 1.0f, 1.0f));
                                AnimatorSet animatorSet4 = new AnimatorSet();
                                animatorSet4.playTogether(ofFloat, ofFloat2);
                                animatorSet4.setDuration(600L);
                                animatorSet4.setStartDelay(j13);
                                arrayList.add(animatorSet4);
                                i16++;
                                dimensionPixelOffset = f16;
                                childCount = childCount;
                                childCount2 = i17;
                                viewGroup = viewGroup;
                                f14 = 0.0f;
                            }
                            j13 += 30;
                            i15++;
                            dimensionPixelOffset = dimensionPixelOffset;
                            childCount = childCount;
                            i13 = 0;
                            f14 = 0.0f;
                        }
                        animatorSet = new AnimatorSet();
                        animatorSet.addListener(new ir.b(b13, 0));
                        animatorSet.playTogether(arrayList);
                    }
                    if (animatorSet == null) {
                        animatorSet = new AnimatorSet();
                    }
                    TabBarPlaceholderLoadingLayout c13 = h93.c();
                    if (c13 == null || (linearLayout = c13.f52645k) == null) {
                        animatorSet2 = null;
                    } else {
                        TabBarPlaceholderLoadingLayout c14 = h93.c();
                        if (c14 != null) {
                            Context context2 = c14.getContext();
                            int i18 = eo1.b.color_themed_background_default;
                            Object obj2 = d5.a.f53679a;
                            c14.setBackground(new ColorDrawable(context2.getColor(i18)));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int childCount3 = linearLayout.getChildCount();
                        long j14 = 0;
                        for (int i19 = 0; i19 < childCount3; i19++) {
                            View childAt3 = linearLayout.getChildAt(i19);
                            childAt3.setAlpha(0.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt3, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            ofFloat3.setInterpolator(new PathInterpolator(0.42f, 0.0f, 1.0f, 1.0f));
                            ofFloat3.setDuration(400L);
                            ofFloat3.setStartDelay(j14);
                            Intrinsics.checkNotNullExpressionValue(ofFloat3, "apply(...)");
                            arrayList2.add(ofFloat3);
                            j14 += 80;
                        }
                        animatorSet2 = new AnimatorSet();
                        animatorSet2.setStartDelay(120L);
                        animatorSet2.addListener(new ir.b(h93, 1));
                        animatorSet2.playTogether(arrayList2);
                    }
                    if (animatorSet2 == null) {
                        animatorSet2 = new AnimatorSet();
                    }
                    GridPlaceholderLoadingLayout b14 = h93.b();
                    if (b14 == null || (e13 = b14.e()) == null) {
                        animatorSet3 = null;
                    } else {
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(e13, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat4.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f));
                        ofFloat4.setDuration(500L);
                        animatorSet3 = ofFloat4;
                    }
                    if (animatorSet3 == null) {
                        animatorSet3 = new AnimatorSet();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(animatorSet3, animatorSet, animatorSet2);
                    animatorSet5.start();
                    h93.f73451b = animatorSet5;
                    return;
                }
                return;
            case 12:
                Iterator it = d7.b.O(((q01.b) this.f95000c).f101774b).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((View) obj) instanceof rq.x2) {
                        }
                    } else {
                        obj = null;
                    }
                }
                View view = (View) obj;
                rq.x2 x2Var = view instanceof rq.x2 ? (rq.x2) view : null;
                if (x2Var == null || (frameLayout = x2Var.f109653i) == null) {
                    return;
                }
                frameLayout.setVisibility(8);
                return;
            case 13:
                ((j51.d0) this.f94999b).B8((j51.w) this.f95000c);
                return;
            case 14:
                nu1.a aVar3 = ((q71.x) this.f94999b).A0;
                if (aVar3 != null) {
                    nu1.a.c(aVar3, a.a.j("pinterest://search/my_pins/?prefilled_query=", (String) this.f95000c), null, null, false, 30);
                    return;
                } else {
                    Intrinsics.r("inAppNavigator");
                    throw null;
                }
            case 15:
                ((ln1.k) this.f94999b).unscheduleSelf(this);
                ln1.k kVar = (ln1.k) this.f94999b;
                float f17 = kVar.f84027g;
                float f18 = (7 + f17) % 360;
                if (f17 != f18) {
                    kVar.f84027g = f18;
                    kVar.invalidateSelf();
                }
                ln1.k kVar2 = (ln1.k) this.f94999b;
                float f19 = kVar2.f84041u;
                if (f19 < kVar2.f84042v - 20) {
                    float f23 = 20 + f19;
                    if (f19 != f23) {
                        kVar2.f84041u = f23;
                        for (int i23 = 0; i23 < 3; i23++) {
                            float f24 = i23 * RecyclerViewTypes.VIEW_TYPE_SHOPPING_CATEGORY;
                            if (f23 > f24) {
                                float min = Math.min((f23 - f24) / AdSize.MEDIUM_RECTANGLE_WIDTH, 1.0f);
                                ArrayList arrayList3 = kVar2.f84039s;
                                float floatValue = ((Number) ((List) arrayList3.get(i23)).get(0)).floatValue();
                                float floatValue2 = ((Number) ((List) arrayList3.get(i23)).get(1)).floatValue();
                                ArrayList arrayList4 = kVar2.f84038r;
                                float floatValue3 = ((Number) ((List) arrayList4.get(i23)).get(0)).floatValue();
                                float floatValue4 = ((Number) ((List) arrayList4.get(i23)).get(1)).floatValue();
                                ArrayList arrayList5 = kVar2.f84040t;
                                ((List) arrayList5.get(i23)).set(0, Float.valueOf(((floatValue - floatValue3) * min) + floatValue3));
                                ((List) arrayList5.get(i23)).set(1, Float.valueOf(((floatValue2 - floatValue4) * min) + floatValue4));
                            }
                        }
                        kVar2.invalidateSelf();
                    }
                }
                ln1.k kVar3 = (ln1.k) this.f94999b;
                float f25 = kVar3.f84036p;
                if (f25 < kVar3.f84037q - 20) {
                    float f26 = 20 + f25;
                    if (f26 != f25) {
                        kVar3.f84036p = f26;
                        while (i13 < 3) {
                            float f27 = i13 * 100;
                            if (f26 > f27) {
                                kVar3.f84035o.set(i13, Float.valueOf(kVar3.f84033m * Math.min((f26 - f27) / 700, 1.0f)));
                            }
                            i13++;
                        }
                        kVar3.invalidateSelf();
                    }
                } else {
                    float f28 = kVar3.f84034n;
                    float f29 = (20 + f28) % kVar3.f84032l;
                    if (f28 != f29) {
                        kVar3.f84034n = f29;
                        float f33 = kVar3.f84031k;
                        int i24 = (int) (f29 / f33);
                        float f34 = f29 % f33;
                        if (f34 <= r0 - 100) {
                            if (f34 > 400.0f) {
                                float f35 = 400;
                                f13 = (((f34 - f35) / f35) * 0.33999997f) + 0.66f;
                            } else {
                                f13 = 1.0f - ((f34 / 400) * 0.33999997f);
                            }
                        }
                        kVar3.f84035o.set(i24, Float.valueOf(kVar3.f84033m * f13));
                        kVar3.invalidateSelf();
                    }
                }
                List list = (List) this.f95000c;
                if (list.size() > 1) {
                    int size = list.size() * AdSize.WIDE_SKYSCRAPER_HEIGHT;
                    ln1.k kVar4 = (ln1.k) this.f94999b;
                    float f36 = kVar4.f84029i;
                    float f37 = (20 + f36) % size;
                    if (f36 != f37) {
                        kVar4.f84029i = f37;
                        kVar4.f84022b.setColor(kVar4.a());
                        kVar4.invalidateSelf();
                    }
                }
                ln1.k kVar5 = (ln1.k) this.f94999b;
                if (kVar5.f84023c) {
                    kVar5.scheduleSelf(kVar5.f84043w, SystemClock.uptimeMillis() + 20);
                    return;
                }
                return;
            case 16:
                Object obj3 = this.f95000c;
                try {
                    ((gk2.s) obj3).f65609a.onError((Throwable) this.f94999b);
                    return;
                } finally {
                    ((gk2.s) obj3).f65612d.dispose();
                }
            case 17:
                ((gk2.s) this.f95000c).f65609a.c(this.f94999b);
                return;
            case 18:
                Object obj4 = this.f95000c;
                try {
                    ((jk2.q) obj4).f76642a.onError((Throwable) this.f94999b);
                    return;
                } finally {
                    ((jk2.q) obj4).f76645d.dispose();
                }
            case 19:
                ((kk2.d) this.f95000c).f79926b.onError((Throwable) this.f94999b);
                return;
            case 20:
                mk2.g gVar = (mk2.g) this.f94999b;
                bk2.a aVar4 = gVar.f87375b;
                xj2.c b15 = ((mk2.k) this.f95000c).b(gVar);
                aVar4.getClass();
                bk2.c.replace(aVar4, b15);
                return;
            case 21:
                ((mk2.a0) this.f94999b).f87354d = true;
                ((mk2.b0) this.f95000c).f87360a.remove((mk2.a0) this.f94999b);
                return;
            case 22:
                ((ao2.m) this.f95000c).i((ao2.f0) this.f94999b, Unit.f80348a);
                return;
            case 23:
                ((lo2.h) ((lo2.i) this.f94999b)).i((lo2.b) this.f95000c, Unit.f80348a);
                return;
            case 24:
                ((CronetBidirectionalStream) this.f95000c).f((CronetException) this.f94999b);
                return;
            default:
                bl2.c b16 = cl2.h.b((bl2.c) this.f94999b);
                xk2.q qVar = xk2.s.f135225b;
                b16.resumeWith(ue.c.m((Throwable) this.f95000c));
                return;
        }
    }

    public /* synthetic */ o6(Object obj, Object obj2, int i13) {
        this.f94998a = i13;
        this.f94999b = obj;
        this.f95000c = obj2;
    }

    public o6(jn.d dVar) {
        this.f94998a = 6;
        this.f95000c = dVar;
        this.f94999b = dVar.f77075g;
    }

    public o6(a7 a7Var, Runnable runnable) {
        this.f94998a = 0;
        this.f94999b = a7Var;
        this.f95000c = runnable;
    }
}
