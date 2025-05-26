package org.chromium.net;

import android.util.Log;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes4.dex */
public class AndroidKeyStore {
    private static final String TAG = "AndroidKeyStore";

    @CalledByNative
    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance(str);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(bArr);
            } catch (Exception e13) {
                String algorithm = privateKey.getAlgorithm();
                String name = privateKey.getClass().getName();
                StringBuilder w13 = a.a.w("Exception while encrypting input with ", str, " and ", algorithm, " private key (");
                w13.append(name);
                w13.append("): ");
                w13.append(e13);
                Log.e("cr_AndroidKeyStore", w13.toString());
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e14) {
            Log.e("cr_AndroidKeyStore", "Cipher " + str + " not supported: " + e14);
            return null;
        }
    }

    @CalledByNative
    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    @CalledByNative
    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e13) {
            Log.e("cr_AndroidKeyStore", "Exception while checking support for " + str + ": " + e13);
            return false;
        }
    }

    @CalledByNative
    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e13) {
            Log.e("cr_AndroidKeyStore", "Exception while checking support for " + str + ": " + e13);
            return false;
        }
    }

    @CalledByNative
    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature signature = Signature.getInstance(str);
            try {
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (Exception e13) {
                String algorithm = privateKey.getAlgorithm();
                String name = privateKey.getClass().getName();
                StringBuilder w13 = a.a.w("Exception while signing message with ", str, " and ", algorithm, " private key (");
                w13.append(name);
                w13.append("): ");
                w13.append(e13);
                Log.e("cr_AndroidKeyStore", w13.toString());
                return null;
            }
        } catch (NoSuchAlgorithmException e14) {
            Log.e("cr_AndroidKeyStore", "Signature algorithm " + str + " not supported: " + e14);
            return null;
        }
    }
}
