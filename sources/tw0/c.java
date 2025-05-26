package tw0;

import com.pinterest.api.model.tv;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f119604i = new c(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        tv accMetric = (tv) obj;
        tv.a result = (tv.a) obj2;
        Intrinsics.checkNotNullParameter(accMetric, "accMetric");
        Intrinsics.checkNotNullParameter(result, "result");
        accMetric.getResults().add(result);
        return accMetric;
    }
}
