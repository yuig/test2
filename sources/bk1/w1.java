package bk1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23369i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0 f23370j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(q0 q0Var, int i13) {
        super(1);
        this.f23369i = i13;
        this.f23370j = q0Var;
    }

    public final a2 b(a2 it) {
        int i13 = this.f23369i;
        q0 q0Var = this.f23370j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return a2.b(it, null, false, false, null, null, 0, ((u) q0Var).f23346a, null, null, null, false, false, null, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, false, false, -2049, 524287);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                s sVar = (s) q0Var;
                return a2.b(it, null, false, false, null, null, 0, false, new b2(sVar.f23315a, sVar.f23316b, sVar.f23317c), null, null, false, false, null, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, false, false, -4097, 524287);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return a2.b(it, null, false, false, null, null, 0, false, null, null, null, false, false, null, null, ((y) q0Var).f23375a, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, false, false, -1048577, 524287);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23369i) {
        }
        return b((a2) obj);
    }
}
