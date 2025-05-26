package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zx1 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f14976a;

    /* renamed from: b, reason: collision with root package name */
    public final a.cd f14977b;

    public zx1(r0 adConfiguration, a.cd gmsgHandler) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(gmsgHandler, "gmsgHandler");
        this.f14976a = adConfiguration;
        this.f14977b = gmsgHandler;
    }

    @Override // a.cd
    public final a.cd a() {
        return this.f14977b.a();
    }

    @Override // a.cd
    public final kl0 b() {
        return this.f14977b.b();
    }

    @Override // a.cd
    public final boolean c() {
        return this.f14977b.c();
    }

    @Override // a.cd
    public final String d() {
        fs0 fs0Var = this.f14976a.H;
        if (fs0Var != null) {
            return fs0Var.f5267d;
        }
        return null;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        return this.f14977b.a(ym0Var, map, cVar);
    }
}
