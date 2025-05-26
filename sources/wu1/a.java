package wu1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes4.dex */
public final class a extends EventListener {

    /* renamed from: b, reason: collision with root package name */
    public final List f131149b;

    public a(ArrayList listeners) {
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.f131149b = listeners;
    }

    @Override // okhttp3.EventListener
    public final void A(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).A(call, response);
        }
    }

    @Override // okhttp3.EventListener
    public final void B(RealCall call, Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).B(call, handshake);
        }
    }

    @Override // okhttp3.EventListener
    public final void C(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).C(call);
        }
    }

    @Override // okhttp3.EventListener
    public final void a(Call call, Response cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).a(call, cachedResponse);
        }
    }

    @Override // okhttp3.EventListener
    public final void b(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).b(call, response);
        }
    }

    @Override // okhttp3.EventListener
    public final void c(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).c(call);
        }
    }

    @Override // okhttp3.EventListener
    public final void d(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).d(call);
        }
    }

    @Override // okhttp3.EventListener
    public final void e(Call call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).e(call, ioe);
        }
    }

    @Override // okhttp3.EventListener
    public final void f(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).f(call);
        }
    }

    @Override // okhttp3.EventListener
    public final void g(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).g(call);
        }
    }

    @Override // okhttp3.EventListener
    public final void h(RealCall call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).h(call, inetSocketAddress, proxy, protocol);
        }
    }

    @Override // okhttp3.EventListener
    public final void i(RealCall call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).i(call, inetSocketAddress, proxy, ioe);
        }
    }

    @Override // okhttp3.EventListener
    public final void j(RealCall call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).j(call, inetSocketAddress, proxy);
        }
    }

    @Override // okhttp3.EventListener
    public final void k(RealCall call, RealConnection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).k(call, connection);
        }
    }

    @Override // okhttp3.EventListener
    public final void l(Call call, RealConnection connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).l(call, connection);
        }
    }

    @Override // okhttp3.EventListener
    public final void m(Call call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).m(call, domainName, inetAddressList);
        }
    }

    @Override // okhttp3.EventListener
    public final void n(Call call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).n(call, domainName);
        }
    }

    @Override // okhttp3.EventListener
    public final void o(Call call, HttpUrl url, List proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).o(call, url, proxies);
        }
    }

    @Override // okhttp3.EventListener
    public final void p(Call call, HttpUrl url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).p(call, url);
        }
    }

    @Override // okhttp3.EventListener
    public final void q(RealCall call, long j13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).q(call, j13);
        }
    }

    @Override // okhttp3.EventListener
    public final void r(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).r(call);
        }
    }

    @Override // okhttp3.EventListener
    public final void s(RealCall call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).s(call, ioe);
        }
    }

    @Override // okhttp3.EventListener
    public final void t(RealCall call, Request request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).t(call, request);
        }
    }

    @Override // okhttp3.EventListener
    public final void u(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).u(call);
        }
    }

    @Override // okhttp3.EventListener
    public final void v(RealCall call, long j13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).v(call, j13);
        }
    }

    @Override // okhttp3.EventListener
    public final void w(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).w(call);
        }
    }

    @Override // okhttp3.EventListener
    public final void x(RealCall call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).x(call, ioe);
        }
    }

    @Override // okhttp3.EventListener
    public final void y(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).y(call, response);
        }
    }

    @Override // okhttp3.EventListener
    public final void z(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator it = this.f131149b.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).z(call);
        }
    }
}
