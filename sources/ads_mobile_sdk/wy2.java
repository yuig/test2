package ads_mobile_sdk;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class wy2 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13302a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f13303b = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    public static boolean a(File file) {
        try {
            X509Certificate[][] m13 = ig1.b.m(file.getAbsolutePath());
            if (m13.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(m13[0][0].getEncoded());
            if (Arrays.equals(f13302a, digest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(f13303b, digest);
        } catch (ad e13) {
            throw new GeneralSecurityException("Package is not signed", e13);
        } catch (IOException e14) {
            e = e14;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e15) {
            e = e15;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
