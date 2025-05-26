package on1;

import android.content.Context;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96749i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f96750j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ GestaltSwitchWithLabel f96751k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(GestaltSwitchWithLabel gestaltSwitchWithLabel, k kVar) {
        super(1);
        this.f96751k = gestaltSwitchWithLabel;
        this.f96750j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence charSequence;
        int i13 = this.f96749i;
        GestaltSwitchWithLabel gestaltSwitchWithLabel = this.f96751k;
        k kVar = this.f96750j;
        switch (i13) {
            case 0:
                k newState = (k) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                fm1.c cVar = GestaltSwitchWithLabel.f49614g;
                gestaltSwitchWithLabel.g0(kVar, newState);
                return Unit.f80348a;
            default:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                i0 i0Var = kVar.f96742c;
                if (i0Var != null) {
                    Context context = gestaltSwitchWithLabel.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    charSequence = i0Var.a(context);
                } else {
                    charSequence = null;
                }
                return rn1.a.y(it, bs1.c.h2(String.valueOf(charSequence)), vn1.c.SUBTLE, kVar.f96744e.toGestaltTextAlignment$switchComponent_release(), null, vn1.g.BODY_100, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097064);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, GestaltSwitchWithLabel gestaltSwitchWithLabel) {
        super(1);
        this.f96750j = kVar;
        this.f96751k = gestaltSwitchWithLabel;
    }
}
