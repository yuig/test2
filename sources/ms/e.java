package ms;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import i92.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nr0.m;
import rr0.h;
import x02.i2;
import x02.x0;
import yk1.j;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lms/e;", "Lsq0/n;", "Lks/a;", "Lnp0/f;", "<init>", "()V", "adPreview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends a implements ks.a, np0.f {
    public m O0;
    public i2 P0;
    public x0 Q0;
    public j R0;
    public lh0.e S0;
    public z02.a T0;
    public k U0;
    public js.a V0;
    public final d4 W0 = d4.FEED;
    public final a4 X0 = a4.AD_PREVIEW_FEED;

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PLACEHOLDER, new d(this, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_FULL_SPAN_PLACEHOLDER, new d(this, 1));
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        ((GestaltToolbarImpl) toolbar).b0(getResources().getString(js.e.promoted_pin_preview_header));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        m mVar = this.O0;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        h hVar = new h(requireContext, mVar);
        hVar.f109913b = new or0.d();
        hVar.f109914c = W8();
        x0 x0Var = this.Q0;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        hVar.f109925n = x0Var;
        j jVar = this.R0;
        if (jVar == null) {
            Intrinsics.r("mvpBinder");
            throw null;
        }
        hVar.f109926o = jVar;
        i2 i2Var = this.P0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        hVar.f109927p = i2Var;
        hVar.f109916e = z7();
        h a13 = hVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        i2 i2Var2 = this.P0;
        if (i2Var2 == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        Navigation navigation = this.I;
        Intrinsics.f(navigation);
        String f49940b = navigation.getF49940b();
        Navigation navigation2 = this.I;
        Intrinsics.f(navigation2);
        String v03 = navigation2.v0("override");
        Intrinsics.f(v03);
        z02.a aVar = this.T0;
        if (aVar == null) {
            Intrinsics.r("adPreviewService");
            throw null;
        }
        lh0.e eVar = this.S0;
        if (eVar == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        k kVar = this.U0;
        if (kVar == null) {
            Intrinsics.r("toastUtils");
            throw null;
        }
        js.a aVar2 = this.V0;
        if (aVar2 != null) {
            return new ls.d(a13, i2Var2, f49940b, v03, aVar, eVar, kVar, aVar2);
        }
        Intrinsics.r("adPreviewUtils");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getX0() {
        return this.X0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getW0() {
        return this.W0;
    }

    @Override // sq0.e, np0.f
    public final i01.e k0() {
        return new c(this);
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(js.d.pin_preview_page, js.c.p_recycler_view);
        eVar.c(js.c.swipe_container);
        eVar.f979c = js.c.empty_state_container;
        return eVar;
    }
}
