package kh2;

import ads_mobile_sdk.il;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.foundation.layout.FillElement;
import c2.d6;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.pinterest.api.model.aq0;
import com.pinterest.api.model.cl;
import com.pinterest.api.model.e40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.iq0;
import com.pinterest.api.model.jq0;
import com.pinterest.api.model.lh0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.yl0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.radioGroup.GestaltRadio;
import com.pinterest.pushnotification.logging.NotificationsKibanaLogger$Log$Payload;
import com.pinterest.repository.pin.PinService;
import com.pinterest.ui.imageview.WebImageView;
import h32.d4;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.f4;
import lh0.j4;
import lh0.o4;
import lh0.x3;
import oi.a4;
import oi.y3;
import okhttp3.OkHttpClient;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.chromium.net.NetError;
import so.r8;
import so.u5;

/* loaded from: classes4.dex */
public abstract class d {
    public static final String A(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        cl T0 = v7Var.T0();
        if (T0 != null) {
            return T0.g();
        }
        return null;
    }

    public static final boolean A0(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        return v7Var.A0() != null;
    }

    public static final j32.c B(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        cl T0 = v7Var.T0();
        if (T0 == null) {
            return null;
        }
        Integer h10 = T0.h();
        j32.a aVar = j32.c.Companion;
        int intValue = h10.intValue();
        aVar.getClass();
        if (intValue == 0) {
            return j32.c.FEATURED_CREATOR;
        }
        return null;
    }

    public static final boolean B0(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        return kotlin.text.z.i(v7Var.i1(), "AUTOMAGICAL", true);
    }

    public static final String C(int i13) {
        long c13 = ml2.c.c(i13 / pb0.i.SECONDS.getMilliseconds());
        pb0.i iVar = pb0.i.MINUTES;
        long seconds = c13 % iVar.getSeconds();
        long seconds2 = (c13 / iVar.getSeconds()) % iVar.getSeconds();
        long seconds3 = c13 / pb0.i.HOURS.getSeconds();
        return seconds3 > 0 ? t3.s1.d(new Object[]{Long.valueOf(seconds3), Long.valueOf(seconds2), Long.valueOf(seconds)}, 3, "%d:%02d:%02d", "format(...)") : t3.s1.d(new Object[]{Long.valueOf(seconds2), Long.valueOf(seconds)}, 2, "%d:%02d", "format(...)");
    }

    public static final boolean C0(v7 v7Var, y22.c... actions) {
        List L0;
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        Intrinsics.checkNotNullParameter(actions, "actions");
        ArrayList arrayList = new ArrayList(actions.length);
        for (y22.c cVar : actions) {
            arrayList.add(Integer.valueOf(cVar.getValue()));
        }
        if (!v7Var.H0()) {
            return false;
        }
        Boolean G0 = v7Var.G0();
        Intrinsics.checkNotNullExpressionValue(G0, "getCollaboratedByMe(...)");
        return G0.booleanValue() && v7Var.M0() && (L0 = v7Var.L0()) != null && L0.containsAll(arrayList);
    }

