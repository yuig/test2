package oi;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class x3 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f95254b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f95255c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f95256d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final v4 f95257a;

    public x3(v4 v4Var) {
        this.f95257a = v4Var;
    }

    public static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        com.bumptech.glide.d.t(atomicReference);
        com.bumptech.glide.d.j(strArr.length == strArr2.length);
        for (int i13 = 0; i13 < strArr.length; i13++) {
            Object obj = strArr[i13];
            if (str == obj || (str != null && str.equals(obj))) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i13] == null) {
                            strArr3[i13] = strArr2[i13] + "(" + strArr[i13] + ")";
                        }
                        str2 = strArr3[i13];
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f95257a.b()) {
            return bundle.toString();
        }
        StringBuilder i13 = n60.o.i("Bundle[{");
        for (String str : bundle.keySet()) {
            if (i13.length() != 8) {
                i13.append(", ");
            }
            i13.append(f(str));
            i13.append("=");
            Object obj = bundle.get(str);
            i13.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        i13.append("}]");
        return i13.toString();
    }

    public final String b(zzbg zzbgVar) {
        v4 v4Var = this.f95257a;
        if (!v4Var.b()) {
            return zzbgVar.toString();
        }
        StringBuilder sb3 = new StringBuilder("origin=");
        sb3.append(zzbgVar.f32032h);
        sb3.append(",name=");
        sb3.append(c(zzbgVar.f32030f));
        sb3.append(",params=");
        zzbb zzbbVar = zzbgVar.f32031g;
        sb3.append(zzbbVar == null ? null : !v4Var.b() ? zzbbVar.f32029f.toString() : a(zzbbVar.f()));
        return sb3.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f95257a.b() ? str : d(str, h5.f94813c, h5.f94811a, f95254b);
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder i13 = n60.o.i("[");
        for (Object obj : objArr) {
            String a13 = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (a13 != null) {
                if (i13.length() != 1) {
                    i13.append(", ");
                }
                i13.append(a13);
            }
        }
        i13.append("]");
        return i13.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f95257a.b() ? str : d(str, h5.f94818h, h5.f94817g, f95255c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        return !this.f95257a.b() ? str : str.startsWith("_exp_") ? a.a.k("experiment_id(", str, ")") : d(str, h5.f94816f, h5.f94815e, f95256d);
    }
}
