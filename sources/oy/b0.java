package oy;

import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 extends ey.w1 {

    /* renamed from: e, reason: collision with root package name */
    public final d4 f98005e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f98006f;

    /* renamed from: g, reason: collision with root package name */
    public final s92.o f98007g;

    /* renamed from: h, reason: collision with root package name */
    public final String f98008h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d4 viewType, a4 a4Var, s92.o pwtResult, String str, int i13) {
        super(4, 0);
        a4Var = (i13 & 2) != 0 ? null : a4Var;
        str = (i13 & 8) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f98005e = viewType;
        this.f98006f = a4Var;
        this.f98007g = pwtResult;
        this.f98008h = str;
    }
}
