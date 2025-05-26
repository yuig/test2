package r2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f106028i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function2 function2) {
        super(2);
        this.f106028i = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        k kVar;
        c cVar = (c) obj;
        List list = (List) this.f106028i.invoke(cVar, obj2);
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj3 = list.get(i13);
            if (obj3 != null && (kVar = cVar.f106036b) != null && !kVar.b(obj3)) {
                throw new IllegalArgumentException("item can't be saved".toString());
            }
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            return new ArrayList(list2);
        }
        return null;
    }
}
