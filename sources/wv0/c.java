package wv0;

import ac1.j;
import dl1.l;
import dl1.t;
import java.util.ArrayList;
import jk2.j1;
import kc1.w;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.t3;
import tk2.e;
import uc1.g;
import uc1.i;
import uj2.q;
import vv0.d;
import x02.x2;

/* loaded from: classes5.dex */
public final class c extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f131154k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f131155l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f131156m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f131157n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String draftId, d videoClipInteractionListener, t storyPinLocalDataRepository) {
        super(null);
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(videoClipInteractionListener, "videoClipInteractionListener");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        this.f131155l = draftId;
        this.f131156m = videoClipInteractionListener;
        this.f131157n = storyPinLocalDataRepository;
        o(0, new vv0.a(videoClipInteractionListener, 1));
        o(1, new vv0.a(videoClipInteractionListener, 0));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        ArrayList arrayList = this.f135191h;
        switch (this.f131154k) {
            case 0:
                Object obj = CollectionsKt.F0(arrayList).get(i13);
                xv0.c cVar = obj instanceof xv0.c ? (xv0.c) obj : null;
                if (cVar != null) {
                    return cVar.f136020a;
                }
                return -1;
            default:
                Object obj2 = CollectionsKt.F0(arrayList).get(i13);
                g gVar = obj2 instanceof g ? (g) obj2 : null;
                if (gVar != null) {
                    return gVar.getViewType();
                }
                throw new IllegalStateException("Item should be SecurityMenuItem");
        }
    }

    @Override // xk1.c
    public final q k() {
        int i13 = this.f131154k;
        Object obj = this.f131155l;
        Object obj2 = this.f131157n;
        switch (i13) {
            case 0:
                j1 j1Var = new j1(((l) ((t) obj2)).S((String) obj), new a(0, b.f131153i), 0);
                Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
                return j1Var;
            default:
                j1 j1Var2 = new j1(q.P(((cr1.a) obj2).d().H(e.f118017c).A(wj2.c.a()), ((x2) obj).d0().Q("me").I(1L), new ep.g(21, i.f121904i)), new ic1.a(5, new w(this, 8)), 0);
                Intrinsics.checkNotNullExpressionValue(j1Var2, "map(...)");
                return j1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x2 userRepository, t3 experiments, cr1.a accountService) {
        super(null);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        this.f131155l = userRepository;
        this.f131156m = experiments;
        this.f131157n = accountService;
        o(1, new j(19));
        o(2, new j(20));
        o(3, new j(21));
        o(6, new j(22));
    }
}
