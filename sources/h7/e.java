package h7;

import android.net.Uri;
import androidx.media3.datasource.cache.Cache$CacheException;
import d7.n0;
import g7.a0;
import g7.z;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements g7.f {

    /* renamed from: a, reason: collision with root package name */
    public final a f67867a;

    /* renamed from: b, reason: collision with root package name */
    public final g7.f f67868b;

    /* renamed from: c, reason: collision with root package name */
    public final z f67869c;

    /* renamed from: d, reason: collision with root package name */
    public final g7.f f67870d;

    /* renamed from: e, reason: collision with root package name */
    public final i f67871e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f67872f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f67873g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f67874h;

    /* renamed from: i, reason: collision with root package name */
    public Uri f67875i;

    /* renamed from: j, reason: collision with root package name */
    public g7.i f67876j;

    /* renamed from: k, reason: collision with root package name */
    public g7.i f67877k;

    /* renamed from: l, reason: collision with root package name */
    public g7.f f67878l;

    /* renamed from: m, reason: collision with root package name */
    public long f67879m;

    /* renamed from: n, reason: collision with root package name */
    public long f67880n;

    /* renamed from: o, reason: collision with root package name */
    public long f67881o;

    /* renamed from: p, reason: collision with root package name */
    public x f67882p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f67883q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f67884r;

    /* renamed from: s, reason: collision with root package name */
    public long f67885s;

    public e(a aVar, g7.f fVar, g7.f fVar2, c cVar, int i13) {
        c3.e eVar = i.f67891wo;
        this.f67867a = aVar;
        this.f67868b = fVar2;
        this.f67871e = eVar;
        this.f67872f = (i13 & 1) != 0;
        this.f67873g = (i13 & 2) != 0;
        this.f67874h = (i13 & 4) != 0;
        if (fVar != null) {
            this.f67870d = fVar;
            this.f67869c = cVar != null ? new z(fVar, cVar) : null;
        } else {
            this.f67870d = g7.u.f63839a;
            this.f67869c = null;
        }
    }

    @Override // g7.f
    public final void close() {
        this.f67876j = null;
        this.f67875i = null;
        this.f67880n = 0L;
        try {
            t();
        } catch (Throwable th3) {
            u(th3);
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x002e, B:12:0x0041, B:15:0x004e, B:19:0x005e, B:21:0x0064, B:24:0x008d, B:27:0x0099, B:28:0x0095, B:29:0x009b, B:37:0x00ab, B:39:0x00a5, B:40:0x0069, B:42:0x0079, B:45:0x0081, B:46:0x0088, B:47:0x0053, B:52:0x003a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x002e, B:12:0x0041, B:15:0x004e, B:19:0x005e, B:21:0x0064, B:24:0x008d, B:27:0x0099, B:28:0x0095, B:29:0x009b, B:37:0x00ab, B:39:0x00a5, B:40:0x0069, B:42:0x0079, B:45:0x0081, B:46:0x0088, B:47:0x0053, B:52:0x003a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {all -> 0x0067, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x002e, B:12:0x0041, B:15:0x004e, B:19:0x005e, B:21:0x0064, B:24:0x008d, B:27:0x0099, B:28:0x0095, B:29:0x009b, B:37:0x00ab, B:39:0x00a5, B:40:0x0069, B:42:0x0079, B:45:0x0081, B:46:0x0088, B:47:0x0053, B:52:0x003a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069 A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:3:0x0002, B:5:0x000c, B:7:0x002e, B:12:0x0041, B:15:0x004e, B:19:0x005e, B:21:0x0064, B:24:0x008d, B:27:0x0099, B:28:0x0095, B:29:0x009b, B:37:0x00ab, B:39:0x00a5, B:40:0x0069, B:42:0x0079, B:45:0x0081, B:46:0x0088, B:47:0x0053, B:52:0x003a), top: B:2:0x0002 }] */
    @Override // g7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(g7.i r14) {
        /*
            r13 = this;
            h7.a r0 = r13.f67867a
            h7.i r1 = r13.f67871e     // Catch: java.lang.Throwable -> L67
            c3.e r1 = (c3.e) r1     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.k(r14)     // Catch: java.lang.Throwable -> L67
            long r2 = r14.f63791f
            g7.h r4 = r14.a()     // Catch: java.lang.Throwable -> L67
            r4.f63783h = r1     // Catch: java.lang.Throwable -> L67
            g7.i r4 = r4.a()     // Catch: java.lang.Throwable -> L67
            r13.f67876j = r4     // Catch: java.lang.Throwable -> L67
            android.net.Uri r5 = r4.f63786a     // Catch: java.lang.Throwable -> L67
            r6 = r0
            h7.w r6 = (h7.w) r6     // Catch: java.lang.Throwable -> L67
            h7.s r6 = r6.i(r1)     // Catch: java.lang.Throwable -> L67
            java.util.Map r6 = r6.f67929b     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = "exo_redir"
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L67
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> L67
            r7 = 0
            if (r6 == 0) goto L36
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L67
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L67
            r8.<init>(r6, r9)     // Catch: java.lang.Throwable -> L67
            goto L37
        L36:
            r8 = r7
        L37:
            if (r8 != 0) goto L3a
            goto L3e
        L3a:
            android.net.Uri r7 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L67
        L3e:
            if (r7 == 0) goto L41
            r5 = r7
        L41:
            r13.f67875i = r5     // Catch: java.lang.Throwable -> L67
            r13.f67880n = r2     // Catch: java.lang.Throwable -> L67
            boolean r5 = r13.f67873g     // Catch: java.lang.Throwable -> L67
            r6 = 0
            r7 = -1
            long r9 = r14.f63792g
            if (r5 == 0) goto L53
            boolean r14 = r13.f67883q     // Catch: java.lang.Throwable -> L67
            if (r14 == 0) goto L53
            goto L5b
        L53:
            boolean r14 = r13.f67874h     // Catch: java.lang.Throwable -> L67
            if (r14 == 0) goto L5d
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 != 0) goto L5d
        L5b:
            r14 = 1
            goto L5e
        L5d:
            r14 = r6
        L5e:
            r13.f67884r = r14     // Catch: java.lang.Throwable -> L67
            r11 = 0
            if (r14 == 0) goto L69
            r13.f67881o = r7     // Catch: java.lang.Throwable -> L67
            goto L89
        L67:
            r14 = move-exception
            goto Lae
        L69:
            h7.w r0 = (h7.w) r0     // Catch: java.lang.Throwable -> L67
            h7.s r14 = r0.i(r1)     // Catch: java.lang.Throwable -> L67
            long r0 = h7.r.a(r14)     // Catch: java.lang.Throwable -> L67
            r13.f67881o = r0     // Catch: java.lang.Throwable -> L67
            int r14 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r14 == 0) goto L89
            long r0 = r0 - r2
            r13.f67881o = r0     // Catch: java.lang.Throwable -> L67
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 < 0) goto L81
            goto L89
        L81:
            androidx.media3.datasource.DataSourceException r14 = new androidx.media3.datasource.DataSourceException     // Catch: java.lang.Throwable -> L67
            r0 = 2008(0x7d8, float:2.814E-42)
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L67
            throw r14     // Catch: java.lang.Throwable -> L67
        L89:
            int r14 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r14 == 0) goto L9b
            long r0 = r13.f67881o     // Catch: java.lang.Throwable -> L67
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L95
            r0 = r9
            goto L99
        L95:
            long r0 = java.lang.Math.min(r0, r9)     // Catch: java.lang.Throwable -> L67
        L99:
            r13.f67881o = r0     // Catch: java.lang.Throwable -> L67
        L9b:
            long r0 = r13.f67881o     // Catch: java.lang.Throwable -> L67
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto La5
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto La8
        La5:
            r13.w(r4, r6)     // Catch: java.lang.Throwable -> L67
        La8:
            if (r14 == 0) goto Lab
            goto Lad
        Lab:
            long r9 = r13.f67881o     // Catch: java.lang.Throwable -> L67
        Lad:
            return r9
        Lae:
            r13.u(r14)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.e.d(g7.i):long");
    }

    @Override // g7.f
    public final Map e() {
        return (this.f67878l == this.f67868b) ^ true ? this.f67870d.e() : Collections.emptyMap();
    }

    @Override // g7.f
    public final void f(a0 a0Var) {
        a0Var.getClass();
        this.f67868b.f(a0Var);
        this.f67870d.f(a0Var);
    }

    @Override // g7.f
    public final Uri r() {
        return this.f67875i;
    }

    @Override // a7.k
    public final int read(byte[] bArr, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        if (this.f67881o == 0) {
            return -1;
        }
        g7.i iVar = this.f67876j;
        iVar.getClass();
        g7.i iVar2 = this.f67877k;
        iVar2.getClass();
        try {
            if (this.f67880n >= this.f67885s) {
                w(iVar, true);
            }
            g7.f fVar = this.f67878l;
            fVar.getClass();
            int read = fVar.read(bArr, i13, i14);
            if (read == -1) {
                if (!(this.f67878l == this.f67868b)) {
                    long j13 = iVar2.f63792g;
                    if (j13 == -1 || this.f67879m < j13) {
                        String str = iVar.f63793h;
                        int i15 = n0.f53866a;
                        x(str);
                    }
                }
                long j14 = this.f67881o;
                if (j14 <= 0) {
                    if (j14 == -1) {
                    }
                }
                t();
                w(iVar, false);
                return read(bArr, i13, i14);
            }
            long j15 = read;
            this.f67880n += j15;
            this.f67879m += j15;
            long j16 = this.f67881o;
            if (j16 != -1) {
                this.f67881o = j16 - j15;
            }
            return read;
        } catch (Throwable th3) {
            u(th3);
            throw th3;
        }
    }

    public final void t() {
        a aVar = this.f67867a;
        g7.f fVar = this.f67878l;
        if (fVar == null) {
            return;
        }
        try {
            fVar.close();
        } finally {
            this.f67877k = null;
            this.f67878l = null;
            x xVar = this.f67882p;
            if (xVar != null) {
                ((w) aVar).n(xVar);
                this.f67882p = null;
            }
        }
    }

    public final void u(Throwable th3) {
        if (this.f67878l == this.f67868b || (th3 instanceof Cache$CacheException)) {
            this.f67883q = true;
        }
    }

    public final boolean v() {
        return this.f67878l == this.f67870d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [g7.f] */
    /* JADX WARN: Type inference failed for: r7v2, types: [g7.f] */
    public final void w(g7.i iVar, boolean z13) {
        x s13;
        z zVar;
        a aVar;
        g7.i a13;
        z zVar2;
        int i13 = n0.f53866a;
        boolean z14 = this.f67884r;
        String str = iVar.f63793h;
        a aVar2 = this.f67867a;
        if (z14) {
            s13 = null;
        } else if (this.f67872f) {
            try {
                s13 = ((w) aVar2).s(str, this.f67880n, this.f67881o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            s13 = ((w) aVar2).t(str, this.f67880n, this.f67881o);
        }
        z zVar3 = this.f67869c;
        ?? r43 = this.f67868b;
        ?? r73 = this.f67870d;
        if (s13 == null) {
            g7.h a14 = iVar.a();
            a14.f63781f = this.f67880n;
            a14.f63782g = this.f67881o;
            a13 = a14.a();
            zVar = zVar3;
            zVar2 = r73;
            aVar = aVar2;
        } else {
            boolean z15 = s13.f67895d;
            long j13 = s13.f67894c;
            if (z15) {
                Uri fromFile = Uri.fromFile(s13.f67896e);
                long j14 = this.f67880n;
                aVar = aVar2;
                long j15 = s13.f67893b;
                long j16 = j14 - j15;
                long j17 = j13 - j16;
                x xVar = s13;
                zVar = zVar3;
                long j18 = this.f67881o;
                if (j18 != -1) {
                    j17 = Math.min(j17, j18);
                }
                g7.h a15 = iVar.a();
                a15.f63776a = fromFile;
                a15.f63777b = j15;
                a15.f63781f = j16;
                a15.f63782g = j17;
                a13 = a15.a();
                zVar2 = r43;
                s13 = xVar;
            } else {
                x xVar2 = s13;
                zVar = zVar3;
                aVar = aVar2;
                if (j13 == -1) {
                    j13 = this.f67881o;
                } else {
                    long j19 = this.f67881o;
                    if (j19 != -1) {
                        j13 = Math.min(j13, j19);
                    }
                }
                g7.h a16 = iVar.a();
                a16.f63781f = this.f67880n;
                a16.f63782g = j13;
                a13 = a16.a();
                if (zVar != null) {
                    s13 = xVar2;
                    zVar2 = zVar;
                } else {
                    ((w) aVar).n(xVar2);
                    zVar2 = r73;
                    s13 = null;
                }
            }
        }
        this.f67885s = (this.f67884r || zVar2 != r73) ? Long.MAX_VALUE : this.f67880n + 102400;
        if (z13) {
            bf.b.t(v());
            if (zVar2 == r73) {
                return;
            }
            try {
                t();
            } finally {
            }
        }
        if (s13 != null && (!s13.f67895d)) {
            this.f67882p = s13;
        }
        this.f67878l = zVar2;
        this.f67877k = a13;
        this.f67879m = 0L;
        long d2 = zVar2.d(a13);
        tb.l lVar = new tb.l(2);
        if (a13.f63792g == -1 && d2 != -1) {
            this.f67881o = d2;
            lVar.c(Long.valueOf(this.f67880n + d2), "exo_len");
        }
        if (!(this.f67878l == r43)) {
            Uri r13 = zVar2.r();
            this.f67875i = r13;
            Uri uri = iVar.f63786a.equals(r13) ^ true ? this.f67875i : null;
            if (uri == null) {
                ((List) lVar.f116987c).add("exo_redir");
                ((Map) lVar.f116986b).remove("exo_redir");
            } else {
                lVar.c(uri.toString(), "exo_redir");
            }
        }
        if (this.f67878l == zVar) {
            ((w) aVar).c(lVar, str);
        }
    }

    public final void x(String str) {
        this.f67881o = 0L;
        if (this.f67878l == this.f67869c) {
            tb.l lVar = new tb.l(2);
            lVar.c(Long.valueOf(this.f67880n), "exo_len");
            ((w) this.f67867a).c(lVar, str);
        }
    }
}
