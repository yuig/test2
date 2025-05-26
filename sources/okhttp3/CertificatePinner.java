package okhttp3;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.f0;
import okhttp3.internal.tls.CertificateChainCleaner;
import wo2.a;
import wo2.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/CertificatePinner;", "", "Builder", "Companion", "Pin", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CertificatePinner {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f95540c = new Companion(0);

    /* renamed from: d, reason: collision with root package name */
    public static final CertificatePinner f95541d = new CertificatePinner(CollectionsKt.J0(new Builder().f95544a), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f95542a;

    /* renamed from: b, reason: collision with root package name */
    public final CertificateChainCleaner f95543b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f95544a = new ArrayList();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static String a(X509Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            Intrinsics.checkNotNullParameter(certificate, "<this>");
            m mVar = m.f130712d;
            byte[] encoded = certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return "sha256/".concat(a.a(f0.q0(encoded).a("SHA-256").f130713a));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Pin {
        public static void a(String hostname) {
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            z.p(null, "**.", false);
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            pin.getClass();
            if (!Intrinsics.d(null, null)) {
                return false;
            }
            pin.getClass();
            if (!Intrinsics.d(null, null)) {
                return false;
            }
            pin.getClass();
            return Intrinsics.d(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set pins, CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f95542a = pins;
        this.f95543b = certificateChainCleaner;
    }

    public final void a(String hostname, List peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        b(new CertificatePinner$check$1(this, peerCertificates, hostname), hostname);
    }

    public final void b(Function0 cleanedPeerCertificatesFn, String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f95542a;
        q0 q0Var = q0.f80391a;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            q0Var.getClass();
        } else {
            ((Pin) it.next()).getClass();
            Pin.a(hostname);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (Intrinsics.d(certificatePinner.f95542a, this.f95542a) && Intrinsics.d(certificatePinner.f95543b, this.f95543b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f95542a.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f95543b;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }
}
