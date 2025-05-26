package ads_mobile_sdk;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import nm.s;

/* loaded from: classes2.dex */
public final class k41 {

    /* renamed from: a, reason: collision with root package name */
    public static final k41 f7100a = new k41();

    public static nm.u a(nm.q qVar, int i13) {
        if (qVar != null && i13 < qVar.f91364a.size()) {
            try {
                return qVar.u(i13).i();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static double c(nm.u uVar, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (uVar == null) {
            return 1.0d;
        }
        try {
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            return uVar.v(key).c();
        } catch (Exception unused) {
            return 1.0d;
        }
    }

    public static long e(nm.u uVar) {
        Intrinsics.checkNotNullParameter("cache_ttl_sec", "key");
        if (uVar == null) {
            return 0L;
        }
        try {
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            Intrinsics.checkNotNullParameter("cache_ttl_sec", "key");
            return uVar.v("cache_ttl_sec").l();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static Bundle f(nm.u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        try {
            Bundle bundle = new Bundle();
            Iterator it = ((pm.l) uVar.f91366a.keySet()).iterator();
            while (((pm.m) it).hasNext()) {
                String str = (String) ((pm.k) it).next();
                s v13 = uVar.v(str);
                v13.getClass();
                if (v13 instanceof nm.v) {
                    nm.v j13 = v13.j();
                    Intrinsics.checkNotNullExpressionValue(j13, "getAsJsonPrimitive(...)");
                    Intrinsics.f(str);
                    a(j13, bundle, str);
                } else if (v13 instanceof nm.q) {
                    nm.q f13 = v13.f();
                    Intrinsics.checkNotNullExpressionValue(f13, "getAsJsonArray(...)");
                    Intrinsics.f(str);
                    a(f13, bundle, str);
                } else if (v13 instanceof nm.u) {
                    nm.u i13 = v13.i();
                    Intrinsics.checkNotNullExpressionValue(i13, "getAsJsonObject(...)");
                    bundle.putBundle(str, b(i13));
                }
            }
            return bundle;
        } catch (Exception e13) {
            List list = c0.d.f(e13, e13).f6994p;
            String message = e13.getMessage();
            if (message == null) {
                message = e13.getClass().getName();
            }
            list.add(message);
            return null;
        }
    }

    public static Bundle b(nm.u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Bundle f13 = f(uVar);
        return f13 == null ? new Bundle() : f13;
    }

    public static nm.u a(s sVar) {
        if (sVar != null) {
            try {
                return sVar.i();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static nm.q d(nm.u uVar, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (uVar != null) {
            try {
                return uVar.w(key);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean a(nm.u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter("isSuccessful", "key");
        return uVar.v("isSuccessful").b();
    }

    public static String a(nm.u uVar, String key) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String p13 = uVar.v(key).p();
        Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
        return p13;
    }

    public static Bundle a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            nm.u i13 = df.j1.p1(str).i();
            Intrinsics.checkNotNullExpressionValue(i13, "getAsJsonObject(...)");
            return f(i13);
        } catch (Exception e13) {
            List list = c0.d.f(e13, e13).f6994p;
            String message = e13.getMessage();
            if (message == null) {
                message = e13.getClass().getName();
            }
            list.add(message);
            return null;
        }
    }

    public static boolean a(nm.u uVar, String key, boolean z13) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (uVar == null) {
            return z13;
        }
        try {
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            return uVar.v(key).b();
        } catch (Exception unused) {
            return z13;
        }
    }

    public static Object a(nm.v vVar) {
        Serializable serializable = vVar.f91367a;
        if (serializable instanceof Boolean) {
            return Boolean.valueOf(vVar.b());
        }
        if (serializable instanceof Number) {
            Number n13 = vVar.n();
            int intValue = n13.intValue();
            double doubleValue = n13.doubleValue();
            if (intValue == doubleValue) {
                return Integer.valueOf(intValue);
            }
            return Double.valueOf(doubleValue);
        }
        if (serializable instanceof String) {
            return vVar.p();
        }
        ok.e0 e0Var = gk0.f5596a;
        gk0.d("Unexpected primitive json type: " + vVar, null);
        return null;
    }

    public static void a(nm.v vVar, Bundle bundle, String str) {
        Serializable serializable = vVar.f91367a;
        if (serializable instanceof Boolean) {
            bundle.putBoolean(str, vVar.b());
            return;
        }
        if (serializable instanceof Number) {
            Number n13 = vVar.n();
            int intValue = n13.intValue();
            double doubleValue = n13.doubleValue();
            if (intValue == doubleValue) {
                bundle.putInt(str, intValue);
                return;
            } else {
                bundle.putDouble(str, doubleValue);
                return;
            }
        }
        if (serializable instanceof String) {
            bundle.putString(str, vVar.p());
            return;
        }
        ok.e0 e0Var = gk0.f5596a;
        gk0.d("Unexpected primitive json type: " + vVar, null);
    }

    public static int a(nm.u uVar, String key, int i13) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (uVar == null) {
            return i13;
        }
        try {
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            return uVar.v(key).e();
        } catch (Exception unused) {
            return i13;
        }
    }

    public static void a(nm.q qVar, Bundle bundle, String str) {
        if (qVar.f91364a.isEmpty()) {
            ok.e0 e0Var = gk0.f5596a;
            gk0.d("Unable to parse empty JsonArray for key: " + str, null);
            return;
        }
        s sVar = (s) CollectionsKt.R(qVar);
        sVar.getClass();
        boolean z13 = sVar instanceof nm.u;
        int i13 = 0;
        ArrayList arrayList = qVar.f91364a;
        if (z13) {
            ArrayList arrayList2 = new ArrayList(g0.q(qVar, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                nm.u i14 = ((s) it.next()).i();
                Intrinsics.checkNotNullExpressionValue(i14, "getAsJsonObject(...)");
                arrayList2.add(b(i14));
            }
            bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Bundle[0]));
            return;
        }
        if (sVar instanceof nm.v) {
            ArrayList arrayList3 = new ArrayList(g0.q(qVar, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                nm.v j13 = ((s) it2.next()).j();
                Intrinsics.checkNotNullExpressionValue(j13, "getAsJsonPrimitive(...)");
                Object a13 = a(j13);
                Intrinsics.f(a13);
                arrayList3.add(a13);
            }
            if (CollectionsKt.S(arrayList3) instanceof String) {
                ArrayList arrayList4 = new ArrayList(g0.q(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(it3.next().toString());
                }
                bundle.putStringArray(str, (String[]) arrayList4.toArray(new String[0]));
                return;
            }
            if (CollectionsKt.S(arrayList3) instanceof Integer) {
                int size = arrayList3.size();
                int[] iArr = new int[size];
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i13] = ((Integer) obj).intValue();
                    i13++;
                }
                bundle.putIntArray(str, iArr);
                return;
            }
            if (CollectionsKt.S(arrayList3) instanceof Double) {
                int size2 = arrayList3.size();
                double[] dArr = new double[size2];
                while (i13 < size2) {
                    Object obj2 = arrayList3.get(i13);
                    Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i13] = ((Double) obj2).doubleValue();
                    i13++;
                }
                bundle.putDoubleArray(str, dArr);
                return;
            }
            if (CollectionsKt.S(arrayList3) instanceof Boolean) {
                int size3 = arrayList3.size();
                boolean[] zArr = new boolean[size3];
                while (i13 < size3) {
                    Object obj3 = arrayList3.get(i13);
                    Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i13] = ((Boolean) obj3).booleanValue();
                    i13++;
                }
                bundle.putBooleanArray(str, zArr);
                return;
            }
            ok.e0 e0Var2 = gk0.f5596a;
            gk0.d("Unable to parse array element type: " + CollectionsKt.S(arrayList3), null);
            return;
        }
        ok.e0 e0Var3 = gk0.f5596a;
        gk0.d("Unable to parse array element type: " + sVar, null);
    }

    public static nm.u a(nm.u uVar, String key, nm.u uVar2) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (uVar == null) {
            return uVar2;
        }
        try {
            return uVar.x(key);
        } catch (Exception unused) {
            return uVar2;
        }
    }

    public static String a(nm.u uVar, String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        if (uVar == null) {
            return str;
        }
        try {
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            String p13 = uVar.v(key).p();
            Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
            return p13;
        } catch (Exception unused) {
            return str;
        }
    }
}
