package v7;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import d7.n0;
import g7.y;
import g8.a0;
import g8.h0;
import g8.v;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l8.u;
import l8.w;
import l8.z;
import pk.c1;

/* loaded from: classes3.dex */
public final class b implements l8.r {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f124232a;

    /* renamed from: b, reason: collision with root package name */
    public final w f124233b = new w("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: c, reason: collision with root package name */
    public final g7.f f124234c;

    /* renamed from: d, reason: collision with root package name */
    public k f124235d;

    /* renamed from: e, reason: collision with root package name */
    public long f124236e;

    /* renamed from: f, reason: collision with root package name */
    public long f124237f;

    /* renamed from: g, reason: collision with root package name */
    public long f124238g;

    /* renamed from: h, reason: collision with root package name */
    public long f124239h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f124240i;

    /* renamed from: j, reason: collision with root package name */
    public IOException f124241j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f124242k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f124243l;

    public b(c cVar, Uri uri) {
        this.f124243l = cVar;
        this.f124232a = uri;
        this.f124234c = cVar.f124245a.f116467a.a();
    }

    public static boolean a(b bVar, long j13) {
        bVar.f124239h = SystemClock.elapsedRealtime() + j13;
        c cVar = bVar.f124243l;
        if (!bVar.f124232a.equals(cVar.f124256l)) {
            return false;
        }
        List list = cVar.f124255k.f124332e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i13 = 0; i13 < size; i13++) {
            b bVar2 = (b) cVar.f124248d.get(((m) list.get(i13)).f124324a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f124239h) {
                Uri uri = bVar2.f124232a;
                cVar.f124256l = uri;
                bVar2.g(cVar.b(uri));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        k kVar = this.f124235d;
        Uri uri = this.f124232a;
        if (kVar != null) {
            j jVar = kVar.f124319v;
            if (jVar.f124296a != -9223372036854775807L || jVar.f124300e) {
                Uri.Builder buildUpon = uri.buildUpon();
                k kVar2 = this.f124235d;
                if (kVar2.f124319v.f124300e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(kVar2.f124308k + kVar2.f124315r.size()));
                    k kVar3 = this.f124235d;
                    if (kVar3.f124311n != -9223372036854775807L) {
                        c1 c1Var = kVar3.f124316s;
                        int size = c1Var.size();
                        if (!c1Var.isEmpty() && ((f) com.bumptech.glide.c.P(c1Var)).f124279m) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                j jVar2 = this.f124235d.f124319v;
                if (jVar2.f124296a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", jVar2.f124297b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z13) {
        g(z13 ? b() : this.f124232a);
    }

    @Override // l8.r
    public final void d(u uVar, long j13, long j14) {
        z zVar = (z) uVar;
        o oVar = (o) zVar.f82105f;
        y yVar = zVar.f82103d;
        v vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        if (oVar instanceof k) {
            h((k) oVar, vVar);
            this.f124243l.f124251g.d(vVar, 4);
        } else {
            ParserException b13 = ParserException.b("Loaded playlist has unexpected type.", null);
            this.f124241j = b13;
            this.f124243l.f124251g.g(vVar, 4, b13, true);
        }
        this.f124243l.f124247c.getClass();
    }

    @Override // l8.r
    public final l8.s e(u uVar, long j13, long j14, IOException iOException, int i13) {
        z zVar = (z) uVar;
        long j15 = zVar.f82100a;
        y yVar = zVar.f82103d;
        Uri uri = yVar.f63853c;
        v vVar = new v(uri, yVar.f63854d, j14);
        boolean z13 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z14 = iOException instanceof HlsPlaylistParser$DeltaUpdateException;
        l8.s sVar = w.f82095e;
        c cVar = this.f124243l;
        int i14 = zVar.f82102c;
        if (z13 || z14) {
            int i15 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).f18780d : Integer.MAX_VALUE;
            if (z14 || i15 == 400 || i15 == 503) {
                this.f124238g = SystemClock.elapsedRealtime();
                c(false);
                h0 h0Var = cVar.f124251g;
                int i16 = n0.f53866a;
                h0Var.g(vVar, i14, iOException, true);
                return sVar;
            }
        }
        k0.a aVar = new k0.a(vVar, new a0(i14), iOException, i13);
        Iterator it = cVar.f124249e.iterator();
        boolean z15 = false;
        while (it.hasNext()) {
            z15 |= !((r) it.next()).b(this.f124232a, aVar, false);
        }
        a10.e eVar = cVar.f124247c;
        if (z15) {
            eVar.getClass();
            long x13 = a10.e.x(aVar);
            sVar = x13 != -9223372036854775807L ? new l8.s(0, x13) : w.f82096f;
        }
        boolean z16 = !sVar.c();
        cVar.f124251g.g(vVar, i14, iOException, z16);
        if (z16) {
            eVar.getClass();
        }
        return sVar;
    }

    public final void f(Uri uri) {
        g7.i iVar;
        c cVar = this.f124243l;
        l8.y g13 = cVar.f124246b.g(cVar.f124255k, this.f124235d);
        Map emptyMap = Collections.emptyMap();
        bf.b.x(uri, "The uri must be set.");
        g7.i iVar2 = new g7.i(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        k0.a aVar = cVar.f124250f;
        if (aVar != null) {
            l8.k kVar = new l8.k(aVar, "h");
            kVar.f82037j = "m";
            if (cVar.f124257m != null) {
                kVar.f82033f = Boolean.valueOf(!r3.f124312o);
            }
            iVar = kVar.a().a(iVar2);
        } else {
            iVar = iVar2;
        }
        z zVar = new z(4, this.f124234c, iVar, g13);
        this.f124233b.g(zVar, this, cVar.f124247c.w(zVar.f82102c));
    }

    public final void g(Uri uri) {
        this.f124239h = 0L;
        if (this.f124240i) {
            return;
        }
        w wVar = this.f124233b;
        if (wVar.d() || wVar.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = this.f124238g;
        if (elapsedRealtime >= j13) {
            f(uri);
        } else {
            this.f124240i = true;
            this.f124243l.f124253i.postDelayed(new w2.c(21, this, uri), j13 - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(v7.k r68, g8.v r69) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.b.h(v7.k, g8.v):void");
    }

    @Override // l8.r
    public final void p(u uVar, long j13, long j14, int i13) {
        b bVar;
        v vVar;
        z zVar = (z) uVar;
        if (i13 == 0) {
            bVar = this;
            vVar = new v(zVar.f82100a, zVar.f82101b, j13);
        } else {
            long j15 = zVar.f82100a;
            y yVar = zVar.f82103d;
            bVar = this;
            vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        }
        bVar.f124243l.f124251g.h(vVar, zVar.f82102c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i13);
    }

    @Override // l8.r
    public final void s(u uVar, long j13, long j14, boolean z13) {
        z zVar = (z) uVar;
        long j15 = zVar.f82100a;
        y yVar = zVar.f82103d;
        v vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        c cVar = this.f124243l;
        cVar.f124247c.getClass();
        cVar.f124251g.c(vVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
