package kotlin.collections;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class x extends w {
    public static boolean c(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            Object obj = objArr[i13];
            Object obj2 = objArr2[i13];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!c((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof xk2.z) && (obj2 instanceof xk2.z)) {
                    if (!zk2.b.c(((xk2.z) obj).b(), ((xk2.z) obj2).b())) {
                        return false;
                    }
                } else if ((obj instanceof xk2.j0) && (obj2 instanceof xk2.j0)) {
                    if (!zk2.b.a(((xk2.j0) obj).b(), ((xk2.j0) obj2).b())) {
                        return false;
                    }
                } else if ((obj instanceof xk2.c0) && (obj2 instanceof xk2.c0)) {
                    if (!zk2.b.b(((xk2.c0) obj).b(), ((xk2.c0) obj2).b())) {
                        return false;
                    }
                } else if ((obj instanceof xk2.f0) && (obj2 instanceof xk2.f0)) {
                    if (!zk2.b.d(((xk2.f0) obj).b(), ((xk2.f0) obj2).b())) {
                        return false;
                    }
                } else if (!Intrinsics.d(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
