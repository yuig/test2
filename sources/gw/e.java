package gw;

import ads_mobile_sdk.yy0;
import ao2.m;
import ao2.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xk2.q;
import xk2.s;

/* loaded from: classes3.dex */
public final class e implements xi.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f66194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f66195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f66196c;

    public e(f fVar, w1.a aVar, o oVar) {
        this.f66194a = fVar;
        this.f66195b = aVar;
        this.f66196c = oVar;
    }

    public final void a(yy0 status) {
        Intrinsics.checkNotNullParameter(status, "status");
        f fVar = this.f66194a;
        ((hw.a) fVar.f66199c).a(hw.b.SDK_INITIALIZED);
        fVar.f66200d = true;
        this.f66195b.invoke(Integer.valueOf(status.getAdapterStatusMap().size()), -1);
        q qVar = s.f135225b;
        this.f66196c.resumeWith(Boolean.TRUE);
    }
}
