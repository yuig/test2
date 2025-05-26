package ev;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.ads.feature.waista.view.GenAiDisclosureSkeletonLoadingView;
import com.pinterest.ads.screen.AdsLocation;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kg.n;
import kh2.m2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import ps.p;
import ps.q;
import ps.s;
import so.d1;
import yk1.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lev/h;", "Lyk1/k;", "Lbv/b;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends l implements bv.b, View.OnClickListener {
    public static final /* synthetic */ int B0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public mo1.d f60208j0;

    /* renamed from: k0, reason: collision with root package name */
    public d1 f60209k0;

    /* renamed from: l0, reason: collision with root package name */
    public lh0.g f60210l0;

    /* renamed from: m0, reason: collision with root package name */
    public bv.a f60211m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltText f60212n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltText f60213o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltIconButton f60214p0;

    /* renamed from: q0, reason: collision with root package name */
    public RecyclerView f60215q0;

    /* renamed from: r0, reason: collision with root package name */
    public GestaltText f60216r0;

    /* renamed from: s0, reason: collision with root package name */
    public GenAiDisclosureSkeletonLoadingView f60217s0;

    /* renamed from: t0, reason: collision with root package name */
    public GestaltText f60218t0;

    /* renamed from: u0, reason: collision with root package name */
    public GestaltText f60219u0;

    /* renamed from: v0, reason: collision with root package name */
    public GestaltText f60220v0;

    /* renamed from: w0, reason: collision with root package name */
    public GestaltText f60221w0;

    /* renamed from: y0, reason: collision with root package name */
    public dp.a f60223y0;

    /* renamed from: x0, reason: collision with root package name */
    public final LinkedHashMap f60222x0 = new LinkedHashMap();

    /* renamed from: z0, reason: collision with root package name */
    public final d4 f60224z0 = d4.ABOUT_ADS;
    public final g0 A0 = g0.PIN_AD_TARGETING_REASONS_DIALOG;

    @Override // yk1.k, nl1.d
    public final void K7() {
        super.K7();
        f7().d(new r70.h(false, false));
    }

    @Override // yk1.k
    public final m V7() {
        Navigation navigation = this.I;
        String f49940b = navigation != null ? navigation.getF49940b() : null;
        if (f49940b == null) {
            f49940b = "";
        }
        Navigation navigation2 = this.I;
        String v03 = navigation2 != null ? navigation2.v0("com.pinterest.TRACKING_PARAMETER") : null;
        f0 b73 = b7();
        e3.a aVar = new e3.a(5);
        aVar.p(this.f60224z0, (a4) aVar.f56997c, null, null);
        Unit unit = Unit.f80348a;
        ps.l lVar = new ps.l(f49940b, v03, b73, aVar);
        d1 d1Var = this.f60209k0;
        if (d1Var != null) {
            return d1Var.a(f49940b, lVar);
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b8(com.pinterest.api.model.f30.a r6) {
        /*
            r5 = this;
            r0 = 0
            lh0.g r1 = r5.f60210l0
            r2 = 0
            if (r1 == 0) goto La2
            boolean r1 = r1.d()
            if (r1 == 0) goto L29
            if (r6 == 0) goto L29
            android.content.Context r6 = r5.requireContext()
            java.lang.String r1 = "requireContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            int r1 = ps.s.ads_gen_ai_modified_with_ai
            int r3 = ps.s.ads_gen_ai_modified_with_ai_learn_more
            java.lang.String r3 = r5.getString(r3)
            r4 = 1
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[r4]
            r4[r0] = r3
            java.lang.CharSequence r6 = kh2.m2.C0(r6, r1, r4)
            goto L50
        L29:
            com.pinterest.api.model.f30$a r1 = com.pinterest.api.model.f30.a.TRAINED_ALGORITHMIC_MEDIA
            if (r6 != r1) goto L34
            int r6 = ps.s.ads_gen_ai_made
            java.lang.String r6 = r5.getString(r6)
            goto L50
        L34:
            com.pinterest.api.model.f30$a r1 = com.pinterest.api.model.f30.a.DETECTED_TRAINED_ALGORITHMIC_MEDIA
            if (r6 == r1) goto L4a
            com.pinterest.api.model.f30$a r1 = com.pinterest.api.model.f30.a.COMPOSITE_WITH_TRAINED_ALGORITHMIC_MEDIA
            if (r6 != r1) goto L3d
            goto L4a
        L3d:
            com.pinterest.api.model.f30$a r1 = com.pinterest.api.model.f30.a.MULTI_PIN_TRAINED_ALGORITHMIC_MEDIA
            if (r6 != r1) goto L48
            int r6 = ps.s.ads_gen_ai_partial_made
            java.lang.String r6 = r5.getString(r6)
            goto L50
        L48:
            r6 = r2
            goto L50
        L4a:
            int r6 = ps.s.ads_gen_ai_modified
            java.lang.String r6 = r5.getString(r6)
        L50:
            if (r6 == 0) goto L5d
            java.lang.String r1 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            u50.f0 r1 = new u50.f0
            r1.<init>(r6)
            goto L5e
        L5d:
            r1 = r2
        L5e:
            java.lang.String r6 = "genAiDisclosureDescription"
            if (r1 == 0) goto L92
            com.pinterest.gestalt.text.GestaltText r3 = r5.f60216r0
            if (r3 == 0) goto L8e
            bs1.c.U1(r3)
            com.pinterest.gestalt.text.GestaltText r3 = r5.f60216r0
            if (r3 == 0) goto L8a
            ev.f r4 = new ev.f
            r4.<init>(r1)
            com.pinterest.gestalt.text.GestaltText r1 = r3.i(r4)
            ev.d r3 = new ev.d
            r3.<init>(r5, r0)
            r1.j(r3)
            bv.a r0 = r5.f60211m0
            if (r0 == 0) goto L92
            dv.f r0 = (dv.f) r0
            r0.q3()
            kotlin.Unit r0 = kotlin.Unit.f80348a
            goto L93
        L8a:
            kotlin.jvm.internal.Intrinsics.r(r6)
            throw r2
        L8e:
            kotlin.jvm.internal.Intrinsics.r(r6)
            throw r2
        L92:
            r0 = r2
        L93:
            if (r0 != 0) goto La1
            com.pinterest.gestalt.text.GestaltText r0 = r5.f60216r0
            if (r0 == 0) goto L9d
            bs1.c.X0(r0)
            goto La1
        L9d:
            kotlin.jvm.internal.Intrinsics.r(r6)
            throw r2
        La1:
            return
        La2:
            java.lang.String r6 = "adsExperiments"
            kotlin.jvm.internal.Intrinsics.r(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ev.h.b8(com.pinterest.api.model.f30$a):void");
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getA0() {
        return this.A0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF60224z0() {
        return this.f60224z0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v13) {
        n.a(v13);
        Intrinsics.checkNotNullParameter(v13, "v");
        int id3 = v13.getId();
        int i13 = p.ad_reasons_targeting_description;
        g0 g0Var = this.A0;
        if (id3 == i13) {
            bv.a aVar = this.f60211m0;
            if (aVar != null) {
                ((dv.f) aVar).p3();
            }
            bv.a aVar2 = this.f60211m0;
            if (aVar2 != null) {
                ((dv.f) aVar2).r3(g0Var, u0.PIN_AD_TARGETING_CREATOR_PROFILE);
                return;
            }
            return;
        }
        if (id3 == p.ad_reasons_block_description) {
            mo1.d dVar = this.f60208j0;
            if (dVar == null) {
                Intrinsics.r("intentHelper");
                throw null;
            }
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            String b23 = bs1.c.b2(s.url_blocking);
            Intrinsics.checkNotNullExpressionValue(b23, "string(...)");
            dVar.b(requireContext, b23);
            bv.a aVar3 = this.f60211m0;
            if (aVar3 != null) {
                ((dv.f) aVar3).r3(g0Var, u0.PIN_AD_TARGETING_REASONS_LEARN_MORE_BLOCK_ADVERTISER);
                return;
            }
            return;
        }
        if (id3 == p.gen_ai_disclosure_description) {
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            CharSequence C0 = m2.C0(requireContext2, s.url_gen_ai, Locale.getDefault().getLanguage());
            mo1.d dVar2 = this.f60208j0;
            if (dVar2 == null) {
                Intrinsics.r("intentHelper");
                throw null;
            }
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            dVar2.b(requireContext3, C0.toString());
            bv.a aVar4 = this.f60211m0;
            if (aVar4 != null) {
                ((dv.f) aVar4).r3(g0Var, u0.WAISTA_GEN_AI_LABEL);
                return;
            }
            return;
        }
        if (id3 == p.ad_reasons_cancel) {
            d7.g.s(Navigation.w1(AdsLocation.ADS_REASONS), f7());
            return;
        }
        if (id3 == p.ad_reasons_update_personal_info) {
            bv.a aVar5 = this.f60211m0;
            if (aVar5 != null) {
                ((dv.f) aVar5).r3(g0Var, u0.PIN_AD_TARGETING_CHANGE_USER_SETTINGS);
            }
            f7().d(Navigation.w1(com.pinterest.screens.f.b()));
            return;
        }
        if (id3 == p.ads_on_pinterest_description) {
            bv.a aVar6 = this.f60211m0;
            if (aVar6 != null) {
                ((dv.f) aVar6).r3(g0Var, u0.PIN_AD_TARGETING_AD_PREFERENCES);
            }
            f7().d(Navigation.w1(com.pinterest.screens.f.c()));
            return;
        }
        if (id3 == p.ads_on_pinterest_private_policy) {
            bv.a aVar7 = this.f60211m0;
            if (aVar7 != null) {
                ((dv.f) aVar7).r3(g0Var, u0.PIN_AD_TARGETING_PRIVACY_POLICY);
            }
            Context requireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
            CharSequence C02 = m2.C0(requireContext4, s.url_private_policy, Locale.getDefault().getLanguage());
            mo1.d dVar3 = this.f60208j0;
            if (dVar3 == null) {
                Intrinsics.r("intentHelper");
                throw null;
            }
            Context requireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
            dVar3.b(requireContext5, C02.toString());
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(q.ad_reasons_waista_fragment, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view;
        dp.a aVar = this.f60223y0;
        if (aVar != null && (view = getView()) != null) {
            view.removeCallbacks(aVar);
        }
        super.onDestroyView();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        View findViewById = v13.findViewById(p.ad_reasons_targeting_description);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f60212n0 = (GestaltText) findViewById;
        View findViewById2 = v13.findViewById(p.ad_reasons_block_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f60213o0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(p.ad_reasons_cancel);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f60214p0 = (GestaltIconButton) findViewById3;
        View findViewById4 = v13.findViewById(p.ad_reasons_list);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f60215q0 = (RecyclerView) findViewById4;
        this.f60218t0 = (GestaltText) v13.findViewById(p.ad_reasons_update_personal_info);
        this.f60219u0 = (GestaltText) v13.findViewById(p.ad_reasons_more_factors);
        this.f60220v0 = (GestaltText) v13.findViewById(p.ads_on_pinterest_description);
        this.f60221w0 = (GestaltText) v13.findViewById(p.ads_on_pinterest_private_policy);
        View findViewById5 = v13.findViewById(p.gen_ai_disclosure_description);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f60216r0 = (GestaltText) findViewById5;
        this.f60217s0 = (GenAiDisclosureSkeletonLoadingView) v13.findViewById(p.gen_ai_disclosure_skeleton_loading_view);
        super.onViewCreated(v13, bundle);
        bv.a aVar = this.f60211m0;
        if (aVar != null) {
            ((dv.f) aVar).s3();
        }
    }

    @Override // nl1.d, nx.i1
    /* renamed from: t5 */
    public final HashMap getF63135d0() {
        return new HashMap(this.f60222x0);
    }
}
