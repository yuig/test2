package e21;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kh2.k3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.g0;
import m60.r0;
import m60.t0;
import sq0.c0;
import w01.e0;
import x02.i2;
import yq0.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le21/v;", "Lyq0/b0;", "Lyq0/a0;", "", "<init>", "()V", "pin_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class v extends b<a0> implements c0 {
    public static final /* synthetic */ int E0 = 0;
    public g0 A0;
    public uk1.e B0;
    public String C0 = "";
    public ek2.j D0;

    /* renamed from: z0, reason: collision with root package name */
    public i2 f56991z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_USER_PIN_REACTION, new e0(this, 8));
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        Intrinsics.f(navigation);
        String f49940b = navigation.getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        this.C0 = f49940b;
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.g0();
        gestaltToolbarImpl.h0();
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        String str = this.C0;
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        b60.b activeUserManager = getActiveUserManager();
        uj2.q p73 = p7();
        g0 g0Var = this.A0;
        if (g0Var == null) {
            Intrinsics.r("pageSizeProvider");
            throw null;
        }
        uk1.e eVar = this.B0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        g13.d(getH0(), getI0(), null, getF73409e1(), null);
        Unit unit = Unit.f80348a;
        return new c21.a(str, aVar, activeUserManager, p73, g0Var, g13);
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public final h32.g0 getF73409e1() {
        String v03;
        h32.g0 valueOf;
        Navigation navigation = this.I;
        return (navigation == null || (v03 = navigation.v0("com.pinterest.EXTRA_COMMENT_COMPONENT")) == null || (valueOf = h32.g0.valueOf(v03)) == null) ? h32.g0.PIN_CLOSEUP_COMMENTS : valueOf;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getI0() {
        String v03;
        Navigation navigation = this.I;
        if (navigation == null || (v03 = navigation.v0("com.pinterest.EXTRA_COMMENT_VIEW_PARAMETER")) == null) {
            return null;
        }
        return a4.valueOf(v03);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getH0() {
        String v03;
        d4 valueOf;
        Navigation navigation = this.I;
        return (navigation == null || (v03 = navigation.v0("com.pinterest.EXTRA_COMMENT_VIEW_TYPE")) == null || (valueOf = d4.valueOf(v03)) == null) ? d4.PIN_COMMENTS : valueOf;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(ry1.d.pinterest_recycler_swipe_refresh_with_toolbar, t0.p_recycler_view);
        eVar.c(t0.swipe_container);
        return eVar;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ek2.j jVar;
        ek2.j jVar2 = this.D0;
        if (jVar2 != null && !jVar2.isDisposed() && (jVar = this.D0) != null) {
            bk2.c.dispose(jVar);
        }
        super.onDestroyView();
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.margin);
        a8(new eb2.d(new ex.d(dimensionPixelSize, 11), null, new ex.d(dimensionPixelSize, 12), null, 10));
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v((int) c7().b(), g83);
        }
        fo1.a i73 = i7();
        if (i73 != null) {
            GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) i73;
            gestaltToolbarImpl.setClipChildren(false);
            gestaltToolbarImpl.setClipToPadding(false);
            i2 i2Var = this.f56991z0;
            if (i2Var != null) {
                this.D0 = (ek2.j) i2Var.P(this.C0).F(new a21.a(6, new y11.c(2, i73, this)), new a21.a(7, l.f56979l), ck2.i.f27923c, ck2.i.f27924d);
            } else {
                Intrinsics.r("pinRepository");
                throw null;
            }
        }
    }
}
