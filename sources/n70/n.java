package n70;

import android.content.Context;
import df.j1;
import h32.a4;
import h32.d4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import we1.d2;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89628i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f89629j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(w wVar, int i13) {
        super(0);
        this.f89628i = i13;
        this.f89629j = wVar;
    }

    public final String b() {
        int i13 = this.f89628i;
        w wVar = this.f89629j;
        switch (i13) {
            case 0:
                return com.bumptech.glide.d.Z(wVar, "com.pinterest.EXTRA_BOARD_ID", "");
            case 1:
                return com.bumptech.glide.d.Z(wVar, "com.pinterest.EXTRA_BOARD_SESSION_ID", "");
            case 2:
                return com.bumptech.glide.d.Z(wVar, "com.pinterest.EXTRA_PRODUCT_CATEGORY_ID", "");
            case 3:
                return com.bumptech.glide.d.Z(wVar, "com.pinterest.EXTRA_CROP_SOURCE", "");
            case 4:
                return com.bumptech.glide.d.Z(wVar, "com.pinterest.EXTRA_ENTRYPOINT", "");
            case 5:
                return com.bumptech.glide.d.Z(wVar, "com.pinterest.EXTRA_PIN_ID", "");
            case 6:
            case 7:
            case 11:
            default:
                return com.bumptech.glide.d.Z(wVar, "com.pinterest.EXTRA_SHOP_TOOL_TITLE", "");
            case 8:
                return com.bumptech.glide.d.Z(wVar, "com.pinterest.EXTRA_REQUEST_PARAMS", "");
            case 9:
                return com.bumptech.glide.d.Z(wVar, "com.pinterest.EXTRA_SHOP_TOOL_STL_IDS", "");
            case 10:
                return com.bumptech.glide.d.Z(wVar, "com.pinterest.EXTRA_STORY_ID", "");
            case 12:
                return com.bumptech.glide.d.Z(wVar, "com.pinterest.EXTRA_SHOP_TOOL_SUBTITLE", "");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        uk1.d e13;
        int i13 = this.f89628i;
        w wVar = this.f89629j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                Context requireContext = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner = wVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return new d2(requireContext, bf.b.S(viewLifecycleOwner));
            case 7:
                uk1.e eVar = wVar.Z0;
                if (eVar != null) {
                    return ((uk1.a) eVar).g();
                }
                Intrinsics.r("presenterPinalyticsFactory");
                throw null;
            case 8:
                return b();
            case 9:
                return b();
            case 10:
                return b();
            case 11:
                uk1.e eVar2 = wVar.Z0;
                if (eVar2 == null) {
                    Intrinsics.r("presenterPinalyticsFactory");
                    throw null;
                }
                e3.a aVar = new e3.a(5);
                aVar.p(d4.FEED, j1.U0((String) wVar.P0.getValue()) ? a4.FEED_BOARD_SHOP_SHOP_THE_LOOK : a4.FEED_BOARD_SHOP, h32.g0.SHOP_TOOL_STL_MODULE, null);
                Unit unit = Unit.f80348a;
                e13 = ((uk1.a) eVar2).e("", aVar);
                nr0.t tVar = wVar.f89692b1;
                if (tVar == null) {
                    Intrinsics.r("viewBindersMapProvider");
                    throw null;
                }
                wa2.i iVar = new wa2.i(0, -1, -1, 1023, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
                nx.d0 d0Var = e13.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                qa2.f fVar = new qa2.f(d0Var, (y32.f) null, (nr0.b) null, 14);
                yk1.v vVar = wVar.f89693c1;
                if (vVar == null) {
                    Intrinsics.r("viewResources");
                    throw null;
                }
                qa2.n a13 = fVar.a(vVar);
                yk1.v vVar2 = wVar.f89693c1;
                if (vVar2 == null) {
                    Intrinsics.r("viewResources");
                    throw null;
                }
                vq0.h x03 = kh2.b0.x0(tVar, 30, e13, iVar, a13, vVar2);
                Intrinsics.g(x03, "null cannot be cast to non-null type com.pinterest.feature.shopping.shoppingstories.structuredfeed.binder.StructuredFeedStoryViewBinderDelegate");
                return (se1.d) x03;
            case 12:
                return b();
            default:
                return b();
        }
    }
}
