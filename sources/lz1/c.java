package lz1;

import com.pinterest.api.model.v7;
import dl1.s;
import i91.k0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lb0.r;
import pb0.i;

/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final r f85179a;

    public c(r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f85179a = prefsManagerUser;
    }

    public final boolean a(long j13, k0 upsellAfter, s model) {
        long a13;
        Intrinsics.checkNotNullParameter(upsellAfter, "upsellAfter");
        Intrinsics.checkNotNullParameter(model, "model");
        int i13 = b.f85178a[upsellAfter.ordinal()];
        r rVar = this.f85179a;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(model, "model");
            a13 = rVar.a(model instanceof v7 ? "PREF_SCREENSHOT_UPSELL_SEEN_AT_MS_2022_V1_BOARD" : "PREF_SCREENSHOT_UPSELL_SEEN_AT_MS_2022_V1", 0L);
        } else if (i13 == 2) {
            a13 = rVar.a("PREF_DOWNLOAD_UPSELL_LAST_SEEN_AT_MS_2022_V1", 0L);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            a13 = rVar.a("PREF_POST_CREATE_UPSELL_SEEN_AT_MS", 0L);
        }
        return j13 - a13 < i.DAYS.getMilliseconds();
    }
}
