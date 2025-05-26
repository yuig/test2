package qz;

import com.pinterest.api.model.tv;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public class x extends EventListener {

    /* renamed from: b, reason: collision with root package name */
    public final pb0.a f105445b;

    /* renamed from: c, reason: collision with root package name */
    public long f105446c;

    /* renamed from: d, reason: collision with root package name */
    public long f105447d;

    /* renamed from: e, reason: collision with root package name */
    public long f105448e;

    /* renamed from: f, reason: collision with root package name */
    public long f105449f;

    /* renamed from: g, reason: collision with root package name */
    public long f105450g;

    /* renamed from: h, reason: collision with root package name */
    public long f105451h;

    /* renamed from: i, reason: collision with root package name */
    public long f105452i;

    /* renamed from: j, reason: collision with root package name */
    public long f105453j;

    /* renamed from: k, reason: collision with root package name */
    public long f105454k;

    /* renamed from: l, reason: collision with root package name */
    public long f105455l;

    /* renamed from: m, reason: collision with root package name */
    public long f105456m;

    /* renamed from: n, reason: collision with root package name */
    public int f105457n;

    /* renamed from: o, reason: collision with root package name */
    public long f105458o;

    /* renamed from: p, reason: collision with root package name */
    public long f105459p;

    /* renamed from: q, reason: collision with root package name */
    public String f105460q;

    /* renamed from: r, reason: collision with root package name */
    public String f105461r;

    /* renamed from: s, reason: collision with root package name */
    public int f105462s;

    public x() {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f105445b = clock;
        this.f105460q = "";
        this.f105461r = "";
    }

    @Override // okhttp3.EventListener
    public void C(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        ((pb0.g) this.f105445b).getClass();
        this.f105450g = System.currentTimeMillis() - this.f105459p;
    }

    public final tv.a D() {
        long j13;
        int i13 = this.f105457n;
        long j14 = this.f105446c;
        long j15 = this.f105447d;
        long j16 = this.f105448e;
        long j17 = this.f105450g;
        long j18 = this.f105449f;
        long j19 = this.f105451h;
        long j23 = this.f105452i;
        long j24 = this.f105453j;
        long j25 = this.f105454k;
        long j26 = this.f105455l;
        long j27 = this.f105456m;
        long j28 = (j27 - j26) + (j26 - j19) + (j18 - j17) + (j17 - j16);
        if (j28 == 0) {
            j13 = j15;
            j28 = this.f105458o;
        } else {
            j13 = j15;
        }
        return new tv.a(i13, j14, j13, j16, j17, j18, j19, j23, j24, j25, j26, j27, j28, j26 - j19, j27 - j26, j17 - j16, j18 - j17, j13 - j14, this.f105460q, this.f105461r, this.f105462s);
    }

    @Override // okhttp3.EventListener
    public void d(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        ((pb0.g) this.f105445b).getClass();
        this.f105458o = System.currentTimeMillis() - this.f105459p;
    }

    @Override // okhttp3.EventListener
    public final void e(Call call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        d(call);
    }

    @Override // okhttp3.EventListener
    public void f(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        ((pb0.g) this.f105445b).getClass();
        this.f105459p = System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void h(RealCall call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        ((pb0.g) this.f105445b).getClass();
        this.f105449f = System.currentTimeMillis() - this.f105459p;
    }

    @Override // okhttp3.EventListener
    public final void j(RealCall call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        ((pb0.g) this.f105445b).getClass();
        this.f105448e = System.currentTimeMillis() - this.f105459p;
    }

    @Override // okhttp3.EventListener
    public void m(Call call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        ((pb0.g) this.f105445b).getClass();
        this.f105447d = System.currentTimeMillis() - this.f105459p;
    }

    @Override // okhttp3.EventListener
    public void n(Call call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        ((pb0.g) this.f105445b).getClass();
        this.f105446c = System.currentTimeMillis() - this.f105459p;
    }

    @Override // okhttp3.EventListener
    public final void q(RealCall call, long j13) {
        Intrinsics.checkNotNullParameter(call, "call");
        ((pb0.g) this.f105445b).getClass();
        this.f105454k = System.currentTimeMillis() - this.f105459p;
    }

    @Override // okhttp3.EventListener
    public final void r(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        ((pb0.g) this.f105445b).getClass();
        this.f105453j = System.currentTimeMillis() - this.f105459p;
    }

    @Override // okhttp3.EventListener
    public final void t(RealCall call, Request request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        ((pb0.g) this.f105445b).getClass();
        this.f105452i = System.currentTimeMillis() - this.f105459p;
    }

    @Override // okhttp3.EventListener
    public final void u(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        ((pb0.g) this.f105445b).getClass();
        this.f105451h = System.currentTimeMillis() - this.f105459p;
    }

    @Override // okhttp3.EventListener
    public void v(RealCall call, long j13) {
        Intrinsics.checkNotNullParameter(call, "call");
        ((pb0.g) this.f105445b).getClass();
        this.f105456m = System.currentTimeMillis() - this.f105459p;
    }

    @Override // okhttp3.EventListener
    public void w(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        ((pb0.g) this.f105445b).getClass();
        this.f105455l = System.currentTimeMillis() - this.f105459p;
    }

    @Override // okhttp3.EventListener
    public void y(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        String c13 = response.f95725f.c("x-cdn");
        if (c13 != null) {
            this.f105460q = c13;
        }
        String c14 = response.f95725f.c("x-pinterest-cache");
        if (c14 != null) {
            this.f105461r = c14;
        }
        this.f105462s = response.f95723d;
    }
}
