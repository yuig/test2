package qz;

import java.math.BigInteger;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import ny.i0;
import ny.k0;
import okhttp3.Call;
import okhttp3.Handshake;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class s extends v {

    /* renamed from: w, reason: collision with root package name */
    public long f105432w;

    @Override // okhttp3.EventListener
    public final void B(RealCall call, Handshake handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
        new ny.f0(14, 0).i();
    }

    @Override // qz.x, okhttp3.EventListener
    public final void C(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.C(call);
        new ny.e0(14, 0).i();
    }

    @Override // qz.x, okhttp3.EventListener
    public final void d(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.d(call);
        new i0(15, 0).i();
    }

    @Override // qz.x, okhttp3.EventListener
    public final void f(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.f(call);
        String a13 = call.getF95898b().a("X-B3-ParentSpanId");
        if (a13 != null) {
            new k0(16, 0).i();
            new ny.h0(new BigInteger(a13, CharsKt.checkRadix(16)).longValue()).i();
        }
    }

    @Override // qz.x, okhttp3.EventListener
    public final void m(Call call, String domainName, List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        super.m(call, domainName, inetAddressList);
        new ny.d0(13, 0).i();
    }

    @Override // qz.x, okhttp3.EventListener
    public final void n(Call call, String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        super.n(call, domainName);
        new ny.c0(13, 0).i();
    }

    @Override // qz.v, qz.x, okhttp3.EventListener
    public final void v(RealCall call, long j13) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.v(call, j13);
        if (this.f105432w != 0 && j13 < 1000000) {
            long currentTimeMillis = System.currentTimeMillis() - this.f105432w;
            if (currentTimeMillis > 0) {
                se.l.f112378a = (int) ((8 * j13) / currentTimeMillis);
            }
            this.f105432w = 0L;
        }
        new ny.z(j13).i();
    }

    @Override // qz.v, qz.x, okhttp3.EventListener
    public final void w(RealCall call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.w(call);
        if (this.f105432w == 0) {
            this.f105432w = System.currentTimeMillis();
        }
        new ny.y(11, 0).i();
    }

    @Override // qz.v, qz.x, okhttp3.EventListener
    public final void y(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        new ny.g0(15, 0).i();
        super.y(call, response);
    }
}
