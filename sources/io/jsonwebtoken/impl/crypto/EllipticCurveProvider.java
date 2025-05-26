package io.jsonwebtoken.impl.crypto;

import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Strings;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class EllipticCurveProvider extends SignatureProvider {
    private static final Map<SignatureAlgorithm, String> EC_CURVE_NAMES = createEcCurveNames();

    /* renamed from: io.jsonwebtoken.impl.crypto.EllipticCurveProvider$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$jsonwebtoken$SignatureAlgorithm;

        static {
            int[] iArr = new int[SignatureAlgorithm.values().length];
            $SwitchMap$io$jsonwebtoken$SignatureAlgorithm = iArr;
            try {
                iArr[SignatureAlgorithm.ES256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public EllipticCurveProvider(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(signatureAlgorithm.isEllipticCurve(), "SignatureAlgorithm must be an Elliptic Curve algorithm.");
    }

    private static Map<SignatureAlgorithm, String> createEcCurveNames() {
        HashMap hashMap = new HashMap();
        hashMap.put(SignatureAlgorithm.ES256, "secp256r1");
        hashMap.put(SignatureAlgorithm.ES384, "secp384r1");
        hashMap.put(SignatureAlgorithm.ES512, "secp521r1");
        return hashMap;
    }

    public static KeyPair generateKeyPair() {
        return generateKeyPair(SignatureAlgorithm.ES512);
    }

    public static int getSignatureByteArrayLength(SignatureAlgorithm signatureAlgorithm) {
        int i13 = AnonymousClass1.$SwitchMap$io$jsonwebtoken$SignatureAlgorithm[signatureAlgorithm.ordinal()];
        if (i13 == 1) {
            return 64;
        }
        if (i13 == 2) {
            return 96;
        }
        if (i13 == 3) {
            return RecyclerViewTypes.VIEW_TYPE_FEED_SECTION_TITLE;
        }
        throw new JwtException("Unsupported Algorithm: " + signatureAlgorithm.name());
    }

    public static byte[] transcodeSignatureToConcat(byte[] bArr, int i13) {
        int i14;
        if (bArr.length < 8 || bArr[0] != 48) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        byte b13 = bArr[1];
        if (b13 > 0) {
            i14 = 2;
        } else {
            if (b13 != -127) {
                throw new JwtException("Invalid ECDSA signature format");
            }
            i14 = 3;
        }
        int i15 = bArr[i14 + 1];
        int i16 = i15;
        while (i16 > 0 && bArr[((i14 + 2) + i15) - i16] == 0) {
            i16--;
        }
        int i17 = i14 + 2 + i15;
        int i18 = bArr[i17 + 1];
        int i19 = i18;
        while (i19 > 0 && bArr[((i17 + 2) + i18) - i19] == 0) {
            i19--;
        }
        int max = Math.max(Math.max(i16, i19), i13 / 2);
        int i23 = bArr[i14 - 1];
        if ((i23 & 255) != bArr.length - i14 || (i23 & 255) != i15 + 4 + i18 || bArr[i14] != 2 || bArr[i17] != 2) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        int i24 = max * 2;
        byte[] bArr2 = new byte[i24];
        System.arraycopy(bArr, i17 - i16, bArr2, max - i16, i16);
        System.arraycopy(bArr, ((i17 + 2) + i18) - i19, bArr2, i24 - i19, i19);
        return bArr2;
    }

    public static byte[] transcodeSignatureToDER(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length / 2;
        int i13 = length;
        while (i13 > 0 && bArr[length - i13] == 0) {
            i13--;
        }
        int i14 = length - i13;
        int i15 = bArr[i14] < 0 ? i13 + 1 : i13;
        int i16 = length;
        while (i16 > 0 && bArr[(length * 2) - i16] == 0) {
            i16--;
        }
        int i17 = (length * 2) - i16;
        int i18 = bArr[i17] < 0 ? i16 + 1 : i16;
        int i19 = i15 + 4 + i18;
        if (i19 > 255) {
            throw new JwtException("Invalid ECDSA signature format");
        }
        int i23 = 1;
        if (i19 < 128) {
            bArr2 = new byte[i15 + 6 + i18];
        } else {
            bArr2 = new byte[i15 + 7 + i18];
            bArr2[1] = -127;
            i23 = 2;
        }
        bArr2[0] = 48;
        bArr2[i23] = (byte) i19;
        bArr2[i23 + 1] = 2;
        bArr2[i23 + 2] = (byte) i15;
        int i24 = i23 + 3 + i15;
        System.arraycopy(bArr, i14, bArr2, i24 - i13, i13);
        bArr2[i24] = 2;
        bArr2[i24 + 1] = (byte) i18;
        System.arraycopy(bArr, i17, bArr2, ((i24 + 2) + i18) - i16, i16);
        return bArr2;
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm signatureAlgorithm) {
        return generateKeyPair(signatureAlgorithm, SignatureProvider.DEFAULT_SECURE_RANDOM);
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm signatureAlgorithm, SecureRandom secureRandom) {
        return generateKeyPair("EC", null, signatureAlgorithm, secureRandom);
    }

    public static KeyPair generateKeyPair(String str, String str2, SignatureAlgorithm signatureAlgorithm, SecureRandom secureRandom) {
        KeyPairGenerator keyPairGenerator;
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm argument cannot be null.");
        Assert.isTrue(signatureAlgorithm.isEllipticCurve(), "SignatureAlgorithm argument must represent an Elliptic Curve algorithm.");
        try {
            if (Strings.hasText(str2)) {
                keyPairGenerator = KeyPairGenerator.getInstance(str, str2);
            } else {
                keyPairGenerator = KeyPairGenerator.getInstance(str);
            }
            keyPairGenerator.initialize(new ECGenParameterSpec(EC_CURVE_NAMES.get(signatureAlgorithm)), secureRandom);
            return keyPairGenerator.generateKeyPair();
        } catch (Exception e13) {
            throw new IllegalStateException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to generate Elliptic Curve KeyPair: ")), e13);
        }
    }
}
