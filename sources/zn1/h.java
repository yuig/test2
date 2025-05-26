package zn1;

import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u5.x;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142307i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f142308j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(x xVar, int i13) {
        super(1);
        this.f142307i = i13;
        this.f142308j = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f142307i;
        x xVar = this.f142308j;
        switch (i13) {
            case 0:
                return new xn1.f(((GestaltTextField) xVar.f120537c).getId(), ((Boolean) obj).booleanValue());
            default:
                Unit it = (Unit) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return new xn1.c(((GestaltTextField) xVar.f120537c).getId());
        }
    }
}
