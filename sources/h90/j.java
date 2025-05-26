package h90;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;
import we1.d2;
import x02.i2;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68262i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f68263j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(r rVar, int i13) {
        super(0);
        this.f68262i = i13;
        this.f68263j = rVar;
    }

    public final String b() {
        int i13 = this.f68262i;
        r rVar = this.f68263j;
        switch (i13) {
            case 0:
                return com.bumptech.glide.d.Z(rVar, "EXTRA_COLLAGES_SHUFFLE_ITEM_ASSET_ID", "");
            case 1:
                return com.bumptech.glide.d.Z(rVar, "EXTRA_COLLAGES_SHUFFLE_ITEM_PIN_ID", "");
            case 2:
                return com.bumptech.glide.d.Z(rVar, "EXTRA_COLLAGES_SHUFFLE_ITEM_USER_ID", "");
            case 3:
            case 4:
            default:
                return com.bumptech.glide.d.Z(rVar, "EXTRA_COLLAGES_SHUFFLE_ITEM_ID", "");
            case 5:
                return com.bumptech.glide.d.Z(rVar, "pin.id", "");
        }
    }

    public final View e() {
        int i13 = this.f68262i;
        r rVar = this.f68263j;
        switch (i13) {
            case 13:
                Context requireContext = rVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner = rVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return new d2(requireContext, bf.b.S(viewLifecycleOwner));
            case 14:
                Context requireContext2 = rVar.requireContext();
                nx.d0 d0Var = ((uk1.d) rVar.V0.getValue()).f122379a;
                m60.w f73 = rVar.f7();
                np0.d dVar = rVar.P0;
                if (dVar == null) {
                    Intrinsics.r("closeupActionController");
                    throw null;
                }
                i2 i2Var = rVar.Q0;
                if (i2Var == null) {
                    Intrinsics.r("pinRepository");
                    throw null;
                }
                HashMap o03 = rVar.getO0();
                boolean G = com.bumptech.glide.d.G(rVar, "EXTRA_COLLAGES_SHUFFLE_ITEM_IS_COLLAGE_AD", false);
                String Z = com.bumptech.glide.d.Z(rVar, "EXTRA_COLLAGES_ROOT_PIN_ID", "");
                String str = (String) rVar.f68293d1.getValue();
                lh0.e0 e0Var = rVar.U0;
                if (e0Var == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                d1 z73 = rVar.z7();
                boolean G2 = com.bumptech.glide.d.G(rVar, "EXTRA_COLLAGE_PIN_SINGLE_DEST", false);
                Intrinsics.f(requireContext2);
                Intrinsics.f(d0Var);
                return new k90.k(requireContext2, d0Var, f73, dVar, i2Var, o03, e0Var, true, G, Z, str, z73, G2, 14);
            default:
                Context requireContext3 = rVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                String str2 = (String) rVar.Z0.getValue();
                m60.w f74 = rVar.f7();
                nx.d0 d0Var2 = ((uk1.d) rVar.V0.getValue()).f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                lh0.e0 e0Var2 = rVar.U0;
                if (e0Var2 != null) {
                    return new k90.g(requireContext3, str2, f74, d0Var2, rVar.f68302m1, e0Var2);
                }
                Intrinsics.r("experiments");
                throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r1.l("android_collage_cutout_closeup_refresh") == false) goto L34;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h90.j.invoke():java.lang.Object");
    }
}
