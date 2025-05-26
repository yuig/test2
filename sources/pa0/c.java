package pa0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.pinterest.api.model.wy0;
import com.pinterest.base.LockableViewPager;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t80.r;
import u50.f0;
import u50.k0;
import xo.k;
import yk1.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpa0/c;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Ld41/a;", "Lpa0/a;", "<init>", "()V", "draftsAndTemplatesPicker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends g<d41.a> implements a {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f99375x0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    public uk1.e f99376r0;

    /* renamed from: s0, reason: collision with root package name */
    public wk2.a f99377s0;

    /* renamed from: t0, reason: collision with root package name */
    public GestaltHeaderBar f99378t0;

    /* renamed from: u0, reason: collision with root package name */
    public e f99379u0;

    /* renamed from: v0, reason: collision with root package name */
    public final d4 f99380v0 = d4.FEED;

    /* renamed from: w0, reason: collision with root package name */
    public final a4 f99381w0 = a4.COLLAGES_PICKER;

    @Override // yk1.k
    public final m V7() {
        uk1.e eVar = this.f99376r0;
        if (eVar != null) {
            return new f(((uk1.a) eVar).f(s7(), ""), p7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF99381w0() {
        return this.f99381w0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF99380v0() {
        return this.f99380v0;
    }

    @Override // nl1.d
    public final LockableViewPager m7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (LockableViewPager) mainView.findViewById(h.content_pager_vw);
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = i.fragment_collage_drafts_and_templates_picker;
        wk2.a aVar = this.f99377s0;
        if (aVar == null) {
            Intrinsics.r("adapterProvider");
            throw null;
        }
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        f8((jr.a) obj);
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        k0 k0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        int intValue = (f13 != null ? f13.x2() : 0).intValue();
        if (intValue > 0) {
            int i13 = j.drafts_tab_title_with_count;
            String[] formatArgs = {String.valueOf(intValue)};
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new f0(formatArgs[0]));
            k0Var = new k0(i13, arrayList);
        } else {
            int i14 = j.drafts_tab_title;
            Intrinsics.checkNotNullParameter(new String[0], "formatArgs");
            k0Var = new k0(i14, new ArrayList(0));
        }
        View findViewById = view.findViewById(h.tab_header_bar);
        GestaltHeaderBar gestaltHeaderBar = (GestaltHeaderBar) findViewById;
        Intrinsics.f(gestaltHeaderBar);
        b0.Q(gestaltHeaderBar, new r(17, k0Var, this));
        gestaltHeaderBar.k0(new k(this, 29));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f99378t0 = gestaltHeaderBar;
        LockableViewPager lockableViewPager = (LockableViewPager) b8().f21278a;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        lockableViewPager.setBackgroundColor(bs1.c.A(requireContext, eo1.b.color_themed_background_default));
        Y7(new b(this));
        lockableViewPager.B(com.bumptech.glide.d.G(this, "CollageDraftPickerExtras.EXTRA_OPEN_ON_TEMPLATES_TAB", false) ? 1 : 0, false);
    }
}
