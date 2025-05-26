package o82;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManagerImpl;
import androidx.recyclerview.widget.n3;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.fw;
import com.pinterest.api.model.gw;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.grid.PinterestRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import so.c6;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lo82/v2;", "Lo82/i3;", "Lnr0/e;", "Lo82/n;", "<init>", "()V", "o82/s2", "o82/t2", "stateBasedRecyclerLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class v2 extends i3 implements nr0.e {
    public static final /* synthetic */ int F0 = 0;
    public n3 A0;
    public final ArrayList B0 = new ArrayList();
    public final xk2.v C0 = xk2.m.b(new c72.o(this, 6));
    public final nr0.b D0 = new nr0.b();
    public final s2 E0 = new s2(this);

    public static final int Y8(v2 v2Var, ArrayList arrayList) {
        v2Var.getClass();
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 += ((r2) it.next()).f93704a.a();
        }
        return i13;
    }

    public static Pair f9(int i13, List list) {
        int i14 = -1;
        int i15 = 0;
        do {
            i14++;
            i15 += ((r2) list.get(i14)).f93704a.a();
        } while (i13 >= i15);
        return new Pair(list.get(i14), Integer.valueOf(i13 - (i15 - ((r2) list.get(i14)).f93704a.a())));
    }

    @Override // nr0.e
    public final boolean A4(int i13) {
        os.f fVar;
        PinterestRecyclerView pinterestRecyclerView = this.f139736j0;
        return (pinterestRecyclerView == null || (fVar = pinterestRecyclerView.f52533c) == null || i13 == -1 || !fVar.f97479e || i13 != fVar.e() - 1) ? false : true;
    }

    @Override // nr0.e
    public final void H(nr0.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.D0.f91865a = listener;
    }

    @Override // np0.f
    public final void I4(String pinUid, PinFeed pinFeed, int i13, int i14, String str) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        vb0.j.f125466a.F("Should not be used in StateBased.", tb0.p.PLATFORM, new Object[0]);
    }

    @Override // yq0.t, yk1.k, nl1.d
    public void L7() {
        super.L7();
        e9().e();
    }

    @Override // o82.i3
    public final n Q8() {
        r2 r2Var = new r2(new kp.n(1));
        this.B0.add(r2Var);
        return r2Var;
    }

    @Override // o82.i3
    public List R8() {
        u50.r eventIntake = T8();
        if (eventIntake != null) {
            qc2.d dVar = new qc2.d();
            zs1.a aVar = this.f93622u0;
            if (aVar == null) {
                Intrinsics.r("impressionDebugUtils");
                throw null;
            }
            zy.z pinImpressionHelper = new zy.z(dVar, aVar);
            gw modelHelper = fw.f37821a;
            Intrinsics.checkNotNullExpressionValue(modelHelper, "getInstance(...)");
            Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
            Intrinsics.checkNotNullParameter(pinImpressionHelper, "pinImpressionHelper");
            Intrinsics.checkNotNullParameter(modelHelper, "modelHelper");
            List j13 = kotlin.collections.f0.j(new zy.o0(pinImpressionHelper, eventIntake, h32.h2.GRID_CELL), new zy.p0(eventIntake, modelHelper), new zy.m0(eventIntake));
            if (j13 != null) {
                return j13;
            }
        }
        nx.d0 s73 = s7();
        c6 c6Var = this.f93623v0;
        if (c6Var != null) {
            return kotlin.collections.c0.b0(bs1.c.O(s73, c6Var));
        }
        Intrinsics.r("pinImpressionLoggerFactory");
        throw null;
    }

    @Override // o82.i3
    public final yq0.u S8() {
        return this.E0;
    }

    public int Z8() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return dl2.b.F0(requireContext, eo1.a.item_horizontal_spacing);
    }

    public int a9() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return dl2.b.F0(requireContext, eo1.a.item_vertical_spacing);
    }

    public int b9() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return dl2.b.F0(requireContext, eo1.a.item_vertical_spacing);
    }

    public int c9() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return dl2.b.F0(requireContext, eo1.a.item_horizontal_spacing);
    }

    public int d9() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return dl2.b.F0(requireContext, eo1.a.item_vertical_spacing_half);
    }

    public final ky.e e9() {
        return (ky.e) this.C0.getValue();
    }

    public final void g9(int i13) {
        int Z8 = Z8() / 2;
        H8(Z8, a9(), Z8, i13);
    }

    /* renamed from: getNumColumns */
    public int getZ0() {
        return hf0.b.f69004d;
    }

    @Override // yq0.t
    public androidx.recyclerview.widget.v0 n8() {
        n3 n3Var = this.A0;
        if (n3Var == null) {
            Intrinsics.r("staggeredGridLayoutManagerFactory");
            throw null;
        }
        PinterestStaggeredGridLayoutManagerImpl f13 = n3Var.f(r8(), getZ0());
        if (getZ0() == 2) {
            f13.f1(10);
        } else {
            f13.f1(0);
        }
        f13.M1(RecyclerViewTypes.FULL_SPAN_ITEM_TYPES);
        return new androidx.recyclerview.widget.v0(f13);
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        int Z8 = Z8() / 2;
        H8(Z8, a9(), Z8, 0);
        addItemVisibilityChangeListener(new w01.s(this, 3));
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new u2(this, null), 3);
    }

    @Override // np0.f
    public final void v4(String pinUid, PinFeed pinFeed, int i13, int i14, i01.e metadataProvider) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(pinFeed, "pinFeed");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        vb0.j.f125466a.F("Should not be used in StateBased.", tb0.p.PLATFORM, new Object[0]);
    }

    @Override // yq0.t
    public final void z8(q2 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.z8(adapter);
        a8(new eb2.c(new t2(this, c9() / 2, d9(), c9() / 2, b9(), Z8() / 2, Z8() / 2), new u81.o(this, 2)));
    }
}
