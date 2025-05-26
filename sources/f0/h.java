package f0;

import ads_mobile_sdk.ck;
import ads_mobile_sdk.dp1;
import ads_mobile_sdk.ep1;
import ads_mobile_sdk.k41;
import ads_mobile_sdk.vo;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.icu.number.FormattedNumber;
import android.icu.number.LocalizedNumberFormatter;
import android.icu.number.NumberFormatter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.util.Pair;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.lifecycle.l1;
import androidx.lifecycle.u1;
import ao2.m0;
import com.pinterest.api.model.vh;
import com.pinterest.design.brio.widget.text.URLSpanNoUnderline;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import dm2.u0;
import h32.c1;
import h32.f1;
import h32.i0;
import h32.v2;
import i2.f2;
import i2.o;
import i2.q1;
import i2.z1;
import java.io.ByteArrayInputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kh2.c3;
import kh2.d1;
import kh2.p2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.text.StringsKt;
import kotlin.text.y;
import lh0.r1;
import n3.g0;
import nm.t;
import nm.u;
import p1.e1;
import p1.x;
import pk.a0;
import pm.m;
import pn2.t1;
import pn2.w1;
import qo2.v0;
import ra0.b0;
import ra0.e0;
import ra0.w;
import ra0.z;
import rq.o3;
import s3.k;
import so.s0;
import t3.s1;
import tb0.p;
import tm2.y0;
import u2.n;
import ul2.c2;
import ul2.k0;
import x02.x0;
import xk2.q;
import xk2.s;
import xl2.v;
import xs0.l;
import z40.c0;
import z40.d0;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a */
    public static volatile g f60737a;

    public static final String A(float f13) {
        float f14 = 60;
        return s1.d(new Object[]{Integer.valueOf((int) (f13 / f14)), Integer.valueOf((int) (f13 % f14))}, 2, "%d:%02d", "format(format, *args)");
    }

    public static final SpannableStringBuilder B(Context context, String unformattedString, String var, String varValue, int i13, cf0.b bVar) {
        int length;
        int i14;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unformattedString, "unformattedString");
        Intrinsics.checkNotNullParameter(var, "var");
        Intrinsics.checkNotNullParameter(varValue, "varValue");
        boolean z13 = false;
        int L = StringsKt.L(unformattedString, var, 0, false, 6);
        if (L >= 0) {
            i14 = L;
            length = varValue.length() + L;
            z13 = true;
        } else {
            length = unformattedString.length();
            i14 = 0;
        }
        if (z13) {
            unformattedString = j1.Y(unformattedString, new Object[]{varValue}, null, 6);
        }
        SpannableStringBuilder builder = new SpannableStringBuilder(unformattedString);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        p(context, builder, i14, length, i13, bVar, true);
        return builder;
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    public static final SpannableStringBuilder C(Context context, String unformattedString, String[] vars, String[] varValues, cf0.b[] bVarArr, int i13) {
        cf0.b bVar;
        int i14;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(unformattedString, "unformattedString");
        Intrinsics.checkNotNullParameter(vars, "vars");
        Intrinsics.checkNotNullParameter(varValues, "varValues");
        ?? r122 = 0;
        vb0.j.f125466a.S(vars.length == varValues.length, "vars and varValues should be the same size", new Object[0]);
        SpannableStringBuilder builder = new SpannableStringBuilder(unformattedString);
        int min = Math.min(vars.length, varValues.length);
        int length = bVarArr != null ? bVarArr.length : 0;
        int i15 = 0;
        while (i15 < min) {
            String spannableStringBuilder = builder.toString();
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilder, "toString(...)");
            String str = vars[i15];
            String str2 = varValues[i15];
            if (i15 < length) {
                Intrinsics.f(bVarArr);
                bVar = bVarArr[i15];
            } else {
                bVar = null;
            }
            cf0.b bVar2 = bVar;
            if (str.length() <= 0 || str2.length() <= 0 || !StringsKt.E(spannableStringBuilder, str, r122)) {
                i14 = i15;
            } else {
                int L = StringsKt.L(spannableStringBuilder, str, r122, r122, 6);
                int length2 = str.length() + L;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(builder, "builder");
                i14 = i15;
                p(context, builder, L, length2, i13, bVar2, true);
                builder.replace(L, length2, (CharSequence) str2);
            }
            i15 = i14 + 1;
            r122 = 0;
            context2 = context;
        }
        return builder;
    }

    public static final SpannableStringBuilder D(Context context, String unformattedString, String varValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(unformattedString, "unformattedString");
        Intrinsics.checkNotNullParameter("%1$s", "var");
        Intrinsics.checkNotNullParameter(varValue, "varValue");
        return B(context, unformattedString, "%1$s", varValue, -1, null);
    }

    public static final String F(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        return dl2.b.h1(d0Var.m(), d0Var.e(), d0Var.b(), d0Var.k());
    }

    public static final String H(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        String R0 = dl2.b.R0(d0Var.l());
        if (R0 == null && (R0 = dl2.b.R0(d0Var.f())) == null && (R0 = dl2.b.R0(d0Var.g())) == null) {
            R0 = "";
        }
        return dl2.b.R2(R0);
    }

    public static final String I(Resources resources, long j13) {
        LocalizedNumberFormatter withLocale;
        FormattedNumber format;
        String formattedNumber;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Locale locale = resources.getConfiguration().getLocales().isEmpty() ? Locale.getDefault() : resources.getConfiguration().getLocales().get(0);
        if (Build.VERSION.SDK_INT < 30) {
            return String.valueOf(j13);
        }
        withLocale = NumberFormatter.withLocale(locale);
        format = withLocale.format(j13);
        formattedNumber = format.toString();
        Intrinsics.f(formattedNumber);
        return formattedNumber;
    }

    public static final no2.b J(no2.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.a().b() ? bVar : new v0(bVar);
    }

    public static final Typeface K(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        lm1.b FONT_BOLD = te0.i.f117497d;
        Intrinsics.checkNotNullExpressionValue(FONT_BOLD, "FONT_BOLD");
        return te0.g.a(context, FONT_BOLD, null, 12);
    }

    public static final long L(long j13, float f13) {
        long j14 = (long) (f13 * j13);
        float f14 = 1000L;
        Float e13 = y.e(j1.W("%.1f", Float.valueOf(j14 / f14)));
        return e13 == null ? j14 : (long) (e13.floatValue() * f14);
    }

    public static final SpannableString M(Drawable drawable, String textToInsertDrawableInto) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(textToInsertDrawableInto, "textToInsertDrawableInto");
        Intrinsics.checkNotNullParameter("%1$s", "placeholderToReplace");
        SpannableString spannableString = new SpannableString(textToInsertDrawableInto);
        ImageSpan imageSpan = new ImageSpan(drawable, 0);
        int L = StringsKt.L(textToInsertDrawableInto, "%1$s", 0, false, 6);
        if (L >= 0) {
            spannableString.setSpan(imageSpan, L, 4 + L, 17);
        }
        return spannableString;
    }

    public static String N(int i13) {
        switch (i13) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return a.a.d("unknown status code: ", i13);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static final zy.a O(i0 pinalyticsContext, vh dynamicStory, String clientTrackingParams, v2 source, Integer num) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        Intrinsics.checkNotNullParameter(source, "storyImpression");
        Intrinsics.checkNotNullParameter(source, "source");
        Long l13 = source.f67311a;
        Long l14 = dynamicStory.f42843a;
        String uid = dynamicStory.getUid();
        Short valueOf = Short.valueOf((short) dynamicStory.f42865w.size());
        v2 v2Var = new v2(l14, source.f67312b, uid, source.f67314d, num != null ? Short.valueOf((short) num.intValue()) : null, valueOf, source.f67317g, source.f67318h, source.f67319i, clientTrackingParams);
        String uid2 = dynamicStory.getUid();
        f1 f1Var = f1.STORY_IMPRESSION_ONE_PIXEL;
        Boolean bool = Boolean.FALSE;
        return new zy.a(pinalyticsContext, f1Var, uid2, kh2.d.E(dynamicStory), new c1(null, bool, null, Boolean.TRUE, bool, null, v2Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, false, false, RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL);
    }

    public static void P(Context context, String uri, ob0.a crashReporter) {
        Object m13;
        p productFlow = p.EXPERIENCES;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(productFlow, "productFlow");
        try {
            q qVar = s.f135225b;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(uri));
            if (Intrinsics.d(context, context.getApplicationContext())) {
                intent.addFlags(872415232);
            }
            context.startActivity(intent);
            m13 = Unit.f80348a;
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        Throwable a13 = s.a(m13);
        if (a13 != null) {
            ((tb0.h) crashReporter).q(a13, a.a.j("Error creating Intent & starting activity from the URI ", uri), productFlow);
        }
    }

    public static final boolean Q(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        return Intrinsics.d(d0Var.o(), Boolean.TRUE) || StringsKt.E(F(d0Var), "default_", false);
    }

    public static final boolean R(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static void S(av.d dVar, s0 s0Var) {
        dVar.A0 = s0Var;
    }

    public static void T(em0.d dVar, x02.y yVar) {
        dVar.f59588z0 = yVar;
    }

    public static void U(em0.d dVar, g70.h hVar) {
        dVar.D0 = hVar;
    }

    public static void V(em0.d dVar, x0 x0Var) {
        dVar.A0 = x0Var;
    }

    public static void W(ys0.h hVar, r1 r1Var) {
        hVar.F0 = r1Var;
    }

    public static void X(em0.d dVar, uk1.e eVar) {
        dVar.B0 = eVar;
    }

    public static void Y(em0.d dVar, cm0.b bVar) {
        dVar.C0 = bVar;
    }

    public static void Z(ys0.h hVar, l lVar) {
        hVar.G0 = lVar;
    }

    public static final void a(wb0.d viewModel, u2.q qVar, wb0.c cVar, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1693880794);
        if ((i14 & 2) != 0) {
            qVar = n.f120041b;
        }
        if ((i14 & 4) != 0) {
            cVar = wb0.e.f128983a;
        }
        List list = viewModel.f128982a;
        int i15 = cVar.f128979a;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList L0 = CollectionsKt.L0(list, i15, i15, true);
        u2.q o13 = androidx.compose.foundation.layout.e.o(androidx.compose.foundation.layout.e.b(qVar, 1.0f));
        p1.g gVar = p1.l.f98543a;
        p1.y a13 = x.a(p1.l.g(cVar.f128981c), u2.b.f120025m, sVar, 0);
        int i16 = sVar.P;
        z1 o14 = sVar.o();
        u2.q X = m0.X(sVar, o13);
        k.Qo.getClass();
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
        tb.f.f0(sVar, o14, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        Iterator it = L0.iterator();
        while (it.hasNext()) {
            b((List) it.next(), cVar.f128980b, null, sVar, 8, 4);
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 19, viewModel, qVar, cVar);
        }
    }

    public static void a0(av.d dVar, kt.a aVar) {
        dVar.B0 = aVar;
    }

    public static final void b(List buttons, float f13, u2.q qVar, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1554962217);
        if ((i14 & 4) != 0) {
            qVar = n.f120041b;
        }
        u2.q o13 = androidx.compose.foundation.layout.e.o(androidx.compose.foundation.layout.e.b(qVar, 1.0f));
        p1.g gVar = p1.l.f98543a;
        e1 a13 = p1.c1.a(p1.l.h(f13, u2.b.f120026n), u2.b.f120022j, sVar, 0);
        int i15 = sVar.P;
        z1 o14 = sVar.o();
        u2.q X = m0.X(sVar, o13);
        k.Qo.getClass();
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
        tb.f.f0(sVar, o14, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
            ep.b.y(i15, sVar, i15, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        Iterator it = buttons.iterator();
        while (it.hasNext()) {
            wb0.a aVar = (wb0.a) it.next();
            kh2.s0.b(aVar.f128971a, null, aVar.f128972b, sVar, 0, 2);
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new wb0.b(buttons, f13, qVar, i13, i14, 0);
        }
    }

    public static boolean b0() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static final void c(uc0.f1 f1Var, o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1916933855);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(f1Var)) ? 4 : 2) | i13;
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
                l1 v03 = c3.v0(uc0.f1.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                f1Var = (uc0.f1) v03;
            }
            sVar.s();
            q1 z13 = bs1.c.z(f1Var.f121825e, sVar);
            f1Var.i(new uc0.i(new oc0.a(q2.i.c(347506521, new xb0.a(f1Var, 8), sVar))));
            gh0.b.d(((uc0.e1) z13.getValue()).f121775a, null, sVar, 8, 2);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(f1Var, i13, i14, 14);
        }
    }

    public static boolean c0(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static final qo2.i0 d(no2.b keySerializer, no2.b valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new qo2.i0(keySerializer, valueSerializer);
    }

    public static final boolean d0(n3.j jVar) {
        List list = jVar.f89070a;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!g0.a(((n3.q) list.get(i13)).f89115i, 2)) {
                return false;
            }
        }
        return true;
    }

    public static final int e(boolean z13, boolean z14) {
        return (z13 ? 1 : 0) | (z14 ? 2 : 0);
    }

    public static final boolean e0(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        c0 i13 = d0Var.i();
        if (i13 != null) {
            return Intrinsics.d(i13.a(), Boolean.TRUE);
        }
        return false;
    }

    public static ep1 f(u json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            a.e1 e1Var = dp1.f4400a;
            int a13 = k41.a(json, "impression_prerequisite", 0);
            e1Var.getClass();
            dp1 dp1Var = a13 != 0 ? a13 != 1 ? a13 != 2 ? dp1.f4401b : dp1.f4403d : dp1.f4402c : dp1.f4401b;
            int a14 = k41.a(json, "click_prerequisite", 0);
            return new ep1(dp1Var, a14 != 0 ? a14 != 1 ? a14 != 2 ? dp1.f4401b : dp1.f4403d : dp1.f4402c : dp1.f4401b, k41.a(json, "notification_flow_enabled", false));
        } catch (Exception e13) {
            List list = c0.d.f(e13, e13).f6994p;
            String message = e13.getMessage();
            if (message == null) {
                message = e13.getClass().getName();
            }
            list.add(message);
            return null;
        }
    }

    public static final boolean f0(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        return Intrinsics.d(d0Var.h(), Boolean.TRUE);
    }

    public static vo g(u uVar) {
        int i13;
        long j13;
        long j14;
        long j15;
        Bundle bundle;
        u uVar2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z13;
        int i14;
        u uVar3;
        u uVar4;
        ck ckVar;
        int i15;
        long j16;
        u uVar5;
        u uVar6;
        long j17;
        u uVar7;
        ArrayList arrayList = new ArrayList();
        zn2.b.f142311b.getClass();
        int i16 = 1;
        long j18 = 0;
        long j19 = zn2.b.j(0L, dl2.b.P2(1, zn2.d.SECONDS));
        u uVar8 = new u();
        Bundle bundle2 = new Bundle();
        u uVar9 = new u();
        u uVar10 = new u();
        if (uVar != null) {
            Iterator it = ((pm.l) uVar.f91366a.entrySet()).iterator();
            u uVar11 = uVar10;
            String str7 = "";
            String str8 = str7;
            String str9 = str8;
            String str10 = str9;
            String str11 = str10;
            String str12 = str11;
            int i17 = 0;
            ck ckVar2 = null;
            boolean z14 = false;
            Bundle bundle3 = bundle2;
            u uVar12 = uVar9;
            long j23 = 0;
            while (((m) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((pm.k) it).next();
                Intrinsics.f(entry);
                String str13 = (String) entry.getKey();
                nm.s json = (nm.s) entry.getValue();
                if (str13 != null) {
                    u uVar13 = uVar8;
                    i15 = i16;
                    switch (str13.hashCode()) {
                        case -1934789405:
                            j16 = j19;
                            if (str13.equals("adRequestUrl")) {
                                String p13 = json.p();
                                Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
                                uVar8 = uVar13;
                                str9 = p13;
                                i16 = i15;
                                j19 = j16;
                            }
                            uVar8 = uVar13;
                            i16 = i15;
                            j19 = j16;
                        case -1664768712:
                            j16 = j19;
                            if (str13.equals("inspector_ad_transaction_extras")) {
                                u a13 = k41.a(json);
                                if (a13 == null) {
                                    try {
                                        uVar5 = (u) new nm.o().b(u.class, json.p());
                                    } catch (Exception e13) {
                                        List list = c0.d.f(e13, e13).f6994p;
                                        String message = e13.getMessage();
                                        if (message == null) {
                                            message = e13.getClass().getName();
                                        }
                                        list.add(message);
                                        uVar5 = null;
                                    }
                                    if (uVar5 != null) {
                                        uVar12 = uVar5;
                                    }
                                } else {
                                    uVar12 = a13;
                                }
                            }
                            uVar8 = uVar13;
                            i16 = i15;
                            j19 = j16;
                        case -1550155393:
                            j16 = j19;
                            if (str13.equals("nofill_urls")) {
                                nm.q f13 = json.f();
                                Intrinsics.checkNotNullExpressionValue(f13, "getAsJsonArray(...)");
                                Iterator it2 = f13.f91364a.iterator();
                                int i18 = 0;
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    int i19 = i18 + 1;
                                    if (i18 < 0) {
                                        f0.p();
                                        throw null;
                                    }
                                    nm.s sVar = (nm.s) next;
                                    Intrinsics.f(sVar);
                                    Uri parse = Uri.parse(sVar.p());
                                    if (parse != null) {
                                        arrayList.add(parse);
                                    }
                                    i18 = i19;
                                }
                                uVar8 = uVar13;
                                i16 = i15;
                                j19 = j16;
                            }
                            uVar8 = uVar13;
                            i16 = i15;
                            j19 = j16;
                        case -1076723292:
                            j16 = j19;
                            if (str13.equals("adapter_response_replacement_key")) {
                                String p14 = json.p();
                                Intrinsics.checkNotNullExpressionValue(p14, "getAsString(...)");
                                uVar8 = uVar13;
                                str11 = p14;
                                i16 = i15;
                                j19 = j16;
                            }
                            uVar8 = uVar13;
                            i16 = i15;
                            j19 = j16;
                        case -996058782:
                            j16 = j19;
                            if (str13.equals("adResponseHeaders")) {
                                u a14 = k41.a(json);
                                if (a14 == null) {
                                    try {
                                        uVar6 = (u) new nm.o().b(u.class, json.p());
                                    } catch (Exception e14) {
                                        List list2 = c0.d.f(e14, e14).f6994p;
                                        String message2 = e14.getMessage();
                                        if (message2 == null) {
                                            message2 = e14.getClass().getName();
                                        }
                                        list2.add(message2);
                                        uVar6 = null;
                                    }
                                    if (uVar6 != null) {
                                        uVar11 = uVar6;
                                    }
                                } else {
                                    uVar11 = a14;
                                }
                            }
                            uVar8 = uVar13;
                            i16 = i15;
                            j19 = j16;
                        case -878581970:
                            j16 = j19;
                            if (str13.equals("gws_query_id")) {
                                String p15 = json.p();
                                Intrinsics.checkNotNullExpressionValue(p15, "getAsString(...)");
                                uVar8 = uVar13;
                                str7 = p15;
                                i16 = i15;
                                j19 = j16;
                            }
                            uVar8 = uVar13;
                            i16 = i15;
                            j19 = j16;
                        case -729197079:
                            j16 = j19;
                            if (str13.equals("is_idless")) {
                                z14 = json.b();
                                uVar8 = uVar13;
                                i16 = i15;
                                j19 = j16;
                            }
                            uVar8 = uVar13;
                            i16 = i15;
                            j19 = j16;
                        case -644504941:
                            j16 = j19;
                            if (str13.equals("max_parallel_renderers")) {
                                i16 = json.e();
                                uVar8 = uVar13;
                                j19 = j16;
                            }
                            uVar8 = uVar13;
                            i16 = i15;
                            j19 = j16;
                        case -46576386:
                            j16 = j19;
                            if (str13.equals("latency")) {
                                j23 = json.l();
                                uVar8 = uVar13;
                                i16 = i15;
                                j19 = j16;
                            }
                            uVar8 = uVar13;
                            i16 = i15;
                            j19 = j16;
                        case 532938054:
                            j16 = j19;
                            if (str13.equals("adResponseBody")) {
                                String p16 = json.p();
                                Intrinsics.checkNotNullExpressionValue(p16, "getAsString(...)");
                                uVar8 = uVar13;
                                str12 = p16;
                                i16 = i15;
                                j19 = j16;
                            }
                            uVar8 = uVar13;
                            i16 = i15;
                            j19 = j16;
                        case 864007346:
                            if (!str13.equals("public_error")) {
                                uVar8 = uVar13;
                                break;
                            } else {
                                Intrinsics.f(json);
                                Intrinsics.checkNotNullParameter(json, "json");
                                if (json instanceof t) {
                                    j17 = j19;
                                } else {
                                    try {
                                        u i23 = json.i();
                                        Intrinsics.checkNotNullExpressionValue(i23, "getAsJsonObject(...)");
                                        j17 = j19;
                                        try {
                                            Intrinsics.checkNotNullParameter(i23, "<this>");
                                            Intrinsics.checkNotNullParameter("code", "key");
                                            int e15 = i23.v("code").e();
                                            u i24 = json.i();
                                            Intrinsics.checkNotNullExpressionValue(i24, "getAsJsonObject(...)");
                                            Intrinsics.checkNotNullParameter(i24, "<this>");
                                            Intrinsics.checkNotNullParameter("description", "key");
                                            String p17 = i24.v("description").p();
                                            Intrinsics.checkNotNullExpressionValue(p17, "getAsString(...)");
                                            ckVar2 = new ck(p17, e15);
                                            i16 = i15;
                                            j19 = j17;
                                            uVar8 = uVar13;
                                        } catch (Exception e16) {
                                            e = e16;
                                            List list3 = c0.d.f(e, e).f6994p;
                                            String message3 = e.getMessage();
                                            if (message3 == null) {
                                                message3 = e.getClass().getName();
                                            }
                                            list3.add(message3);
                                            uVar8 = uVar13;
                                            i16 = i15;
                                            j19 = j17;
                                            ckVar2 = null;
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        j17 = j19;
                                    }
                                }
                                uVar8 = uVar13;
                                i16 = i15;
                                j19 = j17;
                                ckVar2 = null;
                            }
                        case 868720662:
                            if (!str13.equals("response_info_extras")) {
                                uVar8 = uVar13;
                                break;
                            } else {
                                u i25 = json.i();
                                Intrinsics.checkNotNullExpressionValue(i25, "getAsJsonObject(...)");
                                bundle3 = k41.b(i25);
                                uVar8 = uVar13;
                                i16 = i15;
                            }
                        case 961728366:
                            if (!str13.equals("adRequestPostBody")) {
                                uVar8 = uVar13;
                                break;
                            } else {
                                String p18 = json.p();
                                Intrinsics.checkNotNullExpressionValue(p18, "getAsString(...)");
                                uVar8 = uVar13;
                                str10 = p18;
                                i16 = i15;
                            }
                        case 1128093708:
                            if (!str13.equals("analytics_query_ad_event_id")) {
                                uVar8 = uVar13;
                                break;
                            } else {
                                String p19 = json.p();
                                Intrinsics.checkNotNullExpressionValue(p19, "getAsString(...)");
                                uVar8 = uVar13;
                                str8 = p19;
                                i16 = i15;
                            }
                        case 1282999366:
                            if (!str13.equals("refresh_load_delay_time_interval")) {
                                uVar8 = uVar13;
                                break;
                            } else {
                                zn2.a aVar = zn2.b.f142311b;
                                j19 = dl2.b.P2(json.e(), zn2.d.SECONDS);
                                uVar8 = uVar13;
                                i16 = i15;
                            }
                        case 1676268331:
                            if (!str13.equals("response_code")) {
                                uVar8 = uVar13;
                                break;
                            } else {
                                i17 = json.e();
                                uVar8 = uVar13;
                                i16 = i15;
                            }
                        case 1722800622:
                            if (str13.equals("bidding_data")) {
                                u a15 = k41.a(json);
                                if (a15 != null) {
                                    uVar8 = a15;
                                    break;
                                } else {
                                    try {
                                        uVar7 = (u) new nm.o().b(u.class, json.p());
                                    } catch (Exception e18) {
                                        List list4 = c0.d.f(e18, e18).f6994p;
                                        String message4 = e18.getMessage();
                                        if (message4 == null) {
                                            message4 = e18.getClass().getName();
                                        }
                                        list4.add(message4);
                                        uVar7 = null;
                                    }
                                    if (uVar7 != null) {
                                        uVar8 = uVar7;
                                        break;
                                    }
                                }
                            }
                            uVar8 = uVar13;
                            break;
                        case 1816824233:
                            if (!str13.equals("refresh_interval")) {
                                uVar8 = uVar13;
                                break;
                            } else {
                                zn2.a aVar2 = zn2.b.f142311b;
                                j18 = dl2.b.P2(json.e(), zn2.d.SECONDS);
                                uVar8 = uVar13;
                                i16 = i15;
                            }
                        default:
                            uVar8 = uVar13;
                            break;
                    }
                } else {
                    i15 = i16;
                }
                j16 = j19;
                i16 = i15;
                j19 = j16;
            }
            int i26 = i16;
            long j24 = j19;
            j14 = j23;
            uVar4 = uVar12;
            str3 = str9;
            str2 = str10;
            str = str11;
            i14 = i17;
            ckVar = ckVar2;
            z13 = z14;
            i13 = i26;
            j13 = j24;
            uVar3 = uVar8;
            str6 = str8;
            String str14 = str12;
            bundle = bundle3;
            str5 = str7;
            j15 = j18;
            uVar2 = uVar11;
            str4 = str14;
        } else {
            i13 = 1;
            j13 = j19;
            j14 = 0;
            j15 = 0;
            bundle = bundle2;
            uVar2 = uVar10;
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
            str5 = str4;
            str6 = str5;
            z13 = false;
            i14 = 0;
            uVar3 = uVar8;
            uVar4 = uVar9;
            ckVar = null;
        }
        return new vo(str, str2, str3, str4, uVar2, uVar3, ckVar, str5, uVar4, z13, j14, i13, arrayList, j15, j13, i14, bundle, str6);
    }

    public static hd2.f g0(gf2.o value) {
        Intrinsics.checkNotNullParameter(value, "value");
        gf2.t obj = new gf2.t();
        Intrinsics.checkNotNullParameter(obj, "obj");
        int b13 = value.b(4);
        if (b13 == 0) {
            throw new AssertionError("No value for (required) field start");
        }
        int a13 = value.a(b13 + value.f87566a);
        ByteBuffer _bb = value.f87567b;
        Intrinsics.checkNotNullExpressionValue(_bb, "bb");
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        obj.c(a13, _bb);
        PointF i03 = i0(obj);
        gf2.t obj2 = new gf2.t();
        Intrinsics.checkNotNullParameter(obj2, "obj");
        int b14 = value.b(6);
        if (b14 == 0) {
            throw new AssertionError("No value for (required) field end");
        }
        int a14 = value.a(b14 + value.f87566a);
        ByteBuffer _bb2 = value.f87567b;
        Intrinsics.checkNotNullExpressionValue(_bb2, "bb");
        Intrinsics.checkNotNullParameter(_bb2, "_bb");
        Intrinsics.checkNotNullParameter(_bb2, "_bb");
        obj2.c(a14, _bb2);
        return new hd2.f(i03, i0(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(n3.l0 r7, bl2.c r8) {
        /*
            boolean r0 = r8 instanceof b2.u
            if (r0 == 0) goto L13
            r0 = r8
            b2.u r0 = (b2.u) r0
            int r1 = r0.f21240t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21240t = r1
            goto L18
        L13:
            b2.u r0 = new b2.u
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f21239s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f21240t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            n3.l0 r7 = r0.f21238r
            ue.c.H(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            ue.c.H(r8)
        L34:
            n3.k r8 = n3.k.Main
            r0.f21238r = r7
            r0.f21240t = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L41
            goto L5d
        L41:
            n3.j r8 = (n3.j) r8
            java.util.List r2 = r8.f89070a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            n3.q r6 = (n3.q) r6
            boolean r6 = c0.d.s(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            r1 = r8
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.h.h(n3.l0, bl2.c):java.lang.Object");
    }

    public static final boolean h0(z zVar, ra0.y selectedColor, o oVar) {
        boolean z13;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(selectedColor, "selectedColor");
        i2.s sVar = (i2.s) oVar;
        sVar.W(-565979359);
        ra0.f0 f0Var = zVar.f107045a;
        if (!(f0Var instanceof ra0.d0) && !(f0Var instanceof ra0.c0)) {
            if (f0Var instanceof b0) {
                z13 = selectedColor instanceof w;
            } else {
                if (!(f0Var instanceof e0)) {
                    throw new NoWhenBranchMatchedException();
                }
                if ((selectedColor instanceof ra0.x) && b3.w.c(((e0) f0Var).f106918a, dl2.b.t2(((ra0.x) selectedColor).f107028a, sVar))) {
                    z13 = true;
                }
            }
            sVar.r(false);
            return z13;
        }
        z13 = false;
        sVar.r(false);
        return z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(n3.l0 r11, b2.k r12, bn0.a r13, n3.j r14, bl2.c r15) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.h.i(n3.l0, b2.k, bn0.a, n3.j, bl2.c):java.lang.Object");
    }

    public static PointF i0(gf2.t value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int b13 = value.b(4);
        float f13 = b13 != 0 ? value.f87567b.getFloat(b13 + value.f87566a) : 0.0f;
        int b14 = value.b(6);
        return new PointF(f13, b14 != 0 ? value.f87567b.getFloat(b14 + value.f87566a) : 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4 A[Catch: CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:12:0x002a, B:13:0x00ac, B:15:0x00b4, B:17:0x00c1, B:19:0x00cd, B:21:0x00d0, B:24:0x00d3, B:28:0x00d7, B:32:0x0040, B:34:0x0064, B:36:0x0068, B:38:0x0078, B:39:0x0084, B:41:0x0092, B:45:0x0080, B:47:0x004a), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7 A[Catch: CancellationException -> 0x002f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:12:0x002a, B:13:0x00ac, B:15:0x00b4, B:17:0x00c1, B:19:0x00cd, B:21:0x00d0, B:24:0x00d3, B:28:0x00d7, B:32:0x0040, B:34:0x0064, B:36:0x0068, B:38:0x0078, B:39:0x0084, B:41:0x0092, B:45:0x0080, B:47:0x004a), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068 A[Catch: CancellationException -> 0x002f, TryCatch #0 {CancellationException -> 0x002f, blocks: (B:12:0x002a, B:13:0x00ac, B:15:0x00b4, B:17:0x00c1, B:19:0x00cd, B:21:0x00d0, B:24:0x00d3, B:28:0x00d7, B:32:0x0040, B:34:0x0064, B:36:0x0068, B:38:0x0078, B:39:0x0084, B:41:0x0092, B:45:0x0080, B:47:0x004a), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(n3.l0 r10, w1.y1 r11, n3.j r12, bl2.c r13) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.h.j(n3.l0, w1.y1, n3.j, bl2.c):java.lang.Object");
    }

    public static long j0(int i13, int i14, d7.d0 d0Var) {
        d0Var.K(i13);
        if (d0Var.a() < 5) {
            return -9223372036854775807L;
        }
        int k13 = d0Var.k();
        if ((8388608 & k13) != 0 || ((2096896 & k13) >> 8) != i14 || (k13 & 32) == 0 || d0Var.y() < 7 || d0Var.a() < 7 || (d0Var.y() & 16) != 16) {
            return -9223372036854775807L;
        }
        d0Var.i(new byte[6], 0, 6);
        return ((255 & r0[4]) >> 7) | ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1);
    }

    public static void k(x92.b bVar) {
        a0.c(bVar);
        bVar.e("pin.board()");
        a0.b(bVar);
        bVar.e("board.layout");
    }

    public static final k0 k0(xk2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Metadata metadata = (Metadata) gVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] data = metadata.d1();
        if (data.length == 0) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        String[] strings = metadata.d2();
        zm2.k kVar = xm2.j.f135411a;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xm2.a.d(data));
        zm2.k kVar2 = xm2.j.f135411a;
        xm2.h g13 = xm2.j.g(byteArrayInputStream, strings);
        tm2.a aVar = tm2.a0.f118143v;
        zm2.k kVar3 = xm2.j.f135411a;
        aVar.getClass();
        zm2.h hVar = new zm2.h(byteArrayInputStream);
        zm2.t a13 = aVar.a(hVar, kVar3);
        try {
            if (hVar.f142213f != 0) {
                throw InvalidProtocolBufferException.a();
            }
            if (!a13.isInitialized()) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                invalidProtocolBufferException.f80460a = a13;
                throw invalidProtocolBufferException;
            }
            tm2.a0 a0Var = (tm2.a0) a13;
            xm2.g gVar2 = new xm2.g(metadata.mv(), (metadata.xi() & 8) != 0);
            Class<?> cls = gVar.getClass();
            y0 y0Var = a0Var.f118158p;
            Intrinsics.checkNotNullExpressionValue(y0Var, "getTypeTable(...)");
            return new k0(ul2.f.f122517b, (u0) c2.f(cls, a0Var, g13, new vm2.i(y0Var), gVar2, tl2.a.f118112a));
        } catch (InvalidProtocolBufferException e13) {
            e13.f80460a = a13;
            throw e13;
        }
    }

    public static final void l(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        n00.k.a(bVar);
        bVar.e("conversationmessage.thread()");
        bVar.e("conversationthread.id");
        bVar.e("conversationthread.replies_count");
        bVar.e("conversationthread.anchor_message()");
    }

    public static final SpannableString l0(int i13, CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        SpannableString spannableString = new SpannableString(text);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        Intrinsics.f(uRLSpanArr);
        for (URLSpan uRLSpan : uRLSpanArr) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            URLSpanNoUnderline uRLSpanNoUnderline = new URLSpanNoUnderline(uRLSpan.getURL());
            uRLSpanNoUnderline.f44893a = i13;
            spannableString.setSpan(uRLSpanNoUnderline, spanStart, spanEnd, 0);
        }
        return spannableString;
    }

    public static final void m(Context context, SpannableStringBuilder builder, int i13, int i14, cf0.b bVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        p(context, builder, i13, i14, -1, bVar, true);
    }

    public static void m0(Runnable runnable) {
        if (b0()) {
            runnable.run();
        } else {
            com.bumptech.glide.d.v("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static final void n(Context context, GestaltText gestaltText, String unformattedString, String varValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gestaltText, "gestaltText");
        Intrinsics.checkNotNullParameter(unformattedString, "unformattedString");
        Intrinsics.checkNotNullParameter(varValue, "varValue");
        o(context, gestaltText, unformattedString, varValue, null);
    }

    public static final void n0(o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        qo2.j1 j1Var = qo2.j1.f104576a;
    }

    public static void o(Context context, GestaltText gestaltText, String unformattedString, String varValue, o3 o3Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gestaltText, "gestaltText");
        Intrinsics.checkNotNullParameter(unformattedString, "unformattedString");
        Intrinsics.checkNotNullParameter("%1$s", "var");
        Intrinsics.checkNotNullParameter(varValue, "varValue");
        a0.q(gestaltText, bs1.c.p2(B(context, unformattedString, "%1$s", varValue, -1, o3Var)));
    }

    public static final so2.i0 o0(oo2.g desc, ro2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        oo2.n c13 = desc.c();
        if (c13 instanceof oo2.d) {
            return so2.i0.POLY_OBJ;
        }
        if (Intrinsics.d(c13, oo2.o.f96904b)) {
            return so2.i0.LIST;
        }
        if (!Intrinsics.d(c13, oo2.o.f96905c)) {
            return so2.i0.OBJ;
        }
        oo2.g r13 = r(desc.h(0), cVar.f108977b);
        oo2.n c14 = r13.c();
        if ((c14 instanceof oo2.f) || Intrinsics.d(c14, oo2.m.f96902a)) {
            return so2.i0.MAP;
        }
        if (cVar.f108976a.f109015d) {
            return so2.i0.LIST;
        }
        throw kh2.j1.g(r13);
    }

    public static final void p(Context context, SpannableStringBuilder builder, int i13, int i14, int i15, cf0.b bVar, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i13 < 0 || i14 > builder.length()) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.p(new IndexOutOfBoundsException(j1.W("BrioTypefaceUtil.applyBoldAndClickSpansToBuilder: Invalid index. string (%s), varStart (%d), varEnd(%d)", builder.toString(), Integer.valueOf(i13), Integer.valueOf(i14))));
            return;
        }
        if (bVar != null) {
            builder.setSpan(bVar, i13, i14, 33);
        }
        builder.setSpan(new StyleSpan(z13 ? 1 : 0), i13, i14, 33);
        if (i15 != -1) {
            Object obj = d5.a.f53679a;
            builder.setSpan(new ForegroundColorSpan(context.getColor(i15)), i13, i14, 33);
        }
    }

    public static final u2.q p0(Function1 function1) {
        return n3.f0.a(n.f120041b, 8675309, new b2.a0(function1, null));
    }

    public static final boolean q(pn2.b0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(type, "<this>");
        return ((xl2.l.H(type) || v.c(type)) && !t1.g(type)) || xl2.l.I(type);
    }

    public static String q0(gi.j1 j1Var) {
        StringBuilder sb3 = new StringBuilder(j1Var.f());
        for (int i13 = 0; i13 < j1Var.f(); i13++) {
            byte d2 = j1Var.d(i13);
            if (d2 == 34) {
                sb3.append("\\\"");
            } else if (d2 == 39) {
                sb3.append("\\'");
            } else if (d2 != 92) {
                switch (d2) {
                    case 7:
                        sb3.append("\\a");
                        break;
                    case 8:
                        sb3.append("\\b");
                        break;
                    case 9:
                        sb3.append("\\t");
                        break;
                    case 10:
                        sb3.append("\\n");
                        break;
                    case 11:
                        sb3.append("\\v");
                        break;
                    case 12:
                        sb3.append("\\f");
                        break;
                    case 13:
                        sb3.append("\\r");
                        break;
                    default:
                        if (d2 < 32 || d2 > 126) {
                            sb3.append('\\');
                            sb3.append((char) (((d2 >>> 6) & 3) + 48));
                            sb3.append((char) (((d2 >>> 3) & 7) + 48));
                            sb3.append((char) ((d2 & 7) + 48));
                            break;
                        } else {
                            sb3.append((char) d2);
                            break;
                        }
                        break;
                }
            } else {
                sb3.append("\\\\");
            }
        }
        return sb3.toString();
    }

    public static final oo2.g r(oo2.g descriptor, to2.d module) {
        oo2.g r13;
        no2.b b13;
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.d(descriptor.c(), oo2.l.f96901a)) {
            return descriptor.isInline() ? r(descriptor.h(0), module) : descriptor;
        }
        Intrinsics.checkNotNullParameter(module, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        rl2.d y13 = l3.c.y(descriptor);
        oo2.g gVar = null;
        if (y13 != null && (b13 = module.b(y13, q0.f80391a)) != null) {
            gVar = b13.a();
        }
        return (gVar == null || (r13 = r(gVar, module)) == null) ? descriptor : r13;
    }

    public static Pair r0(RandomAccessFile randomAccessFile, int i13) {
        int i14;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i13, (-22) + length)) + 22);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long capacity = length - allocate.capacity();
        randomAccessFile.seek(capacity);
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        s0(allocate);
        int capacity2 = allocate.capacity();
        if (capacity2 >= 22) {
            int i15 = capacity2 - 22;
            int min = Math.min(i15, 65535);
            for (int i16 = 0; i16 < min; i16++) {
                i14 = i15 - i16;
                if (allocate.getInt(i14) == 101010256 && ((char) allocate.getShort(i14 + 20)) == i16) {
                    break;
                }
            }
        }
        i14 = -1;
        if (i14 == -1) {
            return null;
        }
        allocate.position(i14);
        ByteBuffer slice = allocate.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(slice, Long.valueOf(capacity + i14));
    }

    public static void s() {
        com.bumptech.glide.d.v("Not in application's main thread", b0());
    }

    public static void s0(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static id2.c t(gf2.c value) {
        byte b13;
        byte b14;
        byte b15;
        Intrinsics.checkNotNullParameter(value, "value");
        int b16 = value.b(4);
        byte b17 = 0;
        if (b16 != 0) {
            b13 = value.f87567b.get(b16 + value.f87566a);
            xk2.x xVar = xk2.y.f135237b;
        } else {
            b13 = 0;
        }
        float f13 = (b13 & 255) / 255.0f;
        int b18 = value.b(6);
        if (b18 != 0) {
            b14 = value.f87567b.get(b18 + value.f87566a);
            xk2.x xVar2 = xk2.y.f135237b;
        } else {
            b14 = 0;
        }
        float f14 = (b14 & 255) / 255.0f;
        int b19 = value.b(8);
        if (b19 != 0) {
            b15 = value.f87567b.get(b19 + value.f87566a);
            xk2.x xVar3 = xk2.y.f135237b;
        } else {
            b15 = 0;
        }
        float f15 = (b15 & 255) / 255.0f;
        int b23 = value.b(10);
        if (b23 != 0) {
            b17 = value.f87567b.get(b23 + value.f87566a);
            xk2.x xVar4 = xk2.y.f135237b;
        }
        return new id2.c(f13, f14, f15, (b17 & 255) / 255.0f);
    }

    public static void u(long j13, d7.d0 d0Var, q8.k0[] k0VarArr) {
        int i13;
        while (true) {
            if (d0Var.a() <= 1) {
                return;
            }
            int i14 = 0;
            while (true) {
                if (d0Var.a() == 0) {
                    i13 = -1;
                    break;
                }
                int y13 = d0Var.y();
                i14 += y13;
                if (y13 != 255) {
                    i13 = i14;
                    break;
                }
            }
            int i15 = 0;
            while (true) {
                if (d0Var.a() == 0) {
                    i15 = -1;
                    break;
                }
                int y14 = d0Var.y();
                i15 += y14;
                if (y14 != 255) {
                    break;
                }
            }
            int i16 = d0Var.f53807b + i15;
            if (i15 == -1 || i15 > d0Var.a()) {
                d7.u.g("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i16 = d0Var.f53808c;
            } else if (i13 == 4 && i15 >= 8) {
                int y15 = d0Var.y();
                int E = d0Var.E();
                int k13 = E == 49 ? d0Var.k() : 0;
                int y16 = d0Var.y();
                if (E == 47) {
                    d0Var.L(1);
                }
                boolean z13 = y15 == 181 && (E == 49 || E == 47) && y16 == 3;
                if (E == 49) {
                    z13 &= k13 == 1195456820;
                }
                if (z13) {
                    v(j13, d0Var, k0VarArr);
                }
            }
            d0Var.K(i16);
        }
    }

    public static void v(long j13, d7.d0 d0Var, q8.k0[] k0VarArr) {
        int y13 = d0Var.y();
        if ((y13 & 64) != 0) {
            d0Var.L(1);
            int i13 = (y13 & 31) * 3;
            int i14 = d0Var.f53807b;
            for (q8.k0 k0Var : k0VarArr) {
                d0Var.K(i14);
                k0Var.d(i13, 0, d0Var);
                bf.b.t(j13 != -9223372036854775807L);
                k0Var.a(j13, 1, i13, 0, null);
            }
        }
    }

    public static final sn2.m w(w1 w1Var) {
        Intrinsics.checkNotNullParameter(w1Var, "<this>");
        int i13 = sn2.l.f113316a[w1Var.ordinal()];
        if (i13 == 1) {
            return sn2.m.INV;
        }
        if (i13 == 2) {
            return sn2.m.IN;
        }
        if (i13 == 3) {
            return sn2.m.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AnimatorSet x(oj.g gVar, float f13, float f14, float f15) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(gVar, oj.d.f95352a, oj.c.f95350b, new oj.f(f13, f14, f15));
        oj.f a13 = gVar.a();
        if (a13 == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) gVar, (int) f13, (int) f14, a13.f95356c, f15);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    public static d1 y(lh2.b logger) {
        og2.b clock = new og2.b(new og2.c());
        nf2.o systemInfo = new nf2.o();
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(systemInfo, "systemInfo");
        return new d1(clock, logger, systemInfo);
    }

    public static String z(Resources resources, long j13, boolean z13, int i13) {
        boolean z14 = (i13 & 4) != 0;
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        Intrinsics.checkNotNullParameter(resources, "resources");
        StringBuilder sb3 = new StringBuilder();
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j13);
        if (minutes > 0) {
            String I = I(resources, minutes);
            String quantityString = z13 ? resources.getQuantityString(dq1.e.story_pin_minutes_content_description, (int) minutes, I) : resources.getString(dq1.f.story_pin_minute, I);
            Intrinsics.f(quantityString);
            sb3.append(quantityString);
            sb3.append(" ");
        }
        float seconds = (((j13 % 1000) * 1.0f) / 1000) + (r1.toSeconds(j13) % 60);
        if (seconds > 0.0f || minutes == 0) {
            sb3.append(resources.getString(z13 ? dq1.f.story_pin_seconds_content_description : dq1.f.story_pin_second, j1.Y(z14 ? "%.1f" : "%.0f", new Object[]{Float.valueOf(seconds)}, null, 6)));
            sb3.append(" ");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return StringsKt.i0(sb4).toString();
    }

    public String E(float f13) {
        return G(f13);
    }

    public abstract String G(float f13);
}
