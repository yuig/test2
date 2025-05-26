package di1;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.d4;
import i92.k;
import java.util.HashSet;
import java.util.Set;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.l4;
import m60.x0;
import nx.d0;
import so.z3;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldi1/g;", "Lyk1/k;", "Loc2/j;", "Lzh1/a;", "<init>", "()V", "videoFeature_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class g extends a implements oc2.j, zh1.a {

    /* renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f55060u0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public ai1.a f55061j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f55062k0;

    /* renamed from: l0, reason: collision with root package name */
    public Drawable f55063l0;

    /* renamed from: m0, reason: collision with root package name */
    public Drawable f55064m0;

    /* renamed from: n0, reason: collision with root package name */
    public k f55065n0;

    /* renamed from: o0, reason: collision with root package name */
    public uk1.e f55066o0;

    /* renamed from: p0, reason: collision with root package name */
    public a11.d f55067p0;

    /* renamed from: q0, reason: collision with root package name */
    public z3 f55068q0;

    /* renamed from: r0, reason: collision with root package name */
    public l4 f55069r0;

    /* renamed from: s0, reason: collision with root package name */
    public final v f55070s0 = m.b(new ee1.d(this, 22));

    /* renamed from: t0, reason: collision with root package name */
    public final d4 f55071t0 = d4.PIN_CLOSEUP_FULL_SCREEN_VIDEO;

    @Override // oc2.j
    public final Set S0() {
        return new HashSet();
    }

    @Override // androidx.fragment.app.Fragment, oc2.j
    public final View T() {
        Object parent = b8().getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        return (View) parent;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        Navigation navigation = this.I;
        if (navigation == null) {
            throw new IllegalStateException("Must receive a non-null Navigation intent");
        }
        String v03 = navigation.v0("com.pinterest.EXTRA_VIDEO_SCREEN_PIN_ID");
        if (v03 == null) {
            throw new IllegalStateException("Must receive a valid Pin id from Navigation");
        }
        if (navigation.V0() <= 0.0f) {
            throw new IllegalStateException("Must receive a valid aspect ratio from Navigation".toString());
        }
        z3 z3Var = this.f55068q0;
        if (z3Var == null) {
            Intrinsics.r("videoFullScreenPresenterFactory");
            throw null;
        }
        String string = getResources().getString(x0.generic_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        uk1.e eVar = this.f55066o0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        d0 s73 = s7();
        String f49940b = navigation.getF49940b();
        Intrinsics.checkNotNullExpressionValue(f49940b, "getId(...)");
        uk1.d f13 = ((uk1.a) eVar).f(s73, f49940b);
        a11.d dVar = this.f55067p0;
        if (dVar != null) {
            return z3Var.a(v03, string, f13, dVar.a(s7()));
        }
        Intrinsics.r("clickThroughHelperFactory");
        throw null;
    }

    @Override // nl1.d, jl1.a, com.pinterest.framework.screens.m
    public void activate() {
        super.activate();
        FragmentActivity E4 = E4();
        if (E4 != null) {
            k3.O1(E4);
            E4.getWindow().addFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
        b8().x0();
    }

    public final PinterestVideoView b8() {
        return (PinterestVideoView) this.f55070s0.getValue();
    }

    @Override // nl1.d, jl1.a, com.pinterest.framework.screens.m
    public void deactivate() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            k3.X1(E4);
            E4.getWindow().clearFlags(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        }
        super.deactivate();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF140067r0() {
        return this.f55071t0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return b8();
    }
}
