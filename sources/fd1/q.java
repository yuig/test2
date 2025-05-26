package fd1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61990i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ os.g f61991j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(os.g gVar, int i13) {
        super(1);
        this.f61990i = i13;
        this.f61991j = gVar;
    }

    public final void b(om1.q bind) {
        int i13 = this.f61990i;
        os.g gVar = this.f61991j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                rm1.q icon = gVar.f97487d;
                Intrinsics.f(icon);
                bind.getClass();
                Intrinsics.checkNotNullParameter(icon, "icon");
                bind.f96676a = icon;
                bind.e(fm1.c.VISIBLE);
                bind.c(om1.e.XL);
                om1.f iconStyle = gVar.f97488e;
                Intrinsics.checkNotNullExpressionValue(iconStyle, "iconStyle");
                bind.d(iconStyle);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                rm1.q icon2 = gVar.f97487d;
                Intrinsics.f(icon2);
                bind.getClass();
                Intrinsics.checkNotNullParameter(icon2, "icon");
                bind.f96676a = icon2;
                bind.e(fm1.c.VISIBLE);
                bind.c(om1.e.XL);
                om1.f iconStyle2 = gVar.f97488e;
                Intrinsics.checkNotNullExpressionValue(iconStyle2, "iconStyle");
                bind.d(iconStyle2);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f61990i) {
            case 0:
                b((om1.q) obj);
                break;
            default:
                b((om1.q) obj);
                break;
        }
        return Unit.f80348a;
    }
}
