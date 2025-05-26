package wx1;

import android.content.res.Resources;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import so.u0;
import yk1.v;

/* loaded from: classes4.dex */
public final class a implements yx.d {

    /* renamed from: a, reason: collision with root package name */
    public final v f131199a;

    /* renamed from: b, reason: collision with root package name */
    public final b60.b f131200b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f131201c;

    /* renamed from: d, reason: collision with root package name */
    public final yx.c f131202d;

    public a(yx.b filterRepositoryFactory, v viewResources, b60.b activeUserManager, boolean z13) {
        Intrinsics.checkNotNullParameter(filterRepositoryFactory, "filterRepositoryFactory");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f131199a = viewResources;
        this.f131200b = activeUserManager;
        this.f131201c = z13;
        this.f131202d = ((u0) filterRepositoryFactory).a(zx.a.FILTER_PIN_STATS, yb2.a.b(((b60.d) activeUserManager).f()));
    }

    @Override // yx.d
    public final boolean a() {
        return false;
    }

    @Override // yx.d
    public final boolean b() {
        return false;
    }

    @Override // yx.d
    public final yx.c c() {
        return this.f131202d;
    }

    @Override // yx.d
    public final boolean d() {
        return yb2.a.b(((b60.d) this.f131200b).f());
    }

    @Override // yx.d
    public final List e() {
        return f0.j(zx.f.DAYS_7, zx.f.DAYS_14, zx.f.DAYS_21, zx.f.DAYS_30, zx.f.DAYS_60, zx.f.DAYS_90, zx.f.CUSTOM);
    }

    @Override // yx.d
    public final boolean f() {
        return false;
    }

    @Override // yx.d
    public final boolean g() {
        return this.f131201c;
    }

    @Override // yx.d
    public final String h(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return ((yk1.a) this.f131199a).f139224a.getString(com.pinterest.partnerAnalytics.g.content_type_filter_description);
    }

    @Override // yx.d
    public final boolean i() {
        return false;
    }

    @Override // yx.d
    public final boolean j() {
        return false;
    }
}
