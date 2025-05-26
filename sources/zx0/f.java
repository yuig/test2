package zx0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.wy0;
import com.pinterest.base.LockableViewPager;
import com.pinterest.framework.screens.s;
import com.pinterest.framework.screens.u;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.tabs.GestaltTab;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import df.j1;
import hz.l;
import java.util.ArrayList;
import kh2.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku1.j;
import lh0.h2;
import lp.k;
import m60.r0;
import pk.a0;
import xk2.m;
import xk2.v;
import yx0.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzx0/f;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Lod0/d;", "Lxx0/a;", "<init>", "()V", "newsHub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends a<od0.d> implements xx0.a {
    public static final /* synthetic */ int C0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    public wk2.a f143015r0;

    /* renamed from: s0, reason: collision with root package name */
    public wk2.a f143016s0;

    /* renamed from: t0, reason: collision with root package name */
    public h2 f143017t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltTabLayout f143018u0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltIconButton f143019v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltText f143020w0;

    /* renamed from: x0, reason: collision with root package name */
    public sh1.b f143021x0;

    /* renamed from: y0, reason: collision with root package name */
    public h f143022y0;

    /* renamed from: z0, reason: collision with root package name */
    public final v f143023z0 = m.b(new c(this, 1));
    public final v A0 = m.b(e.f143014i);
    public final v B0 = m.b(new c(this, 0));

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Context context;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        if (f13 != null && dl2.b.G2(f13) && k8()) {
            if (this.f143021x0 == null && (context = getContext()) != null) {
                sh1.b bVar = new sh1.b((ye2.m) context);
                GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
                gestaltToolbarImpl.C();
                gestaltToolbarImpl.e(bVar);
                ViewGroup.LayoutParams layoutParams = bVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = null;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.setMarginStart(bVar.getPaddingStart() * (-1));
                    marginLayoutParams2.setMarginEnd(bVar.getPaddingEnd() * (-1));
                    marginLayoutParams = marginLayoutParams2;
                }
                bVar.setLayoutParams(marginLayoutParams);
                this.f143021x0 = bVar;
            }
            ((GestaltToolbarImpl) toolbar).f0(true);
        } else {
            ((GestaltToolbarImpl) toolbar).f0(false);
        }
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Object value = this.f143023z0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (h) value;
    }

    @Override // ha2.f
    public final void Y4(ha2.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        f7().d(new jc0.v(new k(configuration), false, 0L, 30));
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        s sVar;
        int i13;
        if (!h2.f83379b.b().b() || (sVar = this.f91293r) == null || sVar.f49236k.size() != 2) {
            nl1.d.J7();
            return false;
        }
        s sVar2 = ((j) o7()).f80914l;
        r70.a aVar = sVar2 != null ? sVar2.f49234i : null;
        r70.a aVar2 = aVar instanceof r70.a ? aVar : null;
        if (aVar2 == null) {
            return true;
        }
        aVar2.k(u.SWITCH_TAB_ON_SCREEN_MANAGER_POP);
        s sVar3 = this.f91293r;
        if (sVar3 == null || sVar3.f49232g == (i13 = aVar2.i(u70.a.NOTIFICATIONS))) {
            return true;
        }
        ArrayList arrayList = sVar3.f49236k;
        if (!arrayList.contains(Integer.valueOf(i13))) {
            return true;
        }
        arrayList.remove(Integer.valueOf(i13));
        return true;
    }

    public final ek.e j8(int i13) {
        GestaltTabLayout gestaltTabLayout = this.f143018u0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        String string = getResources().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return b0.U(gestaltTabLayout, string, 0, 12);
    }

    public final boolean k8() {
        return ((Boolean) this.B0.getValue()).booleanValue();
    }

    public final void l8(int i13, int i14) {
        GestaltTabLayout gestaltTabLayout = this.f143018u0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e n13 = gestaltTabLayout.n(i13);
        Intrinsics.f(n13);
        View view = n13.f59129f;
        Intrinsics.f(view);
        GestaltTab gestaltTab = view instanceof GestaltTab ? (GestaltTab) view : null;
        if (gestaltTab != null) {
            gestaltTab.L(new d(i14, 0));
        }
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = zu1.d.fragment_notification_tab_host;
        wk2.a aVar = this.f143016s0;
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
        fo1.a i73;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.f143019v0 = ((GestaltIconButton) view.findViewById(zu1.c.notification_filter_button)).u(new np0.h(this, 21));
        View findViewById = view.findViewById(zu1.c.notification_filter_badge);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f143020w0 = (GestaltText) findViewById;
        if (k8()) {
            GestaltIconButton gestaltIconButton = this.f143019v0;
            if (gestaltIconButton == null) {
                Intrinsics.r("filterButton");
                throw null;
            }
            com.bumptech.glide.c.d0(gestaltIconButton);
            GestaltText gestaltText = this.f143020w0;
            if (gestaltText == null) {
                Intrinsics.r("filterBadge");
                throw null;
            }
            a0.k0(gestaltText);
        }
        View findViewById2 = view.findViewById(zu1.c.notification_tabs_layout);
        GestaltTabLayout gestaltTabLayout = (GestaltTabLayout) findViewById2;
        gestaltTabLayout.b(new iq0.c(this, 2));
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f143018u0 = gestaltTabLayout;
        v vVar = this.f143023z0;
        Object value = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        int q33 = ((h) value).q3();
        GestaltTabLayout gestaltTabLayout2 = this.f143018u0;
        if (gestaltTabLayout2 == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        gestaltTabLayout2.d(j8(zu1.e.notification_host_activities_tab), 0, q33 == 0);
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        if (f13 != null && dl2.b.G2(f13) && !k8()) {
            GestaltTabLayout gestaltTabLayout3 = this.f143018u0;
            if (gestaltTabLayout3 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            gestaltTabLayout3.d(j8(((Number) this.A0.getValue()).intValue()), 1, q33 == 1);
        }
        if (k8()) {
            GestaltTabLayout gestaltTabLayout4 = this.f143018u0;
            if (gestaltTabLayout4 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            gestaltTabLayout4.setVisibility(8);
        }
        Y7(new l(this, 3));
        b20.c b83 = b8();
        Object value2 = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        int q34 = ((h) value2).q3();
        Object obj = b83.f21278a;
        ((LockableViewPager) obj).A(q34);
        int dimensionPixelSize = getResources().getDimensionPixelSize(r0.following_tuner_view_pager_page_spacing);
        LockableViewPager lockableViewPager = (LockableViewPager) obj;
        int i13 = lockableViewPager.f19900m;
        lockableViewPager.f19900m = dimensionPixelSize;
        int width = lockableViewPager.getWidth();
        lockableViewPager.v(width, width, dimensionPixelSize, i13);
        lockableViewPager.requestLayout();
        if (j1.E1()) {
            LockableViewPager lockableViewPager2 = (LockableViewPager) b8().f21278a;
            lockableViewPager2.setPaddingRelative(lockableViewPager2.getPaddingStart(), lockableViewPager2.getPaddingTop(), lockableViewPager2.getPaddingEnd(), lockableViewPager2.getResources().getDimensionPixelOffset(r0.lego_floating_nav_20_icon_tap_target));
        }
        if (!k8() || (i73 = i7()) == null) {
            return;
        }
        S7(i73);
    }

    @Override // ha2.f
    public final void x2() {
        a.c.y(f7());
    }
}
