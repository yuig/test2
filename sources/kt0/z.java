package kt0;

import com.pinterest.framework.screens.ScreenLocation;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f80870a;

    public z(e0 e0Var) {
        this.f80870a = e0Var;
    }

    @sp2.k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull r70.m tabDeepLinkEvent) {
        e s33;
        Intrinsics.checkNotNullParameter(tabDeepLinkEvent, "tabDeepLinkEvent");
        if (tabDeepLinkEvent.f106397a != u70.a.HOME) {
            return;
        }
        e0 e0Var = this.f80870a;
        e0Var.f80808b.i(tabDeepLinkEvent);
        if (!e0Var.f80824r) {
            e0Var.f80825s = tabDeepLinkEvent;
            return;
        }
        ScreenLocation tabLocation = (ScreenLocation) tabDeepLinkEvent.f106398b.getParcelable("EXTRAS_KEY_INITIAL_SELECTED_TAB_LOCATION");
        if (tabLocation != null) {
            lr.f.f84504g = true;
            lr.d0.f84486g.getClass();
            lr.d0.f84487h = true;
            Intrinsics.checkNotNullParameter(tabLocation, "tabLocation");
            if (!e0Var.isBound() || e0Var.f80816j.isEmpty() || e0Var.f80816j.size() == 1) {
                return;
            }
            Set b13 = g1.b(tabLocation);
            Iterator it = e0Var.f80816j.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                Set set = b13;
                wk2.a aVar = ((lt0.e) it.next()).f84781a;
                if (CollectionsKt.L(set, aVar != null ? (ScreenLocation) aVar.get() : null)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 < 0 || (s33 = e0Var.s3()) == null) {
                return;
            }
            ((q) s33).s8(Integer.valueOf(i13));
        }
    }
}
