package ps;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f101227b;

    public /* synthetic */ f(int i13, Function0 function0) {
        this.f101226a = i13;
        this.f101227b = function0;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f101226a;
        Function0 tmp0 = this.f101227b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            default:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
        }
    }
}
