package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class o0 implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f104318b;

    public /* synthetic */ o0(p0 p0Var, int i13) {
        this.f104317a = i13;
        this.f104318b = p0Var;
    }

    @Override // nx.a
    public final h32.i0 generateLoggingContext() {
        int i13 = this.f104317a;
        p0 this$0 = this.f104318b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                break;
        }
        return this$0.s7().p();
    }
}
