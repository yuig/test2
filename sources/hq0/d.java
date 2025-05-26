package hq0;

import android.view.View;
import com.pinterest.gestalt.tabs.GestaltTab;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import eq0.g;
import eq0.h;
import eq0.i;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import sp2.k;
import vb0.j;

/* loaded from: classes5.dex */
public final class d implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f69914a;

    public d(e eVar) {
        this.f69914a = eVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e eVar = this.f69914a;
        if (eVar.isBound()) {
            ((nl1.d) ((eq0.f) eVar.getView())).D5();
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e eVar = this.f69914a;
        if (eVar.isBound()) {
            GestaltTabLayout gestaltTabLayout = ((iq0.e) ((eq0.f) eVar.getView())).f73395r0;
            if (gestaltTabLayout != null) {
                ek.e n13 = gestaltTabLayout.n(0);
                Intrinsics.f(n13);
                View view = n13.f59129f;
                Intrinsics.f(view);
                if (view instanceof GestaltTab) {
                    ((GestaltTab) view).L(iq0.d.f73394i);
                    return;
                } else {
                    j.f125466a.G(a.a.h("Unknown tab type: ", view.getClass()), new Object[0]);
                    return;
                }
            }
            Intrinsics.r("tabLayout");
            throw null;
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i clickEvent) {
        Intrinsics.checkNotNullParameter(clickEvent, "clickEvent");
        e eVar = this.f69914a;
        if (eVar.isBound()) {
            ((iq0.e) ((eq0.f) eVar.getView())).j8(0);
        }
    }
}
