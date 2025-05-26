package lh0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83341a;

    public f0(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83341a = experimentsActivator;
    }

    public final boolean a() {
        Intrinsics.checkNotNullParameter("enabled_pullup_no_x", "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) this.f83341a).h("android_curation_collage_composer_drawer_pullup", y0.f83512b);
        if (h10 != null) {
            return (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, "enabled_pullup_no_x", false);
        }
        return false;
    }
}
