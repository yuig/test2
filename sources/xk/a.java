package xk;

import a.g;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import el.c1;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import jk.r;
import kg.t;
import l3.c;
import ll.j0;

/* loaded from: classes3.dex */
public final class a implements uk.a {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f135165c = c.r("7a806c");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f135166d = c.r("46bb91c3c5");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f135167e = c.r("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f135168f = c.r("bae8e37fc83441b16034566b");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f135169g = c.r("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: h, reason: collision with root package name */
    public static final g f135170h = new g(10);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f135171a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f135172b;

    public a(byte[] bArr, byte[] bArr2) {
        this.f135172b = bArr2;
        j0.a(bArr.length);
        this.f135171a = new SecretKeySpec(bArr, "AES");
    }

    public static boolean c(Cipher cipher) {
        try {
            byte[] bArr = f135168f;
            cipher.init(2, new SecretKeySpec(f135167e, "AES"), new GCMParameterSpec(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, bArr, 0, bArr.length));
            cipher.updateAAD(f135166d);
            byte[] bArr2 = f135169g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f135165c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // uk.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Cipher cipher = (Cipher) f135170h.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] s13 = r.s(12);
        System.arraycopy(s13, 0, bArr3, 0, 12);
        cipher.init(1, this.f135171a, new GCMParameterSpec(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, s13, 0, s13.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int doFinal = cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal != bArr.length + 16) {
            throw new GeneralSecurityException(a.a.e("encryption failed; GCM tag must be 16 bytes, but got only ", doFinal - bArr.length, " bytes"));
        }
        byte[] bArr4 = this.f135172b;
        return bArr4.length == 0 ? bArr3 : t.u(bArr4, bArr3);
    }

    @Override // uk.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f135172b;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (c1.b(bArr3, bArr)) {
            return d(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) {
        Cipher cipher = (Cipher) f135170h.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.f135171a, new GCMParameterSpec(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }
}
