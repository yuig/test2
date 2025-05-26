package zq1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f142661b;

    public /* synthetic */ d(j jVar, int i13) {
        this.f142660a = i13;
        this.f142661b = jVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f142660a;
        j this$0 = this.f142661b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!this$0.isBound()) {
                    this$0.f142700p = true;
                    break;
                } else {
                    ((yq1.k) ((b) this$0.getView())).j8(false);
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((yq1.k) ((b) this$0.getView())).j8(false);
                break;
        }
    }
}
