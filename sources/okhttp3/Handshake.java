package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Handshake;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Handshake {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f95618e = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final TlsVersion f95619a;

    /* renamed from: b, reason: collision with root package name */
    public final CipherSuite f95620b;

    /* renamed from: c, reason: collision with root package name */
    public final List f95621c;

    /* renamed from: d, reason: collision with root package name */
    public final v f95622d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static Handshake a(SSLSession sSLSession) {
            List list;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (Intrinsics.d(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || Intrinsics.d(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            CipherSuite b13 = CipherSuite.f95550b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (Intrinsics.d("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion.INSTANCE.getClass();
            TlsVersion a13 = TlsVersion.Companion.a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                list = peerCertificates != null ? Util.l(Arrays.copyOf(peerCertificates, peerCertificates.length)) : q0.f80391a;
            } catch (SSLPeerUnverifiedException unused) {
                list = q0.f80391a;
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new Handshake(a13, b13, localCertificates != null ? Util.l(Arrays.copyOf(localCertificates, localCertificates.length)) : q0.f80391a, new Handshake$Companion$handshake$1(list));
        }

        public static Handshake b(TlsVersion tlsVersion, CipherSuite cipherSuite, List peerCertificates, List localCertificates) {
            Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
            Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.A(localCertificates), new Handshake$Companion$get$1(Util.A(peerCertificates)));
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f95619a = tlsVersion;
        this.f95620b = cipherSuite;
        this.f95621c = localCertificates;
        this.f95622d = m.b(new Handshake$peerCertificates$2(peerCertificatesFn));
    }

    public final List a() {
        return (List) this.f95622d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f95619a == this.f95619a && Intrinsics.d(handshake.f95620b, this.f95620b) && Intrinsics.d(handshake.a(), a()) && Intrinsics.d(handshake.f95621c, this.f95621c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f95621c.hashCode() + ((a().hashCode() + ((this.f95620b.hashCode() + ((this.f95619a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a13 = a();
        ArrayList arrayList = new ArrayList(g0.q(a13, 10));
        for (Certificate certificate : a13) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb3 = new StringBuilder("Handshake{tlsVersion=");
        sb3.append(this.f95619a);
        sb3.append(" cipherSuite=");
        sb3.append(this.f95620b);
        sb3.append(" peerCertificates=");
        sb3.append(obj);
        sb3.append(" localCertificates=");
        List<Certificate> list = this.f95621c;
        ArrayList arrayList2 = new ArrayList(g0.q(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "type");
            }
            arrayList2.add(type);
        }
        sb3.append(arrayList2);
        sb3.append('}');
        return sb3.toString();
    }
}
