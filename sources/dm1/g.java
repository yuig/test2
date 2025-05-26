package dm1;

import android.content.Context;
import com.pinterest.gestalt.callout.GestaltCallout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55364i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltCallout f55365j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(GestaltCallout gestaltCallout, int i13) {
        super(0);
        this.f55364i = i13;
        this.f55365j = gestaltCallout;
    }

    public final GestaltText b() {
        int i13 = this.f55364i;
        GestaltCallout gestaltCallout = this.f55365j;
        switch (i13) {
            case 0:
                Context context = gestaltCallout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new GestaltText(context, gestaltCallout.L().f55356b);
            default:
                Context context2 = gestaltCallout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new GestaltText(context2, gestaltCallout.L().f55355a);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f55364i) {
        }
        return b();
    }
}
