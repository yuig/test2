package zq1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class k implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f142703b;

    public /* synthetic */ k(o oVar, int i13) {
        this.f142702a = i13;
        this.f142703b = oVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f142702a;
        o this$0 = this.f142703b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                q qVar = (q) this$0.getViewIfBound();
                if (qVar != null) {
                    yq1.u uVar = (yq1.u) qVar;
                    uVar.d8(false);
                    uVar.e8(true);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((yq1.u) ((q) this$0.getView())).d8(false);
                break;
        }
    }
}
