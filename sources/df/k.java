package df;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public Uri f54778a;

    public k(String action, Bundle bundle) {
        Uri n13;
        Intrinsics.checkNotNullParameter(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        if (Intrinsics.d(action, "context_choose")) {
            int i13 = c1.f54739a;
            le.v vVar = le.v.f83104a;
            n13 = j1.u(t3.s1.d(new Object[]{"fb.gg"}, 1, "%s", "java.lang.String.format(format, *args)"), Intrinsics.n(action, "/dialog/"), bundle);
        } else {
            n13 = me.f.n(action, bundle);
        }
        this.f54778a = n13;
    }
}
