package jd1;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import com.pinterest.api.model.wy0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f75526j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f75527k = new f(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75528i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f75528i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        switch (this.f75528i) {
            case 0:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                Map k43 = user.k4();
                return (k43 == null || (list = (List) k43.get(as1.b.a().f())) == null) ? dl2.b.Z0(user) : list;
            default:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
                return new HashMap();
        }
    }
}
