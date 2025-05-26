package okhttp3;

import a.cb;
import al2.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ConnectionSpec;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ConnectionSpec {

    /* renamed from: e, reason: collision with root package name */
    public static final ConnectionSpec f95571e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConnectionSpec f95572f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f95573a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f95574b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f95575c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f95576d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/ConnectionSpec$Companion;", "", "()V", "APPROVED_CIPHER_SUITES", "", "Lokhttp3/CipherSuite;", "[Lokhttp3/CipherSuite;", "CLEARTEXT", "Lokhttp3/ConnectionSpec;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    static {
        new Companion(0);
        CipherSuite cipherSuite = CipherSuite.f95566r;
        CipherSuite cipherSuite2 = CipherSuite.f95567s;
        CipherSuite cipherSuite3 = CipherSuite.f95568t;
        CipherSuite cipherSuite4 = CipherSuite.f95560l;
        CipherSuite cipherSuite5 = CipherSuite.f95562n;
        CipherSuite cipherSuite6 = CipherSuite.f95561m;
        CipherSuite cipherSuite7 = CipherSuite.f95563o;
        CipherSuite cipherSuite8 = CipherSuite.f95565q;
        CipherSuite cipherSuite9 = CipherSuite.f95564p;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.f95558j, CipherSuite.f95559k, CipherSuite.f95556h, CipherSuite.f95557i, CipherSuite.f95554f, CipherSuite.f95555g, CipherSuite.f95553e};
        Builder builder = new Builder(true);
        builder.c((CipherSuite[]) Arrays.copyOf(new CipherSuite[]{cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9}, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        builder.f(tlsVersion, tlsVersion2);
        builder.d();
        builder.a();
        Builder builder2 = new Builder(true);
        builder2.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, 16));
        builder2.f(tlsVersion, tlsVersion2);
        builder2.d();
        f95571e = builder2.a();
        Builder builder3 = new Builder(true);
        builder3.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, 16));
        builder3.f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        builder3.d();
        builder3.a();
        f95572f = new Builder(false).a();
    }

    public ConnectionSpec(boolean z13, boolean z14, String[] strArr, String[] strArr2) {
        this.f95573a = z13;
        this.f95574b = z14;
        this.f95575c = strArr;
        this.f95576d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f95575c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f95550b.b(str));
        }
        return CollectionsKt.F0(arrayList);
    }

    public final boolean b(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f95573a) {
            return false;
        }
        String[] strArr = this.f95576d;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            c cVar = c.f15503a;
            Intrinsics.g(cVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
            if (!Util.j(strArr, enabledProtocols, cVar)) {
                return false;
            }
        }
        String[] strArr2 = this.f95575c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = socket.getEnabledCipherSuites();
        CipherSuite.f95550b.getClass();
        return Util.j(strArr2, enabledCipherSuites, CipherSuite.f95551c);
    }

    public final List c() {
        String[] strArr = this.f95576d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.INSTANCE.getClass();
            arrayList.add(TlsVersion.Companion.a(str));
        }
        return CollectionsKt.F0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z13 = connectionSpec.f95573a;
        boolean z14 = this.f95573a;
        if (z14 != z13) {
            return false;
        }
        return !z14 || (Arrays.equals(this.f95575c, connectionSpec.f95575c) && Arrays.equals(this.f95576d, connectionSpec.f95576d) && this.f95574b == connectionSpec.f95574b);
    }

    public final int hashCode() {
        if (!this.f95573a) {
            return 17;
        }
        String[] strArr = this.f95575c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f95576d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f95574b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f95573a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb3 = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb3.append(Objects.toString(a(), "[all enabled]"));
        sb3.append(", tlsVersions=");
        sb3.append(Objects.toString(c(), "[all enabled]"));
        sb3.append(", supportsTlsExtensions=");
        return cb.m(sb3, this.f95574b, ')');
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f95577a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f95578b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f95579c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f95580d;

        public Builder(boolean z13) {
            this.f95577a = z13;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.f95577a, this.f95580d, this.f95578b, this.f95579c);
        }

        public final void b(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f95577a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.f95578b = (String[]) cipherSuites.clone();
        }

        public final void c(CipherSuite... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f95577a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.f95569a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void d() {
            if (!this.f95577a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f95580d = true;
        }

        public final void e(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f95577a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.f95579c = (String[]) tlsVersions.clone();
        }

        public final void f(TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f95577a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public Builder(ConnectionSpec connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f95577a = connectionSpec.f95573a;
            this.f95578b = connectionSpec.f95575c;
            this.f95579c = connectionSpec.f95576d;
            this.f95580d = connectionSpec.f95574b;
        }
    }
}
