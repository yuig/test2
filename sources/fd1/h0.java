package fd1;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61924i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f61925j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(i0 i0Var, int i13) {
        super(1);
        this.f61924i = i13;
        this.f61925j = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f61924i;
        i0 i0Var = this.f61925j;
        switch (i13) {
            case 0:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                List list = (List) pair.f80346a;
                List list2 = (List) pair.f80347b;
                List list3 = list;
                int value = y32.c.NEW_MESSAGE.getValue();
                no1.e eVar = i0Var.f61951f;
                if (eVar != null) {
                    return oo1.j.a(list3, list2, null, null, value, eVar);
                }
                Intrinsics.r("graphQLConversationRemoteDataSource");
                throw null;
            default:
                z40.n nVar = (z40.n) obj;
                m60.w wVar = i0Var.f61950e;
                if (wVar != null) {
                    oo1.j.s(wVar, null, nVar);
                    return Unit.f80348a;
                }
                Intrinsics.r("eventManager");
                throw null;
        }
    }
}
