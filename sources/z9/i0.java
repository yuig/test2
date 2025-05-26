package z9;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes3.dex */
public final class i0 extends o0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f141206m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i13) {
        super(true);
        this.f141206m = i13;
    }

    public static float[] h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new float[]{((Number) o0.f141247g.c(value)).floatValue()};
    }

    public static int[] i(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new int[]{((Number) o0.f141242b.c(value)).intValue()};
    }

    public static long[] j(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new long[]{((Number) o0.f141245e.c(value)).longValue()};
    }

    public static boolean[] k(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new boolean[]{((Boolean) o0.f141249i.c(value)).booleanValue()};
    }

    @Override // z9.o0
    public final Object a(String key, Bundle bundle) {
        switch (this.f141206m) {
            case 0:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (boolean[]) bundle.get(key);
            case 1:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (Boolean) bundle.get(key);
            case 2:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (float[]) bundle.get(key);
            case 3:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj = bundle.get(key);
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Float");
                return (Float) obj;
            case 4:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (int[]) bundle.get(key);
            case 5:
                return f(key, bundle);
            case 6:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (long[]) bundle.get(key);
            case 7:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj2 = bundle.get(key);
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Long");
                return (Long) obj2;
            case 8:
                return f(key, bundle);
            case 9:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (String[]) bundle.get(key);
            default:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (String) bundle.get(key);
        }
    }

    @Override // z9.o0
    public final String b() {
        switch (this.f141206m) {
            case 0:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case 5:
                return "integer";
            case 6:
                return "long[]";
            case 7:
                return "long";
            case 8:
                return "reference";
            case 9:
                return "string[]";
            default:
                return "string";
        }
    }

    @Override // z9.o0
    public final Object c(String value) {
        String str;
        long parseLong;
        boolean z13 = true;
        switch (this.f141206m) {
            case 0:
                return k(value);
            case 1:
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.d(value, "true")) {
                    if (!Intrinsics.d(value, "false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 2:
                return h(value);
            case 3:
                Intrinsics.checkNotNullParameter(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 4:
                return i(value);
            case 5:
                return g(value);
            case 6:
                return j(value);
            case 7:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.z.h(value, "L", false)) {
                    str = value.substring(0, value.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str = value;
                }
                if (kotlin.text.z.p(value, "0x", false)) {
                    String substring = str.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                    parseLong = Long.parseLong(substring, CharsKt.checkRadix(16));
                } else {
                    parseLong = Long.parseLong(str);
                }
                return Long.valueOf(parseLong);
            case 8:
                return g(value);
            case 9:
                Intrinsics.checkNotNullParameter(value, "value");
                return new String[]{value};
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.d(value, "null")) {
                    return null;
                }
                return value;
        }
    }

    @Override // z9.o0
    public final Object d(String value, Object obj) {
        switch (this.f141206m) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (zArr == null) {
                    return k(value);
                }
                boolean[] elements = k(value);
                Intrinsics.checkNotNullParameter(zArr, "<this>");
                Intrinsics.checkNotNullParameter(elements, "elements");
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(elements, 0, copyOf, length, 1);
                Intrinsics.f(copyOf);
                return copyOf;
            case 2:
                float[] fArr = (float[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (fArr == null) {
                    return h(value);
                }
                float[] elements2 = h(value);
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                Intrinsics.checkNotNullParameter(elements2, "elements");
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(elements2, 0, copyOf2, length2, 1);
                Intrinsics.f(copyOf2);
                return copyOf2;
            case 4:
                int[] iArr = (int[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (iArr == null) {
                    return i(value);
                }
                int[] elements3 = i(value);
                Intrinsics.checkNotNullParameter(iArr, "<this>");
                Intrinsics.checkNotNullParameter(elements3, "elements");
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(elements3, 0, copyOf3, length3, 1);
                Intrinsics.f(copyOf3);
                return copyOf3;
            case 6:
                long[] jArr = (long[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (jArr == null) {
                    return j(value);
                }
                long[] elements4 = j(value);
                Intrinsics.checkNotNullParameter(jArr, "<this>");
                Intrinsics.checkNotNullParameter(elements4, "elements");
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(elements4, 0, copyOf4, length4, 1);
                Intrinsics.f(copyOf4);
                return copyOf4;
            case 9:
                String[] strArr = (String[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (strArr == null) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return new String[]{value};
                }
                Intrinsics.checkNotNullParameter(value, "value");
                String[] elements5 = {value};
                Intrinsics.checkNotNullParameter(strArr, "<this>");
                Intrinsics.checkNotNullParameter(elements5, "elements");
                int length5 = strArr.length;
                Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(elements5, 0, copyOf5, length5, 1);
                Intrinsics.f(copyOf5);
                return (String[]) copyOf5;
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                return c(value);
        }
    }

    @Override // z9.o0
    public final void e(Bundle bundle, String key, Object obj) {
        int i13 = this.f141206m;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putBooleanArray(key, (boolean[]) obj);
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putBoolean(key, booleanValue);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putFloatArray(key, (float[]) obj);
                break;
            case 3:
                float floatValue = ((Number) obj).floatValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putFloat(key, floatValue);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putIntArray(key, (int[]) obj);
                break;
            case 5:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        Intrinsics.checkNotNullParameter(key, "key");
                        bundle.putInt(key, intValue);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        Intrinsics.checkNotNullParameter(key, "key");
                        bundle.putInt(key, intValue);
                        break;
                }
            case 6:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putLongArray(key, (long[]) obj);
                break;
            case 7:
                long longValue = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putLong(key, longValue);
                break;
            case 8:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        Intrinsics.checkNotNullParameter(key, "key");
                        bundle.putInt(key, intValue2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        Intrinsics.checkNotNullParameter(key, "key");
                        bundle.putInt(key, intValue2);
                        break;
                }
            case 9:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putStringArray(key, (String[]) obj);
                break;
            default:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putString(key, (String) obj);
                break;
        }
    }

    public final Integer f(String key, Bundle bundle) {
        switch (this.f141206m) {
            case 5:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj = bundle.get(key);
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            default:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj2 = bundle.get(key);
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj2;
        }
    }

    public final Integer g(String value) {
        int parseInt;
        int parseInt2;
        switch (this.f141206m) {
            case 5:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.z.p(value, "0x", false)) {
                    String substring = value.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                    parseInt = Integer.parseInt(substring, CharsKt.checkRadix(16));
                } else {
                    parseInt = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt);
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.z.p(value, "0x", false)) {
                    String substring2 = value.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                    parseInt2 = Integer.parseInt(substring2, CharsKt.checkRadix(16));
                } else {
                    parseInt2 = Integer.parseInt(value);
                }
                return Integer.valueOf(parseInt2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i13, int i14) {
        super(false);
        this.f141206m = i13;
    }
}
