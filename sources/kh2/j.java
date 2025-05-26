package kh2;

import a.cb;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.transition.Transition;
import c2.d6;
import com.pinterest.activity.nux.NUXActivity;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.c9;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.api.model.kc;
import com.pinterest.api.model.lf0;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.r10;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.y8;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.unifiedcomments.view.CommentActivity;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import h32.g0;
import h32.u0;
import java.io.Reader;
import java.io.StringWriter;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import lh0.a4;
import lh0.f4;
import lh0.z3;
import nx.d0;
import nx.d1;
import so.h9;
import so.r8;
import so.w3;
import x02.b2;
import x02.i2;
import x02.x0;

/* loaded from: classes4.dex */
public abstract class j {
    public static final void A(ao2.m mVar, xj2.c cVar) {
        mVar.e(new cp.i(cVar, 18));
    }

    public static void A0(sw0.j0 j0Var, g70.h hVar) {
        j0Var.O0 = hVar;
    }

    public static void A1(yq1.s2 s2Var, h9 h9Var) {
        s2Var.f139996j0 = h9Var;
    }

    public static void A2(long[] jArr, long[] jArr2) {
        long j13 = jArr[0];
        long j14 = jArr[1];
        long j15 = jArr[2];
        long j16 = jArr[3];
        long j17 = jArr[4];
        long j18 = jArr[5];
        long j19 = jArr[6];
        long j23 = jArr[7];
        long j24 = j19 ^ (j23 >>> 17);
        long j25 = (j18 ^ (j23 << 47)) ^ (j24 >>> 17);
        long j26 = ((j17 ^ (j23 >>> 47)) ^ (j24 << 47)) ^ (j25 >>> 17);
        long j27 = j13 ^ (j26 << 17);
        long j28 = (j14 ^ (j25 << 17)) ^ (j26 >>> 47);
        long j29 = ((j15 ^ (j24 << 17)) ^ (j25 >>> 47)) ^ (j26 << 47);
        long j33 = (((j16 ^ (j23 << 17)) ^ (j24 >>> 47)) ^ (j25 << 47)) ^ (j26 >>> 17);
        long j34 = j33 >>> 47;
        jArr2[0] = j27 ^ j34;
        jArr2[1] = j28;
        jArr2[2] = (j34 << 30) ^ j29;
        jArr2[3] = 140737488355327L & j33;
    }

    public static final boolean B(int i13, int i14) {
        return i13 == i14;
    }

    public static void B0(ho0.m mVar, uk1.d dVar) {
        mVar.F1 = dVar;
    }

    public static void B1(sw0.j0 j0Var, dc2.e eVar) {
        j0Var.A0 = eVar;
    }

