package kc1;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79150i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Set f79151j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f79152k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Set set, boolean z13, int i13) {
        super(1);
        this.f79150i = i13;
        this.f79151j = set;
        this.f79152k = z13;
    }

    public final n b(n priorDisplayState) {
        int i13 = this.f79150i;
        boolean z13 = this.f79152k;
        Set set = this.f79151j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
                return n.e(priorDisplayState, set.isEmpty() ? new k(z13) : new l(set, z13), 0, null, null, 14);
            default:
                Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
                return n.e(priorDisplayState, new l(set, z13), 0, null, null, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f79150i) {
        }
        return b((n) obj);
    }
}
