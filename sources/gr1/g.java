package gr1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends d {

    /* renamed from: g, reason: collision with root package name */
    public final j f66008g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j pendingConnectData) {
        super(pendingConnectData.f66013b, pendingConnectData.f66012a, null);
        Intrinsics.checkNotNullParameter(pendingConnectData, "pendingConnectData");
        this.f66008g = pendingConnectData;
    }

    @Override // or1.p
    public final String a() {
        return "ForceSocialConnection";
    }

    @Override // gr1.d
    public final Map c() {
        LinkedHashMap r13 = z0.r(new HashMap());
        r13.putAll(this.f66008g.f66014c);
        r13.put("force", "true");
        return r13;
    }
}
