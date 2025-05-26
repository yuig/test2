package lh0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83492a;

    public v2(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83492a = experimentsActivator;
    }

    public final boolean a(String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83492a).h("android_push_collapsed_stacked_images", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, keyWord, false);
        }
        return false;
    }

    public final boolean b() {
        Intrinsics.checkNotNullParameter("no_action", "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83492a).h("android_push_notification_expanded_no_text", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, "no_action", false);
        }
        return false;
    }
}
