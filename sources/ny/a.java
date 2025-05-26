package ny;

import ey.b2;
import ey.u1;

/* loaded from: classes3.dex */
public final class a extends u1 implements b2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f92509c;

    @Override // ey.u1
    public final String e() {
        switch (this.f92509c) {
            case 0:
            case 2:
                return "dns_lookup";
            case 1:
            default:
                return "tls_connect";
        }
    }

    @Override // ey.u1
    public final String g() {
        switch (this.f92509c) {
            case 0:
            case 1:
                return "api_conn_warmup";
            default:
                return "image_conn_warmup";
        }
    }
}
