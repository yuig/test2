package yx;

import java.util.Calendar;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lb0.n;
import lb0.o;
import nm.p;
import zx.e;
import zx.f;
import zx.g;
import zx.h;
import zx.i;
import zx.k;
import zx.l;
import zx.m;

/* loaded from: classes3.dex */
public final class c implements a {

    /* renamed from: d, reason: collision with root package name */
    public static final l f140323d;

    /* renamed from: a, reason: collision with root package name */
    public final zx.a f140324a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f140325b;

    /* renamed from: c, reason: collision with root package name */
    public l f140326c;

    static {
        f fVar = f.DAYS_30;
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -30);
        g gVar = new g(fVar, true, calendar.getTimeInMillis(), System.currentTimeMillis());
        zx.d dVar = zx.d.ALL;
        e eVar = e.ALL;
        zx.c cVar = zx.c.ALL;
        f140323d = new l(new zx.b("all", 0), cVar, dVar, eVar, gVar, h.ALL, i.ALL, k.ALL_PINS, q0.f80391a, false);
    }

    public c(zx.a filterDataSourceType, boolean z13) {
        Intrinsics.checkNotNullParameter(filterDataSourceType, "filterDataSourceType");
        this.f140324a = filterDataSourceType;
        this.f140325b = z13;
        this.f140326c = c();
    }

    public final l b() {
        boolean z13 = this.f140325b;
        l lVar = f140323d;
        return z13 ? lVar : l.b(lVar, zx.d.ORGANIC, null, 1021);
    }

    public final l c() {
        l b13;
        o a13 = n.f82725d.a();
        Intrinsics.checkNotNullExpressionValue(a13, "user(...)");
        zx.a aVar = this.f140324a;
        lb0.b bVar = (lb0.b) a13;
        String j13 = bVar.j(aVar.getKeyName(), "");
        if (j13 == null || z.j(j13)) {
            return b();
        }
        try {
            p pVar = new p();
            pVar.b(new m(), l.class);
            b13 = (l) pVar.a().b(l.class, j13);
        } catch (Exception unused) {
            bVar.k(aVar.getKeyName());
            b13 = b();
        }
        Intrinsics.f(b13);
        return b13;
    }

    public final void d() {
        l b13 = b();
        Intrinsics.checkNotNullParameter(b13, "<set-?>");
        this.f140326c = b13;
        ((lb0.b) n.b()).n(this.f140324a.getKeyName(), new p().a().k(this.f140326c));
    }
}
