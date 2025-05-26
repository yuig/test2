package p7;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import d7.n0;
import g8.v;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import l8.x;
import l8.z;
import q7.w;

/* loaded from: classes.dex */
public final class g implements x, l8.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f98980a;

    public /* synthetic */ g(j jVar) {
        this.f98980a = jVar;
    }

    @Override // l8.x
    public void b() {
        j jVar = this.f98980a;
        jVar.B.b();
        DashManifestStaleException dashManifestStaleException = jVar.D;
        if (dashManifestStaleException != null) {
            throw dashManifestStaleException;
        }
    }

    @Override // l8.r
    public void d(l8.u uVar, long j13, long j14) {
        z zVar = (z) uVar;
        j jVar = this.f98980a;
        jVar.getClass();
        long j15 = zVar.f82100a;
        Uri d2 = zVar.d();
        Map b13 = zVar.b();
        zVar.a();
        v vVar = new v(d2, b13, j14);
        jVar.f98991n.getClass();
        jVar.f98995r.d(vVar, zVar.f82102c);
        q7.c cVar = (q7.c) zVar.c();
        q7.c cVar2 = jVar.I;
        int size = cVar2 == null ? 0 : cVar2.f102616m.size();
        long j16 = cVar.b(0).f102640b;
        int i13 = 0;
        while (i13 < size && jVar.I.b(i13).f102640b < j16) {
            i13++;
        }
        if (cVar.f102607d) {
            if (size - i13 > cVar.f102616m.size()) {
                d7.u.g("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j17 = jVar.O;
                if (j17 == -9223372036854775807L || cVar.f102611h * 1000 > j17) {
                    jVar.N = 0;
                } else {
                    d7.u.g("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f102611h + ", " + jVar.O);
                }
            }
            int i14 = jVar.N;
            jVar.N = i14 + 1;
            if (i14 < jVar.f98991n.w(zVar.f82102c)) {
                jVar.D(Math.min((jVar.N - 1) * 1000, 5000));
                return;
            } else {
                jVar.D = new DashManifestStaleException();
                return;
            }
        }
        jVar.I = cVar;
        jVar.f98984J = cVar.f102607d & jVar.f98984J;
        jVar.K = j13 - j14;
        jVar.L = j13;
        jVar.P += i13;
        synchronized (jVar.f98998u) {
            try {
                if (zVar.f82101b.f63786a == jVar.G) {
                    Uri uri = jVar.I.f102614k;
                    if (uri == null) {
                        uri = zVar.d();
                    }
                    jVar.G = uri;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        q7.c cVar3 = jVar.I;
        if (!cVar3.f102607d || jVar.M != -9223372036854775807L) {
            jVar.C(true);
            return;
        }
        w wVar = cVar3.f102612i;
        if (wVar == null) {
            m8.c.c(jVar.B, new t5.e(jVar, 7));
            return;
        }
        String str = wVar.f102691b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                jVar.M = n0.b0(wVar.f102692c) - jVar.L;
                jVar.C(true);
                return;
            } catch (ParserException e13) {
                jVar.B(e13);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            jVar.B.g(new z(jVar.A, Uri.parse(wVar.f102692c), new h()), new i(jVar), 1);
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            jVar.B.g(new z(jVar.A, Uri.parse(wVar.f102692c), new v5.x((Object) null)), new i(jVar), 1);
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            m8.c.c(jVar.B, new t5.e(jVar, 7));
        } else {
            jVar.B(new IOException("Unsupported UTC timing scheme"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    @Override // l8.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l8.s e(l8.u r4, long r5, long r7, java.io.IOException r9, int r10) {
        /*
            r3 = this;
            l8.z r4 = (l8.z) r4
            p7.j r5 = r3.f98980a
            r5.getClass()
            g8.v r6 = new g8.v
            long r0 = r4.f82100a
            android.net.Uri r0 = r4.d()
            java.util.Map r1 = r4.b()
            r4.a()
            r6.<init>(r0, r1, r7)
            a10.e r7 = r5.f98991n
            r7.getClass()
            boolean r7 = r9 instanceof androidx.media3.common.ParserException
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L57
            boolean r7 = r9 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L57
            boolean r7 = r9 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r7 != 0) goto L57
            boolean r7 = r9 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r7 != 0) goto L57
            int r7 = androidx.media3.datasource.DataSourceException.f18777b
            r7 = r9
        L36:
            if (r7 == 0) goto L4b
            boolean r8 = r7 instanceof androidx.media3.datasource.DataSourceException
            if (r8 == 0) goto L46
            r8 = r7
            androidx.media3.datasource.DataSourceException r8 = (androidx.media3.datasource.DataSourceException) r8
            int r8 = r8.f18778a
            r2 = 2008(0x7d8, float:2.814E-42)
            if (r8 != r2) goto L46
            goto L57
        L46:
            java.lang.Throwable r7 = r7.getCause()
            goto L36
        L4b:
            int r10 = r10 + (-1)
            int r10 = r10 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r10, r7)
            long r7 = (long) r7
            goto L58
        L57:
            r7 = r0
        L58:
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 != 0) goto L5f
            l8.s r7 = l8.w.f82096f
            goto L66
        L5f:
            l8.s r10 = new l8.s
            r0 = 0
            r10.<init>(r0, r7)
            r7 = r10
        L66:
            boolean r8 = r7.c()
            r8 = r8 ^ 1
            g8.h0 r5 = r5.f98995r
            int r4 = r4.f82102c
            r5.g(r6, r4, r9, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.g.e(l8.u, long, long, java.io.IOException, int):l8.s");
    }

    @Override // l8.r
    public void p(l8.u uVar, long j13, long j14, int i13) {
        v vVar;
        z zVar = (z) uVar;
        j jVar = this.f98980a;
        jVar.getClass();
        if (i13 == 0) {
            vVar = new v(zVar.f82100a, zVar.f82101b, j13);
        } else {
            long j15 = zVar.f82100a;
            Uri d2 = zVar.d();
            Map b13 = zVar.b();
            zVar.a();
            vVar = new v(d2, b13, j14);
        }
        jVar.f98995r.h(vVar, zVar.f82102c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i13);
    }

    @Override // l8.r
    public void s(l8.u uVar, long j13, long j14, boolean z13) {
        this.f98980a.A((z) uVar, j13, j14);
    }
}
