package mn0;

import com.pinterest.api.model.ga;
import com.pinterest.api.model.y8;
import com.pinterest.feature.boardsection.create.view.BoardSectionNameSuggestionsContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87785i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f87786j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i13) {
        super(1);
        this.f87785i = i13;
        this.f87786j = hVar;
    }

    public final void b(List list) {
        int i13 = this.f87785i;
        h hVar = this.f87786j;
        switch (i13) {
            case 0:
                if (hVar.isBound()) {
                    Intrinsics.f(list);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(g0.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((y8) it.next()).d());
                    }
                    ((BoardSectionNameSuggestionsContainer) ((ln0.d) hVar.getView())).a(arrayList);
                    break;
                }
                break;
            default:
                if (hVar.isBound()) {
                    Intrinsics.f(list);
                    List list3 = list;
                    ArrayList arrayList2 = new ArrayList(g0.q(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((ga) it2.next()).k());
                    }
                    ((BoardSectionNameSuggestionsContainer) ((ln0.d) hVar.getView())).a(arrayList2);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f87785i) {
            case 0:
                b((List) obj);
                break;
            default:
                b((List) obj);
                break;
        }
        return Unit.f80348a;
    }
}
