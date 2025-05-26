package w7;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayDeque;
import m7.h;

/* loaded from: classes.dex */
public final class g extends h {
    public int A;
    public androidx.media3.common.b B;
    public b C;
    public k7.e D;
    public ImageOutput E;
    public Bitmap F;
    public boolean G;
    public f H;
    public f I;

    /* renamed from: J, reason: collision with root package name */
    public int f128145J;
    public boolean K;

    /* renamed from: r, reason: collision with root package name */
    public final c f128146r;

    /* renamed from: s, reason: collision with root package name */
    public final k7.e f128147s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayDeque f128148t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f128149u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f128150v;

    /* renamed from: w, reason: collision with root package name */
    public e f128151w;

    /* renamed from: x, reason: collision with root package name */
    public long f128152x;

    /* renamed from: y, reason: collision with root package name */
    public long f128153y;

    /* renamed from: z, reason: collision with root package name */
    public int f128154z;

    public g(h1.b bVar) {
        super(4);
        this.f128146r = bVar;
        this.E = ImageOutput.f18823a;
        this.f128147s = new k7.e(0);
        this.f128151w = e.f128139c;
        this.f128148t = new ArrayDeque();
        this.f128153y = -9223372036854775807L;
        this.f128152x = -9223372036854775807L;
        this.f128154z = 0;
        this.A = 1;
    }

    @Override // m7.h
    public final void A(long j13, long j14) {
        if (this.f128150v) {
            return;
        }
        if (this.B == null) {
            qq2.c cVar = this.f86172c;
            cVar.c();
            k7.e eVar = this.f128147s;
            eVar.n();
            int z13 = z(cVar, eVar, 2);
            if (z13 != -5) {
                if (z13 == -4) {
                    bf.b.t(eVar.i(4));
                    this.f128149u = true;
                    this.f128150v = true;
                    return;
                }
                return;
            }
            androidx.media3.common.b bVar = (androidx.media3.common.b) cVar.f104884c;
            bf.b.w(bVar);
            this.B = bVar;
            this.K = true;
        }
        if (this.C == null) {
            J();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (H(j13)) {
            }
            while (I(j13)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e13) {
            throw g(4003, null, e13, false);
        }
    }

    @Override // m7.h
    public final int F(androidx.media3.common.b bVar) {
        return ((h1.b) this.f128146r).l(bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x013b, code lost:
    
        if (r14.f128142a == ((r0.M * r1.L) - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e7, code lost:
    
        if (r3 == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H(long r13) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.g.H(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0115, code lost:
    
        if (r4 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(long r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.g.I(long):boolean");
    }

    public final void J() {
        if (this.K) {
            androidx.media3.common.b bVar = this.B;
            bVar.getClass();
            h1.b bVar2 = (h1.b) this.f128146r;
            int l13 = bVar2.l(bVar);
            if (l13 != h.f(4, 0, 0, 0) && l13 != h.f(3, 0, 0, 0)) {
                throw g(4005, this.B, new ImageDecoderException("Provided decoder factory can't create decoder for format."), false);
            }
            b bVar3 = this.C;
            if (bVar3 != null) {
                bVar3.a();
            }
            this.C = new b((c3.e) bVar2.f66449b);
            this.K = false;
        }
    }

    public final void K() {
        this.D = null;
        this.f128154z = 0;
        this.f128153y = -9223372036854775807L;
        b bVar = this.C;
        if (bVar != null) {
            bVar.a();
            this.C = null;
        }
    }

    public final void L(ImageOutput imageOutput) {
        if (imageOutput == null) {
            imageOutput = ImageOutput.f18823a;
        }
        this.E = imageOutput;
    }

    @Override // m7.h, m7.q1
    public final void b(int i13, Object obj) {
        if (i13 != 15) {
            return;
        }
        L(obj instanceof ImageOutput ? (ImageOutput) obj : null);
    }

    @Override // m7.h
    public final String m() {
        return "ImageRenderer";
    }

    @Override // m7.h
    public final boolean o() {
        return this.f128150v;
    }

    @Override // m7.h
    public final boolean q() {
        int i13 = this.A;
        return i13 == 3 || (i13 == 0 && this.G);
    }

    @Override // m7.h
    public final void r() {
        this.B = null;
        this.f128151w = e.f128139c;
        this.f128148t.clear();
        K();
        this.E.a();
    }

    @Override // m7.h
    public final void s(boolean z13, boolean z14) {
        this.A = z14 ? 1 : 0;
    }

    @Override // m7.h
    public final void t(long j13, boolean z13) {
        this.A = Math.min(this.A, 1);
        this.f128150v = false;
        this.f128149u = false;
        this.F = null;
        this.H = null;
        this.I = null;
        this.G = false;
        this.D = null;
        b bVar = this.C;
        if (bVar != null) {
            bVar.flush();
        }
        this.f128148t.clear();
    }

    @Override // m7.h
    public final void u() {
        K();
    }

    @Override // m7.h
    public final void v() {
        K();
        this.A = Math.min(this.A, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L14;
     */
    @Override // m7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(androidx.media3.common.b[] r5, long r6, long r8, g8.e0 r10) {
        /*
            r4 = this;
            w7.e r5 = r4.f128151w
            long r5 = r5.f128141b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f128148t
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f128153y
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f128152x
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            w7.e r6 = new w7.e
            long r0 = r4.f128153y
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L38
        L31:
            w7.e r5 = new w7.e
            r5.<init>(r0, r8)
            r4.f128151w = r5
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.g.y(androidx.media3.common.b[], long, long, g8.e0):void");
    }
}
