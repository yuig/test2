package mp;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;

/* loaded from: classes3.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87856i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f87857j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i13) {
        super(1);
        this.f87856i = i13;
        this.f87857j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f87856i;
        i iVar = this.f87857j;
        switch (i13) {
            case 0:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                List list = (List) pair.f80346a;
                List list2 = (List) pair.f80347b;
                List list3 = list;
                int value = y32.c.EMPTY_INBOX_SUGGESTION.getValue();
                no1.e eVar = iVar.f87865g;
                if (eVar != null) {
                    return oo1.j.a(list3, list2, null, null, value, eVar);
                }
                Intrinsics.r("conversationRemoteDatasource");
                throw null;
            case 1:
                z40.n nVar = (z40.n) obj;
                w wVar = iVar.f87863e;
                if (wVar != null) {
                    oo1.j.s(wVar, null, nVar);
                    return Unit.f80348a;
                }
                Intrinsics.r("eventManager");
                throw null;
            default:
                String string = iVar.getResources().getString(x0.pinmarklet_generic_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                oo1.j.r(string, (Throwable) obj);
                return Unit.f80348a;
        }
    }
}
