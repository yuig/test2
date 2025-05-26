package bz;

import h32.a4;
import h32.d4;
import h32.i0;
import h32.w3;
import kotlin.jvm.internal.Intrinsics;
import nx.z0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public e f24173a;

    public final void a(String pinId, z0 auxData, String str, a4 a4Var) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        if (a4Var == null) {
            a4Var = a4.OFF_PINTEREST;
        }
        a4 a4Var2 = a4Var;
        if (this.f24173a == null) {
            d4 d4Var = d4.OFF_PINTEREST;
            w3 w3Var = new w3();
            w3Var.b(pinId);
            e eVar = new e(new i0(d4Var, a4Var2, w3Var.a(), null, null, null), pinId, auxData);
            this.f24173a = eVar;
            eVar.f24167b = str;
            eVar.h();
        }
    }
}
