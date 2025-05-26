package mp1;

import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.o1;
import lh0.z3;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final wr.c f87919a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f87920b;

    public a(wr.d adFormatsLogger, o1 handshakeExperiments) {
        Intrinsics.checkNotNullParameter(adFormatsLogger, "adFormatsLogger");
        Intrinsics.checkNotNullParameter(handshakeExperiments, "handshakeExperiments");
        this.f87919a = adFormatsLogger;
        this.f87920b = handshakeExperiments;
    }

    public final boolean a() {
        o1 o1Var = this.f87920b;
        o1Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) o1Var.f83447a;
        return g1Var.o("android_handshake_json_logging", "enabled", z3Var) || g1Var.l("android_handshake_json_logging");
    }
}
