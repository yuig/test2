package kotlin.jvm.internal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.l1;
import androidx.lifecycle.u1;
import ao2.i1;
import ao2.x0;
import b4.s0;
import b4.t0;
import b4.u0;
import com.pinterest.activity.create.CameraActivity;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.h80;
import com.pinterest.api.model.oe0;
import com.pinterest.api.model.r40;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.t6;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.x20;
import com.pinterest.experience.models.framework.ExperienceDataDeserializationException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.closeup.view.o1;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.d2;
import i2.f2;
import i2.q1;
import i2.y3;
import i2.z1;
import io.embrace.android.embracesdk.internal.payload.Attribute;
import io.embrace.android.embracesdk.internal.payload.Span;
import io.embrace.android.embracesdk.internal.payload.SpanEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kh2.c3;
import kh2.j1;
import kh2.p2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import lh0.a4;
import lh0.g1;
import lh0.g2;
import lh0.h2;
import lh0.r1;
import lh0.z0;
import lh0.z3;
import q5.v0;
import rc0.w0;
import s80.e2;
import so.n7;
import so.r8;
import x02.i2;
import x02.w1;

/* loaded from: classes4.dex */
public abstract class r {

    /* renamed from: a */
    public static boolean f80442a = false;

    /* renamed from: b */
    public static Method f80443b = null;

    /* renamed from: c */
    public static boolean f80444c = false;

    /* renamed from: d */
    public static Field f80445d = null;

    /* renamed from: e */
    public static boolean f80446e = true;

    public static void A(sx0.g gVar, h12.a aVar) {
        gVar.I0 = aVar;
    }

    public static void B(sx0.g gVar, no1.d dVar) {
        gVar.J0 = dVar;
    }

    public static void C(sx0.g gVar, fp.b bVar) {
        gVar.K0 = bVar;
    }

    public static void D(it0.c cVar, nr0.m mVar) {
        cVar.V0 = mVar;
    }

    public static void E(sx0.g gVar, zf0.f fVar) {
        gVar.f115624z0 = fVar;
    }

    public static void F(it0.c cVar, r1 r1Var) {
        cVar.S0 = r1Var;
    }

    public static void G(sx0.g gVar, h2 h2Var) {
        gVar.D0 = h2Var;
    }

    public static void H(e2 e2Var, n72.b bVar) {
        e2Var.f111510c0 = bVar;
    }

    public static void I(sx0.g gVar, uo.a aVar) {
        gVar.C0 = aVar;
    }

    public static void J(e2 e2Var, m72.a aVar) {
        e2Var.f111511d0 = aVar;
    }

    public static void K(sx0.g gVar, r8 r8Var) {
        gVar.F0 = r8Var;
    }

    public static void L(sx0.g gVar, w1 w1Var) {
        gVar.A0 = w1Var;
    }

    public static void M(sx0.g gVar, w12.b bVar) {
        gVar.B0 = bVar;
    }

    public static void N(it0.c cVar, m60.g0 g0Var) {
        cVar.U0 = g0Var;
    }

    public static void O(sx0.g gVar, m60.g0 g0Var) {
        gVar.G0 = g0Var;
    }

    public static void P(it0.c cVar, xs0.l lVar) {
        cVar.W0 = lVar;
    }

    public static void Q(it0.c cVar, ni1.d0 d0Var) {
        cVar.X0 = d0Var;
    }

    public static void R(it0.c cVar, i2 i2Var) {
        cVar.R0 = i2Var;
    }

    public static void S(it0.c cVar, uk1.e eVar) {
        cVar.T0 = eVar;
    }

    public static void T(mr0.e eVar, uk1.e eVar2) {
        eVar.f88084z0 = eVar2;
    }

    public static void U(sx0.g gVar, uk1.e eVar) {
        gVar.E0 = eVar;
    }

    public static void V(e2 e2Var, g62.d dVar) {
        e2Var.f111512e0 = dVar;
    }

