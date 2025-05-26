package kt0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80802i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e0 f80803j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f80804k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(e0 e0Var, List list, int i13) {
        super(0);
        this.f80802i = i13;
        this.f80803j = e0Var;
        this.f80804k = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List boardInvites = this.f80804k;
        e0 e0Var = this.f80803j;
        int i13 = this.f80802i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullExpressionValue(boardInvites, "$boardInvites");
                        e0Var.z3(boardInvites);
                        break;
                    default:
                        Intrinsics.checkNotNullExpressionValue(boardInvites, "$conversations");
                        e0Var.B3(boardInvites);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullExpressionValue(boardInvites, "$boardInvites");
                        e0Var.z3(boardInvites);
                        break;
                    default:
                        Intrinsics.checkNotNullExpressionValue(boardInvites, "$conversations");
                        e0Var.B3(boardInvites);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
