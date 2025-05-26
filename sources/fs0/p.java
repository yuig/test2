package fs0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class p implements ak2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f62889b;

    public /* synthetic */ p(w wVar, int i13) {
        this.f62888a = i13;
        this.f62889b = wVar;
    }

    @Override // ak2.a
    public final void run() {
        int i13 = this.f62888a;
        w this$0 = this.f62889b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.u3();
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f62914m.k(kw0.b.pin_remove_products_success);
                this$0.u3();
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.u3();
                gb2.f fVar = gb2.f.f64747a;
                String str = this$0.K;
                if (str != null) {
                    gb2.f.c(new gb2.i(str, wa2.p.STATE_GEN_AI_TOPIC_OPT_OUT, wa2.o.BOTH));
                    return;
                } else {
                    Intrinsics.r("pinUid");
                    throw null;
                }
        }
    }
}
