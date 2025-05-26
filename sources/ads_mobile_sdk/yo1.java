package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class yo1 extends jj2 {

    /* renamed from: f, reason: collision with root package name */
    public final a.t5 f14346f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo1(a.t5 source, ci2 importance, jh2 executionType, gj2 scope, long j13, Function0 function0) {
        super(source, importance, executionType, scope, j13, function0, 0);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(importance, "importance");
        Intrinsics.checkNotNullParameter(executionType, "executionType");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f14346f = source;
    }

    @Override // ads_mobile_sdk.jj2
    public final a.t5 b() {
        return this.f14346f;
    }

    public /* synthetic */ yo1(a.t5 t5Var, ci2 ci2Var, jh2 jh2Var, long j13) {
        this(t5Var, ci2Var, jh2Var, gj2.f5594a, j13, null, 0);
    }

    public /* synthetic */ yo1(a.t5 t5Var, ci2 ci2Var, jh2 jh2Var, gj2 gj2Var, long j13, Function0 function0, int i13) {
        this(t5Var, ci2Var, jh2Var, gj2Var, j13, function0);
    }
}
