package ev;

import android.content.Context;
import kh2.m2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60206i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f60207j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(1);
        this.f60206i = i13;
        this.f60207j = hVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f60206i;
        h hVar = this.f60207j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                Context requireContext = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return rn1.a.y(it, bs1.c.h2(m2.C0(requireContext, ps.s.ads_on_pinterest_private_policy, hVar.getString(ps.s.ads_on_pinterest_private_policy_bold))), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                Context requireContext2 = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return rn1.a.y(it, bs1.c.h2(m2.C0(requireContext2, ps.s.ads_on_pinterest_block_accounts, hVar.getString(ps.s.ads_on_pinterest_block_accounts_bold))), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                Context requireContext3 = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return rn1.a.y(it, bs1.c.h2(m2.C0(requireContext3, ps.s.ads_factors_listed, new CharSequence[0])), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                Context requireContext4 = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                return rn1.a.y(it, bs1.c.h2(m2.C0(requireContext4, ps.s.ad_targeting_attributes_update_personal_info, hVar.getString(ps.s.ad_targeting_attributes_update_personal_info_bold))), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Context requireContext5 = hVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return rn1.a.y(it, bs1.c.h2(m2.C0(requireContext5, ps.s.ads_on_pinterest_description, hVar.getString(ps.s.ads_on_pinterest_description_bold))), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f60206i) {
        }
        return b((rn1.a) obj);
    }
}
