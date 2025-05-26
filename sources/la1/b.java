package la1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import s2.y;
import u50.k0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82493i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f82494j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f fVar, int i13) {
        super(1);
        this.f82493i = i13;
        this.f82494j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f82493i;
        f fVar = this.f82494j;
        switch (i13) {
            case 0:
                an1.l it = (an1.l) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                yk2.b bVar = fVar.f82520h;
                ArrayList arrayList = new ArrayList(g0.q(bVar, 10));
                ListIterator listIterator = bVar.listIterator(0);
                while (true) {
                    y yVar = (y) listIterator;
                    if (!yVar.hasNext()) {
                        return an1.l.e(it, null, null, null, arrayList, 0, null, null, RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER);
                    }
                    int intValue = ((Number) ((Pair) yVar.next()).f80346a).intValue();
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    arrayList.add(new an1.e(new k0(intValue, new ArrayList(0)), null, null, false, 62));
                }
            default:
                an1.q event = (an1.q) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof an1.p) {
                    fVar.f82518f.d(c.f82497l);
                }
                return Unit.f80348a;
        }
    }
}
