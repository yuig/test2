package xo;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f135570b;

    public /* synthetic */ x(i iVar, int i13) {
        this.f135569a = i13;
        this.f135570b = iVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f135569a;
        i this$0 = this.f135570b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                uj2.b.n(500L, TimeUnit.MILLISECONDS, tk2.e.f118016b).l(tk2.e.f118017c).h(wj2.c.a()).i(new x(this$0, 1), new vo.a(12, f.f135501o));
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d0 d0Var = (d0) this$0.f135522l;
                if (d0Var != null) {
                    d0Var.V1();
                    break;
                }
                break;
        }
    }
}
