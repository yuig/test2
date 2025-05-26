package q91;

import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class z0 implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f103191a;

    public z0(a1 a1Var) {
        this.f103191a = a1Var;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull p91.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        bd1.b apiFieldName = event.f99295a;
        a1 a1Var = this.f103191a;
        a1Var.getClass();
        Intrinsics.checkNotNullParameter(apiFieldName, "apiFieldName");
        String apiFieldValue = event.f99296b;
        Intrinsics.checkNotNullParameter(apiFieldValue, "apiFieldValue");
        int i13 = y0.f103187a[apiFieldName.ordinal()];
        if (i13 == 1) {
            a1Var.Y7(apiFieldValue);
            return;
        }
        if (i13 != 2) {
            return;
        }
        GestaltText gestaltText = a1Var.f103058e0;
        if (gestaltText == null) {
            Intrinsics.r("languageSelected");
            throw null;
        }
        String str = (String) bd1.e.b().get(apiFieldValue);
        if (str == null) {
            str = "";
        }
        pk.a0.p(gestaltText, str);
    }
}
