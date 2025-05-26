package uy;

import ey.o0;
import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends o0 {

    /* renamed from: d, reason: collision with root package name */
    public final s92.o f123262d;

    /* renamed from: e, reason: collision with root package name */
    public final d4 f123263e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f123264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(s92.o pwtResult) {
        super(26, 0);
        d4 viewType = d4.FLASHLIGHT_CAMERA;
        a4 a4Var = a4.FLASHLIGHT_CAMERA_SEARCH_RESULTS;
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f123262d = pwtResult;
        this.f123263e = viewType;
        this.f123264f = a4Var;
    }

    public final s92.o l() {
        return this.f123262d;
    }

    public final a4 m() {
        return this.f123264f;
    }

    public final d4 n() {
        return this.f123263e;
    }
}
