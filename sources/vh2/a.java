package vh2;

import bi2.g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import xk2.k;

/* loaded from: classes4.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125844i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f125845j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(0);
        this.f125844i = i13;
        this.f125845j = dVar;
    }

    public final List b() {
        int i13 = this.f125844i;
        d dVar = this.f125845j;
        switch (i13) {
            case 0:
                List list = (List) dVar.f125849b.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof bi2.a) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                List list2 = (List) dVar.f125849b.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof Closeable) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            case 2:
                ArrayList arrayList3 = dVar.f125848a;
                ArrayList arrayList4 = new ArrayList(g0.q(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((k) it.next()).getValue());
                }
                return arrayList4;
            case 3:
                List list3 = (List) dVar.f125849b.getValue();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : list3) {
                    if (obj3 instanceof yh2.b) {
                        arrayList5.add(obj3);
                    }
                }
                return arrayList5;
            case 4:
                List list4 = (List) dVar.f125849b.getValue();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : list4) {
                    if (obj4 instanceof g) {
                        arrayList6.add(obj4);
                    }
                }
                return arrayList6;
            default:
                List list5 = (List) dVar.f125849b.getValue();
                ArrayList arrayList7 = new ArrayList();
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                return arrayList7;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f125844i) {
        }
        return b();
    }
}
