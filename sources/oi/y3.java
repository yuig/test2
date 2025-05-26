package oi;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.e9;
import com.google.android.gms.internal.measurement.h9;

/* loaded from: classes3.dex */
public final class y3 extends c5 {

    /* renamed from: c, reason: collision with root package name */
    public char f95265c;

    /* renamed from: d, reason: collision with root package name */
    public long f95266d;

    /* renamed from: e, reason: collision with root package name */
    public String f95267e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f95268f;

    /* renamed from: g, reason: collision with root package name */
    public final a4 f95269g;

    /* renamed from: h, reason: collision with root package name */
    public final a4 f95270h;

    /* renamed from: i, reason: collision with root package name */
    public final a4 f95271i;

    /* renamed from: j, reason: collision with root package name */
    public final a4 f95272j;

    /* renamed from: k, reason: collision with root package name */
    public final a4 f95273k;

    /* renamed from: l, reason: collision with root package name */
    public final a4 f95274l;

    /* renamed from: m, reason: collision with root package name */
    public final a4 f95275m;

    /* renamed from: n, reason: collision with root package name */
    public final a4 f95276n;

    public y3(u4 u4Var) {
        super(u4Var);
        this.f95265c = (char) 0;
        this.f95266d = -1L;
        this.f95268f = new a4(this, 6, false, false);
        this.f95269g = new a4(this, 6, true, false);
        this.f95270h = new a4(this, 6, false, true);
        this.f95271i = new a4(this, 5, false, false);
        this.f95272j = new a4(this, 5, true, false);
        this.f95273k = new a4(this, 5, false, true);
        this.f95274l = new a4(this, 4, false, false);
        this.f95275m = new a4(this, 3, false, false);
        this.f95276n = new a4(this, 2, false, false);
    }

    public static String t(Object obj, boolean z13) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i13 = 0;
        if (obj instanceof Long) {
            if (!z13) {
                return String.valueOf(obj);
            }
            Long l13 = (Long) obj;
            if (Math.abs(l13.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l13.longValue()));
            return str + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof c4 ? ((c4) obj).f94711a : z13 ? "-" : String.valueOf(obj);
        }
        Throwable th3 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z13 ? th3.getClass().getName() : th3.toString());
        String y13 = y(u4.class.getCanonicalName());
        StackTraceElement[] stackTrace = th3.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i13 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i13];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && y(className).equals(y13)) {
                sb3.append(": ");
                sb3.append(stackTraceElement);
                break;
            }
            i13++;
        }
        return sb3.toString();
    }

    public static String u(boolean z13, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String t13 = t(obj, z13);
        String t14 = t(obj2, z13);
        String t15 = t(obj3, z13);
        StringBuilder sb3 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb3.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(t13)) {
            sb3.append(str2);
            sb3.append(t13);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(t14)) {
            str3 = str2;
        } else {
            sb3.append(str2);
            sb3.append(t14);
        }
        if (!TextUtils.isEmpty(t15)) {
            sb3.append(str3);
            sb3.append(t15);
        }
        return sb3.toString();
    }

    public static c4 v(String str) {
        if (str == null) {
            return null;
        }
        return new c4(str);
    }

    public static String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        ((h9) e9.f31374b.get()).getClass();
        return ((Boolean) s.f95136y0.a(null)).booleanValue() ? "" : str;
    }

    public final a4 A() {
        return this.f95276n;
    }

    public final a4 B() {
        return this.f95271i;
    }

    public final String C() {
        long abs;
        Pair pair;
        if (n().f94769d == null) {
            return null;
        }
        a1.d dVar = n().f94769d;
        g4 g4Var = (g4) dVar.f242e;
        g4Var.p();
        g4Var.p();
        long j13 = ((g4) dVar.f242e).w().getLong((String) dVar.f239b, 0L);
        if (j13 == 0) {
            dVar.c();
            abs = 0;
        } else {
            ((oh.b) g4Var.zzb()).getClass();
            abs = Math.abs(j13 - System.currentTimeMillis());
        }
        long j14 = dVar.f238a;
        if (abs >= j14) {
            if (abs <= (j14 << 1)) {
                String string = g4Var.w().getString((String) dVar.f241d, null);
                long j15 = g4Var.w().getLong((String) dVar.f240c, 0L);
                dVar.c();
                pair = (string == null || j15 <= 0) ? g4.f94767y : new Pair(string, Long.valueOf(j15));
                if (pair != null || pair == g4.f94767y) {
                    return null;
                }
                return a.a.D(String.valueOf(pair.second), ":", (String) pair.first);
            }
            dVar.c();
        }
        pair = null;
        if (pair != null) {
        }
        return null;
    }

    public final String D() {
        String str;
        synchronized (this) {
            try {
                if (this.f95267e == null) {
                    Object obj = this.f24333a;
                    this.f95267e = ((u4) obj).f95200d != null ? ((u4) obj).f95200d : "FA";
                }
                com.bumptech.glide.d.t(this.f95267e);
                str = this.f95267e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return str;
    }

    @Override // oi.c5
    public final boolean s() {
        return false;
    }

    public final void w(int i13, boolean z13, boolean z14, String str, Object obj, Object obj2, Object obj3) {
        if (!z13 && x(i13)) {
            Log.println(i13, D(), u(false, str, obj, obj2, obj3));
        }
        if (z14 || i13 < 5) {
            return;
        }
        com.bumptech.glide.d.t(str);
        o4 o4Var = ((u4) this.f24333a).f95206j;
        if (o4Var == null) {
            Log.println(6, D(), "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!o4Var.f94712b) {
            Log.println(6, D(), "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i13 < 0) {
            i13 = 0;
        }
        if (i13 >= 9) {
            i13 = 8;
        }
        o4Var.y(new androidx.fragment.app.n1(this, i13, str, obj, obj2, obj3, 1));
    }

    public final boolean x(int i13) {
        return Log.isLoggable(D(), i13);
    }

    public final a4 z() {
        return this.f95268f;
    }
}
