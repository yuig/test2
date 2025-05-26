package em;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f59578c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f59579a;

    /* renamed from: b, reason: collision with root package name */
    public final String f59580b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r1.isEmpty() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(nl.g r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.b()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.Context r2 = r4.f91217a
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            r3.f59579a = r0
            r4.b()
            nl.i r0 = r4.f91219c
            java.lang.String r1 = r0.f91235e
            if (r1 == 0) goto L1b
            goto L48
        L1b:
            r4.b()
            java.lang.String r4 = "1:"
            java.lang.String r1 = r0.f91232b
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            java.lang.String r4 = "2:"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L31
            goto L48
        L31:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r1.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3e
        L3c:
            r1 = r2
            goto L48
        L3e:
            r0 = 1
            r1 = r4[r0]
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L48
            goto L3c
        L48:
            r3.f59580b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: em.b.<init>(nl.g):void");
    }

    public static String a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public static PublicKey b(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e13) {
            Log.w("ContentValues", "Invalid key stored " + e13);
            return null;
        }
    }
}
