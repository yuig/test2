package a8;

import android.net.Uri;
import g8.f1;
import java.util.ArrayList;
import javax.net.SocketFactory;

/* loaded from: classes3.dex */
public final class b0 extends g8.a {

    /* renamed from: h, reason: collision with root package name */
    public final d f1288h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1289i;

    /* renamed from: j, reason: collision with root package name */
    public final Uri f1290j;

    /* renamed from: k, reason: collision with root package name */
    public final SocketFactory f1291k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1292l;

    /* renamed from: m, reason: collision with root package name */
    public long f1293m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1294n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1295o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1296p;

    /* renamed from: q, reason: collision with root package name */
    public a7.i0 f1297q;

    static {
        a7.j0.a("media3.exoplayer.rtsp");
    }

    public b0(a7.i0 i0Var, d dVar, String str, SocketFactory socketFactory) {
        this.f1297q = i0Var;
        this.f1288h = dVar;
        this.f1289i = str;
        a7.d0 d0Var = i0Var.f1073b;
        d0Var.getClass();
        Uri uri = d0Var.f969a;
        String scheme = uri.getScheme();
        if (scheme != null && com.bumptech.glide.c.z("rtspt", scheme)) {
            uri = Uri.parse("rtsp" + uri.toString().substring(5));
        }
        this.f1290j = uri;
        this.f1291k = socketFactory;
        this.f1292l = false;
        this.f1293m = -9223372036854775807L;
        this.f1296p = true;
    }

    @Override // g8.a
    public final g8.c0 b(g8.e0 e0Var, l8.m mVar, long j13) {
        q qVar = new q(this);
        return new z(mVar, this.f1288h, this.f1290j, qVar, this.f1289i, this.f1291k, this.f1292l);
    }

    @Override // g8.a
    public final synchronized a7.i0 j() {
        return this.f1297q;
    }

    @Override // g8.a
    public final void l() {
    }

    @Override // g8.a
    public final void n(g7.a0 a0Var) {
        x();
    }

    @Override // g8.a
    public final void q(g8.c0 c0Var) {
        z zVar = (z) c0Var;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = zVar.f1483e;
            if (i13 >= arrayList.size()) {
                d7.n0.g(zVar.f1482d);
                zVar.f1496r = true;
                return;
            }
            x xVar = (x) arrayList.get(i13);
            if (!xVar.f1474e) {
                xVar.f1471b.f(null);
                xVar.f1472c.D();
                xVar.f1474e = true;
            }
            i13++;
        }
    }

    @Override // g8.a
    public final void t() {
    }

    @Override // g8.a
    public final synchronized void w(a7.i0 i0Var) {
        this.f1297q = i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a8.a0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [a8.b0, g8.a] */
    public final void x() {
        f1 f1Var = new f1(this.f1293m, this.f1294n, this.f1295o, j());
        if (this.f1296p) {
            f1Var = new a0(this, f1Var, 0);
        }
        o(f1Var);
    }
}
