package l9;

import a7.o0;
import a7.q;
import a8.v;
import androidx.media3.common.ParserException;
import d7.d0;
import d7.n0;
import g4.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import q8.b0;
import q8.c0;
import q8.k0;
import q8.s;
import q8.t;

/* loaded from: classes3.dex */
public final class g implements s {

    /* renamed from: a, reason: collision with root package name */
    public final l f82304a;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.b f82306c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f82307d;

    /* renamed from: g, reason: collision with root package name */
    public k0 f82310g;

    /* renamed from: h, reason: collision with root package name */
    public int f82311h;

    /* renamed from: i, reason: collision with root package name */
    public int f82312i;

    /* renamed from: j, reason: collision with root package name */
    public long[] f82313j;

    /* renamed from: k, reason: collision with root package name */
    public long f82314k;

    /* renamed from: b, reason: collision with root package name */
    public final u f82305b = new u();

    /* renamed from: f, reason: collision with root package name */
    public byte[] f82309f = n0.f53868c;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f82308e = new d0();

    public g(l lVar, androidx.media3.common.b bVar) {
        androidx.media3.common.b bVar2;
        this.f82304a = lVar;
        if (bVar != null) {
            q a13 = bVar.a();
            a13.f1181n = o0.r("application/x-media3-cues");
            a13.f1177j = bVar.f18765o;
            a13.f1167J = lVar.E();
            bVar2 = new androidx.media3.common.b(a13);
        } else {
            bVar2 = null;
        }
        this.f82306c = bVar2;
        this.f82307d = new ArrayList();
        this.f82312i = 0;
        this.f82313j = n0.f53869d;
        this.f82314k = -9223372036854775807L;
    }

    @Override // q8.s
    public final void a() {
        if (this.f82312i == 5) {
            return;
        }
        this.f82304a.d();
        this.f82312i = 5;
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        int i13 = this.f82312i;
        bf.b.t((i13 == 0 || i13 == 5) ? false : true);
        this.f82314k = j14;
        if (this.f82312i == 2) {
            this.f82312i = 1;
        }
        if (this.f82312i == 4) {
            this.f82312i = 3;
        }
    }

    public final void c(f fVar) {
        bf.b.w(this.f82310g);
        byte[] bArr = fVar.f82303b;
        int length = bArr.length;
        d0 d0Var = this.f82308e;
        d0Var.getClass();
        d0Var.I(bArr.length, bArr);
        this.f82310g.d(length, 0, d0Var);
        this.f82310g.a(fVar.f82302a, 1, length, 0, null);
    }

    @Override // q8.s
    public final int d(t tVar, c0 c0Var) {
        int i13 = this.f82312i;
        bf.b.t((i13 == 0 || i13 == 5) ? false : true);
        if (this.f82312i == 1) {
            int r13 = tVar.getLength() != -1 ? d7.b.r(tVar.getLength()) : 1024;
            if (r13 > this.f82309f.length) {
                this.f82309f = new byte[r13];
            }
            this.f82311h = 0;
            this.f82312i = 2;
        }
        int i14 = this.f82312i;
        ArrayList arrayList = this.f82307d;
        if (i14 == 2) {
            byte[] bArr = this.f82309f;
            if (bArr.length == this.f82311h) {
                this.f82309f = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f82309f;
            int i15 = this.f82311h;
            int read = tVar.read(bArr2, i15, bArr2.length - i15);
            if (read != -1) {
                this.f82311h += read;
            }
            long length = tVar.getLength();
            if ((length != -1 && this.f82311h == length) || read == -1) {
                try {
                    long j13 = this.f82314k;
                    this.f82304a.w(this.f82309f, 0, this.f82311h, j13 != -9223372036854775807L ? new k(j13, true) : k.f82318c, new v(this, 4));
                    Collections.sort(arrayList);
                    this.f82313j = new long[arrayList.size()];
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        this.f82313j[i16] = ((f) arrayList.get(i16)).f82302a;
                    }
                    this.f82309f = n0.f53868c;
                    this.f82312i = 4;
                } catch (RuntimeException e13) {
                    throw ParserException.a("SubtitleParser failed.", e13);
                }
            }
        }
        if (this.f82312i == 3) {
            if (tVar.n(tVar.getLength() != -1 ? d7.b.r(tVar.getLength()) : 1024) == -1) {
                long j14 = this.f82314k;
                for (int e14 = j14 == -9223372036854775807L ? 0 : n0.e(this.f82313j, j14, true); e14 < arrayList.size(); e14++) {
                    c((f) arrayList.get(e14));
                }
                this.f82312i = 4;
            }
        }
        return this.f82312i == 4 ? -1 : 0;
    }

    @Override // q8.s
    public final void f(q8.u uVar) {
        bf.b.t(this.f82312i == 0);
        k0 D = uVar.D(0, 3);
        this.f82310g = D;
        androidx.media3.common.b bVar = this.f82306c;
        if (bVar != null) {
            D.b(bVar);
            uVar.A();
            uVar.j(new b0(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.f82312i = 1;
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        return true;
    }
}
