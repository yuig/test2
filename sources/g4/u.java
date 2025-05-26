package g4;

import J.N;
import a.y3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.pinterest.api.model.deserializer.PinDeserializer;
import com.pinterest.api.model.deserializer.ShuffleAssetDeserializer;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.qz0;
import com.pinterest.api.model.tz0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z7;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import df.i1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import l7.g0;
import lh0.a0;
import org.chromium.net.ProxyChangeListener;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import pk.c1;
import q8.e0;
import r72.l1;
import rg0.h0;
import so.oa;
import x02.x2;
import x40.e7;
import x40.f7;
import yn2.c0;
import z9.b0;
import z9.i0;
import z9.j0;
import z9.k0;
import z9.l0;
import z9.m0;
import z9.n0;
import z9.o0;
import z9.q0;
import z9.s0;

/* loaded from: classes3.dex */
public final class u implements t, fb2.c, hd.i, k9.g, l62.d, g0, l9.j, androidx.viewpager2.widget.n, i1, uf0.b, m62.w, m62.i1, o62.c {

    /* renamed from: a */
    public static u f63478a;

    public /* synthetic */ u(int i13) {
    }

    public static db.k A0(Object obj, db.l verificationMode) {
        db.a logger = db.a.f54259a;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter("h", "tag");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new db.k(obj, verificationMode, logger);
    }

    public static si1.a B0(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new si1.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static boolean U(f30 f30Var, a0 experiments) {
        Boolean bool;
        boolean z13;
        Boolean bool2;
        Boolean bool3;
        List I0;
        String str;
        wy0 k13;
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        if (f30Var == null || f30Var.E3() == null) {
            return false;
        }
        v7 D3 = f30Var.D3();
        if (D3 == null || (bool = D3.g1()) == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        if (f13 != null) {
            v7 D32 = f30Var.D3();
            if (D32 == null || (k13 = D32.k1()) == null || (str = k13.getUid()) == null) {
                str = "";
            }
            z13 = dl2.b.S1(f13, str);
        } else {
            z13 = false;
        }
        v7 D33 = f30Var.D3();
        if (D33 == null || (bool2 = D33.G0()) == null) {
            bool2 = Boolean.FALSE;
        }
        boolean booleanValue2 = bool2.booleanValue();
        v7 D34 = f30Var.D3();
        boolean z14 = (D34 == null || (I0 = D34.I0()) == null || I0.size() != 1) ? false : true;
        z7 E3 = f30Var.E3();
        if (E3 == null || (bool3 = E3.q()) == null) {
            bool3 = Boolean.FALSE;
        }
        boolean booleanValue3 = bool3.booleanValue();
        z7 E32 = f30Var.E3();
        String n13 = E32 != null ? E32.n() : null;
        boolean z15 = !(n13 == null || n13.length() == 0);
        if (booleanValue) {
            return (booleanValue2 || z13) && z14 && booleanValue3 && z15 && experiments.q();
        }
        return false;
    }

    public static o0 V(TypedValue value, o0 o0Var, i0 expectedNavType, String str, String foundType) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(expectedNavType, "expectedNavType");
        Intrinsics.checkNotNullParameter(foundType, "foundType");
        if (o0Var == null || o0Var == expectedNavType) {
            return o0Var == null ? expectedNavType : o0Var;
        }
        StringBuilder w13 = a.a.w("Type is ", str, " but found ", foundType, ": ");
        w13.append(value.data);
        throw new XmlPullParserException(w13.toString());
    }

    public static dv1.e W(Object newsHub) {
        Intrinsics.checkNotNullParameter(newsHub, "newsHub");
        if (newsHub instanceof d40.i) {
            return new dv1.e(new dv1.a((d40.i) newsHub));
        }
        if (newsHub instanceof qx) {
            return new dv1.e(new dv1.b((qx) newsHub));
        }
        throw new IllegalArgumentException(a.a.i("NewsHubItem type not allowed ", newsHub));
    }

    public static pa0.f X(uk1.d presenterPinalytics, x2 userRepository, uj2.q networkStateStream) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        return new pa0.f(presenterPinalytics, userRepository, networkStateStream);
    }

    public static z9.k Y(Context context, z9.z destination, Bundle bundle, androidx.lifecycle.r hostLifecycleState, z9.r rVar) {
        String id3 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id3, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Intrinsics.checkNotNullParameter(id3, "id");
        return new z9.k(context, destination, bundle, hostLifecycleState, rVar, id3, null);
    }

