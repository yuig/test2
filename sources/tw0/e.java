package tw0;

import com.pinterest.api.model.tv;
import com.pinterest.api.model.uv;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final e f119608i = new e(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        uv accResponse = (uv) obj;
        tv metric = (tv) obj2;
        Intrinsics.checkNotNullParameter(accResponse, "accResponse");
        Intrinsics.checkNotNullParameter(metric, "metric");
        accResponse.getMetrics().add(metric);
        return accResponse;
    }
}
