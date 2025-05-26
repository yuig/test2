package l81;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f82118b;

    public /* synthetic */ c(l lVar, int i13) {
        this.f82117a = i13;
        this.f82118b = lVar;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        int i13 = this.f82117a;
        l this$0 = this.f82118b;
        switch (i13) {
            case 0:
                int i14 = l.Q2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                break;
            default:
                int i15 = l.Q2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                break;
        }
        return (i0) this$0.f82161h1.getValue();
    }
}
