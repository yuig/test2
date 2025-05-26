package uy;

import ey.o0;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 extends o0 {

    /* renamed from: d, reason: collision with root package name */
    public final s92.o f123250d;

    /* renamed from: e, reason: collision with root package name */
    public final d4 f123251e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f123252f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(s92.o pwtResult) {
        super(29, 0);
        d4 viewType = d4.PINCH_TO_ZOOM;
        a4 a4Var = a4.FLASHLIGHT_PINCH_TO_ZOOM;
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f123250d = pwtResult;
        this.f123251e = viewType;
        this.f123252f = a4Var;
    }

    public final s92.o l() {
        return this.f123250d;
    }

    public final a4 m() {
        return this.f123252f;
    }

    public final d4 n() {
        return this.f123251e;
    }
}
