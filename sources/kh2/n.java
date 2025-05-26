package kh2;

import ads_mobile_sdk.fs0;
import ads_mobile_sdk.k41;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import c2.d6;
import com.pinterest.api.model.bg;
import com.pinterest.api.model.d01;
import com.pinterest.api.model.e8;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.s30;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.browser.view.InAppBrowserFragment;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.home.tuner.sba.SbaHfBoardToggleSettingCellView;
import io.opentelemetry.api.trace.StatusCode;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.b8;

/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: a */
    public static q8.m0 f79624a;

    public static od2.c A() {
        return new od2.c("glitch", "float {{name}}_silkySmooth(float t, float k) {\n    return (atan(k*sin((t-0.5)*PI)) / atan(k))*0.5+0.5;\n}\n\nvec4 {{name}}(FragmentEffectInput data, in sampler2D sourceTexture) {\n    vec2 uv = data.texturePosition;\n    float time = 0.5 * data.time * {{settings.speed}};\n\n    vec2 droplets = vec2(0.7, 0.5);\n    vec2 rAberration = vec2({{settings.colorDistortion}});\n    float aberrationAmount = {{settings.animateColor}} ? 2.0 : 0.0;\n\n    float dropScaleX = 3.0;\n    float dropIntensity = 5.0 * {{settings.melt}};\n    float dropAberration = 15.0 * length(droplets - 0.5);\n\n    float lineAmount = 20.0;\n    float lineScale = max(200.0 * {{settings.lineWidth}}, 0.04);\n    float lineQuantity = 2.0 * abs({{settings.lineWidth}} - 0.5);\n    float radialAberration = 30.0 * length(rAberration - 0.5);\n\n    float silk = 0.04 * (\n        0.04 * ({{name}}_silkySmooth(time + uv.y * 2.0 * sin(time + uv.y * PI), 4.0) -.5)\n        + {{name}}_silkySmooth(time * 1.2 + uv.y, 3.0) - 0.5\n    );\n\n    uv.x += 20.0 * {{settings.intensity}}\n        * 0.5 * silk * tan(fract(time/2.0 + 1000.0 * uv.y*sin(time/2.0)));\n    uv.y += 20.0 * 0.0425\n        * 0.5 * silk * tan(fract(time/2.0 + 1000.0 * uv.x*sin(time/2.0)));\n\n    vec2 uvRain = data.texturePosition + 0.2 * vec2(sin(20.0 * uv.y), 0.0) / dropScaleX;\n\n    uvRain.y -= time / (8.0 + 10.0 * random(1.0 + floor(uvRain.x * dropScaleX)));\n    float scaleY = 4.0;\n    uvRain *= vec2(dropScaleX, scaleY);\n    vec2 idRain = floor(uvRain);\n    uvRain = fract(uvRain);\n    vec2 unScaledUVrain = uvRain;\n    uvRain -= 0.5;\n    uvRain *= vec2(scaleY, dropScaleX);\n    float rainMask = smoothstep(\n        1.0 + random(idRain),\n        0.1,\n        length(uvRain)\n    );\n\n    vec2 ri = vec2(\n        data.texturePosition.x,\n        floor(data.texturePosition.y * float(textureSize(sourceTexture, 0).y) / (3.0 * lineScale))\n    );\n\n    float line = smoothstep(\n        0.0,\n        1.0,\n        fract(-time * random(ri.y) / 2.0 + ri.x + random(ri.y)) - 0.5\n    );\n\n    line *= smoothstep(0.99 - lineQuantity * 0.99, 1.0, sin(time / 3.0 + random(ri.y) * PI * 2.0) * 0.5 + 0.5);\n\n    uv = mix(\n        uv,\n        vec2(\n            uv.x,\n            uv.y - 0.05 * rainMask * dropIntensity * (1.0 - unScaledUVrain.y)\n        ),\n        rainMask\n    );\n    vec2 uvr = uv;\n    vec2 uvg = uv;\n    vec2 uvb = uv;\n\n\n    uvr.x += lineAmount * line * 0.02;\n    uvg.x += lineAmount * line * 0.02;\n    uvb.x += lineAmount * line * 0.02;\n\n    uvr.y -= dropAberration * rainMask * 0.01 / 4.0;\n    uvg.y += dropAberration * rainMask * 0.01 / 4.0;\n    uvb.y += dropAberration * rainMask * 0.004 / 4.0;\n\n    uvr += radialAberration * vec2(normalize(uvr - 0.5)) * (0.015 * pow(\n        2.0 * length(\n            (uvr - 0.5) + vec2(\n                cos(length(uvr - 0.5) * 10.0 + time * 1.3),\n                sin(time * 1.9 + PI / 4.0)\n            ) * 0.5\n        ), 2.0\n    ));\n    uvg += radialAberration * vec2(normalize(uvg - 0.5)) * (0.003 * pow(\n        2.0 * length(\n            (uvg - 0.5) + vec2(\n                cos(length(uvr - 0.5) * 20.0 + time * 1.1),\n                sin(time * 2.3 + PI / 8.0)\n            ) * 0.5\n        ), 2.0\n    ));\n    uvb += radialAberration * vec2(normalize(uvb - 0.5)) * (0.0025 * pow(\n        2.0 * length(\n            (uvb - 0.5) + vec2(\n                cos(length(uvr - 0.5) * 3.0 + time * 1.03),\n                sin(time * 2.1 + PI / 2.0 + silk)\n            ) * 0.3\n        ), 2.0\n    ));\n\n    uvr += aberrationAmount * (silk * 0.2 + vec2(\n        tan(2.0 * PI / 3.0 + sin(0.33 * PI * 2.0 + time + 13.0) + silk + time) * 0.012,\n        0.0\n    ) * sin(uv.y + time));\n    uvg += aberrationAmount * (silk * 0.2 + vec2(\n        tan(2.0 * 2.0 * PI / 3.0 + sin(0.66 * PI * 2.0 + time + 13.0) + silk + time) * 0.012,\n        0.0\n    ) * sin(uv.y + time));\n    uvb += aberrationAmount * (silk * 0.2 + vec2(\n        tan(PI / 3.0 + sin(time + 13.0) + silk + time) * 0.012,\n        0.0\n    ) * sin(uv.y + time));\n\n    vec2 r = sampleWithConstantWrap(sourceTexture, uvr, vec4(0.0)).ra;\n    vec2 g = sampleWithConstantWrap(sourceTexture, uvg, vec4(0.0)).ga;\n    vec2 b = sampleWithConstantWrap(sourceTexture, uvb, vec4(0.0)).ba;\n\n    return vec4(\n        vec3(r.x, g.x, b.x),\n        min(max(max(r.y,g.y),b.y), 1.0)\n    );\n}", new pd2.q0(kotlin.collections.z0.g(new Pair("speed", ld2.a.f82993a), new Pair("intensity", jq.b.n(0.0425f, null, 0.0f, 1.0f)), new Pair("animateColor", new pd2.c(false)), new Pair("colorDistortion", jq.b.n(0.5f, null, 0.0f, 0.5f)), new Pair("melt", jq.b.n(0.0f, null, 0.0f, 1.0f)), new Pair("lineWidth", jq.b.n(0.05f, null, 0.0f, 1.0f)))));
    }

    public static boolean B(Throwable th3, Function1 predicate) {
        Intrinsics.checkNotNullParameter(th3, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int i13 = 5;
        while (!((Boolean) predicate.invoke(th3)).booleanValue()) {
            if (i13 <= 0 || (th3 = th3.getCause()) == null) {
                return false;
            }
            i13--;
        }
        return true;
    }

    public static void C(InAppBrowserFragment inAppBrowserFragment, ad0.b bVar) {
        inAppBrowserFragment.O0 = bVar;
    }

    public static void D(tv0.h hVar, ag1.b bVar) {
        hVar.f119528l0 = bVar;
    }

    public static void E(nu0.i iVar, de0.d dVar) {
        iVar.f92330z0 = dVar;
    }

    public static void F(nu0.i iVar, zf0.f fVar) {
        iVar.getClass();
    }

    public static void G(mq.h0 h0Var, lh0.a0 a0Var) {
        h0Var.f87988f0 = a0Var;
    }

    public static void H(tv0.h hVar, lh0.s1 s1Var) {
        hVar.f119529m0 = s1Var;
    }

    public static void I(y90.d0 d0Var, n72.b bVar) {
        d0Var.f138147c0 = bVar;
    }

    public static void J(mq.h0 h0Var, il1.a aVar) {
        h0Var.f87985c0 = aVar;
    }

    public static void K(SbaHfBoardToggleSettingCellView sbaHfBoardToggleSettingCellView, pb0.d dVar) {
        sbaHfBoardToggleSettingCellView.f45816c = dVar;
    }

    public static void L(nu0.i iVar, b8 b8Var) {
        iVar.A0 = b8Var;
    }

    public static void M(nu0.i iVar, ag1.h hVar) {
        iVar.C0 = hVar;
    }

    public static void N(y90.d0 d0Var, m72.a aVar) {
        d0Var.f138148d0 = aVar;
    }

    public static void O(InAppBrowserFragment inAppBrowserFragment, nx.f0 f0Var) {
        inAppBrowserFragment.M0 = f0Var;
    }

    public static void P(InAppBrowserFragment inAppBrowserFragment, so.l0 l0Var) {
        inAppBrowserFragment.N0 = l0Var;
    }

    public static void Q(y90.d0 d0Var, g62.d dVar) {
        d0Var.f138149e0 = dVar;
    }

    public static void R(tv0.h hVar, dl1.t tVar) {
        hVar.f119527k0 = tVar;
    }

    public static void S(nu0.i iVar, i92.k kVar) {
        iVar.B0 = kVar;
    }

    public static final no2.b T(Object obj, no2.b... bVarArr) {
        Class[] clsArr;
        try {
            if (bVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = bVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i13 = 0; i13 < length; i13++) {
                    clsArr2[i13] = no2.b.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(bVarArr, bVarArr.length));
            if (invoke instanceof no2.b) {
                return (no2.b) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause == null) {
                throw e13;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e13.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static byte[] U(byte[] bArr, int i13, ll.u uVar) {
        MessageDigest messageDigest = (MessageDigest) ll.s.f83771e.a(j0(uVar));
        int digestLength = messageDigest.getDigestLength();
        byte[] bArr2 = new byte[i13];
        int i14 = 0;
        for (int i15 = 0; i15 <= (i13 - 1) / digestLength; i15++) {
            messageDigest.reset();
            messageDigest.update(bArr);
            messageDigest.update(c0.d.Q2(4, BigInteger.valueOf(i15)));
            byte[] digest = messageDigest.digest();
            System.arraycopy(digest, 0, bArr2, i14, Math.min(digest.length, i13 - i14));
            i14 += digest.length;
        }
        return bArr2;
    }

    public static final void W(SparseArray sparseArray, SparseArray sparseArray2) {
        int size = sparseArray2.size();
        for (int i13 = 0; i13 < size; i13++) {
            sparseArray.put(sparseArray2.keyAt(i13), sparseArray2.valueAt(i13));
        }
    }

    public static final r2.i X(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.W(-796080049);
        r2.i iVar = (r2.i) so.a.i(new Object[0], r2.i.f106048d, r2.j.f106052i, sVar, 3072, 4);
        iVar.f106051c = (r2.k) sVar.m(r2.o.f106060a);
        sVar.r(false);
        return iVar;
    }

    public static void Y(c7.a aVar) {
        aVar.f26670n = false;
        CharSequence charSequence = aVar.f26657a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f26657a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f26657a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if (!(obj instanceof c7.f)) {
                    spannable.removeSpan(obj);
                }
            }
        }
        Z(aVar);
    }

    public static void Z(c7.a aVar) {
        aVar.f26667k = -3.4028235E38f;
        aVar.f26666j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f26657a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f26657a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f26657a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final int a(double d2) {
        int i13 = (int) d2;
        if (i13 == d2) {
            return i13;
        }
        throw new IllegalStateException((d2 + " cannot be converted to Int").toString());
    }

    public static float a0(float f13, int i13, int i14, int i15) {
        float f14;
        if (f13 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i13 == 0) {
            f14 = i15;
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    return -3.4028235E38f;
                }
                return f13;
            }
            f14 = i14;
        }
        return f13 * f14;
    }

    public static final long b(double d2) {
        long j13 = (long) d2;
        if (j13 == d2) {
            return j13;
        }
        throw new IllegalStateException((d2 + " cannot be converted to Long").toString());
    }

    public static final void b0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setAutoMirrored(true);
    }

    public static final double c(long j13) {
        double d2 = j13;
        if (((long) d2) == j13) {
            return d2;
        }
        throw new IllegalStateException((j13 + " cannot be converted to Double").toString());
    }

    public static void c0(TextView textView, int i13) {
        textView.setBreakStrategy(i13);
    }

    public static final int d(long j13) {
        int i13 = (int) j13;
        if (i13 == j13) {
            return i13;
        }
        throw new IllegalStateException((j13 + " cannot be converted to Int").toString());
    }

    public static void d0(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static final void e(ra0.l source, u2.q qVar, i2.o oVar, int i13, int i14) {
        int i15;
        Intrinsics.checkNotNullParameter(source, "source");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1274441702);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.h(source) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i15 |= sVar.h(qVar) ? 32 : 16;
        }
        if ((i15 & 91) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
            u2.q j13 = qVar.j(fillElement);
            q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
            int i17 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, j13);
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
            tb.f.f0(sVar, e13, s3.j.f110801e);
            tb.f.f0(sVar, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
                ep.b.y(i17, sVar, i17, hVar);
            }
            tb.f.f0(sVar, X, s3.j.f110799c);
            if (source instanceof ra0.j) {
                sVar.W(-1751507736);
                dl2.b.h(((ra0.j) source).f106949a, fillElement, null, null, sVar, 48, 12);
                sVar.r(false);
            } else if (source instanceof ra0.i) {
                sVar.W(-1751316931);
                dl2.b.g(((ra0.i) source).f106946a, fillElement, null, null, sVar, 56, 12);
                sVar.r(false);
            } else if (source instanceof ra0.k) {
                sVar.W(-472129987);
                sVar.r(false);
            } else {
                sVar.W(-1751113943);
                sVar.r(false);
            }
            sVar.r(true);
        }
        u2.q qVar2 = qVar;
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 9, source, qVar2);
        }
    }

    public static void e0(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static final void f(uc0.s0 s0Var, i2.o oVar, int i13) {
        int i14;
        i2.s sVar;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.Y(-1472381213);
        if ((i13 & 14) == 0) {
            i14 = (sVar2.h(s0Var) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 11) == 2 && sVar2.z()) {
            sVar2.Q();
            sVar = sVar2;
        } else {
            u2.q r13 = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.e.b(u2.n.f120041b, 1.0f), 0.0f, com.bumptech.glide.d.A(oc0.o.top_padding_column, sVar2), 0.0f, 0.0f, 13);
            p1.g gVar = p1.l.f98543a;
            p1.y a13 = p1.x.a(p1.l.g(com.bumptech.glide.d.A(oc0.o.vertical_space_column, sVar2)), u2.b.f120025m, sVar2, 0);
            int i15 = sVar2.P;
            i2.z1 o13 = sVar2.o();
            u2.q X = ao2.m0.X(sVar2, r13);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            if (!(sVar2.f71265a instanceof i2.f)) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar2.a0();
            if (sVar2.O) {
                sVar2.n(iVar);
            } else {
                sVar2.j0();
            }
            tb.f.f0(sVar2, a13, s3.j.f110801e);
            tb.f.f0(sVar2, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i15))) {
                ep.b.y(i15, sVar2, i15, hVar);
            }
            tb.f.f0(sVar2, X, s3.j.f110799c);
            String D0 = a1.D0(s0Var.f121859b, sVar2);
            h3.f s03 = bf.b.s0(s0Var.f121858a, sVar2);
            u2.g gVar2 = u2.b.f120026n;
            com.bumptech.glide.c.c(s03, D0, new HorizontalAlignElement(gVar2), null, sVar2, 0, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
            d6.b(D0, new HorizontalAlignElement(gVar2), 0L, w.r0(4294967296L, com.bumptech.glide.d.A(oc0.o.font_size_title, sVar2)), null, g4.l.f63472g, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar2, 196608, 0, 131028);
            sVar = sVar2;
            sVar.r(true);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.i(s0Var, i13, 2);
        }
    }

    public static void f0(TextView textView, int i13) {
        textView.setHyphenationFrequency(i13);
    }

    public static final void g(uc0.t0 state, u2.q qVar, Function1 emitEvent, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(emitEvent, "emitEvent");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1994523734);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        u2.q n13 = androidx.compose.foundation.layout.b.n(qVar2, com.bumptech.glide.d.A(oc0.o.padding_page, sVar));
        p1.g gVar = p1.l.f98543a;
        p1.y a13 = p1.x.a(p1.l.g(com.bumptech.glide.d.A(oc0.o.vertical_large_space_column, sVar)), u2.b.f120025m, sVar, 0);
        int i15 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, n13);
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
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        uc0.s0 s0Var = state.f121864a;
        sVar.W(1885259283);
        if (s0Var != null) {
            f(state.f121864a, sVar, 0);
        }
        sVar.r(false);
        bp1.h.c(0, 414, null, p1.l.g(com.bumptech.glide.d.A(oc0.o.horizontal_space_row, sVar)), p1.l.g(com.bumptech.glide.d.A(oc0.o.vertical_large_space_column, sVar)), null, new r1.b(2), null, sVar, null, new t80.r(27, state, emitEvent), false, false);
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 20, state, qVar2, emitEvent);
        }
    }

    public static void g0(jk2.l1 l1Var) {
        pk2.d dVar = new pk2.d(1);
        x02.a2 a2Var = ck2.i.f27924d;
        ek2.j jVar = new ek2.j(a2Var, dVar, dVar, a2Var);
        l1Var.d(jVar);
        if (dVar.getCount() != 0) {
            try {
                dVar.await();
            } catch (InterruptedException e13) {
                bk2.c.dispose(jVar);
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e13);
            }
        }
        Throwable th3 = dVar.f100546a;
        if (th3 != null) {
            throw pk2.h.d(th3);
        }
    }

    public static final void h(uc0.b1 b1Var, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-287803955);
        int i15 = i14 & 1;
        int i16 = i15 != 0 ? i13 | 2 : i13;
        if (i15 == 1 && (i16 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
            } else if (i15 != 0) {
                sVar.X(1890788296);
                androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                androidx.lifecycle.l1 v03 = c3.v0(uc0.b1.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                b1Var = (uc0.b1) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(b1Var.f121825e, sVar);
            b1Var.i(new uc0.i(new oc0.a()));
            g((uc0.t0) z13.getValue(), null, new ra0.l0(b1Var, 14), sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(b1Var, i13, i14, 12);
        }
    }

    public static final void h0(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static fs0 i(nm.u json) {
        nm.u a13;
        Intrinsics.checkNotNullParameter(json, "json");
        nm.s v13 = json.v("ad_html");
        String str = null;
        String p13 = v13 != null ? v13.p() : null;
        nm.s v14 = json.v("ad_base_url");
        String p14 = v14 != null ? v14.p() : null;
        nm.s v15 = json.v("ad_json");
        nm.u i13 = v15 != null ? v15.i() : null;
        nm.s v16 = json.v("ad_json");
        nm.q d2 = k41.d(v16 != null ? v16.i() : null, "ads");
        if (d2 != null && (a13 = k41.a(d2, 0)) != null) {
            str = k41.a(a13, "ad_mid", "");
        }
        return new fs0(p13, p14, i13, str);
    }

    public static final void i0(String str) {
        throw new IllegalArgumentException(str);
    }

    public static String j(int i13, String str) {
        return a.a.d(str, i13);
    }

    public static String j0(ll.u uVar) {
        int i13 = ll.h0.f83743a[uVar.ordinal()];
        if (i13 == 1) {
            return "SHA-1";
        }
        if (i13 == 2) {
            return "SHA-224";
        }
        if (i13 == 3) {
            return "SHA-256";
        }
        if (i13 == 4) {
            return "SHA-384";
        }
        if (i13 == 5) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash " + uVar);
    }

    public static String k(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static final ei2.f k0(nj2.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        rVar.getClass();
        nj2.b bVar = (nj2.b) rVar;
        nj2.i iVar = bVar.f90983a;
        String str = ((ri2.b) iVar.f91002b).f108393a;
        Intrinsics.checkNotNullExpressionValue(str, "spanContext.traceId");
        String str2 = ((ri2.b) iVar.f91002b).f108394b;
        Intrinsics.checkNotNullExpressionValue(str2, "spanContext.spanId");
        String str3 = ((ri2.b) iVar.f91003c).f108394b;
        String name = bVar.f90991i;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        long j13 = iVar.f91009i;
        StatusCode statusCode = ((oj2.b) bVar.f90990h).f95406a;
        Intrinsics.checkNotNullExpressionValue(statusCode, "status.statusCode");
        ArrayList arrayList = new ArrayList();
        List list = bVar.f90985c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oj2.a aVar = (oj2.a) ((oj2.c) it.next());
                String name2 = aVar.f95399a;
                Intrinsics.checkNotNullExpressionValue(name2, "eventData.name");
                long j14 = j13;
                long millis = TimeUnit.NANOSECONDS.toMillis(aVar.f95401c);
                qi2.d dVar = aVar.f95400b;
                Intrinsics.checkNotNullExpressionValue(dVar, "eventData.attributes");
                LinkedHashMap U2 = c0.d.U2(dVar);
                Intrinsics.checkNotNullParameter(name2, "name");
                Intrinsics.checkNotNullParameter(name2, "name");
                Iterator it2 = it;
                oi2.c cVar = (name2.length() > 100 || U2.size() > 10) ? null : new oi2.c(name2, TimeUnit.MILLISECONDS.toNanos(millis), U2);
                if (cVar != null) {
                    arrayList.add(cVar);
                }
                it = it2;
                j13 = j14;
            }
        }
        qi2.d attributes = bVar.f90986d;
        Intrinsics.checkNotNullExpressionValue(attributes, "attributes");
        return new ei2.f(str, str2, str3, name, j13, bVar.f90992j, statusCode, arrayList, c0.d.U2(attributes));
    }

    public static final void l(uc0.a1 a1Var, Function1 function1, i2.o oVar, int i13) {
        int i14;
        i2.s sVar;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.Y(-449791591);
        if ((i13 & 14) == 0) {
            i14 = (sVar2.h(a1Var) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i14 |= sVar2.j(function1) ? 32 : 16;
        }
        if ((i14 & 91) == 18 && sVar2.z()) {
            sVar2.Q();
            sVar = sVar2;
        } else {
            String D0 = a1.D0(a1Var.f121756b, sVar2);
            u2.n nVar = u2.n.f120041b;
            u2.q j13 = androidx.compose.ui.platform.a.j(nVar, "Item-" + D0);
            p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar2, 0);
            int i15 = sVar2.P;
            i2.z1 o13 = sVar2.o();
            u2.q X = ao2.m0.X(sVar2, j13);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            if (!(sVar2.f71265a instanceof i2.f)) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar2.a0();
            if (sVar2.O) {
                sVar2.n(iVar);
            } else {
                sVar2.j0();
            }
            tb.f.f0(sVar2, a13, s3.j.f110801e);
            tb.f.f0(sVar2, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i15))) {
                ep.b.y(i15, sVar2, i15, hVar);
            }
            tb.f.f0(sVar2, X, s3.j.f110799c);
            h3.f s03 = bf.b.s0(a1Var.f121755a, sVar2);
            vb0.i iVar2 = q3.m.f102248c;
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(u2.b.f120026n);
            sVar2.W(-1467839195);
            boolean z13 = ((i14 & 14) == 4) | ((i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 32);
            Object J2 = sVar2.J();
            if (z13 || J2 == i2.n.f71185a) {
                J2 = new b10.z(15, function1, a1Var);
                sVar2.g0(J2);
            }
            sVar2.r(false);
            com.bumptech.glide.c.c(s03, D0, androidx.compose.foundation.a.e(horizontalAlignElement, false, null, (Function0) J2, 7), iVar2, sVar2, 24576, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
            d6.b(D0, androidx.compose.foundation.layout.b.r(nVar, 0.0f, com.bumptech.glide.d.A(oc0.o.top_padding_text, sVar2), 0.0f, com.bumptech.glide.d.A(oc0.o.bottom_padding_text, sVar2), 5), 0L, 0L, null, g4.l.f63472g, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar2, 196608, 0, 131036);
            d6.b(a1.D0(a1Var.f121757c, sVar2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar2, 0, 0, 131070);
            sVar = sVar2;
            sVar.r(true);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k1.z(a1Var, function1, i13, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l0(com.pinterest.api.model.f30 r5, a82.b r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof ra0.f
            if (r0 == 0) goto L13
            r0 = r7
            ra0.f r0 = (ra0.f) r0
            int r1 = r0.f106922t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106922t = r1
            goto L18
        L13:
            ra0.f r0 = new ra0.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f106921s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f106922t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ra0.c r5 = r0.f106920r
            ue.c.H(r7)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ue.c.H(r7)
            ra0.c r7 = p(r5)
            r0.f106920r = r7
            r0.f106922t = r3
            java.lang.Object r5 = n0(r5, r6, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r4 = r7
            r7 = r5
            r5 = r4
        L46:
            ra0.l r7 = (ra0.l) r7
            ra0.d r6 = new ra0.d
            r6.<init>(r5, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.n.l0(com.pinterest.api.model.f30, a82.b, bl2.c):java.lang.Object");
    }

    public static final int m(s3.z0 z0Var, q3.a aVar) {
        s3.z0 A0 = z0Var.A0();
        if (A0 == null) {
            jk.r.y("Child of " + z0Var + " cannot be null when calculating alignment line");
            throw null;
        }
        if (z0Var.E0().c().containsKey(aVar)) {
            Integer num = (Integer) z0Var.E0().c().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int i13 = A0.i(aVar);
        if (i13 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        A0.f111013g = true;
        z0Var.f111014h = true;
        z0Var.J0();
        A0.f111013g = false;
        z0Var.f111014h = false;
        return i13 + ((int) (aVar instanceof q3.q ? A0.G0() & 4294967295L : A0.G0() >> 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m0(com.pinterest.api.model.fi0 r6, a82.b r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof ra0.e
            if (r0 == 0) goto L13
            r0 = r8
            ra0.e r0 = (ra0.e) r0
            int r1 = r0.f106917t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106917t = r1
            goto L18
        L13:
            ra0.e r0 = new ra0.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f106916s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f106917t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ra0.c r6 = r0.f106915r
            ue.c.H(r8)
            goto L51
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            ue.c.H(r8)
            ra0.c r8 = new ra0.c
            java.lang.String r2 = r6.getUid()
            java.lang.String r4 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r4 = 5
            r8.<init>(r2, r4)
            r0.f106915r = r8
            r0.f106917t = r3
            java.lang.Object r6 = o0(r6, r7, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r5 = r8
            r8 = r6
            r6 = r5
        L51:
            ra0.l r8 = (ra0.l) r8
            ra0.d r7 = new ra0.d
            r7.<init>(r6, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.n.m0(com.pinterest.api.model.fi0, a82.b, bl2.c):java.lang.Object");
    }

    public static final boolean n(List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (list.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n0(com.pinterest.api.model.f30 r4, a82.b r5, bl2.c r6) {
        /*
            boolean r0 = r6 instanceof ra0.h
            if (r0 == 0) goto L13
            r0 = r6
            ra0.h r0 = (ra0.h) r0
            int r1 = r0.f106928t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106928t = r1
            goto L18
        L13:
            ra0.h r0 = new ra0.h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f106927s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f106928t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.pinterest.api.model.f30 r4 = r0.f106926r
            ue.c.H(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r6)
            com.pinterest.api.model.fi0 r6 = r4.r6()
            if (r6 == 0) goto L48
            r0.f106926r = r4
            r0.f106928t = r3
            java.lang.Object r6 = o0(r6, r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            ra0.l r6 = (ra0.l) r6
            goto L49
        L48:
            r6 = 0
        L49:
            if (r6 == 0) goto L50
            boolean r5 = r6 instanceof ra0.k
            if (r5 != 0) goto L50
            goto L55
        L50:
            r5 = 0
            ra0.l r6 = p0(r4, r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.n.n0(com.pinterest.api.model.f30, a82.b, bl2.c):java.lang.Object");
    }

    public static od2.c o() {
        Pair pair = new Pair("speed", ld2.a.f82993a);
        Pair pair2 = new Pair("scale", jq.b.n(1.0f, null, 0.5f, 20.0f));
        Pair pair3 = new Pair("hSpacing", jq.b.n(0.0f, null, 0.0f, 1.0f));
        Pair pair4 = new Pair("vSpacing", jq.b.n(0.0f, null, 0.0f, 1.0f));
        pd2.t tVar = ld2.a.f82994b;
        PointF defaultValue = new PointF(-1.0f, 0.0f);
        qd2.a0 a0Var = tVar.f99874c;
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return new od2.c("carousel", "vec4 {{name}}(FragmentEffectInput data, in sampler2D sourceTexture) {\n    float scale = {{settings.scale}};\n    vec2 uv = (data.texturePosition - 0.5) * scale + 0.5;\n\n    vec2 direction = -0.5 * {{settings.direction}} * scale;\n    uv += 0.25 * {{settings.speed}} * data.time * direction;\n\n    vec2 spacing = vec2({{settings.hSpacing}}, {{settings.vSpacing}});\n    uv /= (1.0 + spacing);\n\n    bool mirrorX = {{settings.mirror}} && int(abs(floor(uv.x))) % 2 == 1;\n    bool mirrorY = {{settings.mirror}} && int(abs(floor(uv.y))) % 2 == 1;\n\n    uv = fract(uv) * (1.0 + spacing);\n\n    if (length(spacing) > 0.0 && (uv.x > 1.0 || uv.y > 1.0)) {\n        return vec4(0.0);\n    }\n\n    if (mirrorX) {\n        uv.x = 1.0 - uv.x;\n    }\n    if (mirrorY) {\n        uv.y = 1.0 - uv.y;\n    }\n\n    return texture(sourceTexture, uv);\n}", new pd2.q0(kotlin.collections.z0.g(pair, pair2, pair3, pair4, new Pair("direction", new pd2.t(defaultValue, a0Var)), new Pair("mirror", new pd2.c(false)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o0(com.pinterest.api.model.fi0 r3, a82.b r4, bl2.c r5) {
        /*
            boolean r4 = r5 instanceof ra0.g
            if (r4 == 0) goto L13
            r4 = r5
            ra0.g r4 = (ra0.g) r4
            int r0 = r4.f106924s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f106924s = r0
            goto L18
        L13:
            ra0.g r4 = new ra0.g
            r4.<init>(r5)
        L18:
            java.lang.Object r5 = r4.f106923r
            cl2.a r0 = cl2.a.COROUTINE_SUSPENDED
            int r4 = r4.f106924s
            ra0.k r0 = ra0.k.f106951a
            if (r4 == 0) goto L3a
            r3 = 1
            if (r4 != r3) goto L32
            ue.c.H(r5)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L48
            ra0.i r0 = new ra0.i
            r0.<init>(r5)
            goto L48
        L32:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L3a:
            ue.c.H(r5)
            ra0.l r3 = q0(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r3, r0)
            if (r4 != 0) goto L48
            r0 = r3
        L48:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.n.o0(com.pinterest.api.model.fi0, a82.b, bl2.c):java.lang.Object");
    }

    public static final ra0.c p(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        fi0 r63 = f30Var.r6();
        String uid2 = r63 != null ? r63.getUid() : null;
        if (uid2 == null) {
            uid2 = "";
        }
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        wy0 M1 = j1.M1(f30Var);
        String uid3 = M1 != null ? M1.getUid() : null;
        return new ra0.c(uid, uid2, uid3 != null ? uid3 : "");
    }

    public static final ra0.l p0(f30 f30Var, boolean z13) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String o03 = z13 ? bs1.c.o0(f30Var) : bs1.c.p0(f30Var);
        return (o03 == null || kotlin.text.z.j(o03)) ? ra0.k.f106951a : new ra0.j(o03);
    }

    public static od2.c q() {
        return new od2.c("echo", "vec4 {{name}}(FragmentEffectInput data, in sampler2D sourceTexture) {\n    vec2 pos = data.texturePosition - 0.5;\n    float stage = fract(data.time * {{settings.speed}} * ({{settings.inverted}} ? -1.0 : 1.0));\n\n    vec2 amount;\n    if ({{settings.radial}}) {\n        float distanceFromCenter = length(pos - ({{settings.center}} - 0.5));\n        amount = vec2(distanceFromCenter * (0.1 + 3.0 * {{settings.strength}}));\n    } else {\n        amount = {{settings.center}} * {{settings.strength}};\n    }\n\n    vec2 pos1 = pos * (1.0 - amount * stage) + 0.5;\n    vec2 pos2 = pos * (1.0 - amount * (1.0 + stage)) + 0.5;\n    vec4 color1 = texture(sourceTexture, pos1);\n    vec4 color2 = texture(sourceTexture, pos2);\n\n    vec4 foregroundColor = mix(color2, color1, stage);\n    foregroundColor *= data.color.a;\n\n    return foregroundColor;\n}\n", new pd2.q0(kotlin.collections.z0.g(new Pair("speed", ld2.a.f82993a), new Pair("inverted", new pd2.c(false)), new Pair("radial", new pd2.c(true)), new Pair("strength", jq.b.n(0.5f, null, 0.0f, 0.5f)), new Pair("center", ld2.a.f82995c))));
    }

    public static final ra0.l q0(fi0 fi0Var) {
        Intrinsics.checkNotNullParameter(fi0Var, "<this>");
        String d03 = k3.d0(fi0Var);
        if (d03 == null) {
            d03 = k3.c0(fi0Var);
        }
        return (d03 == null || kotlin.text.z.j(d03)) ? ra0.k.f106951a : new ra0.j(d03);
    }

    public static final boolean r(int i13, int i14) {
        return i13 == i14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x051a, code lost:
    
        if ("Spreadtrum".equalsIgnoreCase(r7) == false) goto L635;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0559  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.camera.core.impl.r s(w.l r13) {
        /*
            Method dump skipped, instructions count: 1417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.n.s(w.l):androidx.camera.core.impl.r");
    }

    public static final int t(g4.l lVar, int i13) {
        boolean z13 = lVar.compareTo(g4.l.f63467b) >= 0;
        boolean a13 = g4.j.a(i13, 1);
        if (a13 && z13) {
            return 3;
        }
        if (z13) {
            return 1;
        }
        return a13 ? 2 : 0;
    }

    public static final String u(e8 e8Var) {
        Intrinsics.checkNotNullParameter(e8Var, "<this>");
        if (!hf0.b.q()) {
            String j13 = e8Var.j();
            Intrinsics.checkNotNullExpressionValue(j13, "getLargeImageURL(...)");
            return j13;
        }
        String m13 = e8Var.m();
        if (m13.length() == 0) {
            m13 = e8Var.j();
        }
        Intrinsics.checkNotNullExpressionValue(m13, "ifEmpty(...)");
        return m13;
    }

    public static int v(TextView textView) {
        return textView.getBreakStrategy();
    }

    public static final we0 w(se0 se0Var) {
        List y13;
        if (se0Var == null || (y13 = se0Var.y()) == null || y13.isEmpty()) {
            return null;
        }
        return (we0) y13.get(0);
    }

    public static int x(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    public static final Map y(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            bg bgVar = (bg) entry.getValue();
            Intrinsics.checkNotNullParameter(bgVar, "<this>");
            Integer v13 = bgVar.v();
            Intrinsics.checkNotNullExpressionValue(v13, "getImpression(...)");
            int intValue = v13.intValue();
            Integer y13 = bgVar.y();
            Integer B = bgVar.B();
            Intrinsics.checkNotNullExpressionValue(B, "getSave(...)");
            int intValue2 = B.intValue();
            Integer z13 = bgVar.z();
            Intrinsics.checkNotNullExpressionValue(z13, "getPinClick(...)");
            int intValue3 = z13.intValue();
            Date C = bgVar.C();
            Boolean w13 = bgVar.w();
            Intrinsics.checkNotNullExpressionValue(w13, "getIsRealtime(...)");
            linkedHashMap.put(str, new s30(intValue, y13, intValue2, intValue3, C, w13.booleanValue()));
        }
        return kotlin.collections.z0.n(linkedHashMap);
    }

    public static final Map z(Map map) {
        String str;
        Iterator it;
        Long l13;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str3 = (String) entry.getKey();
            bg bgVar = (bg) entry.getValue();
            Intrinsics.checkNotNullParameter(bgVar, str2);
            Integer v13 = bgVar.v();
            Intrinsics.checkNotNullExpressionValue(v13, "getImpression(...)");
            int intValue = v13.intValue();
            Integer y13 = bgVar.y();
            Intrinsics.checkNotNullExpressionValue(y13, "getOutboundClick(...)");
            int intValue2 = y13.intValue();
            Integer B = bgVar.B();
            Intrinsics.checkNotNullExpressionValue(B, "getSave(...)");
            int intValue3 = B.intValue();
            Integer z13 = bgVar.z();
            Intrinsics.checkNotNullExpressionValue(z13, "getPinClick(...)");
            int intValue4 = z13.intValue();
            boolean[] zArr = bgVar.f36093v;
            Integer F = zArr.length > 17 && zArr[17] ? bgVar.F() : null;
            Integer I = bgVar.I();
            Intrinsics.checkNotNullExpressionValue(I, "getVideoViews(...)");
            int intValue5 = I.intValue();
            boolean[] zArr2 = bgVar.f36093v;
            Integer G = (zArr2.length <= 18 || !zArr2[18]) ? null : bgVar.G();
            boolean[] zArr3 = bgVar.f36093v;
            if (zArr3.length <= 19 || !zArr3[19]) {
                str = str2;
                it = it2;
                l13 = null;
            } else {
                str = str2;
                it = it2;
                l13 = Long.valueOf((long) bgVar.H().doubleValue());
            }
            Date C = bgVar.C();
            Boolean w13 = bgVar.w();
            Intrinsics.checkNotNullExpressionValue(w13, "getIsRealtime(...)");
            linkedHashMap.put(str3, new d01(intValue, intValue2, intValue3, intValue4, F, intValue5, G, l13, C, w13.booleanValue()));
            str2 = str;
            it2 = it;
        }
        return kotlin.collections.z0.n(linkedHashMap);
    }

    public abstract int V(b22.l lVar);
}
