package o82;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.design.brio.widget.empty.PinterestEmptyStateLayout;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.c6;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo82/i3;", "Lyq0/t;", "Lo82/n;", "Lo82/q2;", "Lsq0/w;", "Lsq0/a0;", "Lsq0/z;", "Lnr0/i;", "<init>", "()V", "stateBasedRecyclerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class i3 extends yq0.t<n, q2> implements sq0.w, sq0.a0, sq0.z, nr0.i {

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f93621z0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public zs1.a f93622u0;

    /* renamed from: v0, reason: collision with root package name */
    public c6 f93623v0;

    /* renamed from: w0, reason: collision with root package name */
    public q2 f93624w0;

    /* renamed from: x0, reason: collision with root package name */
    public final tq0.h f93625x0 = vb0.i.f();

    /* renamed from: y0, reason: collision with root package name */
    public final s81.g f93626y0 = new s81.g(this, 20);

    public void D6() {
        onRecyclerRefresh();
    }

    public n Q8() {
        return new c3(new kp.n(1));
    }

    public List R8() {
        return kotlin.collections.q0.f80391a;
    }

    public yq0.u S8() {
        return null;
    }

    public u50.r T8() {
        return null;
    }

    public abstract do2.i U8();

    @Override // yk1.k
    public final yk1.m V7() {
        return new d3();
    }

    public abstract u50.r V8();

    public void W8(y0 displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        kg.q i13 = displayState.i();
        if (i13 instanceof v) {
            setLoadState(yk1.i.LOADING);
            setShowPaginationSpinner(false);
        } else if (i13 instanceof u) {
            if (displayState.h().isEmpty()) {
                setLoadState(yk1.i.LOADING);
                setShowPaginationSpinner(false);
            } else {
                setLoadState(yk1.i.LOADED);
                setShowPaginationSpinner(true);
            }
        } else if (i13 instanceof w) {
            setLoadState(yk1.i.LOADING);
            setShowPaginationSpinner(false);
        } else if (i13 instanceof t) {
            setLoadState(yk1.i.LOADED);
            setShowPaginationSpinner(false);
            onLoadMoreComplete();
            if (displayState.h().isEmpty() && displayState.g()) {
                V8().a(c0.f93547a);
            } else if (!(this instanceof c61.i)) {
                triggerLoadMoreCheck();
            }
        } else if (i13 instanceof s) {
            setShowPaginationSpinner(false);
            setLoadState(yk1.i.ERROR);
            displayError(((s) displayState.i()).d());
        }
        boolean j13 = displayState.j();
        PinterestEmptyStateLayout pinterestEmptyStateLayout = this.f139733g0;
        if (pinterestEmptyStateLayout != null) {
            pinterestEmptyStateLayout.f(j13);
        }
    }

    @Override // nr0.i
    public final void X2() {
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.post(this.f93626y0);
        }
    }

    public abstract void X8(b3 b3Var);

    @Override // nr0.i
    public final void d3() {
        this.f93625x0.p(true, false);
    }

    @Override // yq0.t
    public final yq0.m d8(sq0.e0 e0Var) {
        n dataSource = (n) e0Var;
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        throw new IllegalAccessError("Should not be called in StateBased");
    }

    @Override // yq0.t
    public final yq0.m e8(wk1.i dataSourceProvider) {
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        vb0.j.f125466a.G("createMultiSourceAdapter should not be called in StateBased", new Object[0]);
        super.e8(dataSourceProvider);
        throw null;
    }

    @Override // sq0.z
    public final void j3(int i13) {
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
        ko2.f fVar = ao2.v0.f20219a;
        kotlin.jvm.internal.j.z(S, ho2.q.f69782a, null, new h3(this, i13, null), 2);
    }

    @Override // sq0.w
    public final void loadMoreData() {
        V8().a(c0.f93547a);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
        ho2.c b13 = dl2.b.b(S.f18692b.plus(new ao2.i0("StateBasedRecyclerAdapter")));
        yq0.u S8 = S8();
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        q2 adapter = new q2(b13, S8, (Application) applicationContext, new c72.o(this, 7));
        this.f93624w0 = adapter;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (this.f139732f0 != null) {
            throw new IllegalStateException("Adapter has already been initialized".toString());
        }
        this.f139732f0 = adapter;
        s8(adapter);
        z8(adapter);
        addItemVisibilityChangeListener(this);
        androidx.lifecycle.z viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        androidx.lifecycle.u S2 = bf.b.S(viewLifecycleOwner2);
        ko2.f fVar = ao2.v0.f20219a;
        kotlin.jvm.internal.j.z(S2, ho2.q.f69782a, null, new f3(this, null), 2);
        setLoadMoreListener(this);
        this.f139738l0 = this;
        return onCreateView;
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.removeCallbacks(this.f93626y0);
        }
        setLoadMoreListener(null);
        this.f139738l0 = null;
        this.f139732f0 = null;
        super.onDestroyView();
    }

    @Override // sq0.a0
    public final void onRecyclerRefresh() {
        V8().a(d0.f93560a);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        zy.m[] mVarArr = (zy.m[]) R8().toArray(new zy.m[0]);
        zy.m[] mVarArr2 = (zy.m[]) Arrays.copyOf(mVarArr, mVarArr.length);
        tq0.h hVar = this.f93625x0;
        hVar.n(mVarArr2);
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        zy.m[] array = new zy.m[0];
        q0Var.getClass();
        Intrinsics.checkNotNullParameter(array, "array");
        zy.m[] mVarArr3 = (zy.m[]) kotlin.jvm.internal.j.K(q0Var, array);
        hVar.n((zy.m[]) Arrays.copyOf(mVarArr3, mVarArr3.length));
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(hVar);
    }

    @Override // sq0.z
    public final void r1(int i13, sq0.y scrollDirection) {
        Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
        ko2.f fVar = ao2.v0.f20219a;
        kotlin.jvm.internal.j.z(S, ho2.q.f69782a, null, new g3(this, i13, scrollDirection, null), 2);
    }

    @Override // nr0.i
    public final void s6() {
        RecyclerView recyclerView = g8();
        if (recyclerView != null) {
            ar0.n q83 = q8();
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            ar0.q qVar = q83.f20401e;
            qVar.getClass();
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            ar0.q.k(qVar, recyclerView);
        }
    }

    @Override // yq0.t
    public final void x8(yq0.m mVar, sq0.e0 e0Var) {
        q2 adapter = (q2) mVar;
        n dataSource = (n) e0Var;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        vb0.j.f125466a.G("onAdapterInitialized should not be called in StateBased", new Object[0]);
    }

    @Override // yq0.t
    public final void y8(yq0.m mVar, wk1.i dataSourceProvider) {
        q2 adapter = (q2) mVar;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        vb0.j.f125466a.G("onAdapterInitialized(adapter, dataSourceProvider) should not be called in StateBased", new Object[0]);
        super.y8(adapter, dataSourceProvider);
    }
}
