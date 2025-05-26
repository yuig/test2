package yq1;

import android.os.Bundle;
import android.view.View;
import com.pinterest.design.brio.widget.progress.PinterestLoadingLayout;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.z3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyq1/q;", "Lnl1/d;", "<init>", "()V", "m60/f0", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class q extends c0 {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f139945o0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public lu1.b f139946c0;

    /* renamed from: d0, reason: collision with root package name */
    public il1.a f139947d0;

    /* renamed from: e0, reason: collision with root package name */
    public je0.b f139948e0;

    /* renamed from: f0, reason: collision with root package name */
    public lh0.g1 f139949f0;

    /* renamed from: g0, reason: collision with root package name */
    public lh0.y1 f139950g0;

    /* renamed from: h0, reason: collision with root package name */
    public fr1.c f139951h0;

    /* renamed from: i0, reason: collision with root package name */
    public PinterestLoadingLayout f139952i0;

    /* renamed from: j0, reason: collision with root package name */
    public Bundle f139953j0;

    /* renamed from: k0, reason: collision with root package name */
    public ao2.o1 f139954k0;

    /* renamed from: l0, reason: collision with root package name */
    public final d4 f139955l0 = d4.SPLASH;

    /* renamed from: m0, reason: collision with root package name */
    public final a4 f139956m0 = a4.SPLASH_LOADING;

    /* renamed from: n0, reason: collision with root package name */
    public final m f139957n0 = new m(this);

    public final lu1.b Y7() {
        lu1.b bVar = this.f139946c0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("baseActivityHelper");
        throw null;
    }

    @Override // nl1.d
    public final boolean Z6() {
        return false;
    }

    public final Object Z7(bl2.c cVar) {
        long j13;
        uj2.b i13;
        lh0.y1 y1Var = this.f139950g0;
        if (y1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        if (y1Var.g("enabled_1_second", z3Var)) {
            j13 = 1;
        } else {
            lh0.y1 y1Var2 = this.f139950g0;
            if (y1Var2 == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            if (y1Var2.g("enabled_2_second", z3Var)) {
                j13 = 2;
            } else {
                lh0.y1 y1Var3 = this.f139950g0;
                if (y1Var3 == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                j13 = y1Var3.g("enabled_4_second", z3Var) ? 4L : 5L;
            }
        }
        lh0.g1 g1Var = this.f139949f0;
        if (g1Var == null) {
            Intrinsics.r("experimentsManager");
            throw null;
        }
        if (g1Var.f83369u.get()) {
            i13 = fk2.m.f62459a;
        } else {
            oh0.g i14 = g1Var.i();
            i14.getClass();
            i13 = new kk2.g(new kk2.g((c60.d.b() ? i14.f94470a : i14.f94471b).b().r(tk2.e.f118017c).l(wj2.c.a()), new dh0.a(4, new lh0.d1(g1Var, 2)), 3), new dh0.a(5, new lh0.d1(g1Var, 3)), 1).i();
        }
        fk2.c cVar2 = new fk2.c(1, i13.m(j13, TimeUnit.SECONDS, tk2.e.f118016b), ck2.i.f27926f);
        Intrinsics.checkNotNullExpressionValue(cVar2, "onErrorComplete(...)");
        Object o13 = kh2.j.o(cVar2, cVar);
        return o13 == cl2.a.COROUTINE_SUSPENDED ? o13 : Unit.f80348a;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getH0() {
        return this.f139956m0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.f139955l0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = vq1.c.fragment_unauth_loading;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        f7().j(this.f139957n0);
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Q7(true);
        PinterestLoadingLayout pinterestLoadingLayout = this.f139952i0;
        if (pinterestLoadingLayout == null) {
            Intrinsics.r("loadingLayout");
            throw null;
        }
        pinterestLoadingLayout.showLoadingSpinner(true);
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new p(this, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        PinterestLoadingLayout pinterestLoadingLayout = this.f139952i0;
        if (pinterestLoadingLayout != null) {
            pinterestLoadingLayout.showLoadingSpinner(false);
        } else {
            Intrinsics.r("loadingLayout");
            throw null;
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Bundle arguments;
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        Navigation navigation = this.I;
        if (navigation == null || (arguments = navigation.getF49942d()) == null) {
            arguments = getArguments();
        }
        this.f139953j0 = arguments;
        View findViewById = v13.findViewById(vq1.b.unauth_loading);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f139952i0 = (PinterestLoadingLayout) findViewById;
        f7().h(this.f139957n0);
    }
}
