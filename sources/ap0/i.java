package ap0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.a4;
import h32.d4;
import java.util.ArrayList;
import java.util.List;
import kl0.t;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import m60.x0;
import rm1.q;
import so.oa;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lap0/i;", "Lyk1/k;", "Lap0/b;", "<init>", "()V", "lp2/b", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends k implements b {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f20310r0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f20311j0;

    /* renamed from: k0, reason: collision with root package name */
    public nu1.a f20312k0;

    /* renamed from: l0, reason: collision with root package name */
    public c30.a f20313l0;

    /* renamed from: m0, reason: collision with root package name */
    public mo1.d f20314m0;

    /* renamed from: n0, reason: collision with root package name */
    public lu1.b f20315n0;

    /* renamed from: o0, reason: collision with root package name */
    public a f20316o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f20317p0;

    /* renamed from: q0, reason: collision with root package name */
    public final d4 f20318q0 = d4.BIZ_ORIENTATION;

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.header_view_back_icon_size);
        Context context = getContext();
        int drawableRes = context != null ? q.CANCEL.drawableRes(context, dl2.b.f1(context)) : sm1.b.ic_cancel_gestalt;
        Context context2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
        int i13 = eo1.b.color_themed_text_default;
        Intrinsics.checkNotNullParameter(context2, "context");
        Object obj = d5.a.f53679a;
        Drawable drawable2 = context2.getDrawable(drawableRes);
        Intrinsics.checkNotNullParameter(context2, "context");
        BitmapDrawable bitmapDrawable = null;
        if (drawable2 != null) {
            drawable = sh.f.d(i13 == 0 ? context2.getColor(df0.a.f54892a) : context2.getColor(i13), context2, drawable2);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            bitmapDrawable = d7.b.p0(drawable, resources, dimensionPixelSize, dimensionPixelSize);
        }
        String string = getString(vq1.d.close_modal);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.T(bitmapDrawable, string);
        gestaltToolbarImpl.E();
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final m V7() {
        uk1.e eVar = this.f20311j0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d f13 = ((uk1.a) eVar).f(s7(), "");
        uj2.q p73 = p7();
        c30.a aVar = this.f20313l0;
        if (aVar != null) {
            return new bp0.a(f13, p73, aVar);
        }
        Intrinsics.r("userStateService");
        throw null;
    }

    public final void b8(wy0 wy0Var) {
        t tVar = new t(this, 26);
        a aVar = this.f20316o0;
        if (aVar != null) {
            ((bp0.a) aVar).p3(tVar, dl2.b.L1(wy0Var));
        }
    }

    public final void c8() {
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(requireContext().getString(vq1.d.business_onboarding_complete_toast));
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF104325c1() {
        int i13 = this.f20317p0;
        return i13 != 0 ? i13 != 1 ? i13 != 2 ? a4.ONBOARDING_COMPLETE_SCREEN : a4.ONBOARDING_BUILD_PROFILE : a4.ONBOARDING_GROW_AUDIENCE : a4.ONBOARDING_SHARE_IDEAS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF105799k0() {
        return this.f20318q0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = vq1.c.business_onboarding_root_page;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        ViewPager viewPager = (ViewPager) v13.findViewById(vq1.b.onboarding_pager);
        Intrinsics.f(viewPager);
        viewPager.b(new h(this, viewPager));
        h hVar = new h(this, viewPager);
        ArrayList arrayList = viewPager.O;
        if (arrayList != null) {
            arrayList.remove(hVar);
        }
        List j13 = f0.j(new cp0.a("https://i.pinimg.com/originals/58/f6/5d/58f65d964c72b2c94edc04ebd40353b4.jpg", getString(vq1.d.bizhub_share_ideas_card_title_migration), getString(vq1.d.bizhub_share_ideas_card_description_migration), f.FIRST), new cp0.a("https://i.pinimg.com/originals/cd/5d/fe/cd5dfee7ed747ab02e57827a55c54d96.jpg", getString(vq1.d.bizhub_grow_audiences_card_title_migration), getString(vq1.d.bizhub_grow_audiences_card_description_migration), f.SECOND), new cp0.a("https://i.pinimg.com/originals/55/fd/2b/55fd2b8297fe92e9492546bb98a8fded.jpg", getString(vq1.d.bizhub_build_profile_card_title_migration), getString(vq1.d.bizhub_build_profile_card_description_migration), f.THIRD), new cp0.a(null, getString(x0.bizhub_start_options_title), null, f.LAST));
        wk2.a aVar = this.f91283h;
        if (aVar == null) {
            Intrinsics.r("currentUserProvider");
            throw null;
        }
        wy0 wy0Var = (wy0) aVar.get();
        Context context = v13.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        viewPager.z(new e(j13, context, new g(wy0Var, this, 0), new g(wy0Var, this, 1), new g(this, wy0Var), new bp.j(28, viewPager, this)));
        View findViewById = v13.findViewById(vq1.b.onboarding_tab_layout);
        Intrinsics.g(findViewById, "null cannot be cast to non-null type com.google.android.material.tabs.TabLayout");
        ((TabLayout) findViewById).z(viewPager, false);
        fo1.a i73 = i7();
        if (i73 == null) {
            return;
        }
        ((GestaltToolbarImpl) i73).U(new lj0.a(this, 15));
    }
}
