package uy;

import ey.o0;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends o0 {

    /* renamed from: d, reason: collision with root package name */
    public final s92.o f123256d;

    /* renamed from: e, reason: collision with root package name */
    public final d4 f123257e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f123258f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s92.o pwtResult) {
        super(22, 0);
        d4 viewType = d4.FLASHLIGHT;
        a4 a4Var = a4.PIN_FLASHLIGHT_RESULTS;
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f123256d = pwtResult;
        this.f123257e = viewType;
        this.f123258f = a4Var;
    }

    public final s92.o l() {
        return this.f123256d;
    }

    public final a4 m() {
        return this.f123258f;
    }

    public final d4 n() {
        return this.f123257e;
    }
}
