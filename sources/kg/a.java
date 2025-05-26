package kg;

import a.cb;
import a.k1;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.TextSwitcher;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.km0;
import com.pinterest.api.model.l30;
import com.pinterest.api.model.nv0;
import com.pinterest.api.model.ps0;
import com.pinterest.api.model.pu0;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.so;
import com.pinterest.api.model.ta;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.um;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.feature.settings.notifications.v;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.buttonSocial.GestaltButtonSocial;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.b4;
import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import df.j1;
import ed1.y;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kh2.c3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lh0.q3;
import m60.w;
import nx.b0;
import pc.q0;
import pc.r0;
import pk.a0;
import q91.a1;
import r72.z1;
import rl2.g0;
import so.d3;
import so.o3;
import so.w0;
import wm1.k0;
import yq1.m1;

/* loaded from: classes3.dex */
public abstract class a implements pc.a {

    /* renamed from: a */
    public static TypeAheadItem f79364a = null;

    /* renamed from: b */
    public static int f79365b = -1;

    /* renamed from: c */
    public static y f79366c;

    /* renamed from: d */
    public static boolean f79367d;

    /* renamed from: e */
    public static jh0.e f79368e;

    public static final AnimatorSet A(float f13, float f14, long j13, View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f13, f14);
        ofFloat.setDuration(j13);
        animatorSet.play(ofFloat);
        return animatorSet;
    }

    public static final int B(ta taVar) {
        Intrinsics.checkNotNullParameter(taVar, "<this>");
        ArrayList C = C(taVar);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = C.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((pu0) next).q())) {
                arrayList.add(next);
            }
        }
        return arrayList.size();
    }

    public static final ArrayList C(ta taVar) {
        Intrinsics.checkNotNullParameter(taVar, "<this>");
        ps0 u13 = taVar.u();
        Intrinsics.checkNotNullExpressionValue(u13, "getTimeline(...)");
        List h10 = u13.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getTimelineObjects(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : h10) {
            nv0 h13 = ((pu0) obj).r().h();
            if (h13 != null && h13.f() == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Class D(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) D(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return D(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static final AnimatorSet E(float f13, float f14, long j13, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f13, f14);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f13, f14);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(j13);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public static final AnimatorSet F(float f13, long j13, View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f13);
        ofFloat.setDuration(j13);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f13);
        ofFloat2.setDuration(j13);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        return animatorSet;
    }

    public static final ArrayList G(View view, float f13, float f14, long j13, long j14) {
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList arrayList = new ArrayList();
        AnimatorSet E = E(f13, f14, j13, view);
        AnimatorSet E2 = E(f14, f13, j14, view);
        arrayList.add(E);
        arrayList.add(E2);
        return arrayList;
    }

    public static final ObjectAnimator H(float f13, float f14, long j13, View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", f13, f14);
        ofFloat.setDuration(j13);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    public static final void I(w eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        NavigationImpl w13 = Navigation.w1((ScreenLocation) b4.f50580z.getValue());
        w13.Y1("SETTINGS_EXTRAS_KEY_USE_MODAL_DISPLAY", false);
        w13.Y1("SETTINGS_EXTRAS_KEY_USE_PROFILE_PREVIEW", true);
        w13.Y1("SETTINGS_EXTRAS_KEY_ALLOW_CREATOR_HUB_ENTRY_POINTS", true);
        eventManager.d(w13);
    }

    public static void J(m1 m1Var, lb2.d dVar) {
        m1Var.G0 = dVar;
    }

    public static void K(m1 m1Var, lu1.b bVar) {
        m1Var.I0 = bVar;
    }

    public static void L(m1 m1Var, com.pinterest.identity.authentication.a aVar) {
        m1Var.F0 = aVar;
    }

    public static void M(a1 a1Var, q3 q3Var) {
        a1Var.f103060g0 = q3Var;
    }

    public static void N(pw1.d dVar, w0 w0Var) {
        dVar.T0 = w0Var;
    }

    public static void O(v vVar, o3 o3Var) {
        vVar.H0 = o3Var;
    }

    public static void P(o61.c cVar, d3 d3Var) {
        cVar.f92948j0 = d3Var;
    }

    public static void Q(pw1.d dVar, uk1.e eVar) {
        dVar.S0 = eVar;
    }

    public static void R(m1 m1Var, i92.k kVar) {
        m1Var.H0 = kVar;
    }

    public static final boolean S(z1 z1Var) {
        Intrinsics.checkNotNullParameter(z1Var, "<this>");
        return z.p(z1Var.b(), "watermark_item", true);
    }

    public static final boolean T(pu0 pu0Var) {
        Intrinsics.checkNotNullParameter(pu0Var, "<this>");
        String w13 = pu0Var.w();
        Intrinsics.checkNotNullExpressionValue(w13, "getUid(...)");
        return z.p(w13, "watermark_group_item", true);
    }

    public static final boolean U(String str) {
        boolean z13;
        if (str != null) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(12);
                if (extractMetadata != null) {
                    List j13 = f0.j("heic", "heif");
                    List b13 = e0.b("avif");
                    List j14 = f0.j("heif", "heifs", "heic", "heics", "avci", "avcs", "avif");
                    boolean E = StringsKt.E(extractMetadata, "image", true);
                    List list = j13;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (StringsKt.E(extractMetadata, (String) it.next(), true)) {
                                z13 = true;
                                break;
                            }
                        }
                    }
                    z13 = false;
                    if (E && z13) {
                        return false;
                    }
                    List list2 = b13;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (StringsKt.E(extractMetadata, (String) it2.next(), true)) {
                                return true;
                            }
                        }
                    }
                    List list3 = j14;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            if (z.h(str, (String) it3.next(), true)) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            } catch (Exception unused) {
                Unit unit = Unit.f80348a;
            }
        }
        return false;
    }

    public static final void V(ArrayList chromeViews, boolean z13) {
        Intrinsics.checkNotNullParameter(chromeViews, "chromeViews");
        float f13 = z13 ? 1.0f : 0.0f;
        Iterator it = chromeViews.iterator();
        while (it.hasNext()) {
            ((View) it.next()).animate().alpha(f13).setDuration(300L).start();
        }
    }

    public static int W(int i13, RoundingMode roundingMode) {
        if (i13 <= 0) {
            throw new IllegalArgumentException(a.a.e("x (", i13, ") must be > 0"));
        }
        switch (rk.d.f108436a[roundingMode.ordinal()]) {
            case 1:
                kotlin.jvm.internal.r.n((i13 > 0) & (((i13 + (-1)) & i13) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i13 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i13);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i13))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void X(rg0.n r24, i32.y0 r25, java.lang.ref.WeakReference r26, android.view.View r27, android.view.View r28) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.a.X(rg0.n, i32.y0, java.lang.ref.WeakReference, android.view.View, android.view.View):void");
    }

    public static int Y(int i13) {
        int i14 = i13 % 65536;
        return i14 >= 0 ? i14 : i14 + 65536;
    }

    public static Util$ParameterizedTypeImpl Z(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new Util$ParameterizedTypeImpl(null, cls, typeArr);
        }
        throw new IllegalArgumentException(a.a.h("Missing type arguments for ", cls));
    }

    public static final void a(HashMap hashMap, f30 f30Var, boolean z13, boolean z14, Integer num, String str, Boolean bool, boolean z15, int i13, int i14, int i15, es.a aVar, b0 b0Var) {
        String str2;
        List d2;
        l30 l30Var;
        if ((z13 || z14) && num != null) {
            hashMap.put("index", num.toString());
        }
        if (z13) {
            if (str != null) {
                hashMap.put("story_type", str);
            }
            if (bool != null) {
                hashMap.put("is_multiple_advertiser", String.valueOf(bool.booleanValue()));
            }
        }
        if (((es.c) aVar).K(f30Var)) {
            String f03 = com.bumptech.glide.d.f0(f30Var);
            if (f03 == null) {
                f03 = "";
            }
            hashMap.put(SbaPinRep.AUXDATA_LEADAD_FORM_ID, f03);
            hashMap.put(SbaPinRep.AUXDATA_IS_LEAD_AD, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        }
        Boolean O5 = f30Var.O5();
        Intrinsics.checkNotNullExpressionValue(O5, "getPromotedIsCatalogCarouselAd(...)");
        if (O5.booleanValue()) {
            cc J3 = f30Var.J3();
            if (J3 == null || (d2 = J3.d()) == null || (l30Var = (l30) d2.get(i15)) == null || (str2 = l30Var.t()) == null) {
                str2 = "0";
            }
            hashMap.put("internal_item_id", str2);
        }
        hashMap.put("pin_column_index", String.valueOf(i13 + 1));
        hashMap.put("number_of_columns", String.valueOf(i14));
        b0Var.getClass();
        b0.b(f30Var, z15, hashMap);
        if (b40.p0(f30Var) || b40.S0(f30Var)) {
            com.pinterest.api.model.g t33 = f30Var.t3();
            hashMap.put("shopping_integration_type", t33 != null ? String.valueOf(t33.k0()) : "0");
        }
    }

    public static final void a0(f30 pin) {
        String str;
        km0 km0Var;
        List o13;
        List t13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        wy0 F = pin.t5() == null ? b40.F(pin) : null;
        if (F == null && (F = b40.n(pin)) == null) {
            F = pin.I5();
        }
        wy0 I5 = pin.I5();
        String z43 = I5 != null ? I5.z4() : null;
        wy0 n13 = b40.n(pin);
        String z44 = n13 != null ? n13.z4() : null;
        wy0 C5 = pin.C5();
        String z45 = C5 != null ? C5.z4() : null;
        wy0 F2 = b40.F(pin);
        String message = a.a.q(a.a.w("closeup pinner [", z43, "] creator [", z44, "] original pinner ["), z45, "] original upload user [", F2 != null ? F2.z4() : null, "]");
        Intrinsics.checkNotNullParameter(message, "message");
        boolean P0 = b40.P0(pin);
        boolean F1 = j1.F1(pin);
        String message2 = "closeup pin isStaticImageIdeaPin [" + P0 + "] shouldShowPDP [" + F1 + "]";
        Intrinsics.checkNotNullParameter(message2, "message");
        if (!F1 && F != null) {
            String t03 = dl2.b.t0(F);
            ((hs1.m) hs1.t.a()).q(t03, null, null);
            String message3 = "prefetch avatar image: ".concat(t03);
            Intrinsics.checkNotNullParameter(message3, "message");
        }
        if (!P0) {
            um umVar = (um) CollectionsKt.firstOrNull(g0.q(pin));
            if (umVar == null || (str = umVar.f42586c) == null) {
                return;
            }
            ((hs1.m) hs1.t.a()).q(str, null, null);
            String message4 = "prefetch regular closeup large image: ".concat(str);
            Intrinsics.checkNotNullParameter(message4, "message");
            return;
        }
        dl0 v63 = pin.v6();
        uo0 uo0Var = (v63 == null || (t13 = v63.t()) == null) ? null : (uo0) t13.get(0);
        if (uo0Var == null || (o13 = uo0Var.o()) == null) {
            km0Var = null;
        } else {
            j0 j0Var = new j0();
            Iterator it = o13.iterator();
            while (it.hasNext()) {
                ((ro0) it.next()).a(new rf1.b0(j0Var, Unit.f80348a));
            }
            km0Var = (km0) j0Var.f80434a;
        }
        if (km0Var != null) {
            String b13 = as1.b.a().b();
            Intrinsics.checkNotNullExpressionValue(b13, "getDisplayLargeImageWidth(...)");
            String e13 = as1.b.a().e();
            Intrinsics.checkNotNullExpressionValue(e13, "getFallbackLargeImageResolution(...)");
            String C = c3.C(km0Var, b13, e13);
            ((hs1.m) hs1.t.a()).q(C, null, null);
            String message5 = "prefetch StaticImageIdeaPin closeup large image: ".concat(C);
            Intrinsics.checkNotNullParameter(message5, "message");
        }
    }

    public static final void b(View flipButton) {
        Intrinsics.checkNotNullParameter(flipButton, "flipButton");
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(500L);
        flipButton.startAnimation(rotateAnimation);
    }

    public static final kk2.t b0(Context context, Bitmap bitmap, File filePath, String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        kk2.t r13 = new kk2.k(new k11.l(context, bitmap, fileName, filePath, 2), 1).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        return r13;
    }

    public static final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int max = Math.max(view.getHeight(), view.getMeasuredWidth());
        Intrinsics.checkNotNullExpressionValue(view.getResources(), "getResources(...)");
        float f13 = (float) (-(a0.K(4, r1) / max));
        view.animate().setInterpolator(new AccelerateInterpolator()).scaleXBy(f13).scaleYBy(f13).start();
    }

    public static final AnimatorSet c0(float f13, View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, f13);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", f13, 0.0f);
        ofFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    public static final ObjectAnimator d0(View view, String property, float f13, float f14, float f15, float f16) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(property, "property");
        s5.a aVar = new s5.a(f15, f16);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, f13, f14);
        ofFloat.setDuration((int) ((aVar.a().size() / 60.0f) * 1000.0f));
        ofFloat.setRepeatCount(0);
        ofFloat.setInterpolator(aVar);
        Intrinsics.checkNotNullExpressionValue(ofFloat, "apply(...)");
        return ofFloat;
    }

    public static final void e(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getScaleX() == 1.0f && view.getScaleY() == 1.0f) {
            return;
        }
        view.animate().setInterpolator(new AccelerateInterpolator()).scaleX(1.0f).scaleY(1.0f).start();
    }

    public static void e0(tc.g writer, pc.v customScalarAdapters, u40.j1 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("entityId");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f120350a);
        writer.M0("imageSpec");
        eVar.d(writer, customScalarAdapters, "345x");
        r0 r0Var = value.f120351b;
        if (r0Var instanceof q0) {
            writer.M0("first");
            pc.c.d(pc.c.f99526g).a(writer, customScalarAdapters, (q0) r0Var);
        }
        r0 r0Var2 = value.f120352c;
        if (r0Var2 instanceof q0) {
            writer.M0("after");
            pc.c.d(pc.c.b(eVar)).a(writer, customScalarAdapters, (q0) r0Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f0(eo2.j r4, java.util.Map r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof j72.t
            if (r0 == 0) goto L13
            r0 = r6
            j72.t r0 = (j72.t) r0
            int r1 = r0.f74915t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74915t = r1
            goto L18
        L13:
            j72.t r0 = new j72.t
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f74914s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f74915t
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.util.Map r4 = r0.f74913r
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            ue.c.H(r6)
            goto L4c
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            ue.c.H(r6)
            y1.b r6 = new y1.b
            r2 = 17
            r6.<init>(r5, r2)
            r2 = r5
            java.util.Map r2 = (java.util.Map) r2
            r0.f74913r = r2
            r0.f74915t = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L4c
            return r1
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.a.f0(eo2.j, java.util.Map, bl2.c):java.lang.Object");
    }

    public static final void g(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getScaleX() == 1.0f && view.getScaleY() == 1.0f && view.getElevation() == 0.0f) {
            return;
        }
        view.animate().rotation(0.0f).setInterpolator(new AccelerateInterpolator()).scaleX(1.0f).scaleY(1.0f).withEndAction(new q5.z(view, 6)).start();
    }

    public static final int g0(Integer num, Context context) {
        Intrinsics.checkNotNullParameter(num, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((num.floatValue() * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final void h(GestaltListAction gestaltListAction, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltListAction, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        k0 k0Var = new k0(gestaltListAction.g0());
        init.invoke(k0Var);
        ql1.k nextState = new ql1.k(k0Var, 26);
        Intrinsics.checkNotNullParameter(nextState, "nextState");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public static final na2.e h0(ba baVar, dc0.q repSize) {
        ?? r23;
        List y03;
        Intrinsics.checkNotNullParameter(baVar, "<this>");
        Intrinsics.checkNotNullParameter(repSize, "repSize");
        List y13 = baVar.y();
        if (y13 == null || (y03 = CollectionsKt.y0(y13, 3)) == null) {
            r23 = 0;
        } else {
            List<f30> list = y03;
            r23 = new ArrayList(kotlin.collections.g0.q(list, 10));
            for (f30 f30Var : list) {
                String B0 = bs1.c.B0(f30Var);
                if (B0 == null) {
                    B0 = f30Var.y4();
                }
                r23.add(B0);
            }
        }
        if (r23 == 0) {
            r23 = kotlin.collections.q0.f80391a;
        }
        String A = baVar.A();
        Intrinsics.checkNotNullExpressionValue(A, "getTitle(...)");
        Integer x13 = baVar.x();
        Intrinsics.checkNotNullExpressionValue(x13, "getPinCount(...)");
        return new na2.e(repSize, r23, A, x13.intValue());
    }

    public static final void i(GestaltButtonSocial gestaltButtonSocial, yq1.y onClick) {
        Intrinsics.checkNotNullParameter(gestaltButtonSocial, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        gestaltButtonSocial.s(new yl1.j(1, onClick));
    }

    public static final ye1.o i0(vh vhVar) {
        Intrinsics.checkNotNullParameter(vhVar, "<this>");
        List list = vhVar.f42865w;
        Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dl1.s sVar = (dl1.s) it.next();
            xk xkVar = sVar instanceof xk ? (xk) sVar : null;
            if (xkVar != null) {
                arrayList.add(xkVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(n10.b.b((xk) it2.next()));
        }
        kj kjVar = vhVar.f42855m;
        String a13 = kjVar != null ? kjVar.a() : null;
        if (a13 == null) {
            a13 = "";
        }
        String str = vhVar.f42852j;
        Intrinsics.checkNotNullExpressionValue(str, "getContentIds(...)");
        String e13 = vhVar.f42857o.e();
        Intrinsics.checkNotNullExpressionValue(e13, "getActionDeepLink(...)");
        return new ye1.o(a13, str, e13, arrayList2);
    }

    public static int j(int i13, int i14) {
        long j13 = i13 + i14;
        int i15 = (int) j13;
        if (j13 == ((long) i15)) {
            return i15;
        }
        throw new ArithmeticException(cb.j("overflow: checkedAdd(", i13, ", ", i14, ")"));
    }

    public static Type k(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            throw new IllegalArgumentException();
        }
        Type h10 = pe2.b.h(type, Collection.class, pe2.b.c(type, Collection.class, Collection.class), new LinkedHashSet());
        if (h10 instanceof WildcardType) {
            h10 = ((WildcardType) h10).getUpperBounds()[0];
        }
        return h10 instanceof ParameterizedType ? ((ParameterizedType) h10).getActualTypeArguments()[0] : Object.class;
    }

    public static final ValueAnimator l(Context context, int i13, int i14, sf1.b bVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i13), Integer.valueOf(i14));
        ofObject.addUpdateListener(bVar);
        ofObject.setDuration(300L);
        Intrinsics.checkNotNullExpressionValue(ofObject, "apply(...)");
        return ofObject;
    }

    public static void m(Context context, TextSwitcher switcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(switcher, "switcher");
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        loadAnimation.setDuration(85L);
        loadAnimation2.setDuration(85L);
        switcher.setInAnimation(loadAnimation);
        switcher.setOutAnimation(loadAnimation2);
    }

    public static void n(GestaltTextField viewToShow, GestaltText viewToHide) {
        Intrinsics.checkNotNullParameter(viewToShow, "viewToShow");
        Intrinsics.checkNotNullParameter(viewToHide, "viewToHide");
        s(viewToShow, 0L, null, 2);
        u(viewToHide, 8, 0L, 4);
    }

    public static final int o(tp page) {
        Pair h10;
        xk2.w wVar;
        Intrinsics.checkNotNullParameter(page, "page");
        if (page.P()) {
            return 1200;
        }
        int i13 = 0;
        for (bo0 bo0Var : page.getMediaList().getItems()) {
            k01 videoItem = bo0Var.getVideoItem();
            int intValue = (videoItem == null || (wVar = videoItem.f39240c) == null) ? 0 : ((Number) wVar.f135234a).intValue();
            if (intValue > i13) {
                i13 = intValue;
            }
            d30 photoItem = bo0Var.getPhotoItem();
            int intValue2 = (photoItem == null || (h10 = photoItem.h()) == null) ? 0 : ((Number) h10.f80346a).intValue();
            if (intValue2 > i13) {
                i13 = intValue2;
            }
        }
        if (i13 == 0 || i13 >= 1200) {
            return 1200;
        }
        return Math.max(i13, 75);
    }

    public static void p() {
        jh0.e eVar = f79368e;
        if (eVar != null) {
            eVar.a(false);
        }
        f79368e = null;
    }

    public static int q(int i13, int i14, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i14 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i15 = i13 / i14;
        int i16 = i13 - (i14 * i15);
        if (i16 == 0) {
            return i15;
        }
        int i17 = ((i13 ^ i14) >> 31) | 1;
        switch (rk.d.f108436a[roundingMode.ordinal()]) {
            case 1:
                kotlin.jvm.internal.r.n(i16 == 0);
                return i15;
            case 2:
                return i15;
            case 3:
                if (i17 >= 0) {
                    return i15;
                }
                break;
            case 4:
                break;
            case 5:
                if (i17 <= 0) {
                    return i15;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i16);
                int abs2 = abs - (Math.abs(i14) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i15 & 1) != 0))) {
                            return i15;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i15;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i15 + i17;
    }

    public static boolean r(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? r(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return r(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof Util$ParameterizedTypeImpl ? ((Util$ParameterizedTypeImpl) parameterizedType).f52911c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof Util$ParameterizedTypeImpl ? ((Util$ParameterizedTypeImpl) parameterizedType2).f52911c : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return r(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return r(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static void s(View view, long j13, Animator.AnimatorListener animatorListener, int i13) {
        if ((i13 & 2) != 0) {
            Resources resources = view.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Intrinsics.checkNotNullParameter(resources, "<this>");
            j13 = resources.getInteger(R.integer.config_shortAnimTime);
        }
        if ((i13 & 4) != 0) {
            animatorListener = null;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getVisibility() == 0) {
            return;
        }
        bs1.c.U1(view);
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(j13).setListener(animatorListener);
    }

    public static final ViewPropertyAnimator t(View view, int i13, long j13) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getVisibility() != 0) {
            return null;
        }
        view.animate().cancel();
        return view.animate().alpha(0.0f).setDuration(j13).setListener(new go1.a(view, i13));
    }

    public static void u(View view, int i13, long j13, int i14) {
        if ((i14 & 2) != 0) {
            i13 = 8;
        }
        if ((i14 & 4) != 0) {
            Resources resources = view.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Intrinsics.checkNotNullParameter(resources, "<this>");
            j13 = resources.getInteger(R.integer.config_shortAnimTime);
        }
        t(view, i13, j13);
    }

    public static final String v() {
        return "watermark_group_item" + UUID.randomUUID();
    }

    public static final String w() {
        return "watermark_item" + UUID.randomUUID();
    }

    public static final kk2.t x(Application application, tp page) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(page, "page");
        kk2.t r13 = new kk2.k(new a.g0(14, page, application), 1).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        return r13;
    }

    public static final kk2.t y(Context context, tp page, so aspectRatio) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        if (Intrinsics.d(page.getContentModified(), Boolean.FALSE)) {
            d30 B = page.B();
            if (!U(B != null ? B.e() : null)) {
                return x(application, page);
            }
        }
        d30 photoItem = page.B();
        if (photoItem == null) {
            throw new IllegalArgumentException("Unable to generate adjusted image - invalid static photoItem");
        }
        uf1.c cVar = new uf1.c(context, (float) aspectRatio.d(), Integer.valueOf(o(page)));
        Intrinsics.checkNotNullParameter(photoItem, "photoItem");
        fk2.c l13 = new fk2.g(new uv0.a(8, cVar, photoItem), 0).l(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
        RectF rectF = cVar.f122109J;
        cVar.measure(View.MeasureSpec.makeMeasureSpec(ml2.c.c(rectF.width()), 1073741824), View.MeasureSpec.makeMeasureSpec(ml2.c.c(rectF.height()), 1073741824));
        cVar.layout(0, 0, cVar.getMeasuredWidth(), cVar.getMeasuredHeight());
        kk2.t r13 = new kk2.k(new k1(cVar, 19), 1).r(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        return new kk2.m(l13.c(r13), new ic1.a(17, new uv0.c(context, application, 1)), 0).r(wj2.c.a());
    }

    public static final kk2.t z(Context context, tp page, so aspectRatio, ag1.b dataManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        kk2.t r13 = new kk2.m(new kk2.k(new k11.l(page.getMediaList().k(), context, aspectRatio, dataManager, 1), 1), new ic1.a(16, new uv0.c(context, (Application) applicationContext, 2)), 0).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        return r13;
    }
}
