package xa1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import va1.e1;

/* loaded from: classes5.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134457a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, int i13) {
        super(1, lVar, l.class, "handleMenuItemAction", "handleMenuItemAction(Lcom/pinterest/feature/settings/menu/model/SettingsMainMenuItem;)V", 0);
        this.f134457a = i13;
        if (i13 == 1) {
            super(1, lVar, l.class, "handleMenuItemAction", "handleMenuItemAction(Lcom/pinterest/feature/settings/menu/model/SettingsMainMenuItem;)V", 0);
            return;
        }
        if (i13 == 2) {
            super(1, lVar, l.class, "handleBannerShown", "handleBannerShown(Lcom/pinterest/feature/settings/menu/model/SettingsMainMenuItem;)V", 0);
        } else if (i13 != 3) {
        } else {
            super(1, lVar, l.class, "handleBannerDismissed", "handleBannerDismissed(Lcom/pinterest/feature/settings/menu/model/SettingsMainMenuItem;)V", 0);
        }
    }

    public final void h(e1 p03) {
        com.pinterest.feature.settings.menu.a aVar;
        com.pinterest.feature.settings.menu.a aVar2;
        switch (this.f134457a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                l.U8((l) this.receiver, p03);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(p03, "p0");
                l.U8((l) this.receiver, p03);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p03, "p0");
                l lVar = (l) this.receiver;
                if (lVar.M0 && (aVar = lVar.H0) != null) {
                    ((wa1.k) aVar).u3(p03);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                l lVar2 = (l) this.receiver;
                if (lVar2.M0 && (aVar2 = lVar2.H0) != null) {
                    ((wa1.k) aVar2).t3(p03);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f134457a) {
            case 0:
                h((e1) obj);
                break;
            case 1:
                h((e1) obj);
                break;
            case 2:
                h((e1) obj);
                break;
            default:
                h((e1) obj);
                break;
        }
        return Unit.f80348a;
    }
}
