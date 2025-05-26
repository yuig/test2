package e3;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import t3.g4;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57000a;

    public /* synthetic */ b(int i13) {
        this.f57000a = i13;
    }

    public static final float a(float f13, float[] fArr, float[] fArr2) {
        float f14;
        float f15;
        float f16;
        float f17;
        float max;
        int i13 = o4.c.f92873c;
        float abs = Math.abs(f13);
        float signum = Math.signum(f13);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            max = signum * fArr2[binarySearch];
        } else {
            int i14 = -(binarySearch + 1);
            int i15 = i14 - 1;
            if (i15 >= fArr.length - 1) {
                float f18 = fArr[fArr.length - 1];
                float f19 = fArr2[fArr.length - 1];
                if (f18 == 0.0f) {
                    return 0.0f;
                }
                return (f19 / f18) * f13;
            }
            if (i15 == -1) {
                float f23 = fArr[0];
                f16 = fArr2[0];
                f17 = f23;
                f15 = 0.0f;
                f14 = 0.0f;
            } else {
                float f24 = fArr[i15];
                float f25 = fArr[i14];
                f14 = fArr2[i15];
                f15 = f24;
                f16 = fArr2[i14];
                f17 = f25;
            }
            max = signum * (((f16 - f14) * Math.max(0.0f, Math.min(1.0f, f15 == f17 ? 0.0f : (abs - f15) / (f17 - f15)))) + f14);
        }
        return max;
    }

    public static void m(View view) {
        try {
            if (!g4.f116016r) {
                g4.f116016r = true;
                if (Build.VERSION.SDK_INT < 28) {
                    g4.f116014p = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                    g4.f116015q = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    g4.f116014p = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    g4.f116015q = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = g4.f116014p;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = g4.f116015q;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = g4.f116015q;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = g4.f116014p;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            g4.f116017s = true;
        }
    }

    public InputFilter[] b(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public KeyListener c(KeyListener keyListener) {
        return keyListener;
    }

    public Signature[] d(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public InputConnection g(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    public void h(boolean z13) {
    }

    public void i(boolean z13) {
    }

    public void j(boolean z13) {
    }

    public void k(boolean z13) {
    }

    public void l() {
    }

    public TransformationMethod n(TransformationMethod transformationMethod) {
        return transformationMethod;
    }

    public final String toString() {
        switch (this.f57000a) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13, int i14) {
        this(0);
        this.f57000a = i13;
        int i15 = 1;
        if (i13 == 1) {
            this(i15);
            return;
        }
        int i16 = 2;
        if (i13 == 2) {
            this(i16);
            return;
        }
        int i17 = 3;
        if (i13 == 3) {
            this(i17);
            return;
        }
        int i18 = 29;
        if (i13 == 29) {
            this(i18);
            return;
        }
        switch (i13) {
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            default:
                switch (i13) {
                    case 21:
                        this(21);
                        break;
                    case 22:
                        this(22);
                        break;
                    case 23:
                        this(23);
                        break;
                    default:
                        break;
                }
        }
    }
}
