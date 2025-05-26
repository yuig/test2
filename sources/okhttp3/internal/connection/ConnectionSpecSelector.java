package okhttp3.internal.connection;

import al2.c;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CipherSuite;
import okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ConnectionSpecSelector {

    /* renamed from: a, reason: collision with root package name */
    public final List f95865a;

    /* renamed from: b, reason: collision with root package name */
    public int f95866b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f95867c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f95868d;

    public ConnectionSpecSelector(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f95865a = connectionSpecs;
    }

    public final ConnectionSpec a(SSLSocket sslSocket) {
        ConnectionSpec connectionSpec;
        int i13;
        boolean z13;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i14 = this.f95866b;
        List list = this.f95865a;
        int size = list.size();
        while (true) {
            if (i14 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = (ConnectionSpec) list.get(i14);
            if (connectionSpec.b(sslSocket)) {
                this.f95866b = i14 + 1;
                break;
            }
            i14++;
        }
        if (connectionSpec == null) {
            StringBuilder sb3 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb3.append(this.f95868d);
            sb3.append(", modes=");
            sb3.append(list);
            sb3.append(", supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.f(enabledProtocols);
            String arrays = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
            sb3.append(arrays);
            throw new UnknownServiceException(sb3.toString());
        }
        int i15 = this.f95866b;
        int size2 = list.size();
        while (true) {
            i13 = 0;
            if (i15 >= size2) {
                z13 = false;
                break;
            }
            if (((ConnectionSpec) list.get(i15)).b(sslSocket)) {
                z13 = true;
                break;
            }
            i15++;
        }
        this.f95867c = z13;
        boolean z14 = this.f95868d;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] strArr = connectionSpec.f95575c;
        if (strArr != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            CipherSuite.f95550b.getClass();
            cipherSuitesIntersection = Util.p(enabledCipherSuites, strArr, CipherSuite.f95551c);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = connectionSpec.f95576d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            c cVar = c.f15503a;
            Intrinsics.g(cVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
            tlsVersionsIntersection = Util.p(enabledProtocols2, strArr2, cVar);
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        CipherSuite.f95550b.getClass();
        CipherSuite$Companion$ORDER_BY_NAME$1 comparator = CipherSuite.f95551c;
        byte[] bArr = Util.f95757a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        while (true) {
            if (i13 >= length) {
                i13 = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i13], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i13++;
        }
        if (z14 && i13 != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = supportedCipherSuites[i13];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) copyOf;
            cipherSuitesIntersection[c0.F(cipherSuitesIntersection)] = value;
        }
        ConnectionSpec.Builder builder = new ConnectionSpec.Builder(connectionSpec);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        builder.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        builder.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        ConnectionSpec a13 = builder.a();
        if (a13.c() != null) {
            sslSocket.setEnabledProtocols(a13.f95576d);
        }
        if (a13.a() != null) {
            sslSocket.setEnabledCipherSuites(a13.f95575c);
        }
        return connectionSpec;
    }

    public final boolean b(IOException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        this.f95868d = true;
        return (!this.f95867c || (e13 instanceof ProtocolException) || (e13 instanceof InterruptedIOException) || ((e13 instanceof SSLHandshakeException) && (e13.getCause() instanceof CertificateException)) || (e13 instanceof SSLPeerUnverifiedException) || !(e13 instanceof SSLException)) ? false : true;
    }
}
