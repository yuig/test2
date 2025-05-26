package df;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.provider.Settings;
import android.text.Html;
import android.text.TextUtils;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.URLUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.y2;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.components.DependencyCycleException;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.l30;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.indicator.GestaltIndicator;
import com.pinterest.gestalt.tabs.GestaltTab;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.ui.grid.PinterestRecyclerView;
import io.reactivex.exceptions.ProtocolViolationException;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import lh0.a4;
import lh0.g2;
import lh0.z3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import so.oa;
import x40.ub;

/* loaded from: classes.dex */
public abstract class j1 implements pc.a {

    /* renamed from: a */
    public static int f54770a = 0;

    /* renamed from: b */
    public static long f54771b = -1;

    /* renamed from: c */
    public static long f54772c = -1;

    /* renamed from: d */
    public static long f54773d = -1;

    /* renamed from: e */
    public static String f54774e = "";

    /* renamed from: f */
    public static String f54775f = "";

    /* renamed from: g */
    public static String f54776g = "NoCarrier";

    /* renamed from: h */
    public static hs1.y f54777h;

    public static final String A(String str) {
        return V0(str) ? "" : str;
    }

    public static final void A0(GestaltDivider gestaltDivider) {
        Intrinsics.checkNotNullParameter(gestaltDivider, "<this>");
        gestaltDivider.a(jm1.e.f77033l);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A1(org.json.JSONObject r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.j1.A1(org.json.JSONObject, android.content.Context):void");
    }

    public static final ArrayList B(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            if (length <= 0) {
                return arrayList;
            }
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                String string = jsonArray.getString(i13);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i14 >= length) {
                    return arrayList;
                }
                i13 = i14;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final boolean B0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        List f13 = b40.f(f30Var);
        return !(f13 == null || f13.isEmpty());
    }

