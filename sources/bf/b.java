package bf;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.z;
import ao2.m0;
import ao2.m2;
import ao2.v0;
import bo2.e;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ho2.q;
import i2.a2;
import i2.b0;
import i2.c2;
import i2.d2;
import i2.n;
import i2.o;
import i2.z1;
import i2.z3;
import j2.l0;
import ja.c0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.atomic.AtomicReference;
import k1.t2;
import kh2.s0;
import kh2.w;
import ko2.f;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import n4.d;
import n4.l;
import ok.r;
import org.xmlpull.v1.XmlPullParserException;
import pk.a0;
import pk.k2;
import q2.k;
import qd.i;
import t3.p;
import td.d0;
import td.o0;
import ue.c;
import wd.j0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    public static volatile Integer f22739a;

    /* renamed from: b */
    public static final a f22740b = new a(0);

    public static BigDecimal A(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        int dataPosition = parcel.dataPosition();
        if (l03 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + l03);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static Bundle B(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        int dataPosition = parcel.dataPosition();
        if (l03 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + l03);
        return readBundle;
    }

    public static byte[] C(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        int dataPosition = parcel.dataPosition();
        if (l03 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + l03);
        return createByteArray;
    }

    public static int[] D(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        int dataPosition = parcel.dataPosition();
        if (l03 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + l03);
        return createIntArray;
    }

    public static Parcelable E(Parcel parcel, int i13, Parcelable.Creator creator) {
        int l03 = l0(parcel, i13);
        int dataPosition = parcel.dataPosition();
        if (l03 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + l03);
        return parcelable;
    }

    public static String F(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        int dataPosition = parcel.dataPosition();
        if (l03 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + l03);
        return readString;
    }

    public static String[] G(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        int dataPosition = parcel.dataPosition();
        if (l03 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + l03);
        return createStringArray;
    }

    public static ArrayList H(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        int dataPosition = parcel.dataPosition();
        if (l03 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + l03);
        return createStringArrayList;
    }

    public static Object[] I(Parcel parcel, int i13, Parcelable.Creator creator) {
        int l03 = l0(parcel, i13);
        int dataPosition = parcel.dataPosition();
        if (l03 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + l03);
        return createTypedArray;
    }

    public static ArrayList J(Parcel parcel, int i13, Parcelable.Creator creator) {
        int l03 = l0(parcel, i13);
        int dataPosition = parcel.dataPosition();
        if (l03 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + l03);
        return createTypedArrayList;
    }

    public static void K(Map map, LinkedHashMap linkedHashMap, r rVar, AbstractMap abstractMap, AbstractMap abstractMap2, AbstractMap abstractMap3, AbstractMap abstractMap4) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (linkedHashMap.containsKey(key)) {
                Object remove = abstractMap2.remove(key);
                rVar.getClass();
                if (value != remove && (value == null || remove == null || !value.equals(remove))) {
                    abstractMap4.put(key, new k2(value, remove));
                } else {
                    abstractMap3.put(key, value);
                }
            } else {
                abstractMap.put(key, value);
            }
        }
    }

    public static void L(Parcel parcel, int i13) {
        if (parcel.dataPosition() != i13) {
            throw new SafeParcelReader$ParseException(a.a.d("Overread allowed size end=", i13), parcel);
        }
    }

    public static boolean M(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static int N(int i13, byte[] bArr) {
        byte b13;
        while (i13 < bArr.length && (b13 = bArr[i13]) != 10) {
            if (Character.isDigit(b13)) {
                int i14 = i13 + 1;
                while (i14 < bArr.length && Character.isDigit(bArr[i14])) {
                    i14++;
                }
                return Integer.parseInt(new String(bArr, 0, i13, i14 - i13));
            }
            i13++;
        }
        return -1;
    }

    public static int O(Context context) {
        int i13;
        if (f22739a == null) {
            synchronized (b.class) {
                try {
                    if (f22739a == null) {
                        long U = U(context);
                        if (U == -1) {
                            i13 = f(context);
                        } else if (U <= 805306368) {
                            i13 = T() <= 1 ? 2009 : 2010;
                        } else if (U <= 1073741824) {
                            if (P() < 1300000) {
                                i13 = 2011;
                            }
                            i13 = 2012;
                        } else {
                            if (U <= 1610612736) {
                                if (P() < 1800000) {
                                    i13 = 2012;
                                }
                            } else if (U > 2147483648L) {
                                i13 = U <= 3221225472L ? 2014 : U <= 5368709120L ? 2015 : 2016;
                            }
                            i13 = 2013;
                        }
                        f22739a = Integer.valueOf(i13);
                    }
                } finally {
                }
            }
        }
        return f22739a.intValue();
    }

    public static int P() {
        int i13 = -1;
        for (int i14 = 0; i14 < T(); i14++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i14 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i15 = 0;
                        while (Character.isDigit(bArr[i15]) && i15 < 128) {
                            i15++;
                        }
                        int parseInt = Integer.parseInt(new String(bArr, 0, i15));
                        if (parseInt > i13) {
                            i13 = parseInt;
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th3) {
                        fileInputStream.close();
                        throw th3;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
                return -1;
            }
        }
        if (i13 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int X = X(fileInputStream2) * 1000;
                if (X > i13) {
                    i13 = X;
                }
            } finally {
                fileInputStream2.close();
            }
        }
        return i13;
    }

    public static int Q() {
        return new File("/sys/devices/system/cpu/").listFiles(f22740b).length;
    }

    public static int R(String str) {
        FileInputStream fileInputStream;
        int i13 = -1;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (IOException unused) {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            if (readLine != null && readLine.matches("0-[\\d]+$")) {
                i13 = Integer.valueOf(readLine.substring(2)).intValue() + 1;
            }
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            return i13;
        } catch (IOException unused3) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused4) {
                }
            }
            return -1;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public static final u S(z zVar) {
        u uVar;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        s lifecycle = zVar.getLifecycle();
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        loop0: while (true) {
            uVar = (u) lifecycle.f18674a.get();
            if (uVar == null) {
                m2 b13 = c.b();
                f fVar = v0.f20219a;
                uVar = new u(lifecycle, g.d(((e) q.f69782a).f23612f, b13));
                AtomicReference atomicReference = lifecycle.f18674a;
                while (!atomicReference.compareAndSet(null, uVar)) {
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                f fVar2 = v0.f20219a;
                j.z(uVar, ((e) q.f69782a).f23612f, null, new t(uVar, null), 2);
                break loop0;
            }
            break;
        }
        return uVar;
    }

    public static int T() {
        try {
            int R = R("/sys/devices/system/cpu/possible");
            if (R == -1) {
                R = R("/sys/devices/system/cpu/present");
            }
            return R == -1 ? Q() : R;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static long U(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static final boolean V(a3.e eVar) {
        float b13 = a3.a.b(eVar.f492e);
        long j13 = eVar.f492e;
        if (b13 == a3.a.c(j13)) {
            float b14 = a3.a.b(j13);
            long j14 = eVar.f493f;
            if (b14 == a3.a.b(j14) && a3.a.b(j13) == a3.a.c(j14)) {
                float b15 = a3.a.b(j13);
                long j15 = eVar.f494g;
                if (b15 == a3.a.b(j15) && a3.a.b(j13) == a3.a.c(j15)) {
                    float b16 = a3.a.b(j13);
                    long j16 = eVar.f495h;
                    if (b16 == a3.a.b(j16) && a3.a.b(j13) == a3.a.c(j16)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final x3.b W(android.content.res.Resources.Theme r39, android.content.res.Resources r40, android.content.res.XmlResourceParser r41, int r42) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.b.W(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):x3.b");
    }

    public static int X(FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i13 = 0;
            while (i13 < read) {
                byte b13 = bArr[i13];
                if (b13 == 10 || i13 == 0) {
                    if (b13 == 10) {
                        i13++;
                    }
                    for (int i14 = i13; i14 < read; i14++) {
                        int i15 = i14 - i13;
                        if (bArr[i14] != "cpu MHz".charAt(i15)) {
                            break;
                        }
                        if (i15 == 6) {
                            return N(i14, bArr);
                        }
                    }
                }
                i13++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }

    public static final Object Y(z1 z1Var, c2 c2Var) {
        Intrinsics.g(c2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object obj = z1Var.get(c2Var);
        if (obj == null) {
            obj = c2Var.a();
        }
        return ((z3) obj).a(z1Var);
    }

    public static final Object Z(tc.f fVar) {
        Object U1;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        tc.e peek = fVar.peek();
        switch (tc.a.f117168a[peek.ordinal()]) {
            case 1:
                fVar.B1();
                return null;
            case 2:
                return Boolean.valueOf(fVar.R0());
            case 3:
            case 4:
                try {
                    try {
                        try {
                            U1 = Integer.valueOf(fVar.o0());
                        } catch (Exception unused) {
                            U1 = Long.valueOf(fVar.W1());
                        }
                    } catch (Exception unused2) {
                        U1 = fVar.U1();
                    }
                } catch (Exception unused3) {
                    U1 = Double.valueOf(fVar.s1());
                }
                return U1;
            case 5:
                return fVar.Y0();
            case 6:
                fVar.s();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (fVar.hasNext()) {
                    linkedHashMap.put(fVar.k0(), Z(fVar));
                }
                fVar.v();
                return linkedHashMap;
            case 7:
                fVar.u();
                ArrayList arrayList = new ArrayList();
                while (fVar.hasNext()) {
                    arrayList.add(Z(fVar));
                }
                fVar.t();
                return arrayList;
            default:
                throw new IllegalStateException(("unknown token " + peek).toString());
        }
    }

    public static final d a(Context context) {
        float f13 = context.getResources().getConfiguration().fontScale;
        float f14 = context.getResources().getDisplayMetrics().density;
        o4.a b13 = o4.b.b(f13);
        if (b13 == null) {
            b13 = new l(f13);
        }
        return new d(f14, f13, b13);
    }

    public static boolean a0(Parcel parcel, int i13) {
        v0(parcel, i13, 4);
        return parcel.readInt() != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map b(AbstractMap abstractMap) {
        return abstractMap instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap) abstractMap) : Collections.unmodifiableMap(abstractMap);
    }

    public static byte b0(Parcel parcel, int i13) {
        v0(parcel, i13, 4);
        return (byte) parcel.readInt();
    }

    public static String c(int i13, int i14, String str) {
        if (i13 < 0) {
            return bs1.c.q1("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return bs1.c.q1("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException(a.a.d("negative size: ", i14));
    }

    public static double c0(Parcel parcel, int i13) {
        v0(parcel, i13, 8);
        return parcel.readDouble();
    }

    public static final int d(int[] iArr, int i13) {
        int length = iArr.length - 1;
        int i14 = 0;
        while (i14 <= length) {
            int i15 = (i14 + length) >>> 1;
            int i16 = iArr[i15];
            if (i13 > i16) {
                i14 = i15 + 1;
            } else {
                if (i13 >= i16) {
                    return i15;
                }
                length = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    public static Double d0(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        if (l03 == 0) {
            return null;
        }
        u0(parcel, l03, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static int e(int i13) {
        if (i13 < 3) {
            a0.C(i13, "expectedSize");
            return i13 + 1;
        }
        if (i13 < 1073741824) {
            return (int) Math.ceil(i13 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static float e0(Parcel parcel, int i13) {
        v0(parcel, i13, 4);
        return parcel.readFloat();
    }

    public static int f(Context context) {
        ArrayList arrayList = new ArrayList();
        int T = T();
        int i13 = 2012;
        int i14 = T < 1 ? -1 : T == 1 ? 2008 : T <= 3 ? 2011 : 2012;
        if (i14 != -1) {
            arrayList.add(Integer.valueOf(i14));
        }
        long P = P();
        int i15 = P == -1 ? -1 : P <= 528000 ? 2008 : P <= 620000 ? 2009 : P <= 1020000 ? 2010 : P <= 1220000 ? 2011 : P <= 1520000 ? 2012 : P <= 2020000 ? 2013 : 2014;
        if (i15 != -1) {
            arrayList.add(Integer.valueOf(i15));
        }
        long U = U(context);
        if (U <= 0) {
            i13 = -1;
        } else if (U <= 201326592) {
            i13 = 2008;
        } else if (U <= 304087040) {
            i13 = 2009;
        } else if (U <= 536870912) {
            i13 = 2010;
        } else if (U <= 1073741824) {
            i13 = 2011;
        } else if (U > 1610612736) {
            i13 = U <= 2147483648L ? 2013 : 2014;
        }
        if (i13 != -1) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = arrayList.size() / 2;
        int i16 = size - 1;
        return ((((Integer) arrayList.get(size)).intValue() - ((Integer) arrayList.get(i16)).intValue()) / 2) + ((Integer) arrayList.get(i16)).intValue();
    }

    public static Float f0(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        if (l03 == 0) {
            return null;
        }
        u0(parcel, l03, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static void g(long j13, String str, boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException(bs1.c.q1(str, Long.valueOf(j13)));
        }
    }

    public static IBinder g0(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        int dataPosition = parcel.dataPosition();
        if (l03 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + l03);
        return readStrongBinder;
    }

    public static void h(String str, boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static int h0(Parcel parcel, int i13) {
        v0(parcel, i13, 4);
        return parcel.readInt();
    }

    public static void i(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    public static Integer i0(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        if (l03 == 0) {
            return null;
        }
        u0(parcel, l03, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void j(String str, boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException(str);
        }
    }

    public static long j0(Parcel parcel, int i13) {
        v0(parcel, i13, 8);
        return parcel.readLong();
    }

    public static void k(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    public static Long k0(Parcel parcel, int i13) {
        int l03 = l0(parcel, i13);
        if (l03 == 0) {
            return null;
        }
        u0(parcel, l03, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static void l(int i13, int i14) {
        String q13;
        if (i13 < 0 || i13 >= i14) {
            if (i13 < 0) {
                q13 = bs1.c.q1("%s (%s) must not be negative", "index", Integer.valueOf(i13));
            } else {
                if (i14 < 0) {
                    throw new IllegalArgumentException(a.a.d("negative size: ", i14));
                }
                q13 = bs1.c.q1("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i13), Integer.valueOf(i14));
            }
            throw new IndexOutOfBoundsException(q13);
        }
    }

    public static int l0(Parcel parcel, int i13) {
        return (i13 & (-65536)) != -65536 ? (char) (i13 >> 16) : parcel.readInt();
    }

    public static void m(int i13, int i14) {
        if (i13 < 0 || i13 >= i14) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static final t2 m0(o oVar) {
        Object[] objArr = new Object[0];
        r2.s sVar = t2.f78026i;
        boolean f13 = ((i2.s) oVar).f(0);
        i2.s sVar2 = (i2.s) oVar;
        Object J2 = sVar2.J();
        if (f13 || J2 == n.f71185a) {
            J2 = new k1.m2(0);
            sVar2.g0(J2);
        }
        return (t2) so.a.i(objArr, sVar, (Function0) J2, sVar2, 0, 4);
    }

    public static void n(Object obj) {
        obj.getClass();
    }

    public static final void n0(l0 l0Var, int i13, int i14) {
        int i15 = 1 << i13;
        int i16 = l0Var.f74467g;
        if ((i16 & i15) == 0) {
            l0Var.f74467g = i15 | i16;
            l0Var.f74463c[(l0Var.f74464d - l0Var.E1().f74453a) + i13] = i14;
        } else {
            m0.p0("Already pushed argument " + l0Var.E1().b(i13));
            throw null;
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void o0(l0 l0Var, int i13, Object obj) {
        int i14 = 1 << i13;
        int i15 = l0Var.f74468h;
        if ((i15 & i14) == 0) {
            l0Var.f74468h = i14 | i15;
            l0Var.f74465e[(l0Var.f74466f - l0Var.E1().f74454b) + i13] = obj;
        } else {
            m0.p0("Already pushed argument " + l0Var.E1().c(i13));
            throw null;
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void p0(Parcel parcel, int i13) {
        parcel.setDataPosition(parcel.dataPosition() + l0(parcel, i13));
    }

    public static void q(int i13, int i14) {
        if (i13 < 0 || i13 > i14) {
            throw new IndexOutOfBoundsException(c(i13, i14, "index"));
        }
    }

    public static final q2.l q0(d2[] d2VarArr, z1 z1Var, z1 z1Var2) {
        q2.l lVar = q2.l.f102116g;
        lVar.getClass();
        k kVar = new k(lVar);
        for (d2 d2Var : d2VarArr) {
            b0 b0Var = d2Var.f71093a;
            Intrinsics.g(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            c2 c2Var = (c2) b0Var;
            if (d2Var.f71098f || !z1Var.containsKey(c2Var)) {
                kVar.put(c2Var, c2Var.b(d2Var, (z3) z1Var2.get(c2Var)));
            }
        }
        return kVar.h();
    }

    public static void r(int i13, int i14, int i15) {
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            throw new IndexOutOfBoundsException((i13 < 0 || i13 > i15) ? c(i13, i15, "start index") : (i14 < 0 || i14 > i15) ? c(i14, i15, "end index") : bs1.c.q1("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13)));
        }
    }

    public static int r0(Parcel parcel) {
        int readInt = parcel.readInt();
        int l03 = l0(parcel, readInt);
        char c13 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c13 != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i13 = l03 + dataPosition;
        if (i13 < dataPosition || i13 > parcel.dataSize()) {
            throw new SafeParcelReader$ParseException(a.a.f("Size read is invalid start=", dataPosition, " end=", i13), parcel);
        }
        return i13;
    }

    public static void s(String str, boolean z13) {
        if (!z13) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static final h3.f s0(int i13, o oVar) {
        i2.s sVar = (i2.s) oVar;
        Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
        Resources R0 = s0.R0(sVar);
        Resources.Theme theme = context.getTheme();
        Configuration configuration = R0.getConfiguration();
        boolean h10 = sVar.h(configuration) | sVar.f(i13) | sVar.h(R0) | sVar.h(theme);
        Object J2 = sVar.J();
        if (h10 || J2 == n.f71185a) {
            TypedValue typedValue = new TypedValue();
            R0.getValue(i13, typedValue, true);
            XmlResourceParser xml = R0.getXml(i13);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            Unit unit = Unit.f80348a;
            J2 = W(theme, R0, xml, typedValue.changingConfigurations).f131599a;
            sVar.g0(J2);
        }
        return (h3.f) J2;
    }

    public static void t(boolean z13) {
        if (!z13) {
            throw new IllegalStateException();
        }
    }

    public static u2.q t0(u2.q qVar, t2 t2Var, int i13) {
        return m0.p(qVar, p.f116119m, new androidx.compose.foundation.e(t2Var, false, null, (i13 & 2) != 0));
    }

    public static void u(String str, boolean z13) {
        if (!z13) {
            throw new IllegalStateException(str);
        }
    }

    public static void u0(Parcel parcel, int i13, int i14) {
        if (i13 == i14) {
            return;
        }
        throw new SafeParcelReader$ParseException(a.a.p(a.a.t("Expected size ", i14, " got ", i13, " (0x"), Integer.toHexString(i13), ")"), parcel);
    }

    public static void v(boolean z13) {
        if (!z13) {
            throw new IllegalStateException();
        }
    }

    public static void v0(Parcel parcel, int i13, int i14) {
        int l03 = l0(parcel, i13);
        if (l03 == i14) {
            return;
        }
        throw new SafeParcelReader$ParseException(a.a.p(a.a.t("Expected size ", i14, " got ", l03, " (0x"), Integer.toHexString(l03), ")"), parcel);
    }

    public static void w(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void x(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static com.bumptech.glide.j y(com.bumptech.glide.b bVar, List list, w wVar) {
        nd.n eVar;
        nd.n aVar;
        int i13;
        Resources resources;
        int i14;
        String str;
        int i15;
        int i16;
        qd.d dVar = bVar.f29741b;
        com.bumptech.glide.f fVar = bVar.f29743d;
        Context applicationContext = fVar.getApplicationContext();
        c0 c0Var = fVar.f29774h;
        com.bumptech.glide.j jVar = new com.bumptech.glide.j();
        wd.j jVar2 = new wd.j();
        a2 a2Var = jVar.f29786g;
        synchronized (a2Var) {
            a2Var.f71073a.add(jVar2);
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 27) {
            wd.s sVar = new wd.s();
            a2 a2Var2 = jVar.f29786g;
            synchronized (a2Var2) {
                a2Var2.f71073a.add(sVar);
            }
        }
        Resources resources2 = applicationContext.getResources();
        List d2 = jVar.d();
        i iVar = bVar.f29744e;
        yd.a aVar2 = new yd.a(applicationContext, d2, dVar, iVar);
        nd.n j0Var = new j0(dVar, new wc.j(10));
        wd.o oVar = new wd.o(jVar.d(), resources2.getDisplayMetrics(), dVar, iVar);
        int i18 = 2;
        if (i17 < 28 || !c0Var.f75176a.containsKey(com.bumptech.glide.c.class)) {
            eVar = new wd.e(oVar, 0);
            aVar = new wd.a(i18, oVar, iVar);
        } else {
            aVar = new wd.f(1);
            eVar = new wd.f(0);
        }
        if (i17 >= 28) {
            i13 = i17;
            resources = resources2;
            jVar.c(new xd.b(new tb.c(d2, iVar), 1), InputStream.class, Drawable.class, "Animation");
            i14 = 0;
            jVar.c(new xd.b(new tb.c(d2, iVar), i14), ByteBuffer.class, Drawable.class, "Animation");
        } else {
            i13 = i17;
            resources = resources2;
            i14 = 0;
        }
        nd.n eVar2 = new xd.e(applicationContext);
        nd.o bVar2 = new wd.b(iVar);
        zd.a aVar3 = new ck2.a(3, i14);
        zd.a bVar3 = new wc.b(12);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        wc.j jVar3 = new wc.j(6);
        a2 a2Var3 = jVar.f29781b;
        synchronized (a2Var3) {
            a2Var3.f71073a.add(new ce.a(ByteBuffer.class, jVar3));
        }
        rd.j jVar4 = new rd.j(iVar, 4);
        a2 a2Var4 = jVar.f29781b;
        synchronized (a2Var4) {
            a2Var4.f71073a.add(new ce.a(InputStream.class, jVar4));
        }
        jVar.c(eVar, ByteBuffer.class, Bitmap.class, "Bitmap");
        jVar.c(aVar, InputStream.class, Bitmap.class, "Bitmap");
        String str2 = Build.FINGERPRINT;
        if (!"robolectric".equals(str2)) {
            str = "Animation";
            jVar.c(new wd.e(oVar, 1), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        } else {
            str = "Animation";
        }
        jVar.c(new j0(dVar, new wc.b()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        jVar.c(j0Var, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        d0 d0Var = td.l0.f117416a;
        jVar.a(Bitmap.class, Bitmap.class, d0Var);
        jVar.c(new wd.d0(0), Bitmap.class, Bitmap.class, "Bitmap");
        jVar.b(Bitmap.class, bVar2);
        Resources resources3 = resources;
        jVar.c(new wd.a(resources3, eVar), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.c(new wd.a(resources3, aVar), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.c(new wd.a(resources3, j0Var), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        jVar.b(BitmapDrawable.class, new qq2.c(7, dVar, bVar2));
        String str3 = str;
        jVar.c(new yd.j(d2, aVar2, iVar), InputStream.class, yd.c.class, str3);
        jVar.c(aVar2, ByteBuffer.class, yd.c.class, str3);
        jVar.b(yd.c.class, new wc.j(11));
        jVar.a(ld.a.class, ld.a.class, d0Var);
        jVar.c(new wd.e(dVar, 2), ld.a.class, Bitmap.class, "Bitmap");
        jVar.c(eVar2, Uri.class, Drawable.class, "legacy_append");
        jVar.c(new wd.a(1, eVar2, dVar), Uri.class, Bitmap.class, "legacy_append");
        int i19 = 2;
        jVar.g(new h(i19));
        jVar.a(File.class, ByteBuffer.class, new td.d(i19));
        jVar.a(File.class, InputStream.class, new td.q(1));
        jVar.c(new wd.d0(2), File.class, File.class, "legacy_append");
        jVar.a(File.class, ParcelFileDescriptor.class, new td.q(0));
        jVar.a(File.class, File.class, d0Var);
        jVar.g(new m(iVar));
        int i23 = 1;
        if (!"robolectric".equals(str2)) {
            jVar.g(new h(i23));
        }
        d0 lVar = new td.l(applicationContext, 2);
        d0 lVar2 = new td.l(applicationContext, 0);
        d0 lVar3 = new td.l(applicationContext, 1);
        Class cls = Integer.TYPE;
        jVar.a(cls, InputStream.class, lVar);
        jVar.a(Integer.class, InputStream.class, lVar);
        jVar.a(cls, AssetFileDescriptor.class, lVar2);
        jVar.a(Integer.class, AssetFileDescriptor.class, lVar2);
        jVar.a(cls, Drawable.class, lVar3);
        jVar.a(Integer.class, Drawable.class, lVar3);
        jVar.a(Uri.class, InputStream.class, new td.l(applicationContext, 5));
        jVar.a(Uri.class, AssetFileDescriptor.class, new td.l(applicationContext, 4));
        d0 j0Var2 = new td.j0(2, resources3);
        d0 j0Var3 = new td.j0(0, resources3);
        d0 j0Var4 = new td.j0(1, resources3);
        jVar.a(Integer.class, Uri.class, j0Var2);
        jVar.a(cls, Uri.class, j0Var2);
        jVar.a(Integer.class, AssetFileDescriptor.class, j0Var3);
        jVar.a(cls, AssetFileDescriptor.class, j0Var3);
        jVar.a(Integer.class, InputStream.class, j0Var4);
        jVar.a(cls, InputStream.class, j0Var4);
        jVar.a(String.class, InputStream.class, new td.k(0));
        jVar.a(Uri.class, InputStream.class, new td.k(0));
        jVar.a(String.class, InputStream.class, new td.d(5));
        jVar.a(String.class, ParcelFileDescriptor.class, new td.d(4));
        jVar.a(String.class, AssetFileDescriptor.class, new td.d(3));
        jVar.a(Uri.class, InputStream.class, new td.b(applicationContext.getAssets(), 1));
        jVar.a(Uri.class, AssetFileDescriptor.class, new td.b(applicationContext.getAssets(), 0));
        jVar.a(Uri.class, InputStream.class, new td.l(applicationContext, 6));
        jVar.a(Uri.class, InputStream.class, new td.l(applicationContext, 7));
        if (i13 >= 29) {
            i15 = 1;
            jVar.a(Uri.class, InputStream.class, new ud.c(applicationContext, 1));
            i16 = 0;
            jVar.a(Uri.class, ParcelFileDescriptor.class, new ud.c(applicationContext, 0));
        } else {
            i15 = 1;
            i16 = 0;
        }
        jVar.a(Uri.class, InputStream.class, new o0(contentResolver, 2));
        jVar.a(Uri.class, ParcelFileDescriptor.class, new o0(contentResolver, i15));
        jVar.a(Uri.class, AssetFileDescriptor.class, new o0(contentResolver, i16));
        jVar.a(Uri.class, InputStream.class, new td.d(6));
        jVar.a(URL.class, InputStream.class, new td.d(7));
        jVar.a(Uri.class, File.class, new td.l(applicationContext, 3));
        int i24 = 1;
        jVar.a(td.t.class, InputStream.class, new td.k(1));
        jVar.a(byte[].class, ByteBuffer.class, new td.d(0));
        jVar.a(byte[].class, InputStream.class, new td.d(i24));
        jVar.a(Uri.class, Uri.class, d0Var);
        jVar.a(Drawable.class, Drawable.class, d0Var);
        jVar.c(new wd.d0(i24), Drawable.class, Drawable.class, "legacy_append");
        jVar.h(Bitmap.class, BitmapDrawable.class, new rd.j(resources3));
        jVar.h(Bitmap.class, byte[].class, aVar3);
        jVar.h(Drawable.class, byte[].class, new x92.b(dVar, aVar3, bVar3, 10));
        jVar.h(yd.c.class, byte[].class, bVar3);
        nd.n j0Var5 = new j0(dVar, new wc.j(9));
        jVar.c(j0Var5, ByteBuffer.class, Bitmap.class, "legacy_append");
        jVar.c(new wd.a(resources3, j0Var5), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it.next();
            try {
                okHttpGlideModule.a(applicationContext, bVar, jVar);
            } catch (AbstractMethodError e13) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(okHttpGlideModule.getClass().getName()), e13);
            }
        }
        if (wVar != null) {
            wVar.t0(applicationContext, bVar, jVar);
        }
        return jVar;
    }

    public static Handler z(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return o.d.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e13) {
            e = e13;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e14) {
            e = e14;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e15) {
            e = e15;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e16) {
            Throwable cause = e16.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
