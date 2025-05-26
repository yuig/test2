package kh2;

import io.embrace.android.embracesdk.internal.api.delegate.FlutterInternalInterfaceImpl;
import io.embrace.android.embracesdk.internal.api.delegate.UnityInternalInterfaceImpl;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class e1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79468i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ lf2.i f79469j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f1 f79470k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v2 f79471l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b1 f79472m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(lf2.i iVar, f1 f1Var, v2 v2Var, b1 b1Var, int i13) {
        super(0);
        this.f79468i = i13;
        this.f79469j = iVar;
        this.f79470k = f1Var;
        this.f79471l = v2Var;
        this.f79472m = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79468i;
        lf2.i iVar = this.f79469j;
        b1 b1Var = this.f79472m;
        v2 v2Var = this.f79471l;
        f1 f1Var = this.f79470k;
        switch (i13) {
            case 0:
                return new FlutterInternalInterfaceImpl(iVar, f1Var.a(), ((y2) v2Var).b(), ((d1) b1Var).f79456b);
            default:
                return new UnityInternalInterfaceImpl(iVar, f1Var.a(), ((y2) v2Var).b(), ((d1) b1Var).f79456b);
        }
    }
}
