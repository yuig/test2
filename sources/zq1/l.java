package zq1;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142704i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f142705j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(o oVar, int i13) {
        super(1);
        this.f142704i = i13;
        this.f142705j = oVar;
    }

    public final void b(xj2.c cVar) {
        int i13 = this.f142704i;
        o oVar = this.f142705j;
        switch (i13) {
            case 0:
                ((yq1.u) ((q) oVar.getView())).d8(true);
                break;
            default:
                ((yq1.u) ((q) oVar.getView())).d8(true);
                ((yq1.u) ((q) oVar.getView())).e8(false);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142704i;
        o oVar = this.f142705j;
        switch (i13) {
            case 0:
                b((xj2.c) obj);
                return Unit.f80348a;
            case 1:
                if (((qr1.x) obj).getIsGoogleEligible()) {
                    yq1.u uVar = (yq1.u) ((q) oVar.getView());
                    GestaltText gestaltText = uVar.D0;
                    if (gestaltText == null) {
                        Intrinsics.r("accountResilienceUpsellText");
                        throw null;
                    }
                    gestaltText.i(yq1.c.f139810r);
                    GestaltText gestaltText2 = uVar.E0;
                    if (gestaltText2 == null) {
                        Intrinsics.r("orBetweenOptionsText");
                        throw null;
                    }
                    pk.a0.w1(gestaltText2);
                    GestaltButton gestaltButton = uVar.C0;
                    if (gestaltButton == null) {
                        Intrinsics.r("googleLinkButton");
                        throw null;
                    }
                    pk.a0.v1(gestaltButton);
                }
                return Unit.f80348a;
            case 2:
                qr1.d authResult = (qr1.d) obj;
                Intrinsics.checkNotNullParameter(authResult, "authResult");
                return ((lb2.n) oVar.f142717e).i(new c60.a(authResult.getV3AccessToken(), authResult.getV5AccessToken(), authResult.getV5RefreshToken()));
            case 3:
                b((xj2.c) obj);
                return Unit.f80348a;
            default:
                qr1.c cVar = (qr1.c) obj;
                com.pinterest.identity.authentication.a aVar = oVar.f142714b;
                Intrinsics.f(cVar);
                aVar.b(cVar, null);
                return Unit.f80348a;
        }
    }
}
