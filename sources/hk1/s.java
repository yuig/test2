package hk1;

import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ni1.e0;
import u50.b0;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final s f69367j = new s(0);

    /* renamed from: k, reason: collision with root package name */
    public static final s f69368k = new s(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69369i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i13) {
        super(1);
        this.f69369i = i13;
    }

    public final g b(g state) {
        switch (this.f69369i) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                return g.e(CollectionsKt.m0(new ak1.b(new b0(e0.f90646e), "carousel_index_tracker"), state.f69351a));
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                q0 q0Var = q0.f80391a;
                state.getClass();
                return g.e(q0Var);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f69369i) {
        }
        return b((g) obj);
    }
}
