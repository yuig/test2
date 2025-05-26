package c71;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z32.k0;
import z32.m0;

/* loaded from: classes5.dex */
public final class c implements nr0.p {

    /* renamed from: a, reason: collision with root package name */
    public final m60.e f26755a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f26757c;

    public c(m mVar, m60.e applicationInfoProvider) {
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        this.f26757c = mVar;
        Intrinsics.checkNotNullParameter(applicationInfoProvider, "applicationInfoProvider");
        this.f26755a = applicationInfoProvider;
    }

    public final void a(e50.q qVar) {
        String h10 = a.a.h("DynamicGridViewBinderDelegate No view type for ", qVar.getClass());
        if (!this.f26756b) {
            ((m60.d) this.f26755a).g();
            this.f26756b = true;
        }
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.i(h10, Thread.currentThread().getStackTrace());
    }

    @Override // nr0.p
    public final boolean c() {
        return true;
    }

    @Override // nr0.p
    public final boolean e(int i13) {
        return true;
    }

    @Override // nr0.p
    public final boolean f(int i13) {
        return RecyclerViewTypes.FULL_SPAN_ITEM_TYPES.contains(Integer.valueOf(i13));
    }

    @Override // nr0.p
    public final int getItemViewType(int i13) {
        e50.q qVar = (e50.q) this.f26757c.I3().getItem(i13);
        if (qVar instanceof z40.y) {
            List l13 = ((z40.y) qVar).l();
            return (l13 == null || l13.isEmpty()) ? 46 : 47;
        }
        if (qVar instanceof e50.v) {
            e50.v vVar = (e50.v) qVar;
            Object obj = vVar.f57432c;
            m0 m0Var = null;
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (num != null) {
                int intValue = num.intValue();
                m0.Companion.getClass();
                m0Var = k0.a(intValue);
            }
            if (m0Var != null && b.f26726a[m0Var.ordinal()] == 1) {
                return 32;
            }
            a(vVar);
        } else {
            Intrinsics.g(qVar, "null cannot be cast to non-null type com.pinterest.apollo.results.SearchGridUsersQuery.Data.V3SearchUsersWithStoriesV3SearchUsersWithStoriesQuery.V3SearchUsersWithStoriesDataConnectionContainerData.Connection.Edge.Node");
            a(qVar);
        }
        return -2;
    }

    @Override // nr0.p
    public final boolean h(int i13) {
        return true;
    }

    @Override // nr0.p
    public final boolean m() {
        return true;
    }

    @Override // nr0.p
    public final boolean q(int i13) {
        return RecyclerViewTypes.INSTANCE.getFULL_BLEED_ITEM_TYPES().contains(Integer.valueOf(i13));
    }
}
