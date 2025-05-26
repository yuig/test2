package ads_mobile_sdk;

import android.os.Build;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public abstract class u9 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.uc f11886a = new a.uc();

    public static SecretKeySpec a(byte[] bArr) {
        kh2.b0.B(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec a(byte[] bArr, int i13, int i14) {
        int i15 = sx2.f11275a;
        Integer valueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
        if (valueOf != null && valueOf.intValue() <= 19) {
            return new IvParameterSpec(bArr, i13, i14);
        }
        return new GCMParameterSpec(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, bArr, i13, i14);
    }
}
