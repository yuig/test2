package y82;

import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.g4;
import lh0.z3;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final wr.c f138064a;

    /* renamed from: b, reason: collision with root package name */
    public final g4 f138065b;

    public a(wr.d adFormatsLogger, g4 targetHandshakeLibraryExperiments) {
        Intrinsics.checkNotNullParameter(adFormatsLogger, "adFormatsLogger");
        Intrinsics.checkNotNullParameter(targetHandshakeLibraryExperiments, "targetHandshakeLibraryExperiments");
        this.f138064a = adFormatsLogger;
        this.f138065b = targetHandshakeLibraryExperiments;
    }

    public final boolean a() {
        g4 g4Var = this.f138065b;
        g4Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) g4Var.f83375a;
        return g1Var.o("android_target_account_linking_logging", "enabled", z3Var) || g1Var.l("android_target_account_linking_logging");
    }
}
