package wt;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.w0;
import ao2.j0;
import bm1.m;
import bm1.o;
import com.pinterest.api.model.deserializer.DynamicStoryDeserializer;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gs0;
import com.pinterest.api.model.w01;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import h32.x3;
import iz.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.g3;
import kh2.j;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.z;
import l82.n;
import lu.c0;
import lu.d0;
import lu.v;
import lu.x;
import lu.y;
import m60.w;
import mu.u0;
import net.quikkly.android.utils.BitmapUtils;
import ns.o0;
import ou.l;
import pk.a0;
import ps.p;
import so.lb;
import so.qb;
import sv.g;
import sv.i;
import sv.k;
import tb0.h;
import u50.f0;
import u50.h0;
import u50.i0;

/* loaded from: classes3.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131084i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f131085j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i13) {
        super(1);
        this.f131084i = i13;
        this.f131085j = obj;
    }

    public final rn1.a b(rn1.a it) {
        String str;
        String z63;
        int i13 = this.f131084i;
        str = "";
        Object obj = this.f131085j;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                f30 f30Var = ((v) obj).f84954c.f126577d;
                if (f30Var != null && (z63 = f30Var.z6()) != null) {
                    str = z63;
                }
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(((u0) obj).f88245a), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = ((vu.e) obj).f126647v;
                return rn1.a.y(it, ep.b.x(str2, "string", str2), null, null, e0.b(vn1.e.BOLD), null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097142);
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                iz.e eVar = (iz.e) obj;
                String str3 = (String) eVar.f73842d0.getValue();
                str = str3 != null ? str3 : "";
                f0 x13 = ep.b.x(str, "string", str);
                String str4 = (String) eVar.f73842d0.getValue();
                return rn1.a.y(it, x13, null, null, null, null, 0, d7.b.Z(!(str4 == null || z.j(str4))), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 28:
                Intrinsics.checkNotNullParameter(it, "it");
                q qVar = (q) obj;
                String str5 = (String) qVar.f73870d0.getValue();
                str = str5 != null ? str5 : "";
                f0 x14 = ep.b.x(str, "string", str);
                String str6 = (String) qVar.f73870d0.getValue();
                return rn1.a.y(it, x14, null, null, null, null, 0, d7.b.Z(!(str6 == null || z.j(str6))), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                jz.d dVar = (jz.d) obj;
                String str7 = dVar.f77741c;
                i0 f0Var = str7 != null ? new f0(str7) : h0.f120562a;
                String str8 = dVar.f77741c;
                return rn1.a.y(it, f0Var, null, null, null, null, 0, d7.b.Z(!(str8 == null || z.j(str8))), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    public final void e(f30 cutoutPin) {
        int i13 = this.f131084i;
        Object obj = this.f131085j;
        switch (i13) {
            case 3:
                av.d dVar = (av.d) ((jt.b) ((bu.b) obj).getView());
                kt.a aVar = dVar.B0;
                if (aVar == null) {
                    Intrinsics.r("screenFactory");
                    throw null;
                }
                nl1.d a13 = aVar.a();
                a13.R7(Navigation.z0(com.pinterest.screens.f.a(), (String) dVar.D0.getValue()));
                a13.Q7(true);
                w0 childFragmentManager = dVar.getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
                Intrinsics.checkNotNullExpressionValue(aVar2, "beginTransaction(...)");
                mo1.c.a(aVar2, mo1.a.DEFAULT);
                aVar2.g(p.opaque_one_tap_bottom_sheet_module_container, a13, null, 1);
                aVar2.e(false);
                return;
            default:
                Intrinsics.checkNotNullParameter(cutoutPin, "cutoutPin");
                sv.e eVar = (sv.e) obj;
                k kVar = k.f115304a;
                int i14 = sv.e.f115274q0;
                j.x2((g) eVar.f115285m0.getValue(), kVar);
                i iVar = eVar.f115287o0;
                f30 f30Var = iVar.f115301f;
                if (!iVar.f115300e) {
                    f30Var = null;
                }
                f30 f30Var2 = f30Var == null ? cutoutPin : f30Var;
                np0.g gVar = eVar.f115275c0;
                if (gVar == null) {
                    Intrinsics.r("closeupActionController");
                    throw null;
                }
                Context requireContext = eVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                gVar.a(requireContext, f30Var2, com.bumptech.glide.c.D(f30Var2), "pin", eVar.s7(), null, new xj2.b(), (r25 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : g3.B(eVar.Y7(), com.bumptech.glide.d.Z(eVar, "EXTRA_COLLAGES_ROOT_PIN_ID", ""), cutoutPin.i6()), (r25 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? Boolean.FALSE : Boolean.FALSE, (r25 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? new HashMap() : eVar.getO0(), false);
                return;
        }
    }

    public final void f(Boolean bool) {
        int i13 = 1;
        int i14 = 0;
        int i15 = 2;
        int i16 = this.f131084i;
        Object obj = this.f131085j;
        switch (i16) {
            case 5:
                if (bool.booleanValue()) {
                    return;
                }
                lu.k kVar = (lu.k) obj;
                int i17 = lu.k.Y0;
                kVar.getClass();
                ValueAnimator valueAnimator = new ValueAnimator();
                Context requireContext = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                valueAnimator.setIntValues(-1, dl2.b.x0(requireContext, eo1.a.color_white_mochimalist_0_opacity_20));
                valueAnimator.setEvaluator(new ArgbEvaluator());
                valueAnimator.setDuration(200L);
                valueAnimator.start();
                ValueAnimator valueAnimator2 = new ValueAnimator();
                Context requireContext2 = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                valueAnimator2.setIntValues(dl2.b.x0(requireContext2, eo1.a.color_white_mochimalist_0_opacity_20), -1);
                valueAnimator2.setEvaluator(new ArgbEvaluator());
                valueAnimator2.setDuration(400L);
                valueAnimator2.setStartDelay(600L);
                valueAnimator2.start();
                new AnimatorSet().playSequentially(valueAnimator, valueAnimator2);
                return;
            case 6:
            default:
                if (bool.booleanValue()) {
                    return;
                }
                d0 d0Var = (d0) obj;
                int i18 = d0.f84872g;
                d0Var.getClass();
                ValueAnimator valueAnimator3 = new ValueAnimator();
                int i19 = d0Var.f84877e;
                int i23 = d0Var.f84878f;
                valueAnimator3.setIntValues(i19, i23);
                valueAnimator3.setEvaluator(new ArgbEvaluator());
                valueAnimator3.addUpdateListener(new c0(d0Var, i15));
                valueAnimator3.setDuration(200L);
                valueAnimator3.start();
                ValueAnimator valueAnimator4 = new ValueAnimator();
                valueAnimator4.setIntValues(i23, i19);
                valueAnimator4.setEvaluator(new ArgbEvaluator());
                valueAnimator4.addUpdateListener(new c0(d0Var, 3));
                valueAnimator4.setDuration(400L);
                valueAnimator4.setStartDelay(600L);
                valueAnimator4.start();
                new AnimatorSet().playSequentially(valueAnimator3, valueAnimator4);
                return;
            case 7:
                if (bool.booleanValue()) {
                    return;
                }
                y yVar = (y) obj;
                FrameLayout frameLayout = yVar.G0;
                if (frameLayout == null) {
                    Intrinsics.r("moduleContainer");
                    throw null;
                }
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 0.5f);
                ofFloat.setDuration(200L);
                ofFloat.addListener(new x(yVar, i13));
                ofFloat.start();
                FrameLayout frameLayout2 = yVar.G0;
                if (frameLayout2 == null) {
                    Intrinsics.r("moduleContainer");
                    throw null;
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, 0.5f, 0.0f);
                ofFloat2.setDuration(400L);
                ofFloat2.setStartDelay(600L);
                ofFloat2.addListener(new x(yVar, i14));
                ofFloat2.start();
                new AnimatorSet().playSequentially(ofFloat, ofFloat2);
                return;
        }
    }

    public final void h(n start) {
        int i13 = this.f131084i;
        Object obj = this.f131085j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                nu.b bVar = ((l) obj).f97697c;
                start.a(bVar, new o0(9), bVar.a());
                break;
            case 12:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                nu.b bVar2 = ((uu.k) obj).f123126c;
                start.a(bVar2, new o0(10), bVar2.a());
                break;
            case 15:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                g gVar = (g) obj;
                tv.e eVar = gVar.f115289c;
                start.a(eVar, new o0(12), eVar.a());
                w60.d dVar = gVar.f115291e;
                start.a(dVar, new o0(13), dVar.a());
                zy.d0 a13 = gVar.f115290d.a();
                start.a(a13, new o0(11), a13.a());
                break;
            case 18:
                Intrinsics.checkNotNullParameter(start, "$this$buildAndStart");
                gx.p pVar = (gx.p) obj;
                zy.d0 a14 = pVar.f66276d.a();
                start.a(a14, new o0(14), a14.a());
                com.google.android.gms.internal.measurement.x xVar = pVar.f66275c;
                n.b(start, new gx.e((w) xVar.f31694b, (ax.a) xVar.f31695c));
                break;
            default:
                Intrinsics.checkNotNullParameter(start, "$this$buildAndStart");
                n.b(start, (gz.i) obj);
                break;
        }
    }

    public final void i(xt.j viewState) {
        Integer num;
        int i13 = this.f131084i;
        Object obj = this.f131085j;
        switch (i13) {
            case 1:
                xu.a aVar = (xu.a) obj;
                Intrinsics.f(viewState);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                if (viewState instanceof xt.i) {
                    Context context = aVar.getContext();
                    if (context == null || !a0.q0(context)) {
                        int y03 = dl2.b.y0(aVar, eo1.a.color_background_dark_opacity_500);
                        xt.i iVar = (xt.i) viewState;
                        Integer num2 = iVar.f135884f;
                        int intValue = num2 != null ? num2.intValue() : y03;
                        xt.f fVar = aVar.f135921u;
                        int b13 = xt.f.b(fVar, intValue);
                        Integer num3 = iVar.f135885g;
                        if (num3 != null) {
                            y03 = num3.intValue();
                        }
                        int b14 = xt.f.b(fVar, y03);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(b13, b14);
                        valueAnimator.setEvaluator(new ArgbEvaluator());
                        valueAnimator.addUpdateListener(new androidx.media3.ui.c(aVar, 8));
                        valueAnimator.setDuration(200L);
                        valueAnimator.start();
                        fVar.f135869l = num3;
                        break;
                    }
                }
                break;
            default:
                zu.f fVar2 = (zu.f) obj;
                Intrinsics.f(viewState);
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                if (viewState instanceof xt.i) {
                    Context context2 = fVar2.getContext();
                    if (context2 == null || !a0.q0(context2)) {
                        int y04 = dl2.b.y0(fVar2, eo1.a.color_background_dark_opacity_500);
                        xt.f fVar3 = fVar2.f142799c;
                        Integer num4 = null;
                        if (fVar3 != null) {
                            Integer num5 = ((xt.i) viewState).f135884f;
                            num = Integer.valueOf(xt.f.b(fVar3, num5 != null ? num5.intValue() : y04));
                        } else {
                            num = null;
                        }
                        xt.f fVar4 = fVar2.f142799c;
                        if (fVar4 != null) {
                            Integer num6 = ((xt.i) viewState).f135885g;
                            if (num6 != null) {
                                y04 = num6.intValue();
                            }
                            num4 = Integer.valueOf(xt.f.b(fVar4, y04));
                        }
                        ValueAnimator valueAnimator2 = new ValueAnimator();
                        if (num != null && num4 != null) {
                            valueAnimator2.setIntValues(num.intValue(), num4.intValue());
                        }
                        valueAnimator2.setEvaluator(new ArgbEvaluator());
                        valueAnimator2.addUpdateListener(new androidx.media3.ui.c(fVar2, 9));
                        valueAnimator2.setDuration(200L);
                        valueAnimator2.start();
                        xt.f fVar5 = fVar2.f142799c;
                        if (fVar5 != null) {
                            fVar5.f135869l = ((xt.i) viewState).f135885g;
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        int i13 = this.f131084i;
        Object obj2 = this.f131085j;
        switch (i13) {
            case 0:
                f30 it = (f30) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((f) obj2).getClass();
                return Boolean.valueOf(it.f6() != null);
            case 1:
                i((xt.j) obj);
                return Unit.f80348a;
            case 2:
                i((xt.j) obj);
                return Unit.f80348a;
            case 3:
                e((f30) obj);
                return Unit.f80348a;
            case 4:
                Navigation navigation = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                du.d dVar = (du.d) obj2;
                kt.a aVar = dVar.B0;
                if (aVar == null) {
                    Intrinsics.r("screenFactory");
                    throw null;
                }
                ScreenLocation screenLocation = navigation.getF49939a();
                Intrinsics.checkNotNullExpressionValue(screenLocation, "getLocation(...)");
                Intrinsics.checkNotNullParameter(screenLocation, "screenLocation");
                nl1.d dVar2 = (nl1.d) aVar.f80789a.e(screenLocation);
                Bundle bundle = new Bundle();
                bundle.putParcelable("NAVIGATION_MODEL_BUNDLE_KEY", navigation);
                dVar2.setArguments(bundle);
                w0 childFragmentManager = dVar.getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
                Intrinsics.checkNotNullExpressionValue(aVar2, "beginTransaction(...)");
                mo1.c.a(aVar2, mo1.a.DEFAULT);
                aVar2.g(p.opaque_one_tap_bottom_sheet_module_container, dVar2, null, 1);
                aVar2.e(false);
                dVar2.Q7(true);
                return Unit.f80348a;
            case 5:
                f((Boolean) obj);
                return Unit.f80348a;
            case 6:
                return b((rn1.a) obj);
            case 7:
                f((Boolean) obj);
                return Unit.f80348a;
            case 8:
                f((Boolean) obj);
                return Unit.f80348a;
            case 9:
                return b((rn1.a) obj);
            case 10:
                ((h) ((nu.b) obj2).f92308c).q((Throwable) obj, "Load Data error", tb0.p.ONE_TAP_ADS);
                return Unit.f80348a;
            case 11:
                h((n) obj);
                return Unit.f80348a;
            case 12:
                h((n) obj);
                return Unit.f80348a;
            case 13:
                return b((rn1.a) obj);
            case 14:
                e((f30) obj);
                return Unit.f80348a;
            case 15:
                h((n) obj);
                return Unit.f80348a;
            case 16:
                MatchResult it2 = (MatchResult) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String value = it2.getValue();
                Regex regex = jw.b.f77647g;
                ((jw.b) obj2).getClass();
                split$default = StringsKt__StringsKt.split$default(value, new String[]{"_"}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : split$default) {
                    if (!z.j((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                String str = (String) CollectionsKt.S(arrayList);
                List N = CollectionsKt.N(arrayList, 1);
                ArrayList arrayList2 = new ArrayList(g0.q(N, 10));
                Iterator it3 = N.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(StringsKt.toIntOrNull((String) it3.next()));
                }
                return new Pair(str, arrayList2);
            case 17:
                String content = (String) obj;
                Intrinsics.checkNotNullParameter(content, "content");
                ((yw.f) obj2).f140264f = content;
                return Unit.f80348a;
            case 18:
                h((n) obj);
                return Unit.f80348a;
            case 19:
                vd0.c it4 = (vd0.c) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                DynamicStoryDeserializer dynamicStoryDeserializer = ((qx.e) obj2).f105318b;
                vd0.c json = it4.k("data").b(0);
                Intrinsics.checkNotNullExpressionValue(json, "getJsonObject(...)");
                dynamicStoryDeserializer.getClass();
                Intrinsics.checkNotNullParameter(json, "json");
                return dynamicStoryDeserializer.e(json, false, false);
            case 20:
                h32.h0 update = (h32.h0) obj;
                switch (i13) {
                    case 20:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        update.f67045d = (h32.g0) obj2;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(update, "$this$update");
                        update.f67044c = (x3) obj2;
                        break;
                }
                return Unit.f80348a;
            case 21:
                h32.h0 update2 = (h32.h0) obj;
                switch (i13) {
                    case 20:
                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                        update2.f67045d = (h32.g0) obj2;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(update2, "$this$update");
                        update2.f67044c = (x3) obj2;
                        break;
                }
                return Unit.f80348a;
            case 22:
                ((cz.e) obj2).f53457e = (w01) obj;
                return Unit.f80348a;
            case 23:
                h((n) obj);
                return Unit.f80348a;
            case 24:
                lb factory = (lb) obj;
                Intrinsics.checkNotNullParameter(factory, "factory");
                int i14 = hz.d.f70601r0;
                String str2 = (String) ((hz.d) obj2).f70607o0.getValue();
                qb qbVar = factory.f113539a;
                return new gz.p(str2, (j0) qbVar.f114078c.f114104c.get(), new gz.i((cz.e) qbVar.f114078c.f114096a.V9.get()));
            case 25:
                return b((rn1.a) obj);
            case 26:
                om1.c it5 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return om1.c.e(it5, null, ((iz.h) obj2).A0, om1.f.DEFAULT_LIGHT_GRAY, null, null, false, 0, 1017);
            case 27:
                m it6 = (m) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return m.e(it6, o.SMALL, null, new bm1.b(new f0(String.valueOf(((gs0) obj2).f38133f))), false, fm1.c.VISIBLE, 0, null, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID);
            case 28:
                return b((rn1.a) obj);
            default:
                return b((rn1.a) obj);
        }
    }
}
