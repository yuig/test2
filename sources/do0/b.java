package do0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.feature.home.view.f;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.x0;
import rm1.q;
import so.u5;
import uk1.e;
import xk2.m;
import xk2.v;
import yq0.a0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldo0/b;", "Lyq0/b0;", "Lyq0/a0;", "Lao0/a;", "<init>", "()V", "boardSection_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends d<a0> implements ao0.a {
    public static final /* synthetic */ int I0 = 0;
    public u5 A0;
    public e B0;
    public yk1.a C0;
    public FrameLayout D0;
    public View E0;
    public co0.d F0;
    public final v G0 = m.b(new a(this, 0));
    public final d4 H0 = d4.BOARD_SECTION;

    /* renamed from: z0, reason: collision with root package name */
    public f0 f55655z0;

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(2131232, new a(this, 1));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        q qVar = q.CANCEL;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(k70.e.section_merge_target_section_picker_fragment_title);
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.Q(drawableRes, eo1.b.color_icon_default, x0.cancel);
    }

    public final void U8(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.E0 = view;
        FrameLayout frameLayout = this.D0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        Navigation navigation2 = this.I;
        String v03 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_BOARD_SECTION_ID") : null;
        f0 f0Var = this.f55655z0;
        if (f0Var == null) {
            Intrinsics.r("devUtils");
            throw null;
        }
        f0Var.N(f49940b, "boardId can't be null", new Object[0]);
        f0 f0Var2 = this.f55655z0;
        if (f0Var2 == null) {
            Intrinsics.r("devUtils");
            throw null;
        }
        f0Var2.N(v03, "sourceSectionId can't be null", new Object[0]);
        u5 u5Var = this.A0;
        if (u5Var == null) {
            Intrinsics.r("boardSectionMergePresenterFactory");
            throw null;
        }
        String str = f49940b == null ? "" : f49940b;
        if (v03 == null) {
            v03 = "";
        }
        e eVar = this.B0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        if (f49940b == null) {
            f49940b = "";
        }
        return u5Var.a(str, v03, ((uk1.a) eVar).d(f49940b));
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getC0() {
        return this.H0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(k70.c.board_and_section_picker_fragment, k70.b.p_recycler_view);
        eVar.b(k70.b.loading_container);
        return eVar;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.D0 = (FrameLayout) view.findViewById(k70.b.content_view_container);
        View view2 = this.E0;
        if (view2 != null) {
            U8(view2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(f02.a.board_picker_padding);
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.m(new f(dimensionPixelSize, dimensionPixelSize));
        }
    }
}
