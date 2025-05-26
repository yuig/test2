package u80;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q1.x;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120976i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f120977j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f120978k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i13, List list, Function1 function1) {
        super(1);
        this.f120976i = i13;
        this.f120977j = function1;
        this.f120978k = list;
    }

    public final Object b(int i13) {
        int i14 = this.f120976i;
        Function1 function1 = this.f120977j;
        List list = this.f120978k;
        switch (i14) {
        }
        return function1.invoke(list.get(i13));
    }

    public final void e(int i13) {
        int i14 = this.f120976i;
        Function1 function1 = this.f120977j;
        List list = this.f120978k;
        switch (i14) {
            case 14:
                function1.invoke(Integer.valueOf(list.indexOf(list.get(i13))));
                break;
            default:
                function1.invoke(Integer.valueOf(list.indexOf(list.get(i13))));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f120976i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                x LazyColumn = (x) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                tc0.d dVar = tc0.d.f117226k;
                List list = this.f120978k;
                int size = list.size();
                s sVar = new s(3, list, dVar);
                tc0.k kVar = new tc0.k(0, list, this.f120977j);
                Object obj2 = q2.i.f102113a;
                ((q1.i) LazyColumn).s(size, null, sVar, new q2.h(kVar, true, -632812321));
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                e(((Number) obj).intValue());
                break;
            default:
                e(((Number) obj).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(List list, Function1 function1) {
        super(1);
        this.f120976i = 4;
        this.f120978k = list;
        this.f120977j = function1;
    }
}
