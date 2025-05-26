package bk1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23373i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0 f23374j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(q0 q0Var, int i13) {
        super(1);
        this.f23373i = i13;
        this.f23374j = q0Var;
    }

    public final a2 b(a2 it) {
        int i13 = this.f23373i;
        q0 q0Var = this.f23374j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return a2.b(it, null, false, false, null, null, 0, false, null, null, null, false, false, null, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, ((a0) q0Var).f23151a, false, null, null, false, false, false, false, -1, 523775);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return a2.b(it, null, false, false, null, null, ((w) q0Var).f23367a, false, null, null, null, false, false, null, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, false, false, -513, 524287);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return a2.b(it, null, false, false, null, null, 0, false, null, null, null, false, false, null, ((t) q0Var).f23327a, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, false, false, -524289, 524287);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23373i) {
        }
        return b((a2) obj);
    }
}
