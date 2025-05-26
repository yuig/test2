package sq0;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.n3;
import androidx.recyclerview.widget.v0;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.home.mainfeed.HomeFeedFragment;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.p1;
import com.pinterest.ui.grid.PinterestRecyclerView;
import ey.s1;
import h32.a4;
import h32.d4;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nr0.j;
import nx.d1;
import nx.r0;
import qa2.j0;
import so.c6;
import so.oa;
import x02.x2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0002\t\nB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lsq0/e;", "Lnr0/j;", "D", "Lyq0/b0;", "Lnr0/e;", "Lnr0/i;", "Lnr0/c;", "<init>", "()V", "vb0/i", "sq0/b", "fragmentLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class e<D extends nr0.j> extends yq0.b0<D> implements nr0.e, nr0.i, nr0.c {
    public static final tq0.b[] I0 = new tq0.b[0];
    public xy.g D0;
    public xy.c E0;
    public xy.b F0;

    /* renamed from: u0, reason: collision with root package name */
    public j0 f114986u0;

    /* renamed from: v0, reason: collision with root package name */
    public jq.c f114987v0;

    /* renamed from: w0, reason: collision with root package name */
    public Map f114988w0;

    /* renamed from: x0, reason: collision with root package name */
    public n3 f114989x0;

    /* renamed from: y0, reason: collision with root package name */
    public c6 f114990y0;

    /* renamed from: z0, reason: collision with root package name */
    public View f114991z0;
    public final xk2.v A0 = xk2.m.b(new r0(this, 6));
    public final nr0.b B0 = new nr0.b();
    public final tq0.h C0 = vb0.i.f();
    public final d G0 = new d(this);
    public final a H0 = new a(this, 0);

    @Override // nr0.e
    public final boolean A4(int i13) {
        os.f fVar;
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        return (pinterestRecyclerView == null || (fVar = pinterestRecyclerView.f52533c) == null || i13 == -1 || !fVar.f97479e || i13 != fVar.e() - 1) ? false : true;
    }

    @Override // nr0.e
    public final void H(nr0.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.B0.f91865a = listener;
    }

    public void I4(String pinUid, PinFeed pinFeed, int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        String lowerCase = d4.FEED.toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        v4(pinUid, pinFeed, i13, i14, new i01.d(str, lowerCase, new ArrayList(kotlin.collections.e0.b(pinUid)), null));
    }

    @Override // yq0.t, yk1.k, nl1.d
    public void K7() {
        super.K7();
        f7().h(this.G0);
        View view = this.f114991z0;
        if (view != null) {
            view.performAccessibilityAction(64, null);
        }
    }

    @Override // yq0.t, yk1.k, nl1.d
    public void L7() {
        f7().j(this.G0);
        super.L7();
    }

    @Override // yq0.b0
    public void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        nx.d0 pinalytics = s7();
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Map viewCreators = this.f114988w0;
        if (viewCreators == null) {
            Intrinsics.r("viewCreators");
            throw null;
        }
        qa2.n gridFeatureConfig = T8(this.B0);
        j0 pinGridCellFactory = this.f114986u0;
        if (pinGridCellFactory == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        uj2.q networkStateStream = p7();
        x2 userRepository = A7();
        d1 trackingParamAttacher = z7();
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.u scope = bf.b.S(viewLifecycleOwner);
        Intrinsics.checkNotNullParameter(viewCreators, "viewCreators");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(gridFeatureConfig, "gridFeatureConfig");
        Intrinsics.checkNotNullParameter(pinGridCellFactory, "pinGridCellFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(this, "goToHomefeedListener");
        Intrinsics.checkNotNullParameter(scope, "scope");
        for (Map.Entry entry : viewCreators.entrySet()) {
            androidx.lifecycle.u uVar = scope;
            d1 d1Var = trackingParamAttacher;
            adapter.G(((Number) entry.getKey()).intValue(), new yq0.b((yq0.a) entry.getValue(), context, pinalytics, gridFeatureConfig, pinGridCellFactory, networkStateStream, userRepository, this, d1Var, uVar));
            pinalytics = pinalytics;
            scope = uVar;
            trackingParamAttacher = d1Var;
            userRepository = userRepository;
            networkStateStream = networkStateStream;
            pinGridCellFactory = pinGridCellFactory;
        }
    }

    public final void R8(int i13) {
        RecyclerView g83;
        if (i13 == getZ0() || (g83 = g8()) == null) {
            return;
        }
        l2 l2Var = g83.f19242n;
        if (l2Var instanceof StaggeredGridLayoutManager) {
            Intrinsics.g(l2Var, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
            addScrollListener(new com.pinterest.feature.home.view.a((StaggeredGridLayoutManager) l2Var, new Handler(Looper.getMainLooper())));
        }
    }

    @Override // nl1.d
    public void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.S7(toolbar);
        fo1.a i73 = i7();
        if (i73 != null) {
            Y7((GestaltToolbarImpl) i73);
        }
    }

    public tq0.b[] S8() {
        return I0;
    }

    public qa2.n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        return new qa2.f(s7(), v7(), pinActionHandler, getE2()).a(new yk1.a(getResources(), requireContext().getTheme()));
    }

    public b U8(int i13, int i14, int i15, nr0.j dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        int i16 = i13 / 2;
        int X8 = X8() / 2;
        return new b(this, i16, i14, i16, i15, X8, X8, dataSource);
    }

    public List V8() {
        return null;
    }

    public final qa2.n W8() {
        return (qa2.n) this.A0.getValue();
    }

    @Override // nr0.i
    public final void X2() {
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.post(this.H0);
        }
    }

    public int X8() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return dl2.b.F0(requireContext, eo1.a.item_horizontal_spacing);
    }

    public int Y8() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return dl2.b.F0(requireContext, eo1.a.item_vertical_spacing);
    }

    public int Z8() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return dl2.b.F0(requireContext, eo1.a.item_vertical_spacing_half);
    }

    /* renamed from: a9 */
    public String getE2() {
        if (this.f114987v0 == null) {
            Intrinsics.r("pinTrafficSourceMapper");
            throw null;
        }
        String name = getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return jq.c.a(name);
    }

    public final void b9(int i13) {
        int X8 = X8() / 2;
        H8(X8, Y8(), X8, i13);
    }

    public boolean c9() {
        return this instanceof HomeFeedFragment;
    }

    @Override // nr0.i
    public final void d3() {
        this.C0.p(true, false);
    }

    /* renamed from: getNumColumns */
    public int getZ0() {
        return hf0.b.f69004d;
    }

    public i01.e k0() {
        return null;
    }

    @Override // yq0.t
    public g2 l8() {
        return new c02.u();
    }

    public void m() {
        o7();
        com.pinterest.framework.screens.s sVar = ((ku1.j) o7()).f80914l;
        if ((sVar != null ? sVar.f49234i : null) != null) {
            r70.a aVar = sVar.f49234i;
            Intrinsics.g(aVar, "null cannot be cast to non-null type com.pinterest.bottomNavBar.BottomNavBar");
            aVar.k(com.pinterest.framework.screens.u.GO_TO_HOME_FEED_UPSELL);
        }
    }

    @Override // yq0.t
    public v0 n8() {
        n3 n3Var = this.f114989x0;
        if (n3Var == null) {
            Intrinsics.r("staggeredGridLayoutManagerFactory");
            throw null;
        }
        PinterestStaggeredGridLayoutManagerImpl f13 = n3Var.f(r8(), getZ0());
        f13.f1(getZ0() == 2 ? 10 : 0);
        f13.M1(RecyclerViewTypes.FULL_SPAN_ITEM_TYPES);
        return new v0(f13);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView g83 = g8();
        if (g83 != null) {
            g83.removeCallbacks(this.H0);
        }
        xy.c cVar = this.E0;
        if (cVar != null) {
            xy.g gVar = this.D0;
            if (gVar != null) {
                y9.g gVar2 = gVar.f136168h.f136191l;
                gVar2.f138100b.f(false);
                gVar2.f138101c = false;
            }
            this.D0 = null;
            C8(cVar);
        }
        xy.b bVar = this.F0;
        if (bVar != null) {
            C8(bVar);
        }
        super.onDestroyView();
    }

    @Override // yq0.t, yk1.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("DynamicGridFragment.PREVIOUS_NUM_COLUMNS_BUNDLE_KEY", getZ0());
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        b9(0);
        if (bundle != null) {
            R8(bundle.getInt("DynamicGridFragment.PREVIOUS_NUM_COLUMNS_BUNDLE_KEY"));
        }
        if (c9()) {
            b8(new yq0.e0(s7()));
        }
        nx.d0 s73 = s7();
        c6 c6Var = this.f114990y0;
        xy.g gVar = null;
        if (c6Var == null) {
            Intrinsics.r("pinImpressionLoggerFactory");
            throw null;
        }
        zy.m[] mVarArr = (zy.m[]) Arrays.copyOf(bs1.c.O(s73, c6Var), 3);
        tq0.h hVar = this.C0;
        hVar.n(mVarArr);
        tq0.b[] S8 = S8();
        hVar.n((zy.m[]) Arrays.copyOf(S8, S8.length));
        Intrinsics.checkNotNullParameter(this, "observable");
        addRecyclerViewEventListener(hVar);
        xk2.v vVar = xy.g.f136159o;
        RecyclerView g83 = g8();
        a4 t13 = getT1();
        d4 viewType = getS1();
        Window window = requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        List V8 = V8();
        b60.b activeUserManager = getActiveUserManager();
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        if (g83 != null) {
            b60.d dVar = (b60.d) activeUserManager;
            wy0 f13 = dVar.f();
            ol2.f.f96454a.getClass();
            if (ol2.f.f96455b.i(100) <= ((lh0.o) ((oa) ((xy.f) xy.g.f136159o.getValue())).f113769k7.get()).i("android_scroll_performance_sampling_v2", 0, lh0.a4.f83298b) - 1 || ((f13 != null && Intrinsics.d(f13.z3(), Boolean.TRUE)) || ff0.j.b())) {
                gVar = new xy.g(g83, t13, viewType, window, V8, dVar);
            } else {
                ArrayDeque arrayDeque = s1.f60573a;
            }
        }
        this.D0 = gVar;
        xy.c cVar = new xy.c(gVar);
        this.E0 = cVar;
        addScrollListener(cVar);
        xy.b bVar = new xy.b();
        this.F0 = bVar;
        addScrollListener(bVar);
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

    public void v4(String pinUid, PinFeed pinFeed, int i13, int i14, i01.e metadataProvider) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        String e23 = getE2();
        NavigationImpl z03 = Navigation.z0(p1.a(), pinUid);
        if (i14 == -1) {
            this.f114991z0 = null;
        }
        KeyEvent.Callback callback = this.f114991z0;
        qa2.h0 h0Var = callback instanceof qa2.h0 ? (qa2.h0) callback : null;
        bs1.c.j(z03, pinFeed, i13, metadataProvider.f(), metadataProvider.z(), metadataProvider.y(), metadataProvider.w(), e23, s7(), Boolean.valueOf(h0Var != null ? h0Var.getG() : true));
        z03.m0("com.pinterest.EXTRA_CLOSEUP_MODULE_SOURCE", metadataProvider.e());
        f7().d(z03);
    }
}
