package okhttp3;

import a.a;
import a.cb;
import ep.b;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import okhttp3.HttpUrl;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Address;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Address {

    /* renamed from: a, reason: collision with root package name */
    public final Dns f95480a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f95481b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f95482c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f95483d;

    /* renamed from: e, reason: collision with root package name */
    public final CertificatePinner f95484e;

    /* renamed from: f, reason: collision with root package name */
    public final Authenticator f95485f;

    /* renamed from: g, reason: collision with root package name */
    public final Proxy f95486g;

    /* renamed from: h, reason: collision with root package name */
    public final ProxySelector f95487h;

    /* renamed from: i, reason: collision with root package name */
    public final HttpUrl f95488i;

    /* renamed from: j, reason: collision with root package name */
    public final List f95489j;

    /* renamed from: k, reason: collision with root package name */
    public final List f95490k;

    public Address(String host, int i13, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, Proxy proxy, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f95480a = dns;
        this.f95481b = socketFactory;
        this.f95482c = sSLSocketFactory;
        this.f95483d = hostnameVerifier;
        this.f95484e = certificatePinner;
        this.f95485f = proxyAuthenticator;
        this.f95486g = proxy;
        this.f95487h = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String scheme = sSLSocketFactory != null ? "https" : "http";
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (z.i(scheme, "http", true)) {
            builder.f95642a = "http";
        } else {
            if (!z.i(scheme, "https", true)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(scheme));
            }
            builder.f95642a = "https";
        }
        Intrinsics.checkNotNullParameter(host, "host");
        String c13 = HostnamesKt.c(HttpUrl.Companion.g(HttpUrl.f95629k, host, 0, 0, false, 7));
        if (c13 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(host));
        }
        builder.f95645d = c13;
        if (1 > i13 || i13 >= 65536) {
            throw new IllegalArgumentException(a.d("unexpected port: ", i13).toString());
        }
        builder.f95646e = i13;
        this.f95488i = builder.c();
        this.f95489j = Util.A(protocols);
        this.f95490k = Util.A(connectionSpecs);
    }

    public final boolean a(Address that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.d(this.f95480a, that.f95480a) && Intrinsics.d(this.f95485f, that.f95485f) && Intrinsics.d(this.f95489j, that.f95489j) && Intrinsics.d(this.f95490k, that.f95490k) && Intrinsics.d(this.f95487h, that.f95487h) && Intrinsics.d(this.f95486g, that.f95486g) && Intrinsics.d(this.f95482c, that.f95482c) && Intrinsics.d(this.f95483d, that.f95483d) && Intrinsics.d(this.f95484e, that.f95484e) && this.f95488i.f95635e == that.f95488i.f95635e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (Intrinsics.d(this.f95488i, address.f95488i) && a(address)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f95484e) + ((Objects.hashCode(this.f95483d) + ((Objects.hashCode(this.f95482c) + ((Objects.hashCode(this.f95486g) + ((this.f95487h.hashCode() + b.c(this.f95490k, b.c(this.f95489j, (this.f95485f.hashCode() + ((this.f95480a.hashCode() + cb.d(this.f95488i.f95639i, 527, 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("Address{");
        HttpUrl httpUrl = this.f95488i;
        sb3.append(httpUrl.f95634d);
        sb3.append(':');
        sb3.append(httpUrl.f95635e);
        sb3.append(", ");
        Proxy proxy = this.f95486g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f95487h;
        }
        return b.k(sb3, str, '}');
    }
}
