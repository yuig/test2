package kk;

import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* loaded from: classes3.dex */
public final class q extends X509Certificate {

    /* renamed from: a, reason: collision with root package name */
    public final X509Certificate f79893a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f79894b;

    public q(X509Certificate x509Certificate, byte[] bArr) {
        this.f79893a = x509Certificate;
        this.f79894b = bArr;
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void checkValidity() {
        this.f79893a.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void checkValidity(Date date) {
        this.f79893a.checkValidity(date);
    }

    @Override // java.security.cert.Certificate
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void verify(PublicKey publicKey) {
        this.f79893a.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void verify(PublicKey publicKey, String str) {
        this.f79893a.verify(publicKey, str);
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        return this.f79893a.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return this.f79893a.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f79894b;
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        return this.f79893a.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        return this.f79893a.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        return this.f79893a.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        return this.f79893a.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return this.f79893a.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        return this.f79893a.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        return this.f79893a.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        return this.f79893a.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        return this.f79893a.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        return this.f79893a.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        return this.f79893a.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        return this.f79893a.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.f79893a.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        return this.f79893a.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        return this.f79893a.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        return this.f79893a.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.f79893a.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        return this.f79893a.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        return this.f79893a.toString();
    }
}
