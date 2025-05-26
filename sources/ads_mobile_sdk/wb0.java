package ads_mobile_sdk;

import ao2.j0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class wb0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f12971a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f12972b;

    public wb0(j0 scope, Map listeners) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        this.f12971a = scope;
        this.f12972b = listeners;
    }
}
