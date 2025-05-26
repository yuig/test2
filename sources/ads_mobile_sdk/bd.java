package ads_mobile_sdk;

import java.security.cert.X509Certificate;

/* loaded from: classes2.dex */
public final class bd extends cd {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2843b;

    public bd(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f2843b = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f2843b;
    }
}