    public static String D(int i13) {
        ArrayList arrayList = new ArrayList();
        if ((i13 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i13 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i13 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static final boolean D0(String str, v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        String T0 = T0(v7Var);
        if (T0 == null) {
            T0 = "";
        }
        if (!Intrinsics.d(str, T0)) {
            Boolean G0 = v7Var.G0();
            Intrinsics.checkNotNullExpressionValue(G0, "getCollaboratedByMe(...)");
            if (G0.booleanValue()) {
                Boolean K0 = v7Var.K0();
                Intrinsics.checkNotNullExpressionValue(K0, "getCollaboratorInvitesEnabled(...)");
                if (K0.booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    public static final HashMap E(vh vhVar) {
        String h43;
        Intrinsics.checkNotNullParameter(vhVar, "<this>");
        if (vhVar.f42859q == null) {
            HashMap hashMap = new HashMap();
            String uid = vhVar.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            hashMap.put("story_id", uid);
            String q13 = vhVar.q();
            Intrinsics.checkNotNullExpressionValue(q13, "getStoryType(...)");
            hashMap.put("story_type", q13);
            String str = vhVar.f42852j;
            if (str != null) {
                Intrinsics.checkNotNullExpressionValue(str, "getContentIds(...)");
                hashMap.put("content_ids", str);
            }
            vhVar.f42859q = hashMap;
        }
        if (vhVar.q() != null && Intrinsics.d(vhVar.q(), "shop_brand_story")) {
            HashMap hashMap2 = vhVar.f42859q;
            Intrinsics.checkNotNullExpressionValue(hashMap2, "getAuxData(...)");
            Intrinsics.checkNotNullParameter(vhVar, "<this>");
            List list = vhVar.f42865w;
            Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
            Object U = CollectionsKt.U(0, list);
            String str2 = null;
            f30 f30Var = U instanceof f30 ? (f30) U : null;
            if (f30Var != null && (h43 = f30Var.h4()) != null) {
                nm.u uVar = new nm.u();
                uVar.u("domain", h43);
                str2 = uVar.toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            hashMap2.put("commerce_data", str2);
        }
        HashMap hashMap3 = vhVar.f42859q;
        Intrinsics.checkNotNullExpressionValue(hashMap3, "getAuxData(...)");
        return hashMap3;
    }

    public static final boolean E0(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        return kotlin.text.z.i(v7Var.i1(), "FEATURED_BOARD", true);
    }

    public static final String F(uk1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (dVar.j() == d4.SEARCH) {
            return dVar.f122382d;
        }
        return null;
    }

    public static final boolean F0(ue ueVar) {
        Intrinsics.checkNotNullParameter(ueVar, "<this>");
        List G = ueVar.G();
        int size = G != null ? G.size() : 0;
        List A = ueVar.A();
        return size + (A != null ? A.size() : 0) > 2;
    }

    public static final String G(Resources resources, long j13) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        long j14 = (j13 + 500) / 1000;
        long j15 = 60;
        long j16 = j14 % j15;
        long j17 = (j14 / j15) % j15;
        long j18 = j14 / 3600;
        StringBuilder sb3 = new StringBuilder();
        if (j18 > 0) {
            int i13 = (int) j18;
            sb3.append(resources.getQuantityString(pb0.e.plural_hour_normal, i13, Integer.valueOf(i13)));
            sb3.append(" ");
        }
        if (j17 > 0) {
            int i14 = (int) j17;
            sb3.append(resources.getQuantityString(pb0.e.plural_minute_normal, i14, Integer.valueOf(i14)));
            sb3.append(" ");
        }
        if (j16 > 0) {
            int i15 = (int) j16;
            sb3.append(resources.getQuantityString(pb0.e.plural_second_normal, i15, Integer.valueOf(i15)));
        }
        return StringsKt.i0(sb3).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean G0(z40.n r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List r1 = r3.h()
            r2 = 0
            if (r1 == 0) goto L11
            int r1 = r1.size()
            goto L12
        L11:
            r1 = r2
        L12:
            z40.m r3 = r3.g()
            if (r3 == 0) goto L36
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof z40.l
            if (r0 == 0) goto L22
            z40.l r3 = (z40.l) r3
            goto L23
        L22:
            r3 = 0
        L23:
            if (r3 == 0) goto L36
            z40.k r3 = r3.a()
            if (r3 == 0) goto L36
            java.util.List r3 = r3.a()
            if (r3 == 0) goto L36
            int r3 = r3.size()
            goto L37
        L36:
            r3 = r2
        L37:
            int r1 = r1 + r3
            r3 = 2
            if (r1 <= r3) goto L3c
            r2 = 1
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.d.G0(z40.n):boolean");
    }

    public static final ArrayList H(String str, List conversationUsers) {
        Intrinsics.checkNotNullParameter(conversationUsers, "conversationUsers");
        ArrayList arrayList = new ArrayList();
        for (Object obj : conversationUsers) {
            if (!Intrinsics.d(((z40.d0) obj).a(), str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((z40.d0) it.next());
        }
        return arrayList2;
    }

    public static final boolean H0(long j13) {
        return ((int) (j13 & 4294967295L)) != 0;
    }

    public static final ArrayList I(ue ueVar, wy0 wy0Var) {
        Intrinsics.checkNotNullParameter(ueVar, "<this>");
        List G = ueVar.G();
        if (G == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : G) {
            wy0 wy0Var2 = (wy0) obj;
            if (wy0Var != null) {
                Intrinsics.f(wy0Var2);
                if (!dl2.b.S1(wy0Var2, wy0Var.getUid())) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static final boolean I0(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        return kotlin.text.z.i(v7Var.i1(), "QUICK_CREATES", true);
    }

    public static final List J(z40.n nVar, String str) {
        z40.k a13;
        List a14;
        z40.i iVar;
        z40.i a15;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        z40.m g13 = nVar.g();
        if (g13 != null) {
            Intrinsics.checkNotNullParameter(g13, "<this>");
            z40.l lVar = g13 instanceof z40.l ? (z40.l) g13 : null;
            if (lVar != null && (a13 = lVar.a()) != null && (a14 = a13.a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : a14) {
                    z40.j jVar = (z40.j) obj;
                    if (!Intrinsics.d((jVar == null || (a15 = jVar.a()) == null) ? null : a15.a(), str)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    z40.j jVar2 = (z40.j) it.next();
                    if (jVar2 == null || (iVar = jVar2.a()) == null) {
                        iVar = null;
                    } else {
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                    }
                    if (iVar != null) {
                        arrayList2.add(iVar);
                    }
                }
                return arrayList2;
            }
        }
        return kotlin.collections.q0.f80391a;
    }

    public static final boolean J0(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        return kotlin.text.z.i(v7Var.i1(), "QUICK_SAVES", true);
    }

    public static final boolean K(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        cl T0 = v7Var.T0();
        Boolean j13 = T0 != null ? T0.j() : null;
        if (j13 == null) {
            return false;
        }
        return j13.booleanValue();
    }

    public static final boolean K0(z40.n nVar) {
        Integer i13;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar.i() == null || ((i13 = nVar.i()) != null && i13.intValue() == 0);
    }

    public static final String L(v7 v7Var) {
        sr srVar;
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        Map Q0 = v7Var.Q0();
        if (Q0 == null || (srVar = (sr) Q0.get("60x60")) == null) {
            return null;
        }
        return srVar.j();
    }

    public static final boolean L0(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        return kotlin.text.z.i(v7Var.i1(), "screenshot", true);
    }

    public static void M(l81.l lVar, ni0.e eVar) {
        lVar.f82150b1 = eVar;
    }

    public static final boolean M0(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        return kotlin.text.z.i(v7Var.o1(), "secret", true);
    }

    public static void N(l81.l lVar, ax.a aVar) {
        lVar.Z0 = aVar;
    }

    public static od2.b N0() {
        return new od2.b("lavaLamp", "vec3 {{name}}(VertexEffectInput data) {\n    float time = {{settings.speed}} * data.time;\n\n    vec2 uv = data.texturePosition;\n    float angle = 0.35 * PI * sin(PI * uv.y + time) * (uv.x - 0.5);\n\n    return rotate3D(data.position, vec3(0, 1, 0), angle);\n}", new pd2.q0(kotlin.collections.y0.b(new Pair("speed", ld2.a.f82993a))));
    }

    public static void O(l81.l lVar, vy.m mVar) {
        lVar.f82155e1 = mVar;
    }

    public static final void O0(String attributeKey, String attributeValue) {
        Intrinsics.checkNotNullParameter(attributeKey, "attributeKey");
        Intrinsics.checkNotNullParameter(attributeValue, "attributeValue");
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        hVar.getClass();
        hVar.h(df.j1.T("RichPushNotificationError: %s %s", attributeKey, attributeValue));
    }

    public static void P(do0.b bVar, yk1.a aVar) {
        bVar.C0 = aVar;
    }

    public static final void P0(vy.m analyticsApi, String userId, h32.f1 eventType, rz1.c cVar) {
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(userId, "userId");
        rz1.a metadata = new rz1.a(userId, null, 2, null);
        NotificationsKibanaLogger$Log$Payload payload = new NotificationsKibanaLogger$Log$Payload(eventType.toString(), String.valueOf(cVar.f110239a), String.valueOf(cVar.f110240b), String.valueOf(cVar.f110241c));
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(payload, "payload");
        rz1.b bVar = new rz1.b("android_notifications_event", metadata, payload, null, null, 0L, 56, null);
        ms0.b bVar2 = new ms0.b();
        bVar2.b(bVar);
        analyticsApi.i(bVar2, ox.a.f97979i);
    }

    public static void Q(j51.e eVar, so.f2 f2Var) {
        eVar.A0 = f2Var;
    }

    public static final la0.l0 Q0(la0.m1 m1Var, h32.u0 elementType, h32.f1 eventType) {
        Intrinsics.checkNotNullParameter(m1Var, "<this>");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return new la0.l0(new zy.f0(new zy.a(com.bumptech.glide.d.z0(m1Var.f82433f.f143086a, new la0.l1(elementType, 0)), eventType, null, null, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN)));
    }

    public static void R(do0.b bVar, u5 u5Var) {
        bVar.A0 = u5Var;
    }

    public static void R0(f30 pin, ts.a newSize, int i13) {
        sr srVar;
        ts.a oldSize = ts.a.SIZE345x;
        if ((i13 & 4) != 0) {
            newSize = ts.a.SIZE736x;
        }
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(oldSize, "oldSize");
        Intrinsics.checkNotNullParameter(newSize, "newSize");
        Map A4 = pin.A4();
        if (A4 == null || (srVar = (sr) A4.get(oldSize.getValue())) == null) {
            return;
        }
        String j13 = srVar.j();
        if (j13 != null) {
            kotlin.text.z.n(j13, oldSize.getValue(), newSize.getValue());
        }
        Map A42 = pin.A4();
        if (A42 != null) {
        }
    }

    public static void S(pu.j0 j0Var, z70.m mVar) {
        j0Var.f101357r0 = mVar;
    }

    public static final le.a0 S0(AccessToken accessToken, Uri imageUri, df.p1 p1Var) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        String path = imageUri.getPath();
        if (kotlin.text.z.i("file", imageUri.getScheme(), true) && path != null) {
            GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType = new GraphRequest$ParcelableResourceWithMimeType(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", graphRequest$ParcelableResourceWithMimeType);
            return new le.a0(accessToken, "me/staging_resources", bundle, le.f0.POST, p1Var);
        }
        if (!kotlin.text.z.i("content", imageUri.getScheme(), true)) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType2 = new GraphRequest$ParcelableResourceWithMimeType(imageUri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("file", graphRequest$ParcelableResourceWithMimeType2);
        return new le.a0(accessToken, "me/staging_resources", bundle2, le.f0.POST, p1Var);
    }

    public static void T(l81.l lVar, bf2.d dVar) {
        lVar.T0 = dVar;
    }

    public static final String T0(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        wy0 k13 = v7Var.k1();
        if (k13 != null) {
            return k13.getUid();
        }
        return null;
    }

    public static void U(pu.j0 j0Var) {
        j0Var.getClass();
    }

    public static final List U0(v7 v7Var) {
        Object obj;
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        Map d13 = v7Var.d1();
        if (d13 == null) {
            return kotlin.collections.q0.f80391a;
        }
        Iterator it = kotlin.collections.f0.j("750x", "345x", "236x", "200x", "150x150", "136x136").iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = (String) obj;
            if (d13.containsKey(str)) {
                Object obj2 = d13.get(str);
                Intrinsics.f(obj2);
                if (((List) obj2).size() > 0) {
                    break;
                }
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return kotlin.collections.q0.f80391a;
        }
        Object obj3 = d13.get(str2);
        Intrinsics.f(obj3);
        ArrayList<sr> arrayList = new ArrayList();
        for (Object obj4 : (Iterable) obj3) {
            String j13 = ((sr) obj4).j();
            if (!(j13 == null || kotlin.text.z.j(j13))) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        for (sr srVar : arrayList) {
            e40 e40Var = new e40();
            e40Var.h(srVar.j());
            e40Var.g(Integer.valueOf((int) srVar.h().doubleValue()));
            e40Var.j(Integer.valueOf((int) srVar.k().doubleValue()));
            arrayList2.add(e40Var);
        }
        return arrayList2;
    }

    public static void V(rh1.k kVar, qh1.e eVar) {
        kVar.E0 = eVar;
    }

    public static od2.b V0() {
        return new od2.b("pulse", "vec3 {{name}}(VertexEffectInput data) {\n    float time = 3.0 * {{settings.speed}} * data.time;\n    float amplitude = 0.16 * {{settings.strength}};\n    data.position.xy *= 1.0 + amplitude * (smoothstep(-1.0, 1.0, sin(time)) - 0.5);\n    return data.position;\n}", new pd2.q0(kotlin.collections.z0.g(new Pair("speed", ld2.a.f82993a), new Pair("strength", jq.b.n(1.0f, null, 0.0f, 2.0f)))));
    }

    public static void W(l81.l lVar, r8 r8Var) {
        lVar.f82159g1 = r8Var;
    }

    public static final int W0(int i13) {
        return (int) (i13 / Resources.getSystem().getDisplayMetrics().density);
    }

    public static void X(do0.b bVar, m60.f0 f0Var) {
        bVar.f55655z0 = f0Var;
    }

    public static void X0(rg0.s sVar, i32.y0 placement, Function1 onSubscribe, Function1 onRefreshed, Map map, int i13) {
        LinkedHashMap linkedHashMap;
        if ((i13 & 8) != 0) {
            map = null;
        }
        tg0.c sideEffect = new tg0.c(false, false);
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        Intrinsics.checkNotNullParameter(onRefreshed, "onRefreshed");
        Intrinsics.checkNotNullParameter(sideEffect, "sideEffect");
        if (map != null) {
            linkedHashMap = new LinkedHashMap(kotlin.collections.y0.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(((rg0.o) entry.getKey()).getValue(), entry.getValue());
            }
        } else {
            linkedHashMap = null;
        }
        jk2.v vVar = new jk2.v(((dh0.d) sVar).g(placement, linkedHashMap, sideEffect).H(tk2.e.f118017c).A(wj2.c.a()), new k90.i(28, onSubscribe), ck2.i.f27923c, 1);
        Intrinsics.checkNotNullExpressionValue(vVar, "doOnSubscribe(...)");
        nl.b.s(vVar, null, null, new b10.z(19, onRefreshed, placement), 3);
    }

    public static void Y(if1.b bVar, nr0.m mVar) {
        bVar.f72227h1 = mVar;
    }

    public static Object[] Y0(int i13, Object[] objArr) {
        if (objArr.length < i13) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i13);
        }
        if (objArr.length > i13) {
            objArr[i13] = null;
        }
        return objArr;
    }

    public static void Z(l81.l lVar, nr0.m mVar) {
        lVar.W0 = mVar;
    }

    public static od2.b Z0() {
        return new od2.b("rotation", "vec3 {{name}}(VertexEffectInput data) {\n    float multiplier = {{settings.clockwise}} ? -1.0 : 1.0;\n    float angle = multiplier * 0.5 * {{settings.speed}} * data.time;\n    vec3 position = data.position;\n\n    vec2 absPosition = position.xy * data.size;\n    absPosition = rotate2D(absPosition, angle);\n    position.xy = absPosition / data.size;\n\n    return position;\n}", new pd2.q0(kotlin.collections.z0.g(new Pair("speed", ld2.a.f82993a), new Pair("clockwise", new pd2.c(true)))));
    }

    public static final void a(List list, Function1 function1, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-335572373);
        rl2.g0.e(null, null, null, false, null, null, null, false, new u80.s(list, function1), sVar, 0, 255);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k1.z(list, function1, i13, 11);
        }
    }

    public static void a0(l81.l lVar, zf0.f fVar) {
        lVar.X0 = fVar;
    }

    public static final lh0 a1(v7 v7Var) {
        List k13;
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        lh0 t13 = v7Var.t1();
        if (t13 == null) {
            return t13;
        }
        if (t13.k() == null || (k13 = t13.k()) == null || k13.isEmpty()) {
            return null;
        }
        return t13;
    }

    public static final void b(u2.q qVar, uc0.d0 d0Var, i2.o oVar, int i13, int i14) {
        u2.q qVar2;
        int i15;
        uc0.d0 d0Var2;
        u2.q qVar3;
        u2.q qVar4;
        uc0.d0 d0Var3;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(216946190);
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
            d0Var3 = d0Var;
            qVar4 = qVar2;
        } else {
            sVar.S();
            int i18 = 0;
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
                    androidx.lifecycle.l1 v03 = c3.v0(uc0.d0.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                    sVar.r(false);
                    sVar.r(false);
                    qVar3 = qVar5;
                    d0Var2 = (uc0.d0) v03;
                } else {
                    d0Var2 = d0Var;
                    qVar3 = qVar5;
                }
            } else {
                sVar.Q();
                d0Var2 = d0Var;
                qVar3 = qVar2;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(d0Var2.f121825e, sVar);
            d0Var2.i(new uc0.i(new oc0.a(q2.i.c(617966150, new xb0.a(d0Var2, 6), sVar))));
            p1.y a14 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar, 0);
            int i19 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, qVar3);
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
            tb.f.f0(sVar, a14, s3.j.f110801e);
            tb.f.f0(sVar, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i19))) {
                ep.b.y(i19, sVar, i19, hVar);
            }
            tb.f.f0(sVar, X, s3.j.f110799c);
            int i23 = 1;
            g3.e(oc0.q.search_component, new tc0.m(d0Var2, i18), null, 0.0f, 0.0f, 0.0f, 0.0f, new tc0.l(d0Var2, i23), sVar, 0, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
            a(((uc0.y) z13.getValue()).f121883a, new tc0.m(d0Var2, i23), sVar, 8);
            sVar.r(true);
            qVar4 = qVar3;
            d0Var3 = d0Var2;
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 16, qVar4, d0Var3);
        }
    }

    public static void b0(if1.b bVar, x3 x3Var) {
        bVar.f72229j1 = x3Var;
    }

    public static final void b1(WebImageView imageView, View imageViewContainer, Function0 onImageSet, Function0 onImageFailed) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(imageViewContainer, "imageViewContainer");
        Intrinsics.checkNotNullParameter(onImageSet, "onImageSet");
        Intrinsics.checkNotNullParameter(onImageFailed, "onImageFailed");
        imageView.Y(new sw0.l(imageView, imageViewContainer, onImageSet, onImageFailed));
    }

    public static String c(il ilVar) {
        StringBuilder sb3 = new StringBuilder(ilVar.size());
        for (int i13 = 0; i13 < ilVar.size(); i13++) {
            byte b13 = ilVar.b(i13);
            if (b13 == 34) {
                sb3.append("\\\"");
            } else if (b13 == 39) {
                sb3.append("\\'");
            } else if (b13 != 92) {
                switch (b13) {
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
                        if (b13 < 32 || b13 > 126) {
                            sb3.append('\\');
                            sb3.append((char) (((b13 >>> 6) & 3) + 48));
                            sb3.append((char) (((b13 >>> 3) & 7) + 48));
                            sb3.append((char) ((b13 & 7) + 48));
                            break;
                        } else {
                            sb3.append((char) b13);
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

    public static void c0(l81.l lVar, o4 o4Var) {
        lVar.V0 = o4Var;
    }

    public static void c1(AudioTrack audioTrack, h1.b bVar) {
        audioTrack.setPreferredDevice(bVar == null ? null : (AudioDeviceInfo) bVar.f66449b);
    }

    public static void d(Context context, FrameLayout view, String str) {
        DisplayMetrics displayMetrics;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setClickable(false);
        view.setFocusable(false);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            Intrinsics.f(decode);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(decode, 0, decode.length));
            bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            view.setBackground(bitmapDrawable);
        } catch (IllegalArgumentException unused) {
        }
    }

    public static void d0(rh1.k kVar, lh0.m0 m0Var) {
        kVar.B0 = m0Var;
    }

    public static od2.b d1() {
        return new od2.b("shaky", "vec3 {{name}}(VertexEffectInput data) {\n    float time = fract({{settings.speed}} * data.time/1.5);\n\n    vec3 position = data.position;\n    position.x *= 1.0 - sin(8.0 * PI * smoothstep(0.4, 0.7, pow(time, 2.0))) * {{settings.strength}};\n    position.y *= 1.0 - sin(8.0 * PI * smoothstep(0.4, 0.7, pow(time + 0.03, 2.0))) * {{settings.strength}};\n\n    return position;\n}", new pd2.q0(kotlin.collections.z0.g(new Pair("speed", ld2.a.f82993a), new Pair("strength", jq.b.n(0.03f, null, 0.01f, 0.05f)))));
    }

    public static final void e(uc0.x xVar, Function1 function1, i2.o oVar, int i13) {
        int i14;
        i2.s sVar;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.Y(750894443);
        if ((i13 & 14) == 0) {
            i14 = (sVar2.h(xVar) ? 4 : 2) | i13;
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
            FillElement fillElement = androidx.compose.foundation.layout.e.f17184c;
            sVar2.W(-653072768);
            int i15 = 14;
            boolean z13 = ((i14 & 14) == 4) | ((i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 32);
            Object J2 = sVar2.J();
            if (z13 || J2 == i2.n.f71185a) {
                J2 = new b10.z(i15, function1, xVar);
                sVar2.g0(J2);
            }
            sVar2.r(false);
            u2.q q13 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.a.e(fillElement, false, null, (Function0) J2, 7), com.bumptech.glide.d.A(oc0.o.padding_page, sVar2), com.bumptech.glide.d.A(oc0.o.padding_list_item, sVar2), com.bumptech.glide.d.A(oc0.o.padding_page, sVar2), com.bumptech.glide.d.A(oc0.o.padding_list_item, sVar2));
            p1.y a13 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar2, 0);
            int i16 = sVar2.P;
            i2.z1 o13 = sVar2.o();
            u2.q X = ao2.m0.X(sVar2, q13);
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
            if (sVar2.O || !Intrinsics.d(sVar2.J(), Integer.valueOf(i16))) {
                ep.b.y(i16, sVar2, i16, hVar);
            }
            tb.f.f0(sVar2, X, s3.j.f110799c);
            d6.b(xVar.f121879a, null, 0L, w.r0(4294967296L, com.bumptech.glide.d.A(eo1.c.font_size_300, sVar2)), null, g4.l.f63472g, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar2, 196608, 0, 131030);
            d6.b(xVar.f121880b, null, 0L, w.r0(4294967296L, com.bumptech.glide.d.A(eo1.c.font_size_200, sVar2)), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar2, 0, 0, 131062);
            sVar = sVar2;
            sVar.r(true);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k1.z(xVar, function1, i13, 10);
        }
    }

    public static void e0(xy0.e eVar, lh0.j2 j2Var) {
        eVar.A0 = j2Var;
    }

    public static final boolean e1(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        boolean[] zArr = v7Var.f42764n0;
        if (zArr.length <= 54 || !zArr[54]) {
            return true;
        }
        Boolean v13 = v7Var.v1();
        Intrinsics.checkNotNullExpressionValue(v13, "getShouldShowBoardCollaborators(...)");
        return v13.booleanValue();
    }

    public static void f(x92.b bVar) {
        n60.o.w(bVar, "contactrequest.id", "contactrequest.board()", "contactrequest.read", "contactrequest.sender()");
        bVar.e("contactrequest.created_at");
        bVar.e("contactrequest.conversation()");
        bVar.e("contactrequest.type");
        j.k(bVar);
        gh0.b.A(bVar);
    }

    public static void f0(rh1.k kVar, pb0.d dVar) {
        kVar.f108202z0 = dVar;
    }

    public static od2.b f1() {
        return new od2.b("slide", "vec3 {{name}}(VertexEffectInput data) {\n    float time = 3.0 * {{settings.speed}} * data.time;\n    float amplitude = 0.2 * {{settings.strength}};\n\n    float shift = amplitude * (smoothstep(-1.0, 1.0, sin(time)) - 0.5);\n\n    if ({{settings.horizontal}}) {\n        data.position.x -= shift;\n    } else {\n        data.position.y -= shift;\n    }\n\n    return data.position;\n}", new pd2.q0(kotlin.collections.z0.g(new Pair("speed", ld2.a.f82993a), new Pair("strength", jq.b.n(1.0f, null, 0.0f, 2.0f)), new Pair("horizontal", new pd2.c(true)))));
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, Object obj, int i13, int i14) {
        for (Object obj2 : spannableStringBuilder.getSpans(i13, i14, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i13 && spannableStringBuilder.getSpanEnd(obj2) == i14 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i13, i14, 33);
    }

    public static void g0(xy0.e eVar, wy0.d dVar) {
        eVar.f136203z0 = dVar;
    }

    public static od2.b g1() {
        return new od2.b("swivel", "vec3 {{name}}(VertexEffectInput data) {\n    float time = 2.0 * {{settings.speed}} * data.time;\n    float stage = 2.0 * (smoothstep(-1.0, 1.0, sin(time)) - 0.5);\n    vec3 rotated = rotate3D(data.position, vec3(0.0, 1.0, 0.0), PI / 3.0 * stage);\n    return rotated;\n}", new pd2.q0(kotlin.collections.y0.b(new Pair("speed", ld2.a.f82993a))));
    }

    public static final void h(yq1.s2 s2Var, String str, String str2) {
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_EMAIL", str);
        if (df.j1.U0(str2)) {
            bundle.putString("com.pinterest.EXTRA_PIN_ID", str2);
        }
        s2Var.setArguments(bundle);
    }

    public static void h0(l81.l lVar, lh0.k2 k2Var) {
        lVar.f82154d1 = k2Var;
    }

    public static final List h1(v7 v7Var) {
        Object obj;
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        Map d13 = v7Var.d1();
        if (d13 == null) {
            return kotlin.collections.q0.f80391a;
        }
        Iterator it = kotlin.collections.f0.j("150x150", "136x136", "90x90").iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = (String) obj;
            if (d13.containsKey(str)) {
                Object obj2 = d13.get(str);
                Intrinsics.f(obj2);
                if (((List) obj2).size() > 0) {
                    break;
                }
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return kotlin.collections.q0.f80391a;
        }
        Object obj3 = d13.get(str2);
        Intrinsics.f(obj3);
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : (Iterable) obj3) {
            String j13 = ((sr) obj4).j();
            if (!(j13 == null || kotlin.text.z.j(j13))) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String j14 = ((sr) it2.next()).j();
            if (j14 == null) {
                j14 = "";
            }
            arrayList2.add(j14);
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Context context, iq0 iq0Var, TextView textView, boolean z13, String text, zf1.e fontManager, Map textViewFontMap, nx.d0 d0Var, int i13) {
        Integer num;
        int i14;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontManager, "fontManager");
        Intrinsics.checkNotNullParameter(textViewFontMap, "textViewFontMap");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        Integer num2 = null;
        if (iq0Var != null) {
            String l13 = iq0Var.l();
            if (l13 != null) {
                int parseColor = Color.parseColor(l13);
                Integer valueOf = Integer.valueOf(parseColor);
                textView.setTextColor(parseColor);
                num = valueOf;
            } else {
                num = null;
            }
            float doubleValue = (float) iq0Var.k().doubleValue();
            if (doubleValue == 0.0f) {
                doubleValue = z13 ? 48.0f : 36.0f;
            }
            float s22 = c0.d.s2(doubleValue, i13, context);
            String m13 = iq0Var.m();
            if (m13 != null) {
                float f13 = s22 / 5;
                kg.p.Y(textView, f13);
                i14 = 0;
                i15 = 5;
                spannableStringBuilder.setSpan(new uf1.b(context, Color.parseColor(m13), iq0Var.i(), f13, f13), 0, text.length(), 33);
            } else {
                i14 = 0;
                i15 = 5;
            }
            kg.p.P(context, textView, iq0Var.l(), iq0Var.m());
            Integer i17 = iq0Var.i();
            if (i17.intValue() == aq0.LEFT.getType()) {
                i16 = 3;
            } else {
                i16 = i17.intValue() == aq0.RIGHT.getType() ? i15 : 17;
            }
            Integer n13 = iq0Var.n();
            if (n13.intValue() == jq0.TOP.getType()) {
                i16 |= 48;
            } else {
                if (n13.intValue() == jq0.MIDDLE.getType()) {
                    i16 |= 16;
                } else {
                    if (n13.intValue() == jq0.BOTTOM.getType()) {
                        i16 |= 80;
                    }
                }
            }
            textView.setGravity(i16);
            yl0 j13 = iq0Var.j();
            int i18 = 27;
            if (j13 != null) {
                textView.setLineSpacing(0.0f, (float) j13.g().doubleValue());
                String i19 = j13.i();
                Intrinsics.checkNotNullExpressionValue(i19, "getUid(...)");
                Typeface c13 = fontManager.c(i19);
                if (c13 != null) {
                    textView.setTypeface(c13);
                    Unit unit = Unit.f80348a;
                } else {
                    if (textViewFontMap.get(j13.i()) == null) {
                        String i23 = j13.i();
                        Intrinsics.checkNotNullExpressionValue(i23, "getUid(...)");
                        textViewFontMap.put(i23, new ArrayList());
                    }
                    Object obj = textViewFontMap.get(j13.i());
                    Intrinsics.f(obj);
                    ((List) obj).add(textView);
                    Intrinsics.checkNotNullExpressionValue(tk2.e.f118017c.b(new ja.y(fontManager, j13, new OkHttpClient(), i18)), "run(...)");
                }
            }
            textView.setTextSize(i14, s22);
            int c14 = ml2.c.c(s22);
            if (Build.VERSION.SDK_INT >= 27) {
                textView.setAutoSizeTextTypeUniformWithConfiguration(1, c14, 1, i14);
            } else if (textView instanceof androidx.core.widget.b) {
                ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithConfiguration(1, c14, 1, i14);
            }
            num2 = num;
        }
        if (z13) {
            textView.setText(spannableStringBuilder);
            return;
        }
        textView.setMovementMethod((bf0.b) bf0.b.f22742a.getValue());
        if (d0Var == null) {
            textView.setText(spannableStringBuilder);
        } else {
            kg.p.s(spannableStringBuilder, context, num2, d0Var);
            textView.setText(spannableStringBuilder);
        }
    }

    public static void i0(rh1.k kVar, d21.a aVar) {
        kVar.C0 = aVar;
    }

    public static String i1(String str) {
        return a.a.k("PinId(value=", str, ")");
    }

    public static final HashMap j(String str, String str2) {
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("is_local_draft", String.valueOf(str == null || str.length() == 0));
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("collage_draft_id", str);
        HashMap o13 = bs1.c.o(pairArr);
        if (str2 != null) {
            o13.put("collage_item_id", str2);
        }
        return o13;
    }

    public static void j0(l81.l lVar, x02.i2 i2Var) {
        lVar.R0 = i2Var;
    }

    public static final List j1(z40.n nVar) {
        z40.k a13;
        List<z40.j> a14;
        z40.i iVar;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        z40.m g13 = nVar.g();
        if (g13 != null) {
            Intrinsics.checkNotNullParameter(g13, "<this>");
            z40.l lVar = g13 instanceof z40.l ? (z40.l) g13 : null;
            if (lVar != null && (a13 = lVar.a()) != null && (a14 = a13.a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (z40.j jVar : a14) {
                    if (jVar == null || (iVar = jVar.a()) == null) {
                        iVar = null;
                    } else {
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                    }
                    if (iVar != null) {
                        arrayList.add(iVar);
                    }
                }
                return arrayList;
            }
        }
        return kotlin.collections.q0.f80391a;
    }

    public static final void k(GestaltButtonGroup gestaltButtonGroup, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltButtonGroup, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        cm1.i iVar = new cm1.i(gestaltButtonGroup.d());
        init.invoke(iVar);
        gestaltButtonGroup.a(new ql1.k(iVar, 11));
    }

    public static void k0(rh1.k kVar, x02.i2 i2Var) {
        kVar.D0 = i2Var;
    }

    public static final ArrayList k1(z40.n nVar, String str) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        ArrayList H = H(str, j1(nVar));
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(H, 10));
        Iterator it = H.iterator();
        while (it.hasNext()) {
            arrayList.add(((z40.d0) it.next()).a());
        }
        return arrayList;
    }

    public static final void l(GestaltRadio gestaltRadio, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltRadio, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        an1.r rVar = new an1.r((an1.b) ((u50.o) gestaltRadio.f49480e.f33803a));
        init.invoke(rVar);
        gestaltRadio.a(new an1.i(rVar, 1));
    }

    public static void l0(l81.l lVar, PinService pinService) {
        lVar.f82148a1 = pinService;
    }

    public static od2.b l1() {
        return new od2.b("watery", "vec3 {{name}}(VertexEffectInput data) {\n    float noise = simplexNoise2D(data.texturePosition.xy + data.time * {{settings.speed}} / 4.0);\n    float angle = 0.5 * sin(data.time) * noise;\n\n    return rotate3D(data.position, vec3(1, 0, 0), angle);\n}", new pd2.q0(kotlin.collections.y0.b(new Pair("speed", ld2.a.f82993a))));
    }

    public static final hk2.b m(dl1.t tVar, String draftId, w01.e0 onCleared, y01.p1 onFailure) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(onCleared, "onCleared");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        dl1.l lVar = (dl1.l) tVar;
        jk2.e0 M = lVar.M(draftId);
        hk2.b bVar = new hk2.b(new x02.e0(20, new fn1.k(lVar, draftId, onCleared, 11)), new x02.e0(21, new al1.j(13, onFailure)), ck2.i.f27923c);
        M.f(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        return bVar;
    }

    public static void m0(l81.l lVar, nx.f0 f0Var) {
        lVar.S0 = f0Var;
    }

    public static od2.b m1() {
        return new od2.b("wobbly", "vec3 {{name}}(VertexEffectInput data) {\n    vec2 pivot = {{settings.pivot}};\n    pivot.y = -pivot.y;\n\n    float angle = float({{settings.angle}}) * PI / 180.0;\n    float stage = (smoothstep(-1.0, 1.0, sin(-data.time * {{settings.speed}} * 3.0)) - 0.5) * 2.0;\n\n    vec3 position = data.position;\n\n    vec2 diff = (position.xy - pivot) * data.size;\n    diff = rotate2D(diff, stage * 0.5 * angle);\n    position.xy = pivot + diff / data.size;\n\n    return position;\n}", new pd2.q0(kotlin.collections.z0.g(new Pair("speed", ld2.a.f82993a), new Pair("pivot", ld2.a.f82994b), new Pair("angle", jq.b.n(6.0f, null, 0.0f, 360.0f)))));
    }

    public static final int n(long j13, long j14) {
        boolean H0 = H0(j13);
        return H0 != H0(j14) ? H0 ? -1 : 1 : (int) Math.signum(w(j13) - w(j14));
    }

    public static void n0(rh1.k kVar) {
        kVar.getClass();
    }

    public static HashSet n1(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public static final void o(dl1.t tVar, String draftId) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        ((dl1.l) tVar).j(new dl1.u(draftId));
    }

    public static void o0(l81.l lVar, lb0.q qVar) {
        lVar.f82157f1 = qVar;
    }

    public static final void o1(StringBuilder sb3, Iterator it, z.a aVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb3.append(z.a.o(entry.getKey()));
            sb3.append(" : ");
            sb3.append(z.a.o(entry.getValue()));
            while (it.hasNext()) {
                sb3.append((CharSequence) aVar.f140498b);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb3.append(z.a.o(entry2.getKey()));
                sb3.append(" : ");
                sb3.append(z.a.o(entry2.getValue()));
            }
        }
    }

    public static final int p(int i13) {
        return (int) (i13 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static void p0(l81.l lVar, lb0.r rVar) {
        lVar.Y0 = rVar;
    }

    public static void p1(y3 y3Var, SQLiteDatabase sQLiteDatabase) {
        File file = new File(sQLiteDatabase.getPath());
        boolean readable = file.setReadable(false, false);
        a4 a4Var = y3Var.f95271i;
        if (!readable) {
            a4Var.c("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            a4Var.c("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            a4Var.c("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        a4Var.c("Failed to turn on database write permission for owner");
    }

    public static final boolean q(int i13) {
        return i13 == 0;
    }

    public static void q0(rh1.k kVar, lb0.r rVar) {
        kVar.G0 = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        r0 = n1(r17, r18);
        r2 = r20.split(",");
        r3 = r2.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r4 >= r3) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        r5 = r2[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r0.remove(r5) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        throw new android.database.sqlite.SQLiteException("Table " + r18 + " is missing required column: " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r21 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (r14 >= r21.length) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r0.remove(r21[r14]) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        r17.execSQL(r21[r14 + 1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        r14 = r14 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r0.isEmpty() != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        r13.a(r18, android.text.TextUtils.join(", ", r0), "Table has extra columns. table, columns");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        r16.f95268f.b(r18, "Failed to verify columns on table that was just created");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        r17.execSQL(r19);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void q1(oi.y3 r16, android.database.sqlite.SQLiteDatabase r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String[] r21) {
        /*
            r1 = r16
            r10 = r17
            r11 = r18
            r12 = r21
            oi.a4 r13 = r1.f95271i
            r14 = 0
            r15 = 0
            java.lang.String r3 = "SQLITE_MASTER"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r0 = "name"
            r4[r14] = r0     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            java.lang.String r5 = "name=?"
            java.lang.String[] r6 = new java.lang.String[]{r18}     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r17
            android.database.Cursor r15 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            boolean r0 = r15.moveToFirst()     // Catch: java.lang.Throwable -> L30 android.database.sqlite.SQLiteException -> L33
            r15.close()
            if (r0 != 0) goto L42
        L2d:
            r2 = r19
            goto L3f
        L30:
            r0 = move-exception
            goto Lac
        L33:
            r0 = move-exception
            java.lang.String r2 = "Error querying for table"
            r13.a(r11, r0, r2)     // Catch: java.lang.Throwable -> L30
            if (r15 == 0) goto L2d
            r15.close()
            goto L2d
        L3f:
            r10.execSQL(r2)
        L42:
            java.util.HashSet r0 = n1(r17, r18)     // Catch: android.database.sqlite.SQLiteException -> L79
            java.lang.String r2 = ","
            r3 = r20
            java.lang.String[] r2 = r3.split(r2)     // Catch: android.database.sqlite.SQLiteException -> L79
            int r3 = r2.length     // Catch: android.database.sqlite.SQLiteException -> L79
            r4 = r14
        L50:
            if (r4 >= r3) goto L7b
            r5 = r2[r4]     // Catch: android.database.sqlite.SQLiteException -> L79
            boolean r6 = r0.remove(r5)     // Catch: android.database.sqlite.SQLiteException -> L79
            if (r6 == 0) goto L5d
            int r4 = r4 + 1
            goto L50
        L5d:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch: android.database.sqlite.SQLiteException -> L79
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "Table "
            r2.<init>(r3)     // Catch: android.database.sqlite.SQLiteException -> L79
            r2.append(r11)     // Catch: android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = " is missing required column: "
            r2.append(r3)     // Catch: android.database.sqlite.SQLiteException -> L79
            r2.append(r5)     // Catch: android.database.sqlite.SQLiteException -> L79
            java.lang.String r2 = r2.toString()     // Catch: android.database.sqlite.SQLiteException -> L79
            r0.<init>(r2)     // Catch: android.database.sqlite.SQLiteException -> L79
            throw r0     // Catch: android.database.sqlite.SQLiteException -> L79
        L79:
            r0 = move-exception
            goto La4
        L7b:
            if (r12 == 0) goto L92
        L7d:
            int r2 = r12.length     // Catch: android.database.sqlite.SQLiteException -> L79
            if (r14 >= r2) goto L92
            r2 = r12[r14]     // Catch: android.database.sqlite.SQLiteException -> L79
            boolean r2 = r0.remove(r2)     // Catch: android.database.sqlite.SQLiteException -> L79
            if (r2 != 0) goto L8f
            int r2 = r14 + 1
            r2 = r12[r2]     // Catch: android.database.sqlite.SQLiteException -> L79
            r10.execSQL(r2)     // Catch: android.database.sqlite.SQLiteException -> L79
        L8f:
            int r14 = r14 + 2
            goto L7d
        L92:
            boolean r2 = r0.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> L79
            if (r2 != 0) goto La3
            java.lang.String r2 = "Table has extra columns. table, columns"
            java.lang.String r3 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r3, r0)     // Catch: android.database.sqlite.SQLiteException -> L79
            r13.a(r11, r0, r2)     // Catch: android.database.sqlite.SQLiteException -> L79
        La3:
            return
        La4:
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            oi.a4 r1 = r1.f95268f
            r1.b(r11, r2)
            throw r0
        Lac:
            if (r15 == 0) goto Lb1
            r15.close()
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.d.q1(oi.y3, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static od2.b r() {
        return new od2.b("floaty", "vec3 {{name}}(VertexEffectInput data) {\n    float stage = sin(data.time * {{settings.speed}} + data.texturePosition.y * 2.0);\n    float angle = 0.5 * stage * smoothstep(0.8, 0.0, 0.5 * abs(data.texturePosition.y-0.5));\n\n    vec3 position = data.position;\n    position = rotate3D(position, vec3(1, 1, 0), angle);\n    return position;\n}", new pd2.q0(kotlin.collections.y0.b(new Pair("speed", ld2.a.f82993a))));
    }

    public static void r0(do0.b bVar, uk1.e eVar) {
        bVar.B0 = eVar;
    }

    public static final nk1.h s(boolean z13, boolean z14) {
        return z13 ? nk1.h.BLOCKED : z14 ? nk1.h.FOLLOWING : nk1.h.NOT_FOLLOWING;
    }

    public static void s0(ib1.e eVar, uk1.e eVar2) {
        eVar.f72024z0 = eVar2;
    }

    public static void t(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i13 = configuration.colorMode & 3;
        int i14 = configuration2.colorMode & 3;
        if (i13 != i14) {
            configuration3.colorMode |= i14;
        }
        int i15 = configuration.colorMode & 12;
        int i16 = configuration2.colorMode & 12;
        if (i15 != i16) {
            configuration3.colorMode |= i16;
        }
    }

    public static void t0(j51.e eVar, uk1.e eVar2) {
        eVar.f74739z0 = eVar2;
    }

    public static long u(AudioTrack audioTrack, o7.y yVar) {
        if (yVar.f93209c != 0) {
            return d7.n0.g0(audioTrack.getBufferSizeInFrames(), 1000000L, o7.g0.a(yVar.f93213g), RoundingMode.DOWN);
        }
        return d7.n0.e0(yVar.f93211e, audioTrack.getBufferSizeInFrames());
    }

    public static void u0(l81.l lVar, androidx.appcompat.widget.c2 c2Var) {
        lVar.f82175o1 = c2Var;
    }

    public static final String v(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        String b13 = v7Var.b1();
        String a13 = v7Var.a1();
        String L = L(v7Var);
        return (b13 == null || kotlin.text.z.j(b13)) ? (a13 == null || kotlin.text.z.j(a13)) ? (L == null || kotlin.text.z.j(L)) ? "" : L : a13 : b13;
    }

    public static void v0(l81.l lVar, f4 f4Var) {
        lVar.U0 = f4Var;
    }

    public static final float w(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }

    public static void w0(l81.l lVar, i92.k kVar) {
        lVar.f82152c1 = kVar;
    }

    public static String x() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        char[] charArray = uuid.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        StringBuilder sb3 = new StringBuilder();
        for (char c13 : charArray) {
            if (c13 != '-') {
                if (c13 != ' ') {
                    switch (c13) {
                        case 'a':
                            sb3.append('A');
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                            sb3.append('B');
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NOTE_AND_FAVORITE_MODULE /* 99 */:
                            sb3.append('C');
                            break;
                        case 'd':
                            sb3.append('D');
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE /* 101 */:
                            sb3.append('E');
                            break;
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE /* 102 */:
                            sb3.append('F');
                            break;
                        default:
                            sb3.append(c13);
                            break;
                    }
                } else {
                    sb3.append('0');
                }
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        return sb4;
    }

    public static void x0(rh1.k kVar, up0.l lVar) {
        kVar.A0 = lVar;
    }

    public static final int y(IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "<this>");
        if (iOException instanceof NoRouteToHostException) {
            return -1;
        }
        if (iOException instanceof UnknownHostException) {
            return -2;
        }
        if (iOException instanceof ProtocolException) {
            return NetError.ERR_CONNECTION_RESET;
        }
        if (iOException instanceof HttpRetryException) {
            return NetError.ERR_CONNECTION_REFUSED;
        }
        if (iOException instanceof MalformedURLException) {
            return NetError.ERR_CONNECTION_ABORTED;
        }
        if (iOException instanceof URISyntaxException) {
            return NetError.ERR_CONNECTION_FAILED;
        }
        if (iOException instanceof UnknownServiceException) {
            return NetError.ERR_NAME_NOT_RESOLVED;
        }
        if (iOException instanceof SocketTimeoutException) {
            return NetError.ERR_CERT_COMMON_NAME_INVALID;
        }
        if (iOException instanceof BindException) {
            return NetError.ERR_INVALID_URL;
        }
        if (iOException instanceof ConnectException) {
            return NetError.ERR_DISALLOWED_URL_SCHEME;
        }
        if (iOException instanceof PortUnreachableException) {
            return NetError.ERR_UNKNOWN_URL_SCHEME;
        }
        if (iOException instanceof ConnectionShutdownException) {
            return -1101;
        }
        if (iOException instanceof StreamResetException) {
            return -1102;
        }
        if (iOException instanceof InterruptedIOException) {
            return NetError.ERR_CERT_DATE_INVALID;
        }
        if (iOException instanceof SocketException) {
            return NetError.ERR_INVALID_REDIRECT;
        }
        if (iOException instanceof SSLHandshakeException) {
            return NetError.ERR_CACHE_MISS;
        }
        if (iOException instanceof SSLKeyException) {
            return NetError.ERR_CACHE_READ_FAILURE;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return NetError.ERR_CACHE_WRITE_FAILURE;
        }
        if (iOException instanceof SSLProtocolException) {
            return NetError.ERR_CACHE_OPERATION_NOT_SUPPORTED;
        }
        if (iOException instanceof SSLException) {
            return NetError.ERR_CACHE_OPEN_FAILURE;
        }
        return -1001;
    }

    public static void y0(rh1.k kVar, j4 j4Var) {
        kVar.F0 = j4Var;
    }

    public static final String z(IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "<this>");
        if (iOException.getMessage() == null) {
            return iOException instanceof NoRouteToHostException ? "Error occurred connecting socket to remote address or port" : iOException instanceof UnknownHostException ? "IP or host could not be determined" : iOException instanceof ProtocolException ? "Error in underlying protocol" : iOException instanceof HttpRetryException ? "HTTP request cannot be retried automatically" : iOException instanceof MalformedURLException ? "Malformed URL" : iOException instanceof URISyntaxException ? "URI string cannot be parsed" : iOException instanceof UnknownServiceException ? "Unknown service exception occurred" : iOException instanceof SocketTimeoutException ? "Timeout occurred in socket read or accept" : iOException instanceof BindException ? "Error occurred binding socket to local address and port" : iOException instanceof ConnectException ? "Error occurred binding socket to remote address and port" : iOException instanceof PortUnreachableException ? "ICMP Port Unreachable received on connected datagram" : iOException instanceof ConnectionShutdownException ? "Attempting to reuse shutdown HTTP connection" : iOException instanceof StreamResetException ? "HTTP stream shutdown" : iOException instanceof InterruptedIOException ? "Unknown interruption exception" : iOException instanceof SocketException ? "Error creating or accessing socket" : iOException instanceof SSLHandshakeException ? "Client and server could not negotiate desired security level" : iOException instanceof SSLKeyException ? "Bad SSL key. Poorly configured server, client SSL certificate, or private key" : iOException instanceof SSLPeerUnverifiedException ? "Peer's identity has not been verified" : iOException instanceof SSLProtocolException ? "Error in SSL protocol implementation" : iOException instanceof SSLException ? "Unknown SSL error" : "Unknown IO exception thrown from network call";
        }
        String message = iOException.getMessage();
        Intrinsics.f(message);
        return message;
    }

    public static void z0(if1.b bVar, so.y3 y3Var) {
        bVar.f72228i1 = y3Var;
    }
}
