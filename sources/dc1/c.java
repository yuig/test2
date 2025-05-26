package dc1;

import com.pinterest.feature.settings.notifications.y0;
import dl1.s;
import java.util.ArrayList;
import jk2.j1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.r3;
import uj2.q;
import x02.x2;
import yk1.v;

/* loaded from: classes5.dex */
public final class c extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final x2 f54364k;

    /* renamed from: l, reason: collision with root package name */
    public final ap.o f54365l;

    /* renamed from: m, reason: collision with root package name */
    public final v f54366m;

    /* renamed from: n, reason: collision with root package name */
    public final cr1.a f54367n;

    /* renamed from: o, reason: collision with root package name */
    public final r3 f54368o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x2 userRepository, ap.o uploadContactsUtil, yk1.a resources, cr1.a accountService, r3 experiments) {
        super(null);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f54364k = userRepository;
        this.f54365l = uploadContactsUtil;
        this.f54366m = resources;
        this.f54367n = accountService;
        this.f54368o = experiments;
        o(3, new ac1.j(2));
        o(8, new ac1.j(3));
        o(1, new ac1.j(4));
        o(16, new ac1.j(5));
        o(0, new ac1.j(6));
        o(2, new ac1.j(7));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        ArrayList arrayList = this.f135191h;
        if (!(((s) CollectionsKt.F0(arrayList).get(i13)) instanceof o)) {
            throw new IllegalStateException("Item should be PrivacyDataItem");
        }
        Object obj = CollectionsKt.F0(arrayList).get(i13);
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.feature.settings.privacydata.model.SettingsPrivacyDataMenuItem");
        return ((o) obj).getViewType();
    }

    @Override // xk1.c
    public final q k() {
        j1 j1Var = new j1(q.P(this.f54364k.d0().Q("me").I(1L), this.f54367n.g().H(tk2.e.f118017c).I(1L), new ep.g(20, b.f54363i)), new t81.a(29, new y0(this, 25)), 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "let(...)");
        return j1Var;
    }
}
