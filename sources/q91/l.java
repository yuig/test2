package q91;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103140a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yq0.b0 b0Var, int i13) {
        super(1, b0Var, m.class, "onCountrySelected", "onCountrySelected(Lcom/pinterest/feature/settings/account/model/CountrySettingsItem$CountryItem;)V", 0);
        this.f103140a = i13;
        if (i13 != 1) {
        } else {
            super(1, b0Var, u.class, "handleUpdateAction", "handleUpdateAction(Lcom/pinterest/feature/settings/shared/model/UpdateAction;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f103140a) {
            case 0:
                m91.b country = (m91.b) obj;
                Intrinsics.checkNotNullParameter(country, "p0");
                m mVar = (m) this.receiver;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(country, "country");
                p91.i iVar = mVar.A0;
                if (iVar != null) {
                    iVar.u3(country);
                }
                break;
            default:
                yc1.d p03 = (yc1.d) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                l91.h hVar = ((u) this.receiver).F0;
                if (hVar != null) {
                    ((p91.w) hVar).z3(p03);
                }
                break;
        }
        return Unit.f80348a;
    }
}
