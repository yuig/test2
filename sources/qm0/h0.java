package qm0;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import o82.o2;

/* loaded from: classes5.dex */
public final /* synthetic */ class h0 implements o2, nx.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f104278b;

    public /* synthetic */ h0(p0 p0Var, int i13) {
        this.f104277a = i13;
        this.f104278b = p0Var;
    }

    @Override // nx.h1
    public final HashMap f() {
        p0 this$0 = this.f104278b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.s7().f();
    }

    @Override // o82.o2
    public final Object invoke(Object obj) {
        int i13 = this.f104277a;
        p0 this$0 = this.f104278b;
        switch (i13) {
            case 0:
                a vmState = (a) obj;
                int i14 = p0.f104322d1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return tm0.f.c(vmState, (om0.b0) this$0.V0.getValue());
            default:
                k2 vmState2 = (k2) obj;
                int i15 = p0.f104322d1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                return tm0.f.b(vmState2, (om0.b0) this$0.V0.getValue());
        }
    }
}
