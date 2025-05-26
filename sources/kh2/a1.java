package kh2;

import a.cb;
import a.jf;
import ads_mobile_sdk.ad2;
import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import ads_mobile_sdk.cs2;
import ads_mobile_sdk.dk0;
import ads_mobile_sdk.ft2;
import ads_mobile_sdk.il0;
import ads_mobile_sdk.jk0;
import ads_mobile_sdk.k41;
import ads_mobile_sdk.p12;
import ads_mobile_sdk.qh1;
import ads_mobile_sdk.qs2;
import ads_mobile_sdk.sb2;
import ads_mobile_sdk.ss2;
import ads_mobile_sdk.th1;
import ads_mobile_sdk.uk0;
import ads_mobile_sdk.xl0;
import ads_mobile_sdk.yj0;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.pinterest.api.model.g6;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.tq;
import com.pinterest.api.model.uq;
import com.pinterest.component.alert.AlertContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.education.IdeaPinCreationEducationOnboardingView;
import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import io.embrace.android.embracesdk.internal.comms.api.ApiRequestUrl;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import org.json.JSONArray;
import org.json.JSONObject;
import so.v5;

/* loaded from: classes4.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f79427a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f79428b = true;

    public static final int A(dc0.a boardActiveStatus, rl2.g0 boardContributorStatus, dc0.j boardVisibility) {
        Intrinsics.checkNotNullParameter(boardActiveStatus, "boardActiveStatus");
        Intrinsics.checkNotNullParameter(boardContributorStatus, "boardContributorStatus");
        Intrinsics.checkNotNullParameter(boardVisibility, "boardVisibility");
        return boardActiveStatus == dc0.a.Archived ? ga2.f.content_description_wide_board_view_archived : boardContributorStatus instanceof dc0.b ? ga2.f.content_description_wide_board_view_group : boardVisibility == dc0.j.Private ? ga2.f.content_description_wide_board_view_private : ga2.f.content_description_wide_board_view_public;
    }

    public static final void A0(FragmentActivity activity, Context context, mv0.w onStoreCallback, mv0.w onDiscardCallback) {
        yb0.n a13;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onStoreCallback, "onStoreCallback");
        Intrinsics.checkNotNullParameter(onDiscardCallback, "onDiscardCallback");
        int i13 = yb0.n.f138503p;
        String string = activity.getString(aq1.h.idea_pin_metadata_products_saving_modal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(aq1.h.idea_pin_metadata_products_saving_modal_subtitle);
        String string3 = activity.getString(aq1.h.idea_pin_drafts_saving_modal_confirm_button);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = activity.getString(aq1.h.idea_pin_discard_button);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        a13 = xa0.j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new uv0.f(3, onStoreCallback), (r20 & 64) != 0 ? yb0.k.f138492k : new uv0.f(4, onDiscardCallback), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        w(activity, a13);
    }

    public static Drawable B(Context context, int i13, Resources.Theme theme) {
        return C(context, context, i13, theme);
    }

    public static final void B0(FragmentActivity activity, Context context, Integer num, Function0 onStoreCallback, Function0 onDiscardCallback) {
        yb0.n a13;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onStoreCallback, "onStoreCallback");
        Intrinsics.checkNotNullParameter(onDiscardCallback, "onDiscardCallback");
        int i13 = yb0.n.f138503p;
        String string = activity.getString(aq1.h.unified_pin_drafts_saving_modal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(num != null ? num.intValue() : aq1.h.unified_pin_drafts_saving_modal_subtitle);
        String string3 = activity.getString(aq1.h.unified_pin_save_draft_button);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = activity.getString(aq1.h.idea_pin_discard_button);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        a13 = xa0.j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new uv0.f(5, onStoreCallback), (r20 & 64) != 0 ? yb0.k.f138492k : new uv0.f(6, onDiscardCallback), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        w(activity, a13);
    }

    public static Drawable C(Context context, Context context2, int i13, Resources.Theme theme) {
        try {
            if (f79428b) {
                return i0(context2, i13, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e13) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e13;
            }
            Object obj = d5.a.f53679a;
            return context2.getDrawable(i13);
        } catch (NoClassDefFoundError unused2) {
            f79428b = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = e5.n.f57243a;
        return resources.getDrawable(i13, theme);
    }

    public static final LinkedHashMap D(ApiRequest apiRequest) {
        Intrinsics.checkNotNullParameter(apiRequest, "<this>");
        LinkedHashMap h10 = kotlin.collections.z0.h(new Pair("Accept", apiRequest.f72926d), new Pair("User-Agent", apiRequest.f72924b), new Pair("Content-Type", apiRequest.f72923a));
        String str = apiRequest.f72925c;
        if (str != null) {
            h10.put("Content-Encoding", str);
        }
        String str2 = apiRequest.f72927e;
        if (str2 != null) {
            h10.put("Accept-Encoding", str2);
        }
        String str3 = apiRequest.f72928f;
        if (str3 != null) {
            h10.put("X-EM-AID", str3);
        }
        String str4 = apiRequest.f72929g;
        if (str4 != null) {
            h10.put("X-EM-DID", str4);
        }
        String str5 = apiRequest.f72932j;
        if (str5 != null) {
            h10.put("If-None-Match", str5);
        }
        return h10;
    }

    public static final String D0(int i13, i2.o oVar) {
        return s0.R0(oVar).getString(i13);
    }

    public static String E(com.bugsnag.android.c0 c0Var) {
        try {
            xk2.q qVar = xk2.s.f135225b;
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            StringBuilder sb3 = new StringBuilder("sha1 ");
            OutputStream digestOutputStream = new DigestOutputStream(new com.bugsnag.android.d2(0), messageDigest);
            try {
                BufferedOutputStream bufferedOutputStream = digestOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) digestOutputStream : new BufferedOutputStream(digestOutputStream, 8192);
                try {
                    bufferedOutputStream.write(c0Var.a());
                    Unit unit = Unit.f80348a;
                    dl2.b.J(bufferedOutputStream, null);
                    byte[] digest = messageDigest.digest();
                    int length = digest.length;
                    int i13 = 0;
                    while (i13 < length) {
                        byte b13 = digest[i13];
                        i13++;
                        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b13)}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                        sb3.append(format);
                    }
                    Unit unit2 = Unit.f80348a;
                    dl2.b.J(digestOutputStream, null);
                    return sb3.toString();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            if (xk2.s.a(ue.c.m(th3)) != null) {
                return null;
            }
            throw new KotlinNothingValueException();
        }
    }

    public static final String E0(int i13, Object[] objArr, i2.o oVar) {
        return s0.R0(oVar).getString(i13, Arrays.copyOf(objArr, objArr.length));
    }

    public static void F(lq0.h1 h1Var, b60.b bVar) {
        h1Var.f84332o = bVar;
    }

    public static final pg2.q F0(ApiRequest apiRequest) {
        Intrinsics.checkNotNullParameter(apiRequest, "<this>");
        try {
            ApiRequestUrl apiRequestUrl = apiRequest.f72930h;
            HttpMethod httpMethod = apiRequest.f72931i;
            String url = apiRequestUrl.f72939a;
            Intrinsics.checkNotNullParameter(url, "url");
            URL url2 = new URL(url);
            pg2.r rVar = new pg2.r(url2);
            URLConnection openConnection = url2.openConnection();
            Intrinsics.g(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            pg2.q qVar = new pg2.q();
            qVar.f100146a = (HttpURLConnection) openConnection;
            qVar.f100147b = rVar;
            for (Map.Entry entry : D(apiRequest).entrySet()) {
                qVar.f100146a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            qVar.f100146a.setRequestMethod(httpMethod.name());
            if (httpMethod == HttpMethod.POST) {
                qVar.f100146a.setDoOutput(true);
            }
            return qVar;
        } catch (IOException e13) {
            String localizedMessage = e13.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw new IllegalStateException(localizedMessage, e13);
        }
    }

    public static void G(hz.d dVar, cz.e eVar) {
        dVar.f70602j0 = eVar;
    }

    public static final long G0(long j13, long j14) {
        int c13;
        int e13 = b4.p0.e(j13);
        int d2 = b4.p0.d(j13);
        if (b4.p0.e(j14) >= b4.p0.d(j13) || b4.p0.e(j13) >= b4.p0.d(j14)) {
            if (d2 > b4.p0.e(j14)) {
                e13 -= b4.p0.c(j14);
                c13 = b4.p0.c(j14);
                d2 -= c13;
            }
        } else if (b4.p0.e(j14) > b4.p0.e(j13) || b4.p0.d(j13) > b4.p0.d(j14)) {
            if (b4.p0.e(j13) > b4.p0.e(j14) || b4.p0.d(j14) > b4.p0.d(j13)) {
                int e14 = b4.p0.e(j14);
                if (e13 >= b4.p0.d(j14) || e14 > e13) {
                    d2 = b4.p0.e(j14);
                } else {
                    e13 = b4.p0.e(j14);
                    c13 = b4.p0.c(j14);
                }
            } else {
                c13 = b4.p0.c(j14);
            }
            d2 -= c13;
        } else {
            e13 = b4.p0.e(j14);
            d2 = e13;
        }
        return b7.c.h(e13, d2);
    }

    public static void H(fk0.k kVar, oc.c cVar) {
        kVar.E0 = cVar;
    }

    public static final xm0.d H0(xm0.d dVar, int i13, boolean z13) {
        u50.i0 a13 = xm0.c.a(i13);
        int i14 = z13 ? d70.g.select_pins_deselect_all : d70.g.select_pins_select_all;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return xm0.d.a(dVar, a13, new u50.k0(i14, new ArrayList(0)), 1);
    }

    public static void I(fk0.k kVar, so.v2 v2Var) {
        kVar.A0 = v2Var;
    }

    public static String I0(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i13 = 0; i13 < min; i13++) {
            String str2 = strArr[i13];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i13];
            }
        }
        return null;
    }

    public static void J(fk0.k kVar, so.k2 k2Var) {
        kVar.f62310z0 = k2Var;
    }

    public static void K(xo0.k kVar, x02.x0 x0Var) {
        kVar.O0 = x0Var;
    }

    public static void L(xo0.k kVar, v5 v5Var) {
        kVar.Y0 = v5Var;
    }

    public static void M(xo0.k kVar, lh0.x xVar) {
        kVar.X0 = xVar;
    }

    public static void N(fk0.k kVar, so.g3 g3Var) {
        kVar.C0 = g3Var;
    }

    public static void O(xo0.k kVar, rr0.a aVar) {
        kVar.S0 = aVar;
    }

    public static void P(e60.d dVar, nr0.m mVar) {
        dVar.f57488b1 = mVar;
    }

    public static void Q(xo0.k kVar, nr0.m mVar) {
        kVar.T0 = mVar;
    }

    public static void R(hz.d dVar, lh0.n nVar) {
        dVar.f70603k0 = nVar;
    }

    public static void S(xo0.k kVar, l12.b bVar) {
        kVar.R0 = bVar;
    }

    public static void T(bt0.j jVar, oa2.p pVar) {
        jVar.G0 = pVar;
    }

    public static void U(fk0.k kVar, yk1.j jVar) {
        kVar.D0 = jVar;
    }

    public static void V(xo0.k kVar, yk1.j jVar) {
        kVar.U0 = jVar;
    }

    public static void W(e60.d dVar, iv1.b bVar) {
        dVar.f57489c1 = bVar;
    }

    public static void X(xo0.k kVar, m60.g0 g0Var) {
        kVar.Q0 = g0Var;
    }

    public static void Y(xo0.k kVar, z12.b bVar) {
        kVar.W0 = bVar;
    }

    public static void Z(e60.d dVar, x02.i2 i2Var) {
        dVar.Y0 = i2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(l1.o r14, kotlin.jvm.functions.Function0 r15, u2.q r16, kotlin.jvm.functions.Function1 r17, i2.o r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.a1.a(l1.o, kotlin.jvm.functions.Function0, u2.q, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static void a0(xo0.k kVar, x02.i2 i2Var) {
        kVar.P0 = i2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(l1.o r16, kotlin.jvm.functions.Function0 r17, kotlin.jvm.functions.Function1 r18, u2.q r19, boolean r20, kotlin.jvm.functions.Function2 r21, i2.o r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.a1.b(l1.o, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, u2.q, boolean, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    public static void b0(xo0.k kVar, nx.f0 f0Var) {
        kVar.V0 = f0Var;
    }

    public static final void c(z90.g state, u2.q qVar, Function0 function0, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1970428173);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        Function0 function02 = (i14 & 4) != 0 ? z90.f.f141351i : function0;
        sVar.W(1520283936);
        Object J2 = sVar.J();
        if (J2 == i2.n.f71185a) {
            J2 = d7.g.o(sVar);
        }
        sVar.r(false);
        u2.q d2 = androidx.compose.foundation.a.d(qVar2, (o1.l) J2, null, false, null, function02, 28);
        p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120026n, sVar, 48);
        int i16 = sVar.P;
        i2.z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, d2);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z13 = sVar.f71265a instanceof i2.f;
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        s3.h hVar = s3.j.f110801e;
        tb.f.f0(sVar, a13, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(sVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar4);
        sVar.W(220842022);
        long h10 = state.f141355d ? g0.h(eo1.b.color_themed_background_secondary_base, sVar) : b3.w.f21389m;
        sVar.r(false);
        u2.q j13 = androidx.compose.foundation.layout.e.j(androidx.compose.foundation.a.b(nVar, ((b3.w) i1.u1.a(h10, null, "Selected state background animation", sVar, 384, 10).getValue()).f21392a, v1.i.a(com.bumptech.glide.d.A(eo1.c.rounding_300, sVar))), com.bumptech.glide.d.A(y90.w1.collage_effect_item_size, sVar));
        q3.p0 e13 = p1.q.e(u2.b.f120017e, false);
        int i17 = sVar.P;
        i2.z1 o14 = sVar.o();
        u2.q X2 = ao2.m0.X(sVar, j13);
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, e13, hVar);
        tb.f.f0(sVar, o14, hVar2);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar3);
        }
        tb.f.f0(sVar, X2, hVar4);
        ve.h.a(new rm1.d(new rm1.f(state.f141352a, rm1.i.LG), state.f141353b, null, 0, null, 28), null, null, sVar, 8, 6);
        sVar.r(true);
        androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, com.bumptech.glide.d.A(eo1.c.space_200, sVar)), sVar);
        dl2.b.c(new rn1.a(state.f141354c, null, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097130), null, null, null, sVar, 8, 14);
        sVar.r(true);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 14, state, qVar2, function02);
        }
    }

    public static void c0(bt0.j jVar, uk1.e eVar) {
        jVar.F0 = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(h4.f0 r37, u2.q r38, u50.i0 r39, boolean r40, kotlin.jvm.functions.Function1 r41, w1.k1 r42, w1.j1 r43, i2.o r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.a1.d(h4.f0, u2.q, u50.i0, boolean, kotlin.jvm.functions.Function1, w1.k1, w1.j1, i2.o, int, int):void");
    }

    public static void d0(e60.d dVar, uk1.e eVar) {
        dVar.Z0 = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(java.lang.String r44, u2.q r45, u50.i0 r46, u50.i0 r47, u50.i0 r48, int r49, kotlin.jvm.functions.Function1 r50, w1.k1 r51, w1.j1 r52, i2.o r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.a1.e(java.lang.String, u2.q, u50.i0, u50.i0, u50.i0, int, kotlin.jvm.functions.Function1, w1.k1, w1.j1, i2.o, int, int):void");
    }

    public static void e0(e60.d dVar, yk1.v vVar) {
        dVar.f57487a1 = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(s1.o0 r35, u2.q r36, p1.x0 r37, s1.p r38, int r39, float r40, u2.d r41, m1.o3 r42, boolean r43, boolean r44, kotlin.jvm.functions.Function1 r45, m3.a r46, n1.n r47, kl2.m r48, i2.o r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.a1.f(s1.o0, u2.q, p1.x0, s1.p, int, float, u2.d, m1.o3, boolean, boolean, kotlin.jvm.functions.Function1, m3.a, n1.n, kl2.m, i2.o, int, int, int):void");
    }

    public static void f0(fk0.k kVar, i92.k kVar2) {
        kVar.B0 = kVar2;
    }

    public static final void g(uc0.n1 n1Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1331977793);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(n1Var)) ? 4 : 2) | i13;
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
                androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                androidx.lifecycle.l1 v03 = c3.v0(uc0.n1.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                n1Var = (uc0.n1) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(n1Var.f121825e, sVar);
            n1Var.i(new uc0.i(new oc0.a(q2.i.c(1086532361, new androidx.compose.foundation.lazy.layout.v(20, z13, n1Var), sVar))));
            gh0.b.d(((uc0.m1) z13.getValue()).f121829b, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(n1Var, i13, i14, 15);
        }
    }

    public static boolean g0(Throwable th3) {
        return d7.n0.f53866a == 34 && (th3 instanceof NoSuchMethodError) && th3.getMessage() != null && th3.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static final void h(int i13, i2.o oVar, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-233971037);
        int i16 = 2;
        if ((i14 & 14) == 0) {
            i15 = (sVar.f(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            dl2.b.c(new rn1.a(new u50.k0(new String[]{String.valueOf(i13)}, qa0.f.text_field_character_limit_subtext), vn1.c.ERROR, null, null, vn1.g.BODY_100, 0, null, null, null, new rm1.d(new rm1.f(rm1.q.WORKFLOW_STATUS_PROBLEM), rm1.c.ERROR, null, 0, null, 28), false, 0, null, null, null, false, null, null, 2096620), null, null, null, sVar, 8, 14);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.a(i13, i14, i16);
        }
    }

    public static boolean h0(Throwable th3) {
        return d7.n0.f53866a == 34 && (th3 instanceof NoSuchMethodError) && th3.getMessage() != null && th3.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static ad2 i(nm.u json) {
        Intrinsics.checkNotNullParameter(json, "json");
        ad2 ad2Var = null;
        try {
            String a13 = k41.a(json, "click_string", "");
            String a14 = k41.a(json, "report_url", "");
            int i13 = 0;
            boolean a15 = k41.a(json, "non_malicious_reporting_enabled", false);
            boolean a16 = k41.a(json, "protection_enabled", false);
            nm.q d2 = k41.d(json, "allowed_headers");
            ArrayList arrayList = new ArrayList();
            if (d2 != null) {
                Iterator it = d2.f91364a.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    nm.s sVar = (nm.s) next;
                    Intrinsics.f(sVar);
                    String p13 = sVar.p();
                    if (p13 != null) {
                        arrayList.add(p13);
                    }
                    i13 = i14;
                }
            }
            ad2Var = new ad2(a13, a14, a15, a16, arrayList);
        } catch (Exception e13) {
            List list = c0.d.f(e13, e13).f6994p;
            String message = e13.getMessage();
            if (message == null) {
                message = e13.getClass().getName();
            }
            list.add(message);
        }
        return ad2Var == null ? new ad2() : ad2Var;
    }

    public static Drawable i0(Context context, int i13, Resources.Theme theme) {
        if (theme != null) {
            m.e eVar = new m.e(context, theme);
            eVar.a(theme.getResources().getConfiguration());
            context = eVar;
        }
        return com.bumptech.glide.c.I(context, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qh1 j(sb2 rootTraceCreator, ss2 traceMetaSet, th1 nativeAdUtil, View view, Map assetViews, ImageView.ScaleType mediaviewScaleType) {
        qh1 qh1Var;
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(nativeAdUtil, "nativeAdUtil");
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaviewScaleType, "mediaviewScaleType");
        il0 il0Var = il0.CUI_NAME_NATIVE_AD_SIGNAL;
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        if (qs2.b().f9801a == null) {
            p12 a13 = sb2.a(rootTraceCreator, il0Var, q0Var, traceMetaSet);
            try {
                qh1 qh1Var2 = new qh1(nativeAdUtil.a(view, mediaviewScaleType, assetViews), nativeAdUtil.c(view), th1.b(view), nativeAdUtil.a(view), nativeAdUtil.a());
                if (qh1Var2 instanceof jk0) {
                    ft2.a((jk0) qh1Var2);
                }
                dl2.b.J(a13, null);
                qh1Var = qh1Var2;
            } catch (Throwable th3) {
                try {
                    a13.b(th3);
                    if (th3 instanceof jf) {
                        throw th3;
                    }
                    a13.a(th3);
                    if (th3 instanceof TimeoutCancellationException) {
                        throw new xl0(th3);
                    }
                    if (th3 instanceof CancellationException) {
                        throw new yj0(th3);
                    }
                    if (th3 instanceof uk0) {
                        throw th3;
                    }
                    throw new dk0(th3);
                } finally {
                }
            }
        } else {
            cs2 a14 = qs2.a(il0Var, q0Var, true);
            try {
                qh1 qh1Var3 = new qh1(nativeAdUtil.a(view, mediaviewScaleType, assetViews), nativeAdUtil.c(view), th1.b(view), nativeAdUtil.a(view), nativeAdUtil.a());
                if (qh1Var3 instanceof jk0) {
                    ft2.a((jk0) qh1Var3);
                }
                dl2.b.J(a14, null);
                qh1Var = qh1Var3;
            } catch (Throwable th4) {
                try {
                    a14.b(th4);
                    if (th4 instanceof jf) {
                        throw th4;
                    }
                    a14.a(th4);
                    if (th4 instanceof TimeoutCancellationException) {
                        throw new xl0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new yj0(th4);
                    }
                    if (th4 instanceof uk0) {
                        throw th4;
                    }
                    throw new dk0(th4);
                } finally {
                }
            }
        }
        return qh1Var;
    }

    public static boolean j0(View view, DragEvent dragEvent) {
        Activity activity;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && q5.v0.g(view) != null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? androidx.appcompat.widget.b0.a(dragEvent, (TextView) view, activity) : androidx.appcompat.widget.b0.b(dragEvent, view, activity);
            }
        }
        return false;
    }

    public static void k(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static boolean k0(TextView textView, int i13) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 31 || q5.v0.g(textView) == null || !(i13 == 16908322 || i13 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            q5.d cVar = i14 >= 31 ? new q5.c(primaryClip, 1) : new q5.e(primaryClip, 1);
            cVar.e(i13 != 16908322 ? 1 : 0);
            q5.v0.k(textView, cVar.build());
        }
        return true;
    }

    public static final void l(Fragment fragment, jm0.e eVar) {
        androidx.lifecycle.z viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new jm0.l(fragment, eVar, null), 3);
    }

    public static void m(x92.b bVar) {
        bVar.e("diditimage.user_did_it_data()");
        bVar.h("userdiditdata.images", "1080x");
        bVar.e("userdiditdata.id");
        n60.o.w(bVar, "userdiditdata.user()", "userdiditdata.done_at", "userdiditdata.pin()", "userdiditdata.details");
        n60.o.w(bVar, "pin.id", "user.id", "user.full_name", "user.image_medium_url");
        bVar.e("user.image_large_url");
        bVar.e("user.image_xlarge_url");
    }

    public static void n(x92.b bVar) {
        df.j1.g(bVar);
        r.m(bVar, false);
        bVar.e("pin.did_it_disabled");
        bVar.e("pin.comments_disabled");
        n60.o.w(bVar, "pin.is_eligible_for_aggregated_comments", "pin.is_whitelisted_for_tried_it", "pin.can_delete_did_it_and_comments", "pin.section()");
        n60.o.w(bVar, "boardsection.title", "boardsection.id", "board.layout", "pin.origin_pinner()");
        n60.o.w(bVar, "user.shopping_rec_disabled", "pin.shopping_rec_disabled", "pin.is_call_to_create", "pin.call_to_create_source_pin()");
        bVar.e("pin.call_to_create_responses_count");
        bVar.e("pin.call_to_create_responses_preview_image_urls");
    }

    public static k0.a n0(byte[] bArr) {
        UUID[] uuidArr;
        d7.d0 d0Var = new d7.d0(bArr);
        if (d0Var.f53808c < 32) {
            return null;
        }
        d0Var.K(0);
        int a13 = d0Var.a();
        int k13 = d0Var.k();
        if (k13 != a13) {
            d7.u.g("PsshAtomUtil", "Advertised atom size (" + k13 + ") does not match buffer size: " + a13);
            return null;
        }
        int k14 = d0Var.k();
        if (k14 != 1886614376) {
            cb.t("Atom type is not pssh: ", k14, "PsshAtomUtil");
            return null;
        }
        int d2 = j9.e.d(d0Var.k());
        if (d2 > 1) {
            cb.t("Unsupported pssh version: ", d2, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(d0Var.s(), d0Var.s());
        if (d2 == 1) {
            int C = d0Var.C();
            uuidArr = new UUID[C];
            for (int i13 = 0; i13 < C; i13++) {
                uuidArr[i13] = new UUID(d0Var.s(), d0Var.s());
            }
        } else {
            uuidArr = null;
        }
        int C2 = d0Var.C();
        int a14 = d0Var.a();
        if (C2 != a14) {
            d7.u.g("PsshAtomUtil", "Atom data size (" + C2 + ") does not match the bytes left: " + a14);
            return null;
        }
        byte[] bArr2 = new byte[C2];
        d0Var.i(bArr2, 0, C2);
        k0.a aVar = new k0.a();
        aVar.f77778b = uuid;
        aVar.f77777a = d2;
        aVar.f77779c = bArr2;
        aVar.f77780d = uuidArr;
        return aVar;
    }

    public static ok.x o(ok.w wVar, g7.m mVar) {
        wVar.getClass();
        return new ok.x(Arrays.asList(wVar, mVar));
    }

    public static byte[] o0(UUID uuid, byte[] bArr) {
        k0.a n03 = n0(bArr);
        if (n03 == null) {
            return null;
        }
        if (uuid.equals((UUID) n03.f77778b)) {
            return (byte[]) n03.f77779c;
        }
        d7.u.g("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + ((UUID) n03.f77778b) + ".");
        return null;
    }

    public static void p(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non- @Provides method");
        }
    }

    public static UUID p0(byte[] bArr) {
        k0.a n03 = n0(bArr);
        if (n03 == null) {
            return null;
        }
        return (UUID) n03.f77778b;
    }

    public static byte[] q(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static final void q0(String str) {
        try {
            jf.a aVar = new jf.a(str);
            if (aVar.f75856b == null || aVar.f75857c == null) {
                return;
            }
            m0.Z0(aVar.f75855a, aVar.toString());
        } catch (Exception unused) {
        }
    }

    public static void r(z9.c0 c0Var, String str, q2.h hVar) {
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        z9.s0 s0Var = c0Var.f141172g;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(ba.i.class, "navigatorClass");
        ba.h destination = new ba.h((ba.i) s0Var.b(g4.u.n0(ba.i.class)), hVar);
        destination.p(str);
        Iterator<E> it = q0Var.iterator();
        if (it.hasNext()) {
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
        Iterator<E> it2 = q0Var.iterator();
        while (it2.hasNext()) {
            destination.b((z9.w) it2.next());
        }
        destination.f22265l = null;
        destination.f22266m = null;
        destination.f22267n = null;
        destination.f22268o = null;
        Intrinsics.checkNotNullParameter(destination, "destination");
        c0Var.f141174i.add(destination);
    }

    public static void r0(rg0.n nVar, IdeaPinCreationEducationOnboardingView educationOnboardingView, FrameLayout spotlightView, String str) {
        Intrinsics.checkNotNullParameter(educationOnboardingView, "educationOnboardingView");
        Intrinsics.checkNotNullParameter(spotlightView, "spotlightView");
        bs1.c.U1(educationOnboardingView);
        Intrinsics.checkNotNullParameter(spotlightView, "spotlightView");
        educationOnboardingView.f46529c.h(educationOnboardingView.f46533g);
        int i13 = (int) (0 * hf0.b.f69001a);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f80426a = (Math.min(spotlightView.getWidth(), spotlightView.getHeight()) / 2) + i13;
        spotlightView.addOnLayoutChangeListener(new tu0.e(spotlightView, nVar, educationOnboardingView, str, i13, h0Var));
        educationOnboardingView.setOnClickListener(new zp.y0(educationOnboardingView, nVar, null, 13));
    }

    public static final androidx.lifecycle.m1 s(Fragment fragment, rl2.d viewModelClass, Function0 storeProducer, Function0 extrasProducer, Function0 function0) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        return new androidx.lifecycle.m1(viewModelClass, storeProducer, function0, extrasProducer);
    }

    public static final void s0(FragmentActivity activity, ye2.m context, tt0.d0 onDiscardCallback, tt0.d0 onDismissCallback) {
        yb0.n a13;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onDiscardCallback, "onDiscardCallback");
        Intrinsics.checkNotNullParameter(onDismissCallback, "onDismissCallback");
        int i13 = yb0.n.f138503p;
        String string = activity.getString(aq1.h.idea_pin_camera_discard_clips_modal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(aq1.h.idea_pin_camera_discard_clips_modal_subtitle);
        String string3 = activity.getString(aq1.h.idea_pin_discard_button);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = activity.getString(aq1.h.idea_pin_keep_recording);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        a13 = xa0.j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new ca0.b0(19, onDiscardCallback), (r20 & 64) != 0 ? yb0.k.f138492k : new ca0.b0(20, onDismissCallback), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        w(activity, a13);
    }

    public static Bitmap t(byte[] bArr, int i13) {
        int i14 = 0;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i13, null);
        if (decodeByteArray == null) {
            throw ParserException.a("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            k6.g gVar = new k6.g(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (gVar.f(1, "Orientation")) {
                case 3:
                case 4:
                    i14 = RecyclerViewTypes.VIEW_TYPE_BUBBLE_CATEGORY_REP;
                    break;
                case 5:
                case 8:
                    i14 = RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF;
                    break;
                case 6:
                case 7:
                    i14 = 90;
                    break;
            }
            if (i14 == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i14);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th3) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final void t0(FragmentActivity activity, Context context, mu0.i confirmCallback, mu0.h onCancelCallback) {
        yb0.n a13;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(confirmCallback, "confirmCallback");
        Intrinsics.checkNotNullParameter(onCancelCallback, "onCancelCallback");
        int i13 = yb0.n.f138503p;
        String string = activity.getString(aq1.h.idea_pin_drafts_deletion_modal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(aq1.h.pin_drafts_deletion_modal_subtitle);
        String string3 = activity.getString(aq1.h.idea_pin_drafts_deletion_modal_confirm_button);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = activity.getString(aq1.h.idea_pin_drafts_deletion_modal_cancel_button);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        a13 = xa0.j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new ca0.b0(21, confirmCallback), (r20 & 64) != 0 ? yb0.k.f138492k : new ca0.b0(22, onCancelCallback), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        w(activity, a13);
    }

    public static tq u() {
        return new tq(0L, 0L, null, null, 12, null);
    }

    public static final void u0(FragmentActivity activity, Context context, ev0.i onRemoveCallback) {
        yb0.n a13;
        ev0.k onDismissCallback = ev0.k.f60264j;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onRemoveCallback, "onRemoveCallback");
        Intrinsics.checkNotNullParameter(onDismissCallback, "onDismissCallback");
        int i13 = yb0.n.f138503p;
        String string = activity.getString(aq1.h.idea_pin_board_not_found_metadata_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(aq1.h.idea_pin_board_not_found_metadata_description);
        String string3 = activity.getString(aq1.h.idea_pin_board_not_found_remove_sticker);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = activity.getString(aq1.h.idea_pin_board_not_found_keep_editing);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        a13 = xa0.j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new ca0.b0(23, onRemoveCallback), (r20 & 64) != 0 ? yb0.k.f138492k : new ca0.b0(24, onDismissCallback), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        w(activity, a13);
    }

    public static final rq v(uq overlayType) {
        Intrinsics.checkNotNullParameter(overlayType, "overlayType");
        return new rq(cb.g("toString(...)"), overlayType, overlayType == uq.STICKER ? "#00000000" : "#FFFFFF", null, null, 16, null);
    }

    public static final void v0(FragmentActivity activity, Context context, ev0.i onStoreCallback) {
        yb0.n a13;
        ev0.k onDismissCallback = ev0.k.f60265k;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onStoreCallback, "onStoreCallback");
        Intrinsics.checkNotNullParameter(onDismissCallback, "onDismissCallback");
        int i13 = yb0.n.f138503p;
        String string = activity.getString(dq1.f.disable_idea_pin_alert_modal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(dq1.f.disable_idea_pin_alert_modal_subtitle);
        String string3 = activity.getString(aq1.h.disable_idea_pin_alert_modal_confirm_button_text);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = activity.getString(dq1.f.disable_idea_pin_alert_modal_cancel_button_text);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        a13 = xa0.j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new ca0.b0(25, onStoreCallback), (r20 & 64) != 0 ? yb0.k.f138492k : new ca0.b0(26, onDismissCallback), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        w(activity, a13);
    }

    public static final void w(FragmentActivity fragmentActivity, yb0.n nVar) {
        ((AlertContainer) fragmentActivity.findViewById(dq1.c.alert_container)).c(nVar);
    }

    public static final void w0(FragmentActivity activity, Context context, Date scheduleDate, ev0.i onScheduledCallBack) {
        String Y;
        yb0.n a13;
        ev0.k onDismissCallback = ev0.k.f60266l;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scheduleDate, "scheduleDate");
        Intrinsics.checkNotNullParameter(onScheduledCallBack, "onScheduledCallBack");
        Intrinsics.checkNotNullParameter(onDismissCallback, "onDismissCallback");
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
        calendar2.setTime(scheduleDate);
        if (calendar.get(6) == calendar2.get(6)) {
            String string = activity.getString(p22.b.idea_pin_schedule_alert_title_today);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Y = df.j1.Y(string, new Object[]{new SimpleDateFormat("hh:mm a").format(scheduleDate)}, null, 6);
        } else {
            String string2 = activity.getString(p22.b.idea_pin_schedule_alert_title);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Y = df.j1.Y(string2, new Object[]{scheduleDate, new SimpleDateFormat("hh:mm a").format(scheduleDate)}, null, 6);
        }
        String str = Y;
        int i13 = yb0.n.f138503p;
        String string3 = activity.getString(p22.b.idea_pin_schedule_alert_subtitle);
        String string4 = activity.getString(p22.b.idea_pin_schedule_alert_schedule);
        String string5 = activity.getString(p22.b.idea_pin_schedule_alert_cancel);
        Intrinsics.f(string4);
        Intrinsics.f(string5);
        a13 = xa0.j.a(context, str, string3, string4, (r20 & 16) != 0 ? "" : string5, (r20 & 32) != 0 ? yb0.k.f138491j : new ca0.b0(27, onScheduledCallBack), (r20 & 64) != 0 ? yb0.k.f138492k : new ca0.b0(28, onDismissCallback), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        w(activity, a13);
    }

    public static final void x() {
        File[] listFiles;
        le.v vVar = le.v.f83104a;
        if (!le.o0.b() || df.j1.O0()) {
            return;
        }
        File y13 = m0.y();
        if (y13 == null) {
            listFiles = new File[0];
        } else {
            listFiles = y13.listFiles(new df.f0(5));
            Intrinsics.checkNotNullExpressionValue(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        }
        ArrayList arrayList = new ArrayList();
        int length = listFiles.length;
        int i13 = 0;
        while (i13 < length) {
            File file = listFiles[i13];
            i13++;
            Intrinsics.checkNotNullParameter(file, "file");
            jf.a aVar = new jf.a();
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "file.name");
            aVar.f75855a = name;
            JSONObject M0 = m0.M0(name);
            if (M0 != null) {
                aVar.f75857c = Long.valueOf(M0.optLong("timestamp", 0L));
                aVar.f75856b = M0.optString("error_message", null);
            }
            if (aVar.f75856b != null && aVar.f75857c != null) {
                arrayList.add(aVar);
            }
        }
        kotlin.collections.j0.t(arrayList, new v.j2(24));
        JSONArray jSONArray = new JSONArray();
        for (int i14 = 0; i14 < arrayList.size() && i14 < 1000; i14++) {
            jSONArray.put(arrayList.get(i14));
        }
        m0.N0("error_reports", jSONArray, new le.c(arrayList, 3));
    }

    public static final void x0(FragmentActivity activity, Context context, String brandName, boolean z13, om0.m1 confirmCallback, tv0.f cancelCallback) {
        yb0.n a13;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(confirmCallback, "confirmCallback");
        Intrinsics.checkNotNullParameter(cancelCallback, "cancelCallback");
        int i13 = yb0.n.f138503p;
        String d2 = z13 ? bs1.c.d2(activity, aq1.h.idea_pin_metadata_paid_partnership_tag_modal_title) : bs1.c.d2(activity, aq1.h.idea_pin_metadata_paid_partnership_tag_title);
        String e23 = z13 ? bs1.c.e2(activity, aq1.h.idea_pin_metadata_paid_partnership_tag_modal_subtitle_new, brandName) : bs1.c.e2(activity, aq1.h.idea_pin_metadata_paid_partnership_tag_modal_subtitle, brandName);
        String d23 = z13 ? bs1.c.d2(activity, aq1.h.idea_pin_metadata_paid_partnership_tag_modal_confirm_new) : bs1.c.d2(activity, aq1.h.idea_pin_metadata_paid_partnership_tag_modal_confirm);
        String string = activity.getString(aq1.h.idea_pin_metadata_paid_partnership_modal_cancel);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a13 = xa0.j.a(context, d2, e23, d23, (r20 & 16) != 0 ? "" : string, (r20 & 32) != 0 ? yb0.k.f138491j : new ca0.b0(29, confirmCallback), (r20 & 64) != 0 ? yb0.k.f138492k : new uv0.f(0, cancelCallback), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        w(activity, a13);
    }

    public static byte[] y(g7.f fVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        g7.y yVar = new g7.y(fVar);
        Collections.emptyMap();
        Uri parse = Uri.parse(str);
        bf.b.x(parse, "The uri must be set.");
        g7.i iVar = new g7.i(parse, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i13 = 0;
        g7.i iVar2 = iVar;
        while (true) {
            try {
                g7.g gVar = new g7.g(yVar, iVar2);
                try {
                    return qk.e.b(gVar);
                } catch (HttpDataSource$InvalidResponseCodeException e13) {
                    try {
                        int i14 = e13.f18780d;
                        String str2 = null;
                        if ((i14 == 307 || i14 == 308) && i13 < 5 && (map2 = e13.f18781e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(0);
                        }
                        if (str2 == null) {
                            throw e13;
                        }
                        i13++;
                        g7.h a13 = iVar2.a();
                        a13.f63776a = Uri.parse(str2);
                        iVar2 = a13.a();
                    } finally {
                        d7.n0.g(gVar);
                    }
                }
            } catch (Exception e14) {
                throw new MediaDrmCallbackException(iVar, yVar.f63853c, yVar.f63851a.e(), yVar.f63852b, e14);
            }
        }
    }

    public static final void y0(FragmentActivity activity, Context context, String brandName, dv0.m confirmCallback, dv0.m onCancelCallback) {
        yb0.n a13;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(confirmCallback, "confirmCallback");
        Intrinsics.checkNotNullParameter(onCancelCallback, "onCancelCallback");
        int i13 = yb0.n.f138503p;
        String string = activity.getString(aq1.h.idea_pin_metadata_paid_partnership_untag_modal_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(aq1.h.idea_pin_metadata_paid_partnership_untag_modal_subtitle, brandName);
        String string3 = activity.getString(aq1.h.idea_pin_metadata_paid_partnership_untag_modal_confirm);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = activity.getString(aq1.h.idea_pin_metadata_paid_partnership_modal_cancel);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        a13 = xa0.j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new uv0.f(1, confirmCallback), (r20 & 64) != 0 ? yb0.k.f138492k : new uv0.f(2, onCancelCallback), (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        a13.f138517n = false;
        w(activity, a13);
    }

    public static final float z(g6 g6Var) {
        float intValue = g6Var != null ? g6Var.f().intValue() : 0.0f;
        float intValue2 = g6Var != null ? g6Var.e().intValue() : 0.0f;
        if (intValue <= 0.0f || intValue2 <= 0.0f) {
            return 1.0f;
        }
        return intValue / intValue2;
    }

    public static final void z0(FragmentActivity activity, Context context, Function0 confirmCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(confirmCallback, "confirmCallback");
        AlertContainer alertContainer = (AlertContainer) activity.findViewById(dq1.c.alert_container);
        yb0.n nVar = new yb0.n(context);
        String string = nVar.getResources().getString(aq1.h.idea_pin_trim_alert_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        nVar.w(string);
        String string2 = nVar.getResources().getString(aq1.h.idea_pin_trim_alert_subtitle_non_multipage, 5);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        nVar.u(string2);
        String string3 = nVar.getResources().getString(aq1.h.idea_pin_trim_alert_confirmation_non_multipage);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        nVar.q(string3);
        nVar.o(false);
        nVar.f138513j = new rq.t0(16, confirmCallback);
        if (alertContainer != null) {
            alertContainer.c(nVar);
        }
    }

    public abstract void l0(int i13);

    public abstract void m0(Typeface typeface);
}
