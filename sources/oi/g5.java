package oi;

import android.os.Bundle;
import java.util.EnumMap;

/* loaded from: classes3.dex */
public final class g5 {

    /* renamed from: c, reason: collision with root package name */
    public static final g5 f94790c = new g5(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f94791a;

    /* renamed from: b, reason: collision with root package name */
    public final int f94792b;

    public g5(EnumMap enumMap, int i13) {
        EnumMap enumMap2 = new EnumMap(f5.class);
        this.f94791a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f94792b = i13;
    }

    public static String a(int i13) {
        return i13 != -20 ? i13 != -10 ? i13 != 0 ? i13 != 30 ? i13 != 90 ? i13 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API";
    }

    public static g5 b(int i13, Bundle bundle) {
        f5[] f5VarArr;
        if (bundle == null) {
            return new g5(null, null, i13);
        }
        EnumMap enumMap = new EnumMap(f5.class);
        f5VarArr = e5.STORAGE.zzd;
        for (f5 f5Var : f5VarArr) {
            enumMap.put((EnumMap) f5Var, (f5) f(bundle.getString(f5Var.zze)));
        }
        return new g5(enumMap, i13);
    }

    public static g5 c(int i13, String str) {
        EnumMap enumMap = new EnumMap(f5.class);
        if (str != null) {
            f5[] zza = e5.STORAGE.zza();
            for (int i14 = 0; i14 < zza.length; i14++) {
                f5 f5Var = zza[i14];
                int i15 = i14 + 2;
                if (i15 < str.length()) {
                    char charAt = str.charAt(i15);
                    enumMap.put((EnumMap) f5Var, (f5) (charAt != '0' ? charAt != '1' ? null : Boolean.TRUE : Boolean.FALSE));
                }
            }
        }
        return new g5(enumMap, i13);
    }

    public static Boolean f(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final g5 d(g5 g5Var) {
        f5[] f5VarArr;
        EnumMap enumMap = new EnumMap(f5.class);
        f5VarArr = e5.STORAGE.zzd;
        for (f5 f5Var : f5VarArr) {
            Boolean bool = (Boolean) this.f94791a.get(f5Var);
            Boolean bool2 = (Boolean) g5Var.f94791a.get(f5Var);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) f5Var, (f5) bool);
        }
        return new g5(enumMap, 100);
    }

    public final boolean e(f5 f5Var) {
        Boolean bool = (Boolean) this.f94791a.get(f5Var);
        return bool == null || bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        f5[] f5VarArr;
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        f5VarArr = e5.STORAGE.zzd;
        int length = f5VarArr.length;
        int i13 = 0;
        while (true) {
            boolean z13 = true;
            if (i13 >= length) {
                return this.f94792b == g5Var.f94792b;
            }
            f5 f5Var = f5VarArr[i13];
            Boolean bool = (Boolean) this.f94791a.get(f5Var);
            boolean z14 = bool == null ? false : bool.booleanValue() ? true : 2;
            Boolean bool2 = (Boolean) g5Var.f94791a.get(f5Var);
            if (bool2 == null) {
                z13 = false;
            } else if (!bool2.booleanValue()) {
                z13 = 2;
            }
            if (z14 != z13) {
                return false;
            }
            i13++;
        }
    }

    public final g5 g(g5 g5Var) {
        f5[] f5VarArr;
        EnumMap enumMap = new EnumMap(f5.class);
        f5VarArr = e5.STORAGE.zzd;
        for (f5 f5Var : f5VarArr) {
            Boolean bool = (Boolean) this.f94791a.get(f5Var);
            if (bool == null) {
                bool = (Boolean) g5Var.f94791a.get(f5Var);
            }
            enumMap.put((EnumMap) f5Var, (f5) bool);
        }
        return new g5(enumMap, this.f94792b);
    }

    public final boolean h(g5 g5Var, f5... f5VarArr) {
        for (f5 f5Var : f5VarArr) {
            Boolean bool = (Boolean) this.f94791a.get(f5Var);
            Boolean bool2 = (Boolean) g5Var.f94791a.get(f5Var);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f94792b * 17;
        for (Boolean bool : this.f94791a.values()) {
            i13 = (i13 * 31) + (bool == null ? 0 : bool.booleanValue() ? 1 : 2);
        }
        return i13;
    }

    public final String i() {
        StringBuilder sb3 = new StringBuilder("G1");
        for (f5 f5Var : e5.STORAGE.zza()) {
            Boolean bool = (Boolean) this.f94791a.get(f5Var);
            sb3.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb3.toString();
    }

    public final String j() {
        StringBuilder sb3 = new StringBuilder("G2");
        for (f5 f5Var : e5.STORAGE.zza()) {
            Boolean bool = (Boolean) this.f94791a.get(f5Var);
            sb3.append(bool == null ? 'g' : bool.booleanValue() ? 'G' : 'D');
        }
        return sb3.toString();
    }

    public final String toString() {
        f5[] f5VarArr;
        StringBuilder sb3 = new StringBuilder("source=");
        sb3.append(a(this.f94792b));
        f5VarArr = e5.STORAGE.zzd;
        for (f5 f5Var : f5VarArr) {
            sb3.append(",");
            sb3.append(f5Var.zze);
            sb3.append("=");
            Boolean bool = (Boolean) this.f94791a.get(f5Var);
            if (bool == null) {
                sb3.append("uninitialized");
            } else {
                sb3.append(bool.booleanValue() ? "granted" : "denied");
            }
        }
        return sb3.toString();
    }

    public g5(Boolean bool, Boolean bool2, int i13) {
        EnumMap enumMap = new EnumMap(f5.class);
        this.f94791a = enumMap;
        enumMap.put((EnumMap) f5.AD_STORAGE, (f5) bool);
        enumMap.put((EnumMap) f5.ANALYTICS_STORAGE, (f5) bool2);
        this.f94792b = i13;
    }
}
