package zq1;

import kotlin.jvm.internal.Intrinsics;
import yq1.y0;

/* loaded from: classes4.dex */
public final /* synthetic */ class t implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f142728b;

    public /* synthetic */ t(v vVar, int i13) {
        this.f142727a = i13;
        this.f142728b = vVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f142727a;
        v this$0 = this.f142728b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((y0) ((s) this$0.getView())).b8(yk1.i.LOADED, -1);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    y0 y0Var = (y0) ((s) this$0.getView());
                    m60.w f73 = y0Var.f7();
                    String string = y0Var.getString(vq1.d.two_factor_verification_code_resent);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    f73.d(new i92.i(new i92.g(string)));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((y0) ((s) this$0.getView())).b8(yk1.i.LOADED, -1);
                break;
        }
    }
}