    public static Typeface Z(String str, l lVar, int i13) {
        if (j.a(i13, 0) && Intrinsics.d(lVar, l.f63469d) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int t13 = kh2.n.t(lVar, i13);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(t13) : Typeface.create(str, t13);
    }

    public static String a0(String str) {
        return str != null ? "android-app://androidx.navigation/".concat(str) : "";
    }

    public static ke0.a[] b0() {
        PinDeserializer pinDeserializerParam = gh0.b.R();
        ModelDeserializerWithSaveAndMerge boardDeserializerParam = gh0.b.K();
        ModelDeserializerWithSaveAndMerge storyDeserializer = gh0.b.N();
        Context context = kb0.a.f79058b;
        ModelDeserializerWithSaveAndMerge interestDeserializerParam = (ModelDeserializerWithSaveAndMerge) ((oa) ((so1.b) ep.b.g(so1.b.class))).f113749j4.get();
        UserDeserializer.f36811e.getClass();
        UserDeserializer userDeserializer = UserDeserializer.f36812f;
        if (userDeserializer == null) {
            Intrinsics.r("INSTANCE");
            throw null;
        }
        ShuffleAssetDeserializer shuffleAssetDeserializerParam = (ShuffleAssetDeserializer) ((oa) ((so1.b) ep.b.g(so1.b.class))).Mc.get();
        Intrinsics.checkNotNullParameter(pinDeserializerParam, "pinDeserializerParam");
        Intrinsics.checkNotNullParameter(boardDeserializerParam, "boardDeserializerParam");
        Intrinsics.checkNotNullParameter(storyDeserializer, "storyDeserializer");
        Intrinsics.checkNotNullParameter(interestDeserializerParam, "interestDeserializerParam");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        Intrinsics.checkNotNullParameter(shuffleAssetDeserializerParam, "shuffleAssetDeserializerParam");
        return new ke0.a[]{pinDeserializerParam, boardDeserializerParam, interestDeserializerParam, storyDeserializer, userDeserializer, shuffleAssetDeserializerParam};
    }

    public static boolean c0(String current, String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.d(current, str)) {
            return true;
        }
        if (current.length() != 0) {
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i13 < current.length()) {
                    char charAt = current.charAt(i13);
                    int i16 = i15 + 1;
                    if (i15 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i14 - 1 == 0 && i15 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i14++;
                    }
                    i13++;
                    i15 = i16;
                } else if (i14 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return Intrinsics.d(StringsKt.i0(substring).toString(), str);
                }
            }
        }
        return false;
    }

    public static byte[] d0(long j13, c1 c1Var) {
        y3 y3Var = new y3(20);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c1Var.size());
        Iterator<E> it = c1Var.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) y3Var.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j13);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static zd1.y e0(String str) {
        String f03 = StringsKt.f0(str, "_", str);
        String c03 = StringsKt.c0(str, "_");
        if (!StringsKt.E(str, "_", false) || kotlin.text.z.j(f03) || kotlin.text.z.j(c03)) {
            return null;
        }
        return new zd1.y(f03, c03);
    }

    public static zd1.z f0(String str) {
        List split$default;
        String str2;
        Integer num;
        Object obj;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null);
        int size = split$default.size();
        if (!kotlin.text.z.j(str) && size >= 2) {
            String str3 = (String) CollectionsKt.d0(split$default);
            if (str3 == null) {
                str2 = null;
                num = null;
                obj = null;
            } else if (TextUtils.isDigitsOnly(str3)) {
                num = Integer.valueOf(Integer.parseInt(str3));
                str2 = StringsKt.f0(str, "_", str);
                obj = null;
            } else {
                if (size < 3) {
                    return null;
                }
                obj = CollectionsKt.d0(split$default);
                String str4 = (String) CollectionsKt.U(size - 2, split$default);
                if (str4 == null || (num = StringsKt.toIntOrNull(str4)) == null) {
                    return null;
                }
                str2 = StringsKt.f0(str, "_" + num, str);
            }
            if (str2 != null && num != null) {
                return new zd1.z(str2, num.intValue(), (String) obj);
            }
        }
        return null;
    }

    public static z9.z g0(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        return (z9.z) c0.o(yn2.x.e(b0Var.s(b0Var.f141161l, true), z9.b.f141154r));
    }

    public static o0 h0(String str, String str2) {
        i0 i0Var = o0.f141242b;
        if (Intrinsics.d(i0Var.b(), str)) {
            return i0Var;
        }
        i0 i0Var2 = o0.f141244d;
        if (Intrinsics.d(i0Var2.b(), str)) {
            return i0Var2;
        }
        i0 i0Var3 = o0.f141245e;
        if (Intrinsics.d(i0Var3.b(), str)) {
            return i0Var3;
        }
        i0 i0Var4 = o0.f141246f;
        if (Intrinsics.d(i0Var4.b(), str)) {
            return i0Var4;
        }
        i0 i0Var5 = o0.f141249i;
        if (Intrinsics.d(i0Var5.b(), str)) {
            return i0Var5;
        }
        i0 i0Var6 = o0.f141250j;
        if (Intrinsics.d(i0Var6.b(), str)) {
            return i0Var6;
        }
        i0 i0Var7 = o0.f141251k;
        if (Intrinsics.d(i0Var7.b(), str)) {
            return i0Var7;
        }
        i0 i0Var8 = o0.f141252l;
        if (Intrinsics.d(i0Var8.b(), str)) {
            return i0Var8;
        }
        i0 i0Var9 = o0.f141247g;
        if (Intrinsics.d(i0Var9.b(), str)) {
            return i0Var9;
        }
        i0 i0Var10 = o0.f141248h;
        if (Intrinsics.d(i0Var10.b(), str)) {
            return i0Var10;
        }
        i0 i0Var11 = o0.f141243c;
        if (Intrinsics.d(i0Var11.b(), str)) {
            return i0Var11;
        }
        if (str == null || str.length() == 0) {
            return i0Var7;
        }
        try {
            String concat = (!kotlin.text.z.p(str, ".", false) || str2 == null) ? str : str2.concat(str);
            if (kotlin.text.z.h(str, "[]", false)) {
                concat = concat.substring(0, concat.length() - 2);
                Intrinsics.checkNotNullExpressionValue(concat, "this as java.lang.String…ing(startIndex, endIndex)");
                Class<?> cls = Class.forName(concat);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new k0(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new m0(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(concat);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new l0(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new j0(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new n0(cls2);
                }
            }
            throw new IllegalArgumentException(concat + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static u i0() {
        return new u();
    }

    public static u j0() {
        return new u();
    }

    public static String k0(Context context, int i13) {
        String valueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i13 <= 16777215) {
            return String.valueOf(i13);
        }
        try {
            valueOf = context.getResources().getResourceName(i13);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i13);
        }
        Intrinsics.checkNotNullExpressionValue(valueOf, "try {\n                co….toString()\n            }");
        return valueOf;
    }

    public static long l0(View view) {
        if (y9.i.f138103e < 0) {
            Window window = null;
            if ((view != null ? view.getContext() : null) instanceof Activity) {
                Context context = view.getContext();
                Intrinsics.g(context, "null cannot be cast to non-null type android.app.Activity");
                window = ((Activity) context).getWindow();
            }
            float f13 = 60.0f;
            float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
            if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                f13 = refreshRate;
            }
            y9.i.f138103e = (long) ((1000 / f13) * 1000000);
        }
        return y9.i.f138103e;
    }

    public static Sequence m0(z9.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return yn2.x.e(zVar, z9.b.f141153q);
    }

    public static String n0(Class navigatorClass) {
        Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
        LinkedHashMap linkedHashMap = s0.f141286b;
        String str = (String) linkedHashMap.get(navigatorClass);
        if (str == null) {
            q0 q0Var = (q0) navigatorClass.getAnnotation(q0.class);
            str = q0Var != null ? q0Var.value() : null;
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(navigatorClass.getSimpleName()).toString());
            }
            linkedHashMap.put(navigatorClass, str);
        }
        Intrinsics.f(str);
        return str;
    }

    public static Set o0() {
        return pd1.c.f99804a;
    }

    public static jc0.v p0(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        return new jc0.v(new zt1.d(pinUid, null), false, 0L, 30);
    }

    public static fa.b r0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb3 = new StringBuilder("AdServicesInfo.version=");
        int i13 = Build.VERSION.SDK_INT;
        da.b bVar = da.b.f54200a;
        sb3.append(i13 >= 33 ? bVar.a() : 0);
        Log.d("MeasurementManager", sb3.toString());
        if (i13 >= 33 && bVar.a() >= 5) {
            return new fa.c(context, 1);
        }
        da.a aVar = da.a.f54199a;
        Object obj = null;
        if (((i13 == 31 || i13 == 32) ? aVar.a() : 0) < 9) {
            return null;
        }
        q0.d manager = new q0.d(context, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("MeasurementManager", "tag");
        Intrinsics.checkNotNullParameter(manager, "manager");
        try {
            obj = manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            StringBuilder sb4 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, version=");
            int i14 = Build.VERSION.SDK_INT;
            sb4.append((i14 == 31 || i14 == 32) ? aVar.a() : 0);
            Log.d("MeasurementManager", sb4.toString());
        }
        return (fa.b) obj;
    }

    public static ga.d s0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = Build.VERSION.SDK_INT;
        da.b bVar = da.b.f54200a;
        if (i13 >= 33 && bVar.a() >= 5) {
            return new ga.e(context, 1);
        }
        if (i13 >= 33 && bVar.a() == 4) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService((Class<Object>) androidx.media3.ui.a0.z());
            Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
            return new ga.f(androidx.media3.ui.a0.j(systemService));
        }
        da.a aVar = da.a.f54199a;
        Object obj = null;
        if (((i13 == 31 || i13 == 32) ? aVar.a() : 0) < 9) {
            return null;
        }
        q0.d manager = new q0.d(context, 3);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("TopicsManager", "tag");
        Intrinsics.checkNotNullParameter(manager, "manager");
        try {
            obj = manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, version=");
            int i14 = Build.VERSION.SDK_INT;
            sb3.append((i14 == 31 || i14 == 32) ? aVar.a() : 0);
            Log.d("TopicsManager", sb3.toString());
        }
        return (ga.d) obj;
    }

    public static db.n t0(String str) {
        String group;
        if (str != null && !kotlin.text.z.j(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = Integer.parseInt(group3);
                        String description = matcher.group(4) != null ? matcher.group(4) : "";
                        Intrinsics.checkNotNullExpressionValue(description, "description");
                        return new db.n(description, parseInt, parseInt2, parseInt3);
                    }
                }
            }
        }
        return null;
    }

    public static void v0(u uVar, String pinId, h0 source, int i13) {
        if ((i13 & 2) != 0) {
            source = h0.OTHER;
        }
        m60.w eventManager = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(eventManager, "getInstance(...)");
        uVar.getClass();
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        eventManager.d(new rg0.i0(pinId, source));
    }

    public static qa2.e y0() {
        return new qa2.e(new wa2.m(-9986650, 2145386495, 1021, null, null, y32.f.SHOPPING_FEED, null, new wa2.g0((33554431 & 1) != 0, (33554431 & 2) != 0, (33554431 & 4) != 0, false, false, (33554431 & 32) != 0, (33554367 & 64) != 0 ? null : null, null, null, false, false, false, false, false, (33554431 & 16384) != 0 ? 1 : 0, false, (65536 & 33554431) != 0, (33554431 & 131072) != 0, false, false, false, false, false, false, false), null, null, null, null, "shop_feed", true, true, true, true, false, true, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false));
    }

    public static boolean z0(f30 f30Var, String str, a0 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        return Intrinsics.d(str, "board") && U(f30Var, experiments);
    }

    @Override // fb2.c
    public void A(int i13) {
    }

    @Override // g4.t
    public Typeface B(l lVar, int i13) {
        return Z(null, lVar, i13);
    }

    @Override // hd.i
    public Map C() {
        return z0.d();
    }

    @Override // l62.d
    public void E(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
    }

    @Override // hd.i
    public void F(HashMap hashMap) {
    }

    @Override // o62.c
    public void G(o62.k handler, ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    @Override // l62.d
    public void H(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
    }

    @Override // o62.c
    public void I(o62.k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    @Override // k9.g
    public e0 J() {
        return new q8.w(-9223372036854775807L);
    }

    @Override // df.i1
    public void K(FacebookException facebookException) {
        Log.e(Profile.f29917h, Intrinsics.n(facebookException, "Got unexpected exception: "));
    }

    @Override // l62.d
    public void L(int i13, String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
    }

    @Override // hd.i
    public void M() {
    }

    @Override // l62.d
    public void N() {
    }

    @Override // uf0.b
    public Object O(Object obj) {
        f7 input = (f7) obj;
        Intrinsics.checkNotNullParameter(input, "input");
        qz0 c13 = tz0.c();
        e7 e7Var = input.f132379d;
        c13.c(e7Var != null ? e7Var.f132318b : null);
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    @Override // o62.c
    public void P(o62.k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    @Override // o62.c
    public void Q(o62.k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    @Override // k9.g
    public void R(long j13) {
    }

    @Override // m62.i1
    public void S(ArrayList point) {
        Intrinsics.checkNotNullParameter(point, "point");
    }

    @Override // m62.w
    public void T(ke2.a flip) {
        Intrinsics.checkNotNullParameter(flip, "flip");
    }

    @Override // o62.c
    public void a(ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // o62.c
    public void b(ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // o62.c
    public void c(ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // l62.d
    public void d(int i13, String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
    }

    @Override // o62.c
    public void e(o62.k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    @Override // k9.g
    public long f(q8.t tVar) {
        return -1L;
    }

    @Override // m62.w
    public void g(m62.b0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    @Override // l9.j
    public int h(androidx.media3.common.b bVar) {
        return 1;
    }

    @Override // l62.d
    public void i(PointF location) {
        Intrinsics.checkNotNullParameter(location, "location");
    }

    @Override // g4.t
    public Typeface j(n nVar, l lVar, int i13) {
        String str;
        nVar.getClass();
        int i14 = lVar.f63474a / 100;
        if (i14 >= 0 && i14 < 2) {
            str = "sans-serif-thin";
        } else if (2 > i14 || i14 >= 4) {
            if (i14 != 4) {
                if (i14 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i14 || i14 >= 8) && 8 <= i14 && i14 < 11) {
                    str = "sans-serif-black";
                }
            }
            str = "sans-serif";
        } else {
            str = "sans-serif-light";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface Z = Z(str, lVar, i13);
            if (!Intrinsics.d(Z, Typeface.create(Typeface.DEFAULT, kh2.n.t(lVar, i13))) && !Intrinsics.d(Z, Z(null, lVar, i13))) {
                typeface = Z;
            }
        }
        return typeface == null ? Z("sans-serif", lVar, i13) : typeface;
    }

    @Override // uf0.b
    public Object k(Object obj) {
        wy0 input = (wy0) obj;
        Intrinsics.checkNotNullParameter(input, "input");
        return new e7("VerifiedIdentity", Boolean.valueOf(dl2.b.W1(input)));
    }

    @Override // hd.i
    public void l(int i13, int i14) {
    }

    @Override // o62.c
    public void m(o62.k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    @Override // l62.d
    public void o(int i13, String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
    }

    @Override // l9.j
    public l9.l p(androidx.media3.common.b bVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // o62.c
    public void q(o62.k handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    public void q0(long j13) {
        N.MSZPA7qE(j13);
    }

    @Override // l9.j
    public boolean r(androidx.media3.common.b bVar) {
        return false;
    }

    @Override // l62.d
    public void s(String id3, l1 offset, double d2, double d13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(offset, "offset");
    }

    @Override // hd.i
    public void t(Map map) {
    }

    @Override // m62.w
    public void u(ke2.d item, m62.b0 handler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    public void u0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        v0(this, pinId, null, 6);
    }

    @Override // l62.d
    public void v(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
    }

    @Override // df.i1
    public void w(JSONObject jSONObject) {
        String optString = jSONObject == null ? null : jSONObject.optString("id");
        if (optString == null) {
            Log.w(Profile.f29917h, "No user ID returned on Me request");
            return;
        }
        String optString2 = jSONObject.optString("link");
        String optString3 = jSONObject.optString("profile_picture", null);
        com.bugsnag.android.a0.t(new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null, optString3 != null ? Uri.parse(optString3) : null));
    }

    public void w0(long j13, ProxyChangeListener proxyChangeListener) {
        N.MCIk73GZ(j13, proxyChangeListener);
    }

    @Override // androidx.viewpager2.widget.n
    public void x(View page, float f13) {
        Intrinsics.checkNotNullParameter(page, "page");
        page.setTranslationX(hf0.b.f69002b * (-0.08f) * f13);
        page.setScaleX(1.0f - (Math.abs(f13) * 0.1f));
        page.setScaleY(1.0f - (Math.abs(f13) * 0.1f));
    }

    public void x0(long j13, ProxyChangeListener proxyChangeListener, String str, int i13, String str2, String[] strArr) {
        N.MyoFZt$2(j13, proxyChangeListener, str, i13, str2, strArr);
    }

    @Override // hd.i
    public void y(int i13, int i14) {
    }
}
