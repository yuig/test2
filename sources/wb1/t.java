package wb1;

import com.pinterest.feature.settings.notifications.y0;
import java.util.ArrayList;
import jk2.j1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import x02.x2;

/* loaded from: classes5.dex */
public final class t extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final x2 f129055k;

    /* renamed from: l, reason: collision with root package name */
    public final yk1.v f129056l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f129057m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x2 userRepository, yk1.a resources) {
        super(null);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f129055k = userRepository;
        this.f129056l = resources;
        this.f129057m = new ArrayList();
        o(1, new s91.b(19));
        o(3, new s91.b(20));
        o(15, new s91.b(21));
        o(0, new s91.b(22));
        o(2, new s91.b(23));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        ArrayList arrayList = this.f135191h;
        if (!(((dl1.s) CollectionsKt.F0(arrayList).get(i13)) instanceof q0)) {
            throw new IllegalStateException("Item should be SettingsPermissionsMenuItem");
        }
        Object obj = CollectionsKt.F0(arrayList).get(i13);
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.settings.permissions.model.SettingsPermissionsMenuItem");
        return ((q0) obj).getViewType();
    }

    @Override // xk1.c
    public final uj2.q k() {
        j1 j1Var = new j1(this.f129055k.f0().f0().Q("me").I(1L), new t81.a(24, new y0(this, 14)), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }
}
