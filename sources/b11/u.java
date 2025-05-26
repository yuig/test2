package b11;

import android.content.Context;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.navigation.Navigation;
import i01.x0;
import kh2.k3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.l6;
import so.m6;
import so.o6;
import so.s8;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21086i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ PinCloseupFragment f21087j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(PinCloseupFragment pinCloseupFragment, int i13) {
        super(0);
        this.f21086i = i13;
        this.f21087j = pinCloseupFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
    
        if (kotlin.text.z.p(r0, "employee", false) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        if (kotlin.text.StringsKt.E(r0, "pwt", false) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
    
        if (kotlin.text.z.p(r0, "employee", false) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0118, code lost:
    
        if (kotlin.text.StringsKt.E(r0, "pwt", false) != false) goto L61;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean invoke() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b11.u.invoke():java.lang.Boolean");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f21086i;
        PinCloseupFragment pinCloseupFragment = this.f21087j;
        switch (i13) {
            case 0:
                pr0.g gVar = new pr0.g(x0.f70705a, new ky.d(pinCloseupFragment.f7()), null, null, null, null, null, null, null, 508);
                gVar.f101178m = false;
                return gVar;
            case 1:
                return invoke();
            case 2:
                return invoke();
            case 3:
                return invoke();
            case 4:
                return invoke();
            case 5:
                return invoke();
            case 6:
                return invoke();
            case 7:
                return invoke();
            case 8:
                wk2.a aVar = pinCloseupFragment.f46993h1;
                if (aVar != null) {
                    return (rq.s) aVar.get();
                }
                Intrinsics.r("legoPinCreatorAnalyticsModuleProvider");
                throw null;
            case 9:
                wk2.a aVar2 = pinCloseupFragment.f46996i1;
                if (aVar2 != null) {
                    return (rq.t) aVar2.get();
                }
                Intrinsics.r("legoPinNonCreatorAnalyticsModuleProvider");
                throw null;
            case 10:
                l6 l6Var = pinCloseupFragment.U0;
                if (l6Var != null) {
                    Context w93 = pinCloseupFragment.w9();
                    androidx.lifecycle.z viewLifecycleOwner = pinCloseupFragment.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                    nx.d0 s73 = pinCloseupFragment.s7();
                    int i14 = f62.d.see_it_styled_closeup_carousel_layout;
                    s8 s8Var = l6Var.f113534a.f114091b;
                    yw0.e eVar = new yw0.e(w93, S, s73, i14, (m6) s8Var.f114243c2.get());
                    eVar.f140279g = s8Var.F6();
                    return eVar;
                }
                Intrinsics.r("seeItStyledModuleCarouselViewFactory");
                throw null;
            case 11:
                o6 o6Var = pinCloseupFragment.V0;
                if (o6Var != null) {
                    Context w94 = pinCloseupFragment.w9();
                    androidx.lifecycle.z viewLifecycleOwner2 = pinCloseupFragment.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                    return o6Var.a(w94, pinCloseupFragment.s7(), bf.b.S(viewLifecycleOwner2));
                }
                Intrinsics.r("adsStlShoppingModuleViewFactory");
                throw null;
            case 12:
                int i15 = PinCloseupFragment.f46972m3;
                return new ye1.s(pinCloseupFragment.w9());
            case 13:
                int i16 = PinCloseupFragment.f46972m3;
                return new ye1.l(pinCloseupFragment.w9());
            case 14:
                int i17 = PinCloseupFragment.f46972m3;
                return new ye1.v(pinCloseupFragment.w9());
            case 15:
                return invoke();
            case 16:
                int i18 = PinCloseupFragment.f46972m3;
                return Integer.valueOf(k3.k0(pinCloseupFragment.w9()));
            case 17:
                return invoke();
            case 18:
                return invoke();
            case 19:
                return invoke();
            default:
                Navigation navigation = pinCloseupFragment.I;
                if (navigation != null && navigation.S("com.pinterest.EXCLUDE_AD", false)) {
                    Context requireContext = pinCloseupFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    return kh2.s0.c1(requireContext);
                }
                Context requireContext2 = pinCloseupFragment.requireContext();
                Intrinsics.f(requireContext2);
                return requireContext2;
        }
    }
}