    public static boolean B1(AtomicReference atomicReference, xj2.c cVar, Class cls) {
        ck2.i.b(cVar, "next is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.dispose();
                if (atomicReference.get() == bk2.c.DISPOSED) {
                    return false;
                }
                String name = cls.getName();
                lb.l0.R0(new ProtocolViolationException(a.a.m("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
                return false;
            }
        }
        return true;
    }

    public static final HashMap C(JSONObject jsonObject) {
        int length;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names != null && (length = names.length()) > 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                try {
                    String string = names.getString(i13);
                    Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = C((JSONObject) value);
                    }
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    hashMap.put(string, value);
                } catch (JSONException unused) {
                }
                if (i14 >= length) {
                    break;
                }
                i13 = i14;
            }
        }
        return hashMap;
    }

    public static String C0(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            hash.update(bArr);
            byte[] digest = hash.digest();
            StringBuilder sb3 = new StringBuilder();
            Intrinsics.checkNotNullExpressionValue(digest, "digest");
            int length = digest.length;
            int i13 = 0;
            while (i13 < length) {
                byte b13 = digest[i13];
                i13++;
                sb3.append(Integer.toHexString((b13 >> 4) & 15));
                sb3.append(Integer.toHexString(b13 & 15));
            }
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "builder.toString()");
            return sb4;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final String C1(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return C0("SHA-256", bytes);
    }

    public static final HashMap D(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jsonObject.optString(key);
            if (optString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    public static final boolean D0(i32.y0 placement, i32.l experience) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(experience, "experience");
        return E0(String.valueOf(placement.value()), experience);
    }

    public static final boolean D1(f30 f30Var, lh0.j experiments, ac2.p1 videoManagerUtil, es.h adsCommonDisplay, boolean z13, kv.a audioOverlayPowerscoreExperimentManager, kv.c organicAudioOverlayPowerscoreExperimentManager, boolean z14) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(videoManagerUtil, "videoManagerUtil");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(audioOverlayPowerscoreExperimentManager, "audioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(organicAudioOverlayPowerscoreExperimentManager, "organicAudioOverlayPowerscoreExperimentManager");
        boolean L1 = L1(adsCommonDisplay, audioOverlayPowerscoreExperimentManager, organicAudioOverlayPowerscoreExperimentManager, f30Var, experiments, videoManagerUtil, z14);
        Boolean Q5 = f30Var.Q5();
        Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
        if (!Q5.booleanValue()) {
            if (n60.o.B(f30Var, "getIsPromoted(...)")) {
                return L1;
            }
            if (!L1 || !z13) {
                return false;
            }
        }
        return true;
    }

    public static final float E(float f13, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return f13 / y1(context);
    }

    public static final boolean E0(String placementId, i32.l experience) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(experience, "experience");
        i32.w0 w0Var = i32.y0.Companion;
        int parseInt = Integer.parseInt(placementId);
        w0Var.getClass();
        i32.y0 a13 = i32.w0.a(parseInt);
        rg0.n b13 = a13 != null ? ((dh0.d) rg0.y.a()).b(a13) : null;
        return b13 != null && b13.f108060b == experience.value();
    }

    public static final boolean E1() {
        return !hf0.b.q();
    }

    public static final int F(InputStream inputStream, OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i13 = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i13 += read;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i13;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static final Object F0(Object obj, Method method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean F1(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean M4 = f30Var.M4();
        Intrinsics.checkNotNullExpressionValue(M4, "getIsEligibleForPdp(...)");
        return M4.booleanValue();
    }

    public static sl.b G(String str, String str2) {
        km.a aVar = new km.a(str, str2);
        sl.a a13 = sl.b.a(km.a.class);
        a13.f113124e = 1;
        a13.f113125f = new com.google.firebase.messaging.a0(aVar, 0);
        return a13.b();
    }

    public static final boolean G0(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (uri.getHost() == null) {
            return false;
        }
        if (!W0(uri)) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            int i13 = at1.d.f20439o;
            at1.d e13 = nl.b.e();
            Intrinsics.checkNotNullParameter(intent, "intent");
            List<ResolveInfo> queryIntentActivities = e13.getPackageManager().queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            if (!queryIntentActivities.isEmpty()) {
                String packageName = nl.b.e().getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d(packageName, it.next().activityInfo.packageName)) {
                        break;
                    }
                }
            }
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (!Intrinsics.d("ads.pinterest.com", uri.getHost())) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                if (!Intrinsics.d("analytics.pinterest.com", uri.getHost())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean G1(f30 f30Var, lh0.j experiments, es.a adFormats) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        z3 z3Var = a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) experiments.f83394a;
        return H1(f30Var, g1Var.o("android_idea_ads_grid_static_playtime", "enabled", z3Var) || g1Var.l("android_idea_ads_grid_static_playtime"), g1Var.o("android_ads_mrc_btr_1px1s", "enabled", z3Var) || g1Var.l("android_ads_mrc_btr_1px1s"), new is1.b(experiments, 1), new is1.b(experiments, 2), adFormats);
    }

    public static final ek.e H(TabLayout tabLayout, u50.i0 tabText, int i13, rm1.q qVar, pn1.c tabSize) {
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(tabText, "tabText");
        Intrinsics.checkNotNullParameter(tabSize, "tabSize");
        Context context = tabLayout.getContext();
        ek.e p13 = tabLayout.p();
        Intrinsics.checkNotNullExpressionValue(p13, "newTab(...)");
        Intrinsics.f(context);
        p13.f59129f = new GestaltTab(context, new pn1.b(tabText, null, qVar, i13, tabSize, 78));
        p13.c();
        return p13;
    }

    public static final boolean H0(boolean z13, Uri uri) {
        if (uri == null) {
            return false;
        }
        if (!kotlin.text.z.i("pinit", uri.getScheme(), true)) {
            if (kotlin.text.z.i("pinterest", uri.getScheme(), true)) {
                if ((uri.getHost() == null || !(!StringsKt.E(r4, ".", false))) && !G0(uri)) {
                    return false;
                }
            } else if (!z13 || !f1(uri)) {
                if (z13) {
                    return false;
                }
                if (!I0(uri.getHost())) {
                    Set set = qs1.b.f105095a;
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    if (!qs1.b.a(uri.toString())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean H1(f30 f30Var, boolean z13, boolean z14, Function0 activateAdsIdeaExperiment, Function0 activateAdsMrc1px1sExperiment, es.a adFormats) {
        Intrinsics.checkNotNullParameter(activateAdsIdeaExperiment, "activateAdsIdeaExperiment");
        Intrinsics.checkNotNullParameter(activateAdsMrc1px1sExperiment, "activateAdsMrc1px1sExperiment");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        if (((es.c) adFormats).U(f30Var) && f30Var != null && !b40.R0(f30Var)) {
            activateAdsIdeaExperiment.invoke();
            if (!z13) {
                activateAdsMrc1px1sExperiment.invoke();
                if (z14) {
                }
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ ek.e I(GestaltTabLayout gestaltTabLayout, u50.i0 i0Var, int i13, rm1.q qVar, int i14) {
        if ((i14 & 8) != 0) {
            qVar = null;
        }
        return H(gestaltTabLayout, i0Var, i13, qVar, pn1.c.SMALL);
    }

    public static final boolean I0(String str) {
        if (str != null) {
            return ie0.a.f72200e.contains(str) || kotlin.text.z.h(str, "pinterdev.com", false) || ie0.a.f72198c.contains(str);
        }
        return false;
    }

    public static final boolean I1(f30 f30Var, boolean z13, boolean z14, boolean z15, boolean z16, Function0 isPintagDecanEnabledAndActivate, Function0 isAdsDLAudioFullscreenEnabledAndActivate, Function0 is3PAudioButtonEnabledAndActivate, Function0 isAudioOverlayPowerscoreBlockedAndActivate, boolean z17, es.h adsCommonDisplay, boolean z18) {
        Intrinsics.checkNotNullParameter(isPintagDecanEnabledAndActivate, "isPintagDecanEnabledAndActivate");
        Intrinsics.checkNotNullParameter(isAdsDLAudioFullscreenEnabledAndActivate, "isAdsDLAudioFullscreenEnabledAndActivate");
        Intrinsics.checkNotNullParameter(is3PAudioButtonEnabledAndActivate, "is3PAudioButtonEnabledAndActivate");
        Intrinsics.checkNotNullParameter(isAudioOverlayPowerscoreBlockedAndActivate, "isAudioOverlayPowerscoreBlockedAndActivate");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        return f30Var != null && P0(f30Var, adsCommonDisplay, z13, z14, z16, z17, isPintagDecanEnabledAndActivate, z18) && Q0(f30Var, z15, is3PAudioButtonEnabledAndActivate, isAudioOverlayPowerscoreBlockedAndActivate) && ((Boolean) isAdsDLAudioFullscreenEnabledAndActivate.invoke()).booleanValue();
    }

    public static void J(Throwable th3, int i13) {
        if ((i13 & 1) != 0) {
            th3 = null;
        }
        if (th3 == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        throw th3;
    }

    public static final boolean J0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return b40.q0(f30Var) && n60.o.B(f30Var, "getIsPromoted(...)");
    }

    public static final boolean J1(f30 f30Var, lh0.j experiments, ac2.p1 videoManagerUtil) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(videoManagerUtil, "videoManagerUtil");
        return K1(f30Var, ((ac2.f) videoManagerUtil).c(), new is1.c(experiments, 0), new is1.c(experiments, 1));
    }

    public static final int K(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return dl2.b.x0(context, eo1.a.sema_color_text_default);
    }

    public static final boolean K0() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{le.v.b()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context a13 = le.v.a();
            PackageManager packageManager = a13.getPackageManager();
            String packageName = a13.getPackageName();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean K1(f30 f30Var, boolean z13, Function0 isAndroidMaxVideoAudioOverlayEnabledAndActivate, Function0 is3PAudioButtonEnabledAndActivate) {
        Intrinsics.checkNotNullParameter(isAndroidMaxVideoAudioOverlayEnabledAndActivate, "isAndroidMaxVideoAudioOverlayEnabledAndActivate");
        Intrinsics.checkNotNullParameter(is3PAudioButtonEnabledAndActivate, "is3PAudioButtonEnabledAndActivate");
        if (f30Var != null && Q0(f30Var, z13, is3PAudioButtonEnabledAndActivate, is1.d.f73580j)) {
            Boolean Q5 = f30Var.Q5();
            Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
            if (Q5.booleanValue() && ((Boolean) isAndroidMaxVideoAudioOverlayEnabledAndActivate.invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static void L(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i13 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (sl.i iVar : (Set) it2.next()) {
                        for (sl.k kVar : iVar.f113145a.f113129c) {
                            if (kVar.f113152c == 0) {
                                Set<sl.i> set = (Set) hashMap.get(new sl.j(kVar.f113150a, kVar.f113151b == 2));
                                if (set != null) {
                                    for (sl.i iVar2 : set) {
                                        iVar.f113146b.add(iVar2);
                                        iVar2.f113147c.add(iVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    sl.i iVar3 = (sl.i) it4.next();
                    if (iVar3.f113147c.isEmpty()) {
                        hashSet2.add(iVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    sl.i iVar4 = (sl.i) hashSet2.iterator().next();
                    hashSet2.remove(iVar4);
                    i13++;
                    Iterator it5 = iVar4.f113146b.iterator();
                    while (it5.hasNext()) {
                        sl.i iVar5 = (sl.i) it5.next();
                        iVar5.f113147c.remove(iVar4);
                        if (iVar5.f113147c.isEmpty()) {
                            hashSet2.add(iVar5);
                        }
                    }
                }
                if (i13 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    sl.i iVar6 = (sl.i) it6.next();
                    if (!iVar6.f113147c.isEmpty() && !iVar6.f113146b.isEmpty()) {
                        arrayList2.add(iVar6.f113145a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            sl.b bVar = (sl.b) it.next();
            sl.i iVar7 = new sl.i(bVar);
            for (sl.q qVar : bVar.f113128b) {
                boolean z13 = !(bVar.f113131e == 0);
                sl.j jVar = new sl.j(qVar, z13);
                if (!hashMap.containsKey(jVar)) {
                    hashMap.put(jVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(jVar);
                if (!set2.isEmpty() && !z13) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set2.add(iVar7);
            }
        }
    }

    public static final boolean L0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE != null) {
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (new Regex(".+_cheets|cheets_.+").e(DEVICE)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean L1(es.h adsCommonDisplay, kv.a audioOverlayPowerscoreExperimentManager, kv.c organicAudioOverlayPowerscoreExperimentManager, f30 f30Var, lh0.j experiments, ac2.p1 videoManagerUtil, boolean z13) {
        List y53;
        uo0 uo0Var;
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(videoManagerUtil, "videoManagerUtil");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(audioOverlayPowerscoreExperimentManager, "audioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(organicAudioOverlayPowerscoreExperimentManager, "organicAudioOverlayPowerscoreExperimentManager");
        int i13 = 0;
        if (f30Var == null) {
            return false;
        }
        int i14 = 1;
        if (n60.o.B(f30Var, "getIsPromoted(...)")) {
            ac2.f fVar = (ac2.f) videoManagerUtil;
            if (!Q0(f30Var, fVar.c(), new is1.c(experiments, 2), new is1.e(audioOverlayPowerscoreExperimentManager, i13)) || ((!b40.X0(f30Var) && !b40.R0(f30Var)) || f30Var.Q5().booleanValue())) {
                if (!I1(f30Var, false, false, fVar.c(), experiments.c(), new is1.c(experiments, 3), new is1.c(experiments, 4), new is1.c(experiments, 5), new is1.e(audioOverlayPowerscoreExperimentManager, i14), z13, adsCommonDisplay, experiments.b())) {
                    return false;
                }
            }
        } else {
            if (b40.Q0(f30Var)) {
                dl0 v63 = f30Var.v6();
                if (v63 != null) {
                    Intrinsics.checkNotNullParameter(v63, "<this>");
                    List s13 = v63.s();
                    if (s13 == null) {
                        s13 = v63.t();
                    }
                    if (s13 == null) {
                        s13 = kotlin.collections.q0.f80391a;
                    }
                    if (s13 != null && (uo0Var = (uo0) CollectionsKt.U(0, s13)) != null) {
                        y53 = uo0Var.s();
                    }
                }
                y53 = null;
            } else {
                y53 = f30Var.y5();
            }
            List list = y53;
            boolean z14 = list == null || list.isEmpty();
            if ((!b40.X0(f30Var) && !b40.R0(f30Var)) || !((ac2.f) videoManagerUtil).c() || !z14 || b40.F0(f30Var)) {
                return false;
            }
            organicAudioOverlayPowerscoreExperimentManager.getClass();
            if (organicAudioOverlayPowerscoreExperimentManager.h(z3.ACTIVATE_EXPERIMENT)) {
                return false;
            }
        }
        return true;
    }

    public static com.google.common.util.concurrent.r M() {
        return com.google.common.util.concurrent.r.INSTANCE;
    }

    public static final boolean M0(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        return Intrinsics.d(parse.getHost(), "checkoutPaymentNotify") && Intrinsics.d(parse.getQueryParameter("event"), gp1.f.CLOSE.getKey());
    }

    public static final boolean M1(f30 f30Var, lh0.j experiments, boolean z13, boolean z14, boolean z15, boolean z16, kv.a audioOverlayPowerscoreExperimentManager, es.h adsCommonDisplay, es.a adFormats) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(audioOverlayPowerscoreExperimentManager, "audioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        return N1(f30Var, z13, z14, z15, experiments.c(), z16, new is1.a(experiments, 1), new is1.a(experiments, 2), new is1.a(experiments, 3), new yj1.d(audioOverlayPowerscoreExperimentManager, 21), adsCommonDisplay, adFormats, experiments.b());
    }

    public static final void N(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final boolean N0(String str, i32.l exp) {
        Intrinsics.checkNotNullParameter(exp, "exp");
        return kotlin.text.z.i(str, String.valueOf(exp.value()), false);
    }

    public static final boolean N1(f30 f30Var, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, Function0 isPintagDecanEnabledAndActivate, Function0 isAdsDLAudioFullscreenEnabledAndActivate, Function0 is3PAudioButtonEnabledAndActivate, Function0 isAudioOverlayPowerscoreBlockedAndActivate, es.h adsCommonDisplay, es.a adFormats, boolean z18) {
        Intrinsics.checkNotNullParameter(isPintagDecanEnabledAndActivate, "isPintagDecanEnabledAndActivate");
        Intrinsics.checkNotNullParameter(isAdsDLAudioFullscreenEnabledAndActivate, "isAdsDLAudioFullscreenEnabledAndActivate");
        Intrinsics.checkNotNullParameter(is3PAudioButtonEnabledAndActivate, "is3PAudioButtonEnabledAndActivate");
        Intrinsics.checkNotNullParameter(isAudioOverlayPowerscoreBlockedAndActivate, "isAudioOverlayPowerscoreBlockedAndActivate");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        if (P0(f30Var, adsCommonDisplay, z13, z14, z16, z17, isPintagDecanEnabledAndActivate, z18) || I1(f30Var, z13, z14, z15, z16, isPintagDecanEnabledAndActivate, isAdsDLAudioFullscreenEnabledAndActivate, is3PAudioButtonEnabledAndActivate, isAudioOverlayPowerscoreBlockedAndActivate, z17, adsCommonDisplay, z18)) {
            return true;
        }
        return f30Var != null && ((es.c) adFormats).N(f30Var);
    }

    public static final int O(int i13) {
        return (int) (i13 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final boolean O0() {
        if (p001if.a.b(j1.class)) {
            return false;
        }
        try {
            JSONObject j03 = j0();
            if (j03 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = j03.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i13 = 0;
                    while (true) {
                        int i14 = i13 + 1;
                        String string = jSONArray.getString(i13);
                        Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (Intrinsics.d(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i14 >= length) {
                            break;
                        }
                        i13 = i14;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th3) {
            p001if.a.a(j1.class, th3);
            return false;
        }
    }

    public static final boolean O1(es.h adsCommonDisplay, kv.a audioOverlayPowerscoreExperimentManager, kv.c organicAudioOverlayPowerscoreExperimentManager, f30 f30Var, lh0.j experiments, ac2.p1 videoManagerUtil, boolean z13) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(videoManagerUtil, "videoManagerUtil");
        Intrinsics.checkNotNullParameter(audioOverlayPowerscoreExperimentManager, "audioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(organicAudioOverlayPowerscoreExperimentManager, "organicAudioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        return J1(f30Var, experiments, videoManagerUtil) || L1(adsCommonDisplay, audioOverlayPowerscoreExperimentManager, organicAudioOverlayPowerscoreExperimentManager, f30Var, experiments, videoManagerUtil, z13);
    }

    public static final int P(float f13, Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) (f13 * context.getResources().getDisplayMetrics().density);
    }

    public static final boolean P0(f30 pin, es.h hVar, boolean z13, boolean z14, boolean z15, boolean z16, Function0 function0, boolean z17) {
        cc J3;
        List d2;
        if (pin != null && z16) {
            if (!b40.X0(pin) && !b40.R0(pin)) {
                ((es.v) hVar).getClass();
                Intrinsics.checkNotNullParameter(pin, "pin");
                if (pin.d5().booleanValue() && (J3 = pin.J3()) != null && (d2 = J3.d()) != null && z17) {
                    Iterator it = d2.iterator();
                    while (it.hasNext()) {
                        if (((l30) it.next()).z() != null) {
                        }
                    }
                }
            }
            if (!z13 && !z14 && !pin.i5().booleanValue() && !pin.b5().booleanValue() && !((es.v) hVar).N(pin, z15, function0) && b40.w0(pin)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean P1(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean Z4 = f30Var.Z4();
        Intrinsics.checkNotNullExpressionValue(Z4, "getIsOosProduct(...)");
        if (!Z4.booleanValue()) {
            Boolean g53 = f30Var.g5();
            Intrinsics.checkNotNullExpressionValue(g53, "getIsStaleProduct(...)");
            if (!g53.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final int Q(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) (i13 * context.getResources().getDisplayMetrics().density);
    }

    public static final boolean Q0(f30 f30Var, boolean z13, Function0 is3PAudioButtonEnabledAndActivate, Function0 isAudioOverlayPowerscoreBlockedAndActivate) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(is3PAudioButtonEnabledAndActivate, "is3PAudioButtonEnabledAndActivate");
        Intrinsics.checkNotNullParameter(isAudioOverlayPowerscoreBlockedAndActivate, "isAudioOverlayPowerscoreBlockedAndActivate");
        Boolean d53 = f30Var.d5();
        Intrinsics.checkNotNullExpressionValue(d53, "getIsPromoted(...)");
        return d53.booleanValue() && b40.w0(f30Var) && z13 && ((n60.o.y(f30Var, "getIsThirdPartyAd(...)") && ((Boolean) is3PAudioButtonEnabledAndActivate.invoke()).booleanValue()) || !f30Var.i5().booleanValue()) && !((Boolean) isAudioOverlayPowerscoreBlockedAndActivate.invoke()).booleanValue();
    }

    public static final boolean Q1(es.h adsCommonDisplay, kv.a audioOverlayPowerscoreExperimentManager, kv.c organicAudioOverlayPowerscoreExperimentManager, f30 f30Var, lh0.j experiments, ac2.p1 videoManagerUtil, boolean z13) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(videoManagerUtil, "videoManagerUtil");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(audioOverlayPowerscoreExperimentManager, "audioOverlayPowerscoreExperimentManager");
        Intrinsics.checkNotNullParameter(organicAudioOverlayPowerscoreExperimentManager, "organicAudioOverlayPowerscoreExperimentManager");
        Boolean Q5 = f30Var.Q5();
        Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
        return Q5.booleanValue() || L1(adsCommonDisplay, audioOverlayPowerscoreExperimentManager, organicAudioOverlayPowerscoreExperimentManager, f30Var, experiments, videoManagerUtil, z13);
    }

    public static void R(fn.i iVar) {
        e2.g0 g0Var = iVar.f62592b;
        g0Var.getClass();
        if (fn.f.NATIVE != ((fn.f) g0Var.f56857b)) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static final boolean R0(f30 f30Var) {
        wy0 n13;
        return f30Var != null && n60.o.B(f30Var, "getIsPromoted(...)") && !f30Var.i5().booleanValue() && b40.w0(f30Var) && (n13 = b40.n(f30Var)) != null && Intrinsics.d(n13.O3(), Boolean.TRUE);
    }

    public static final nx.z0 R1(HashMap auxData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        nx.z0 z0Var = new nx.z0();
        z0Var.putAll(auxData);
        return z0Var;
    }

    public static String S(String str) {
        return str.replace("{", "%7B").replace("}", "%7D").replace("|", "%7C").replace("#", "%23").replace("%", "%25").replace("[", "%5B").replace("]", "%5D");
    }

    public static boolean S0(Context context) {
        Method q03 = q0("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (q03 == null) {
            return false;
        }
        Object F0 = F0(null, q03, context);
        return (F0 instanceof Integer) && Intrinsics.d(F0, 0);
    }

    public static final nx.z0 S1(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        nx.z0 z0Var = new nx.z0();
        for (Pair pair : pairs) {
            z0Var.put((String) pair.f80346a, (String) pair.f80347b);
        }
        return z0Var;
    }

    public static final String T(String str, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return U(str, args);
    }

    public static final boolean T0(Uri uri) {
        if (uri == null) {
            return false;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        return (queryParameterNames.contains("utm_source") || queryParameterNames.contains("utm_campaign") || queryParameterNames.contains("invite_code") || uri.getBooleanQueryParameter("nolp", false)) ? false : true;
    }

    public static final String T1(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i13 = 0;
        while (i13 < length) {
            int codePointAt = str.codePointAt(i13);
            if (32 > codePointAt || codePointAt >= 127) {
                wo2.j jVar = new wo2.j();
                jVar.q0(0, i13, str);
                jVar.s0(63);
                int charCount = Character.charCount(codePointAt) + i13;
                while (charCount < length) {
                    int codePointAt2 = str.codePointAt(charCount);
                    jVar.s0((32 > codePointAt2 || codePointAt2 >= 127) ? 63 : codePointAt2);
                    charCount += Character.charCount(codePointAt2);
                }
                return jVar.M();
            }
            i13 += Character.charCount(codePointAt);
        }
        return str;
    }

    public static String U(String str, Object[] args) {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return t3.s1.e(args, args.length, locale, str, "format(...)");
    }

    public static final boolean U0(CharSequence charSequence) {
        return !(charSequence == null || charSequence.length() == 0);
    }

    public static void U1(tc.g writer, pc.v customScalarAdapters, ub value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.f133460a instanceof pc.q0) {
            writer.M0("first");
            pc.c.d(pc.c.f99526g).a(writer, customScalarAdapters, (pc.q0) value.f133460a);
        }
        pc.r0 r0Var = value.f133461b;
        if (r0Var instanceof pc.q0) {
            writer.M0("after");
            pc.c.d(pc.c.b(pc.c.f99520a)).a(writer, customScalarAdapters, (pc.q0) r0Var);
        }
        pc.r0 r0Var2 = value.f133462c;
        if (r0Var2 instanceof pc.q0) {
            writer.M0("imageSpec");
            pc.c.d(pc.c.f99520a).a(writer, customScalarAdapters, (pc.q0) r0Var2);
        }
        pc.r0 r0Var3 = value.f133463d;
        if (r0Var3 instanceof pc.q0) {
            writer.M0("shouldRequestPinsubTopicId");
            pc.c.d(pc.c.f99527h).a(writer, customScalarAdapters, (pc.q0) r0Var3);
        } else if (customScalarAdapters.f99608b.f15032b) {
            writer.M0("shouldRequestPinsubTopicId");
            pc.c.f99522c.d(writer, customScalarAdapters, Boolean.FALSE);
        }
    }

    public static final String V(String str, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return t3.s1.d(args, args.length, str, "format(...)");
    }

    public static final boolean V0(String str) {
        return str == null || str.length() == 0;
    }

    public static final String V1(int i13) {
        return i13 != -3 ? i13 != -2 ? i13 != -1 ? i13 != 0 ? "unknown" : "allow" : "deny" : "deny_permanently" : "cancelled";
    }

    public static final String W(String str, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return t3.s1.e(args, args.length, Locale.US, str, "format(...)");
    }

    public static final boolean W0(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String host = uri.getHost();
        if (host != null) {
            return (StringsKt.E(host, "pinterest.", false) && !StringsKt.E(StringsKt.a0(host, "pinterest.", host), ".", false)) || (StringsKt.E(host, "pinterdev.", false) && !StringsKt.E(StringsKt.a0(host, "pinterdev.", host), ".", false)) || ie0.a.f72200e.contains(host);
        }
        return false;
    }

    public static final void W1(GestaltDivider gestaltDivider) {
        Intrinsics.checkNotNullParameter(gestaltDivider, "<this>");
        gestaltDivider.a(jm1.d.f77029l);
    }

    public static final String X(String str, Object... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return Y(str, args, null, 6);
    }

    public static final boolean X0(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.d(uri.getScheme(), "pinterest") || Intrinsics.d(uri.getScheme(), "pinit");
    }

    public static final void X1(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static String Y(String str, Object[] args, o5.c bidiFormatter, int i13) {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        if ((i13 & 4) != 0) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            o5.h hVar = o5.c.f92892d;
            bidiFormatter = TextUtils.getLayoutDirectionFromLocale(locale) == 1 ? o5.c.f92896h : o5.c.f92895g;
            Intrinsics.checkNotNullExpressionValue(bidiFormatter, "getInstance(...)");
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(bidiFormatter, "bidiFormatter");
        int length = args.length;
        Object[] objArr = new Object[length];
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            objArr[i15] = Unit.f80348a;
        }
        int length2 = args.length;
        int i16 = 0;
        while (i14 < length2) {
            Object obj = args[i14];
            int i17 = i16 + 1;
            if (!(obj instanceof o5.c) && obj != null) {
                if (obj instanceof String) {
                    String b13 = bidiFormatter.b((String) obj);
                    Intrinsics.checkNotNullExpressionValue(b13, "unicodeWrap(...)");
                    objArr[i16] = b13;
                } else {
                    objArr[i16] = obj;
                }
            }
            i14++;
            i16 = i17;
        }
        return t3.s1.d(objArr, length, str, "format(...)");
    }

    public static final boolean Y0(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static sl.b Z(String str, fl.q qVar) {
        sl.a a13 = sl.b.a(km.a.class);
        a13.f113124e = 1;
        a13.a(sl.k.a(Context.class));
        a13.f113125f = new km.d(str, 0, qVar);
        return a13.b();
    }

    public static final boolean Z0(lh0.j adsExperiments) {
        Intrinsics.checkNotNullParameter(adsExperiments, "adsExperiments");
        z3 z3Var = a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) adsExperiments.f83394a;
        return g1Var.o("android_simpler_ad_attribution_ads_modules", "enabled", z3Var) || g1Var.l("android_simpler_ad_attribution_ads_modules");
    }

    public static void a(fn.i iVar) {
        if (!iVar.f62596f) {
            throw new IllegalStateException("AdSession is not started");
        }
        q(iVar);
    }

    public static CharSequence a0(String str) {
        return str != null ? Html.fromHtml(str, 0) : "";
    }

    public static final boolean a1(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        f3 z33 = f30Var.z3();
        if (z33 != null && Intrinsics.d(z33.M(), Boolean.TRUE)) {
            Context context = kb0.a.f79058b;
            wy0 wy0Var = (wy0) ((oa) ((so1.b) ep.b.g(so1.b.class))).Ec.get();
            if (Intrinsics.d("US", wy0Var != null ? wy0Var.G2() : null)) {
                return true;
            }
        }
        return false;
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Object b0(Class cls, Object obj) {
        if (obj instanceof af2.a) {
            return cls.cast(obj);
        }
        if (obj instanceof af2.b) {
            return b0(cls, ((af2.b) obj).generatedComponent());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + af2.a.class + " or " + af2.b.class);
    }

    public static final boolean b1(String str, boolean z13) {
        if (Intrinsics.d("/_/_/help/", str)) {
            return true;
        }
        if (str != null && kotlin.text.z.p(str, "/_/_/help/articles/", false)) {
            return true;
        }
        if ((str != null && kotlin.text.z.p(str, "/_/_/business", false)) || Intrinsics.d("/_/_/about/privacy/", str) || Intrinsics.d("/_/_/about/acceptable-use-policy/", str) || Intrinsics.d("/_/_/about/terms-service/", str) || Intrinsics.d("/about/copyright/dmca-pin/pin/", str) || Intrinsics.d("/about/copyright/dmca-pin/", str) || Intrinsics.d("/about/trademark/form/", str) || Intrinsics.d("/email/subscription/", str) || Intrinsics.d("/email/unsubscribe/", str) || Intrinsics.d("/password/reset/", str) || Intrinsics.d("/email/user_survey/", str) || Intrinsics.d("/verify", str) || Intrinsics.d("/verify/", str)) {
            return true;
        }
        if (str != null && new Regex("^/suspension-appeal/.*/$").e(str)) {
            return true;
        }
        if (str != null && new Regex("^/about/.*/$").e(str)) {
            return true;
        }
        if (str == null || !new Regex("^/business/.*/$").e(str)) {
            return Intrinsics.d("/reports-and-violations/", str) && !z13;
        }
        return true;
    }

    public static final td.t c(String str, Map map) {
        td.v vVar = new td.v();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (!Intrinsics.d(entry.getKey(), "X-B3-TraceId") && !Intrinsics.d(entry.getKey(), "X-B3-SpanId") && !Intrinsics.d(entry.getKey(), "X-B3-ParentSpanId")) {
                    String str2 = (String) entry.getKey();
                    td.w wVar = new td.w((String) entry.getValue());
                    if (vVar.f117446c && "User-Agent".equalsIgnoreCase(str2)) {
                        vVar.a();
                        List list = (List) vVar.f117445b.get(str2);
                        if (list == null) {
                            list = new ArrayList();
                            vVar.f117445b.put(str2, list);
                        }
                        list.clear();
                        list.add(wVar);
                        if (vVar.f117446c && "User-Agent".equalsIgnoreCase(str2)) {
                            vVar.f117446c = false;
                        }
                    } else {
                        vVar.a();
                        List list2 = (List) vVar.f117445b.get(str2);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            vVar.f117445b.put(str2, list2);
                        }
                        list2.add(wVar);
                    }
                }
            }
        }
        vVar.f117444a = true;
        return new td.t(str, new td.x(vVar.f117445b));
    }

    public static String c0(String str) {
        if (pk.a0.x0(str)) {
            return str;
        }
        String replace = str.replace("href=\"/", "href=\"pinterest://pinterest.com/").replace("href='/", "href='pinterest://pinterest.com/");
        return pk.a0.x0(replace) ? replace : replace.replace("<a ", "<b><a ").replace("</a>", "</a></b>");
    }

    public static final boolean c1(g92.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return dVar != g92.d.CLASSIC;
    }

    public static final String d0(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static boolean d1(CharSequence charSequence) {
        return (pk.a0.s0(charSequence) || pk.a0.O(charSequence, "null")) ? false : true;
    }

    public static final hs1.x e(nd.a aVar) {
        int i13 = aVar == null ? -1 : hs1.n.f70065a[aVar.ordinal()];
        if (i13 == -1) {
            return null;
        }
        if (i13 == 1) {
            return hs1.x.MEMORY;
        }
        if (i13 != 2 && i13 != 3 && i13 != 4) {
            if (i13 == 5) {
                return hs1.x.NETWORK;
            }
            throw new NoWhenBranchMatchedException();
        }
        return hs1.x.DISK;
    }

    public static final String e0(Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            le.v vVar = le.v.f83104a;
            k1.f();
            String str = le.v.f83108e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i13 = applicationInfo.labelRes;
            if (i13 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i13);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final boolean e1(sr srVar) {
        return (srVar == null || srVar.h().doubleValue() == 0.0d || srVar.k().doubleValue() == 0.0d) ? false : true;
    }

    public static final ve0.d f0(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new ve0.d(pk.a0.L(resources, 16.0f), pk.a0.L(resources, 4.0f), true);
    }

    public static final boolean f1(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.d(uri.getScheme(), "http") || Intrinsics.d(uri.getScheme(), "https");
    }

    public static void g(x92.b bVar) {
        n60.o.w(bVar, "pin.aggregated_pin_data()", "aggregatedpindata.id", "aggregatedpindata.pin_tags", "aggregatedpindata.is_shop_the_look");
        n60.o.w(bVar, "aggregatedpindata.pin_tags_chips", "aggregatedpindata.aggregated_stats", "aggregatedpindata.did_it_data", "aggregatedpindata.comment_count");
        bVar.e("aggregatedpindata.is_stela");
    }

    public static final Date g0(Bundle bundle, String str, Date dateBase) {
        long parseLong;
        Intrinsics.checkNotNullParameter(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        parseLong = ((Number) obj).longValue();
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((parseLong * 1000) + dateBase.getTime());
    }

    public static final boolean g1(Uri uri) {
        return uri != null && (kotlin.text.z.i("http", uri.getScheme(), true) || kotlin.text.z.i("https", uri.getScheme(), true) || kotlin.text.z.i("fbstaging", uri.getScheme(), true));
    }

    public static void h(x92.b bVar) {
        n00.d.f88768a.b(bVar);
        bVar.e("user.is_verified_merchant");
    }

    public static final yk1.m h0(PinterestRecyclerView pinterestRecyclerView, int i13) {
        View view;
        Intrinsics.checkNotNullParameter(pinterestRecyclerView, "<this>");
        RecyclerView recyclerView = pinterestRecyclerView.f52531a;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "getRecyclerView(...)");
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        y2 S0 = recyclerView.S0(i13);
        if (S0 == null || (view = S0.f19717a) == null) {
            return null;
        }
        yk1.j a13 = yk1.j.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        a13.getClass();
        return yk1.j.b(view);
    }

    public static final ArrayList h1(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        if (length > 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                arrayList.add(jsonArray.getString(i13));
                if (i14 >= length) {
                    break;
                }
                i13 = i14;
            }
        }
        return arrayList;
    }

    public static void i(x92.b bVar) {
        n60.o.w(bVar, "user.id", "user.full_name", "user.is_default_image", "user.type");
        bVar.e("user.is_partner");
        bVar.e("user.is_private_profile");
    }

    public static final int i0(lb0.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return qVar.g("PREF_DARK_MODE", Build.VERSION.SDK_INT <= 28 ? 3 : -1);
    }

    public static final HashMap i1(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final pq2.c1 j(pq2.c1 c1Var, rz.c adapterFactory) {
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
        pq2.c1 c1Var2 = new pq2.c1(c1Var.d());
        c1Var2.a(adapterFactory);
        Intrinsics.checkNotNullExpressionValue(c1Var2, "addCallAdapterFactory(...)");
        return c1Var2;
    }

    public static final JSONObject j0() {
        if (p001if.a.b(j1.class)) {
            return null;
        }
        try {
            String string = le.v.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th3) {
            p001if.a.a(j1.class, th3);
            return null;
        }
    }

    public static com.google.common.util.concurrent.d0 j1(ExecutorService executorService) {
        if (executorService instanceof com.google.common.util.concurrent.d0) {
            return (com.google.common.util.concurrent.d0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new com.google.common.util.concurrent.j0((ScheduledExecutorService) executorService) : new com.google.common.util.concurrent.g0(executorService);
    }

    public static final void k(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        dl2.b.l(bVar);
        bVar.e("board.pin_count");
        bVar.e("board.automagical_board_metadata");
        g2 d2 = g2.f83370b.d();
        z3 activate = a4.f83297a;
        lh0.z0 z0Var = d2.f83373a;
        lh0.g1 g1Var = (lh0.g1) z0Var;
        if (!g1Var.o("android_boards_gg_unification", "enabled", activate) && !g1Var.l("android_boards_gg_unification")) {
            Intrinsics.checkNotNullParameter("enabled", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            if (!((lh0.g1) z0Var).o("homefeed_featured_boards_module_experiment", "enabled", activate)) {
                Intrinsics.checkNotNullParameter("employees", "group");
                Intrinsics.checkNotNullParameter(activate, "activate");
                if (!((lh0.g1) z0Var).o("homefeed_featured_boards_module_experiment", "employees", activate)) {
                    return;
                }
            }
        }
        bVar.e("board.collaborator_count");
        bVar.e("user.verified_identity");
    }

    public static String k0(String str) {
        if (str == null) {
            return "";
        }
        try {
            String S = S(str);
            String host = new URI(S).getHost();
            if (!pk.a0.x0(host)) {
                return host.startsWith("www.") ? host.substring(4) : host;
            }
            String replace = S.replace("https://", "").replace("http://", "");
            if (replace.startsWith("www.")) {
                replace = replace.replaceFirst("www.", "");
            }
            return replace.contains("/") ? replace.split("/")[0] : replace;
        } catch (URISyntaxException e13) {
            ((tb0.h) ob0.b.f93978b).o("PStringUtils:GetDomainName", e13);
            return "";
        }
    }

    public static final void k1(nx.d0 pinalytics, AbstractList permissionIds, String feature, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(permissionIds, "permissionIds");
        Intrinsics.checkNotNullParameter(feature, "feature");
        h32.f1 f1Var = h32.f1.PERMISSIONS_REQUEST;
        Intrinsics.checkNotNullParameter(permissionIds, "<this>");
        LinkedHashMap h10 = kotlin.collections.z0.h(new Pair("permissions_requests", CollectionsKt.Z(permissionIds, ",", null, null, 0, null, ny1.q.f92689j, 30)), new Pair("permissions_feature", feature));
        if (hashMap != null) {
            h10.putAll(hashMap);
        }
        Unit unit = Unit.f80348a;
        pinalytics.g(f1Var, null, new HashMap(h10), false);
    }

    public static final boolean l(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return !(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f);
    }

    public static le.a0 l0(String str) {
        String str2;
        Bundle bundle = new Bundle();
        Date date = AccessToken.f29844l;
        AccessToken s13 = wc.j.s();
        if (s13 == null || (str2 = s13.f29857k) == null) {
            str2 = "facebook";
        }
        bundle.putString("fields", Intrinsics.d(str2, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        le.a0 a0Var = new le.a0(null, "me", null, null, new le.c(null, 1));
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        a0Var.f83009d = bundle;
        a0Var.l(le.f0.GET);
        return a0Var;
    }

    public static final void l1(nx.d0 pinalytics, List permissionIds, int[] grantResults, String feature) {
        vd0.c cVar;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(permissionIds, "permissionIds");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        Intrinsics.checkNotNullParameter(feature, "feature");
        if (grantResults.length == 0) {
            cVar = new vd0.c();
            Iterator it = permissionIds.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Intrinsics.checkNotNullParameter(str, "<this>");
                cVar.t(StringsKt.c0(str, "."), V1(-3));
            }
        } else if (permissionIds.size() == grantResults.length) {
            vd0.c cVar2 = new vd0.c();
            int i13 = 0;
            for (Object obj : permissionIds) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                String str2 = (String) obj;
                Intrinsics.checkNotNullParameter(str2, "<this>");
                cVar2.t(StringsKt.c0(str2, "."), V1(grantResults[i13]));
                i13 = i14;
            }
            cVar = cVar2;
        } else {
            cVar = new vd0.c();
        }
        pinalytics.g(h32.f1.PERMISSIONS_RESULT, null, new HashMap(kotlin.collections.z0.g(new Pair("permissions_results", cVar.f125623a.toString()), new Pair("permissions_feature", feature))), false);
    }

    public static final void m(Context context, String text) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(text);
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public static final void m0(final i1 callback, final String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JSONObject a13 = b1.a(accessToken);
        if (a13 != null) {
            callback.w(a13);
            return;
        }
        le.x xVar = new le.x() { // from class: df.g1
            @Override // le.x
            public final void a(le.e0 response) {
                i1 callback2 = i1.this;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                String accessToken2 = accessToken;
                Intrinsics.checkNotNullParameter(accessToken2, "$accessToken");
                Intrinsics.checkNotNullParameter(response, "response");
                FacebookRequestError facebookRequestError = response.f83046c;
                if (facebookRequestError != null) {
                    callback2.K(facebookRequestError.f29913i);
                    return;
                }
                ConcurrentHashMap concurrentHashMap = b1.f54717a;
                JSONObject jSONObject = response.f83047d;
                if (jSONObject == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                b1.b(accessToken2, jSONObject);
                callback2.w(jSONObject);
            }
        };
        le.a0 l03 = l0(accessToken);
        l03.k(xVar);
        l03.e();
    }

    public static final String m1(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            Intrinsics.checkNotNullExpressionValue(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static void n(JSONObject jSONObject, c cVar, String str, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !S0(context)) {
            jSONObject.put("anon_id", str);
        } else {
            if (cVar.f54723e) {
                return;
            }
            jSONObject.put("anon_id", str);
        }
    }

    public static final int n0(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        l2 l2Var = recyclerView.f19242n;
        if (l2Var != null) {
            return eb2.j.c(l2Var, null);
        }
        return -1;
    }

    public static nm.s n1(Reader reader) {
        try {
            um.a aVar = new um.a(reader);
            nm.s o13 = o1(aVar);
            o13.getClass();
            if (!(o13 instanceof nm.t) && aVar.K() != um.b.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return o13;
        } catch (MalformedJsonException e13) {
            throw new JsonSyntaxException((Throwable) e13);
        } catch (IOException e14) {
            throw new JsonIOException((Throwable) e14);
        } catch (NumberFormatException e15) {
            throw new JsonSyntaxException((Throwable) e15);
        }
    }

    public static void o(JSONObject jSONObject, c cVar, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !S0(context)) {
            jSONObject.put("attribution", cVar.f54721c);
        } else {
            if (cVar.f54723e) {
                return;
            }
            jSONObject.put("attribution", cVar.f54721c);
        }
    }

    public static final int o0(String str, String stringToCompareDistance) {
        int i13;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(stringToCompareDistance, "stringToCompareDistance");
        if (Intrinsics.d(str, stringToCompareDistance)) {
            return 0;
        }
        if (Intrinsics.d(str, "")) {
            return stringToCompareDistance.length();
        }
        if (Intrinsics.d(stringToCompareDistance, "")) {
            return str.length();
        }
        int length = stringToCompareDistance.length() + 1;
        int[] iArr = new int[length];
        for (int i14 = 0; i14 < length; i14++) {
            iArr[i14] = i14;
        }
        int[] iArr2 = new int[stringToCompareDistance.length() + 1];
        int length2 = str.length();
        int i15 = 0;
        while (i15 < length2) {
            int i16 = i15 + 1;
            iArr2[0] = i16;
            int length3 = stringToCompareDistance.length();
            int i17 = 0;
            while (i17 < length3) {
                int i18 = i17 + 1;
                iArr2[i18] = Math.min(iArr2[i17] + 1, Math.min(iArr[i18] + 1, iArr[i17] + (str.charAt(i15) == stringToCompareDistance.charAt(i17) ? 0 : 1)));
                i17 = i18;
            }
            int length4 = stringToCompareDistance.length();
            if (length4 >= 0) {
                while (true) {
                    iArr[i13] = iArr2[i13];
                    i13 = i13 != length4 ? i13 + 1 : 0;
                }
            }
            i15 = i16;
        }
        return iArr2[stringToCompareDistance.length()];
    }

    public static nm.s o1(um.a aVar) {
        nm.b0 b0Var = aVar.f122652b;
        if (b0Var == nm.b0.LEGACY_STRICT) {
            aVar.O(nm.b0.LENIENT);
        }
        try {
            try {
                return com.bumptech.glide.d.q0(aVar);
            } catch (OutOfMemoryError e13) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e13);
            } catch (StackOverflowError e14) {
                throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e14);
            }
        } finally {
            aVar.O(b0Var);
        }
    }

    public static final boolean p(Object obj, Object obj2) {
        return obj == null ? obj2 == null : Intrinsics.d(obj, obj2);
    }

    public static final Method p0(Class clazz, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static nm.s p1(String str) {
        return n1(new StringReader(str));
    }

    public static void q(fn.i iVar) {
        if (iVar.f62597g) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static final Method q0(String className, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> cls = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(className)");
            return p0(cls, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Bundle q1(String str) {
        List split$default;
        List split$default2;
        Bundle bundle = new Bundle();
        if (!V0(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            split$default = StringsKt__StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, null);
            Object[] array = split$default.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i13 = 0;
            while (i13 < length) {
                String str2 = strArr[i13];
                i13++;
                split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, null);
                Object[] array2 = split$default2.toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    le.v vVar = le.v.f83104a;
                }
            }
        }
        return bundle;
    }

    public static final void r(GestaltIndicator gestaltIndicator, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltIndicator, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        um1.d dVar = new um1.d((um1.b) ((u50.o) gestaltIndicator.f49409a.f33803a));
        init.invoke(dVar);
        gestaltIndicator.i(new hk1.t(dVar, 10));
    }

    public static final int r0(boolean z13) {
        return z13 ? 2 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r1(Bundle bundle, JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (jSONArray instanceof Boolean) {
            bundle.putBoolean("media", ((Boolean) jSONArray).booleanValue());
            return;
        }
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Double) {
            bundle.putDouble("media", ((Number) jSONArray).doubleValue());
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Integer) {
            bundle.putInt("media", ((Number) jSONArray).intValue());
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
            return;
        }
        if (jSONArray instanceof Long) {
            bundle.putLong("media", ((Number) jSONArray).longValue());
            return;
        }
        if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else if (jSONArray instanceof String) {
            bundle.putString("media", (String) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    public static final String s0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String r43 = f30Var.r4();
        if (r43 != null && r43.length() != 0) {
            return f30Var.r4();
        }
        if (b40.l0(f30Var)) {
            return b40.S(f30Var);
        }
        return null;
    }

    public static final void s1(nx.z0 z0Var, String key, String str) {
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str != null) {
            z0Var.put(key, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((!r0.isEmpty()) == true) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Integer t0(com.pinterest.api.model.f30 r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Map r0 = r3.A4()
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 != r2) goto L15
            goto L16
        L15:
            r2 = r1
        L16:
            java.util.List r3 = com.pinterest.api.model.b40.f(r3)
            if (r3 == 0) goto L20
            int r1 = r3.size()
        L20:
            int r2 = r2 + r1
            if (r2 != 0) goto L25
            r3 = 0
            goto L29
        L25:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
        L29:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df.j1.t0(com.pinterest.api.model.f30):java.lang.Integer");
    }

    public static final HashMap t1(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i13 = 0;
            do {
                i13++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                }
            } while (i13 < readInt);
        }
        return hashMap;
    }

    public static final Uri u(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public static final ScreenLocation u0(String enumClass, String screenLocation) {
        Intrinsics.checkNotNullParameter(enumClass, "enumClass");
        Intrinsics.checkNotNullParameter(screenLocation, "screenLocation");
        try {
            Object[] enumConstants = Class.forName(enumClass).getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
            for (Object obj : enumConstants) {
                if (Intrinsics.d(screenLocation, obj.toString())) {
                    return (ScreenLocation) obj;
                }
            }
        } catch (Exception unused) {
            if (((Boolean) ff0.i.f62102a.getValue()).booleanValue() || Intrinsics.d("robolectric", Build.FINGERPRINT)) {
                return s82.c.f111949a;
            }
        }
        throw new IllegalArgumentException(a.a.D(screenLocation, " not found in ", enumClass));
    }

    public static final String u1(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th3;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th4) {
                th3 = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            bufferedInputStream = null;
            th3 = th5;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb3 = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    String sb4 = sb3.toString();
                    Intrinsics.checkNotNullExpressionValue(sb4, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                    z(bufferedInputStream);
                    z(inputStreamReader);
                    return sb4;
                }
                sb3.append(cArr, 0, read);
            }
        } catch (Throwable th6) {
            th3 = th6;
            z(bufferedInputStream);
            z(inputStreamReader);
            throw th3;
        }
    }

    public static final void v(Object obj, Object obj2, Function1 getValue, Function1 applyValue) {
        Intrinsics.checkNotNullParameter(getValue, "getValue");
        Intrinsics.checkNotNullParameter(applyValue, "applyValue");
        Object invoke = obj != null ? getValue.invoke(obj) : null;
        Object invoke2 = getValue.invoke(obj2);
        if (Intrinsics.d(invoke2, invoke)) {
            return;
        }
        applyValue.invoke(invoke2);
    }

    public static final Object v0(String str, String str2, JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object opt = jsonObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 == null) {
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(str2, opt);
        return jSONObject;
    }

    public static Executor v1(Executor executor, com.google.common.util.concurrent.s sVar) {
        executor.getClass();
        return executor == com.google.common.util.concurrent.r.INSTANCE ? executor : new com.google.common.util.concurrent.f0(executor, sVar);
    }

    public static final boolean w(Object obj, Object obj2, Function1 getValue) {
        Intrinsics.checkNotNullParameter(getValue, "getValue");
        return !Intrinsics.d(obj2 != null ? getValue.invoke(obj2) : null, getValue.invoke(obj));
    }

    public static final g92.d w0(int i13, Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i13, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String upperCase = charSequence.toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            g92.d valueOf = g92.d.valueOf(upperCase);
            if (valueOf != null) {
                return valueOf;
            }
        }
        return g92.d.CLASSIC;
    }

    public static final Type w1(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.f(upperBounds);
            if (!(!(upperBounds.length == 0))) {
                return Object.class;
            }
            Type type2 = upperBounds[0];
            Intrinsics.f(type2);
            return type2;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments.length;
        for (int i13 = 0; i13 < length; i13++) {
            Type type3 = actualTypeArguments[i13];
            if (type3 instanceof WildcardType) {
                Intrinsics.g(type3, "null cannot be cast to non-null type java.lang.reflect.WildcardType");
                Type[] upperBounds2 = ((WildcardType) type3).getUpperBounds();
                Intrinsics.f(upperBounds2);
                if (!(upperBounds2.length == 0)) {
                    actualTypeArguments[i13] = upperBounds2[0];
                } else {
                    actualTypeArguments[i13] = Object.class;
                }
            }
            Type type4 = actualTypeArguments[i13];
            Intrinsics.checkNotNullExpressionValue(type4, "get(...)");
            actualTypeArguments[i13] = w1(type4);
        }
        Type ownerType = parameterizedType.getOwnerType();
        Type rawType = parameterizedType.getRawType();
        Intrinsics.g(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        pm.b bVar = new pm.b(ownerType, (Class) rawType, (Type[]) Arrays.copyOf(actualTypeArguments, actualTypeArguments.length));
        Intrinsics.checkNotNullExpressionValue(bVar, "newParameterizedTypeWithOwner(...)");
        return bVar;
    }

    public static void x(Context context, String str) {
        List split$default;
        List split$default2;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        split$default = StringsKt__StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, null);
        Object[] array = split$default.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i13 = 0;
        while (i13 < length) {
            String str2 = strArr[i13];
            i13++;
            split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, null);
            Object[] array2 = split$default2.toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i14 = 0;
                boolean z13 = false;
                while (i14 <= length2) {
                    boolean z14 = Intrinsics.i(str3.charAt(!z13 ? i14 : length2), 32) <= 0;
                    if (z13) {
                        if (!z14) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z14) {
                        i14++;
                    } else {
                        z13 = true;
                    }
                }
                cookieManager.setCookie(str, Intrinsics.n("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;", str3.subSequence(i14, length2 + 1).toString()));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public static final g92.d x0(Resources.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        return w0(zm1.a.pinterest_theme, theme);
    }

    public static final void x1(Runnable runnable) {
        try {
            le.v.d().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final void y(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            x(context, "facebook.com");
            x(context, ".facebook.com");
            x(context, "https://facebook.com");
            x(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static String y0(String str) {
        if (pk.a0.x0(str)) {
            return null;
        }
        Pattern pattern = Patterns.WEB_URL;
        Matcher matcher = pattern.matcher(str);
        String group = matcher.find() ? matcher.group(0) : "";
        if (pk.a0.x0(group)) {
            return null;
        }
        String guessUrl = URLUtil.guessUrl(group);
        if (pattern.matcher(guessUrl).matches()) {
            return guessUrl;
        }
        return null;
    }

    public static final float y1(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDisplayMetrics().densityDpi / 160;
    }

    public static final void z(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final bc2.l z0(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean b53 = f30Var.b5();
        Intrinsics.checkNotNullExpressionValue(b53, "getIsPremiere(...)");
        if (b53.booleanValue()) {
            return bc2.l.PREMIERE;
        }
        Boolean Q5 = f30Var.Q5();
        Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
        if (Q5.booleanValue()) {
            return bc2.l.PROMOTED_MAX;
        }
        Boolean S5 = f30Var.S5();
        Intrinsics.checkNotNullExpressionValue(S5, "getPromotedIsQuiz(...)");
        if (S5.booleanValue()) {
            return bc2.l.PROMOTED_QUIZ;
        }
        Boolean S4 = f30Var.S4();
        Intrinsics.checkNotNullExpressionValue(S4, "getIsFullWidth(...)");
        if (S4.booleanValue() && n60.o.B(f30Var, "getIsPromoted(...)")) {
            return bc2.l.FULL_WIDTH_PROMOTED;
        }
        Boolean S42 = f30Var.S4();
        Intrinsics.checkNotNullExpressionValue(S42, "getIsFullWidth(...)");
        if (S42.booleanValue()) {
            return bc2.l.FULL_WIDTH_ORGANIC;
        }
        if (!n60.o.B(f30Var, "getIsPromoted(...)")) {
            Boolean F4 = f30Var.F4();
            Intrinsics.checkNotNullExpressionValue(F4, "getIsDownstreamPromotion(...)");
            if (!F4.booleanValue()) {
                Set set = b40.f35967a;
                Intrinsics.checkNotNullParameter(f30Var, "<this>");
                h32.l0 l0Var = h32.n0.Companion;
                Integer d43 = f30Var.d4();
                Intrinsics.checkNotNullExpressionValue(d43, "getDestinationURLType(...)");
                int intValue = d43.intValue();
                l0Var.getClass();
                h32.n0 a13 = h32.l0.a(intValue);
                if (a13 == null || a13 != h32.n0.STORY_PIN) {
                    return bc2.l.ORGANIC;
                }
            }
        }
        return bc2.l.AD;
    }

    public static final void z1(JSONObject params, c cVar, String str, boolean z13, Context context) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        y yVar = y.f54881a;
        v vVar = v.ServiceUpdateCompliance;
        if (!y.b(vVar)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z13);
        le.v vVar2 = le.v.f83104a;
        params.put("advertiser_id_collection_enabled", le.o0.a());
        if (cVar != null) {
            if (y.b(vVar)) {
                n(params, cVar, str, context);
            }
            if (cVar.f54721c != null) {
                if (y.b(vVar)) {
                    o(params, cVar, context);
                } else {
                    params.put("attribution", cVar.f54721c);
                }
            }
            if (cVar.a() != null) {
                params.put("advertiser_id", cVar.a());
                params.put("advertiser_tracking_enabled", !cVar.f54723e);
            }
            if (!cVar.f54723e) {
                me.w wVar = me.w.f87032a;
                String str2 = null;
                if (!p001if.a.b(me.w.class)) {
                    try {
                        boolean z14 = me.w.f87035d.get();
                        me.w wVar2 = me.w.f87032a;
                        if (!z14) {
                            wVar2.b();
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.putAll(me.w.f87036e);
                        hashMap.putAll(wVar2.a());
                        str2 = m1(hashMap);
                    } catch (Throwable th3) {
                        p001if.a.a(me.w.class, th3);
                    }
                }
                if (str2.length() != 0) {
                    params.put("ud", str2);
                }
            }
            Object obj = cVar.f54722d;
            if (obj != null) {
                params.put("installer_package", obj);
            }
        }
    }

    public com.google.android.gms.common.api.c s(Context context, Looper looper, jh.g gVar, com.google.android.gms.common.api.b bVar, com.google.android.gms.common.api.g gVar2, com.google.android.gms.common.api.h hVar) {
        return t(context, looper, gVar, bVar, gVar2, hVar);
    }

    public abstract jh.h t(Context context, Looper looper, jh.g gVar, com.google.android.gms.common.api.b bVar, com.google.android.gms.common.api.internal.e eVar, com.google.android.gms.common.api.internal.n nVar);
}
