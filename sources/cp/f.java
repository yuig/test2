package cp;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.v0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import so.oa;
import so.v6;
import x02.i2;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcp/f;", "Lwk1/k;", "Ldl1/s;", "Lcp/a;", "Lnr0/j;", "<init>", "()V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends d0<dl1.s> implements a {

    /* renamed from: d1, reason: collision with root package name */
    public static final /* synthetic */ int f52928d1 = 0;
    public v6 R0;
    public kp.m S0;
    public fp.b T0;
    public p12.b U0;
    public no1.d V0;
    public k22.m W0;
    public uk1.e X0;
    public i2 Y0;
    public jp.c Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f52929a1;

    /* renamed from: b1, reason: collision with root package name */
    public final d f52930b1 = new d(this);

    /* renamed from: c1, reason: collision with root package name */
    public final c f52931c1 = new c(this);

    @Override // sq0.e, yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        f7().d(new r70.h(false, false));
    }

    @Override // nl1.d, ec2.o
    public final ac2.m P0() {
        return B7();
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(0, new e(this, 1));
        adapter.G(1, new e(this, 2));
        adapter.G(3, new e(this, 3));
        adapter.G(4, new e(this, 4));
        adapter.G(1, new e(this, 5));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_BOARD_INVITE_HEADER, new e(this, 6));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_INBOX_HEADER, new e(this, 7));
    }

    @Override // sq0.e, nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.e0(vn1.g.UI_400);
        gestaltToolbarImpl.b0(getResources().getString(xc0.i.contact_request_feed_title));
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.E();
    }

    @Override // yq0.t, se0.k
    public final void V1() {
        boolean z13 = !k9().c();
        if (!k9().c()) {
            fp.b k93 = k9();
            no1.d dVar = this.V0;
            if (dVar == null) {
                Intrinsics.r("contactRequestRemoteDataSource");
                throw null;
            }
            k93.a(dVar, new e(this, 0));
        }
        if (z13) {
            return;
        }
        super.V1();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.X0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        i2 i2Var = this.Y0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        v6 v6Var = this.R0;
        if (v6Var != null) {
            return v6Var.a(a13);
        }
        Intrinsics.r("contactRequestMultiSectionInboxPresenterFactory");
        throw null;
    }

    @Override // sq0.e, sq0.b0
    /* renamed from: getNumColumns */
    public final int getZ0() {
        return 1;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getP0() {
        return a4.CONVERSATION_CONTACT_REQUEST_INBOX;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF47101y() {
        return d4.CONVERSATION;
    }

    public final fp.b k9() {
        fp.b bVar = this.T0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("declinedContactRequests");
        throw null;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(xc0.f.fragment_request_inbox, xc0.e.recycler_view);
        eVar.f979c = xc0.e.empty_state_container;
        eVar.c(xc0.e.swipe_container);
        return eVar;
    }

    @Override // sq0.e, yq0.t
    public final v0 n8() {
        b bVar = new b(this, 0);
        getContext();
        return new v0(new PinterestLinearLayoutManager(bVar));
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f7().j(this.f52931c1);
        f7().j(this.f52930b1);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        if (!k9().c()) {
            fp.b k93 = k9();
            no1.d dVar = this.V0;
            if (dVar == null) {
                Intrinsics.r("contactRequestRemoteDataSource");
                throw null;
            }
            k93.a(dVar, null);
        }
        super.onStop();
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        f7().h(this.f52931c1);
        f7().h(this.f52930b1);
        int dimensionPixelSize = v13.getResources().getDimensionPixelSize(r0.margin);
        v13.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("com.pinterest.EXTRA_IS_CONTACT_REQUEST_ON_DETAILS_PAGE") : null;
        Boolean bool = i03 instanceof Boolean ? (Boolean) i03 : null;
        this.f52929a1 = bool != null ? bool.booleanValue() : false;
    }
}
