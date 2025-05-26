package jq1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.ideaPinDisplay.feature.bottomsheet.details.view.ads.AdsIdeaPinCreatorAndSponsorView;
import com.pinterest.navigation.Navigation;
import h32.d4;
import h32.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import we1.a2;
import yk1.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljq1/c;", "Lyk1/k;", "Lgq1/a;", "<init>", "()V", "ideaPinDisplay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class c extends e implements gq1.a {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f77464q0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public so.o f77465j0;

    /* renamed from: k0, reason: collision with root package name */
    public uk1.e f77466k0;

    /* renamed from: l0, reason: collision with root package name */
    public v f77467l0;

    /* renamed from: m0, reason: collision with root package name */
    public AdsIdeaPinCreatorAndSponsorView f77468m0;

    /* renamed from: n0, reason: collision with root package name */
    public iq1.c f77469n0;

    /* renamed from: o0, reason: collision with root package name */
    public final xk2.k f77470o0 = xk2.m.a(xk2.n.NONE, new a(this, 0));

    /* renamed from: p0, reason: collision with root package name */
    public final d4 f77471p0 = d4.PIN;

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.f77466k0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        g13.d(this.f77471p0, null, null, g0.PIN_STORY_PIN_PAGE, null);
        so.o oVar = this.f77465j0;
        if (oVar != null) {
            Navigation navigation = this.I;
            return oVar.a(g13, navigation != null ? navigation.getF49940b() : null);
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    public final ca2.e b8() {
        return (ca2.e) this.f77470o0.getValue();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF130901r1() {
        return this.f77471p0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        AdsIdeaPinCreatorAndSponsorView adsIdeaPinCreatorAndSponsorView = new AdsIdeaPinCreatorAndSponsorView(requireContext);
        b8().m(adsIdeaPinCreatorAndSponsorView.findViewById(fq1.b.ads_idea_pin_creator_sponsor_container));
        this.f77468m0 = adsIdeaPinCreatorAndSponsorView;
        adsIdeaPinCreatorAndSponsorView.setOnClickListener(new a2(this, 27));
        return adsIdeaPinCreatorAndSponsorView;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        b8().l();
        super.onDestroyView();
    }
}
