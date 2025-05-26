package on0;

import a.h5;
import e12.d;
import j12.k;
import java.util.Map;
import jk2.h0;
import kk2.m;
import m60.g0;
import n00.c;
import pk.a0;
import uj2.q;

/* loaded from: classes5.dex */
public final class b extends or0.b {

    /* renamed from: f, reason: collision with root package name */
    public final d f96701f;

    /* renamed from: g, reason: collision with root package name */
    public final k f96702g;

    /* renamed from: h, reason: collision with root package name */
    public final g0 f96703h;

    /* renamed from: i, reason: collision with root package name */
    public nn0.d f96704i;

    /* renamed from: j, reason: collision with root package name */
    public final h5 f96705j;

    public b(rr0.a aVar, d dVar, k kVar, g0 g0Var) {
        super(aVar, false);
        this.f96705j = new h5(0);
        this.f96701f = dVar;
        this.f96702g = kVar;
        this.f96703h = g0Var;
    }

    @Override // or0.b
    public final q a(Map map) {
        m k13;
        nn0.d dVar = (nn0.d) map.get("CONTENT_SOURCE_TYPE");
        this.f96704i = dVar;
        int i13 = a.f96700a[dVar.ordinal()];
        h5 h5Var = this.f96705j;
        g0 g0Var = this.f96703h;
        if (i13 == 1) {
            k13 = this.f96701f.z((String) map.get("BOARD_ID"), n00.b.a(c.BOARD_PIN_FEED), g0Var.d()).k(h5Var);
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException("Cannot request first page of pins for type " + this.f96704i.name());
            }
            k13 = this.f96702g.h((String) map.get("BOARD_SECTION_ID"), n00.b.a(c.BOARD_PIN_FEED), g0Var.d()).k(h5Var);
        }
        return k13.u();
    }

    @Override // or0.b
    public final q b(String str) {
        if (a0.x0(str)) {
            return h0.f76488a;
        }
        int i13 = a.f96700a[this.f96704i.ordinal()];
        h5 h5Var = this.f96705j;
        if (i13 == 1) {
            return this.f96701f.b(str).k(h5Var).u();
        }
        if (i13 == 2) {
            return this.f96702g.b(str).k(h5Var).u();
        }
        throw new IllegalArgumentException("Cannot request next page of pins fortype " + this.f96704i.name());
    }
}
