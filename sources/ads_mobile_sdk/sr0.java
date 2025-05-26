package ads_mobile_sdk;

import a.l7;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class sr0 implements l7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ix2 f11202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f11203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sb2 f11204c;

    public sr0(ix2 ix2Var, j0 j0Var, sb2 sb2Var) {
        this.f11202a = ix2Var;
        this.f11203b = j0Var;
        this.f11204c = sb2Var;
    }

    @Override // a.l7
    public final Unit a() {
        ix2 ix2Var = this.f11202a;
        j0 backgroundScope = this.f11203b;
        sb2 rootTraceCreator = this.f11204c;
        ix2Var.getClass();
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        ix2Var.f6576d = backgroundScope;
        ix2Var.f6577e = rootTraceCreator;
        return Unit.f80348a;
    }
}
