package kt0;

import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.k8;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final y f80864j = new y(0);

    /* renamed from: k, reason: collision with root package name */
    public static final y f80865k = new y(1);

    /* renamed from: l, reason: collision with root package name */
    public static final y f80866l = new y(2);

    /* renamed from: m, reason: collision with root package name */
    public static final y f80867m = new y(3);

    /* renamed from: n, reason: collision with root package name */
    public static final y f80868n = new y(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80869i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i13) {
        super(1);
        this.f80869i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f80869i) {
            case 0:
                BoardInviteFeed it = (BoardInviteFeed) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList = new ArrayList();
                Intrinsics.checkNotNullExpressionValue(it.q(), "getItems(...)");
                if (!r1.isEmpty()) {
                    for (k8 k8Var : it.q()) {
                        Intrinsics.f(k8Var);
                        arrayList.add(k8Var);
                    }
                }
                break;
            case 1:
                break;
            case 2:
                ((Function0) obj).invoke();
                break;
            case 3:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
