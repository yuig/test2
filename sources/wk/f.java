package wk;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import el.c1;
import java.nio.charset.Charset;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a.g f130054a = new a.g(8);

    public static AlgorithmParameterSpec a(byte[] bArr, int i13, int i14) {
        Charset charset = c1.f59463a;
        Integer G = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : el.a.G();
        return (G == null || G.intValue() > 19) ? new GCMParameterSpec(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, bArr, i13, i14) : new IvParameterSpec(bArr, i13, i14);
    }
}
