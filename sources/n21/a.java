package n21;

import com.pinterest.feature.pincarouselads.view.l;
import h32.x1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import yk1.n;

/* loaded from: classes.dex */
public final class a extends yk1.b implements l21.f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88964a;

    /* renamed from: b, reason: collision with root package name */
    public x1 f88965b;

    /* renamed from: c, reason: collision with root package name */
    public String f88966c;

    /* renamed from: d, reason: collision with root package name */
    public String f88967d;

    /* renamed from: e, reason: collision with root package name */
    public int f88968e;

    /* renamed from: f, reason: collision with root package name */
    public Long f88969f;

    /* renamed from: g, reason: collision with root package name */
    public String f88970g;

    /* renamed from: h, reason: collision with root package name */
    public String f88971h;

    /* renamed from: i, reason: collision with root package name */
    public Long f88972i;

    /* renamed from: j, reason: collision with root package name */
    public Long f88973j;

    public a(boolean z13) {
        super(0);
        this.f88964a = z13;
        this.f88968e = -1;
        this.f88969f = -1L;
    }

    public static void p3(a aVar, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        aVar.f88966c = url;
        aVar.f88967d = null;
    }

    @Override // l21.f
    public final x1 T() {
        if (this.f88965b == null) {
            Long f13 = ep.b.f(1000000L);
            Long l13 = this.f88969f;
            Long valueOf = l13 != null ? Long.valueOf(l13.longValue()) : null;
            Long l14 = this.f88972i;
            Long valueOf2 = l14 != null ? Long.valueOf(l14.longValue()) : null;
            this.f88965b = new x1(this.f88971h, null, null, this.f88970g, f13, null, null, Short.valueOf((short) this.f88968e), valueOf2, valueOf, this.f88973j);
        }
        return this.f88965b;
    }

    @Override // l21.f
    public final x1 m0() {
        x1 x1Var;
        x1 source = this.f88965b;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            x1Var = new x1(source.f67380a, source.f67381b, source.f67382c, source.f67383d, source.f67384e, Long.valueOf(System.currentTimeMillis() * 1000000), source.f67386g, source.f67387h, source.f67388i, source.f67389j, source.f67390k);
        } else {
            x1Var = null;
        }
        this.f88965b = null;
        return x1Var;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        String str;
        l21.i view = (l21.i) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        if (!isBound() || (str = this.f88966c) == null || z.j(str)) {
            return;
        }
        l lVar = (l) ((l21.i) getView());
        lVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        lVar.f47393g = this;
        if (this.f88964a) {
            ((l) ((l21.i) getView())).f47409w = this.f88968e;
            ((l) ((l21.i) getView())).j(this.f88966c, this.f88967d);
        } else {
            ((l) ((l21.i) getView())).j(this.f88966c, null);
            ((l) ((l21.i) getView())).f47409w = this.f88968e;
        }
    }
}
