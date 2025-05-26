package nk;

import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final w f91076a = new w("PhoneskyVerificationUtils");

    public static boolean a(Signature[] signatureArr) {
        String str;
        if (signatureArr == null || (signatureArr.length) == 0) {
            f91076a.d(new Object[0]);
            return false;
        }
        for (Signature signature : signatureArr) {
            byte[] byteArray = signature.toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(byteArray);
                str = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (NoSuchAlgorithmException unused) {
                str = "";
            }
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                return true;
            }
            String str2 = Build.TAGS;
            if ((str2.contains("dev-keys") || str2.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                return true;
            }
        }
        return false;
    }
}
