package v7;

import a7.o0;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import d7.n0;
import g7.y;
import g8.h0;
import g8.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l8.u;
import l8.w;
import l8.z;

/* loaded from: classes3.dex */
public final class c implements t, l8.r {

    /* renamed from: p, reason: collision with root package name */
    public static final a.e f124244p = new a.e(15);

    /* renamed from: a, reason: collision with root package name */
    public final t7.c f124245a;

    /* renamed from: b, reason: collision with root package name */
    public final q f124246b;

    /* renamed from: c, reason: collision with root package name */
    public final a10.e f124247c;

    /* renamed from: f, reason: collision with root package name */
    public final k0.a f124250f;

    /* renamed from: g, reason: collision with root package name */
    public h0 f124251g;

    /* renamed from: h, reason: collision with root package name */
    public w f124252h;

    /* renamed from: i, reason: collision with root package name */
    public Handler f124253i;

    /* renamed from: j, reason: collision with root package name */
    public s f124254j;

    /* renamed from: k, reason: collision with root package name */
    public n f124255k;

    /* renamed from: l, reason: collision with root package name */
    public Uri f124256l;

    /* renamed from: m, reason: collision with root package name */
    public k f124257m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f124258n;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f124249e = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f124248d = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public long f124259o = -9223372036854775807L;

    public c(t7.c cVar, a10.e eVar, q qVar, k0.a aVar) {
        this.f124245a = cVar;
        this.f124246b = qVar;
        this.f124247c = eVar;
        this.f124250f = aVar;
    }

    public final k a(boolean z13, Uri uri) {
        HashMap hashMap = this.f124248d;
        k kVar = ((b) hashMap.get(uri)).f124235d;
        if (kVar != null && z13) {
            if (!uri.equals(this.f124256l)) {
                List list = this.f124255k.f124332e;
                int i13 = 0;
                while (true) {
                    if (i13 >= list.size()) {
                        break;
                    }
                    if (uri.equals(((m) list.get(i13)).f124324a)) {
                        k kVar2 = this.f124257m;
                        if (kVar2 == null || !kVar2.f124312o) {
                            this.f124256l = uri;
                            b bVar = (b) hashMap.get(uri);
                            k kVar3 = bVar.f124235d;
                            if (kVar3 == null || !kVar3.f124312o) {
                                bVar.g(b(uri));
                            } else {
                                this.f124257m = kVar3;
                                ((t7.o) this.f124254j).y(kVar3);
                            }
                        }
                    } else {
                        i13++;
                    }
                }
            }
            b bVar2 = (b) hashMap.get(uri);
            k kVar4 = bVar2.f124235d;
            if (!bVar2.f124242k) {
                bVar2.f124242k = true;
                if (kVar4 != null && !kVar4.f124312o) {
                    bVar2.c(true);
                }
            }
        }
        return kVar;
    }

    public final Uri b(Uri uri) {
        g gVar;
        k kVar = this.f124257m;
        if (kVar == null || !kVar.f124319v.f124300e || (gVar = (g) kVar.f124317t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar.f124281b));
        int i13 = gVar.f124282c;
        if (i13 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i13));
        }
        return buildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i13;
        b bVar = (b) this.f124248d.get(uri);
        if (bVar.f124235d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, n0.o0(bVar.f124235d.f124318u));
        k kVar = bVar.f124235d;
        return kVar.f124312o || (i13 = kVar.f124301d) == 2 || i13 == 1 || bVar.f124236e + max > elapsedRealtime;
    }

    @Override // l8.r
    public final void d(u uVar, long j13, long j14) {
        n nVar;
        z zVar = (z) uVar;
        o oVar = (o) zVar.f82105f;
        boolean z13 = oVar instanceof k;
        if (z13) {
            String str = oVar.f124341a;
            n nVar2 = n.f124330n;
            Uri parse = Uri.parse(str);
            a7.q qVar = new a7.q();
            qVar.f1168a = "0";
            qVar.f1180m = o0.r("application/x-mpegURL");
            nVar = new n("", Collections.emptyList(), Collections.singletonList(new m(parse, new androidx.media3.common.b(qVar), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            nVar = (n) oVar;
        }
        this.f124255k = nVar;
        this.f124256l = ((m) nVar.f124332e.get(0)).f124324a;
        this.f124249e.add(new a(this));
        List list = nVar.f124331d;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Uri uri = (Uri) list.get(i13);
            this.f124248d.put(uri, new b(this, uri));
        }
        y yVar = zVar.f82103d;
        v vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        b bVar = (b) this.f124248d.get(this.f124256l);
        if (z13) {
            bVar.h((k) oVar, vVar);
        } else {
            bVar.c(false);
        }
        this.f124247c.getClass();
        this.f124251g.d(vVar, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    @Override // l8.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l8.s e(l8.u r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            l8.z r5 = (l8.z) r5
            g8.v r6 = new g8.v
            long r0 = r5.f82100a
            g7.y r7 = r5.f82103d
            android.net.Uri r0 = r7.f63853c
            java.util.Map r7 = r7.f63854d
            r6.<init>(r0, r7, r8)
            a10.e r7 = r4.f124247c
            r7.getClass()
            boolean r7 = r10 instanceof androidx.media3.common.ParserException
            r8 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L4d
            boolean r7 = r10 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L4d
            boolean r7 = r10 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r7 != 0) goto L4d
            boolean r7 = r10 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r7 != 0) goto L4d
            int r7 = androidx.media3.datasource.DataSourceException.f18777b
            r7 = r10
        L2d:
            if (r7 == 0) goto L42
            boolean r9 = r7 instanceof androidx.media3.datasource.DataSourceException
            if (r9 == 0) goto L3d
            r9 = r7
            androidx.media3.datasource.DataSourceException r9 = (androidx.media3.datasource.DataSourceException) r9
            int r9 = r9.f18778a
            r2 = 2008(0x7d8, float:2.814E-42)
            if (r9 != r2) goto L3d
            goto L4d
        L3d:
            java.lang.Throwable r7 = r7.getCause()
            goto L2d
        L42:
            int r11 = r11 - r8
            int r11 = r11 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r11, r7)
            long r2 = (long) r7
            goto L4e
        L4d:
            r2 = r0
        L4e:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r9 = 0
            if (r7 != 0) goto L54
            goto L55
        L54:
            r8 = r9
        L55:
            g8.h0 r7 = r4.f124251g
            int r5 = r5.f82102c
            r7.g(r6, r5, r10, r8)
            if (r8 == 0) goto L61
            l8.s r5 = l8.w.f82096f
            goto L66
        L61:
            l8.s r5 = new l8.s
            r5.<init>(r9, r2)
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.c.e(l8.u, long, long, java.io.IOException, int):l8.s");
    }

    @Override // l8.r
    public final void p(u uVar, long j13, long j14, int i13) {
        c cVar;
        v vVar;
        z zVar = (z) uVar;
        if (i13 == 0) {
            cVar = this;
            vVar = new v(zVar.f82100a, zVar.f82101b, j13);
        } else {
            long j15 = zVar.f82100a;
            y yVar = zVar.f82103d;
            cVar = this;
            vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        }
        cVar.f124251g.h(vVar, zVar.f82102c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i13);
    }

    @Override // l8.r
    public final void s(u uVar, long j13, long j14, boolean z13) {
        z zVar = (z) uVar;
        long j15 = zVar.f82100a;
        y yVar = zVar.f82103d;
        v vVar = new v(yVar.f63853c, yVar.f63854d, j14);
        this.f124247c.getClass();
        this.f124251g.c(vVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
