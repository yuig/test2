package a8;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import javax.net.SocketFactory;
import pk.a3;
import pk.h1;
import pk.v2;
import pk.x0;

/* loaded from: classes3.dex */
public final class p implements Closeable {

    /* renamed from: a */
    public final o f1425a;

    /* renamed from: b */
    public final n f1426b;

    /* renamed from: c */
    public final String f1427c;

    /* renamed from: d */
    public final SocketFactory f1428d;

    /* renamed from: e */
    public final boolean f1429e;

    /* renamed from: i */
    public Uri f1433i;

    /* renamed from: k */
    public q7.w f1435k;

    /* renamed from: l */
    public String f1436l;

    /* renamed from: n */
    public l f1438n;

    /* renamed from: o */
    public k0.a f1439o;

    /* renamed from: q */
    public boolean f1441q;

    /* renamed from: r */
    public boolean f1442r;

    /* renamed from: s */
    public boolean f1443s;

    /* renamed from: f */
    public final ArrayDeque f1430f = new ArrayDeque();

    /* renamed from: g */
    public final SparseArray f1431g = new SparseArray();

    /* renamed from: h */
    public final bn0.a f1432h = new bn0.a(this, 0);

    /* renamed from: j */
    public i0 f1434j = new i0(new m(this));

    /* renamed from: m */
    public long f1437m = 60000;

    /* renamed from: t */
    public long f1444t = -9223372036854775807L;

    /* renamed from: p */
    public int f1440p = -1;

    public p(u uVar, u uVar2, String str, Uri uri, SocketFactory socketFactory, boolean z13) {
        this.f1425a = uVar;
        this.f1426b = uVar2;
        this.f1427c = str;
        this.f1428d = socketFactory;
        this.f1429e = z13;
        this.f1433i = j0.g(uri);
        this.f1435k = j0.e(uri);
    }

    public static void J(p pVar, RtspMediaSource$RtspPlaybackException rtspMediaSource$RtspPlaybackException) {
        pVar.getClass();
        if (pVar.f1441q) {
            ((u) pVar.f1426b).a(rtspMediaSource$RtspPlaybackException);
            return;
        }
        String message = rtspMediaSource$RtspPlaybackException.getMessage();
        if (message == null) {
            message = "";
        }
        ((u) pVar.f1425a).f(message, rtspMediaSource$RtspPlaybackException);
    }

    public static void L(p pVar, List list) {
        if (pVar.f1429e) {
            d7.u.b("RtspClient", z.a.n("\n").l(list));
        }
    }

    public static v2 m(bn0.a aVar, Uri uri) {
        x0 x0Var = new x0();
        for (int i13 = 0; i13 < ((o0) aVar.f23561d).f1414b.size(); i13++) {
            c cVar = (c) ((o0) aVar.f23561d).f1414b.get(i13);
            if (k.a(cVar)) {
                x0Var.g(new c0((r) aVar.f23560c, cVar, uri));
            }
        }
        return x0Var.i();
    }

    public final void M() {
        long o03;
        w wVar = (w) this.f1430f.pollFirst();
        if (wVar == null) {
            z zVar = ((u) this.f1426b).f1463a;
            long j13 = zVar.f1492n;
            if (j13 != -9223372036854775807L) {
                o03 = d7.n0.o0(j13);
            } else {
                long j14 = zVar.f1493o;
                o03 = j14 != -9223372036854775807L ? d7.n0.o0(j14) : 0L;
            }
            zVar.f1482d.S(o03);
            return;
        }
        Uri a13 = wVar.a();
        bf.b.w(wVar.f1468c);
        String str = wVar.f1468c;
        String str2 = this.f1436l;
        bn0.a aVar = this.f1432h;
        ((p) aVar.f23561d).f1440p = 0;
        aVar.k(aVar.d(10, str2, h1.i("Transport", str), a13));
    }

    public final Socket O(Uri uri) {
        bf.b.i(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.f1428d.createSocket(host, port);
    }

    public final void P() {
        try {
            close();
            i0 i0Var = new i0(new m(this));
            this.f1434j = i0Var;
            i0Var.a(O(this.f1433i));
            this.f1436l = null;
            this.f1442r = false;
            this.f1439o = null;
        } catch (IOException e13) {
            ((u) this.f1426b).a(new IOException((Throwable) e13) { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$RtspPlaybackException
                public RtspMediaSource$RtspPlaybackException(Exception exc) {
                    super(exc);
                }
            });
        }
    }

    public final void Q(long j13) {
        if (this.f1440p == 2 && !this.f1443s) {
            Uri uri = this.f1433i;
            String str = this.f1436l;
            str.getClass();
            bn0.a aVar = this.f1432h;
            bf.b.t(((p) aVar.f23561d).f1440p == 2);
            aVar.k(aVar.d(5, str, a3.f100350g, uri));
            ((p) aVar.f23561d).f1443s = true;
        }
        this.f1444t = j13;
    }

    public final void S(long j13) {
        Uri uri = this.f1433i;
        String str = this.f1436l;
        str.getClass();
        bn0.a aVar = this.f1432h;
        int i13 = ((p) aVar.f23561d).f1440p;
        boolean z13 = true;
        if (i13 != 1 && i13 != 2) {
            z13 = false;
        }
        bf.b.t(z13);
        l0 l0Var = l0.f1392c;
        Object[] objArr = {Double.valueOf(j13 / 1000.0d)};
        int i14 = d7.n0.f53866a;
        aVar.k(aVar.d(6, str, h1.i("Range", String.format(Locale.US, "npt=%.3f-", objArr)), uri));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l lVar = this.f1438n;
        if (lVar != null) {
            lVar.close();
            this.f1438n = null;
            Uri uri = this.f1433i;
            String str = this.f1436l;
            str.getClass();
            bn0.a aVar = this.f1432h;
            p pVar = (p) aVar.f23561d;
            int i13 = pVar.f1440p;
            if (i13 != -1 && i13 != 0) {
                pVar.f1440p = 0;
                aVar.k(aVar.d(12, str, a3.f100350g, uri));
            }
        }
        this.f1434j.close();
    }
}
