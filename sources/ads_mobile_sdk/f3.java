package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f3 implements a.x1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f5028a;

    public f3(Map rendererMap) {
        Intrinsics.checkNotNullParameter(rendererMap, "rendererMap");
        this.f5028a = rendererMap;
    }

    @Override // a.x1
    public final a.kb a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (a.kb) this.f5028a.get(name);
    }
}
