package rh1;

import a.cb;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.oa;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrh1/b0;", "Lmm1/n;", "Ldl1/s;", "Lcom/pinterest/feature/unifiedcomments/b;", "Lnr0/j;", "<init>", "()V", "comments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b0 extends y0<dl1.s> implements com.pinterest.feature.unifiedcomments.b {

    /* renamed from: e1, reason: collision with root package name */
    public static final /* synthetic */ int f108111e1 = 0;
    public uk1.e W0;
    public nr0.m X0;
    public x02.i2 Y0;
    public qh1.e Z0;

    /* renamed from: a1, reason: collision with root package name */
    public lh0.l0 f108112a1;

    /* renamed from: b1, reason: collision with root package name */
    public final int f108113b1 = 85;

    /* renamed from: c1, reason: collision with root package name */
    public final int f108114c1 = 85;

    /* renamed from: d1, reason: collision with root package name */
    public final d4 f108115d1 = d4.COMMENT_STICKER_PICKER;

    @Override // sq0.e, yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER, new a0(this, 1));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        com.pinterest.framework.screens.s sVar = this.f91293r;
        nr0.m mVar = this.X0;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        uk1.e eVar = this.W0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        bVar.g(((uk1.a) eVar).g());
        x02.i2 i2Var = this.Y0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        Unit unit = Unit.f80348a;
        wk1.c a13 = bVar.a();
        lh0.l0 l0Var = this.f108112a1;
        if (l0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        m60.w f73 = f7();
        qh1.e eVar2 = this.Z0;
        if (eVar2 == null) {
            Intrinsics.r("commentUtils");
            throw null;
        }
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        if (f49940b == null) {
            f49940b = "";
        }
        Navigation navigation2 = this.I;
        String v03 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_AGGREGATED_UID") : null;
        return new oh1.q(sVar, mVar, a13, l0Var, f73, eVar2, f49940b, v03 != null ? v03 : "");
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF75509a1() {
        return this.f108115d1;
    }

    @Override // mm1.n
    public final Function0 h9() {
        return new a0(this, 0);
    }

    @Override // mm1.n
    /* renamed from: i9, reason: from getter */
    public final int getF108113b1() {
        return this.f108113b1;
    }

    @Override // mm1.n
    /* renamed from: j9, reason: from getter */
    public final int getF108114c1() {
        return this.f108114c1;
    }

    @Override // sq0.e, yq0.t
    public final androidx.recyclerview.widget.v0 n8() {
        g41.a aVar = new g41.a(this, 9);
        getContext();
        return new androidx.recyclerview.widget.v0(new PinterestGridLayoutManager(aVar, 3));
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        g9(j.f108175m);
    }
}
