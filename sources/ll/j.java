package ll;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdSize;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.bv0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fv0;
import com.pinterest.api.model.jv0;
import com.pinterest.api.model.ms0;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.nv0;
import com.pinterest.api.model.ps0;
import com.pinterest.api.model.pu0;
import com.pinterest.api.model.sa;
import com.pinterest.api.model.ta;
import com.pinterest.api.model.tu0;
import com.pinterest.api.model.vv0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import df.j1;
import f72.t0;
import g72.x4;
import h32.v2;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.security.SecurityException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kh2.p2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.s0;
import net.quikkly.android.Quikkly;
import net.quikkly.core.QuikklyCore;
import org.json.JSONException;
import org.json.JSONObject;
import r72.a2;
import r72.b2;
import r72.c2;
import r72.d2;
import r72.e1;
import r72.e2;
import r72.i2;
import r72.k0;
import r72.l1;
import r72.l2;
import r72.q1;
import r72.u1;
import r72.x0;
import r72.y0;
import r72.y1;
import so.oa;
import t3.s1;

/* loaded from: classes3.dex */
public final class j implements vm.d, in.b, SigningKeyResolver, yn.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83753a;

    /* renamed from: b, reason: collision with root package name */
    public Object f83754b;

    public j(int i13) {
        this.f83753a = i13;
        if (i13 == 9) {
            this.f83754b = new an.h(0);
            return;
        }
        if (i13 == 11) {
            this.f83754b = new int[2];
        } else if (i13 != 13) {
            this.f83754b = null;
        } else {
            this.f83754b = new z.a(10);
        }
    }

    public static j F(int i13) {
        return new j(ml.a.a(jk.r.s(i13)), 3);
    }

    public static boolean H(SendableObject sendableObject) {
        if (sendableObject == null) {
            return false;
        }
        return ((sendableObject.f35129c == 2) && ((b60.d) ((oa) ((yq.a) yq.c.f139630a.getValue())).l2()).f().getUid().equals(sendableObject.d())) || sendableObject.e();
    }

    public static u1 K(pu0 pu0Var, String value, x0 x0Var, Size size, double d2) {
        l1 u13 = u(pu0Var, size.getWidth(), size.getHeight());
        u1 u1Var = u1.f106668t;
        int i13 = a2.f106437b;
        Intrinsics.checkNotNullParameter(value, "value");
        l1 l1Var = new l1(u13.f106535a * d2, u13.f106536b * d2);
        k0 k0Var = k0.f106512o;
        Intrinsics.checkNotNullParameter(value, "value");
        return u1.f(u1Var, value, l1Var, d2, 0.0d, k0.a(k0Var, false, false, false, false, 0.0f, null, null, null, null, 0.0d, 0.0d, value, 8191), x0Var, null, null, null, null, null, null, null, 262088);
    }

    public static Size d(j jVar, pu0 pu0Var, Size size) {
        jVar.getClass();
        Double s13 = pu0Var.s();
        Intrinsics.checkNotNullExpressionValue(s13, "getRelatedRectFrameWidth(...)");
        double d2 = 1.0f;
        int b13 = ml2.c.b(s13.doubleValue() * size.getWidth() * d2);
        Double v13 = pu0Var.v();
        Intrinsics.checkNotNullExpressionValue(v13, "getRelatedRectRameHeight(...)");
        return new Size(b13, ml2.c.b(v13.doubleValue() * size.getHeight() * d2));
    }

    public static final boolean e(j jVar, String str) {
        jVar.getClass();
        return Intrinsics.d(str, "permissions") || Intrinsics.d(str, "permissions-biz");
    }

    public static j h(byte[] bArr, uk.l lVar) {
        if (lVar != null) {
            return new j(ml.a.a(bArr), 3);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static String i(String str) {
        if (str.length() == 6) {
            return a.a.k("#", str, "FF");
        }
        if (str.length() != 8) {
            return str;
        }
        return a.a.k("#", kotlin.text.e0.D(2, str), kotlin.text.e0.z(2, str));
    }

    public static j j(BigInteger bigInteger) {
        return new j(bigInteger, 2);
    }

    public static String m(Context context, int i13) {
        Object obj = d5.a.f53679a;
        return j1.T("#%06X", Integer.valueOf(context.getColor(i13) & 16777215));
    }

    public static String n(String code, lb0.r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        String str = "";
        if (code != null) {
            vd0.c e13 = lb0.g.e("COUNTRIES");
            if (e13 != null) {
                str = e13.o(code, "");
                Intrinsics.checkNotNullExpressionValue(str, "optString(...)");
            }
            if (str.length() == 0) {
                List list = m60.e0.f85899a;
                Intrinsics.checkNotNullParameter(code, "code");
                String displayCountry = new Locale(Locale.getDefault().getLanguage(), code).getDisplayCountry();
                Intrinsics.checkNotNullExpressionValue(displayCountry, "getDisplayCountry(...)");
                str = displayCountry;
            }
            List list2 = m60.e0.f85899a;
            Intrinsics.checkNotNullParameter(prefsManagerUser, "<this>");
            String d2 = prefsManagerUser.d("PREF_LOCALE_LANG", null);
            Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
            prefsManagerUser.b("PREF_LOCALE_LANG", d2);
            prefsManagerUser.b("PREF_LOCALE_COUNTRY", str);
        }
        return str;
    }

    public static os.g p(Context context) {
        int i13 = dl2.b.T1(context) ? s0.vr_pincode_share_icon : fz1.c.pin_code_icon;
        Object obj = d5.a.f53679a;
        return new os.g(context.getDrawable(i13), context.getString(fz1.f.pincode), "pincode");
    }

    public static Quikkly r(Context context) {
        try {
            if (!Quikkly.isConfigured()) {
                Quikkly.configureInstance(context, "blueprint_0080.json", 2, 0L);
            }
            QuikklyCore.checkLinking();
            return Quikkly.getInstance();
        } catch (Throwable th3) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.p(th3);
            return null;
        }
    }

    public static boolean t() {
        ArrayList arrayList = new ArrayList();
        for (String str : Build.SUPPORTED_ABIS) {
            arrayList.add(str);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.contains("arm-v7") || str2.contains("armeabi-v7a") || str2.contains("arm64-v8") || str2.contains("x86")) {
                return true;
            }
        }
        return false;
    }

    public static l1 u(pu0 pu0Var, int i13, int i14) {
        float doubleValue = ((float) pu0Var.s().doubleValue()) * i13;
        float doubleValue2 = ((float) pu0Var.v().doubleValue()) * i14;
        double doubleValue3 = pu0Var.t().doubleValue() * i13;
        double doubleValue4 = pu0Var.u().doubleValue() * i14;
        int i15 = com.pinterest.shuffles.scene.composer.z.f52181a;
        Size size = new Size(i13, i14);
        float f13 = 2;
        PointF b13 = com.pinterest.shuffles.scene.composer.z.b(size, (float) (doubleValue3 + (doubleValue / f13)), (float) (doubleValue4 + (doubleValue2 / f13)));
        return new l1(b13.x, b13.y);
    }

    public static v2 x(j jVar, String str, int i13, int i14, String str2, Long l13, Short sh3, int i15) {
        int i16 = (i15 & 4) != 0 ? 0 : i14;
        Long l14 = (i15 & 16) != 0 ? null : l13;
        Short sh4 = (i15 & 32) != 0 ? null : sh3;
        v2 source = (v2) jVar.f83754b;
        if (source == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        v2 v2Var = new v2(l14, source.f67312b, str, Long.valueOf(System.currentTimeMillis() * 1000000), sh4, Short.valueOf((short) i13), Short.valueOf((short) i16), source.f67318h, source.f67319i, str2);
        jVar.f83754b = null;
        return v2Var;
    }

    @Override // vm.d
    public final xm.b A(String str, vm.a aVar, int i13, int i14, Map map) {
        if (aVar == vm.a.UPC_A) {
            return ((an.h) this.f83754b).A("0".concat(String.valueOf(str)), vm.a.EAN_13, i13, i14, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }

    public final void B() {
        g(al1.k.f15489i);
    }

    public final void C(Function1 shouldStopDismissingAt) {
        Intrinsics.checkNotNullParameter(shouldStopDismissingAt, "shouldStopDismissingAt");
        g(new al1.j(1, shouldStopDismissingAt));
    }

    public final void D(Function1 shouldStopDismissingAt, String bundleId, Bundle bundle) {
        Intrinsics.checkNotNullParameter(shouldStopDismissingAt, "shouldStopDismissingAt");
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        g(new ed1.m(shouldStopDismissingAt, bundleId, bundle, 24));
    }

    public final void E(String bundleId, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        g(new oh1.u(27, bundleId, bundle));
    }

    public final ECPublicKey G(JwsHeader jwsHeader) {
        rn.b a13;
        wn.g gVar;
        xn.e eVar = (xn.e) this.f83754b;
        rn.b a14 = eVar.a();
        if (a14.d()) {
            a13 = eVar.f135427b.a(Uri.parse(((wn.i) a14.c()).f130453d), Collections.emptyMap(), Collections.emptyMap(), xn.e.f135425h);
            if (!a13.d()) {
                Log.e("LineAuthApiClient", "getJWKSet failed: " + a13);
            }
        } else {
            a13 = rn.b.a(a14.f108809a, a14.f108811c);
        }
        if (!a13.d()) {
            Log.e("OpenIdSignKeyResolver", "failed to get LINE JSON Web Key Set [JWK] document.");
            return null;
        }
        wn.h hVar = (wn.h) a13.c();
        String keyId = jwsHeader.getKeyId();
        Iterator it = hVar.f130449a.iterator();
        while (true) {
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = (wn.g) it.next();
            if (TextUtils.equals(gVar.f130445d, keyId)) {
                break;
            }
        }
        if (gVar == null) {
            Log.e("OpenIdSignKeyResolver", "failed to find Key by Id: " + keyId);
            return null;
        }
        String algorithm = jwsHeader.getAlgorithm();
        if (!SignatureAlgorithm.forName(algorithm).isEllipticCurve()) {
            throw new SecurityException(s1.b("Unsupported signature algorithm '", algorithm, '\''));
        }
        String str = gVar.f130446e;
        BigInteger bigInteger = new BigInteger(1, Base64.decode(gVar.f130447f, 8));
        BigInteger bigInteger2 = new BigInteger(1, Base64.decode(gVar.f130448g, 8));
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            ECPoint eCPoint = new ECPoint(bigInteger, bigInteger2);
            gq2.a I = kg.t.I(str);
            return (ECPublicKey) keyFactory.generatePublic(new ECPublicKeySpec(eCPoint, new gq2.b(I.f65981a, I.f65982b, I.f65983c)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e13) {
            Log.e("OpenIdSignKeyResolver", "failed to generate EC Public Key from JWK: " + gVar, e13);
            return null;
        }
    }

    public final int I() {
        switch (this.f83753a) {
            case 3:
                return ((ml.a) this.f83754b).f87434a.length;
            default:
                return ((com.google.protobuf.l) this.f83754b).size();
        }
    }

    public final byte[] J(uk.l lVar) {
        if (lVar != null) {
            return ((ml.a) this.f83754b).b();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:9|(9:11|(2:13|(1:15))(1:29)|16|(1:18)(1:28)|19|(1:21)|22|23|24)|30|16|(0)(0)|19|(0)|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        el.a.k("Error with setting output device status", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject a(android.view.View r6) {
        /*
            r5 = this;
            int r0 = r5.f83753a
            r1 = 1
            r2 = 0
            switch(r0) {
                case 10: goto L2a;
                default: goto L7;
            }
        L7:
            if (r6 != 0) goto Le
            org.json.JSONObject r6 = kn.b.a(r2, r2, r2, r2)
            goto L29
        Le:
            int r0 = r6.getWidth()
            int r3 = r6.getHeight()
            java.lang.Object r4 = r5.f83754b
            int[] r4 = (int[]) r4
            r6.getLocationOnScreen(r4)
            java.lang.Object r6 = r5.f83754b
            int[] r6 = (int[]) r6
            r2 = r6[r2]
            r6 = r6[r1]
            org.json.JSONObject r6 = kn.b.a(r2, r6, r0, r3)
        L29:
            return r6
        L2a:
            org.json.JSONObject r6 = kn.b.a(r2, r2, r2, r2)
            fn.e r0 = kn.d.f80211a
            android.app.UiModeManager r0 = b7.c.f22032f
            if (r0 == 0) goto L3d
            int r0 = r0.getCurrentModeType()
            if (r0 == r1) goto L43
            r3 = 4
            if (r0 == r3) goto L40
        L3d:
            fn.c r0 = fn.c.OTHER
            goto L45
        L40:
            fn.c r0 = fn.c.CTV
            goto L45
        L43:
            fn.c r0 = fn.c.MOBILE
        L45:
            fn.c r3 = fn.c.CTV
            if (r0 == r3) goto L4c
            fn.e r0 = fn.e.UNKNOWN
            goto L4e
        L4c:
            fn.e r0 = kn.d.f80211a
        L4e:
            int[] r3 = kn.a.f80206a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            if (r0 == r1) goto L59
            r1 = r2
        L59:
            java.lang.String r0 = "noOutputDevice"
            r6.put(r0, r1)     // Catch: org.json.JSONException -> L5f
            goto L65
        L5f:
            r0 = move-exception
            java.lang.String r1 = "Error with setting output device status"
            el.a.k(r1, r0)
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.j.a(android.view.View):org.json.JSONObject");
    }

    public final void b(View view, JSONObject jSONObject, in.a aVar, boolean z13) {
        switch (this.f83753a) {
            case 10:
                ArrayList arrayList = new ArrayList();
                hn.c cVar = hn.c.f69594c;
                if (cVar != null) {
                    Collection unmodifiableCollection = Collections.unmodifiableCollection(cVar.f69596b);
                    IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
                    Iterator it = unmodifiableCollection.iterator();
                    while (it.hasNext()) {
                        View a13 = ((fn.i) it.next()).a();
                        if (a13 != null && a13.isAttachedToWindow() && a13.isShown()) {
                            View view2 = a13;
                            while (true) {
                                if (view2 == null) {
                                    View rootView = a13.getRootView();
                                    if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                        identityHashMap.put(rootView, rootView);
                                        float z14 = rootView.getZ();
                                        int size = arrayList.size();
                                        while (size > 0 && ((View) arrayList.get(size - 1)).getZ() > z14) {
                                            size--;
                                        }
                                        arrayList.add(size, rootView);
                                    }
                                } else {
                                    if (view2.getAlpha() == 0.0f) {
                                        break;
                                    }
                                    Object parent = view2.getParent();
                                    view2 = parent instanceof View ? (View) parent : null;
                                }
                            }
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ln.b) aVar).a((View) it2.next(), (in.b) this.f83754b, jSONObject);
                }
                break;
            default:
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i13 = 0;
                    if (!z13) {
                        while (i13 < viewGroup.getChildCount()) {
                            ((ln.b) aVar).a(viewGroup.getChildAt(i13), this, jSONObject);
                            i13++;
                        }
                        break;
                    } else {
                        HashMap hashMap = new HashMap();
                        while (i13 < viewGroup.getChildCount()) {
                            View childAt = viewGroup.getChildAt(i13);
                            ArrayList arrayList2 = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                hashMap.put(Float.valueOf(childAt.getZ()), arrayList2);
                            }
                            arrayList2.add(childAt);
                            i13++;
                        }
                        ArrayList arrayList3 = new ArrayList(hashMap.keySet());
                        Collections.sort(arrayList3);
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Iterator it4 = ((ArrayList) hashMap.get((Float) it3.next())).iterator();
                            while (it4.hasNext()) {
                                ((ln.b) aVar).a((View) it4.next(), this, jSONObject);
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    public final void f(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        g(new y01.l1(2, navigation));
    }

    public final void g(Function1 function1) {
        ((n82.b) this.f83754b).a(new al1.j(0, function1));
    }

    public final BigInteger k(uk.l lVar) {
        if (lVar != null) {
            return (BigInteger) this.f83754b;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final String l(String str) {
        int i13;
        if (str != null) {
            switch (str.hashCode()) {
                case -1757812958:
                    if (str.equals("consumer_good_product_or_service")) {
                        i13 = c52.e.business_type_consumer_good_product_service;
                        break;
                    }
                    break;
                case -1700892935:
                    if (str.equals("local_retail_store")) {
                        i13 = c52.e.business_type_local_retail_store;
                        break;
                    }
                    break;
                case -1455115807:
                    if (str.equals("local_service")) {
                        i13 = c52.e.business_type_local_service;
                        break;
                    }
                    break;
                case -693848725:
                    if (str.equals("publisher_or_media")) {
                        i13 = c52.e.business_type_publisher_or_media;
                        break;
                    }
                    break;
                case -632924225:
                    if (str.equals("online_retail_or_marketplace")) {
                        i13 = c52.e.business_type_online_retail_or_market_place;
                        break;
                    }
                    break;
                case -389989868:
                    if (str.equals("local_business")) {
                        i13 = c52.e.business_type_local_business;
                        break;
                    }
                    break;
                case -325728016:
                    if (str.equals(com.modiface.mfemakeupkit.a.f34389d)) {
                        i13 = c52.e.business_type_retailer;
                        break;
                    }
                    break;
                case -56575393:
                    if (str.equals("online_marketplace")) {
                        i13 = c52.e.business_type_online_marketplace;
                        break;
                    }
                    break;
                case -21322638:
                    if (str.equals("blogger")) {
                        i13 = c52.e.business_type_blogger;
                        break;
                    }
                    break;
                case 93997959:
                    if (str.equals("brand")) {
                        i13 = c52.e.business_type_brand;
                        break;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        i13 = c52.e.business_type_media;
                        break;
                    }
                    break;
                case 753904736:
                    if (str.equals("institution_or_non_prof")) {
                        i13 = c52.e.business_type_institution_or_non_prof;
                        break;
                    }
                    break;
                case 875077159:
                    if (str.equals("professional")) {
                        i13 = c52.e.business_type_professional;
                        break;
                    }
                    break;
                case 1034419578:
                    if (str.equals("public_figure")) {
                        i13 = c52.e.business_type_public_figure;
                        break;
                    }
                    break;
                case 1513653837:
                    if (str.equals("contractor_or_service_provider")) {
                        i13 = c52.e.business_type_contractor_service_provider;
                        break;
                    }
                    break;
                case 1576527361:
                    if (str.equals("not_sure")) {
                        i13 = c52.e.business_type_not_sure;
                        break;
                    }
                    break;
                case 1940896398:
                    if (str.equals("influencer_public_figure_or_celebrity")) {
                        i13 = c52.e.business_type_influencer_public_figure_or_celebrity;
                        break;
                    }
                    break;
            }
            return ((yk1.a) ((yk1.v) this.f83754b)).f139224a.getString(i13);
        }
        i13 = c52.e.business_type_other;
        return ((yk1.a) ((yk1.v) this.f83754b)).f139224a.getString(i13);
    }

    public final String o(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1626174665) {
                if (hashCode != -1278174388) {
                    if (hashCode == 3343885 && str.equals("male")) {
                        yk1.v vVar = (yk1.v) this.f83754b;
                        return ((yk1.a) vVar).f139224a.getString(m60.x0.signup_radio_male);
                    }
                } else if (str.equals("female")) {
                    yk1.v vVar2 = (yk1.v) this.f83754b;
                    return ((yk1.a) vVar2).f139224a.getString(m60.x0.signup_radio_female);
                }
            } else if (str.equals("unspecified") && str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final int q(long j13, ArrayList bitmaps) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        if (!bitmaps.isEmpty() && j13 >= 0) {
            if (!((nq) this.f83754b).getDurationConfig().i()) {
                j13 -= ((nq) this.f83754b).getDurationConfig().getStartTimeMs();
            }
            Iterator it = bitmaps.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                i13 += ((dw0.a) it.next()).f56410b;
            }
            long j14 = i13;
            if (j13 > j14) {
                j13 %= j14;
            }
            int i14 = 0;
            for (Object obj : bitmaps) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                j13 -= ((dw0.a) obj).f56410b;
                if (j13 <= 0) {
                    return i14;
                }
                i14 = i15;
            }
        }
        return 0;
    }

    @Override // io.jsonwebtoken.SigningKeyResolver
    public final Key resolveSigningKey(JwsHeader jwsHeader, Claims claims) {
        return G(jwsHeader);
    }

    @Override // yn.c
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final JSONObject c(InputStream inputStream) {
        try {
            return new JSONObject(((z.a) this.f83754b).c(inputStream));
        } catch (JSONException e13) {
            throw new IOException(e13);
        }
    }

    public final q1 v(x4 x4Var) {
        String str = x4Var != null ? x4Var.f64145a : null;
        e1 a13 = ((c72.p) this.f83754b).a(x4Var != null ? x4Var.f64147c : null);
        t0 t0Var = x4Var != null ? x4Var.f64146b : null;
        e2 e2Var = b2.f106444a;
        if (t0Var != null) {
            switch (c72.r.f26921a[t0Var.ordinal()]) {
                case 1:
                    break;
                case 2:
                    e2Var = c2.TimeLapse;
                    break;
                case 3:
                    e2Var = c2.Parallax;
                    break;
                case 4:
                    e2Var = d2.FairyDust;
                    break;
                case 5:
                    e2Var = d2.Sparkler;
                    break;
                case 6:
                    e2Var = d2.Fireworks;
                    break;
                case 7:
                    e2Var = d2.LightFrame;
                    break;
                case 8:
                    e2Var = d2.AnalogGrit;
                    break;
                case 9:
                    e2Var = d2.BitCrush;
                    break;
                case 10:
                    e2Var = d2.Butterflies;
                    break;
                case 11:
                    e2Var = d2.CityLights;
                    break;
                case 12:
                    e2Var = d2.EuphoriaGlitch;
                    break;
                case 13:
                    e2Var = d2.GlitterShower;
                    break;
                case 14:
                    e2Var = d2.HeavyRain;
                    break;
                case 15:
                    e2Var = d2.LightLeakColor;
                    break;
                case 16:
                    e2Var = d2.LightLeakMono;
                    break;
                case 17:
                    e2Var = d2.Snowglobe;
                    break;
                case 18:
                    e2Var = d2.Speed;
                    break;
                case 19:
                    e2Var = d2.Spotlights;
                    break;
                case 20:
                    e2Var = d2.Vhs;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return new q1(str, a13, e2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [an0.a] */
    public final an0.g w(ta template, List pins, String boardName, String userName, int i13, Size previewSize, boolean z13) {
        kotlin.collections.v vVar;
        String str;
        String str2;
        int i14;
        Size size;
        String str3;
        float f13;
        ta a13;
        float f14;
        ArrayList arrayList;
        float f15;
        float f16;
        String str4;
        String str5;
        int i15;
        PointF pointF;
        String str6;
        int i16;
        int rgb;
        Integer valueOf;
        Iterator it;
        Integer num;
        Integer num2;
        int i17;
        Typeface typeface;
        Iterator it2;
        ArrayList arrayList2;
        int i18;
        String str7;
        Integer num3;
        String str8;
        ArrayList arrayList3;
        Integer num4;
        an0.b bVar;
        bv0 bv0Var;
        int i19;
        kotlin.collections.v vVar2;
        Object obj;
        l2 l2Var;
        String str9;
        x0 e13;
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(pins, "pins");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(previewSize, "previewSize");
        Integer s13 = template.s();
        Intrinsics.checkNotNullExpressionValue(s13, "getFrameWidth(...)");
        int intValue = s13.intValue();
        Integer q13 = template.q();
        Intrinsics.checkNotNullExpressionValue(q13, "getFrameHeight(...)");
        Size size2 = new Size(intValue, q13.intValue());
        ArrayList C = kg.a.C(template);
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = C.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (hashSet.add(((pu0) next).q())) {
                arrayList4.add(next);
            }
        }
        int size3 = arrayList4.size();
        int size4 = pins.size();
        kotlin.collections.v vVar3 = new kotlin.collections.v(pins);
        if (size4 > 0 && size4 < size3) {
            for (int i23 = size4; i23 < size3; i23++) {
                vVar3.addLast(pins.get(i23 % size4));
            }
        }
        String w13 = z13 ? template.w() : null;
        an0.f.Companion.getClass();
        an0.f a14 = an0.e.a(w13);
        Intrinsics.checkNotNullParameter(template, "<this>");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        int i24 = a14 == null ? -1 : an0.l.f15678a[a14.ordinal()];
        if (i24 == 1) {
            vVar = vVar3;
            int i25 = 2;
            str = "getFrameWidth(...)";
            str2 = "<this>";
            String str10 = "build(...)";
            String str11 = "and ";
            i14 = 14;
            size = size2;
            String str12 = "by ";
            ArrayList arrayList5 = new ArrayList();
            float Y0 = p2.Y0(18);
            float X0 = p2.X0(18);
            float X02 = p2.X0(2);
            float Y02 = p2.Y0(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE);
            float X03 = p2.X0(100);
            List h10 = template.u().h();
            String str13 = "getTimelineObjects(...)";
            Intrinsics.checkNotNullExpressionValue(h10, str13);
            Iterator it4 = h10.iterator();
            int i26 = 0;
            while (true) {
                str3 = str13;
                if (it4.hasNext()) {
                    Object next2 = it4.next();
                    int i27 = i26 + 1;
                    if (i26 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    pu0 pu0Var = (pu0) next2;
                    Intrinsics.f(pu0Var);
                    arrayList5.add(pu0Var);
                    String str14 = str10;
                    String uuid = UUID.randomUUID().toString();
                    String str15 = str11;
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    String str16 = str12;
                    SizeF sizeF = new SizeF(p2.X0(350), p2.Y0(666));
                    PointF pointF2 = new PointF(0.0f, 0.0f);
                    Integer n13 = pu0Var.n();
                    Intrinsics.checkNotNullExpressionValue(n13, "getBeginFrame(...)");
                    int intValue2 = n13.intValue();
                    Integer o13 = pu0Var.o();
                    Intrinsics.checkNotNullExpressionValue(o13, "getEndFrame(...)");
                    arrayList5.add(p2.Q(uuid, sizeF, pointF2, intValue2, o13.intValue(), null, "00000033", 32));
                    if (i26 < 4) {
                        pointF = new PointF(X0, Y02);
                    } else if (i26 < 8) {
                        pointF = new PointF((((p2.X0(350) - X0) - X03) - X0) - X02, p2.Y0(333) - (Y0 / i25));
                    } else {
                        int i28 = i25;
                        if (i26 <= 12) {
                            pointF = new PointF(X0, (p2.Y0(666) - Y02) - Y0);
                            PointF pointF3 = new PointF(pointF.x + X0 + X02, pointF.y);
                            String v13 = kg.a.v();
                            SizeF sizeF2 = new SizeF(X0, Y0);
                            PointF pointF4 = new PointF(pointF.x, pointF.y);
                            Integer n14 = pu0Var.n();
                            Intrinsics.checkNotNullExpressionValue(n14, "getBeginFrame(...)");
                            int intValue3 = n14.intValue();
                            Integer o14 = pu0Var.o();
                            Intrinsics.checkNotNullExpressionValue(o14, "getEndFrame(...)");
                            arrayList5.add(p2.Q(v13, sizeF2, pointF4, intValue3, o14.intValue(), "https://s.pinimg.com/content-actionability/montage-templates/v1/ig_template/assets/images/pin_logo.png", null, 64));
                            String v14 = kg.a.v();
                            SizeF sizeF3 = new SizeF(X03, Y0);
                            f14 = X0;
                            ArrayList arrayList6 = arrayList5;
                            float f17 = Y0 / 3;
                            PointF pointF5 = new PointF(pointF3.x, pointF3.y - f17);
                            Integer n15 = pu0Var.n();
                            Intrinsics.checkNotNullExpressionValue(n15, "getBeginFrame(...)");
                            int intValue4 = n15.intValue();
                            Integer o15 = pu0Var.o();
                            Intrinsics.checkNotNullExpressionValue(o15, "getEndFrame(...)");
                            f16 = Y02;
                            f15 = X03;
                            str4 = str14;
                            str5 = str16;
                            i15 = 2;
                            arrayList = arrayList6;
                            arrayList.add(p2.R(v14, sizeF3, pointF5, intValue4, o15.intValue(), boardName, "Pinterest-UI-Pro-Bold", 50, "FFFFFF"));
                            String v15 = kg.a.v();
                            Y0 = Y0;
                            SizeF sizeF4 = new SizeF(f15, Y0);
                            PointF pointF6 = new PointF(pointF3.x, pointF3.y + f17);
                            Integer n16 = pu0Var.n();
                            Intrinsics.checkNotNullExpressionValue(n16, "getBeginFrame(...)");
                            int intValue5 = n16.intValue();
                            Integer o16 = pu0Var.o();
                            Intrinsics.checkNotNullExpressionValue(o16, "getEndFrame(...)");
                            arrayList.add(p2.R(v15, sizeF4, pointF6, intValue5, o16.intValue(), a.a.j("@", userName), "Pinterest-UI-Pro-Regular", 38, "FFFFFF"));
                            X03 = f15;
                            arrayList5 = arrayList;
                            i25 = i15;
                            X0 = f14;
                            i26 = i27;
                            str11 = str15;
                            str13 = str3;
                            str10 = str4;
                            str12 = str5;
                            Y02 = f16;
                        } else {
                            f14 = X0;
                            arrayList = arrayList5;
                            f15 = X03;
                            f16 = Y02;
                            str4 = str14;
                            str5 = str16;
                            i15 = i28;
                            X03 = f15;
                            arrayList5 = arrayList;
                            i25 = i15;
                            X0 = f14;
                            i26 = i27;
                            str11 = str15;
                            str13 = str3;
                            str10 = str4;
                            str12 = str5;
                            Y02 = f16;
                        }
                    }
                    PointF pointF32 = new PointF(pointF.x + X0 + X02, pointF.y);
                    String v132 = kg.a.v();
                    SizeF sizeF22 = new SizeF(X0, Y0);
                    PointF pointF42 = new PointF(pointF.x, pointF.y);
                    Integer n142 = pu0Var.n();
                    Intrinsics.checkNotNullExpressionValue(n142, "getBeginFrame(...)");
                    int intValue32 = n142.intValue();
                    Integer o142 = pu0Var.o();
                    Intrinsics.checkNotNullExpressionValue(o142, "getEndFrame(...)");
                    arrayList5.add(p2.Q(v132, sizeF22, pointF42, intValue32, o142.intValue(), "https://s.pinimg.com/content-actionability/montage-templates/v1/ig_template/assets/images/pin_logo.png", null, 64));
                    String v142 = kg.a.v();
                    SizeF sizeF32 = new SizeF(X03, Y0);
                    f14 = X0;
                    ArrayList arrayList62 = arrayList5;
                    float f172 = Y0 / 3;
                    PointF pointF52 = new PointF(pointF32.x, pointF32.y - f172);
                    Integer n152 = pu0Var.n();
                    Intrinsics.checkNotNullExpressionValue(n152, "getBeginFrame(...)");
                    int intValue42 = n152.intValue();
                    Integer o152 = pu0Var.o();
                    Intrinsics.checkNotNullExpressionValue(o152, "getEndFrame(...)");
                    f16 = Y02;
                    f15 = X03;
                    str4 = str14;
                    str5 = str16;
                    i15 = 2;
                    arrayList = arrayList62;
                    arrayList.add(p2.R(v142, sizeF32, pointF52, intValue42, o152.intValue(), boardName, "Pinterest-UI-Pro-Bold", 50, "FFFFFF"));
                    String v152 = kg.a.v();
                    Y0 = Y0;
                    SizeF sizeF42 = new SizeF(f15, Y0);
                    PointF pointF62 = new PointF(pointF32.x, pointF32.y + f172);
                    Integer n162 = pu0Var.n();
                    Intrinsics.checkNotNullExpressionValue(n162, "getBeginFrame(...)");
                    int intValue52 = n162.intValue();
                    Integer o162 = pu0Var.o();
                    Intrinsics.checkNotNullExpressionValue(o162, "getEndFrame(...)");
                    arrayList.add(p2.R(v152, sizeF42, pointF62, intValue52, o162.intValue(), a.a.j("@", userName), "Pinterest-UI-Pro-Regular", 38, "FFFFFF"));
                    X03 = f15;
                    arrayList5 = arrayList;
                    i25 = i15;
                    X0 = f14;
                    i26 = i27;
                    str11 = str15;
                    str13 = str3;
                    str10 = str4;
                    str12 = str5;
                    Y02 = f16;
                } else {
                    String str17 = str10;
                    String str18 = str11;
                    f13 = 0.0f;
                    ps0 u13 = template.u();
                    u13.getClass();
                    ms0 ms0Var = new ms0(u13, 0);
                    ArrayList H0 = CollectionsKt.H0(p2.O(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION, RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE, arrayList5));
                    float X04 = p2.X0(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN);
                    float Y03 = p2.Y0(333);
                    float X05 = p2.X0(350);
                    float Y04 = p2.Y0(44);
                    float Y05 = p2.Y0(12);
                    float f18 = X04 - (X05 / i25);
                    H0.add(p2.R(kg.a.w(), new SizeF(X05, Y04), new PointF(f18, Y03 - Y05), RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION, RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE, a.a.j(str12, userName), "Pinterest-UI-Pro-Regular", 38, "FFFFFF"));
                    if (i13 > 0) {
                        H0.add(p2.R(kg.a.w(), new SizeF(X05, Y04), new PointF(f18, ((Y04 / 4) + Y03) - Y05), RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION, RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE, i13 != 1 ? a.a.e(str18, i13, " others") : "and 1 other", "Pinterest-UI-Pro-Regular", 38, "FFFFFF"));
                    }
                    H0.add(p2.R(kg.a.w(), new SizeF(X05, Y04), new PointF(f18, (Y03 - (Y04 / 3)) - Y05), RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_ARTICLE_SECTION, RecyclerViewTypes.VIEW_TYPE_PIN_FULL_SPAN_AD_EXCLUDE, "Curated on Pinterest", "Pinterest-UI-Pro-Bold", 50, "FFFFFF"));
                    ms0Var.b(H0);
                    ps0 a15 = ms0Var.a();
                    Intrinsics.checkNotNullExpressionValue(a15, str17);
                    sa saVar = new sa(template, 0);
                    saVar.b(a15);
                    a13 = saVar.a();
                    Intrinsics.checkNotNullExpressionValue(a13, str17);
                }
            }
        } else if (i24 != 2) {
            a13 = template;
            str3 = "getTimelineObjects(...)";
            vVar = vVar3;
            str = "getFrameWidth(...)";
            str2 = "<this>";
            i14 = 14;
            f13 = 0.0f;
            size = size2;
        } else {
            ps0 u14 = template.u();
            u14.getClass();
            ms0 ms0Var2 = new ms0(u14, 0);
            List h13 = template.u().h();
            Intrinsics.checkNotNullExpressionValue(h13, "getTimelineObjects(...)");
            ArrayList H02 = CollectionsKt.H0(p2.O(0, Integer.MAX_VALUE, h13));
            float X06 = p2.X0(RecyclerViewTypes.VIEW_TYPE_GMA_NATIVE_AD_VIDEO_FULL_SPAN);
            float Y06 = p2.Y0(333);
            float X07 = p2.X0(350);
            float Y07 = p2.Y0(44);
            float f19 = 2;
            float f23 = X06 - (X07 / f19);
            H02.add(p2.R(kg.a.w(), new SizeF(X07, Y07), new PointF(f23, Y06 - (p2.Y0(12) * f19)), 0, 71, "Curated on Pinterest", "Pinterest-UI-Pro-Bold", 50, "FFFFFF"));
            PointF pointF7 = new PointF(f23, Y06);
            i14 = 14;
            str2 = "<this>";
            str3 = "getTimelineObjects(...)";
            vVar = vVar3;
            str = "getFrameWidth(...)";
            size = size2;
            H02.add(p2.R(kg.a.w(), new SizeF(X07, Y07), new PointF(pointF7.x, pointF7.y), 0, 71, boardName, "Pinterest-UI-Pro-Regular", 38, "FFFFFF"));
            H02.add(p2.R(kg.a.w(), new SizeF(X07, Y07), new PointF(pointF7.x, p2.Y0(14) + pointF7.y), 0, 71, a.a.j("by ", userName), "Pinterest-UI-Pro-Regular", 38, "FFFFFF"));
            if (i13 > 0) {
                H02.add(p2.R(kg.a.w(), new SizeF(X07, Y07), new PointF(pointF7.x, p2.Y0(26) + pointF7.y), 0, 71, i13 != 1 ? a.a.e("and ", i13, " others") : "and 1 other", "Pinterest-UI-Pro-Regular", 38, "FFFFFF"));
            }
            ms0Var2.b(H02);
            ps0 a16 = ms0Var2.a();
            Intrinsics.checkNotNullExpressionValue(a16, "build(...)");
            sa saVar2 = new sa(template, 0);
            saVar2.b(a16);
            a13 = saVar2.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            f13 = 0.0f;
        }
        List h14 = a13.u().h();
        Intrinsics.checkNotNullExpressionValue(h14, str3);
        List list = h14;
        ArrayList arrayList7 = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it5 = list.iterator();
        while (true) {
            str6 = "getAnimations(...)";
            if (!it5.hasNext()) {
                break;
            }
            pu0 pu0Var2 = (pu0) it5.next();
            Intrinsics.f(pu0Var2);
            List m13 = pu0Var2.m();
            Intrinsics.checkNotNullExpressionValue(m13, "getAnimations(...)");
            Iterator it6 = m13.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    bv0Var = null;
                    break;
                }
                bv0Var = ((tu0) it6.next()).j().f();
                if (bv0Var != null) {
                    break;
                }
            }
            Double j13 = bv0Var != null ? bv0Var.j() : null;
            double doubleValue = j13 == null ? 1.0d : j13.doubleValue();
            if (pu0Var2.r().h() != null) {
                vVar2 = vVar;
                jh0.d dVar = new jh0.d(vVar2, 19);
                nv0 h15 = pu0Var2.r().h();
                Size d2 = d(this, pu0Var2, previewSize);
                if ((h15 != null ? h15.f() : null) != null) {
                    String f24 = h15.f();
                    i19 = i14;
                    e13 = x0.a(x0.f106703e, new y0(f24 != null ? f24 : "", d2.getWidth(), d2.getHeight(), com.pinterest.shuffles.scene.composer.z.f52181a), null, i19);
                } else {
                    i19 = i14;
                    c72.b0 b0Var = (c72.b0) this.f83754b;
                    Map A4 = ((f30) dVar.invoke()).A4();
                    b0Var.getClass();
                    e13 = c72.b0.e(A4);
                }
                String w14 = pu0Var2.w();
                Intrinsics.checkNotNullExpressionValue(w14, "getUid(...)");
                obj = K(pu0Var2, w14, e13, previewSize, doubleValue);
            } else {
                i19 = i14;
                vVar2 = vVar;
                if (pu0Var2.r().g() != null) {
                    String w15 = pu0Var2.w();
                    Intrinsics.checkNotNullExpressionValue(w15, "getUid(...)");
                    c72.b0 b0Var2 = (c72.b0) this.f83754b;
                    r0 d13 = z0.d();
                    b0Var2.getClass();
                    obj = K(pu0Var2, w15, c72.b0.e(d13), previewSize, doubleValue);
                } else if (pu0Var2.r().i() != null) {
                    String value = pu0Var2.w();
                    Intrinsics.checkNotNullExpressionValue(value, "getUid(...)");
                    l1 u15 = u(pu0Var2, previewSize.getWidth(), previewSize.getHeight());
                    vv0 i29 = pu0Var2.r().i();
                    if (i29 != null) {
                        String j14 = i29.j();
                        String str19 = j14 != null ? j14 : "";
                        if (Intrinsics.d(str19, "by @%@") && userName.length() > 0) {
                            str19 = kotlin.text.z.n(str19, "%@", userName);
                        } else if (str19.length() == 0) {
                            str9 = boardName;
                            l2 l2Var2 = l2.f106537h;
                            Intrinsics.checkNotNullExpressionValue(i29.i(), "getFontSize(...)");
                            String g13 = i29.g();
                            Intrinsics.checkNotNullExpressionValue(g13, "getColor(...)");
                            l2Var = l2.a(l2Var2, str9, i(g13), null, (r6.intValue() * AdSize.MEDIUM_RECTANGLE_WIDTH) / size.getWidth(), null, null, false, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
                        }
                        str9 = str19;
                        l2 l2Var22 = l2.f106537h;
                        Intrinsics.checkNotNullExpressionValue(i29.i(), "getFontSize(...)");
                        String g132 = i29.g();
                        Intrinsics.checkNotNullExpressionValue(g132, "getColor(...)");
                        l2Var = l2.a(l2Var22, str9, i(g132), null, (r6.intValue() * AdSize.MEDIUM_RECTANGLE_WIDTH) / size.getWidth(), null, null, false, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW);
                    } else {
                        l2Var = l2.f106537h;
                    }
                    l2 l2Var3 = l2Var;
                    i2 i2Var = kg.a.T(pu0Var2) ? i2.LEFT : i2.CENTER;
                    float f25 = kg.a.T(pu0Var2) ? f13 : 1.0f;
                    y1 y1Var = y1.f106720g;
                    int i33 = a2.f106437b;
                    Intrinsics.checkNotNullParameter(value, "value");
                    l2 a17 = l2.a(l2Var3, null, null, null, 0.0f, null, i2Var, false, 95);
                    k0 k0Var = k0.f106512o;
                    Intrinsics.checkNotNullParameter(value, "value");
                    obj = y1.f(y1Var, value, u15, doubleValue, 0.0d, k0.a(k0Var, false, false, false, false, f25, null, null, null, null, 0.0d, 0.0d, value, 8175), a17, 8);
                } else {
                    obj = u1.f106668t;
                }
            }
            arrayList7.add(obj);
            i14 = i19;
            vVar = vVar2;
        }
        j jVar = this;
        Size size5 = previewSize;
        ArrayList arrayList8 = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it7 = list.iterator();
        int i34 = 0;
        while (it7.hasNext()) {
            Object next3 = it7.next();
            int i35 = i34 + 1;
            if (i34 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            pu0 pu0Var3 = (pu0) next3;
            String w16 = pu0Var3.w();
            Integer f26 = template.u().f();
            Integer n17 = pu0Var3.n();
            Integer o17 = pu0Var3.o();
            Size d14 = d(jVar, pu0Var3, size5);
            Double p13 = pu0Var3.p();
            Intrinsics.checkNotNullExpressionValue(p13, "getFrameCornerRadius(...)");
            double doubleValue2 = p13.doubleValue();
            String str20 = str;
            Intrinsics.checkNotNullExpressionValue(template.s(), str20);
            Iterator it8 = it7;
            int width = (int) ((previewSize.getWidth() / r0.intValue()) * doubleValue2);
            jv0 g14 = pu0Var3.r().g();
            if (g14 == null) {
                i16 = i35;
                num2 = null;
            } else {
                String d15 = g14.d();
                if (d15 != null) {
                    String i36 = i(d15);
                    try {
                        xk2.q qVar = xk2.s.f135225b;
                        i17 = Color.parseColor(i36);
                    } catch (Throwable th3) {
                        xk2.q qVar2 = xk2.s.f135225b;
                        ue.c.m(th3);
                        i17 = -1;
                    }
                    valueOf = Integer.valueOf(i17);
                    i16 = i35;
                } else {
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it9 = pins.iterator();
                    while (it9.hasNext()) {
                        String i43 = ((f30) it9.next()).i4();
                        if (i43 != null) {
                            it = it9;
                            num = Integer.valueOf(Color.parseColor(i43));
                        } else {
                            it = it9;
                            num = null;
                        }
                        if (num != null) {
                            arrayList9.add(num);
                        }
                        it9 = it;
                    }
                    if (arrayList9.isEmpty()) {
                        i16 = i35;
                        rgb = 0;
                    } else {
                        Iterator it10 = arrayList9.iterator();
                        int i37 = 0;
                        while (it10.hasNext()) {
                            i37 = Color.red(((Number) it10.next()).intValue()) + i37;
                        }
                        int size6 = i37 / arrayList9.size();
                        Iterator it11 = arrayList9.iterator();
                        int i38 = 0;
                        while (it11.hasNext()) {
                            i38 = Color.green(((Number) it11.next()).intValue()) + i38;
                        }
                        i16 = i35;
                        int size7 = i38 / arrayList9.size();
                        Iterator it12 = arrayList9.iterator();
                        int i39 = 0;
                        while (it12.hasNext()) {
                            i39 = Color.blue(((Number) it12.next()).intValue()) + i39;
                        }
                        rgb = Color.rgb(size6, size7, i39 / arrayList9.size());
                    }
                    valueOf = Integer.valueOf(rgb);
                }
                num2 = valueOf;
            }
            vv0 i44 = pu0Var3.r().i();
            if (i44 == null) {
                typeface = null;
            } else {
                String h16 = i44.h();
                Intrinsics.checkNotNullExpressionValue(h16, "getFontName(...)");
                typeface = StringsKt.E(h16, "bold", true) ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
            }
            String q14 = pu0Var3.q();
            List m14 = pu0Var3.m();
            Intrinsics.checkNotNullExpressionValue(m14, str6);
            ArrayList arrayList10 = new ArrayList();
            Iterator it13 = m14.iterator();
            while (it13.hasNext()) {
                tu0 tu0Var = (tu0) it13.next();
                if (tu0Var.j().g() != null) {
                    it2 = it13;
                    fv0 g15 = tu0Var.j().g();
                    str7 = str6;
                    Intrinsics.g(g15, "null cannot be cast to non-null type com.pinterest.api.model.TimelineObjectAnimationTranslation");
                    Size d16 = d(jVar, pu0Var3, size5);
                    double doubleValue3 = pu0Var3.t().doubleValue();
                    double doubleValue4 = g15.i().doubleValue();
                    str8 = str20;
                    Double s14 = pu0Var3.s();
                    Intrinsics.checkNotNullExpressionValue(s14, "getRelatedRectFrameWidth(...)");
                    double doubleValue5 = (s14.doubleValue() * doubleValue4) + doubleValue3;
                    double doubleValue6 = pu0Var3.u().doubleValue();
                    double doubleValue7 = g15.j().doubleValue();
                    Double v16 = pu0Var3.v();
                    Intrinsics.checkNotNullExpressionValue(v16, "getRelatedRectRameHeight(...)");
                    double doubleValue8 = (v16.doubleValue() * doubleValue7) + doubleValue6;
                    double doubleValue9 = pu0Var3.t().doubleValue();
                    double doubleValue10 = g15.g().doubleValue();
                    Double s15 = pu0Var3.s();
                    Intrinsics.checkNotNullExpressionValue(s15, "getRelatedRectFrameWidth(...)");
                    double doubleValue11 = (s15.doubleValue() * doubleValue10) + doubleValue9;
                    double doubleValue12 = pu0Var3.u().doubleValue();
                    double doubleValue13 = g15.h().doubleValue();
                    Double v17 = pu0Var3.v();
                    Intrinsics.checkNotNullExpressionValue(v17, "getRelatedRectRameHeight(...)");
                    double doubleValue14 = (v17.doubleValue() * doubleValue13) + doubleValue12;
                    int i45 = com.pinterest.shuffles.scene.composer.z.f52181a;
                    arrayList3 = arrayList7;
                    arrayList2 = arrayList8;
                    i18 = width;
                    PointF b13 = com.pinterest.shuffles.scene.composer.z.b(new Size(previewSize.getWidth(), previewSize.getHeight()), (float) ((doubleValue5 * previewSize.getWidth()) + (d16.getWidth() / 2)), (float) ((doubleValue8 * previewSize.getHeight()) + (d16.getHeight() / 2)));
                    num3 = n17;
                    l1 l1Var = new l1(b13.x, b13.y);
                    PointF b14 = com.pinterest.shuffles.scene.composer.z.b(new Size(previewSize.getWidth(), previewSize.getHeight()), (float) ((doubleValue11 * previewSize.getWidth()) + (d16.getWidth() / 2)), (float) ((doubleValue14 * previewSize.getHeight()) + (d16.getHeight() / 2)));
                    bVar = new an0.b(l1Var, new l1(b14.x, b14.y), tu0Var.h().intValue(), tu0Var.i().intValue());
                    num4 = o17;
                } else {
                    it2 = it13;
                    arrayList2 = arrayList8;
                    i18 = width;
                    str7 = str6;
                    num3 = n17;
                    Integer num5 = o17;
                    str8 = str20;
                    arrayList3 = arrayList7;
                    if (tu0Var.j().f() != null) {
                        bv0 f27 = tu0Var.j().f();
                        Intrinsics.g(f27, "null cannot be cast to non-null type com.pinterest.api.model.TimelineObjectAnimationScale");
                        Integer h17 = tu0Var.h();
                        Integer i46 = tu0Var.i();
                        float doubleValue15 = (float) f27.j().doubleValue();
                        float doubleValue16 = (float) f27.i().doubleValue();
                        Double g16 = f27.g();
                        Intrinsics.checkNotNullExpressionValue(g16, "getCenterX(...)");
                        double doubleValue17 = g16.doubleValue();
                        Double h18 = f27.h();
                        Intrinsics.checkNotNullExpressionValue(h18, "getCenterY(...)");
                        num4 = num5;
                        bVar = new an0.a(doubleValue15, doubleValue16, new l1(doubleValue17, h18.doubleValue()), h17.intValue(), i46.intValue());
                    } else {
                        num4 = num5;
                        bVar = null;
                    }
                }
                if (bVar != null) {
                    arrayList10.add(bVar);
                }
                jVar = this;
                size5 = previewSize;
                n17 = num3;
                str6 = str7;
                o17 = num4;
                it13 = it2;
                width = i18;
                arrayList8 = arrayList2;
                arrayList7 = arrayList3;
                str20 = str8;
            }
            ArrayList arrayList11 = arrayList8;
            int i47 = width;
            String str21 = str6;
            Integer num6 = n17;
            Integer num7 = o17;
            str = str20;
            ArrayList arrayList12 = arrayList7;
            String str22 = str2;
            Intrinsics.checkNotNullParameter(pu0Var3, str22);
            String w17 = pu0Var3.w();
            Intrinsics.checkNotNullExpressionValue(w17, "getUid(...)");
            boolean p14 = kotlin.text.z.p(w17, "watermark_item", true);
            i2 i2Var2 = kg.a.T(pu0Var3) ? i2.LEFT : i2.CENTER;
            Intrinsics.f(w16);
            Intrinsics.f(q14);
            arrayList11.add(new an0.d(w16, q14, i34, f26.intValue(), num6.intValue(), num7.intValue(), d14, num2, Integer.valueOf(i47), typeface, i2Var2, arrayList10, p14));
            jVar = this;
            it7 = it8;
            size5 = previewSize;
            i34 = i16;
            str2 = str22;
            arrayList8 = arrayList11;
            str6 = str21;
            arrayList7 = arrayList12;
        }
        ArrayList arrayList13 = arrayList8;
        String uid = template.getUid();
        Integer s16 = template.s();
        Integer q15 = template.q();
        int width2 = previewSize.getWidth();
        int height = previewSize.getHeight();
        Integer f28 = template.u().f();
        Integer g17 = template.u().g();
        an0.e eVar = an0.f.Companion;
        String w18 = template.w();
        eVar.getClass();
        an0.f a18 = an0.e.a(w18);
        Intrinsics.f(uid);
        return new an0.g(uid, s16.intValue(), q15.intValue(), width2, height, a18, boardName, userName, f28.intValue(), g17.intValue(), arrayList7, arrayList13);
    }

    public final v2 y(Integer num) {
        v2 v2Var = (v2) this.f83754b;
        if (v2Var != null) {
            return v2Var;
        }
        v2 v2Var2 = new v2(null, ep.b.f(1000000L), null, null, num != null ? Short.valueOf((short) num.intValue()) : null, null, null, null, null, null);
        this.f83754b = v2Var2;
        return v2Var2;
    }

    public final void z(SendableObject sendableObject) {
        m60.w wVar = m60.u.f85943a;
        a.c.y(wVar);
        yq.n nVar = yq.n.NONE;
        int i13 = sendableObject.f35129c;
        if (i13 == 1) {
            nVar = yq.n.BOARD;
        } else if (i13 == 2) {
            nVar = yq.n.USER;
        }
        wVar.d(new jc0.v(((so.y1) ((yq.e) this.f83754b)).a(sendableObject.d(), nVar, sendableObject.f35130d, sendableObject.f35132f)));
    }

    @Override // io.jsonwebtoken.SigningKeyResolver
    public final Key resolveSigningKey(JwsHeader jwsHeader, String str) {
        return G(jwsHeader);
    }

    public /* synthetic */ j(int i13, int i14) {
        this.f83753a = i13;
    }

    public /* synthetic */ j(Object obj, int i13) {
        this.f83753a = i13;
        this.f83754b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(qm.e0 e0Var) {
        this(e0Var, 7);
        this.f83753a = 7;
    }

    public j(nq overlayBlock) {
        this.f83753a = 22;
        Intrinsics.checkNotNullParameter(overlayBlock, "overlayBlock");
        this.f83754b = overlayBlock;
    }

    public j(lh0.t experiments) {
        this.f83753a = 20;
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f83754b = experiments;
    }

    public j(l80.c realCartingAvailabilitiesDataSource) {
        this.f83753a = 18;
        Intrinsics.checkNotNullParameter(realCartingAvailabilitiesDataSource, "realCartingAvailabilitiesDataSource");
        this.f83754b = realCartingAvailabilitiesDataSource;
    }

    public j(c72.p entityMapperKeyframeAnimation) {
        this.f83753a = 29;
        Intrinsics.checkNotNullParameter(entityMapperKeyframeAnimation, "entityMapperKeyframeAnimation");
        this.f83754b = entityMapperKeyframeAnimation;
    }

    public j(n82.b currentActivityProvider) {
        this.f83753a = 26;
        Intrinsics.checkNotNullParameter(currentActivityProvider, "currentActivityProvider");
        this.f83754b = currentActivityProvider;
    }

    public j(r20.a notificationSettingsService) {
        this.f83753a = 23;
        Intrinsics.checkNotNullParameter(notificationSettingsService, "notificationSettingsService");
        this.f83754b = notificationSettingsService;
    }

    public j(a11.d clickThroughHelperFactory) {
        this.f83753a = 28;
        Intrinsics.checkNotNullParameter(clickThroughHelperFactory, "clickThroughHelperFactory");
        this.f83754b = clickThroughHelperFactory;
    }

    public j(yk1.v viewResources) {
        this.f83753a = 24;
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f83754b = viewResources;
    }

    public j(c72.b0 shufflesEntityMapper) {
        this.f83753a = 21;
        Intrinsics.checkNotNullParameter(shufflesEntityMapper, "shufflesEntityMapper");
        this.f83754b = shufflesEntityMapper;
    }
}
