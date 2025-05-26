package kt0;

import android.content.Context;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.z1;
import java.util.Iterator;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f80834a;

    public k(q qVar) {
        this.f80834a = qVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull dg0.k tabTooltipClickedEvent) {
        Intrinsics.checkNotNullParameter(tabTooltipClickedEvent, "tabTooltipClickedEvent");
        q qVar = this.f80834a;
        q.p8(qVar.H0);
        e0 e0Var = qVar.H0;
        Integer num = null;
        if (e0Var != null) {
            ScreenLocation screenLocation = (ScreenLocation) z1.f51664a.getValue();
            Iterator it = e0Var.f80816j.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                wk2.a aVar = ((lt0.e) it.next()).f84781a;
                if (Intrinsics.d(aVar != null ? (ScreenLocation) aVar.get() : null, screenLocation)) {
                    break;
                } else {
                    i13++;
                }
            }
            num = Integer.valueOf(Math.max(0, i13));
        }
        qVar.s8(num);
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull ls1.l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = j.f80833a[event.f84698i.ordinal()];
        q qVar = this.f80834a;
        if (i13 == 1) {
            int i14 = q.R0;
            qVar.b8().x(true);
        } else {
            if (i13 != 2) {
                return;
            }
            int i15 = q.R0;
            qVar.b8().x(false);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pf1.a fadeIdeaPinChromeEvent) {
        Intrinsics.checkNotNullParameter(fadeIdeaPinChromeEvent, "fadeIdeaPinChromeEvent");
        boolean z13 = fadeIdeaPinChromeEvent.f100011a;
        TabLayout[] tabLayoutArr = new TabLayout[1];
        TabLayout tabLayout = this.f80834a.f80855z0;
        if (tabLayout != null) {
            tabLayoutArr[0] = tabLayout;
            kg.a.V(kotlin.collections.c0.A(tabLayoutArr), z13);
        } else {
            Intrinsics.r("tabLayout");
            throw null;
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull pg0.f0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        q qVar = this.f80834a;
        qVar.f7().i(event);
        qVar.s8(0);
        qVar.B0 = true;
        qVar.P4(null);
        i92.k kVar = qVar.f80853x0;
        if (kVar != null) {
            kVar.o(qVar.getString(wp1.f.homefeed_tuner_complete_toast_message));
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull te1.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        q qVar = this.f80834a;
        qVar.f7().i(event);
        View view = qVar.A0;
        View findViewById = view != null ? view.findViewById(wp1.d.hf_tuner_icon) : null;
        if (!event.f117499a) {
            int k03 = k3.k0(qVar.requireContext());
            TabLayout tabLayout = qVar.f80855z0;
            if (tabLayout != null) {
                tabLayout.setPaddingRelative(tabLayout.getPaddingStart(), k03, tabLayout.getPaddingEnd(), tabLayout.getPaddingBottom());
                if (findViewById != null) {
                    findViewById.setPaddingRelative(findViewById.getPaddingStart(), k03, findViewById.getPaddingEnd(), findViewById.getPaddingBottom());
                }
                Context requireContext = qVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                q.n8(qVar, dl2.b.x0(requireContext, eo1.a.base_color_grayscale_0), true);
            } else {
                Intrinsics.r("tabLayout");
                throw null;
            }
        } else {
            TabLayout tabLayout2 = qVar.f80855z0;
            if (tabLayout2 != null) {
                tabLayout2.setPaddingRelative(tabLayout2.getPaddingStart(), 0, tabLayout2.getPaddingEnd(), tabLayout2.getPaddingBottom());
                if (findViewById != null) {
                    findViewById.setPaddingRelative(findViewById.getPaddingStart(), 0, findViewById.getPaddingEnd(), findViewById.getPaddingBottom());
                }
                Context requireContext2 = qVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                q.n8(qVar, dl2.b.x0(requireContext2, eo1.a.comp_text_color_default), ((Boolean) qVar.F0.getValue()).booleanValue());
            } else {
                Intrinsics.r("tabLayout");
                throw null;
            }
        }
        qVar.f7().f(new te1.a(event.f117499a));
    }
}