    public static void W(mr0.e eVar, n7 n7Var) {
        eVar.A0 = n7Var;
    }

    public static void X(CameraActivity cameraActivity, lb0.q qVar) {
        cameraActivity.f34915z = qVar;
    }

    public static void Y(CameraActivity cameraActivity, vo.u uVar) {
        cameraActivity.f34914y = uVar;
    }

    public static x0 Z(long j13, Runnable runnable, CoroutineContext coroutineContext) {
        return ao2.o0.f20186a.a(j13, runnable, coroutineContext);
    }

    public static /* synthetic */ void a(int i13) {
        Object[] objArr = new Object[3];
        if (i13 == 1 || i13 == 2) {
            objArr[0] = "companionObject";
        } else if (i13 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i13 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i13 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i13 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean a0(int i13, Object obj) {
        if (!(obj instanceof List)) {
            return !(obj instanceof String) || ((String) obj).length() < i13;
        }
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            if (!a0(i13, it.next())) {
                return false;
            }
        }
        return true;
    }

    public static b4.b b(String str, b4.q0 q0Var, long j13, n4.b bVar, g4.d dVar, kotlin.collections.q0 q0Var2, int i13, int i14) {
        return new b4.b(new j4.d(q0Var, dVar, bVar, str, (i14 & 32) != 0 ? kotlin.collections.q0.f80391a : q0Var2, kotlin.collections.q0.f80391a), i13, false, j13);
    }

    public static final List b0(String str, boolean z13) {
        int i13 = aq1.d.product_search;
        int i14 = aq1.h.idea_pin_search_pins;
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_STORY_PIN_PRODUCT_ID", str);
        bundle.putBoolean("com.pinterest.EXTRA_IDEA_PIN_METADATA_IS_FROM_FINISHING_TOUCHES", z13);
        kv0.q qVar = new kv0.q(i13, i14, (ScreenLocation) d2.f50662w.getValue(), bundle);
        int i15 = aq1.d.affiliate_links;
        int i16 = aq1.h.idea_pin_link_tagging;
        Bundle bundle2 = new Bundle();
        bundle2.putString("com.pinterest.EXTRA_STORY_PIN_PRODUCT_ID", str);
        bundle2.putBoolean("com.pinterest.EXTRA_IDEA_PIN_METADATA_IS_FROM_FINISHING_TOUCHES", z13);
        return kotlin.collections.f0.j(qVar, new kv0.q(i15, i16, (ScreenLocation) d2.f50658s.getValue(), bundle2));
    }

    public static final void c(om0.q0 state, u2.q qVar, float f13, i2.o oVar, int i13, int i14) {
        boolean z13;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-2095761192);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        float f14 = (i14 & 4) != 0 ? 0 : f13;
        p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar, 0);
        int i16 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, qVar2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        u50.i0 i0Var = state.f96569a;
        sVar.W(-1832720465);
        if (!kotlin.text.z.j((CharSequence) dl2.b.u2(i0Var, sVar))) {
            rn1.a aVar = new rn1.a(i0Var, vn1.c.DEFAULT, null, null, vn1.g.UI_200, 1, null, rn1.b.END, null, null, false, 0, null, null, null, false, null, null, 2096972);
            z13 = true;
            dl2.b.c(aVar, null, null, null, sVar, 8, 14);
        } else {
            z13 = true;
        }
        sVar.r(false);
        u50.i0 i0Var2 = state.f96570b;
        if (kotlin.text.z.j((CharSequence) dl2.b.u2(i0Var2, sVar)) ^ z13) {
            sVar.W(-1832705028);
            if (Float.compare(f14, 0) > 0) {
                androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, f14), sVar);
            }
            sVar.r(false);
            dl2.b.c(new rn1.a(i0Var2, vn1.c.SUBTLE, null, null, vn1.g.BODY_200, 1, null, rn1.b.END, null, null, false, 0, null, null, null, false, null, null, 2096972), null, null, null, sVar, 8, 14);
        }
        sVar.r(z13);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new om0.p0(state, qVar2, f14, i13, i14);
        }
    }

    public static final i1 c0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name, "name");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new en0.d(name));
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return new i1(newSingleThreadExecutor);
    }

    public static final void d(uc0.f2 f2Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1931364460);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(f2Var)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i16 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                l1 v03 = c3.v0(uc0.f2.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                f2Var = (uc0.f2) v03;
            }
            sVar.s();
            q1 z13 = bs1.c.z(f2Var.f121825e, sVar);
            f2Var.i(new uc0.i(new oc0.a(q2.i.c(-1765787852, new xb0.a(f2Var, 14), sVar))));
            gh0.b.d(((uc0.e2) z13.getValue()).f121777a, null, sVar, 8, 2);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(f2Var, i13, i14, 24);
        }
    }

    public static final Object d0(vd0.c cVar, String propertyName, Function1 objectMapper) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        vd0.c m13 = cVar.m(propertyName);
        if (m13 == null) {
            return null;
        }
        Object obj = ((xk2.s) objectMapper.invoke(m13)).f135226a;
        ue.c.H(obj);
        return obj;
    }

    public static final void e() {
        Intrinsics.checkNotNullParameter("An operation is not implemented: Should be unreachable", "message");
        throw new xk2.o("An operation is not implemented: Should be unreachable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public static final List e0(vd0.a aVar) {
        TypeAheadItem.f35139u.add(er.c.CONVERSATION);
        ?? r03 = kotlin.collections.q0.f80391a;
        if (aVar != null) {
            r03 = new ArrayList();
            int d2 = aVar.d();
            for (int i13 = 0; i13 < d2; i13++) {
                try {
                    vd0.c j13 = aVar.j(i13);
                    TypeAheadItem typeAheadItem = new TypeAheadItem();
                    typeAheadItem.u(j13);
                    if (!TypeAheadItem.f35139u.contains(typeAheadItem.f35145f)) {
                        r03.add(typeAheadItem);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return r03;
    }

    public static void f(x92.b apiFieldsMap) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        g2 d2 = g2.f83370b.d();
        el.a.r(apiFieldsMap);
        apiFieldsMap.e("boardsection.pin_count");
        apiFieldsMap.e("boardsection.preview_pins()");
        apiFieldsMap.e("boardsection.eligible_pin_type_filters");
        apiFieldsMap.e("pin.rich_summary()");
        pk.a0.c(apiFieldsMap);
        xk2.v vVar = n00.v.f88794a;
        n60.o.C(apiFieldsMap, "<this>", "shuffle.is_draft", "shuffle.type", "shuffle.images[70x,345x,750x]");
        bz.h.f(apiFieldsMap);
        bz.h.e(apiFieldsMap);
        z3 z3Var = a4.f83297a;
        z0 z0Var = d2.f83373a;
        g1 g1Var = (g1) z0Var;
        if (!g1Var.o("android_curated_articles_to_board_shift", "enabled", z3Var) && !g1Var.l("android_curated_articles_to_board_shift")) {
            g1 g1Var2 = (g1) z0Var;
            if (!g1Var2.o("android_curated_articles_to_board_pwt", "enabled", z3Var) && !g1Var2.l("android_curated_articles_to_board_pwt")) {
                return;
            }
        }
        n60.o.v(apiFieldsMap, "boardsection.description", "board.featured_board_metadata()", "featuredboard.board_tag");
    }

    public static void f0(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j13 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Animator animator = (Animator) arrayList.get(i13);
            j13 = Math.max(j13, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j13);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static void g(x92.b bVar) {
        j1.G(bVar);
        bVar.e("interest.is_followed");
        bVar.e("interest.recommendation_source");
        bVar.e("interest.image_signature");
        bVar.h("interest.images", "236x");
    }

    public static void g0(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static Object h(int i13, Object obj) {
        if (i13 == Integer.MAX_VALUE) {
            return obj;
        }
        if (!(obj instanceof List)) {
            if (!(obj instanceof String)) {
                return obj;
            }
            String str = (String) obj;
            return str.length() < i13 ? obj : str.substring(0, i13);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h(i13, it.next()));
        }
        return arrayList;
    }

    public static final om0.q0 h0(String string, String string2) {
        Intrinsics.checkNotNullParameter(string, "title");
        Intrinsics.checkNotNullParameter(string2, "description");
        Intrinsics.checkNotNullParameter(string, "string");
        u50.f0 f0Var = new u50.f0(string);
        Intrinsics.checkNotNullParameter(string2, "string");
        return new om0.q0(f0Var, new u50.f0(string2));
    }

    public static boolean i(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i13 = 0; i13 != bArr.length; i13++) {
            if (bArr[i13] != bArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    public static String i0(vd0.c cVar, String propertyName) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        String d2 = cVar.d(propertyName);
        if (d2 != null) {
            return d2;
        }
        int i13 = ExperienceDataDeserializationException.f45050c;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        throw new ExperienceDataDeserializationException((hh0.f) null, "ERR_MISSING_REQUIRED_PROPERTY", y0.b(new Pair("unknown_property_name", propertyName)), 8);
    }

    public static boolean j(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i13 = 0; i13 != iArr.length; i13++) {
            if (iArr[i13] != iArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    public static void j0(Activity activity) {
        activity.setEnterSharedElementCallback(null);
    }

    public static final String k(Enum r83) {
        List split$default;
        Intrinsics.checkNotNullParameter(r83, "<this>");
        String name = r83.name();
        Locale locale = Locale.US;
        split$default = StringsKt__StringsKt.split$default(ep.b.l(locale, "US", name, locale, "toLowerCase(...)"), new String[]{"_"}, false, 0, 6, null);
        return CollectionsKt.Z(split$default, " ", null, null, 0, null, w0.M, 30);
    }

    public static void k0(Activity activity) {
        activity.setExitSharedElementCallback(null);
    }

    public static void l(boolean z13, long j13, long j14) {
        if (!z13) {
            throw new ArithmeticException(a.a.o(a.a.u("overflow: checkedAdd(", j13, ", "), j14, ")"));
        }
    }

    public static void l0() {
        f80446e = false;
    }

    public static void m(long j13, String str) {
        if (j13 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j13 + ") must be >= 0");
    }

    public static final void m0(rq config, ImageView imageView, Bitmap bitmap, float f13, float f14, float f15, o1 o1Var, Function0 function0, float f16, float f17) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (config.getMatrix() == null) {
            RectF rectF = new RectF(0.0f, 0.0f, (bitmap != null ? Integer.valueOf(bitmap.getWidth()) : Float.valueOf(f16)).floatValue(), (bitmap != null ? Integer.valueOf(bitmap.getHeight()) : Float.valueOf(f17)).floatValue());
            RectF rectF2 = new RectF((f13 - f15) / 2.0f, (f14 - f15) / 2.0f, (f13 + f15) / 2.0f, (f14 + f15) / 2.0f);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            imageView.setImageMatrix(matrix);
            Drawable drawable = imageView.getDrawable();
            RectF rectF3 = new RectF(drawable != null ? drawable.getBounds() : null);
            if (o1Var != null) {
                ((com.pinterest.feature.ideaPinCreation.closeup.view.f0) o1Var).L0(config.getId(), matrix, ig1.b.J0(matrix, rectF3));
            }
        } else {
            imageView.setImageMatrix(config.getMatrix());
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static void n(boolean z13) {
        if (!z13) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void n0(Activity activity) {
        activity.startPostponedEnterTransition();
    }

    public static final q1 o(o1.k kVar, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            J2 = bs1.c.u1(Boolean.FALSE, y3.f71400a);
            sVar.g0(J2);
        }
        q1 q1Var = (q1) J2;
        boolean z13 = (((i13 & 14) ^ 6) > 4 && sVar.h(kVar)) || (i13 & 6) == 4;
        Object J3 = sVar.J();
        if (z13 || J3 == dVar) {
            J3 = new o1.g(kVar, q1Var, null);
            sVar.g0(J3);
        }
        i2.u.e(kVar, (Function2) J3, sVar);
        return q1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    public static final SpannableString o0(b4.g gVar, n4.b bVar, j4.m mVar) {
        ?? r43;
        int i13;
        kotlin.collections.q0 q0Var;
        int i14;
        String str = gVar.f21571a;
        SpannableString spannableString = new SpannableString(str);
        List list = gVar.f21572b;
        if (list != null) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                b4.e eVar = (b4.e) list.get(i15);
                b4.g0 g0Var = (b4.g0) eVar.f21542a;
                long b13 = g0Var.f21575a.b();
                m4.o oVar = g0Var.f21575a;
                if (!b3.w.c(b13, oVar.b())) {
                    oVar = b13 != 16 ? new m4.c(b13) : m4.m.f85803a;
                }
                long b14 = oVar.b();
                int i16 = eVar.f21543b;
                int i17 = eVar.f21544c;
                l3.c.P0(spannableString, b14, i16, i17);
                l3.c.Q0(spannableString, g0Var.f21576b, bVar, i16, i17);
                g4.l lVar = g0Var.f21577c;
                g4.j jVar = g0Var.f21578d;
                if (lVar == null && jVar == null) {
                    i14 = i17;
                } else {
                    if (lVar == null) {
                        lVar = g4.l.f63469d;
                    }
                    StyleSpan styleSpan = new StyleSpan(kh2.n.t(lVar, jVar != null ? jVar.f63465a : 0));
                    i14 = i17;
                    spannableString.setSpan(styleSpan, i16, i14, 33);
                }
                m4.k kVar = g0Var.f21587m;
                if (kVar != null) {
                    int i18 = kVar.f85801a;
                    if ((i18 | 1) == i18) {
                        spannableString.setSpan(new UnderlineSpan(), i16, i14, 33);
                    }
                    if ((i18 | 2) == i18) {
                        spannableString.setSpan(new StrikethroughSpan(), i16, i14, 33);
                    }
                }
                m4.p pVar = g0Var.f21584j;
                if (pVar != null) {
                    spannableString.setSpan(new ScaleXSpan(pVar.f85807a), i16, i14, 33);
                }
                i4.c cVar = g0Var.f21585k;
                if (cVar != null) {
                    spannableString.setSpan(k4.a.f78262a.a(cVar), i16, i14, 33);
                }
                long j13 = g0Var.f21586l;
                if (j13 != 16) {
                    spannableString.setSpan(new BackgroundColorSpan(androidx.compose.ui.graphics.a.u(j13)), i16, i14, 33);
                }
            }
        }
        int length = str.length();
        List list2 = gVar.f21574d;
        if (list2 != null) {
            r43 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i19 = 0; i19 < size2; i19++) {
                Object obj = list2.get(i19);
                b4.e eVar2 = (b4.e) obj;
                if ((eVar2.f21542a instanceof s0) && b4.h.c(0, length, eVar2.f21543b, eVar2.f21544c)) {
                    r43.add(obj);
                }
            }
        } else {
            r43 = kotlin.collections.q0.f80391a;
        }
        Intrinsics.g(r43, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        int size3 = r43.size();
        for (int i23 = 0; i23 < size3; i23++) {
            b4.e eVar3 = (b4.e) r43.get(i23);
            s0 s0Var = (s0) eVar3.f21542a;
            if (!(s0Var instanceof u0)) {
                throw new NoWhenBranchMatchedException();
            }
            spannableString.setSpan(new TtsSpan.VerbatimBuilder(((u0) s0Var).f21663a).build(), eVar3.f21543b, eVar3.f21544c, 33);
        }
        int length2 = str.length();
        if (list2 != null) {
            ?? arrayList = new ArrayList(list2.size());
            int size4 = list2.size();
            for (int i24 = 0; i24 < size4; i24++) {
                Object obj2 = list2.get(i24);
                b4.e eVar4 = (b4.e) obj2;
                if ((eVar4.f21542a instanceof t0) && b4.h.c(0, length2, eVar4.f21543b, eVar4.f21544c)) {
                    arrayList.add(obj2);
                }
            }
            i13 = 0;
            q0Var = arrayList;
        } else {
            i13 = 0;
            q0Var = kotlin.collections.q0.f80391a;
        }
        Intrinsics.g(q0Var, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        int size5 = q0Var.size();
        for (int i25 = i13; i25 < size5; i25++) {
            b4.e eVar5 = (b4.e) q0Var.get(i25);
            t0 t0Var = (t0) eVar5.f21542a;
            WeakHashMap weakHashMap = mVar.f74588a;
            Object obj3 = weakHashMap.get(t0Var);
            if (obj3 == null) {
                obj3 = new URLSpan(t0Var.f21662a);
                weakHashMap.put(t0Var, obj3);
            }
            spannableString.setSpan((URLSpan) obj3, eVar5.f21543b, eVar5.f21544c, 33);
        }
        List a13 = gVar.a(str.length());
        int size6 = a13.size();
        for (int i26 = i13; i26 < size6; i26++) {
            b4.e eVar6 = (b4.e) a13.get(i26);
            int i27 = eVar6.f21543b;
            int i28 = eVar6.f21544c;
            if (i27 != i28) {
                Object obj4 = eVar6.f21542a;
                b4.n nVar = (b4.n) obj4;
                if (nVar instanceof b4.m) {
                    nVar.getClass();
                    Intrinsics.g(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    b4.m mVar2 = (b4.m) obj4;
                    b4.e eVar7 = new b4.e(mVar2, i27, i28);
                    WeakHashMap weakHashMap2 = mVar.f74589b;
                    Object obj5 = weakHashMap2.get(eVar7);
                    if (obj5 == null) {
                        obj5 = new URLSpan(mVar2.f21613a);
                        weakHashMap2.put(eVar7, obj5);
                    }
                    spannableString.setSpan((URLSpan) obj5, i27, i28, 33);
                } else {
                    WeakHashMap weakHashMap3 = mVar.f74590c;
                    Object obj6 = weakHashMap3.get(eVar6);
                    if (obj6 == null) {
                        obj6 = new j4.f((b4.n) obj4);
                        weakHashMap3.put(eVar6, obj6);
                    }
                    spannableString.setSpan((ClickableSpan) obj6, i27, i28, 33);
                }
            }
        }
        return spannableString;
    }

    public static boolean p(View view, KeyEvent keyEvent) {
        WeakHashMap weakHashMap = v0.f102521a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q5.u0.a(view).d(keyEvent);
    }

    public static final r10.a p0(oe0 oe0Var, String pinId) {
        List list;
        Intrinsics.checkNotNullParameter(oe0Var, "<this>");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        t6 o13 = oe0Var.o();
        if (o13 == null) {
            return null;
        }
        String n13 = oe0Var.n();
        String p13 = oe0Var.p();
        String q13 = oe0Var.q();
        String t13 = oe0Var.t();
        String u13 = oe0Var.u();
        String w13 = oe0Var.w();
        List<x20> g13 = o13.g();
        if (g13 != null) {
            Intrinsics.checkNotNullParameter(g13, "<this>");
            ArrayList arrayList = new ArrayList();
            for (x20 x20Var : g13) {
                Intrinsics.checkNotNullParameter(x20Var, "<this>");
                arrayList.add(new q10.a(x20Var.e(), x20Var.d()));
            }
            list = CollectionsKt.F0(arrayList);
        } else {
            list = null;
        }
        return new r10.a(n13, p13, q13, t13, u13, w13, pinId, list, o13.h(), o13.i(), o13.k(), o13.j());
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f9, code lost:
    
        if (q5.u0.a(r9).b(r9, r11) == false) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean q(q5.k r8, android.view.View r9, android.view.Window.Callback r10, android.view.KeyEvent r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.r.q(q5.k, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static final ga0.i q0(fa0.z0 z0Var) {
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        if (z0Var instanceof fa0.y0) {
            return new ga0.i();
        }
        if (!(z0Var instanceof fa0.x0)) {
            throw new NoWhenBranchMatchedException();
        }
        fa0.x0 x0Var = (fa0.x0) z0Var;
        return new ga0.i(kh2.n.p0(x0Var.f61543a, true), ea0.v.a(x0Var.f61543a, rl1.r.LG, false, 2));
    }

    public static final long r(long j13, boolean z13, int i13, float f13) {
        int h10 = ((z13 || kh2.s0.B(i13, 2)) && n4.a.d(j13)) ? n4.a.h(j13) : Integer.MAX_VALUE;
        if (n4.a.j(j13) != h10) {
            h10 = ql2.s.g(w1.g1.o(f13), n4.a.j(j13), h10);
        }
        int g13 = n4.a.g(j13);
        int min = Math.min(0, 262142);
        int min2 = h10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(h10, 262142);
        int g14 = bs1.c.g(min2 == Integer.MAX_VALUE ? min : min2);
        return bs1.c.a(min, min2, Math.min(g14, 0), g13 != Integer.MAX_VALUE ? Math.min(g14, g13) : Integer.MAX_VALUE);
    }

    public static final Span r0(Span span, long j13) {
        Intrinsics.checkNotNullParameter(span, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        xf2.e0 fixedAttribute = xf2.e0.f134858c;
        Set set = ei2.d.f58969a;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Intrinsics.checkNotNullParameter(fixedAttribute, "fixedAttribute");
        linkedHashMap.put(fixedAttribute.getKey().f134855a, fixedAttribute.getValue());
        xf2.y fixedAttribute2 = xf2.y.f134904d;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Intrinsics.checkNotNullParameter(fixedAttribute2, "fixedAttribute");
        if (Intrinsics.d(linkedHashMap.get(fixedAttribute2.f134851a.f134855a), fixedAttribute2.f134852b)) {
            xf2.a fixedAttribute3 = xf2.a.f134845c;
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            Intrinsics.checkNotNullParameter(fixedAttribute3, "fixedAttribute");
            linkedHashMap.put(fixedAttribute3.getKey().f134855a, fixedAttribute3.getValue());
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(j13);
        String str = span.f73242c;
        if (str == null) {
            str = "0000000000000000";
        }
        String str2 = str;
        th2.m mVar = th2.m.ERROR;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Attribute((String) entry.getKey(), (String) entry.getValue()));
        }
        List list = span.f73248i;
        return Span.a(span, str2, Long.valueOf(nanos), mVar, CollectionsKt.l0(list != null ? list : kotlin.collections.q0.f80391a, arrayList), RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER);
    }

    public static void s(Activity activity) {
        activity.finishAfterTransition();
    }

    public static final String s0(long j13) {
        String S2;
        if (j13 != 16) {
            try {
                S2 = c0.d.S2(androidx.compose.ui.graphics.a.u(j13));
            } catch (Exception unused) {
                return "";
            }
        } else {
            S2 = "";
        }
        return kotlin.text.z.j(S2) ? "" : S2;
    }

    public static Context t(Context context) {
        int g13;
        Context applicationContext = context.getApplicationContext();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34 && (g13 = d0.i.g(context)) != d0.i.g(applicationContext)) {
            applicationContext = d0.i.a(applicationContext, g13);
        }
        if (i13 < 30) {
            return applicationContext;
        }
        String c13 = e0.g.c(context);
        return !Objects.equals(c13, e0.g.c(applicationContext)) ? e0.g.a(applicationContext, c13) : applicationContext;
    }

    public static final Span t0(ei2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.f58978a;
        String str2 = fVar.f58980c;
        if (str2 == null) {
            str2 = "0000000000000000";
        }
        String str3 = str2;
        Long valueOf = Long.valueOf(fVar.f58982e);
        Long valueOf2 = Long.valueOf(fVar.f58983f);
        th2.m e13 = ei2.d.e(fVar.f58984g);
        List list = fVar.f58985h;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(u0((oi2.c) it.next()));
        }
        return new Span(str, fVar.f58979b, str3, fVar.f58981d, valueOf, valueOf2, e13, arrayList, v0(fVar.f58986i));
    }

    public static final r40 u(oe0 oe0Var) {
        String v13 = oe0Var.v();
        Intrinsics.checkNotNullExpressionValue(v13, "getUid(...)");
        s10.a w03 = w0(oe0Var, v13, null);
        if (w03 != null) {
            return w03;
        }
        String v14 = oe0Var.v();
        Intrinsics.checkNotNullExpressionValue(v14, "getUid(...)");
        t10.f x03 = x0(oe0Var, v14);
        if (x03 != null) {
            return x03;
        }
        String v15 = oe0Var.v();
        Intrinsics.checkNotNullExpressionValue(v15, "getUid(...)");
        return p0(oe0Var, v15);
    }

    public static final SpanEvent u0(oi2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return new SpanEvent(cVar.f95342a, Long.valueOf(cVar.f95343b), v0(cVar.f95344c));
    }

    public static int v(int i13, int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int i14 = i13 + 1;
        while (true) {
            i13--;
            if (i13 < 0) {
                return i14;
            }
            i14 = (i14 * RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER) ^ iArr[i13];
        }
    }

    public static final ArrayList v0(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Attribute((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static int w(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i13 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i13;
            }
            i13 = (i13 * RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER) ^ bArr[length];
        }
    }

    public static final s10.a w0(oe0 oe0Var, String pinId, se0 se0Var) {
        we0 w13;
        Intrinsics.checkNotNullParameter(oe0Var, "<this>");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        List r13 = oe0Var.r();
        List list = null;
        if (r13 == null || r13.size() <= 0) {
            return null;
        }
        h80 h80Var = (h80) r13.get(0);
        List q13 = h80Var.q();
        if (q13 != null && !q13.isEmpty()) {
            list = h80Var.q();
        } else if (se0Var != null && (w13 = kh2.n.w(se0Var)) != null) {
            list = w13.v();
        }
        return new s10.a(oe0Var.n(), oe0Var.p(), oe0Var.q(), oe0Var.t(), oe0Var.u(), oe0Var.w(), pinId, h80Var.s(), h80Var.o(), h80Var.p(), list);
    }

    public static int x(long[] jArr, int i13) {
        if (jArr == null) {
            return 0;
        }
        int i14 = i13 + 1;
        while (true) {
            i13--;
            if (i13 < 0) {
                return i14;
            }
            long j13 = jArr[i13];
            i14 = (((i14 * RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER) ^ ((int) j13)) * RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER) ^ ((int) (j13 >>> 32));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final t10.f x0(com.pinterest.api.model.oe0 r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.r.x0(com.pinterest.api.model.oe0, java.lang.String):t10.f");
    }

    public static void y(it0.c cVar) {
        cVar.getClass();
    }

    public static void z(sx0.g gVar, oc.c cVar) {
        gVar.H0 = cVar;
    }

    public static byte[] z0(byte[]... bArr) {
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= bArr.length) {
                break;
            }
            i14 += bArr[i13].length;
            i13++;
        }
        byte[] bArr2 = new byte[i14];
        int i15 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i15, length);
            i15 += length;
        }
        return bArr2;
    }
}
