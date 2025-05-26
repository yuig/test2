package n8;

import a7.o0;
import a7.o1;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.q4;
import d7.n0;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f89759a;

    /* renamed from: b, reason: collision with root package name */
    public final x f89760b;

    /* renamed from: k, reason: collision with root package name */
    public long f89769k;

    /* renamed from: c, reason: collision with root package name */
    public final h6.c0 f89761c = new h6.c0();

    /* renamed from: d, reason: collision with root package name */
    public final d7.j0 f89762d = new d7.j0();

    /* renamed from: e, reason: collision with root package name */
    public final d7.j0 f89763e = new d7.j0();

    /* renamed from: f, reason: collision with root package name */
    public final d7.v f89764f = new d7.v(16);

    /* renamed from: g, reason: collision with root package name */
    public long f89765g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public o1 f89768j = o1.f1158d;

    /* renamed from: h, reason: collision with root package name */
    public long f89766h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f89767i = -9223372036854775807L;

    public c0(q4 q4Var, x xVar) {
        this.f89759a = q4Var;
        this.f89760b = xVar;
    }

    public final void a(long j13, long j14) {
        while (true) {
            d7.v vVar = this.f89764f;
            int i13 = vVar.f53893c;
            if (i13 == 0) {
                return;
            }
            if (i13 == 0) {
                throw new NoSuchElementException();
            }
            long j15 = ((long[]) vVar.f53895e)[vVar.f53891a];
            Long l13 = (Long) this.f89763e.i(j15);
            x xVar = this.f89760b;
            if (l13 != null && l13.longValue() != this.f89769k) {
                this.f89769k = l13.longValue();
                xVar.d(2);
            }
            int a13 = this.f89760b.a(j15, j13, j14, this.f89769k, false, false, this.f89761c);
            b0 b0Var = this.f89759a;
            if (a13 == 0 || a13 == 1) {
                this.f89766h = j15;
                final int i14 = 0;
                boolean z13 = a13 == 0;
                long e13 = vVar.e();
                o1 o1Var = (o1) this.f89762d.i(e13);
                if (o1Var != null && !o1Var.equals(o1.f1158d) && !o1Var.equals(this.f89768j)) {
                    this.f89768j = o1Var;
                    q4 q4Var = (q4) b0Var;
                    q4Var.getClass();
                    a7.q qVar = new a7.q();
                    qVar.f1188u = o1Var.f1159a;
                    qVar.f1189v = o1Var.f1160b;
                    qVar.f1181n = o0.r("video/raw");
                    q4Var.f31594b = new androidx.media3.common.b(qVar);
                    ((c) q4Var.f31595c).f89757j.execute(new w2.c(26, q4Var, o1Var));
                }
                long j16 = z13 ? -1L : this.f89761c.f67703b;
                r5 = xVar.f89908e == 3 ? 0 : 1;
                xVar.f89908e = 3;
                ((d7.g0) xVar.f89915l).getClass();
                xVar.f89910g = n0.X(SystemClock.elapsedRealtime());
                final q4 q4Var2 = (q4) b0Var;
                if (r5 != 0) {
                    c cVar = (c) q4Var2.f31595c;
                    if (cVar.f89752e != null) {
                        cVar.f89757j.execute(new Runnable() { // from class: n8.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i15 = i14;
                                q4 q4Var3 = q4Var2;
                                switch (i15) {
                                    case 0:
                                        ((c) q4Var3.f31595c).f89756i.c();
                                        break;
                                    default:
                                        ((c) q4Var3.f31595c).f89756i.v();
                                        break;
                                }
                            }
                        });
                    }
                }
                androidx.media3.common.b bVar = (androidx.media3.common.b) q4Var2.f31594b;
                androidx.media3.common.b bVar2 = bVar == null ? new androidx.media3.common.b(new a7.q()) : bVar;
                c cVar2 = (c) q4Var2.f31595c;
                v vVar2 = cVar2.f89758k;
                ((d7.g0) cVar2.f89749b).getClass();
                vVar2.d(e13, System.nanoTime(), bVar2, null);
                ((k0) ((c) q4Var2.f31595c).f89751d.remove()).a(j16);
            } else if (a13 == 2 || a13 == 3) {
                this.f89766h = j15;
                vVar.e();
                final q4 q4Var3 = (q4) b0Var;
                ((c) q4Var3.f31595c).f89757j.execute(new Runnable() { // from class: n8.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15 = r2;
                        q4 q4Var32 = q4Var3;
                        switch (i15) {
                            case 0:
                                ((c) q4Var32.f31595c).f89756i.c();
                                break;
                            default:
                                ((c) q4Var32.f31595c).f89756i.v();
                                break;
                        }
                    }
                });
                ((k0) ((c) q4Var3.f31595c).f89751d.remove()).b();
            } else {
                if (a13 != 4) {
                    if (a13 != 5) {
                        throw new IllegalStateException(String.valueOf(a13));
                    }
                    return;
                }
                this.f89766h = j15;
            }
        }
    }
}
