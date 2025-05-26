package we1;

import android.content.Context;
import android.view.ViewGroup;
import com.pinterest.feature.board.common.newideas.view.OneTapSavePinGridFlipContainer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129461i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n2 f129462j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ yq0.z f129463k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p2 f129464l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(n2 n2Var, p2 p2Var, yq0.z zVar, int i13) {
        super(0);
        this.f129461i = i13;
        this.f129462j = n2Var;
        this.f129464l = p2Var;
        this.f129463k = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i13 = this.f129461i;
        p2 p2Var = this.f129464l;
        yq0.z zVar = this.f129463k;
        n2 n2Var = this.f129462j;
        switch (i13) {
            case 0:
                Context context = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                nx.d0 d0Var = p2Var.f129551a.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                h0 h0Var = new h0(context, d0Var, zVar.f139760f);
                h0Var.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return h0Var;
            case 1:
                Context context2 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                ao2.j0 j0Var = zVar.f139760f;
                nx.d0 d0Var2 = p2Var.f129551a.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var2, "getPinalytics(...)");
                wa2.i iVar = new wa2.i(0, -1, -1, 1023, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
                p2 p2Var2 = n2Var.f129504k;
                if (p2Var2 == null || (str = p2Var2.f129556f) == null) {
                    str = "unknown";
                }
                tj0.z zVar2 = new tj0.z(context2, d0Var2, l3.c.J(iVar, null, str), j0Var);
                zVar2.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return zVar2;
            case 2:
                Context context3 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                ao2.j0 j0Var2 = zVar.f139760f;
                nx.d0 d0Var3 = p2Var.f129551a.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var3, "getPinalytics(...)");
                OneTapSavePinGridFlipContainer oneTapSavePinGridFlipContainer = new OneTapSavePinGridFlipContainer(context3, true, j0Var2, d0Var3, ni1.a2.a());
                oneTapSavePinGridFlipContainer.setLayoutParams(new ViewGroup.LayoutParams(p2Var.f129555e, -2));
                return oneTapSavePinGridFlipContainer;
            case 3:
                Context context4 = n2Var.getContext();
                nx.d0 d0Var4 = p2Var.f129551a.f122379a;
                i2 i2Var = p2Var.f129552b;
                h32.g0 g0Var = i2Var.f129428l;
                ao2.j0 j0Var3 = zVar.f139760f;
                Intrinsics.f(context4);
                Intrinsics.f(d0Var4);
                return new u0(context4, d0Var4, g0Var, i2Var.f129427k, j0Var3, i2Var.f129431o);
            case 4:
                Context context5 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                String uniqueScreenKey = p2Var.f129551a.f122379a.getUniqueScreenKey();
                ao2.j0 j0Var4 = zVar.f139760f;
                nx.d0 d0Var5 = p2Var.f129551a.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var5, "getPinalytics(...)");
                return new qa2.p0(context5, true, uniqueScreenKey, j0Var4, d0Var5, ni1.a2.a());
            default:
                Context context6 = n2Var.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                ao2.j0 j0Var5 = zVar.f139760f;
                nx.d0 d0Var6 = p2Var.f129551a.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var6, "getPinalytics(...)");
                return new r0(context6, j0Var5, d0Var6, p2Var.f129552b.f129427k);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(n2 n2Var, yq0.z zVar, p2 p2Var, int i13) {
        super(0);
        this.f129461i = i13;
        this.f129462j = n2Var;
        this.f129463k = zVar;
        this.f129464l = p2Var;
    }
}
