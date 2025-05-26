package kv0;

import h32.f1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81001i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f81002j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, int i13) {
        super(1);
        this.f81001i = i13;
        this.f81002j = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f81001i;
        int i14 = 0;
        s sVar = this.f81002j;
        switch (i13) {
            case 0:
                List list = (List) obj;
                jv0.o oVar = sVar.f81006n;
                Intrinsics.f(list);
                oVar.a(new jv0.n(list));
                break;
            case 1:
                u model = (u) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                List F0 = CollectionsKt.F0(sVar.f135191h);
                if (!(F0 instanceof Collection) || !F0.isEmpty()) {
                    Iterator it = F0.iterator();
                    while (it.hasNext()) {
                        if (!(!Intrinsics.d(((u) it.next()).f81011a, model.f81011a))) {
                            break;
                        }
                    }
                }
                sVar.r(0, model);
                sVar.v(f1.IDEA_PIN_PRODUCT_TAG_ADDED, model.f81011a, null);
                break;
            default:
                Pair productToType = (Pair) obj;
                Intrinsics.checkNotNullParameter(productToType, "productToType");
                String str = (String) productToType.f80346a;
                boolean booleanValue = ((Boolean) productToType.f80347b).booleanValue();
                Iterator it2 = CollectionsKt.F0(sVar.f135191h).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i14 = -1;
                    } else if (!Intrinsics.d(((u) it2.next()).f81011a, str)) {
                        i14++;
                    }
                }
                if (i14 != -1) {
                    sVar.removeItem(i14);
                    sVar.v(f1.IDEA_PIN_PRODUCT_TAG_DELETED, str, Boolean.valueOf(!booleanValue));
                }
                break;
        }
        return Unit.f80348a;
    }
}
