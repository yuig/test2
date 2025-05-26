package zq1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f142655b;

    public /* synthetic */ b0(f0 f0Var, int i13) {
        this.f142654a = i13;
        this.f142655b = f0Var;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f142654a;
        f0 this$0 = this.f142655b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ep.b.C(null, this$0.f142671d);
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ep.b.C(null, this$0.f142671d);
                break;
        }
    }
}
