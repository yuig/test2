package n62;

import androidx.appcompat.widget.c2;
import com.pinterest.shuffles.scene.composer.x0;
import kh2.b0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m62.g0;
import m62.o0;
import m62.p0;
import m62.w;
import r72.z1;

/* loaded from: classes4.dex */
public final class l implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2 f89373a;

    public l(c2 c2Var) {
        this.f89373a = c2Var;
    }

    @Override // m62.w
    public final void T(ke2.a flip) {
        Intrinsics.checkNotNullParameter(flip, "flip");
        c2 c2Var = this.f89373a;
        ke2.d dVar = (ke2.d) CollectionsKt.firstOrNull(((x0) c2Var.f16532c).f52170b.getF52894a().f79314f);
        z1 r03 = dVar != null ? b0.r0(dVar) : null;
        if (r03 == null) {
            return;
        }
        ((Function1) c2Var.f16535f).invoke(new o0(((flip.f79303b - (r03.a().f106513a ? 1.0f : 0.0f)) / (-2.0d)) * 2 * 3.141592653589793d, ((flip.f79302a - (r03.a().f106514b ? 1.0f : 0.0f)) / 2.0d) * 2 * 3.141592653589793d));
    }

    @Override // m62.w
    public final void g(m62.b0 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        ((Function1) this.f89373a.f16535f).invoke(g0.f85980a);
    }

    @Override // m62.w
    public final void u(ke2.d item, m62.b0 handler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(handler, "handler");
        ((Function1) this.f89373a.f16535f).invoke(p0.f86040a);
    }
}
