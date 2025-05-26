package bv0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d2;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23918i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f23919j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, int i13) {
        super(0);
        this.f23918i = i13;
        this.f23919j = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        g gVar = this.f23919j;
        int i13 = this.f23918i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        av0.k kVar = (av0.k) gVar.f23925n.getView();
                        ScreenLocation location = (ScreenLocation) d2.f50649j.getValue();
                        u0 u0Var = u0.STORY_PIN_PARTNER_TAG_SECTION;
                        fv0.b bVar = (fv0.b) kVar;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(location, "location");
                        if (u0Var != null) {
                            fv0.b.V8(bVar, u0Var);
                        }
                        NavigationImpl w13 = Navigation.w1(location);
                        Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
                        bVar.M1(w13);
                        break;
                    default:
                        av0.k kVar2 = (av0.k) gVar.f23924m.getView();
                        ScreenLocation location2 = (ScreenLocation) d2.f50657r.getValue();
                        fv0.b bVar2 = (fv0.b) kVar2;
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(location2, "location");
                        NavigationImpl w14 = Navigation.w1(location2);
                        Intrinsics.checkNotNullExpressionValue(w14, "create(...)");
                        bVar2.M1(w14);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        av0.k kVar3 = (av0.k) gVar.f23925n.getView();
                        ScreenLocation location3 = (ScreenLocation) d2.f50649j.getValue();
                        u0 u0Var2 = u0.STORY_PIN_PARTNER_TAG_SECTION;
                        fv0.b bVar3 = (fv0.b) kVar3;
                        bVar3.getClass();
                        Intrinsics.checkNotNullParameter(location3, "location");
                        if (u0Var2 != null) {
                            fv0.b.V8(bVar3, u0Var2);
                        }
                        NavigationImpl w15 = Navigation.w1(location3);
                        Intrinsics.checkNotNullExpressionValue(w15, "create(...)");
                        bVar3.M1(w15);
                        break;
                    default:
                        av0.k kVar4 = (av0.k) gVar.f23924m.getView();
                        ScreenLocation location4 = (ScreenLocation) d2.f50657r.getValue();
                        fv0.b bVar4 = (fv0.b) kVar4;
                        bVar4.getClass();
                        Intrinsics.checkNotNullParameter(location4, "location");
                        NavigationImpl w16 = Navigation.w1(location4);
                        Intrinsics.checkNotNullExpressionValue(w16, "create(...)");
                        bVar4.M1(w16);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
