package j81;

import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.visual.flashlight.datasource.FlashlightRetrofitPagedRemoteRequest;
import dl1.s;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import m60.g0;
import qz.f0;
import s71.u;
import xk2.k;
import z32.m0;

/* loaded from: classes5.dex */
public final class e extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public final i81.e L;
    public boolean M;
    public final String N;
    public final String O;
    public final String P;
    public final boolean Q;
    public final k R;
    public boolean S;
    public String T;
    public String U;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(java.lang.String r35, uk1.d r36, nx.f0 r37, wa2.i r38, uj2.q r39, yk1.v r40, nr0.l r41, sq0.f r42, k81.k r43, lh0.f4 r44, i81.e r45, boolean r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, boolean r51, lb0.r r52, boolean r53, int r54) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j81.e.<init>(java.lang.String, uk1.d, nx.f0, wa2.i, uj2.q, yk1.v, nr0.l, sq0.f, k81.k, lh0.f4, i81.e, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, lb0.r, boolean, int):void");
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final com.pinterest.hairball.network.e M(r requestState) {
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        return new FlashlightRetrofitPagedRemoteRequest(this.f49132v, this.f49116f, this.f49115e, this.f49117g, this.f49118h, this.f49120j, this.Q);
    }

    public final void f0() {
        f0 f0Var = this.f49121k;
        if (f0Var != null) {
            if (f0Var.b("domains")) {
                f0Var.h("domains");
            }
            if (f0Var.b("price_max")) {
                f0Var.h("price_max");
            }
            if (f0Var.b("price_min")) {
                f0Var.h("price_min");
            }
            if (f0Var.b("categories")) {
                f0Var.h("categories");
            }
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, qr0.d
    public final String g() {
        return this.f49111a + "?" + this.f49121k;
    }

    public final void g0(Integer num) {
        f0 f0Var = this.f49121k;
        if (f0Var != null) {
            f0Var.c(num.intValue(), "crop_source");
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        s item = getItem(i13);
        boolean z13 = item instanceof vh;
        nr0.k kVar = this.E;
        if (!z13) {
            return kVar.getItemViewType(i13);
        }
        vh vhVar = (vh) item;
        m0 m0Var = vhVar.f42868z;
        int i14 = m0Var == null ? -1 : d.f74935a[m0Var.ordinal()];
        if (i14 == 1) {
            return RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE;
        }
        if (i14 == 2 && Intrinsics.d(vhVar.q(), "related_domain_carousel")) {
            return 91;
        }
        return kVar.getItemViewType(i13);
    }

    public final void h0(Float f13) {
        f0 f0Var = this.f49121k;
        if (f0Var != null) {
            f0Var.d(f13, "h");
        }
    }

    @Override // wt1.b
    public final boolean i() {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        f0 f0Var4;
        f0 f0Var5;
        return this.S && (f0Var = this.f49121k) != null && f0Var.b("x") && (f0Var2 = this.f49121k) != null && f0Var2.b("y") && (f0Var3 = this.f49121k) != null && f0Var3.b("w") && (f0Var4 = this.f49121k) != null && f0Var4.b("h") && (f0Var5 = this.f49121k) != null && f0Var5.b("request_source");
    }

    public final void i0(String str) {
        if (str == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.h("filters");
            }
        } else {
            f0 f0Var2 = this.f49121k;
            if (f0Var2 != null) {
                f0Var2.e("filters", str);
            }
        }
        this.U = str;
    }

    public final void j0(String str) {
        if (str == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.h("journey_depth");
                return;
            }
            return;
        }
        f0 f0Var2 = this.f49121k;
        if (f0Var2 != null) {
            f0Var2.e("journey_depth", str);
        }
    }

    public final void k0(String str) {
        if (str == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.h("hybrid_search_param");
                return;
            }
            return;
        }
        f0 f0Var2 = this.f49121k;
        if (f0Var2 != null) {
            f0Var2.e("hybrid_search_param", str);
        }
    }

    public final void m0(String str) {
        if (str == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.e("search_query", this.N);
            }
        } else {
            f0 f0Var2 = this.f49121k;
            if (f0Var2 != null) {
                f0Var2.e("search_query", str);
            }
        }
        this.T = str;
    }

    public final void o0(String str) {
        if (str == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.h("source_module_id");
                return;
            }
            return;
        }
        f0 f0Var2 = this.f49121k;
        if (f0Var2 != null) {
            f0Var2.e("source_module_id", str);
        }
    }

    public final void p0(String str) {
        if (str != null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.e("entrypoint", str);
                return;
            }
            return;
        }
        f0 f0Var2 = this.f49121k;
        if (f0Var2 != null) {
            f0Var2.h("entrypoint");
        }
        f0 f0Var3 = this.f49121k;
        if (!this.M || f0Var3 == null) {
            return;
        }
        f0Var3.e("entrypoint", "shop_the_look_module");
    }

    public final void q0(HashMap hashMap) {
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(this.M ? n00.c.UNIFIED_FLASHLIGHT_SHOPPING_FIELDS : n00.c.DEFAULT_PIN_FEED));
        String str = "flashlight";
        f0Var.e("entry_source", "flashlight");
        int i13 = d.f74936b[this.L.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "p2z";
        }
        f0Var.e("entry_source", str);
        f0Var.e("entrysource", str);
        f0Var.d(Boolean.valueOf(this.M), "is_shopping");
        f0Var.e("search_query", this.N);
        f0Var.e("source", this.O);
        if (this.M) {
            f0Var.e("entrypoint", "shop_the_look_module");
        }
        if (this.M) {
            String str2 = this.P;
            if (str2.length() > 0) {
                f0Var.e("request_params", str2);
            }
        }
        f0Var.e("image_header_links_count", "6");
        f0Var.e("page_size", ((g0) this.R.getValue()).d());
        f0Var.f(hashMap);
        this.f49121k = f0Var;
    }

    public final void r0(u uVar) {
        if (uVar == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.h("request_source");
                return;
            }
            return;
        }
        f0 f0Var2 = this.f49121k;
        if (f0Var2 != null) {
            f0Var2.c(uVar.getValue(), "request_source");
        }
    }

    public final void s0(Float f13) {
        f0 f0Var = this.f49121k;
        if (f0Var != null) {
            f0Var.d(f13, "w");
        }
    }

    public final void u0(Float f13) {
        f0 f0Var = this.f49121k;
        if (f0Var != null) {
            f0Var.d(f13, "x");
        }
    }

    public final void v0(Float f13) {
        f0 f0Var = this.f49121k;
        if (f0Var != null) {
            f0Var.d(f13, "y");
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, com.pinterest.framework.multisection.datasource.pagedlist.w
    public final String w2() {
        return this.N;
    }
}
