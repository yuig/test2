package r81;

import com.pinterest.api.model.ow;
import com.pinterest.feature.search.visual.lens.remoterequest.LensFirstRetrofitPagedRemoteRequest;
import com.pinterest.framework.multisection.datasource.pagedlist.j0;
import com.pinterest.framework.multisection.datasource.pagedlist.m0;
import ey.u;
import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import qz.f0;

/* loaded from: classes5.dex */
public final class m extends com.pinterest.framework.multisection.datasource.pagedlist.c {
    public boolean L;
    public String M;

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final com.pinterest.hairball.network.e M(r requestState) {
        Intrinsics.checkNotNullParameter(requestState, "requestState");
        f0 f0Var = this.f49121k;
        if (f0Var == null || !f0Var.b("image") || (!(requestState instanceof j0) && !(requestState instanceof m0))) {
            return super.M(requestState);
        }
        LinkedHashMap registeredDeserializers = this.f49132v;
        Intrinsics.checkNotNullParameter(registeredDeserializers, "registeredDeserializers");
        ow modelStorage = this.f49116f;
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        x12.a pagedListService = this.f49117g;
        Intrinsics.checkNotNullParameter(pagedListService, "pagedListService");
        return new LensFirstRetrofitPagedRemoteRequest(registeredDeserializers, modelStorage, null, null, pagedListService, this.f49118h, null, null, null, 460, null);
    }

    public final void f0(Integer num) {
        f0 f0Var = this.f49121k;
        if (f0Var != null) {
            f0Var.c(num.intValue(), "crop_source");
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0, qr0.d
    public final String g() {
        return this.f49111a + "?" + this.f49121k;
    }

    public final void g0(Float f13) {
        if (f13 == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.h("h");
                return;
            }
            return;
        }
        f0 f0Var2 = this.f49121k;
        if (f0Var2 != null) {
            f0Var2.d(f13, "h");
        }
    }

    public final void h0(byte[] bArr) {
        if (bArr == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.h("image");
                return;
            }
            return;
        }
        f0 f0Var2 = this.f49121k;
        if (f0Var2 != null) {
            ByteArrayInputStream stream = new ByteArrayInputStream(bArr);
            Intrinsics.checkNotNullParameter("image", "key");
            Intrinsics.checkNotNullParameter(stream, "stream");
            f0Var2.f105398b.put("image", u.b(stream, null));
        }
    }

    @Override // wt1.b
    public final boolean i() {
        if (this.L) {
            f0 f0Var = this.f49121k;
            if (f0Var != null && f0Var.b("url")) {
                return true;
            }
            f0 f0Var2 = this.f49121k;
            if (f0Var2 != null && f0Var2.b("image")) {
                return true;
            }
        }
        return false;
    }

    public final void i0(String str) {
        if (str == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.h("url");
            }
        } else {
            f0 f0Var2 = this.f49121k;
            if (f0Var2 != null) {
                f0Var2.e("url", str);
            }
        }
        this.M = str;
    }

    public final void j0(Float f13) {
        if (f13 == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.h("w");
                return;
            }
            return;
        }
        f0 f0Var2 = this.f49121k;
        if (f0Var2 != null) {
            f0Var2.d(f13, "w");
        }
    }

    public final void k0(Float f13) {
        if (f13 == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.h("x");
                return;
            }
            return;
        }
        f0 f0Var2 = this.f49121k;
        if (f0Var2 != null) {
            f0Var2.d(f13, "x");
        }
    }

    public final void m0(Float f13) {
        if (f13 == null) {
            f0 f0Var = this.f49121k;
            if (f0Var != null) {
                f0Var.h("y");
                return;
            }
            return;
        }
        f0 f0Var2 = this.f49121k;
        if (f0Var2 != null) {
            f0Var2.d(f13, "y");
        }
    }
}
