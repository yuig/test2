package ads_mobile_sdk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class me1 implements a.x1 {

    /* renamed from: a, reason: collision with root package name */
    public final a.x1 f8191a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f8192b;

    public me1(a.x1 rendererMap, Function1 adWrapper) {
        Intrinsics.checkNotNullParameter(rendererMap, "rendererMap");
        Intrinsics.checkNotNullParameter(adWrapper, "adWrapper");
        this.f8191a = rendererMap;
        this.f8192b = adWrapper;
    }

    @Override // a.x1
    public final a.kb a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        a.kb a13 = this.f8191a.a(name);
        if (a13 != null) {
            return new le1(a13, this);
        }
        return null;
    }
}
