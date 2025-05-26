package ve;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.util.Size;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kh;
import com.pinterest.api.model.li;
import com.pinterest.api.model.tg0;
import com.pinterest.api.model.ti;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.vi;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xi;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import df.l1;
import h32.g0;
import h32.u0;
import i2.f2;
import i2.o;
import i2.s;
import i92.k;
import java.io.File;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import jq1.n;
import kh2.s0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import la1.p;
import lh0.f3;
import lh0.p3;
import lq0.k0;
import m60.f0;
import m60.x0;
import pc.q0;
import pc.r0;
import pc.v;
import rh1.h2;
import so.e6;
import so.k9;
import so.q;
import so.t6;
import u50.b0;
import u62.l;
import ue1.t;
import wd.z;
import x40.th;
import xa0.j;
import xe1.r;
import yb1.m;

/* loaded from: classes3.dex */
public abstract class h implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f125675a = 0;

    public static final ShapeDrawable A(int i13, int i14) {
        float f13 = i13;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f13, f13, f13, f13, f13, f13, f13, f13}, null, null));
        shapeDrawable.getPaint().setColor(i14);
        return shapeDrawable;
    }

    public static final Size C(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return new Size(bitmap.getWidth(), bitmap.getHeight());
    }

    public static void D(p pVar) {
        pVar.getClass();
    }

    public static void E(h2 h2Var, e6 e6Var) {
        h2Var.f108157m1 = e6Var;
    }

    public static void F(n nVar) {
        nVar.getClass();
    }

    public static void G(n nVar, f0 f0Var) {
        nVar.f77502i1 = f0Var;
    }

    public static void H(n nVar, hf0.c cVar) {
        nVar.f77501h1 = cVar;
    }

    public static void I(n nVar, q qVar) {
        nVar.f77505l1 = qVar;
    }

    public static void J(n nVar, gq1.b bVar) {
        nVar.f77504k1 = bVar;
    }

    public static void K(n nVar, so.p pVar) {
        nVar.f77503j1 = pVar;
    }

    public static void L(p pVar) {
        pVar.getClass();
    }

    public static void M(p pVar, uk1.e eVar) {
        pVar.A0 = eVar;
    }

    public static void N(m mVar, uk1.e eVar) {
        mVar.A0 = eVar;
    }

    public static void O(p pVar, x10.d dVar) {
        pVar.B0 = dVar;
    }

    public static void P(m mVar, x10.d dVar) {
        mVar.B0 = dVar;
    }

    public static void Q(m mVar, p3 p3Var) {
        mVar.C0 = p3Var;
    }

    public static void R(p pVar, k kVar) {
        pVar.f82547z0 = kVar;
    }

    public static void S(m mVar, k kVar) {
        mVar.f138568z0 = kVar;
    }

    public static void T(h2 h2Var, t6 t6Var) {
        h2Var.f108156l1 = t6Var;
    }

    public static void U(p pVar, UserDeserializer userDeserializer) {
        pVar.C0 = userDeserializer;
    }

    public static final boolean V() {
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        return Intrinsics.d(f13 != null ? f13.G2() : null, "US") && Intrinsics.d(Locale.getDefault().getLanguage(), Locale.ENGLISH.getLanguage());
    }

    public static final boolean W(f3 f3Var, Context context) {
        Intrinsics.checkNotNullParameter(f3Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return dl2.b.T1(context);
    }

    public static final boolean X(xn1.d dVar, int i13) {
        KeyEvent keyEvent;
        if ((dVar == null || dVar.f135444c != i13) && (dVar == null || dVar.f135444c != 0)) {
            if ((dVar != null ? dVar.f135445d : null) == null || (keyEvent = dVar.f135445d) == null || keyEvent.getKeyCode() != 66) {
                return false;
            }
        }
        return true;
    }

    public static void Y(AppCompatImageView appCompatImageView, String str, Integer num, l lVar, Function0 onSuccess, yv1.i iVar, int i13) {
        if ((i13 & 8) != 0) {
            num = null;
        }
        Function1 requestBuilder = lVar;
        if ((i13 & 32) != 0) {
            requestBuilder = r62.a.f106338i;
        }
        if ((i13 & 64) != 0) {
            onSuccess = r62.b.f106339j;
        }
        Function0 onError = iVar;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            onError = r62.b.f106340k;
        }
        Intrinsics.checkNotNullParameter(appCompatImageView, "<this>");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        try {
            com.bumptech.glide.l B = com.bumptech.glide.b.f(appCompatImageView.getContext()).a(Drawable.class).K(str).B(new r62.c(onError, onSuccess));
            Intrinsics.checkNotNullExpressionValue(B, "addListener(...)");
            if (num != null && num.intValue() > 0) {
                de.a x13 = B.x(new z(num.intValue()), true);
                Intrinsics.checkNotNullExpressionValue(x13, "transform(...)");
                B = (com.bumptech.glide.l) x13;
            }
            ((com.bumptech.glide.l) requestBuilder.invoke(B)).G(appCompatImageView);
        } catch (Exception unused) {
        }
    }

    public static final void Z(AppCompatImageView appCompatImageView, String str, Function0 onSuccess) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<this>");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        if (!Intrinsics.d(appCompatImageView.getTag(), str) || appCompatImageView.getDrawable() == null) {
            appCompatImageView.setTag(str);
            Y(appCompatImageView, str, null, null, onSuccess, null, 446);
        }
    }

    public static final void a(rm1.d state, u2.q qVar, gm1.a aVar, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        s sVar = (s) oVar;
        sVar.Y(-1789001005);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        androidx.compose.ui.viewinterop.a.a(new hm1.b(((Number) sVar.m(fc0.k.f61712a)).intValue(), aVar, 1), qVar, new com.pinterest.framework.screens.q(21, state, aVar), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 15, qVar, state, aVar);
        }
    }

    public static final a a0(a x13, int i13) {
        int i14;
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x13, "x");
            int[] iArr = x13.f125645a;
            int i15 = 0;
            int i16 = iArr[0];
            int i17 = iArr[1];
            int i18 = iArr[2];
            int i19 = (i17 - i13) + 1;
            a aVar = new a(new int[]{i16, i19, i18});
            float[] fArr = x13.f125647c;
            float[] fArr2 = aVar.f125647c;
            if (i16 > 0) {
                int i23 = 0;
                while (true) {
                    int i24 = i23 + 1;
                    if (i18 > 0) {
                        int i25 = i15;
                        while (true) {
                            int i26 = i25 + 1;
                            if (i19 > 0) {
                                int i27 = i15;
                                while (true) {
                                    int i28 = i27 + 1;
                                    int i29 = i27 * i18;
                                    int i33 = (i23 * i19 * i18) + i29 + i25;
                                    int i34 = (i23 * i17 * i18) + i29 + i25;
                                    fArr2[i33] = Float.MIN_VALUE;
                                    if (i13 > 0) {
                                        int i35 = 0;
                                        while (true) {
                                            int i36 = i35 + 1;
                                            i14 = i17;
                                            fArr2[i33] = Math.max(fArr2[i33], fArr[(i35 * i18) + i34]);
                                            if (i36 >= i13) {
                                                break;
                                            }
                                            i35 = i36;
                                            i17 = i14;
                                        }
                                    } else {
                                        i14 = i17;
                                    }
                                    if (i28 >= i19) {
                                        break;
                                    }
                                    i27 = i28;
                                    i17 = i14;
                                }
                            } else {
                                i14 = i17;
                            }
                            if (i26 >= i18) {
                                break;
                            }
                            i25 = i26;
                            i17 = i14;
                            i15 = 0;
                        }
                    } else {
                        i14 = i17;
                    }
                    if (i24 >= i16) {
                        break;
                    }
                    i23 = i24;
                    i17 = i14;
                    i15 = 0;
                }
            }
            return aVar;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final void b(a x13, a b13) {
        if (p001if.a.b(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x13, "x");
            Intrinsics.checkNotNullParameter(b13, "b");
            int[] iArr = x13.f125645a;
            int i13 = iArr[0];
            int i14 = iArr[1];
            int i15 = iArr[2];
            float[] fArr = x13.f125647c;
            float[] fArr2 = b13.f125647c;
            if (i13 <= 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                int i17 = i16 + 1;
                if (i14 > 0) {
                    int i18 = 0;
                    while (true) {
                        int i19 = i18 + 1;
                        if (i15 > 0) {
                            int i23 = 0;
                            while (true) {
                                int i24 = i23 + 1;
                                int i25 = (i18 * i15) + (i16 * i14 * i15) + i23;
                                fArr[i25] = fArr[i25] + fArr2[i23];
                                if (i24 >= i15) {
                                    break;
                                } else {
                                    i23 = i24;
                                }
                            }
                        }
                        if (i19 >= i14) {
                            break;
                        } else {
                            i18 = i19;
                        }
                    }
                }
                if (i17 >= i13) {
                    return;
                } else {
                    i16 = i17;
                }
            }
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
        }
    }

    public static final a b0(a x13, a w13) {
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x13, "x");
            Intrinsics.checkNotNullParameter(w13, "w");
            int i13 = 0;
            int i14 = x13.f125645a[0];
            int[] iArr = w13.f125645a;
            int i15 = iArr[0];
            int i16 = iArr[1];
            a aVar = new a(new int[]{i14, i16});
            float[] fArr = x13.f125647c;
            float[] fArr2 = w13.f125647c;
            float[] fArr3 = aVar.f125647c;
            if (i14 > 0) {
                int i17 = 0;
                while (true) {
                    int i18 = i17 + 1;
                    if (i16 > 0) {
                        int i19 = i13;
                        while (true) {
                            int i23 = i19 + 1;
                            int i24 = (i17 * i16) + i19;
                            fArr3[i24] = 0.0f;
                            if (i15 > 0) {
                                int i25 = i13;
                                while (true) {
                                    int i26 = i25 + 1;
                                    fArr3[i24] = (fArr[(i17 * i15) + i25] * fArr2[(i25 * i16) + i19]) + fArr3[i24];
                                    if (i26 >= i15) {
                                        break;
                                    }
                                    i25 = i26;
                                }
                            }
                            if (i23 >= i16) {
                                break;
                            }
                            i19 = i23;
                            i13 = 0;
                        }
                    }
                    if (i18 >= i14) {
                        break;
                    }
                    i17 = i18;
                    i13 = 0;
                }
            }
            return aVar;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof Optional)) {
            return obj;
        }
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return c(optional.get());
        }
        return null;
    }

    public static ir1.h c0(mr1.c cVar, uj2.q qVar, String str, k9 k9Var) {
        return new ir1.h(cVar, qVar, str, k9Var);
    }

    public static final void d0(Navigation navigation, k0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (navigation == null) {
            return;
        }
        Object X0 = navigation.X0();
        ue ueVar = X0 instanceof ue ? (ue) X0 : null;
        if (ueVar == null && (ueVar = ew.b(navigation.getF49940b())) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(navigation, "<this>");
        Object i03 = navigation.i0("unreadCount");
        Integer num = i03 instanceof Integer ? (Integer) i03 : null;
        if (num == null || num.intValue() <= 0) {
            return;
        }
        block.invoke(ueVar);
        Intrinsics.checkNotNullParameter(navigation, "<this>");
        navigation.y0(0, "unreadCount");
    }

    public static final a e(a[] tensors) {
        int i13;
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(tensors, "tensors");
            int i14 = 0;
            int i15 = tensors[0].f125645a[0];
            int length = tensors.length - 1;
            if (length >= 0) {
                int i16 = 0;
                i13 = 0;
                while (true) {
                    int i17 = i16 + 1;
                    i13 += tensors[i16].f125645a[1];
                    if (i17 > length) {
                        break;
                    }
                    i16 = i17;
                }
            } else {
                i13 = 0;
            }
            a aVar = new a(new int[]{i15, i13});
            float[] fArr = aVar.f125647c;
            if (i15 > 0) {
                int i18 = 0;
                while (true) {
                    int i19 = i18 + 1;
                    int i23 = i18 * i13;
                    int length2 = tensors.length - 1;
                    if (length2 >= 0) {
                        int i24 = i14;
                        while (true) {
                            int i25 = i24 + 1;
                            a aVar2 = tensors[i24];
                            float[] fArr2 = aVar2.f125647c;
                            int i26 = aVar2.f125645a[1];
                            System.arraycopy(fArr2, i18 * i26, fArr, i23, i26);
                            i23 += i26;
                            if (i25 > length2) {
                                break;
                            }
                            i24 = i25;
                        }
                    }
                    if (i19 >= i15) {
                        break;
                    }
                    i18 = i19;
                    i14 = 0;
                }
            }
            return aVar;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final void e0(a x13) {
        if (p001if.a.b(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x13, "x");
            float[] fArr = x13.f125647c;
            int length = fArr.length - 1;
            if (length < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                if (fArr[i13] < 0.0f) {
                    fArr[i13] = 0.0f;
                }
                if (i14 > length) {
                    return;
                } else {
                    i13 = i14;
                }
            }
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
        }
    }

    public static final void f0(View... viewList) {
        Intrinsics.checkNotNullParameter(viewList, "viewList");
        for (View view : viewList) {
            view.setOnTouchListener(new l1(5));
        }
    }

    public static final boolean g(tg0 tg0Var, Date date) {
        Intrinsics.checkNotNullParameter(tg0Var, "<this>");
        Intrinsics.checkNotNullParameter(date, "date");
        if (tg0Var.f42207a.before(date) || s0.D0(tg0Var.f42207a, date)) {
            Date date2 = tg0Var.f42208b;
            if (date2.after(date) || s0.D0(date2, date)) {
                return true;
            }
        }
        return false;
    }

    public static final void g0(a x13) {
        if (p001if.a.b(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x13, "x");
            int[] iArr = x13.f125645a;
            int i13 = 0;
            int i14 = iArr[0];
            int i15 = iArr[1];
            float[] fArr = x13.f125647c;
            if (i14 <= 0) {
                return;
            }
            while (true) {
                int i16 = i13 + 1;
                int i17 = i13 * i15;
                int i18 = i17 + i15;
                float f13 = Float.MIN_VALUE;
                if (i17 < i18) {
                    int i19 = i17;
                    while (true) {
                        int i23 = i19 + 1;
                        float f14 = fArr[i19];
                        if (f14 > f13) {
                            f13 = f14;
                        }
                        if (i23 >= i18) {
                            break;
                        } else {
                            i19 = i23;
                        }
                    }
                }
                float f15 = 0.0f;
                if (i17 < i18) {
                    int i24 = i17;
                    while (true) {
                        int i25 = i24 + 1;
                        float exp = (float) Math.exp(fArr[i24] - f13);
                        fArr[i24] = exp;
                        f15 += exp;
                        if (i25 >= i18) {
                            break;
                        } else {
                            i24 = i25;
                        }
                    }
                }
                if (i17 < i18) {
                    while (true) {
                        int i26 = i17 + 1;
                        fArr[i17] = fArr[i17] / f15;
                        if (i26 >= i18) {
                            break;
                        } else {
                            i17 = i26;
                        }
                    }
                }
                if (i16 >= i14) {
                    return;
                } else {
                    i13 = i16;
                }
            }
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
        }
    }

    public static final a h(a x13, a w13) {
        Class<h> cls;
        a aVar;
        Class<h> cls2 = h.class;
        if (p001if.a.b(cls2)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x13, "x");
            Intrinsics.checkNotNullParameter(w13, "w");
            int[] iArr = x13.f125645a;
            int i13 = 0;
            int i14 = iArr[0];
            int i15 = iArr[1];
            int i16 = iArr[2];
            int[] iArr2 = w13.f125645a;
            int i17 = iArr2[0];
            int i18 = (i15 - i17) + 1;
            int i19 = iArr2[2];
            a aVar2 = new a(new int[]{i14, i18, i19});
            float[] fArr = x13.f125647c;
            float[] fArr2 = aVar2.f125647c;
            float[] fArr3 = w13.f125647c;
            if (i14 <= 0) {
                return aVar2;
            }
            int i23 = 0;
            while (true) {
                int i24 = i23 + 1;
                if (i19 > 0) {
                    int i25 = i13;
                    while (true) {
                        int i26 = i25 + 1;
                        if (i18 > 0) {
                            int i27 = 0;
                            while (true) {
                                int i28 = i27 + 1;
                                float f13 = 0.0f;
                                if (i17 > 0) {
                                    int i29 = 0;
                                    while (true) {
                                        cls = cls2;
                                        int i33 = i29 + 1;
                                        if (i16 > 0) {
                                            int i34 = 0;
                                            while (true) {
                                                aVar = aVar2;
                                                int i35 = i34 + 1;
                                                try {
                                                    f13 = (fArr[((i29 + i27) * i16) + (i15 * i16 * i23) + i34] * fArr3[(((i29 * i16) + i34) * i19) + i25]) + f13;
                                                    if (i35 >= i16) {
                                                        break;
                                                    }
                                                    i34 = i35;
                                                    aVar2 = aVar;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    p001if.a.a(cls, th);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            aVar = aVar2;
                                        }
                                        if (i33 >= i17) {
                                            break;
                                        }
                                        i29 = i33;
                                        cls2 = cls;
                                        aVar2 = aVar;
                                    }
                                } else {
                                    cls = cls2;
                                    aVar = aVar2;
                                }
                                fArr2[(i27 * i19) + (i18 * i19 * i23) + i25] = f13;
                                if (i28 >= i18) {
                                    break;
                                }
                                i27 = i28;
                                cls2 = cls;
                                aVar2 = aVar;
                            }
                        } else {
                            cls = cls2;
                            aVar = aVar2;
                        }
                        if (i26 >= i19) {
                            break;
                        }
                        i25 = i26;
                        cls2 = cls;
                        aVar2 = aVar;
                    }
                } else {
                    cls = cls2;
                    aVar = aVar2;
                }
                if (i24 >= i14) {
                    return aVar;
                }
                i23 = i24;
                cls2 = cls;
                aVar2 = aVar;
                i13 = 0;
            }
        } catch (Throwable th4) {
            th = th4;
            cls = cls2;
        }
    }

    public static void h0(tc.g writer, v customScalarAdapters, th value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("conversationId");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f133388a);
        writer.M0("numberOfPinsToUse");
        pc.c.f99521b.d(writer, customScalarAdapters, Integer.valueOf(value.f133389b));
        r0 r0Var = value.f133390c;
        if (r0Var instanceof q0) {
            writer.M0("after");
            pc.c.d(pc.c.b(eVar)).a(writer, customScalarAdapters, (q0) r0Var);
        }
        r0 r0Var2 = value.f133391d;
        if (r0Var2 instanceof q0) {
            writer.M0("imageMediumSizeSpec");
            pc.c.d(eVar).a(writer, customScalarAdapters, (q0) r0Var2);
        }
        r0 r0Var3 = value.f133392e;
        if (r0Var3 instanceof q0) {
            writer.M0("imageLargeSizeSpec");
            pc.c.d(eVar).a(writer, customScalarAdapters, (q0) r0Var3);
        }
    }

    public static final yb0.n i(Context context, String userName, b01.c onRemoveConfirmed) {
        yb0.n a13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(onRemoveConfirmed, "onRemoveConfirmed");
        int i13 = yb0.n.f138503p;
        String string = context.getString(nz1.f.private_profile_remove_follower_title, userName);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(nz1.f.private_profile_remove_follower_body);
        String string3 = context.getString(x0.remove);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = context.getString(x0.close_modal);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        a13 = j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new uv0.f(21, onRemoveConfirmed), (r20 & 64) != 0 ? yb0.k.f138492k : null, (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        return a13;
    }

    public static r i0(kh khVar, g0 g0Var, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z23, String str, int i13) {
        r rVar;
        xi c13;
        ti m13;
        li ideaPinDisplayOptions;
        boolean z24 = (i13 & 8) != 0 ? false : z14;
        boolean z25 = (i13 & 16) != 0 ? false : z15;
        boolean z26 = (i13 & 32) != 0 ? false : z16;
        int i14 = eo1.b.color_themed_background_default;
        int i15 = m60.q0.contextual_bg;
        vn1.c contextualMenuTextColorResId = vn1.c.DEFAULT;
        y32.f sendShareSurface = y32.f.CLOSEUP_LONGPRESS;
        b0 pinCornerRadiusOverride = new b0(eo1.c.lego_corner_radius_medium);
        Intrinsics.checkNotNullParameter(contextualMenuTextColorResId, "contextualMenuTextColorResId");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter("unknown", "trafficSource");
        Intrinsics.checkNotNullParameter(pinCornerRadiusOverride, "pinCornerRadiusOverride");
        wa2.i pinRepFeatureConfig = new wa2.i(i14, i15, pinCornerRadiusOverride, contextualMenuTextColorResId, null, sendShareSurface, null, null, null, null, null, null, null, null, null, "unknown", null, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false, false, false, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false);
        int i16 = eo1.b.color_themed_background_default;
        int i17 = m60.q0.contextual_bg;
        b0 pinCornerRadiusOverride2 = new b0(eo1.c.lego_corner_radius_medium);
        Intrinsics.checkNotNullParameter(contextualMenuTextColorResId, "contextualMenuTextColorResId");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter("unknown", "trafficSource");
        Intrinsics.checkNotNullParameter(pinCornerRadiusOverride2, "pinCornerRadiusOverride");
        wa2.i ideaPinRepFeatureConfig = new wa2.i(i16, i17, pinCornerRadiusOverride2, contextualMenuTextColorResId, null, sendShareSurface, null, null, null, null, null, null, null, null, null, "unknown", null, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false, false, false, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false);
        int i18 = eo1.b.color_themed_background_default;
        int i19 = m60.q0.contextual_bg;
        b0 pinCornerRadiusOverride3 = new b0(eo1.c.lego_corner_radius_medium);
        Intrinsics.checkNotNullParameter(contextualMenuTextColorResId, "contextualMenuTextColorResId");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter("unknown", "trafficSource");
        Intrinsics.checkNotNullParameter(pinCornerRadiusOverride3, "pinCornerRadiusOverride");
        wa2.i shoppingPinRepFeatureConfig = new wa2.i(i18, i19, pinCornerRadiusOverride3, contextualMenuTextColorResId, null, sendShareSurface, null, null, null, null, null, null, null, null, null, "unknown", null, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false, false, false, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false);
        int i23 = eo1.b.color_themed_background_default;
        int i24 = m60.q0.contextual_bg;
        b0 pinCornerRadiusOverride4 = new b0(eo1.c.lego_corner_radius_medium);
        Intrinsics.checkNotNullParameter(contextualMenuTextColorResId, "contextualMenuTextColorResId");
        Intrinsics.checkNotNullParameter(sendShareSurface, "sendShareSurface");
        Intrinsics.checkNotNullParameter("unknown", "trafficSource");
        Intrinsics.checkNotNullParameter(pinCornerRadiusOverride4, "pinCornerRadiusOverride");
        wa2.i imageOnlyPinRepFeatureConfig = new wa2.i(i23, i24, pinCornerRadiusOverride4, contextualMenuTextColorResId, null, sendShareSurface, null, null, null, null, null, null, null, null, null, "unknown", null, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false, false, false, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false);
        Intrinsics.checkNotNullParameter(pinRepFeatureConfig, "pinRepFeatureConfig");
        Intrinsics.checkNotNullParameter(ideaPinRepFeatureConfig, "ideaPinRepFeatureConfig");
        Intrinsics.checkNotNullParameter(shoppingPinRepFeatureConfig, "shoppingPinRepFeatureConfig");
        Intrinsics.checkNotNullParameter(imageOnlyPinRepFeatureConfig, "imageOnlyPinRepFeatureConfig");
        r rVar2 = new r();
        rVar2.f134754a = pinRepFeatureConfig;
        rVar2.f134755b = ideaPinRepFeatureConfig;
        rVar2.f134756c = shoppingPinRepFeatureConfig;
        rVar2.f134757d = imageOnlyPinRepFeatureConfig;
        t[] values = t.values();
        int length = values.length;
        int i25 = 0;
        while (i25 < length) {
            t tVar = values[i25];
            Float f13 = null;
            z32.s0 d2 = khVar != null ? khVar.d() : null;
            int i26 = (d2 != null && xe1.s.f134759b[d2.ordinal()] == 1) ? xe1.v.f134798m : xe1.v.f134797l;
            vi n13 = khVar != null ? khVar.n() : null;
            boolean showIdeaPinIndicator = (khVar == null || (m13 = khVar.m()) == null || (ideaPinDisplayOptions = m13.getIdeaPinDisplayOptions()) == null) ? tVar == t.IDEA_PIN_REP || tVar == t.IMAGE_ONLY_REP : ideaPinDisplayOptions.getShowIdeaPinIndicator();
            if (khVar != null && (c13 = khVar.c()) != null) {
                f13 = c13.getItemWidthHeightRatio();
            }
            int i27 = i25;
            int i28 = length;
            t[] tVarArr = values;
            r rVar3 = rVar2;
            wa2.i o13 = o(null, g0Var, i26, n13, showIdeaPinIndicator, z13, z24, z25, z26, tVar, f13, z17, z18, z19, z23, str);
            int i29 = xe1.s.f134758a[tVar.ordinal()];
            if (i29 == 1) {
                rVar = rVar3;
                Intrinsics.checkNotNullParameter(o13, "<set-?>");
                rVar.f134754a = o13;
            } else if (i29 == 2) {
                rVar = rVar3;
                Intrinsics.checkNotNullParameter(o13, "<set-?>");
                rVar.f134756c = o13;
            } else if (i29 == 3) {
                rVar = rVar3;
                Intrinsics.checkNotNullParameter(o13, "<set-?>");
                rVar.f134755b = o13;
            } else if (i29 != 4) {
                rVar = rVar3;
            } else {
                Intrinsics.checkNotNullParameter(o13, "<set-?>");
                rVar = rVar3;
                rVar.f134757d = o13;
            }
            i25 = i27 + 1;
            rVar2 = rVar;
            length = i28;
            values = tVarArr;
        }
        return rVar2;
    }

    public static final a j(a x13, a w13, a b13) {
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x13, "x");
            Intrinsics.checkNotNullParameter(w13, "w");
            Intrinsics.checkNotNullParameter(b13, "b");
            int i13 = x13.f125645a[0];
            int i14 = b13.f125645a[0];
            a b03 = b0(x13, w13);
            float[] fArr = b13.f125647c;
            float[] fArr2 = b03.f125647c;
            if (i13 > 0) {
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    if (i14 > 0) {
                        int i17 = 0;
                        while (true) {
                            int i18 = i17 + 1;
                            int i19 = (i15 * i14) + i17;
                            fArr2[i19] = fArr2[i19] + fArr[i17];
                            if (i18 >= i14) {
                                break;
                            }
                            i17 = i18;
                        }
                    }
                    if (i16 >= i13) {
                        break;
                    }
                    i15 = i16;
                }
            }
            return b03;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final a j0(a x13) {
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x13, "x");
            int[] iArr = x13.f125645a;
            int i13 = iArr[0];
            int i14 = iArr[1];
            a aVar = new a(new int[]{i14, i13});
            float[] fArr = x13.f125647c;
            float[] fArr2 = aVar.f125647c;
            if (i13 > 0) {
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    if (i14 > 0) {
                        int i17 = 0;
                        while (true) {
                            int i18 = i17 + 1;
                            fArr2[(i17 * i13) + i15] = fArr[(i15 * i14) + i17];
                            if (i18 >= i14) {
                                break;
                            }
                            i17 = i18;
                        }
                    }
                    if (i16 >= i13) {
                        break;
                    }
                    i15 = i16;
                }
            }
            return aVar;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final a k(String[] texts, a w13) {
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(w13, "w");
            int length = texts.length;
            int i13 = w13.f125645a[1];
            a aVar = new a(new int[]{length, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, i13});
            float[] fArr = aVar.f125647c;
            float[] fArr2 = w13.f125647c;
            if (length > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    int[] c13 = i.f125676a.c(texts[i14]);
                    int i16 = 0;
                    while (true) {
                        int i17 = i16 + 1;
                        System.arraycopy(fArr2, c13[i16] * i13, fArr, (i16 * i13) + (i13 * RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN * i14), i13);
                        if (i17 >= 128) {
                            break;
                        }
                        i16 = i17;
                    }
                    if (i15 >= length) {
                        break;
                    }
                    i14 = i15;
                }
            }
            return aVar;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final a k0(a x13) {
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x13, "x");
            int[] iArr = x13.f125645a;
            int i13 = iArr[0];
            int i14 = iArr[1];
            int i15 = iArr[2];
            a aVar = new a(new int[]{i15, i14, i13});
            float[] fArr = x13.f125647c;
            float[] fArr2 = aVar.f125647c;
            if (i13 > 0) {
                int i16 = 0;
                while (true) {
                    int i17 = i16 + 1;
                    if (i14 > 0) {
                        int i18 = 0;
                        while (true) {
                            int i19 = i18 + 1;
                            if (i15 > 0) {
                                int i23 = 0;
                                while (true) {
                                    int i24 = i23 + 1;
                                    fArr2[(i18 * i13) + (i23 * i13 * i14) + i16] = fArr[(i18 * i15) + (i16 * i14 * i15) + i23];
                                    if (i24 >= i15) {
                                        break;
                                    }
                                    i23 = i24;
                                }
                            }
                            if (i19 >= i14) {
                                break;
                            }
                            i18 = i19;
                        }
                    }
                    if (i17 >= i13) {
                        break;
                    }
                    i16 = i17;
                }
            }
            return aVar;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final boolean l0(boolean z13, boolean z14, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        if (!z13 || z14) {
            return false;
        }
        wy0 f13 = ((b60.d) activeUserManager).f();
        return ((f13 != null ? Intrinsics.d(f13.G3(), Boolean.TRUE) : false) || (f13 != null ? Intrinsics.d(f13.u4(), Boolean.TRUE) : false)) ? false : true;
    }

    public static AccessibleObject m(Class cls, String str) {
        AccessibleObject m13;
        if (String.class == cls && "value".equals(str)) {
            return null;
        }
        if ((cls.getModifiers() & 1) != 1) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                AccessibleObject m14 = m(cls2, str);
                if (m14 != null) {
                    return m14;
                }
            }
            Class superclass = cls.getSuperclass();
            if (superclass != null && superclass != Object.class && (m13 = m(superclass, str)) != null) {
                return m13;
            }
        }
        try {
            return v(cls, str, new Class[0]);
        } catch (NoSuchMethodException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str.substring(0, 1).toUpperCase());
            sb3.append(str.length() > 1 ? str.substring(1) : "");
            String sb4 = sb3.toString();
            try {
                try {
                    try {
                        return v(cls, "get" + sb4, new Class[0]);
                    } catch (NoSuchFieldException unused2) {
                        return null;
                    }
                } catch (NoSuchMethodException unused3) {
                    return q(cls, str);
                }
            } catch (NoSuchMethodException unused4) {
                return v(cls, "is" + sb4, new Class[0]);
            }
        }
    }

    public static final void n(a x13) {
        int i13;
        if (p001if.a.b(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x13, "x");
            int[] iArr = x13.f125645a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            if (1 < length) {
                int i14 = 1;
                i13 = 1;
                while (true) {
                    int i15 = i14 + 1;
                    i13 *= x13.f125645a[i14];
                    if (i15 >= length) {
                        break;
                    } else {
                        i14 = i15;
                    }
                }
            } else {
                i13 = 1;
            }
            int[] shape = {x13.f125645a[0], i13};
            Intrinsics.checkNotNullParameter(shape, "shape");
            x13.f125645a = shape;
            int i16 = a.f125644d;
            int a13 = me.f.a(shape);
            float[] fArr = new float[a13];
            System.arraycopy(x13.f125647c, 0, fArr, 0, Math.min(x13.f125646b, a13));
            x13.f125647c = fArr;
            x13.f125646b = a13;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
        }
    }

    public static final wa2.i o(u0 u0Var, g0 g0Var, int i13, vi viVar, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, t repStyle, Float f13, boolean z18, boolean z19, boolean z23, boolean z24, String str) {
        Intrinsics.checkNotNullParameter(repStyle, "repStyle");
        float O = l3.c.O(f13, repStyle);
        t tVar = t.SHOPPING_PIN_REP;
        boolean z25 = repStyle == tVar;
        boolean z26 = repStyle == tVar;
        t tVar2 = t.IMAGE_ONLY_REP;
        boolean z27 = repStyle == tVar2 || repStyle == t.IDEA_PIN_REP;
        t tVar3 = t.IDEA_PIN_REP;
        wa2.i iVar = new wa2.i(i13, 1878248959, 2079815934, 1020, str, false, false, false, false, z14, repStyle == tVar || z13, z26, z25, z27, repStyle == tVar3 || repStyle == tVar2, false, repStyle == tVar3 || repStyle == tVar2, z13, z18, z19, z23, z16, z15, z24, repStyle != tVar2);
        int i14 = 2;
        if (repStyle == tVar) {
            iVar.f128764c0 = new wa2.g0(viVar != null ? viVar.getShowPrice() : true, viVar != null ? viVar.getShowTitle() : true, viVar != null ? viVar.getShowMerchantDomain() : true, viVar != null ? viVar.getShowRatingsAndCount() : true, !z17 && (viVar == null || viVar.getShowShippingInfo()), viVar != null ? viVar.getShowLabel() : true, new bb2.e(O, bb2.f.FILL, i14), u0Var, g0Var, viVar != null ? viVar.getShowDirectClickthroughButton() : false, false, false, true, 0, false, false, z17, false, false, false, false, false, 33287168);
        } else {
            iVar.f128766d0 = new bb2.e(O, bb2.f.FILL, i14);
        }
        return iVar;
    }

    public static wa2.i p(t tVar) {
        return o(null, null, xe1.v.f134797l, null, false, false, false, false, false, tVar, Float.valueOf(1.0f), true, false, false, false, null);
    }

    public static Field q(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if ((declaredField.getModifiers() & 2) == 2) {
                throw new NoSuchFieldException("Only public, protected and package members allowed");
            }
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e13) {
            Class superclass = cls.getSuperclass();
            if (superclass == null || superclass == Object.class) {
                throw e13;
            }
            return q(superclass, str);
        }
    }

    public static final String r(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return qb0.b.m(Integer.valueOf(bs1.c.z0(f30Var)), Integer.valueOf(bs1.c.x0(f30Var))) ? bs1.c.B0(f30Var) : bs1.c.y0(f30Var);
    }

    public static final int t(int i13, int i14) {
        if (i13 < i14) {
            return 0;
        }
        return (int) Math.ceil(i13 / i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object u(x02.i2 r4, java.util.List r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof dl1.n
            if (r0 == 0) goto L13
            r0 = r6
            dl1.n r0 = (dl1.n) r0
            int r1 = r0.f55256s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55256s = r1
            goto L18
        L13:
            dl1.n r0 = new dl1.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f55255r
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55256s
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ue.c.H(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            ue.c.H(r6)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L3b
            kotlin.collections.q0 r4 = kotlin.collections.q0.f80391a
            goto L4e
        L3b:
            uj2.b0 r4 = r4.N(r5)
            r0.f55256s = r3
            java.lang.Object r6 = kh2.j.p(r4, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            kotlin.jvm.internal.Intrinsics.f(r6)
            r4 = r6
            java.util.List r4 = (java.util.List) r4
        L4e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.h.u(x02.i2, java.util.List, bl2.c):java.lang.Object");
    }

    public static Method v(Class cls, String str, Class... clsArr) {
        Method declaredMethod;
        try {
            try {
                declaredMethod = cls.getMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            }
            if (declaredMethod.getDeclaringClass() == Object.class) {
                throw new NoSuchMethodException();
            }
            if ((declaredMethod.getModifiers() & 2) == 2) {
                throw new NoSuchMethodException("Only public, protected and package members allowed");
            }
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException e13) {
            Class superclass = cls.getSuperclass();
            if (superclass == null || superclass == Object.class) {
                throw e13;
            }
            return v(superclass, str, new Class[0]);
        }
    }

    public static File w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }

    public static final do2.c x(dl1.l lVar, String modelId) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        return kotlin.jvm.internal.j.a(lVar.P(modelId));
    }

    public static final Object y(dl1.t tVar, String str, bl2.c cVar) {
        return kh2.j.q(((dl1.l) tVar).P(str), cVar);
    }

    public static final do2.c z(dl1.t tVar, String modelId) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        return kotlin.jvm.internal.j.a(((dl1.l) tVar).Q(modelId));
    }

    public abstract Size B();

    public abstract dg.e l(String str, List list);

    public abstract Uri s();
}
