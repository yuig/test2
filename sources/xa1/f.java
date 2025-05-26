package xa1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.d4;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import sq0.c0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lxa1/f;", "Lyq0/b0;", "", "<init>", "()V", "menu_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f extends b<Object> implements c0 {
    public vb0.l A0;
    public final d4 B0 = d4.SETTINGS;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f134451z0;

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(4, new e(this, 0));
        adapter.G(1, new e(this, 1));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(getResources().getString(c52.e.about));
        gestaltToolbarImpl.P(drawableRes, eo1.b.color_themed_text_default);
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f134451z0;
        if (eVar != null) {
            return new ql0.a(((uk1.a) eVar).g(), p7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getT0() {
        return this.B0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(v0.fragment_settings_menu, t0.p_recycler_view);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f139734h0;
        if (pinterestSwipeRefreshLayout != null) {
            pinterestSwipeRefreshLayout.setEnabled(false);
        }
        RecyclerView g83 = g8();
        if (g83 != null) {
            k3.v((int) r70.b.f106349i.k0().b(), g83);
        }
    }
}
