package bz;

import h32.i0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import nx.z0;

/* loaded from: classes3.dex */
public final class f extends a {

    /* renamed from: j, reason: collision with root package name */
    public final String f24177j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f24178k;

    public /* synthetic */ f(i0 i0Var, String str, String str2) {
        this(i0Var, str, str2, null, null);
    }

    @Override // bz.b
    public final void a(z0 auxData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        auxData.put("time_spent_foreground_pairid", this.f24165i);
        Map map = this.f24178k;
        if (map != null) {
            auxData.putAll(map);
        }
        auxData.put("time_spent_parent_pairid", this.f24177j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i0 context, String foregroundId, String screenUid, Map map, String str) {
        super(context, foregroundId);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(foregroundId, "foregroundId");
        Intrinsics.checkNotNullParameter(screenUid, "screenUid");
        this.f24177j = screenUid;
        this.f24178k = map;
        this.f24167b = str;
        f();
    }
}
