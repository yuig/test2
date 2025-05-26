package b11;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.navigation.Navigation;
import ey.l4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oq.x0;
import rq.e3;
import rq.j4;
import rq.m4;
import rq.p2;
import rq.x2;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20965i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f20966j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ PinCloseupFragment f20967k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Context context, PinCloseupFragment pinCloseupFragment, int i13) {
        super(0);
        this.f20965i = i13;
        this.f20966j = context;
        this.f20967k = pinCloseupFragment;
    }

    public final mz.e b() {
        int i13 = this.f20965i;
        Context context = this.f20966j;
        PinCloseupFragment pinCloseupFragment = this.f20967k;
        switch (i13) {
            case 8:
                dz.a aVar = pinCloseupFragment.f47032y1;
                if (aVar == null) {
                    Intrinsics.r("anketViewPagerAdapter");
                    throw null;
                }
                cz.e eVar = pinCloseupFragment.f47030x1;
                if (eVar != null) {
                    return new mz.e(context, aVar, eVar);
                }
                Intrinsics.r("anketManager");
                throw null;
            default:
                dz.a aVar2 = pinCloseupFragment.f47032y1;
                if (aVar2 == null) {
                    Intrinsics.r("anketViewPagerAdapter");
                    throw null;
                }
                cz.e eVar2 = pinCloseupFragment.f47030x1;
                if (eVar2 != null) {
                    return new mz.e(context, aVar2, eVar2);
                }
                Intrinsics.r("anketManager");
                throw null;
        }
    }

    public final x2 e() {
        q01.b bVar;
        Context context = this.f20966j;
        q01.b bVar2 = null;
        int i13 = this.f20965i;
        PinCloseupFragment pinCloseupFragment = this.f20967k;
        switch (i13) {
            case 5:
                pinCloseupFragment.requireActivity();
                x2 x2Var = new x2(context, pinCloseupFragment.q9(), pinCloseupFragment.f46995h3, 2);
                if (((Boolean) pinCloseupFragment.R2.getValue()).booleanValue()) {
                    RecyclerView g83 = pinCloseupFragment.g8();
                    if (g83 != null) {
                        FragmentActivity requireActivity = pinCloseupFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        bVar2 = new q01.b(pinCloseupFragment, g83, requireActivity);
                    }
                    pinCloseupFragment.f46977b2 = bVar2;
                }
                return x2Var;
            default:
                int i14 = PinCloseupFragment.f46972m3;
                RecyclerView g84 = pinCloseupFragment.g8();
                if (g84 == null) {
                    bVar = null;
                } else {
                    FragmentActivity requireActivity2 = pinCloseupFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                    bVar = new q01.b(pinCloseupFragment, g84, requireActivity2);
                }
                pinCloseupFragment.f46977b2 = bVar;
                View view = pinCloseupFragment.getView();
                if (view != null) {
                }
                pinCloseupFragment.requireActivity();
                return new x2(context, null, pinCloseupFragment.f46995h3, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20965i;
        Context context = this.f20966j;
        PinCloseupFragment pinCloseupFragment = this.f20967k;
        switch (i13) {
            case 0:
                p2 p2Var = new p2(context);
                int i14 = PinCloseupFragment.f46972m3;
                pinCloseupFragment.getClass();
                return p2Var;
            case 1:
                m4 m4Var = new m4(context);
                u01.v vVar = pinCloseupFragment.f47029w2;
                if (vVar != null) {
                    m4Var.f109380c = vVar.f119949b;
                    return m4Var;
                }
                Intrinsics.r("pinCloseupNavigationMetadata");
                throw null;
            case 2:
                pb0.d dVar = pinCloseupFragment.f46999j1;
                if (dVar != null) {
                    return new rq.u(context, dVar);
                }
                Intrinsics.r("fuzzyDateFormatter");
                throw null;
            case 3:
                return new rq.k0(context, pinCloseupFragment.X());
            case 4:
                androidx.lifecycle.z viewLifecycleOwner = pinCloseupFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                tq.y yVar = new tq.y(context, viewLifecycleOwner, pinCloseupFragment);
                pinCloseupFragment.f46994h2 = yVar;
                yVar.f118965k0 = ((Boolean) pinCloseupFragment.X2.getValue()).booleanValue();
                yVar.f118967l0 = ((Boolean) pinCloseupFragment.Y2.getValue()).booleanValue();
                yVar.f118985y = pinCloseupFragment.v9();
                u01.v vVar2 = pinCloseupFragment.f47029w2;
                if (vVar2 == null) {
                    Intrinsics.r("pinCloseupNavigationMetadata");
                    throw null;
                }
                a11.b arrivalMethod = vVar2.c().a();
                Intrinsics.checkNotNullParameter(arrivalMethod, "arrivalMethod");
                yVar.H = arrivalMethod;
                u01.v vVar3 = pinCloseupFragment.f47029w2;
                if (vVar3 == null) {
                    Intrinsics.r("pinCloseupNavigationMetadata");
                    throw null;
                }
                yVar.C = vVar3.f119949b;
                Navigation navigation = pinCloseupFragment.I;
                Object i03 = navigation != null ? navigation.i0("com.pinterest.PIN_LOGGING_EVENT_DATA") : null;
                to0.z zVar = i03 instanceof to0.z ? (to0.z) i03 : null;
                yVar.F = zVar != null ? zVar.f118703a : null;
                String pinUid = pinCloseupFragment.u9().getF49940b();
                Intrinsics.checkNotNullExpressionValue(pinUid, "getId(...)");
                pinCloseupFragment.getF86878d0();
                Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                new jy.w(pinUid).i();
                yVar.addOnLayoutChangeListener(new n5.h(6, yVar, pinCloseupFragment));
                return yVar;
            case 5:
                return e();
            case 6:
                return e();
            case 7:
                nx.d0 s73 = pinCloseupFragment.s7();
                androidx.lifecycle.z viewLifecycleOwner2 = pinCloseupFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                return new e3(context, s73, bf.b.S(viewLifecycleOwner2), pinCloseupFragment);
            case 8:
                return b();
            case 9:
                return b();
            case 10:
                androidx.lifecycle.z viewLifecycleOwner3 = pinCloseupFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                x0 x0Var = new x0(context, viewLifecycleOwner3, pinCloseupFragment);
                u01.v vVar4 = pinCloseupFragment.f47029w2;
                if (vVar4 == null) {
                    Intrinsics.r("pinCloseupNavigationMetadata");
                    throw null;
                }
                x0Var.f97180o0 = vVar4.c().a();
                u01.v vVar5 = pinCloseupFragment.f47029w2;
                if (vVar5 == null) {
                    Intrinsics.r("pinCloseupNavigationMetadata");
                    throw null;
                }
                x0Var.f97184q0 = vVar5.f119957j;
                pinCloseupFragment.f46991g2 = x0Var;
                String navigationSource = vVar5.f119949b;
                Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
                x0Var.f97178n0 = navigationSource;
                x0Var.f97182p0 = false;
                u01.v vVar6 = pinCloseupFragment.f47029w2;
                if (vVar6 == null) {
                    Intrinsics.r("pinCloseupNavigationMetadata");
                    throw null;
                }
                String searchQuery = vVar6.f119950c;
                if (searchQuery == null) {
                    searchQuery = "";
                }
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                x0Var.f97186r0 = searchQuery;
                x0Var.G0 = pinCloseupFragment.f47019r2;
                Navigation navigation2 = pinCloseupFragment.I;
                Object i04 = navigation2 != null ? navigation2.i0("com.pinterest.PIN_LOGGING_EVENT_DATA") : null;
                to0.z zVar2 = i04 instanceof to0.z ? (to0.z) i04 : null;
                x0Var.f97200y0 = zVar2 != null ? zVar2.f118703a : null;
                x0Var.f97202z0 = pinCloseupFragment.v9();
                Navigation navigation3 = pinCloseupFragment.I;
                x0Var.A0 = navigation3 != null ? navigation3.S("com.pinterest.EXTRA_CLOSEUP_IS_PIN_HIDE_SUPPORTED", true) : true;
                String pinUid2 = pinCloseupFragment.u9().getF49940b();
                Intrinsics.checkNotNullExpressionValue(pinUid2, "getId(...)");
                f30 pin = pinCloseupFragment.getPin();
                if (pin == null || !b40.P0(pin)) {
                    Intrinsics.checkNotNullParameter(pinUid2, "pinUid");
                    new jy.l(pinUid2).i();
                } else {
                    Intrinsics.checkNotNullParameter(pinUid2, "pinUid");
                    new l4(pinUid2).i();
                }
                x0Var.addOnLayoutChangeListener(new n5.h(7, x0Var, pinCloseupFragment));
                return x0Var;
            case 11:
                rq.s0 s0Var = new rq.s0(context, pinCloseupFragment);
                u01.v vVar7 = pinCloseupFragment.f47029w2;
                if (vVar7 != null) {
                    s0Var.f109536b = vVar7.f119949b;
                    return s0Var;
                }
                Intrinsics.r("pinCloseupNavigationMetadata");
                throw null;
            default:
                j4 j4Var = new j4(context, false);
                pinCloseupFragment.E2 = j4Var;
                return j4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(PinCloseupFragment pinCloseupFragment, Context context, int i13) {
        super(0);
        this.f20965i = i13;
        this.f20967k = pinCloseupFragment;
        this.f20966j = context;
    }
}
