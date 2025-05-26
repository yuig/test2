package ads_mobile_sdk;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kh2.m0;

/* loaded from: classes2.dex */
public final class ia implements a.y9 {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f6287d = m0.d("7a806c");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f6288e = m0.d("46bb91c3c5");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f6289f = m0.d("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f6290g = m0.d("bae8e37fc83441b16034566b");

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f6291h = m0.d("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: a, reason: collision with root package name */
    public final a.t3 f6292a;

    /* renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f6293b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6294c;

    public ia(byte[] bArr, byte[] bArr2, a.t3 t3Var) {
        this.f6294c = bArr2;
        kh2.b0.B(bArr.length);
        this.f6293b = new SecretKeySpec(bArr, "AES");
        this.f6292a = t3Var;
    }

    @Override // a.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f6294c;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!sx2.a(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) ((a.e) this.f6292a).d();
        cipher.init(2, this.f6293b, new GCMParameterSpec(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, bArr, this.f6294c.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        byte[] bArr4 = this.f6294c;
        return cipher.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }

    public static boolean a(Cipher cipher) {
        try {
            byte[] bArr = f6290g;
            cipher.init(2, new SecretKeySpec(f6289f, "AES"), new GCMParameterSpec(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, bArr, 0, bArr.length));
            cipher.updateAAD(f6288e);
            byte[] bArr2 = f6291h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f6287d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
