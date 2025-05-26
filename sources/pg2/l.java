package pg2;

import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.p implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ApiRequest p03 = (ApiRequest) obj;
        Function1 p13 = (Function1) obj2;
        Intrinsics.checkNotNullParameter(p03, "p0");
        Intrinsics.checkNotNullParameter(p13, "p1");
        return ((n) this.receiver).a(p03, p13);
    }
}
