package oi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.zzad;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zznc;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f7 extends c5 {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f94753i = {"firebase_", "google_", "ga_"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f94754j = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f94755c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f94756d;

    /* renamed from: e, reason: collision with root package name */
    public int f94757e;

    /* renamed from: f, reason: collision with root package name */
    public ea.h f94758f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f94759g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f94760h;

    public f7(u4 u4Var) {
        super(u4Var);
        this.f94760h = null;
        this.f94756d = new AtomicLong(0L);
    }

    public static Bundle A(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zznc zzncVar = (zznc) it.next();
            String str = zzncVar.f32041j;
            String str2 = zzncVar.f32038g;
            if (str != null) {
                bundle.putString(str2, str);
            } else {
                Long l13 = zzncVar.f32040i;
                if (l13 != null) {
                    bundle.putLong(str2, l13.longValue());
                } else {
                    Double d2 = zzncVar.f32043l;
                    if (d2 != null) {
                        bundle.putDouble(str2, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static MessageDigest A0() {
        MessageDigest messageDigest;
        for (int i13 = 0; i13 < 2; i13++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static String D(String str, int i13, boolean z13) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i13) {
            return str;
        }
        if (z13) {
            return a.a.C(str.substring(0, str.offsetByCodePoints(0, i13)), "...");
        }
        return null;
    }

    public static void E(Bundle bundle, int i13, String str, Object obj) {
        if (j0(i13, bundle)) {
            bundle.putString("_ev", D(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static void R(b6 b6Var, Bundle bundle, boolean z13) {
        if (bundle == null || b6Var == null || (bundle.containsKey("_sc") && !z13)) {
            if (bundle != null && b6Var == null && z13) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = b6Var.f94697a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = b6Var.f94698b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", b6Var.f94699c);
    }

    public static void S(h7 h7Var, String str, int i13, String str2, String str3, int i14) {
        Bundle bundle = new Bundle();
        j0(i13, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i13 == 6 || i13 == 7 || i13 == 2) {
            bundle.putLong("_el", i14);
        }
        h7Var.a(str, "_err", bundle);
    }

    public static boolean V(Context context) {
        ActivityInfo receiverInfo;
        com.bumptech.glide.d.t(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean W(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean X(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean a0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            com.bumptech.glide.d.t(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static boolean b0(String str, String[] strArr) {
        com.bumptech.glide.d.t(strArr);
        for (Object obj : strArr) {
            if (str == obj) {
                return true;
            }
            if (str != null && str.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] d0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList i0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzad zzadVar = (zzad) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzadVar.f32017f);
            bundle.putString("origin", zzadVar.f32018g);
            bundle.putLong("creation_timestamp", zzadVar.f32020i);
            bundle.putString("name", zzadVar.f32019h.f32038g);
            Object e13 = zzadVar.f32019h.e();
            com.bumptech.glide.d.t(e13);
            kh2.m0.b1(bundle, e13);
            bundle.putBoolean("active", zzadVar.f32021j);
            String str = zzadVar.f32022k;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbg zzbgVar = zzadVar.f32023l;
            if (zzbgVar != null) {
                bundle.putString("timed_out_event_name", zzbgVar.f32030f);
                zzbb zzbbVar = zzbgVar.f32031g;
                if (zzbbVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbbVar.f());
                }
            }
            bundle.putLong("trigger_timeout", zzadVar.f32024m);
            zzbg zzbgVar2 = zzadVar.f32025n;
            if (zzbgVar2 != null) {
                bundle.putString("triggered_event_name", zzbgVar2.f32030f);
                zzbb zzbbVar2 = zzbgVar2.f32031g;
                if (zzbbVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbbVar2.f());
                }
            }
            bundle.putLong("triggered_timestamp", zzadVar.f32019h.f32039h);
            bundle.putLong("time_to_live", zzadVar.f32026o);
            zzbg zzbgVar3 = zzadVar.f32027p;
            if (zzbgVar3 != null) {
                bundle.putString("expired_event_name", zzbgVar3.f32030f);
                zzbb zzbbVar3 = zzbgVar3.f32031g;
                if (zzbbVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbbVar3.f());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean j0(int i13, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i13);
        return true;
    }

    public static boolean n0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean p0(String str) {
        String str2 = (String) s.Y.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean s0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean u0(String str) {
        com.bumptech.glide.d.o(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static long w(zzbb zzbbVar) {
        long j13 = 0;
        if (zzbbVar == null) {
            return 0L;
        }
        androidx.datastore.preferences.protobuf.a2 a2Var = new androidx.datastore.preferences.protobuf.a2(zzbbVar);
        while (a2Var.hasNext()) {
            if (zzbbVar.f32029f.get((String) a2Var.next()) instanceof Parcelable[]) {
                j13 += ((Parcelable[]) r3).length;
            }
        }
        return j13;
    }

    public static int w0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : ("_lgclid".equals(str) || "_gbraid".equals(str)) ? 100 : 36;
    }

    public static long x(byte[] bArr) {
        com.bumptech.glide.d.t(bArr);
        if (bArr.length <= 0) {
            throw new IllegalStateException();
        }
        int i13 = 0;
        long j13 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j13 += (bArr[length] & 255) << i13;
            i13 += 8;
        }
        return j13;
    }

    public final zzbg B(String str, Bundle bundle, String str2, long j13, boolean z13) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (u(str) != 0) {
            zzj().f95268f.b(m().g(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle z14 = z(str, bundle2, Collections.singletonList("_o"), true);
        if (z13) {
            z14 = g0(z14);
        }
        com.bumptech.glide.d.t(z14);
        return new zzbg(str, new zzbb(z14), str2, j13);
    }

    public final SecureRandom B0() {
        p();
        if (this.f94755c == null) {
            this.f94755c = new SecureRandom();
        }
        return this.f94755c;
    }

    public final Object C(int i13, Object obj, boolean z13, boolean z14) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return D(String.valueOf(obj), i13, z13);
        }
        if (!z14 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle g03 = g0((Bundle) parcelable);
                if (!g03.isEmpty()) {
                    arrayList.add(g03);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final void C0() {
        p();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                zzj().f95271i.c("Utils falling back to Random for random id");
            }
        }
        this.f94756d.set(nextLong);
    }

    public final void F(Bundle bundle, long j13) {
        long j14 = bundle.getLong("_et");
        if (j14 != 0) {
            y3 zzj = zzj();
            zzj.f95271i.b(Long.valueOf(j14), "Params already contained engagement");
        }
        bundle.putLong("_et", j13 + j14);
    }

    public final void G(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                o().H(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void H(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            zzj().f95273k.a(m().f(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final void I(com.google.android.gms.internal.measurement.u0 u0Var, int i13) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i13);
        try {
            u0Var.f(bundle);
        } catch (RemoteException e13) {
            y3 y3Var = ((u4) this.f24333a).f95205i;
            u4.d(y3Var);
            y3Var.f95271i.b(e13, "Error returning int value to wrapper");
        }
    }

    public final void J(com.google.android.gms.internal.measurement.u0 u0Var, long j13) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j13);
        try {
            u0Var.f(bundle);
        } catch (RemoteException e13) {
            y3 y3Var = ((u4) this.f24333a).f95205i;
            u4.d(y3Var);
            y3Var.f95271i.b(e13, "Error returning long value to wrapper");
        }
    }

    public final void K(com.google.android.gms.internal.measurement.u0 u0Var, Bundle bundle) {
        try {
            u0Var.f(bundle);
        } catch (RemoteException e13) {
            y3 y3Var = ((u4) this.f24333a).f95205i;
            u4.d(y3Var);
            y3Var.f95271i.b(e13, "Error returning bundle value to wrapper");
        }
    }

    public final void L(com.google.android.gms.internal.measurement.u0 u0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            u0Var.f(bundle);
        } catch (RemoteException e13) {
            y3 y3Var = ((u4) this.f24333a).f95205i;
            u4.d(y3Var);
            y3Var.f95271i.b(e13, "Error returning bundle list to wrapper");
        }
    }

    public final void M(com.google.android.gms.internal.measurement.u0 u0Var, boolean z13) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z13);
        try {
            u0Var.f(bundle);
        } catch (RemoteException e13) {
            y3 y3Var = ((u4) this.f24333a).f95205i;
            u4.d(y3Var);
            y3Var.f95271i.b(e13, "Error returning boolean value to wrapper");
        }
    }

    public final void N(com.google.android.gms.internal.measurement.u0 u0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            u0Var.f(bundle);
        } catch (RemoteException e13) {
            y3 y3Var = ((u4) this.f24333a).f95205i;
            u4.d(y3Var);
            y3Var.f95271i.b(e13, "Error returning byte array to wrapper");
        }
    }

    public final void O(String str, com.google.android.gms.internal.measurement.u0 u0Var) {
        try {
            u0Var.f(n60.o.a("r", str));
        } catch (RemoteException e13) {
            y3 y3Var = ((u4) this.f24333a).f95205i;
            u4.d(y3Var);
            y3Var.f95271i.b(e13, "Error returning string value to wrapper");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0080, code lost:
    
        if (U(40, "event param", r7) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.f7.P(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):void");
    }

    public final void Q(b4 b4Var, int i13) {
        Iterator it = new TreeSet(((Bundle) b4Var.f94693e).keySet()).iterator();
        int i14 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (u0(str) && (i14 = i14 + 1) > i13) {
                zzj().f95270h.a(m().c((String) b4Var.f94691c), m().a((Bundle) b4Var.f94693e), a.a.e("Event can't contain more than ", i13, " params"));
                j0(5, (Bundle) b4Var.f94693e);
                ((Bundle) b4Var.f94693e).remove(str);
            }
        }
    }

    public final void T(Parcelable[] parcelableArr, int i13, boolean z13) {
        com.bumptech.glide.d.t(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i14 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (u0(str) && !b0(str, h5.f94820j) && (i14 = i14 + 1) > i13) {
                    if (z13) {
                        zzj().f95270h.a(m().f(str), m().a(bundle), a.a.e("Param can't contain more than ", i13, " item-scoped custom parameters"));
                        j0(28, bundle);
                    } else {
                        zzj().f95270h.a(m().f(str), m().a(bundle), "Param cannot contain item-scoped custom parameters");
                        j0(23, bundle);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean U(int i13, String str, String str2) {
        if (str2 == null) {
            zzj().f95270h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i13) {
            return true;
        }
        y3 zzj = zzj();
        zzj.f95270h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i13), str2);
        return false;
    }

    public final boolean Y(String str, int i13, String str2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i13) {
                y3 zzj = zzj();
                zzj.f95273k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean Z(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            com.bumptech.glide.d.t(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (TextUtils.isEmpty(((u4) this.f24333a).f95198b)) {
                y3 zzj = zzj();
                zzj.f95270h.b(y3.v(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(((u4) this.f24333a).f95198b)) {
                zzj().f95270h.c("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        com.bumptech.glide.d.t(str2);
        if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            return true;
        }
        y3 zzj2 = zzj();
        zzj2.f95270h.b(y3.v(str2), "Invalid admob_app_id. Analytics disabled.");
        return false;
    }

    public final boolean c0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            zzj().f95270h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f94753i;
        for (int i13 = 0; i13 < 3; i13++) {
            if (str2.startsWith(strArr3[i13])) {
                zzj().f95270h.a(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !b0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && b0(str2, strArr2)) {
            return true;
        }
        zzj().f95270h.a(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean e0(int i13) {
        Boolean bool = ((u4) this.f24333a).m().f94727e;
        if (r0() < i13 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int f0(String str) {
        if (!l0("user property", str)) {
            return 6;
        }
        if (c0("user property", h5.f94815e, null, str)) {
            return !U(24, "user property", str) ? 6 : 0;
        }
        return 15;
    }

    public final Bundle g0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object h03 = h0(bundle.get(str), str);
                if (h03 == null) {
                    y3 zzj = zzj();
                    zzj.f95273k.b(m().f(str), "Param value can't be null");
                } else {
                    H(bundle2, str, h03);
                }
            }
        }
        return bundle2;
    }

    public final Object h0(Object obj, String str) {
        if ("_ev".equals(str)) {
            return C(Math.max(l().t(((u4) this.f24333a).k().z()), RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER), obj, true, true);
        }
        return C(s0(str) ? Math.max(l().t(((u4) this.f24333a).k().z()), RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) : l().t(((u4) this.f24333a).k().z()), obj, false, true);
    }

    public final boolean k0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo d2 = ph.b.a(context).d(64, str);
            if (d2 == null || (signatureArr = d2.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e13) {
            zzj().f95268f.b(e13, "Package name not found");
            return true;
        } catch (CertificateException e14) {
            zzj().f95268f.b(e14, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean l0(String str, String str2) {
        if (str2 == null) {
            zzj().f95270h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            zzj().f95270h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            zzj().f95270h.a(str, str2, "Name must start with a letter or _ (underscore). Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().f95270h.a(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final Object m0(Object obj, String str) {
        return "_ldl".equals(str) ? C(w0(str), obj, true, false) : C(w0(str), obj, false, false);
    }

    public final boolean o0(String str, String str2) {
        if (str2 == null) {
            zzj().f95270h.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            zzj().f95270h.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            zzj().f95270h.a(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                zzj().f95270h.a(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean q0(String str) {
        p();
        if (ph.b.a(zza()).f67746a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzj().f95275m.b(str, "Permission not granted");
        return false;
    }

    public final int r0() {
        if (this.f94760h == null) {
            ih.d dVar = ih.d.f72259b;
            Context zza = zza();
            dVar.getClass();
            AtomicBoolean atomicBoolean = ih.f.f72261a;
            int i13 = 0;
            try {
                i13 = zza.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f94760h = Integer.valueOf(i13 / 1000);
        }
        return this.f94760h.intValue();
    }

    @Override // oi.c5
    public final boolean s() {
        return true;
    }

    public final int t(Object obj, String str) {
        return "_ldl".equals(str) ? Y("user property referrer", w0(str), str, obj) : Y("user property", w0(str), str, obj) ? 0 : 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r10.f94759g.booleanValue() != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long t0() {
        /*
            r10 = this;
            r10.p()
            java.lang.Object r0 = r10.f24333a
            oi.u4 r0 = (oi.u4) r0
            oi.u3 r0 = r0.k()
            java.lang.String r0 = r0.z()
            boolean r0 = p0(r0)
            r1 = 0
            if (r0 != 0) goto L18
            return r1
        L18:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r4 = 30
            r5 = 0
            if (r0 >= r4) goto L23
            r6 = 4
            goto L4e
        L23:
            int r6 = com.bugsnag.android.f.b()
            r7 = 4
            if (r6 >= r7) goto L2d
            r6 = 8
            goto L4e
        L2d:
            if (r0 < r4) goto L3b
            int r0 = com.bugsnag.android.f.b()
            r4 = 3
            if (r0 <= r4) goto L3b
            int r0 = a.s0.s()
            goto L3c
        L3b:
            r0 = r3
        L3c:
            oi.s3 r4 = oi.s.U
            java.lang.Object r4 = r4.a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r0 >= r4) goto L4d
            r6 = 16
            goto L4e
        L4d:
            r6 = r1
        L4e:
            java.lang.String r0 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r0 = r10.q0(r0)
            if (r0 != 0) goto L59
            r8 = 2
            long r6 = r6 | r8
        L59:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Lbe
            java.lang.Boolean r0 = r10.f94759g
            if (r0 != 0) goto Lb3
            ea.h r0 = r10.y0()
            if (r0 != 0) goto L68
            goto Lbb
        L68:
            com.google.common.util.concurrent.c0 r0 = r0.b()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L91 java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95 java.util.concurrent.CancellationException -> L97
            r8 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = r0.get(r8, r4)     // Catch: java.util.concurrent.TimeoutException -> L91 java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95 java.util.concurrent.CancellationException -> L97
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.util.concurrent.TimeoutException -> L91 java.lang.InterruptedException -> L93 java.util.concurrent.ExecutionException -> L95 java.util.concurrent.CancellationException -> L97
            if (r0 == 0) goto L8a
            int r4 = r0.intValue()     // Catch: java.util.concurrent.TimeoutException -> L81 java.lang.InterruptedException -> L84 java.util.concurrent.ExecutionException -> L86 java.util.concurrent.CancellationException -> L88
            r5 = 1
            if (r4 != r5) goto L8a
            r3 = r5
            goto L8a
        L81:
            r3 = move-exception
        L82:
            r5 = r0
            goto L98
        L84:
            r3 = move-exception
            goto L82
        L86:
            r3 = move-exception
            goto L82
        L88:
            r3 = move-exception
            goto L82
        L8a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.util.concurrent.TimeoutException -> L81 java.lang.InterruptedException -> L84 java.util.concurrent.ExecutionException -> L86 java.util.concurrent.CancellationException -> L88
            r10.f94759g = r3     // Catch: java.util.concurrent.TimeoutException -> L81 java.lang.InterruptedException -> L84 java.util.concurrent.ExecutionException -> L86 java.util.concurrent.CancellationException -> L88
            goto La8
        L91:
            r3 = move-exception
            goto L98
        L93:
            r3 = move-exception
            goto L98
        L95:
            r3 = move-exception
            goto L98
        L97:
            r3 = move-exception
        L98:
            oi.y3 r0 = r10.zzj()
            java.lang.String r4 = "Measurement manager api exception"
            oi.a4 r0 = r0.f95271i
            r0.b(r3, r4)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.f94759g = r0
            r0 = r5
        La8:
            oi.y3 r3 = r10.zzj()
            java.lang.String r4 = "Measurement manager api status result"
            oi.a4 r3 = r3.f95276n
            r3.b(r0, r4)
        Lb3:
            java.lang.Boolean r0 = r10.f94759g
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lbe
        Lbb:
            r3 = 64
            long r6 = r6 | r3
        Lbe:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc5
            r0 = 1
            return r0
        Lc5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.f7.t0():long");
    }

    public final int u(String str) {
        if (!l0("event", str)) {
            return 2;
        }
        if (c0("event", h5.f94811a, h5.f94812b, str)) {
            return !U(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.f7.v(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean v0(String str) {
        List<ResolveInfo> queryIntentActivities;
        return (TextUtils.isEmpty(str) || (queryIntentActivities = zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    public final long x0() {
        long andIncrement;
        long j13;
        if (this.f94756d.get() != 0) {
            synchronized (this.f94756d) {
                this.f94756d.compareAndSet(-1L, 1L);
                andIncrement = this.f94756d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f94756d) {
            long nanoTime = System.nanoTime();
            ((oh.b) zzb()).getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i13 = this.f94757e + 1;
            this.f94757e = i13;
            j13 = nextLong + i13;
        }
        return j13;
    }

    public final Bundle y(Uri uri, boolean z13, boolean z14) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = z14 ? uri.getQueryParameter("gbraid") : null;
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = z13 ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z14 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && (!z13 || TextUtils.isEmpty(str9)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z14 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (z13 && !TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e13) {
            zzj().f95271i.b(e13, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final ea.h y0() {
        if (this.f94758f == null) {
            Context context = zza();
            Intrinsics.checkNotNullParameter(context, "context");
            fa.b r03 = g4.u.r0(context);
            this.f94758f = r03 != null ? new ea.h(r03) : null;
        }
        return this.f94758f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0075, code lost:
    
        if (U(40, "event param", r7) == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle z(java.lang.String r20, android.os.Bundle r21, java.util.List r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.f7.z(java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final String z0() {
        byte[] bArr = new byte[16];
        B0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }
}
