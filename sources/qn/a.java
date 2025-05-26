package qn;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import bh.b;
import com.linecorp.android.security.encryption.EncryptionException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f104441a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final SecureRandom f104442b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeyFactory f104443c;

    /* renamed from: d, reason: collision with root package name */
    public final Cipher f104444d;

    /* renamed from: e, reason: collision with root package name */
    public final Mac f104445e;

    /* renamed from: f, reason: collision with root package name */
    public b f104446f;

    public a() {
        try {
            this.f104442b = new SecureRandom();
            this.f104443c = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            this.f104444d = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f104445e = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e13) {
            throw new RuntimeException(e13);
        }
    }

    public final String a(Context context, String str) {
        String str2;
        synchronized (this.f104441a) {
            d(context);
            try {
                byte[] decode = Base64.decode(str, 0);
                byte[] copyOfRange = Arrays.copyOfRange(decode, decode.length - 32, decode.length);
                this.f104445e.init((SecretKey) this.f104446f.f22799c);
                this.f104445e.update(decode, 0, decode.length - 32);
                if (!MessageDigest.isEqual(this.f104445e.doFinal(), copyOfRange)) {
                    throw new EncryptionException("Cipher text has been tampered with.");
                }
                this.f104444d.init(2, (SecretKey) this.f104446f.f22798b, new IvParameterSpec(decode, 0, 16));
                str2 = new String(this.f104444d.doFinal(decode, 16, decode.length - 48), "UTF-8");
            } catch (UnsupportedEncodingException e13) {
                e = e13;
                throw new RuntimeException(e);
            } catch (InvalidAlgorithmParameterException e14) {
                e = e14;
                throw new RuntimeException(e);
            } catch (InvalidKeyException e15) {
                e = e15;
                throw new RuntimeException(e);
            } catch (BadPaddingException e16) {
                throw new EncryptionException(e16);
            } catch (IllegalBlockSizeException e17) {
                e = e17;
                throw new RuntimeException(e);
            }
        }
        return str2;
    }

    public final String b(Context context, String str) {
        String encodeToString;
        synchronized (this.f104441a) {
            try {
                d(context);
                try {
                    int blockSize = this.f104444d.getBlockSize();
                    byte[] bArr = new byte[blockSize];
                    this.f104442b.nextBytes(bArr);
                    this.f104444d.init(1, (SecretKey) this.f104446f.f22798b, new IvParameterSpec(bArr));
                    byte[] doFinal = this.f104444d.doFinal(str.getBytes("UTF-8"));
                    byte[] bArr2 = new byte[doFinal.length + blockSize + 32];
                    System.arraycopy(bArr, 0, bArr2, 0, blockSize);
                    System.arraycopy(doFinal, 0, bArr2, blockSize, doFinal.length);
                    this.f104445e.init((SecretKey) this.f104446f.f22799c);
                    this.f104445e.update(bArr2, 0, doFinal.length + blockSize);
                    byte[] doFinal2 = this.f104445e.doFinal();
                    System.arraycopy(doFinal2, 0, bArr2, blockSize + doFinal.length, doFinal2.length);
                    encodeToString = Base64.encodeToString(bArr2, 0);
                } catch (UnsupportedEncodingException e13) {
                    e = e13;
                    throw new RuntimeException(e);
                } catch (InvalidAlgorithmParameterException e14) {
                    e = e14;
                    throw new RuntimeException(e);
                } catch (InvalidKeyException e15) {
                    e = e15;
                    throw new RuntimeException(e);
                } catch (BadPaddingException e16) {
                    throw new EncryptionException(e16);
                } catch (IllegalBlockSizeException e17) {
                    e = e17;
                    throw new RuntimeException(e);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return encodeToString;
    }

    public final b c(Context context) {
        byte[] bArr;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str = Build.MODEL + Build.MANUFACTURER + Build.SERIAL + string + context.getPackageName();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.linecorp.linesdk.sharedpreference.encryptionsalt", 0);
        String string2 = sharedPreferences.getString("salt", null);
        if (TextUtils.isEmpty(string2)) {
            byte[] bArr2 = new byte[16];
            this.f104442b.nextBytes(bArr2);
            sharedPreferences.edit().putString("salt", Base64.encodeToString(bArr2, 0)).apply();
            bArr = bArr2;
        } else {
            bArr = Base64.decode(string2, 0);
        }
        try {
            byte[] encoded = this.f104443c.generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 5000, BitmapUtils.BITMAP_TO_JPEG_SIZE)).getEncoded();
            return new b(20, new SecretKeySpec(Arrays.copyOfRange(encoded, 0, 32), "AES"), new SecretKeySpec(Arrays.copyOfRange(encoded, 32, encoded.length), "HmacSHA256"));
        } catch (InvalidKeySpecException e13) {
            throw new RuntimeException(e13);
        }
    }

    public final void d(Context context) {
        synchronized (this.f104441a) {
            try {
                if (this.f104446f == null) {
                    this.f104446f = c(context);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
