package us0;

import com.pinterest.feature.core.view.MvpViewPagerFragment;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import h32.f1;
import h32.i0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import tb0.p;
import uj2.q;
import vb0.j;
import xk2.m;
import xk2.v;
import yk1.n;
import yk1.r;
import yk1.t;
import yq0.k;

/* loaded from: classes5.dex */
public final class d extends t {

    /* renamed from: a, reason: collision with root package name */
    public int f123082a;

    /* renamed from: b, reason: collision with root package name */
    public final v f123083b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uk1.d pinalytics, q networkStateStream, b20.c experimentsV2Helper) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(experimentsV2Helper, "experimentsV2Helper");
        this.f123082a = -1;
        this.f123083b = m.b(new k(experimentsV2Helper, 23));
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        rs0.c view = (rs0.c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((ht0.m) view).f70129y0 = this;
    }

    public final ArrayList p3() {
        int i13;
        int i14;
        el2.a<e> entries = e.getEntries();
        ArrayList arrayList = new ArrayList(g0.q(entries, 10));
        for (e eVar : entries) {
            int[] iArr = c.f123081a;
            int i15 = iArr[eVar.ordinal()];
            if (i15 == 1) {
                i13 = xp1.d.homefeed_tuner_activity_tab_experiment_uup;
            } else if (i15 == 2) {
                i13 = xp1.d.homefeed_tuner_interests_tab;
            } else if (i15 == 3) {
                i13 = xp1.d.homefeed_tuner_boards_tab;
            } else {
                if (i15 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = xp1.d.homefeed_tuner_following_tab;
            }
            int i16 = iArr[eVar.ordinal()];
            if (i16 == 1) {
                i14 = q3() ? xp1.d.home_feed_tuner_v2_pins_description : xp1.d.homefeed_tuner_pins_description;
            } else if (i16 == 2) {
                i14 = q3() ? xp1.d.home_feed_tuner_v2_interests_description : xp1.d.homefeed_tuner_interests_description_experiment_uup;
            } else if (i16 == 3) {
                i14 = xp1.d.homefeed_tuner_boards_description;
            } else {
                if (i16 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = q3() ? xp1.d.home_feed_tuner_v2_following_description : xp1.d.homefeed_tuner_following_description;
            }
            arrayList.add(new ht0.v(eVar.ordinal(), i13, i14));
        }
        return arrayList;
    }

    public final boolean q3() {
        return ((Boolean) this.f123083b.getValue()).booleanValue();
    }

    public final void r3(int i13, f1 eventType) {
        Object obj;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        int i14 = this.f123082a;
        f0 f0Var = j.f125466a;
        if (i14 == -1) {
            f0Var.F("Current Tab Index has not been initialized", p.HOME_FEED, new Object[0]);
            return;
        }
        if (i13 < 0 || i13 > kotlin.collections.f0.i(e.getEntries())) {
            f0Var.G(a.a.d("Unsupported tab index = ", i13), new Object[0]);
            return;
        }
        if (this.f123082a == i13) {
            return;
        }
        Iterator<E> it = e.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (i13 == ((e) obj).ordinal()) {
                    break;
                }
            }
        }
        e eVar = (e) obj;
        if (eVar != null) {
            getPinalytics().U(new i0(((MvpViewPagerFragment) ((rs0.c) getView())).getF117885e1(), eVar.getViewParameterType(), null, h32.g0.TAB_CAROUSEL, null, eVar.getElementType()), eventType, null, null, null, false);
        }
        this.f123082a = i13;
        ht0.m mVar = (ht0.m) ((rs0.c) getView());
        mVar.b8().w(i13, true);
        GestaltTabLayout gestaltTabLayout = mVar.f70127w0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ek.e n13 = gestaltTabLayout.n(i13);
        if (n13 != null) {
            n13.b();
        }
    }

    public final void s3(int i13) {
        this.f123082a = i13;
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        rs0.c view = (rs0.c) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((ht0.m) view).f70129y0 = this;
    }
}