    public static void B2(AudioTrack audioTrack, n7.q0 q0Var) {
        LogSessionId logSessionId;
        boolean equals;
        LogSessionId a13 = q0Var.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = a13.equals(logSessionId);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(a13);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [a11.s] */
    public static final a11.s C(final nx.d0 topLevelPinalytics, final nx.d1 trackingParamAttacher, final f30 pin, final m60.w eventManager, final yk1.v resources, final x02.x0 x0Var, final x02.i2 pinRepo, final i92.k toastUtils) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinRepo, "pinRepo");
        Intrinsics.checkNotNullParameter(topLevelPinalytics, "topLevelPinalytics");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        return new View.OnClickListener() { // from class: a11.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d1 trackingParamAttacher2 = trackingParamAttacher;
                Intrinsics.checkNotNullParameter(trackingParamAttacher2, "$trackingParamAttacher");
                final f30 pin2 = pin;
                Intrinsics.checkNotNullParameter(pin2, "$pin");
                final d0 topLevelPinalytics2 = topLevelPinalytics;
                Intrinsics.checkNotNullParameter(topLevelPinalytics2, "$topLevelPinalytics");
                m60.w eventManager2 = eventManager;
                Intrinsics.checkNotNullParameter(eventManager2, "$eventManager");
                i2 pinRepo2 = pinRepo;
                Intrinsics.checkNotNullParameter(pinRepo2, "$pinRepo");
                final i92.k toastUtils2 = toastUtils;
                Intrinsics.checkNotNullParameter(toastUtils2, "$toastUtils");
                final yk1.v resources2 = resources;
                Intrinsics.checkNotNullParameter(resources2, "$resources");
                String b13 = trackingParamAttacher2.b(pin2);
                String uid = pin2.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                b2 b2Var = new b2(uid, b13);
                topLevelPinalytics2.b0(u0.PIN_DELETE_BUTTON, g0.MODAL_DIALOG, pin2.getUid(), false);
                eventManager2.d(new jc0.s());
                uj2.b m13 = pinRepo2.m(b2Var, pin2);
                final x0 x0Var2 = x0Var;
                m13.i(new ak2.a() { // from class: a11.t
                    @Override // ak2.a
                    public final void run() {
                        v7 localBoard;
                        d0 topLevelPinalytics3 = d0.this;
                        Intrinsics.checkNotNullParameter(topLevelPinalytics3, "$topLevelPinalytics");
                        f30 pin3 = pin2;
                        Intrinsics.checkNotNullParameter(pin3, "$pin");
                        i92.k toastUtils3 = toastUtils2;
                        Intrinsics.checkNotNullParameter(toastUtils3, "$toastUtils");
                        yk1.v resources3 = resources2;
                        Intrinsics.checkNotNullParameter(resources3, "$resources");
                        d0.v(topLevelPinalytics3, f1.PIN_DELETE, pin3.getUid(), false, 12);
                        toastUtils3.m(((yk1.a) resources3).f139224a.getString(r80.f.pin_deleted));
                        x0 x0Var3 = x0Var2;
                        if (x0Var3 == null || (localBoard = (v7) x0Var3.O(b40.i(pin3))) == null) {
                            return;
                        }
                        Intrinsics.checkNotNullParameter(localBoard, "localBoard");
                        x0Var3.c0(1, localBoard);
                    }
                }, new f(11, j.f292o));
            }
        };
    }

    public static void C0(pe1.p pVar, e02.a aVar) {
        pVar.f99972j1 = aVar;
    }

    public static void C1(pe1.p pVar, lb0.q qVar) {
        pVar.f99978p1 = qVar;
    }

    public static final void C2(GestaltText gestaltText, lf0 content) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Context context = gestaltText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer q13 = content.q();
        Intrinsics.checkNotNullExpressionValue(q13, "getSpacingBefore(...)");
        int Q = df.j1.Q(context, q13.intValue());
        Context context2 = gestaltText.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Integer n13 = content.n();
        Intrinsics.checkNotNullExpressionValue(n13, "getSpacingAfter(...)");
        gestaltText.setPaddingRelative(0, Q, 0, df.j1.Q(context2, n13.intValue()));
        boolean[] zArr = content.f39745h;
        if (zArr.length <= 2 || !zArr[2]) {
            gestaltText.i(q61.a.f102590j);
        } else {
            float intValue = content.l().intValue();
            gestaltText.i(new mp.m(intValue <= 14.0f ? vn1.g.BODY_100 : (14.0f > intValue || intValue > 18.0f) ? (18.0f > intValue || intValue > 24.0f) ? (24.0f > intValue || intValue > 32.0f) ? vn1.g.HEADING_XL : vn1.g.HEADING_700 : vn1.g.UI_400 : vn1.g.BODY_300, 7));
        }
        gestaltText.i(q61.a.f102591k);
        String s13 = content.s();
        if (s13 != null) {
            pk.a0.q(gestaltText, bs1.c.h2(s13));
        }
    }

    public static Object D(Context context) {
        ComponentCallbacks2 C = com.bumptech.glide.c.C(context.getApplicationContext());
        boolean z13 = C instanceof af2.b;
        Class<?> cls = C.getClass();
        if (z13) {
            return ((af2.b) C).generatedComponent();
        }
        throw new IllegalArgumentException(a.a.h("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: ", cls));
    }

    public static void D0(ho0.m mVar, z70.m mVar2) {
        mVar.J1 = mVar2;
    }

    public static void D1(a41.r rVar, lb0.r rVar2) {
        rVar.E0 = rVar2;
    }

    public static void D2(PopupWindow popupWindow) {
        popupWindow.setWindowLayoutType(2);
    }

    public static final Collection E(am2.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        xl2.l f13 = d0Var.f();
        f13.getClass();
        pn2.h0 t13 = f13.t(xl2.o.INT);
        if (t13 == null) {
            xl2.l.a(59);
            throw null;
        }
        xl2.l f14 = d0Var.f();
        f14.getClass();
        pn2.h0 t14 = f14.t(xl2.o.LONG);
        if (t14 == null) {
            xl2.l.a(60);
            throw null;
        }
        xl2.l f15 = d0Var.f();
        f15.getClass();
        pn2.h0 t15 = f15.t(xl2.o.BYTE);
        if (t15 == null) {
            xl2.l.a(57);
            throw null;
        }
        xl2.l f16 = d0Var.f();
        f16.getClass();
        pn2.h0 t16 = f16.t(xl2.o.SHORT);
        if (t16 != null) {
            return kotlin.collections.f0.j(t13, t14, t15, t16);
        }
        xl2.l.a(58);
        throw null;
    }

    public static void E0(a41.r rVar, a11.d dVar) {
        rVar.f673w0 = dVar;
    }

    public static void E1(pe1.p pVar, lb0.r rVar) {
        pVar.f99974l1 = rVar;
    }

    public static nd2.b E2() {
        kd2.i iVar = kd2.i.f79272h;
        if (iVar == null) {
            throw new IllegalStateException("XRendererApp must be initialized first.".toString());
        }
        String str = "shadow";
        if (iVar.f79279g) {
            return a0("shadow");
        }
        Pair pair = new Pair("direction", new pd2.t(new PointF(0.0f, 0.0f), null).c(new PointF(0.0f, 0.0f), 0.5f));
        Pair pair2 = new Pair("radius", jq.b.n(2.0f, null, 0.0f, 6.0f));
        Pair pair3 = new Pair("opacity", jq.b.n(1.0f, null, 0.0f, 1.0f));
        new pd2.n(5, null);
        return new nd2.b(str, kotlin.collections.f0.j("float shadow_at_{{name}}(ivec2 absPosition, int absRadius, in sampler2D image) {\n    ivec2 imageSize = textureSize(image, 0);\n    if (absPosition.x < 0 || absPosition.x >= imageSize.x) {\n        return 0.0;\n    }\n\n    if (absRadius < 1) {\n        return texelFetch(image, absPosition, 0).a;\n    }\n\n    float sigma = float(absRadius) * {{settings.diffusion}};\n    float avg = 0.0;\n    float sum = 0.0;\n\n    int step = {{settings.step}};\n    for (int dy = -absRadius; dy < absRadius; dy += step) {\n        int y = absPosition.y + dy;\n\n        float alpha = 0.0;\n        if (y >= 0 && y < imageSize.y) {\n            alpha = texelFetch(image, ivec2(absPosition.x, y), 0).a;\n        }\n\n        float gaussian = gaussian1D(float(dy), sigma);\n\n        avg += alpha * gaussian;\n        sum += gaussian;\n    }\n    \n    return avg / sum;\n}\n\nvec4 {{name}}(vec2 uv, in sampler2D orig, in sampler2D src) {\n    vec2 imageSize = vec2(textureSize(orig, 0));\n    vec2 offset = ({{settings.direction}} * 2.2) * imageSize.x;\n    float absRadius = 0.05 * {{settings.radius}} * imageSize.x;\n\n    float xScale = imageSize.x / (2.0 * absRadius + imageSize.x + abs(offset.x));\n    float yScale = imageSize.y / (2.0 * absRadius + imageSize.y + abs(offset.y));\n    float scale = min(xScale, yScale);\n    float xShift = imageSize.x * (1.0 - scale) / 2.0;\n    float yShift = imageSize.y * (1.0 - scale) / 2.0;\n\n    vec2 pivot = (uv * imageSize - vec2(xShift, yShift)) / vec2(scale) - 0.5 * offset;\n\n    float shadow = shadow_at_{{name}}(\n        ivec2(pivot),\n        int(absRadius),\n        orig\n    );\n\n    return vec4(0, 0, 0, shadow);\n}", "float shadow_at_{{name}}(ivec2 absPosition, int absRadius, in sampler2D image) {\n    ivec2 imageSize = textureSize(image, 0);\n    if (absPosition.y < 0 || absPosition.y >= imageSize.y) {\n        return 0.0;\n    }\n\n    if (absRadius < 1) {\n        return texelFetch(image, absPosition, 0).a;\n    }\n\n    float sigma = float(absRadius) * {{settings.diffusion}};\n    float avg = 0.0;\n    float sum = 0.0;\n\n    int step = {{settings.step}};\n    for (int dx = -absRadius; dx < absRadius; dx += step) {\n        int x = absPosition.x + dx;\n\n        float alpha = 0.0;\n        if (x >= 0 && x < imageSize.x) {\n            alpha = texelFetch(image, ivec2(x, absPosition.y), 0).a;\n        }\n\n        float gaussian = gaussian1D(float(dx), sigma);\n\n        avg += alpha * gaussian;\n        sum += gaussian;\n    }\n    \n    return avg / sum;\n}\n\nint shadow_radius_{{name}}(vec2 shadowSize) {\n    float absRadius = 0.05 * {{settings.radius}} * shadowSize.x;\n    vec2 offset = ({{settings.direction}} * 2.2) * shadowSize.x;\n\n    float xScale = shadowSize.x / (2.0 * absRadius + shadowSize.x + abs(offset.x));\n    float yScale = shadowSize.y / (2.0 * absRadius + shadowSize.y + abs(offset.y));\n    return int(absRadius * min(xScale, yScale));\n}\n\nvec2 image_pivot_{{name}}(vec2 uv, vec2 imageSize) {\n    vec2 offset = ({{settings.direction}} * 2.2) * imageSize.x;\n    float absRadius = 0.05 * {{settings.radius}} * imageSize.x;\n\n    // scale image the same way we scaled shadow before\n    float xScale = imageSize.x / (2.0 * absRadius + imageSize.x + abs(offset.x));\n    float yScale = imageSize.y / (2.0 * absRadius + imageSize.y + abs(offset.y));\n    float scale = min(xScale, yScale);\n    float xShift = imageSize.x * (1.0 - scale) / 2.0;\n    float yShift = imageSize.y * (1.0 - scale) / 2.0;\n\n    vec2 pivot = (uv * imageSize - vec2(xShift, yShift)) / vec2(scale) + 0.5 * offset;\n    return pivot / imageSize;\n}\n\nvec4 {{name}}(vec2 uv, in sampler2D orig, in sampler2D src) {\n    vec2 imageSize = vec2(textureSize(orig, 0));\n    vec2 shadowSize = vec2(textureSize(src, 0));\n\n    vec2 shadowPivot = uv * shadowSize;\n    vec2 imagePivot = image_pivot_{{name}}(uv, imageSize);\n\n    vec4 imgColor = sampleWithConstantWrap(orig, imagePivot, vec4(0.0));\n    if (imgColor.a > 0.95) {\n        return imgColor;\n    }\n\n    float shadow = {{settings.opacity}} * shadow_at_{{name}}(\n        ivec2(shadowPivot),\n        // scale the kernel size by the same amount the image on the previous step was scaled\n        shadow_radius_{{name}}(shadowSize),\n        src\n    );\n\n    return vec4(0, 0, 0, shadow);\n}"), new pd2.q0(kotlin.collections.z0.g(pair, pair2, pair3, new Pair("step", new pd2.n(5, new qd2.o(1, 5))), new Pair("diffusion", jq.b.n(0.33f, null, 0.25f, 0.5f)))));
    }

    public static final uj2.b0 F(j22.b bVar, String query, String numAutoCompletes, boolean z13) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(numAutoCompletes, "numAutoCompletes");
        return bVar.g(query, Boolean.FALSE, "0", "0", "0", numAutoCompletes, "0", z13 ? "recent_personal_searches" : "recent_pin_searches", Boolean.valueOf(z13), null, z13 ? n00.b.a(n00.c.SEARCH_PERSONAL_RETRIEVAL) : null, null);
    }

    public static void F0(g41.c cVar, pb0.a aVar) {
        cVar.D0 = aVar;
    }

    public static void F1(sw0.j0 j0Var, lb0.r rVar) {
        j0Var.N0 = rVar;
    }

    public static void F2(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        g0(jArr, jArr3);
        A2(jArr3, jArr2);
    }

    public static final bc0.a G(wy0 wy0Var) {
        return new bc0.a(dl2.b.t0(wy0Var), dl2.b.M0(wy0Var), 60);
    }

    public static void G0(yq1.y1 y1Var, fr1.c cVar) {
        y1Var.f140074n0 = cVar;
    }

    public static void G1(pe1.p pVar, w3 w3Var) {
        pVar.f99971i1 = w3Var;
    }

    public static void G2(int i13, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        g0(jArr, jArr3);
        A2(jArr3, jArr2);
        while (true) {
            i13--;
            if (i13 <= 0) {
                return;
            }
            g0(jArr2, jArr3);
            A2(jArr3, jArr2);
        }
    }

    public static final String H(mv mvVar) {
        Intrinsics.checkNotNullParameter(mvVar, "<this>");
        v7 D = mvVar.D();
        if (D != null) {
            return D.getUid();
        }
        return null;
    }

    public static void H0(ez1.d dVar, vx.c cVar) {
        dVar.f60708f0 = cVar;
    }

    public static void H1(yq1.y1 y1Var, so.a0 a0Var) {
        y1Var.f140072l0 = a0Var;
    }

    public static final yl1.b H2(ym1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new yl1.b(dVar.f139419a, false, dVar.f139420b, null, yl1.d.TERTIARY.getColorPalette(), yl1.c.SMALL, null, null, dVar.f139421c, null, 714);
    }

    public static final c9 I(y8 y8Var) {
        Intrinsics.checkNotNullParameter(y8Var, "<this>");
        String c13 = y8Var.c();
        if (c13 == null) {
            return null;
        }
        Object e13 = vd0.c.f125622b.e(df.j1.p1(c13).i(), c9.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.BoardNameMetadata");
        return (c9) e13;
    }

    public static void I0(a41.r rVar) {
        rVar.getClass();
    }

    public static void I1(a41.r rVar, uk1.e eVar) {
        rVar.f675x0 = eVar;
    }

    public static long I2(long j13, long j14, long j15, int i13) {
        int i14 = d7.n0.f53866a;
        return j13 + d7.n0.g0(j14 - j15, 1000000L, i13, RoundingMode.DOWN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static final ArrayList J(List list) {
        ?? r73;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<kc> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        for (kc kcVar : list2) {
            Intrinsics.checkNotNullParameter(kcVar, "<this>");
            String g13 = kcVar.g();
            String e13 = kcVar.e();
            List f13 = kcVar.f();
            if (f13 != null) {
                Intrinsics.checkNotNullParameter(f13, "<this>");
                List<r10> list3 = f13;
                r73 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                for (r10 r10Var : list3) {
                    Intrinsics.checkNotNullParameter(r10Var, "<this>");
                    r73.add(new t10.d(r10Var.e(), r10Var.f()));
                }
            } else {
                r73 = kotlin.collections.q0.f80391a;
            }
            arrayList.add(new t10.a(g13, e13, r73));
        }
        return arrayList;
    }

    public static void J0(ho0.m mVar, m60.f0 f0Var) {
        mVar.L1 = f0Var;
    }

    public static void J1(g41.c cVar, uk1.e eVar) {
        cVar.A0 = eVar;
    }

    public static String J2(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] digest = messageDigest.digest();
            Formatter formatter = new Formatter();
            for (byte b13 : digest) {
                formatter.format("%02x", Byte.valueOf(b13));
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (NoSuchAlgorithmException e13) {
            Log.getStackTraceString(e13);
            return "";
        }
    }

    public static final String K(nk1.g gVar, nx.d1 d1Var) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String str = gVar.f91131e;
        if (str != null) {
            return str;
        }
        HashMap hashMap = gVar.f91130d;
        if (hashMap == null) {
            hashMap = (HashMap) gVar.f91133g.invoke();
        }
        String str2 = (String) hashMap.get("pin_id");
        if (str2 == null) {
            str2 = "";
        }
        if (d1Var != null) {
            return d1Var.c(str2);
        }
        return null;
    }

    public static void K0(a41.r rVar, hf0.c cVar) {
        rVar.f671v0 = cVar;
    }

    public static void K1(gb1.c cVar, uk1.e eVar) {
        cVar.f64684v0 = eVar;
    }

    public static final int K2(tp tpVar) {
        return (tpVar == null || tpVar.R()) ? 0 : 1;
    }

    public static final cn1.g L() {
        int i13 = cn1.i0.searchfield_external_trailing_action_cancel;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        ArrayList arrayList = new ArrayList(formatArgs.length);
        for (String str : formatArgs) {
            arrayList.add(new u50.f0(str));
        }
        u50.k0 k0Var = new u50.k0(i13, arrayList);
        rm1.i iVar = GestaltSearchField.f49499t;
        return new cn1.g(k0Var, true, k0Var, GestaltSearchField.A.getColorPalette(), cn1.f0.gestalt_trailing_button);
    }

    public static void L0(sw0.j0 j0Var, de0.d dVar) {
        j0Var.F0 = dVar;
    }

    public static void L1(ki0.c cVar, uk1.e eVar) {
        cVar.f79786l0 = eVar;
    }

    public static final pc.v L2(pc.v customScalarAdapters, LinkedHashSet deferredFragmentIds) {
        Intrinsics.checkNotNullParameter(customScalarAdapters, "<this>");
        Intrinsics.checkNotNullParameter(deferredFragmentIds, "deferredFragmentIds");
        customScalarAdapters.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.d(null, Boolean.TRUE);
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        linkedHashMap.putAll(customScalarAdapters.f99609c);
        pc.b j13 = customScalarAdapters.f99608b.j();
        j13.f99513b = deferredFragmentIds;
        ae.s adapterContext = j13.a();
        Intrinsics.checkNotNullParameter(adapterContext, "adapterContext");
        return new pc.v(linkedHashMap, adapterContext);
    }

    public static final Integer M(GestaltStaticSearchBar gestaltStaticSearchBar) {
        dn1.a aVar;
        Intrinsics.checkNotNullParameter(gestaltStaticSearchBar, "<this>");
        cn1.c cVar = gestaltStaticSearchBar.t0().f28252l;
        if (cVar == null || (aVar = cVar.f28147d) == null) {
            return null;
        }
        return Integer.valueOf(aVar.getIdRes());
    }

    public static void M0(a41.r rVar, zf0.f fVar) {
        rVar.f669u0 = fVar;
    }

    public static void M1(pa0.c cVar, uk1.e eVar) {
        cVar.f99376r0 = eVar;
    }

    public static final Integer N(GestaltStaticSearchBar gestaltStaticSearchBar) {
        dn1.a aVar;
        Intrinsics.checkNotNullParameter(gestaltStaticSearchBar, "<this>");
        cn1.c cVar = gestaltStaticSearchBar.t0().f28253m;
        if (cVar == null || (aVar = cVar.f28147d) == null) {
            return null;
        }
        return Integer.valueOf(aVar.getIdRes());
    }

    public static void N0(sw0.j0 j0Var, zf0.f fVar) {
        j0Var.J0 = fVar;
    }

    public static void N1(q91.g1 g1Var, uk1.e eVar) {
        g1Var.f103108j0 = eVar;
    }

    public static final cn1.c O(TypedArray typedArray) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        rm1.q b13 = rm1.r.b(typedArray, cn1.j0.GestaltSearchField_gestalt_searchfieldEndActionOneIcon);
        if (b13 == null) {
            return null;
        }
        String string = typedArray.getString(cn1.j0.GestaltSearchField_gestalt_searchfieldEndActionOneContentDesc);
        int i13 = cn1.j0.GestaltSearchField_gestalt_searchfieldEndActionOneStyle;
        rm1.i iVar = GestaltSearchField.f49499t;
        om1.f fVar = GestaltSearchField.f49504y;
        int i14 = typedArray.getInt(i13, -1);
        return new cn1.c(b13, i14 >= 0 ? om1.f.values()[i14] : fVar, string != null ? bs1.c.h2(string) : null, dn1.a.END_ACTION_BUTTONS_ONE, typedArray.getBoolean(cn1.j0.GestaltSearchField_gestalt_searchfieldEndActionOneEnabled, true));
    }

    public static void O0(ez1.d dVar, vx.d dVar2) {
        dVar.f60707e0 = dVar2;
    }

    public static void O1(yq1.y1 y1Var, uk1.e eVar) {
        y1Var.f140071k0 = eVar;
    }

    public static final cn1.c P(TypedArray typedArray) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        rm1.q b13 = rm1.r.b(typedArray, cn1.j0.GestaltSearchField_gestalt_searchfieldEndActionTwoIcon);
        if (b13 == null) {
            return null;
        }
        String string = typedArray.getString(cn1.j0.GestaltSearchField_gestalt_searchfieldEndActionTwoContentDesc);
        int i13 = cn1.j0.GestaltSearchField_gestalt_searchfieldEndActionTwoStyle;
        rm1.i iVar = GestaltSearchField.f49499t;
        om1.f fVar = GestaltSearchField.f49504y;
        int i14 = typedArray.getInt(i13, -1);
        return new cn1.c(b13, i14 >= 0 ? om1.f.values()[i14] : fVar, string != null ? bs1.c.h2(string) : null, dn1.a.END_ACTION_BUTTONS_TWO, typedArray.getBoolean(cn1.j0.GestaltSearchField_gestalt_searchfieldEndActionTwoEnabled, true));
    }

    public static void P0(sw0.j0 j0Var, vr0.a aVar) {
        j0Var.L0 = aVar;
    }

    public static void P1(a41.r rVar, so.x1 x1Var) {
        rVar.f679z0 = x1Var;
    }

    public static final cn1.c Q(TypedArray typedArray) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        rm1.q b13 = rm1.r.b(typedArray, cn1.j0.GestaltSearchField_gestalt_searchfieldLeadingActionIcon);
        if (b13 == null) {
            return null;
        }
        String string = typedArray.getString(cn1.j0.GestaltSearchField_gestalt_searchfieldLeadingActionContentDesc);
        int i13 = cn1.j0.GestaltSearchField_gestalt_searchfieldLeadingActionStyle;
        om1.f fVar = GestaltSearchField.f49504y;
        int i14 = typedArray.getInt(i13, -1);
        return new cn1.c(b13, i14 >= 0 ? om1.f.values()[i14] : fVar, string != null ? bs1.c.h2(string) : null, dn1.a.LEADING_ICON_BUTTON, 16);
    }

    public static void Q0(a41.r rVar, rg0.s sVar) {
        rVar.G0 = sVar;
    }

    public static void Q1(a41.r rVar, so.w1 w1Var) {
        rVar.f677y0 = w1Var;
    }

    public static final m81.s R(int i13, int i14) {
        return (i13 == 0 || i14 == 0) ? m81.s.SPAN_WIDTH : ((float) i13) / ((float) i14) < ((float) hf0.b.f69002b) / ((float) hf0.b.f69003c) ? m81.s.SPAN_HEIGHT : m81.s.SPAN_WIDTH;
    }

    public static void R0(NUXActivity nUXActivity, rg0.s sVar) {
        nUXActivity.experiences = sVar;
    }

    public static void R1(a41.r rVar, so.a2 a2Var) {
        rVar.D0 = a2Var;
    }

    public static final bm1.n S(bm1.n currentButtonToggleState) {
        Intrinsics.checkNotNullParameter(currentButtonToggleState, "currentButtonToggleState");
        int i13 = bm1.u.f23523a[currentButtonToggleState.ordinal()];
        if (i13 == 1) {
            return bm1.n.SELECTED;
        }
        if (i13 == 2) {
            return bm1.n.UNSELECTED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void S0(sw0.j0 j0Var, rg0.s sVar) {
        j0Var.H0 = sVar;
    }

    public static void S1(ho0.m mVar, b60.b bVar) {
        mVar.D1 = bVar;
    }

    public static final String T(mv mvVar) {
        Intrinsics.checkNotNullParameter(mvVar, "<this>");
        f30 I = mvVar.I();
        if (I != null) {
            return I.getUid();
        }
        return null;
    }

    public static void T0(a41.r rVar, lh0.u2 u2Var) {
        rVar.B0 = u2Var;
    }

    public static void T1(ho0.m mVar, m60.w wVar) {
        mVar.C1 = wVar;
    }

    public static final String U(Class cls) {
        List split$default;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        split$default = StringsKt__StringsKt.split$default(canonicalName, new String[]{"."}, false, 0, 6, null);
        return CollectionsKt.Z(CollectionsKt.z0(2, split$default), ".", null, null, 0, null, null, 62);
    }

    public static void U0(NUXActivity nUXActivity, lh0.j2 j2Var) {
        nUXActivity.experiments = j2Var;
    }

    public static void U1(ho0.m mVar, so.n2 n2Var) {
        mVar.G1 = n2Var;
    }

    public static final String V(mv mvVar) {
        Intrinsics.checkNotNullParameter(mvVar, "<this>");
        wy0 L = mvVar.L();
        if (L != null) {
            return L.getUid();
        }
        return null;
    }

    public static void V0(q91.g1 g1Var, lh0.m3 m3Var) {
        g1Var.f103111m0 = m3Var;
    }

    public static void V1(ho0.m mVar, ac2.m mVar2) {
        mVar.M1 = mVar2;
    }

    public static final cn1.g W(TypedArray typedArray) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        String string = typedArray.getString(cn1.j0.GestaltSearchField_gestalt_searchfieldTrailingActionText);
        if (string == null) {
            return null;
        }
        String string2 = typedArray.getString(cn1.j0.GestaltSearchField_gestalt_searchfieldTrailingActionContentDesc);
        if (string2 == null) {
            string2 = string;
        }
        boolean z13 = typedArray.getBoolean(cn1.j0.GestaltSearchField_gestalt_searchfieldTrailingActionEnabled, true);
        int i13 = cn1.j0.GestaltSearchField_gestalt_searchfieldTrailingActionColorPalette;
        rm1.i iVar = GestaltSearchField.f49499t;
        yl1.d dVar = GestaltSearchField.A;
        int i14 = typedArray.getInt(i13, -1);
        if (i14 >= 0) {
            dVar = yl1.d.values()[i14];
        }
        return new cn1.g(bs1.c.h2(string), z13, bs1.c.h2(string2), dVar.getColorPalette(), cn1.f0.gestalt_trailing_button);
    }

    public static void W0(sw0.j0 j0Var, lh0.e2 e2Var) {
        j0Var.E0 = e2Var;
    }

    public static void W1(ho0.m mVar) {
        mVar.getClass();
    }

    public static final void X(GestaltStaticSearchBar gestaltStaticSearchBar) {
        Intrinsics.checkNotNullParameter(gestaltStaticSearchBar, "<this>");
        gestaltStaticSearchBar.d0(cn1.a.f28112j);
    }

    public static void X0(yq1.s2 s2Var, lh0.y1 y1Var) {
        s2Var.f139993g0 = y1Var;
    }

    public static void X1(CommentActivity commentActivity, x92.b bVar) {
        commentActivity.f48914e = bVar;
    }

    public static final boolean Y(l62.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (!aVar.f81609a.isEmpty()) {
            List<r72.z1> list = aVar.f81609a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (r72.z1 z1Var : list) {
                    Intrinsics.checkNotNullParameter(z1Var, "<this>");
                    if (!(z1Var instanceof r72.y1) || ((r72.y1) z1Var).f106726f.f106540a.length() > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void Y0(yq1.y1 y1Var, il1.a aVar) {
        y1Var.f140073m0 = aVar;
    }

    public static void Y1(gb1.c cVar, r20.a aVar) {
        cVar.f64685w0 = aVar;
    }

    public static final h32.c1 Z(tp tpVar) {
        Boolean bool = Boolean.TRUE;
        h32.w2 w2Var = new h32.w2(bool, Short.valueOf(tpVar == null ? (short) 0 : (short) 1), null, Short.valueOf((short) c0(tpVar)), Short.valueOf((short) K2(tpVar)), null);
        Boolean bool2 = Boolean.FALSE;
        return new h32.c1(null, bool2, null, bool, bool2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, w2Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static void Z0(ho0.m mVar, il1.a aVar) {
        mVar.H1 = aVar;
    }

    public static void Z1(a41.r rVar, androidx.appcompat.widget.c2 c2Var) {
        rVar.F0 = c2Var;
    }

    public static final void a(u2.q qVar, uc0.p0 p0Var, i2.o oVar, int i13, int i14) {
        u2.q qVar2;
        int i15;
        uc0.p0 p0Var2;
        u2.q qVar3;
        u2.q qVar4;
        uc0.p0 p0Var3;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1218391134);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            qVar2 = qVar;
        } else if ((i13 & 14) == 0) {
            qVar2 = qVar;
            i15 = i13 | (sVar.h(qVar2) ? 4 : 2);
        } else {
            qVar2 = qVar;
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 16;
        }
        if (i17 == 2 && (i15 & 91) == 18 && sVar.z()) {
            sVar.Q();
            p0Var3 = p0Var;
            qVar4 = qVar2;
        } else {
            sVar.S();
            if ((i13 & 1) == 0 || sVar.y()) {
                u2.q qVar5 = i16 != 0 ? u2.n.f120041b : qVar2;
                if (i17 != 0) {
                    sVar.X(1890788296);
                    androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                    if (a13 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    xe2.g V = p2.V(a13, sVar);
                    sVar.X(1729797275);
                    androidx.lifecycle.l1 v03 = c3.v0(uc0.p0.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                    sVar.r(false);
                    sVar.r(false);
                    qVar3 = qVar5;
                    p0Var2 = (uc0.p0) v03;
                } else {
                    p0Var2 = p0Var;
                    qVar3 = qVar5;
                }
            } else {
                sVar.Q();
                p0Var2 = p0Var;
                qVar3 = qVar2;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(p0Var2.f121825e, sVar);
            d(((uc0.l0) z13.getValue()).f121821h, sVar, 8);
            p0Var2.i(new uc0.i(new oc0.a(q2.i.c(110314278, new androidx.compose.foundation.lazy.layout.v(17, z13, p0Var2), sVar))));
            i2.q1 z14 = bs1.c.z(((uc0.l0) z13.getValue()).f121816c.f121801d, sVar);
            i2.q1 z15 = bs1.c.z(((uc0.l0) z13.getValue()).f121817d.f121804c, sVar);
            i2.q1 z16 = bs1.c.z(((uc0.l0) z13.getValue()).f121818e.f121793a.f121804c, sVar);
            i2.q1 z17 = bs1.c.z(((uc0.l0) z13.getValue()).f121818e.f121794b.f121804c, sVar);
            String D0 = a1.D0(((uc0.l0) z13.getValue()).f121819f, sVar);
            u2.q r13 = androidx.compose.foundation.layout.b.r(qVar3, com.bumptech.glide.d.A(oc0.o.padding_page, sVar), 0.0f, com.bumptech.glide.d.A(oc0.o.padding_page, sVar), 0.0f, 10);
            p1.g gVar = p1.l.f98543a;
            rl2.g0.e(r13, null, null, false, p1.l.g(com.bumptech.glide.d.A(oc0.o.padding_page, sVar)), null, null, false, new tc0.u(z13, z14, z15, z16, z17, D0, p0Var2), sVar, 0, RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER);
            qVar4 = qVar3;
            p0Var3 = p0Var2;
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 17, qVar4, p0Var3);
        }
    }

    public static nd2.b a0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new nd2.b(name, kotlin.collections.e0.b("vec4 {{name}}(vec2 uv, in sampler2D orig, in sampler2D src) {\n    vec4 color = texture(orig, uv);\n    return color;\n}"), new pd2.q0());
    }

    public static void a1(g41.c cVar, pb0.d dVar) {
        cVar.C0 = dVar;
    }

    public static void a2(pe1.p pVar) {
        pVar.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(u2.q r35, r1.p0 r36, r1.e r37, p1.x0 r38, boolean r39, boolean r40, m1.c1 r41, boolean r42, p1.j r43, p1.h r44, kotlin.jvm.functions.Function1 r45, i2.o r46, int r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j.b(u2.q, r1.p0, r1.e, p1.x0, boolean, boolean, m1.c1, boolean, p1.j, p1.h, kotlin.jvm.functions.Function1, i2.o, int, int, int):void");
    }

    public static final sr b0(fi0 fi0Var, String str, String str2) {
        Map H = fi0Var.H();
        if (H != null) {
            sr srVar = (sr) H.get(str);
            if (srVar == null) {
                srVar = (sr) H.get(str2);
            }
            if (srVar != null) {
                return srVar;
            }
        }
        Map H2 = fi0Var.H();
        if (H2 == null) {
            return null;
        }
        Iterator it = H2.entrySet().iterator();
        while (it.hasNext()) {
            sr srVar2 = (sr) ((Map.Entry) it.next()).getValue();
            if (srVar2 != null) {
                return srVar2;
            }
        }
        return null;
    }

    public static void b1(a41.r rVar, zp.j jVar) {
        rVar.C0 = jVar;
    }

    public static void b2(sw0.j0 j0Var, dl1.t tVar) {
        j0Var.C0 = tVar;
    }

    public static final void c(rm0.d state, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(354157037);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        u2.q b13 = androidx.compose.foundation.layout.e.b(qVar2, 1.0f);
        p1.e1 a13 = p1.c1.a(p1.l.f98543a, u2.b.f120023k, sVar, 48);
        int i15 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, b13);
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
        rn1.a aVar = new rn1.a(state.f108686a, null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097134);
        if (1.0f <= 0.0d) {
            throw new IllegalArgumentException(cb.h("invalid weight ", 1.0f, "; must be greater than zero").toString());
        }
        dl2.b.c(aVar, new LayoutWeightElement(ql2.s.c(1.0f, Float.MAX_VALUE), true), null, null, sVar, 8, 12);
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 26, state, qVar2);
        }
    }

    public static final int c0(tp tpVar) {
        return (tpVar == null || !tpVar.R()) ? 0 : 1;
    }

    public static void c1(yq1.s2 s2Var, gz1.b bVar) {
        s2Var.f139995i0 = bVar;
    }

    public static void c2(pe1.p pVar, f4 f4Var) {
        pVar.f99975m1 = f4Var;
    }

    public static final void d(do2.r2 r2Var, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1616122928);
        i2.q1 z13 = bs1.c.z(r2Var, sVar);
        Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
        if (((CharSequence) z13.getValue()).length() > 0) {
            CharSequence text = (CharSequence) z13.getValue();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(text, "text");
            Toast.makeText(context, text, 0).show();
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.i(r2Var, i13, 1);
        }
    }

    public static void d0(long[] jArr, long[] jArr2) {
        long j13 = jArr[0];
        long j14 = jArr[1];
        long j15 = jArr[2];
        long j16 = jArr[3];
        jArr2[0] = j13 & 1152921504606846975L;
        jArr2[1] = ((j13 >>> 60) ^ (j14 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j14 >>> 56) ^ (j15 << 8)) & 1152921504606846975L;
        jArr2[3] = (j15 >>> 52) ^ (j16 << 12);
    }

    public static void d1(g41.c cVar, m60.d0 d0Var) {
        cVar.B0 = d0Var;
    }

    public static void d2(NUXActivity nUXActivity, hq.f fVar) {
        nUXActivity.themeProvider = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(java.lang.String r31, kotlin.jvm.functions.Function1 r32, u2.q r33, boolean r34, kotlin.jvm.functions.Function2 r35, i2.o r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j.e(java.lang.String, kotlin.jvm.functions.Function1, u2.q, boolean, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    public static void e0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        d0(jArr, jArr4);
        d0(jArr2, jArr5);
        f0(jArr4[0], jArr5[0], jArr3, 0);
        f0(jArr4[1], jArr5[1], jArr3, 1);
        f0(jArr4[2], jArr5[2], jArr3, 2);
        f0(jArr4[3], jArr5[3], jArr3, 3);
        for (int i13 = 5; i13 > 0; i13--) {
            jArr3[i13] = jArr3[i13] ^ jArr3[i13 - 1];
        }
        f0(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        f0(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i14 = 7; i14 > 1; i14--) {
            jArr3[i14] = jArr3[i14] ^ jArr3[i14 - 2];
        }
        long j13 = jArr4[0] ^ jArr4[2];
        long j14 = jArr4[1] ^ jArr4[3];
        long j15 = jArr5[0] ^ jArr5[2];
        long j16 = jArr5[1] ^ jArr5[3];
        f0(j13 ^ j14, j15 ^ j16, jArr3, 3);
        long[] jArr6 = new long[3];
        f0(j13, j15, jArr6, 0);
        f0(j14, j16, jArr6, 1);
        long j17 = jArr6[0];
        long j18 = jArr6[1];
        long j19 = jArr6[2];
        long j23 = jArr3[2] ^ j17;
        jArr3[2] = j23;
        long j24 = jArr3[3] ^ (j17 ^ j18);
        jArr3[3] = j24;
        long j25 = jArr3[4] ^ (j19 ^ j18);
        jArr3[4] = j25;
        long j26 = jArr3[5] ^ j19;
        jArr3[5] = j26;
        long j27 = jArr3[0];
        long j28 = jArr3[1];
        long j29 = jArr3[6];
        long j33 = jArr3[7];
        jArr3[0] = j27 ^ (j28 << 60);
        jArr3[1] = (j28 >>> 4) ^ (j23 << 56);
        jArr3[2] = (j23 >>> 8) ^ (j24 << 52);
        jArr3[3] = (j24 >>> 12) ^ (j25 << 48);
        jArr3[4] = (j25 >>> 16) ^ (j26 << 44);
        jArr3[5] = (j26 >>> 20) ^ (j29 << 40);
        jArr3[6] = (j29 >>> 24) ^ (j33 << 36);
        jArr3[7] = j33 >>> 28;
    }

    public static void e1(sw0.j0 j0Var, bf2.d dVar) {
        j0Var.B0 = dVar;
    }

    public static void e2(CommentActivity commentActivity, rh1.n nVar) {
        commentActivity.f48913d = nVar;
    }

    public static ads_mobile_sdk.x0 f(nm.u json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("width", "key");
            int e13 = json.v("width").e();
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("height", "key");
            int e14 = json.v("height").e();
            nm.s v13 = json.v("is_fluid_height");
            return new ads_mobile_sdk.x0(e13, e14, v13 != null ? v13.b() : false);
        } catch (Exception e15) {
            List list = c0.d.f(e15, e15).f6994p;
            String message = e15.getMessage();
            if (message == null) {
                message = e15.getClass().getName();
            }
            list.add(message);
            return null;
        }
    }

    public static void f0(long j13, long j14, long[] jArr, int i13) {
        long j15 = j14 << 1;
        long j16 = j15 ^ j14;
        long j17 = j14 << 2;
        long j18 = j16 << 1;
        long[] jArr2 = {0, j14, j15, j16, j17, j17 ^ j14, j18, j18 ^ j14};
        int i14 = (int) j13;
        long j19 = (jArr2[(i14 >>> 3) & 7] << 3) ^ jArr2[i14 & 7];
        long j23 = 0;
        int i15 = 54;
        do {
            int i16 = (int) (j13 >>> i15);
            long j24 = jArr2[i16 & 7] ^ (jArr2[(i16 >>> 3) & 7] << 3);
            j19 ^= j24 << i15;
            j23 ^= j24 >>> (-i15);
            i15 -= 6;
        } while (i15 > 0);
        jArr[i13] = jArr[i13] ^ (1152921504606846975L & j19);
        int i17 = i13 + 1;
        jArr[i17] = ((((((j13 & 585610922974906400L) & ((j14 << 4) >> 63)) >>> 5) ^ j23) << 4) ^ (j19 >>> 60)) ^ jArr[i17];
    }

    public static void f1(sw0.j0 j0Var, ag1.h hVar) {
        j0Var.M0 = hVar;
    }

    public static void f2(a41.r rVar, i92.k kVar) {
        rVar.f667t0 = kVar;
    }

    public static final long g(float f13, boolean z13) {
        return ((z13 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f13) << 32);
    }

    public static void g0(long[] jArr, long[] jArr2) {
        p2.e0(0, jArr[0], jArr2);
        p2.e0(2, jArr[1], jArr2);
        p2.e0(4, jArr[2], jArr2);
        jArr2[6] = p2.d0((int) jArr[3]);
        jArr2[7] = p2.c0((int) (r0 >>> 32)) & 4294967295L;
    }

    public static void g1(sw0.j0 j0Var, nu1.a aVar) {
        j0Var.K0 = aVar;
    }

    public static void g2(ez1.d dVar, i92.k kVar) {
        dVar.f60712j0 = kVar;
    }

    public static final void h(int i13, List list, String str, u2.q qVar, Function1 function1, i2.o oVar, int i14, int i15) {
        boolean z13;
        Object obj;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1325645818);
        int i16 = i15 & 8;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i16 != 0 ? nVar : qVar;
        p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar, 0);
        int i17 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, qVar2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z14 = sVar.f71265a instanceof i2.f;
        if (!z14) {
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
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        d6.b(a1.D0(i13, sVar), null, 0L, 0L, null, g4.l.f63472g, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, 196608, 0, 131038);
        Iterator it = list.iterator();
        while (true) {
            int i18 = 1;
            if (!it.hasNext()) {
                sVar.r(true);
                i2.f2 t13 = sVar.t();
                if (t13 != null) {
                    t13.f71113d = new tc0.w(i13, list, str, qVar2, function1, i14, i15);
                    return;
                }
                return;
            }
            String str2 = (String) it.next();
            u2.h hVar2 = u2.b.f120023k;
            boolean d2 = Intrinsics.d(str2, str);
            sVar.W(1530890700);
            int i19 = (57344 & i14) ^ 24576;
            boolean h10 = ((i19 > 16384 && sVar.h(function1)) || (i14 & 24576) == 16384) | sVar.h(str2);
            Object J2 = sVar.J();
            am.d dVar = i2.n.f71185a;
            if (h10 || J2 == dVar) {
                z13 = false;
                tc0.v vVar = new tc0.v(false ? 1 : 0, str2, function1);
                sVar.g0(vVar);
                obj = vVar;
            } else {
                z13 = false;
                obj = J2;
            }
            sVar.r(z13);
            u2.q p13 = ao2.m0.p(nVar, t3.p.f116119m, new u1.b(d2, true, null, (Function0) obj));
            p1.e1 a14 = p1.c1.a(p1.l.f98543a, hVar2, sVar, 48);
            int i23 = sVar.P;
            i2.z1 o14 = sVar.o();
            u2.q X2 = ao2.m0.X(sVar, p13);
            s3.k.Qo.getClass();
            s3.i iVar2 = s3.j.f110798b;
            if (!z14) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar.a0();
            if (sVar.O) {
                sVar.n(iVar2);
            } else {
                sVar.j0();
            }
            tb.f.f0(sVar, a14, s3.j.f110801e);
            tb.f.f0(sVar, o14, s3.j.f110800d);
            s3.h hVar3 = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i23))) {
                ep.b.y(i23, sVar, i23, hVar3);
            }
            tb.f.f0(sVar, X2, s3.j.f110799c);
            boolean d13 = Intrinsics.d(str2, str);
            sVar.W(-1221750293);
            boolean h13 = ((i19 > 16384 && sVar.h(function1)) || (i14 & 24576) == 16384) | sVar.h(str2);
            Object J3 = sVar.J();
            if (h13 || J3 == dVar) {
                J3 = new tc0.v(i18, str2, function1);
                sVar.g0(J3);
            }
            sVar.r(false);
            c2.n3.a(d13, (Function0) J3, null, false, null, c2.j1.p(b3.w.f21379c, sVar, 6, 6), sVar, 0, 28);
            d6.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, 0, 0, 131070);
            sVar.r(true);
        }
    }

    public static void h0(yq1.s2 s2Var, lb2.d dVar) {
        s2Var.f139994h0 = dVar;
    }

    public static void h1(NUXActivity nUXActivity, mo1.d dVar) {
        nUXActivity.intentHelper = dVar;
    }

    public static void h2(ho0.m mVar, i92.k kVar) {
        mVar.K1 = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(int r23, java.lang.String r24, kotlin.jvm.functions.Function1 r25, int r26, java.lang.String r27, u2.q r28, kotlin.jvm.functions.Function1 r29, i2.o r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j.i(int, java.lang.String, kotlin.jvm.functions.Function1, int, java.lang.String, u2.q, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static void i0(q91.g1 g1Var, cr1.a aVar) {
        g1Var.f103109k0 = aVar;
    }

    public static void i1(ki0.c cVar, mo1.d dVar) {
        cVar.f79784j0 = dVar;
    }

    public static void i2(ki0.c cVar, i92.k kVar) {
        cVar.f79785k0 = kVar;
    }

    public static final ArrayList j(List list) {
        bc0.a aVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof wy0) {
                aVar = G((wy0) obj);
            } else if (obj instanceof z40.d0) {
                z40.d0 d0Var = (z40.d0) obj;
                Intrinsics.checkNotNullParameter(d0Var, "<this>");
                aVar = new bc0.a(dl2.b.h1(d0Var.b(), d0Var.e(), d0Var.m(), d0Var.k()), f0.h.H(d0Var), 60);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static void j0(ki0.c cVar, mr1.a aVar) {
        cVar.f79788n0 = aVar;
    }

    public static void j1(a41.r rVar, so.v vVar) {
        rVar.A0 = vVar;
    }

    public static void j2(q91.g1 g1Var, i92.k kVar) {
        g1Var.f103110l0 = kVar;
    }

    public static void k(x92.b bVar) {
        n60.o.w(bVar, "conversation.id", "conversation.users()", "conversation.emails", "conversation.last_message()");
        n60.o.w(bVar, "conversation.unread", "conversation.board", "pin.story_pin_data()", "storypindata.page_count");
        bVar.e("storypindata.metadata()");
        bVar.e("conversation.is_eligible_for_threads");
    }

    public static void k0(yq1.s2 s2Var, mr1.a aVar) {
        s2Var.f139991e0 = aVar;
    }

    public static void k1(sw0.j0 j0Var, r8 r8Var) {
        j0Var.f115495z0 = r8Var;
    }

    public static void k2(z91.m mVar, i92.k kVar) {
        mVar.f141390i0 = kVar;
    }

    public static void l(x92.b bVar) {
        lh0.g2 d2 = lh0.g2.f83370b.d();
        df.j1.g(bVar);
        n00.i0.a(bVar);
        bVar.e("aggregatedpindata.did_it_data");
        bVar.e("diditdata.recommend_scores");
        n60.o.w(bVar, "pin.done_by_me", "interest.id", "interest.type", "interest.name");
        j1.G(bVar);
        bVar.e("pin.id");
        bVar.e("pin.type");
        bVar.e("pin.cacheable_id");
        bVar.e("pin.image_signature");
        bVar.h("pin.images", "236x");
        n60.o.A(bVar, "pin.images", "136x136", "board.id", "board.type");
        bVar.e("board.name");
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) d2.f83373a;
        if (g1Var.o("android_news_hub_board_has_custom_cover_field_pwt", "enabled", z3Var) || g1Var.l("android_news_hub_board_has_custom_cover_field_pwt")) {
            bVar.e("board.has_custom_cover");
        }
        n60.o.w(bVar, "board.owner()", "board.followed_by_me", "board.pin_thumbnail_urls", "board.image_cover_url");
        bVar.e("board.image_cover_hd_url");
        bVar.h("board.images", "90x90");
        bVar.h("board.images", "236x");
        n60.o.A(bVar, "board.image_thumbnail_urls", "100x", "user.id", "user.type");
        bVar.e("user.full_name");
        bVar.h("user.recent_pin_images", "200x");
        bVar.e("user.is_default_image");
        n60.o.w(bVar, "user.image_medium_url", "pin.subscribed_to_notifications", "board.subscribed_to_notifications", "user.subscribed_to_notifications");
    }

    public static void l0(vu.i iVar, es.a aVar) {
        iVar.U0 = aVar;
    }

    public static void l1(a41.r rVar, yk1.j jVar) {
        rVar.f665s0 = jVar;
    }

    public static void l2(ki0.c cVar, UserDeserializer userDeserializer) {
        cVar.f79787m0 = userDeserializer;
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void m0(pa0.c cVar, r8 r8Var) {
        cVar.f99377s0 = r8Var;
    }

    public static void m1(NUXActivity nUXActivity, kv1.a aVar) {
        nUXActivity.nuxService = aVar;
    }

    public static void m2(sw0.j0 j0Var, k22.m mVar) {
        j0Var.D0 = mVar;
    }

    public static final void n(HashMap auxData, i91.c0 shareConfig) {
        Intrinsics.checkNotNullParameter(auxData, "<this>");
        Intrinsics.checkNotNullParameter(shareConfig, "shareConfig");
        shareConfig.getClass();
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        auxData.putAll(kotlin.collections.z0.g(new Pair("sharing_media_type", shareConfig.b().toString()), new Pair("sharing_carousel_index", String.valueOf(shareConfig.c()))));
    }

    public static void n0(vu.i iVar, es.h hVar) {
        iVar.T0 = hVar;
    }

    public static void n1(NUXActivity nUXActivity, qy0.b bVar) {
        nUXActivity.nuxSharedStateRepository = bVar;
    }

    public static void n2(a41.r rVar, yk1.v vVar) {
        rVar.f663r0 = vVar;
    }

    public static final Object o(uj2.f fVar, bl2.c frame) {
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        ((uj2.b) fVar).j(new ll0.d(oVar, 2));
        Object u13 = oVar.u();
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (u13 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13 == aVar ? u13 : Unit.f80348a;
    }

    public static void o0(vu.i iVar, so.w wVar) {
        iVar.R0 = wVar;
    }

    public static void o1(vu.i iVar, c91.e eVar) {
        iVar.S0 = eVar;
    }

    public static void o2(pe1.p pVar, yk1.v vVar) {
        pVar.f99979q1 = vVar;
    }

    public static final Object p(uj2.b0 b0Var, bl2.c frame) {
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        b0Var.p(new co0.c(oVar, 3));
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    public static void p0(pe1.p pVar, vy.m mVar) {
        pVar.f99977o1 = mVar;
    }

    public static void p1(pe1.p pVar, lh0.k2 k2Var) {
        pVar.f99976n1 = k2Var;
    }

    public static void p2(zc2.p pVar) {
        pVar.getClass();
    }

    public static final Object q(uj2.q qVar, bl2.c frame) {
        jo2.a aVar = jo2.a.FIRST_OR_DEFAULT;
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        qVar.d(new jo2.c(oVar, aVar, null));
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    public static void q0(q91.g1 g1Var, ox.b bVar) {
        g1Var.f103114p0 = bVar;
    }

    public static void q1(pe1.p pVar, tj0.b0 b0Var) {
        pVar.f99970h1 = b0Var;
    }

    public static final boolean q2(h61.h searchType) {
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        return c71.o.f26814b[searchType.ordinal()] == 4;
    }

    public static final void r(GestaltButtonToggle gestaltButtonToggle, Function1 invokeAfterStateMutation) {
        Intrinsics.checkNotNullParameter(gestaltButtonToggle, "<this>");
        Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "invokeAfterStateMutation");
        gestaltButtonToggle.t(new la1.k(14, gestaltButtonToggle, invokeAfterStateMutation));
    }

    public static void r0(yq1.y1 y1Var, vy.m mVar) {
        y1Var.f140070j0 = mVar;
    }

    public static void r1(g41.c cVar, m60.g0 g0Var) {
        cVar.f63504z0 = g0Var;
    }

    public static final ke2.d r2(x72.j jVar, Point position, int i13) {
        Object m13;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(position, "position");
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = (ke2.d) jVar.c(position, i13).get(200L, TimeUnit.MILLISECONDS);
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (m13 instanceof xk2.r) {
            m13 = null;
        }
        return (ke2.d) m13;
    }

    public static final void s(va2.a aVar, lj1.b displayState) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        aVar.f128846i = !displayState.f83617b;
        u50.i0 i0Var = displayState.f83616a;
        Context context = aVar.f125296l;
        String obj = i0Var.a(context).toString();
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        aVar.f125297m = obj;
        vn1.c value = displayState.f83621f;
        Intrinsics.checkNotNullParameter(value, "value");
        aVar.f125303s = value;
        aVar.f125309y.b(value);
        int intValue = ((Number) displayState.f83622g.a(context)).intValue();
        aVar.f125304t = intValue;
        aVar.f125310z.setColor(intValue);
        aVar.f125298n = displayState.f83623h.a(context).intValue();
        aVar.f125299o = displayState.f83624i.a(context).intValue();
        aVar.f125300p = displayState.f83625j.a(context).intValue();
        aVar.f125301q = displayState.f83626k.a(context).intValue();
        if (displayState.f83618c != null) {
            aVar.f125305u = r0.a(context).intValue();
        }
        if (displayState.f83619d != null) {
            aVar.f125306v = r4.a(context).intValue();
        }
    }

    public static void s0(yq1.s2 s2Var, vy.m mVar) {
        s2Var.f139989c0 = mVar;
    }

    public static void s1(q91.g1 g1Var, rr1.g gVar) {
        g1Var.f103115q0 = gVar;
    }

    public static final r2.s s2(Function2 function2, Function1 function1) {
        r2.a aVar = new r2.a(function2);
        dl2.b.y(1, function1);
        r2.s sVar = r2.t.f106065a;
        return new r2.s(aVar, function1);
    }

    public static nd2.b t() {
        kd2.i iVar = kd2.i.f79272h;
        if (iVar == null) {
            throw new IllegalStateException("XRendererApp must be initialized first.".toString());
        }
        String str = "border";
        if (iVar.f79279g) {
            return a0("border");
        }
        id2.c.Companion.getClass();
        Pair pair = new Pair("color", new pd2.f(id2.b.a(-65536)));
        Pair pair2 = new Pair("radius", jq.b.n(0.1f, null, 0.01f, 0.3f));
        new pd2.n(2, null);
        return new nd2.b(str, kotlin.collections.f0.j("// we want the border (which is outside of the opaque object) to fit fully inside the original image\n// so we lookup the texture in a scaled coordinate system\nfloat scale_{{name}}(vec2 imageSize, float radius) {\n    float xScale = (imageSize.x + 2.0 * radius) / imageSize.x;\n    float yScale = (imageSize.y + 2.0 * radius) / imageSize.y;\n    return max(xScale, yScale);\n}\n\nvec4 encodeDistance_{{name}}(float distance, bool found) {\n    // convert float [0, 1] to int [0, 255*255]\n    int minDistanceInt = int(round(distance * 255.0 * 255.0));\n\n    // split to two bytes\n    int major = minDistanceInt / 256;\n    int minor = minDistanceInt % 256;\n    return vec4(float(major) / 255.0, float(minor) / 255.0, float(found ? 1 : 0), 1);\n}\n\n// horizontal distance from the current pixel to the nearest opaque pixel\nvec4 distanceToObject_{{name}}(vec2 absPosition, float absRadius, in sampler2D image) {\n    vec2 imageSize = vec2(textureSize(image, 0));\n\n    int steps = int(2.0 * absRadius + 1.0) / {{settings.step}};\n\n    float minDistance = 1.0;\n    bool found = false;\n    for (int i = 0; i < steps; ++i) {\n        float dxRelative = (2.0 * float(i) / float(steps - 1) - 1.0);\n        float dx = absRadius * dxRelative;\n        float x = absPosition.x + dx;\n\n        float alpha = sampleWithConstantWrap(image, vec2(x, absPosition.y) / imageSize, vec4(0.0)).a;\n\n        if (alpha > 0.5) {\n            minDistance = min(minDistance, abs(dxRelative));\n            found = true;\n        }\n    }\n\n    return encodeDistance_{{name}}(minDistance, found);\n}\n\nvec4 {{name}}(vec2 uv, in sampler2D orig, in sampler2D src) {\n    vec2 imageSize = vec2(textureSize(src, 0));\n    float absRadius = {{settings.radius}} * imageSize.x;\n\n    float globalScale = scale_{{name}}(imageSize, absRadius);\n    vec2 position = scaleUV(uv, globalScale);\n\n    vec4 distanceEncoded = distanceToObject_{{name}}(position * imageSize, absRadius, src);\n\n    return distanceEncoded;\n}", "// we want the border (which is outside of the opaque object) to fit fully inside the original image\n// so we lookup the texture in a scaled coordinate system\nfloat scale_{{name}}(vec2 imageSize, float radius) {\n    float xScale = (imageSize.x + 2.0 * radius) / imageSize.x;\n    float yScale = (imageSize.y + 2.0 * radius) / imageSize.y;\n    return max(xScale, yScale);\n}\n\nfloat decodeDistance_{{name}}(vec4 encoded) {\n    bool found = encoded.b > 0.5;\n    if (!found) {\n        return 1e6;\n    }\n\n    int major = int(round(encoded.r * 255.0));\n    int minor = int(round(encoded.g * 255.0));\n    int distance = major * 256 + minor;\n\n    // convert int [0, 255 * 255] to float [0, 1]\n    float distanceFloat = float(distance) / 255.0 / 255.0;\n\n    return distanceFloat;\n}\n\n// check if a given position is inside the object border from the previous pass (vertically)\nbool borderAt_{{name}}(vec2 absPosition, float absRadius, in sampler2D image) {\n    vec2 imageSize = vec2(textureSize(image, 0));\n\n    int steps = int(2.0 * absRadius + 1.0) / {{settings.step}};\n\n    for (int j = 0; j < steps; ++j) {\n        float dyRelative = (2.0 * float(j) / float(steps - 1) - 1.0);\n        float dy = absRadius * dyRelative;\n        float y = absPosition.y + dy;\n\n        vec4 horizontalDistanceEncoded = sampleWithConstantWrap(image, vec2(absPosition.x, y) / imageSize, vec4(0.0));\n        float horizontalDistance = decodeDistance_{{name}}(horizontalDistanceEncoded);\n        if (horizontalDistance > 1.0) {\n            continue;\n        }\n\n        float distanceSquared = horizontalDistance * horizontalDistance + dyRelative * dyRelative;\n\n        if (distanceSquared <= 1.0) {\n            return true;\n        }\n    }\n\n    return false;\n}\n\nvec4 {{name}}(vec2 uv, in sampler2D orig, in sampler2D src) {\n    vec2 imageSize = vec2(textureSize(orig, 0));\n    float absRadius = {{settings.radius}} * imageSize.x;\n\n    float globalScale = scale_{{name}}(imageSize, absRadius);\n    vec2 position = scaleUV(uv, globalScale);\n    vec4 pivotColor = sampleWithConstantWrap(orig, position, vec4(0.0));\n\n    if (pivotColor.a > 0.9) {\n        return pivotColor;\n    }\n\n    vec2 borderSize = vec2(textureSize(src, 0));\n    float borderRadius = {{settings.radius}} * borderSize.x / globalScale;\n\n    bool isBorder = borderAt_{{name}}(uv * borderSize, borderRadius, src);\n\n    if (isBorder) {\n        return {{settings.color}};\n    }\n\n    return pivotColor;\n}"), new pd2.q0(kotlin.collections.z0.g(pair, pair2, new Pair("step", new pd2.n(2, new qd2.o(1, 5))))));
    }

    public static void t0(q91.g1 g1Var, or1.i iVar) {
        g1Var.f103113o0 = iVar;
    }

    public static void t1(NUXActivity nUXActivity) {
        nUXActivity.perfLogUtils = ey.j3.f60510a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01cc, code lost:
    
        if (r8.equals("video") == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d6, code lost:
    
        r13 = zx.j.ORGANIC_VIDEO.getRequestParamName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d3, code lost:
    
        if (r8.equals("story") == false) goto L259;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final zx.n t2(zx.l r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j.t2(zx.l, boolean):zx.n");
    }

    public static void u(float f13, float[] fArr) {
        if (f13 <= 0.5f) {
            fArr[0] = 1.0f - (f13 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f13 * 2.0f) - 1.0f;
        }
    }

    public static void u0(yq1.s2 s2Var, lb2.q qVar) {
        s2Var.f139990d0 = qVar;
    }

    public static void u1(sw0.j0 j0Var, ny1.w wVar) {
        j0Var.I0 = wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if ((r5 - 1) > 0) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void u2(c71.z r4, int r5, h61.h r6, boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "searchType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int[] r0 = c71.o.f26814b
            int r6 = r6.ordinal()
            r6 = r0[r6]
            r0 = 1
            if (r6 == r0) goto L37
            r1 = 2
            if (r6 == r1) goto L37
            r1 = 3
            if (r6 == r1) goto L37
            r1 = 4
            if (r6 == r1) goto L37
            r1 = 5
            r2 = 0
            if (r6 == r1) goto L24
        L22:
            r0 = r2
            goto L37
        L24:
            zd1.e0 r6 = r4.f26842d
            if (r6 == 0) goto L31
            boolean r6 = r6.f()
            if (r6 != r0) goto L31
            int r5 = r5 + 1
            goto L33
        L31:
            int r5 = r5 + (-1)
        L33:
            int r6 = r5 + (-1)
            if (r6 <= 0) goto L22
        L37:
            lh0.g3 r6 = r4.f26874t
            if (r5 <= 0) goto L64
            boolean r1 = r4.F3()
            if (r1 == 0) goto L64
            r6.getClass()
            lh0.z3 r1 = lh0.a4.f83298b
            lh0.z0 r6 = r6.f83374a
            lh0.g1 r6 = (lh0.g1) r6
            java.lang.String r2 = "enabled"
            java.lang.String r3 = "android_search_onebar_filter_count"
            boolean r1 = r6.o(r3, r2, r1)
            if (r1 != 0) goto L5a
            boolean r6 = r6.l(r3)
            if (r6 == 0) goto L64
        L5a:
            de1.f r4 = r4.j0()
            if (r4 == 0) goto L6d
            r4.f4(r5, r7)
            goto L6d
        L64:
            de1.f r4 = r4.j0()
            if (r4 == 0) goto L6d
            r4.r3(r0)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.j.u2(c71.z, int, h61.h, boolean):void");
    }

    public static ObjectAnimator v(View view, ua.y0 y0Var, int i13, int i14, float f13, float f14, float f15, float f16, BaseInterpolator baseInterpolator, Transition transition) {
        float f17;
        float f18;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) y0Var.f121378b.getTag(ua.e0.transition_position)) != null) {
            f17 = (r7[0] - i13) + translationX;
            f18 = (r7[1] - i14) + translationY;
        } else {
            f17 = f13;
            f18 = f14;
        }
        view.setTranslationX(f17);
        view.setTranslationY(f18);
        if (f17 == f15 && f18 == f16) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f17, f15), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f18, f16));
        ua.z0 z0Var = new ua.z0(view, y0Var.f121378b, translationX, translationY);
        transition.a(z0Var);
        ofPropertyValuesHolder.addListener(z0Var);
        ofPropertyValuesHolder.setInterpolator(baseInterpolator);
        return ofPropertyValuesHolder;
    }

    public static void v0(yq1.s2 s2Var, com.pinterest.identity.authentication.a aVar) {
        s2Var.f139992f0 = aVar;
    }

    public static void v1(pe1.p pVar, com.pinterest.feature.pin.j jVar) {
        pVar.f99973k1 = jVar;
    }

    public static void v2(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        e0(jArr, jArr2, jArr4);
        A2(jArr4, jArr3);
    }

    public static final GestaltIconButton w(cn1.f fVar, Context context, int i13) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltIconButton gestaltIconButton = new GestaltIconButton(6, context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        pp2.a.P0(layoutParams, 0, 0, dl2.b.G0(gestaltIconButton, eo1.a.comp_searchfield_trailing_icon_end_padding), 0);
        layoutParams.gravity = 16;
        gestaltIconButton.setLayoutParams(layoutParams);
        g3.y(gestaltIconButton, new rq.a0(i13, fVar, context, 23));
        return gestaltIconButton;
    }

    public static void w0(NUXActivity nUXActivity, lu1.b bVar) {
        nUXActivity.baseActivityHelper = bVar;
    }

    public static void w1(ho0.m mVar, x02.i2 i2Var) {
        mVar.E1 = i2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w2(h61.k kVar, c71.b0 newSearchParameters, int i13) {
        Intrinsics.checkNotNullParameter(newSearchParameters, "newSearchParameters");
        if (kVar != 0) {
            ((nl1.d) kVar).M1(newSearchParameters.b(q2(newSearchParameters.f26728a), Integer.valueOf(i13)));
        }
    }

    public static n x() {
        return hf0.b.q() ? hf0.b.o() ? w41.f.f128001b : w41.d.f127991b : w41.b.f127980b;
    }

    public static void x0(ho0.m mVar, lu1.b bVar) {
        mVar.I1 = bVar;
    }

    public static void x1(sw0.j0 j0Var, nx.f0 f0Var) {
        j0Var.G0 = f0Var;
    }

    public static final void x2(l82.i iVar, u50.s event) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(event, "event");
        iVar.c().a(event);
    }

    public static final th2.b y(th2.b bVar) {
        th2.d dVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        th2.d dVar2 = bVar.f117652e;
        if (dVar2 != null) {
            ArrayList samples = CollectionsKt.H0(dVar2.f117658a);
            Intrinsics.checkNotNullParameter(samples, "samples");
            dVar = new th2.d(samples);
        } else {
            dVar = null;
        }
        th2.d dVar3 = dVar;
        return new th2.b(bVar.f117648a, bVar.f117649b, bVar.f117650c, bVar.f117651d, dVar3, bVar.f117653f);
    }

    public static void y0(a41.r rVar, g70.h hVar) {
        rVar.H0 = hVar;
    }

    public static void y1(g41.c cVar, nx.o0 o0Var) {
        cVar.E0 = o0Var;
    }

    public static final void y2(String pinId, yk1.v resources, int i13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Context context = kb0.a.f79058b;
        so1.b bVar = (so1.b) ep.b.g(so1.b.class);
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        if (f13 == null) {
            return;
        }
        int intValue = f13.t2().intValue();
        Integer p43 = f13.p4();
        Intrinsics.checkNotNullExpressionValue(p43, "getSecretBoardCount(...)");
        new kk2.k(new uj0.a(bVar, f13, p43.intValue() + intValue > i13, pinId, 0), 1).r(tk2.e.f118017c).o(new pj0.f(9, uj0.b.f122324j), new pj0.f(10, uj0.b.f122325k));
    }

    public static final oo1.l z(mv mvVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(mvVar, "<this>");
        Iterator<E> it = oo1.l.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((oo1.l) obj).getCode() == mvVar.F().intValue()) {
                break;
            }
        }
        oo1.l lVar = (oo1.l) obj;
        return lVar == null ? oo1.l.NONE : lVar;
    }

    public static void z0(g41.c cVar, g70.h hVar) {
        cVar.F0 = hVar;
    }

    public static void z1(q91.g1 g1Var, tb.l lVar) {
        g1Var.f103112n0 = lVar;
    }

    public static final String z2(Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter out = new StringWriter();
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            out.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter = out.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter, "toString(...)");
        return stringWriter;
    }
}
