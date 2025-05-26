package r81;

import com.pinterest.api.model.bh;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class o extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final o f106787i = new o(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        bh item = (bh) obj2;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(item, "item");
        list.add(item);
        return Unit.f80348a;
    }
}
