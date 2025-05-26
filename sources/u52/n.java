package u52;

import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120716i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f120717j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(m0 m0Var, int i13) {
        super(1);
        this.f120716i = i13;
        this.f120717j = m0Var;
    }

    public final b1 b(b1 it) {
        int i13 = this.f120716i;
        m0 m0Var = this.f120717j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return b1.b(it, ((k0) m0Var).f120708a, null, null, null, 1007);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                i0 i0Var = (i0) m0Var;
                List list = i0Var.f120701a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String id3 = ((f30) it2.next()).getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                    arrayList.add(id3);
                }
                return b1.b(it, null, null, arrayList, i0Var.f120701a, 639);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return b1.b(it, null, null, null, ((l0) m0Var).f120715a.f98904a, 767);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f120716i) {
        }
        return b((b1) obj);
    }
}
