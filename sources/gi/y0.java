package gi;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public final class y0 extends s0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f65136a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65137b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65138c;

    /* renamed from: d, reason: collision with root package name */
    public final String f65139d;

    public y0() {
        boolean z13;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f65136a = messageDigest;
            this.f65137b = messageDigest.getDigestLength();
            this.f65139d = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z13 = true;
            } catch (CloneNotSupportedException unused) {
                z13 = false;
            }
            this.f65138c = z13;
        } catch (NoSuchAlgorithmException e13) {
            throw new AssertionError(e13);
        }
    }

    public final String toString() {
        return this.f65139d;
    }
}
