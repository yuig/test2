package v9;

import a7.o0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Objects;
import q8.k0;

/* loaded from: classes3.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final d7.c0 f124498a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.d0 f124499b;

    /* renamed from: c, reason: collision with root package name */
    public final String f124500c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124501d;

    /* renamed from: e, reason: collision with root package name */
    public final String f124502e;

    /* renamed from: f, reason: collision with root package name */
    public String f124503f;

    /* renamed from: g, reason: collision with root package name */
    public k0 f124504g;

    /* renamed from: h, reason: collision with root package name */
    public int f124505h;

    /* renamed from: i, reason: collision with root package name */
    public int f124506i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f124507j;

    /* renamed from: k, reason: collision with root package name */
    public long f124508k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.media3.common.b f124509l;

    /* renamed from: m, reason: collision with root package name */
    public int f124510m;

    /* renamed from: n, reason: collision with root package name */
    public long f124511n;

    public b(String str) {
        this(null, 0, str);
    }

    @Override // v9.i
    public final void e(d7.d0 d0Var) {
        bf.b.w(this.f124504g);
        while (d0Var.a() > 0) {
            int i13 = this.f124505h;
            d7.d0 d0Var2 = this.f124499b;
            if (i13 == 0) {
                while (true) {
                    if (d0Var.a() <= 0) {
                        break;
                    }
                    if (this.f124507j) {
                        int y13 = d0Var.y();
                        if (y13 == 119) {
                            this.f124507j = false;
                            this.f124505h = 1;
                            byte[] bArr = d0Var2.f53806a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f124506i = 2;
                            break;
                        }
                        this.f124507j = y13 == 11;
                    } else {
                        this.f124507j = d0Var.y() == 11;
                    }
                }
            } else if (i13 == 1) {
                byte[] bArr2 = d0Var2.f53806a;
                int min = Math.min(d0Var.a(), 128 - this.f124506i);
                d0Var.i(bArr2, this.f124506i, min);
                int i14 = this.f124506i + min;
                this.f124506i = i14;
                if (i14 == 128) {
                    d7.c0 c0Var = this.f124498a;
                    c0Var.m(0);
                    q8.c i15 = q8.b.i(c0Var);
                    androidx.media3.common.b bVar = this.f124509l;
                    if (bVar == null || i15.f102890d != bVar.E || i15.f102889c != bVar.F || !Objects.equals((String) i15.f102888b, bVar.f18765o)) {
                        a7.q qVar = new a7.q();
                        qVar.f1168a = this.f124503f;
                        qVar.f1180m = o0.r(this.f124502e);
                        qVar.f1181n = o0.r((String) i15.f102888b);
                        qVar.D = i15.f102890d;
                        qVar.E = i15.f102889c;
                        qVar.f1171d = this.f124500c;
                        qVar.f1173f = this.f124501d;
                        qVar.f1176i = i15.f102893g;
                        if ("audio/ac3".equals((String) i15.f102888b)) {
                            qVar.f1175h = i15.f102893g;
                        }
                        androidx.media3.common.b bVar2 = new androidx.media3.common.b(qVar);
                        this.f124509l = bVar2;
                        this.f124504g.b(bVar2);
                    }
                    this.f124510m = i15.f102891e;
                    this.f124508k = (i15.f102892f * 1000000) / this.f124509l.F;
                    d0Var2.K(0);
                    this.f124504g.d(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, 0, d0Var2);
                    this.f124505h = 2;
                }
            } else if (i13 == 2) {
                int min2 = Math.min(d0Var.a(), this.f124510m - this.f124506i);
                this.f124504g.d(min2, 0, d0Var);
                int i16 = this.f124506i + min2;
                this.f124506i = i16;
                if (i16 == this.f124510m) {
                    bf.b.t(this.f124511n != -9223372036854775807L);
                    this.f124504g.a(this.f124511n, 1, this.f124510m, 0, null);
                    this.f124511n += this.f124508k;
                    this.f124505h = 0;
                }
            }
        }
    }

    @Override // v9.i
    public final void f() {
        this.f124505h = 0;
        this.f124506i = 0;
        this.f124507j = false;
        this.f124511n = -9223372036854775807L;
    }

    @Override // v9.i
    public final void g(q8.u uVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f124503f = h0Var.f124635e;
        h0Var.b();
        this.f124504g = uVar.D(h0Var.f124634d, 1);
    }

    @Override // v9.i
    public final void h(boolean z13) {
    }

    @Override // v9.i
    public final void i(int i13, long j13) {
        this.f124511n = j13;
    }

    public b(String str, int i13, String str2) {
        d7.c0 c0Var = new d7.c0(new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN], 0, 0);
        this.f124498a = c0Var;
        this.f124499b = new d7.d0(c0Var.f53793b);
        this.f124505h = 0;
        this.f124511n = -9223372036854775807L;
        this.f124500c = str;
        this.f124501d = i13;
        this.f124502e = str2;
    }
}
