package cp;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f52920a;

    public c(f fVar) {
        this.f52920a = fVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f fVar = this.f52920a;
        View z13 = fVar.n8().f19650a.z(event.f80536a);
        if (z13 != null) {
            RecyclerView g83 = fVar.g8();
            a.c.p(g83 != null ? g83.H0(z13) : null);
        }
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull kp.g event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        int i13 = event.f80537a;
        boolean z13 = i13 != -1;
        View view = event.f80538b;
        f fVar = this.f52920a;
        if (z13 && (str = event.f80539c) != null && view == null) {
            View z14 = fVar.n8().f19650a.z(i13);
            if (z14 != null) {
                RecyclerView g83 = fVar.g8();
                if ((g83 != null ? g83.H0(z14) : null) != null) {
                    kp.m mVar = fVar.S0;
                    if (mVar != null) {
                        String string = fVar.getResources().getString(yc0.e.contact_request_message_declined);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        mVar.a(string, str, event.f80537a, null, z14, fVar.s7());
                        return;
                    }
                    Intrinsics.r("contactRequestUtils");
                    throw null;
                }
                return;
            }
            return;
        }
        if (view == null) {
            if (i13 != -1) {
                jp.c cVar = fVar.Z0;
                if (cVar != null) {
                    cVar.getDataSources().get(0).removeItem(i13);
                }
                yq0.z zVar = (yq0.z) fVar.f139732f0;
                if (zVar != null) {
                    zVar.h();
                    return;
                }
                return;
            }
            fVar.V1();
            return;
        }
        if (fVar.S0 != null) {
            View findViewById = view.findViewById(nb2.b.decline_preview_buttons_container);
            View findViewById2 = view.findViewById(nb2.b.block_report_buttons_container);
            if (findViewById == null || findViewById2 == null) {
                return;
            }
            if (findViewById.getVisibility() == 0) {
                k3.R1(findViewById, false);
                k3.R1(findViewById2, true);
                return;
            } else {
                k3.R1(findViewById, true);
                k3.R1(findViewById2, false);
                return;
            }
        }
        Intrinsics.r("contactRequestUtils");
        throw null;
    }
}
