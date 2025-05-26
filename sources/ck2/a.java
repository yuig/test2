package ck2;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.internal.recaptcha.q1;
import com.google.android.gms.internal.recaptcha.r;
import com.google.android.gms.internal.recaptcha.r1;
import com.google.android.gms.internal.recaptcha.s1;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.q;
import nd.l;
import pd.g0;
import wd.c0;
import x7.t;

/* loaded from: classes2.dex */
public final class a implements ak2.f, o, ak2.g, t, zd.a {

    /* renamed from: a, reason: collision with root package name */
    public int f27913a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27914b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i13, int i14) {
        this(Bitmap.CompressFormat.JPEG, 100);
        if (i13 == 4) {
            this.f27914b = q.SUCCESS;
        } else if (i13 != 5) {
        } else {
            this.f27914b = "";
        }
    }

    public int a() {
        int[] iArr = (int[]) this.f27914b;
        int i13 = this.f27913a - 1;
        this.f27913a = i13;
        return iArr[i13];
    }

    @Override // com.google.android.gms.common.api.internal.o
    public void accept(Object obj, Object obj2) {
        int i13 = this.f27913a;
        Object obj3 = this.f27914b;
        switch (i13) {
            case 0:
                s1 s1Var = new s1((TaskCompletionSource) obj2);
                q1 q1Var = (q1) ((com.google.android.gms.internal.recaptcha.d) obj).getService();
                q1Var.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptcha.internal.IRecaptchaService");
                int i14 = r.f31780a;
                obtain.writeStrongBinder(s1Var);
                obtain.writeString((String) obj3);
                q1Var.j(obtain, 2);
                break;
            default:
                RecaptchaHandle recaptchaHandle = (RecaptchaHandle) obj3;
                com.google.android.gms.internal.recaptcha.b bVar = new com.google.android.gms.internal.recaptcha.b((TaskCompletionSource) obj2);
                q1 q1Var2 = (q1) ((com.google.android.gms.internal.recaptcha.d) obj).getService();
                q1Var2.getClass();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.recaptcha.internal.IRecaptchaService");
                int i15 = r.f31780a;
                obtain2.writeStrongBinder(bVar);
                if (recaptchaHandle == null) {
                    obtain2.writeInt(0);
                } else {
                    obtain2.writeInt(1);
                    recaptchaHandle.writeToParcel(obtain2, 0);
                }
                q1Var2.j(obtain2, 4);
                break;
        }
    }

    @Override // ak2.f
    public Object apply(Object obj) {
        int i13 = this.f27913a;
        Object obj2 = this.f27914b;
        switch (i13) {
            case 0:
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 2) {
                    return ((ak2.c) obj2).apply(objArr[0], objArr[1]);
                }
                throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
            default:
                return ((Class) obj2).cast(obj);
        }
    }

    @Override // x7.t
    public MediaCodecInfo b(int i13) {
        if (((MediaCodecInfo[]) this.f27914b) == null) {
            this.f27914b = new MediaCodecList(this.f27913a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f27914b)[i13];
    }

    public void c(int i13, int i14, int i15) {
        int i16 = this.f27913a;
        int i17 = i16 + 3;
        Object obj = this.f27914b;
        if (i17 >= ((int[]) obj).length) {
            int[] copyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f27914b = copyOf;
        }
        int[] iArr = (int[]) this.f27914b;
        iArr[i16] = i13 + i15;
        iArr[i16 + 1] = i14 + i15;
        iArr[i16 + 2] = i15;
        this.f27913a = i17;
    }

    @Override // zd.a
    public g0 d(g0 g0Var, l lVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) g0Var.get()).compress((Bitmap.CompressFormat) this.f27914b, this.f27913a, byteArrayOutputStream);
        g0Var.c();
        return new c0(byteArrayOutputStream.toByteArray());
    }

    public void e(int i13, int i14, int i15, int i16) {
        int i17 = this.f27913a;
        int i18 = i17 + 4;
        Object obj = this.f27914b;
        if (i18 >= ((int[]) obj).length) {
            int[] copyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f27914b = copyOf;
        }
        int[] iArr = (int[]) this.f27914b;
        iArr[i17] = i13;
        iArr[i17 + 1] = i14;
        iArr[i17 + 2] = i15;
        iArr[i17 + 3] = i16;
        this.f27913a = i18;
    }

    @Override // x7.t
    public boolean f(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public void g(int i13, int i14) {
        if (i13 < i14) {
            int i15 = i13 - 3;
            for (int i16 = i13; i16 < i14; i16 += 3) {
                int[] iArr = (int[]) this.f27914b;
                int i17 = iArr[i16];
                int i18 = iArr[i14];
                if (i17 < i18 || (i17 == i18 && iArr[i16 + 1] <= iArr[i14 + 1])) {
                    i15 += 3;
                    h(i15, i16);
                }
            }
            h(i15 + 3, i14);
            g(i13, i15);
            g(i15 + 6, i14);
        }
    }

    public void h(int i13, int i14) {
        int[] iArr = (int[]) this.f27914b;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i13 + 1;
        int i17 = i14 + 1;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
        int i19 = i13 + 2;
        int i23 = i14 + 2;
        int i24 = iArr[i19];
        iArr[i19] = iArr[i23];
        iArr[i23] = i24;
    }

    @Override // x7.t
    public boolean j(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // x7.t
    public int m() {
        if (((MediaCodecInfo[]) this.f27914b) == null) {
            this.f27914b = new MediaCodecList(this.f27913a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f27914b).length;
    }

    @Override // x7.t
    public boolean p() {
        return true;
    }

    @Override // ak2.g
    public boolean test(Object obj) {
        int i13 = this.f27913a;
        Object obj2 = this.f27914b;
        switch (i13) {
            case 0:
                return ((Boolean) ((Function1) obj2).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((Function1) obj2).invoke(obj)).booleanValue();
            default:
                return ((Class) obj2).isInstance(obj);
        }
    }

    public a(int i13, Function1 function) {
        this.f27913a = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27914b = function;
        } else {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27914b = function;
        }
    }

    public /* synthetic */ a(r1 r1Var, Object obj, int i13) {
        this.f27913a = i13;
        this.f27914b = obj;
    }

    public /* synthetic */ a(Object obj, int i13) {
        this.f27913a = i13;
        this.f27914b = obj;
    }

    public a(Class cls) {
        this.f27913a = 2;
        this.f27914b = cls;
    }

    public a(int i13) {
        this.f27914b = new int[i13];
    }
}
