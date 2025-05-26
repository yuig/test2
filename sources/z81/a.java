package z81;

import com.pinterest.framework.multisection.datasource.pagedlist.c;
import qz.f0;

/* loaded from: classes5.dex */
public final class a extends c {
    public boolean L;

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, qr0.d
    public final String g() {
        return this.f49111a + "?" + this.f49121k;
    }

    @Override // wt1.b
    public final boolean i() {
        f0 f0Var;
        return this.L && (f0Var = this.f49121k) != null && f0Var.b("query_pin");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, nr0.g
    public final boolean q(int i13) {
        return i13 == 132 || this.E.q(i13);
    }
}
