package ef1;

import a.z0;
import com.pinterest.api.model.f30;
import eo1.c;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import q21.d;
import vq0.h;
import yk1.n;
import yk1.v;

/* loaded from: classes5.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final v f58834a;

    /* renamed from: b, reason: collision with root package name */
    public final w f58835b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f58836c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f58837d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f58838e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58839f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f58840g;

    public b(v viewResources, HashMap hashMap, boolean z13) {
        w eventManager = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(eventManager, "getInstance(...)");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f58834a = viewResources;
        this.f58835b = eventManager;
        this.f58836c = hashMap;
        this.f58837d = null;
        this.f58838e = null;
        this.f58839f = true;
        this.f58840g = z13;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        d view = (d) nVar;
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        boolean z13 = this.f58840g;
        ze1.a aVar = new ze1.a(z13, this.f58839f, true);
        d.b(view, model, i13, this.f58836c, this.f58837d, new z0(this, 11), false, aVar, this.f58838e, null, null, false, null, false, false, 32352);
        view.e(model, !z13, g3.f0(model, aVar), false);
        int x13 = c0.d.x(100 / hf0.b.f69004d, hf0.b.f69002b) - (((yk1.a) this.f58834a).f139224a.getDimensionPixelSize(c.lego_spacing_horizontal_large) / 2);
        view.g(x13, (int) (x13 * 1.0d));
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
