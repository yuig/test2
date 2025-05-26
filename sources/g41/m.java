package g41;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import df.j1;
import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import so.c2;
import w01.e0;
import y01.p1;
import yq0.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg41/m;", "Lyq0/b0;", "Lyq0/a0;", "Lc41/b;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class m extends j<a0> implements c41.b {
    public static final /* synthetic */ int H0 = 0;
    public c2 A0;
    public i92.k B0;
    public g C0;
    public e41.h E0;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f63527z0;
    public final xk2.k D0 = xk2.m.a(xk2.n.NONE, new e0(this, 18));
    public final d4 F0 = d4.USER;
    public final a4 G0 = a4.USER_FOLLOWERS;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(1, new b01.c(13, requireContext, this));
        g gVar = new g(requireContext);
        this.C0 = gVar;
        adapter.G(2, new e0(gVar, 19));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        if (!com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_KEY_SHOW_TOOLBAR", false)) {
            ((GestaltToolbarImpl) toolbar).B();
            return;
        }
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.g0();
        gestaltToolbarImpl.Q(drawableRes, eo1.b.color_themed_text_default, le0.h.content_description_back_arrow);
        gestaltToolbarImpl.m();
    }

    public final String U8() {
        return com.bumptech.glide.d.Z(this, "com.pinterest.EXTRA_USER_ID", "");
    }

    @Override // yk1.k
    public final yk1.m V7() {
        String U8 = U8();
        vb0.j.f125466a.S(U8.length() > 0, "No user ID for ProfileFollowersFragment", new Object[0]);
        c2 c2Var = this.A0;
        if (c2Var == null) {
            Intrinsics.r("profileFollowersPresenterFactory");
            throw null;
        }
        String Z = com.bumptech.glide.d.Z(this, "com.pinterest.node_id", "");
        boolean G = true ^ com.bumptech.glide.d.G(this, "com.pinterest.EXTRAS_KEY_SHOW_TOOLBAR", false);
        uk1.e eVar = this.f63527z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        e41.h a13 = c2Var.a(U8, Z, G, ((uk1.a) eVar).g(), new p1(this, 28));
        this.E0 = a13;
        return a13;
    }

    @Override // nl1.d
    public final g0 d7() {
        return g0.USER_FOLLOWERS;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF119340x0() {
        return this.G0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140085y0() {
        return this.F0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(nz1.d.creator_profile_followers_fragment, nz1.c.p_recycler_view);
        eVar.c(nz1.c.swipe_container);
        eVar.f979c = nz1.c.empty_state_container;
        return eVar;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Resources resources = view.getResources();
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        F8(resources.getString((f13 == null || !dl2.b.S1(f13, U8())) ? nz1.f.empty_followers_message_generic : nz1.f.empty_my_followers_message));
        a8(new eb2.d(null, null, null, new ex.d(getResources().getDimensionPixelSize(eo1.c.lego_spacing_between_elements), 13), 7));
        if (j1.E1()) {
            RecyclerView g83 = g8();
            ViewGroup.LayoutParams layoutParams = g83 != null ? g83.getLayoutParams() : null;
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = getResources().getDimensionPixelSize(r0.lego_floating_nav_20_icon_tap_target);
            RecyclerView g84 = g8();
            if (g84 == null) {
                return;
            }
            g84.setLayoutParams(layoutParams2);
        }
    }

    @Override // nl1.d
    public final String q7() {
        return U8();
    }
}
