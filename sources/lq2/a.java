package lq2;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final BigInteger f84466a;

    public a(BigInteger bigInteger, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, "v2");
        this.f84466a = bigInteger;
        BigInteger bigInteger2 = bigIntegerArr[0];
        BigInteger bigInteger3 = bigIntegerArr[1];
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger bigInteger5 = bigIntegerArr2[1];
    }

    public static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException(a.a.k("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }
}
