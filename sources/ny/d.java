package ny;

import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends ey.o0 {

    /* renamed from: d, reason: collision with root package name */
    public final s92.o f92513d;

    /* renamed from: e, reason: collision with root package name */
    public final d4 f92514e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f92515f;

    /* renamed from: g, reason: collision with root package name */
    public final int f92516g;

    /* renamed from: h, reason: collision with root package name */
    public final f f92517h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f92518i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(s92.o pwtResult, d4 viewType, a4 viewParameterType, int i13, f fVar, boolean z13, int i14) {
        super(8, 0);
        viewType = (i14 & 2) != 0 ? d4.FEED : viewType;
        viewParameterType = (i14 & 4) != 0 ? a4.FEED_HOME : viewParameterType;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        fVar = (i14 & 16) != 0 ? null : fVar;
        z13 = (i14 & 32) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        this.f92513d = pwtResult;
        this.f92514e = viewType;
        this.f92515f = viewParameterType;
        this.f92516g = i13;
        this.f92517h = fVar;
        this.f92518i = z13;
    }
}
