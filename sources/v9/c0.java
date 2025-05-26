package v9;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.k0;
import d7.n0;

/* loaded from: classes3.dex */
public final class c0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f124515a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.d0 f124516b = new d7.d0(32);

    /* renamed from: c, reason: collision with root package name */
    public int f124517c;

    /* renamed from: d, reason: collision with root package name */
    public int f124518d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f124519e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f124520f;

    public c0(b0 b0Var) {
        this.f124515a = b0Var;
    }

    @Override // v9.i0
    public final void a(k0 k0Var, q8.u uVar, h0 h0Var) {
        this.f124515a.a(k0Var, uVar, h0Var);
        this.f124520f = true;
    }

    @Override // v9.i0
    public final void b(int i13, d7.d0 d0Var) {
        boolean z13 = (i13 & 1) != 0;
        int y13 = z13 ? d0Var.f53807b + d0Var.y() : -1;
        if (this.f124520f) {
            if (!z13) {
                return;
            }
            this.f124520f = false;
            d0Var.K(y13);
            this.f124518d = 0;
        }
        while (d0Var.a() > 0) {
            int i14 = this.f124518d;
            d7.d0 d0Var2 = this.f124516b;
            if (i14 < 3) {
                if (i14 == 0) {
                    int y14 = d0Var.y();
                    d0Var.K(d0Var.f53807b - 1);
                    if (y14 == 255) {
                        this.f124520f = true;
                        return;
                    }
                }
                int min = Math.min(d0Var.a(), 3 - this.f124518d);
                d0Var.i(d0Var2.f53806a, this.f124518d, min);
                int i15 = this.f124518d + min;
                this.f124518d = i15;
                if (i15 == 3) {
                    d0Var2.K(0);
                    d0Var2.J(3);
                    d0Var2.L(1);
                    int y15 = d0Var2.y();
                    int y16 = d0Var2.y();
                    this.f124519e = (y15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
                    int i16 = (((y15 & 15) << 8) | y16) + 3;
                    this.f124517c = i16;
                    byte[] bArr = d0Var2.f53806a;
                    if (bArr.length < i16) {
                        d0Var2.b(Math.min(4098, Math.max(i16, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(d0Var.a(), this.f124517c - this.f124518d);
                d0Var.i(d0Var2.f53806a, this.f124518d, min2);
                int i17 = this.f124518d + min2;
                this.f124518d = i17;
                int i18 = this.f124517c;
                if (i17 != i18) {
                    continue;
                } else {
                    if (!this.f124519e) {
                        d0Var2.J(i18);
                    } else {
                        if (n0.m(0, i18, -1, d0Var2.f53806a) != 0) {
                            this.f124520f = true;
                            return;
                        }
                        d0Var2.J(this.f124517c - 4);
                    }
                    d0Var2.K(0);
                    this.f124515a.e(d0Var2);
                    this.f124518d = 0;
                }
            }
        }
    }

    @Override // v9.i0
    public final void f() {
        this.f124520f = true;
    }
}
