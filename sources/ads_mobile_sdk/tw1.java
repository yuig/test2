package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class tw1 {

    /* renamed from: a, reason: collision with root package name */
    public static final u71 f11720a = new u71("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        String str;
        try {
            boolean z13 = context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled;
            if (!z13) {
                f11720a.b("Play Store package is disabled.", new Object[0]);
            }
            if (!z13) {
                return false;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || signatureArr.length == 0) {
                    f11720a.b("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        str = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str = "";
                    }
                    arrayList.add(str);
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                        String str2 = Build.TAGS;
                        if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                        }
                    }
                    return true;
                }
                f11720a.b(a.a.k("Play Store package certs are not valid. Found these sha256 certs: [", String.join(", ", arrayList), "]."), new Object[0]);
                return false;
            } catch (PackageManager.NameNotFoundException unused2) {
                f11720a.b("Play Store package is not found.", new Object[0]);
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            f11720a.b("Play Store package is not found.", new Object[0]);
            return false;
        }
    }
}
