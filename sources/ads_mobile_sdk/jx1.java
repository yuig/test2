package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jx1 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f7006a;

    /* renamed from: b, reason: collision with root package name */
    public final a.cd f7007b;

    public jx1(r0 adConfiguration, a.cd gmsgHandler) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(gmsgHandler, "gmsgHandler");
        this.f7006a = adConfiguration;
        this.f7007b = gmsgHandler;
    }

    @Override // a.cd
    public final a.cd a() {
        return this.f7007b.a();
    }

    @Override // a.cd
    public final kl0 b() {
        return this.f7007b.b();
    }

    @Override // a.cd
    public final boolean c() {
        return this.f7007b.c();
    }

    @Override // a.cd
    public final String d() {
        fs0 fs0Var = this.f7006a.H;
        if (fs0Var != null) {
            return fs0Var.f5267d;
        }
        return null;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        return this.f7007b.a(ym0Var, map, cVar);
    }
}
