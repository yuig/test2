package o82;

import android.app.Application;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q2 extends yq0.m {

    /* renamed from: e, reason: collision with root package name */
    public final ao2.j0 f93697e;

    /* renamed from: f, reason: collision with root package name */
    public final yq0.u f93698f;

    /* renamed from: g, reason: collision with root package name */
    public final Application f93699g;

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f93700h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.recyclerview.widget.l f93701i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(ho2.c scope, yq0.u uVar, Application application, c72.o dataSourceCreator) {
        super(new t0());
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dataSourceCreator, "dataSourceCreator");
        this.f93697e = scope;
        this.f93698f = uVar;
        this.f93699g = application;
        this.f93700h = dataSourceCreator;
        androidx.recyclerview.widget.l lVar = new androidx.recyclerview.widget.l(new androidx.recyclerview.widget.b2[0]);
        this.f93701i = lVar;
        lVar.z(new za.e(this, 2));
    }

    public final Pair E(int i13) {
        androidx.recyclerview.widget.l lVar = this.f93701i;
        try {
            android.support.v4.media.a aVar = (android.support.v4.media.a) lVar.f19473e;
            androidx.appcompat.widget.a g13 = aVar.g(i13);
            android.util.Pair pair = new android.util.Pair(((androidx.recyclerview.widget.i1) g13.f16504c).f19449c, Integer.valueOf(g13.f16502a));
            g13.f16503b = false;
            g13.f16504c = null;
            g13.f16502a = -1;
            aVar.f15842f = g13;
            androidx.recyclerview.widget.b2 b2Var = (androidx.recyclerview.widget.b2) pair.first;
            Integer num = (Integer) pair.second;
            List D = lVar.D();
            Intrinsics.checkNotNullExpressionValue(D, "getAdapters(...)");
            return new Pair(Integer.valueOf(CollectionsKt.W(b2Var, D)), num);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final int d(androidx.recyclerview.widget.b2 adapter, androidx.recyclerview.widget.y2 viewHolder, int i13) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        return this.f93701i.d(adapter, viewHolder, i13);
    }

    @Override // yq0.m, androidx.recyclerview.widget.b2
    public final int e() {
        return this.f93701i.e();
    }

    @Override // androidx.recyclerview.widget.b2
    public final long f(int i13) {
        return this.f93701i.f(i13);
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        return this.f93701i.g(i13);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void q(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f93701i.q(recyclerView);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(androidx.recyclerview.widget.y2 y2Var, int i13) {
        yq0.d0 holder = (yq0.d0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f93701i.r(holder, i13);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void s(androidx.recyclerview.widget.y2 y2Var, int i13, List payloads) {
        yq0.d0 holder = (yq0.d0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        this.f93701i.r(holder, i13);
    }

    @Override // androidx.recyclerview.widget.b2
    public final androidx.recyclerview.widget.y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        androidx.recyclerview.widget.y2 t13 = this.f93701i.t(parent, i13);
        Intrinsics.g(t13, "null cannot be cast to non-null type com.pinterest.feature.core.view.RegistryViewHolder");
        return (yq0.d0) t13;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void u(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f93701i.u(recyclerView);
    }

    @Override // androidx.recyclerview.widget.b2
    public final boolean v(androidx.recyclerview.widget.y2 y2Var) {
        yq0.d0 holder = (yq0.d0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        return this.f93701i.v(holder);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void w(androidx.recyclerview.widget.y2 y2Var) {
        yq0.d0 holder = (yq0.d0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f93701i.w(holder);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void x(androidx.recyclerview.widget.y2 y2Var) {
        yq0.d0 holder = (yq0.d0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f93701i.x(holder);
    }

    @Override // androidx.recyclerview.widget.b2
    public final void y(androidx.recyclerview.widget.y2 y2Var) {
        yq0.d0 holder = (yq0.d0) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f93701i.y(holder);
    }
}
