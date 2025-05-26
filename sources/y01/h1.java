package y01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136414i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Set f136415j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(int i13, Set set) {
        super(1);
        this.f136414i = i13;
        this.f136415j = set;
    }

    public final kc1.u b(kc1.u priorVMState) {
        int i13 = this.f136414i;
        Set set = this.f136415j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
                Set set2 = set;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ic1.y((String) it.next()));
                }
                return kc1.u.b(priorVMState, CollectionsKt.J0(arrayList), null, 5);
            default:
                Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
                Set set3 = set;
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(set3, 10));
                Iterator it2 = set3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new ic1.y((String) it2.next()));
                }
                return kc1.u.b(priorVMState, CollectionsKt.J0(arrayList2), null, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f136414i;
        Set set = this.f136415j;
        switch (i13) {
            case 0:
                h0 it = (h0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return h0.e(it, h42.a.e(it.f136412a, set, 0, 14), null, 2);
            case 1:
                return b((kc1.u) obj);
            case 2:
                return b((kc1.u) obj);
            case 3:
                return Boolean.valueOf(set.contains((ke2.d) obj));
            case 4:
                od2.a it2 = (od2.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(set.contains(it2.f94185a));
            case 5:
                od2.b it3 = (od2.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Boolean.valueOf(set.contains(it3.f94185a));
            default:
                nd2.b it4 = (nd2.b) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return Boolean.valueOf(set.contains(it4.f90426a));
        }
    }
}
