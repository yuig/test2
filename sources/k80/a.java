package k80;

import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.y;
import lh0.z3;
import wr.c;
import wr.d;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f78589a;

    /* renamed from: b, reason: collision with root package name */
    public final y f78590b;

    public a(d adFormatsLogger, y cartingLibraryExperiments) {
        Intrinsics.checkNotNullParameter(adFormatsLogger, "adFormatsLogger");
        Intrinsics.checkNotNullParameter(cartingLibraryExperiments, "cartingLibraryExperiments");
        this.f78589a = adFormatsLogger;
        this.f78590b = cartingLibraryExperiments;
    }

    public final boolean a() {
        y yVar = this.f78590b;
        yVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) yVar.f83510a;
        return g1Var.o("android_ads_carting_logging_killswitch", "enabled", z3Var) || g1Var.l("android_ads_carting_logging_killswitch");
    }
}
