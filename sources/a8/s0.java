package a8;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.net.DatagramSocket;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class s0 implements e {

    /* renamed from: a, reason: collision with root package name */
    public final g7.b0 f1458a;

    /* renamed from: b, reason: collision with root package name */
    public s0 f1459b;

    public s0(long j13) {
        this.f1458a = new g7.b0(d7.b.r(j13));
    }

    @Override // a8.e
    public final String a() {
        int b13 = b();
        bf.b.t(b13 != -1);
        int i13 = d7.n0.f53866a;
        Locale locale = Locale.US;
        return a.a.f("RTP/AVP;unicast;client_port=", b13, "-", b13 + 1);
    }

    @Override // a8.e
    public final int b() {
        DatagramSocket datagramSocket = this.f1458a.f63756i;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // g7.f
    public final void close() {
        this.f1458a.close();
        s0 s0Var = this.f1459b;
        if (s0Var != null) {
            s0Var.close();
        }
    }

    @Override // g7.f
    public final long d(g7.i iVar) {
        this.f1458a.d(iVar);
        return -1L;
    }

    @Override // g7.f
    public final void f(g7.a0 a0Var) {
        this.f1458a.f(a0Var);
    }

    @Override // a8.e
    public final boolean j() {
        return true;
    }

    @Override // a8.e
    public final q0 l() {
        return null;
    }

    @Override // g7.f
    public final Uri r() {
        return this.f1458a.f63755h;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        try {
            return this.f1458a.read(bArr, i13, i14);
        } catch (UdpDataSource$UdpDataSourceException e13) {
            if (e13.f18778a == 2002) {
                return -1;
            }
            throw e13;
        }
    }
}
