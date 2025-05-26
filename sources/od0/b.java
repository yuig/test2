package od0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.d4;
import ha2.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import rm1.q;
import yk1.m;
import yk1.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lod0/b;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Lod0/d;", "", "<init>", "()V", "xa0/j", "hub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends e<d> implements n, f {

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f94098t0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    public d f94099r0;

    /* renamed from: s0, reason: collision with root package name */
    public final d4 f94100s0 = d4.CREATOR_HUB;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        q qVar = q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.g0();
        gestaltToolbarImpl.o();
        gestaltToolbarImpl.Q(drawableRes, eo1.b.color_themed_text_default, x0.cancel);
        gestaltToolbarImpl.b0(getResources().getString(rd0.d.creator_hub_tab_title));
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final m V7() {
        return new nd0.a(s7());
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF99380v0() {
        return this.f94100s0;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = rd0.c.fragment_creator_hub_pager;
        d dVar = this.f94099r0;
        if (dVar != null) {
            f8(dVar);
        } else {
            Intrinsics.r("adapter");
            throw null;
        }
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(rd0.b.creator_hub_back_button);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById;
        gestaltIconButton.u(new yb0.b(this, 8));
        gestaltIconButton.t(a.f94097i);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (GestaltToolbarImpl) mainView.findViewById(rd0.b.creator_hub_toolbar);
    }
}
