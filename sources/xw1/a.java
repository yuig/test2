package xw1;

import android.content.res.Resources;
import com.pinterest.partnerAnalytics.g;
import java.util.List;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import so.u0;
import yx.c;
import yx.d;
import zx.f;

/* loaded from: classes4.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f136123a;

    /* renamed from: b, reason: collision with root package name */
    public final c f136124b;

    public a(yx.b filterRepositoryFactory, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(filterRepositoryFactory, "filterRepositoryFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f136123a = activeUserManager;
        this.f136124b = ((u0) filterRepositoryFactory).a(zx.a.FILTER_OVERVIEW, yb2.a.b(((b60.d) activeUserManager).f()));
    }

    @Override // yx.d
    public final boolean a() {
        return true;
    }

    @Override // yx.d
    public final boolean b() {
        return true;
    }

    @Override // yx.d
    public final c c() {
        return this.f136124b;
    }

    @Override // yx.d
    public final boolean d() {
        return yb2.a.b(((b60.d) this.f136123a).f());
    }

    @Override // yx.d
    public final List e() {
        return c0.b0(f.values());
    }

    @Override // yx.d
    public final boolean f() {
        return true;
    }

    @Override // yx.d
    public final boolean g() {
        return true;
    }

    @Override // yx.d
    public final String h(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string = resources.getString(g.content_type_filter_disclaimer);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // yx.d
    public final boolean i() {
        return true;
    }

    @Override // yx.d
    public final boolean j() {
        return !yb2.a.b(((b60.d) this.f136123a).f());
    }
}
