package lr;

import android.content.Context;
import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84530i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltToast f84531j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f84532k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(GestaltToast gestaltToast, p pVar) {
        super(1);
        this.f84531j = gestaltToast;
        this.f84532k = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f84530i;
        p pVar = this.f84532k;
        GestaltToast gestaltToast = this.f84531j;
        switch (i13) {
            case 0:
                pVar.getClass();
                gestaltToast.v(new n(gestaltToast, pVar));
                return Unit.f80348a;
            default:
                do1.d it = (do1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = gestaltToast.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String string = gestaltToast.getResources().getString(f02.g.followed);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String Z2 = pVar.f84536d.Z2();
                if (Z2 == null) {
                    Z2 = "";
                }
                return do1.d.e(it, bs1.c.h2(f0.h.D(context, string, Z2)), null, null, 0, false, 506);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, GestaltToast gestaltToast) {
        super(1);
        this.f84532k = pVar;
        this.f84531j = gestaltToast;
    }
}
