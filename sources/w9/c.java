package w9;

import a7.o0;
import a7.q;
import androidx.media3.common.ParserException;
import d7.n0;
import java.math.RoundingMode;
import q8.k0;
import q8.t;
import q8.u;

/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final u f128498a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f128499b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.c f128500c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.common.b f128501d;

    /* renamed from: e, reason: collision with root package name */
    public final int f128502e;

    /* renamed from: f, reason: collision with root package name */
    public long f128503f;

    /* renamed from: g, reason: collision with root package name */
    public int f128504g;

    /* renamed from: h, reason: collision with root package name */
    public long f128505h;

    public c(u uVar, k0 k0Var, q8.c cVar, String str, int i13) {
        this.f128498a = uVar;
        this.f128499b = k0Var;
        this.f128500c = cVar;
        int i14 = (cVar.f102889c * cVar.f102893g) / 8;
        if (cVar.f102892f != i14) {
            StringBuilder s13 = a.a.s("Expected block size: ", i14, "; got: ");
            s13.append(cVar.f102892f);
            throw ParserException.a(s13.toString(), null);
        }
        int i15 = cVar.f102890d * i14;
        int i16 = i15 * 8;
        int max = Math.max(i14, i15 / 10);
        this.f128502e = max;
        q qVar = new q();
        qVar.f1180m = o0.r("audio/wav");
        qVar.f1181n = o0.r(str);
        qVar.f1175h = i16;
        qVar.f1176i = i16;
        qVar.f1182o = max;
        qVar.D = cVar.f102889c;
        qVar.E = cVar.f102890d;
        qVar.F = i13;
        this.f128501d = new androidx.media3.common.b(qVar);
    }

    @Override // w9.b
    public final void a(int i13, long j13) {
        this.f128498a.j(new e(this.f128500c, 1, i13, j13));
        androidx.media3.common.b bVar = this.f128501d;
        k0 k0Var = this.f128499b;
        k0Var.b(bVar);
        k0Var.getClass();
    }

    @Override // w9.b
    public final boolean b(t tVar, long j13) {
        int i13;
        int i14;
        long j14 = j13;
        while (j14 > 0 && (i13 = this.f128504g) < (i14 = this.f128502e)) {
            int e13 = this.f128499b.e(tVar, (int) Math.min(i14 - i13, j14), true);
            if (e13 == -1) {
                j14 = 0;
            } else {
                this.f128504g += e13;
                j14 -= e13;
            }
        }
        q8.c cVar = this.f128500c;
        int i15 = cVar.f102892f;
        int i16 = this.f128504g / i15;
        if (i16 > 0) {
            long j15 = this.f128503f;
            long j16 = this.f128505h;
            long j17 = cVar.f102890d;
            int i17 = n0.f53866a;
            long g03 = j15 + n0.g0(j16, 1000000L, j17, RoundingMode.DOWN);
            int i18 = i16 * i15;
            int i19 = this.f128504g - i18;
            this.f128499b.a(g03, 1, i18, i19, null);
            this.f128505h += i16;
            this.f128504g = i19;
        }
        return j14 <= 0;
    }

    @Override // w9.b
    public final void c(long j13) {
        this.f128503f = j13;
        this.f128504g = 0;
        this.f128505h = 0L;
    }
}
