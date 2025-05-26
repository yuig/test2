package ti1;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f117712b;

    public /* synthetic */ g(o oVar, int i13) {
        this.f117711a = i13;
        this.f117712b = oVar;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        int i13 = this.f117711a;
        o this$0 = this.f117712b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                break;
        }
        return this$0.f117728b.p();
    }
}
