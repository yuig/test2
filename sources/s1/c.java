package s1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r72.z1;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110370i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f110371j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(List list, int i13) {
        super(0);
        this.f110370i = i13;
        this.f110371j = list;
    }

    public final Integer b() {
        int i13 = this.f110370i;
        List list = this.f110371j;
        switch (i13) {
            case 0:
                Object obj = list.get(2);
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
                break;
        }
        return Integer.valueOf(list.size());
    }

    public final String e() {
        int i13 = this.f110370i;
        List list = this.f110371j;
        switch (i13) {
            case 3:
                List list2 = list;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(kotlin.text.e0.C(5, ((z1) it.next()).b()));
                }
                return "onInserted(): items=" + arrayList;
            case 4:
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(kotlin.text.e0.C(5, ((z1) it2.next()).b()));
                }
                return "onReplaced(): items=" + arrayList2;
            default:
                List list4 = list;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(kotlin.text.e0.C(5, ((z1) it3.next()).b()));
                }
                return "onUpdated(): items=" + arrayList3;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f110370i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return e();
            case 4:
                return e();
            case 5:
                return e();
            default:
                return this.f110371j;
        }
    }
}
