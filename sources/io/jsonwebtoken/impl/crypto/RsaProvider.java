package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.RuntimeEnvironment;
import io.jsonwebtoken.security.SignatureException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class RsaProvider extends SignatureProvider {
    private static final Map<SignatureAlgorithm, PSSParameterSpec> PSS_PARAMETER_SPECS = createPssParameterSpecs();

    /* renamed from: io.jsonwebtoken.impl.crypto.RsaProvider$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$jsonwebtoken$SignatureAlgorithm;

        static {
            int[] iArr = new int[SignatureAlgorithm.values().length];
            $SwitchMap$io$jsonwebtoken$SignatureAlgorithm = iArr;
            try {
                iArr[SignatureAlgorithm.RS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.PS256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.RS384.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.PS384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        RuntimeEnvironment.enableBouncyCastleIfPossible();
    }

    public RsaProvider(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(signatureAlgorithm.isRsa(), "SignatureAlgorithm must be an RSASSA or RSASSA-PSS algorithm.");
    }

    private static Map<SignatureAlgorithm, PSSParameterSpec> createPssParameterSpecs() {
        HashMap hashMap = new HashMap();
        MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        hashMap.put(SignatureAlgorithm.PS256, new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 32, 1));
        MGF1ParameterSpec mGF1ParameterSpec2 = MGF1ParameterSpec.SHA384;
        hashMap.put(SignatureAlgorithm.PS384, new PSSParameterSpec(mGF1ParameterSpec2.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec2, 48, 1));
        MGF1ParameterSpec mGF1ParameterSpec3 = MGF1ParameterSpec.SHA512;
        hashMap.put(SignatureAlgorithm.PS512, new PSSParameterSpec(mGF1ParameterSpec3.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec3, 64, 1));
        return hashMap;
    }

    public static KeyPair generateKeyPair() {
        return generateKeyPair(4096);
    }

    @Override // io.jsonwebtoken.impl.crypto.SignatureProvider
    public Signature createSignatureInstance() {
        Signature createSignatureInstance = super.createSignatureInstance();
        PSSParameterSpec pSSParameterSpec = PSS_PARAMETER_SPECS.get(this.alg);
        if (pSSParameterSpec != null) {
            setParameter(createSignatureInstance, pSSParameterSpec);
        }
        return createSignatureInstance;
    }

    public void doSetParameter(Signature signature, PSSParameterSpec pSSParameterSpec) {
        signature.setParameter(pSSParameterSpec);
    }

    public void setParameter(Signature signature, PSSParameterSpec pSSParameterSpec) {
        try {
            doSetParameter(signature, pSSParameterSpec);
        } catch (InvalidAlgorithmParameterException e13) {
            throw new SignatureException("Unsupported RSASSA-PSS parameter '" + pSSParameterSpec + "': " + e13.getMessage(), e13);
        }
    }

    public static KeyPair generateKeyPair(int i13) {
        return generateKeyPair(i13, SignatureProvider.DEFAULT_SECURE_RANDOM);
    }

    public static KeyPair generateKeyPair(SignatureAlgorithm signatureAlgorithm) {
        Assert.isTrue(signatureAlgorithm.isRsa(), "Only RSA algorithms are supported by this method.");
        int i13 = AnonymousClass1.$SwitchMap$io$jsonwebtoken$SignatureAlgorithm[signatureAlgorithm.ordinal()];
        return generateKeyPair((i13 == 1 || i13 == 2) ? 2048 : (i13 == 3 || i13 == 4) ? 3072 : 4096, SignatureProvider.DEFAULT_SECURE_RANDOM);
    }

    public static KeyPair generateKeyPair(int i13, SecureRandom secureRandom) {
        return generateKeyPair("RSA", i13, secureRandom);
    }

    public static KeyPair generateKeyPair(String str, int i13, SecureRandom secureRandom) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str);
            keyPairGenerator.initialize(i13, secureRandom);
            return keyPairGenerator.genKeyPair();
        } catch (NoSuchAlgorithmException e13) {
            throw new IllegalStateException("Unable to obtain an RSA KeyPairGenerator: " + e13.getMessage(), e13);
        }
    }
}
