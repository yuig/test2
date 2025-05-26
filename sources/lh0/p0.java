package lh0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0 f83455a;

    public p0(z0 experimentsActivator) {
        Intrinsics.checkNotNullParameter(experimentsActivator, "experimentsActivator");
        this.f83455a = experimentsActivator;
    }

    public final boolean a() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83455a;
        return ((g1) z0Var).o("android_message_composer_redesign", "enabled", z3Var) || ((g1) z0Var).l("android_message_composer_redesign");
    }

    public final boolean b() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83455a;
        return ((g1) z0Var).o("android_message_composer_redesign", "enabled", z3Var) || ((g1) z0Var).l("android_message_composer_redesign");
    }

    public final boolean c() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83455a;
        return ((g1) z0Var).o("android_unified_inbox", "enabled", z3Var) || ((g1) z0Var).l("android_unified_inbox");
    }

    public final boolean d() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83455a;
        return ((g1) z0Var).o("sg_android_message_reply_entrypoint_gb_closeup", "enabled", z3Var) || ((g1) z0Var).l("sg_android_message_reply_entrypoint_gb_closeup");
    }

    public final boolean e() {
        z3 z3Var = a4.f83297a;
        z0 z0Var = this.f83455a;
        return ((g1) z0Var).o("sg_android_reply_to_external_share_in_conversation", "enabled", z3Var) || ((g1) z0Var).l("sg_android_reply_to_external_share_in_conversation");
    }

    public final boolean f() {
        z3 z3Var = a4.f83298b;
        z0 z0Var = this.f83455a;
        return ((g1) z0Var).o("sg_android_unified_inbox_compose_icon", "enabled", z3Var) || ((g1) z0Var).l("sg_android_unified_inbox_compose_icon");
    }
}
