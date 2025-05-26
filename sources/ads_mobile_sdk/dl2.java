package ads_mobile_sdk;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class dl2 {

    /* renamed from: a, reason: collision with root package name */
    public static Cipher f4332a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4333b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4334c = new Object();

    public static byte[] a(String str, byte[] bArr) {
        byte[] doFinal;
        if (bArr.length != 16) {
            throw new cl2();
        }
        try {
            byte[] a13 = qk.d.f104037d.a(str);
            if (a13.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            if (a13.length <= 16) {
                throw new cl2();
            }
            ByteBuffer allocate = ByteBuffer.allocate(a13.length);
            allocate.put(a13);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[a13.length - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f4333b) {
                a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = a().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e13) {
            throw new cl2(e13);
        }
    }

    public static Cipher a() {
        Cipher cipher;
        synchronized (f4334c) {
            try {
                if (f4332a == null) {
                    f4332a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f4332a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cipher;
    }
}
