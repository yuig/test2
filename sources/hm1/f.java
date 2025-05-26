package hm1;

import com.pinterest.gestalt.spinner.GestaltSpinner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69581i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ln1.d f69582j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ln1.d dVar, int i13) {
        super(1);
        this.f69581i = i13;
        this.f69582j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f69581i;
        ln1.d dVar = this.f69582j;
        switch (i13) {
            case 0:
                ln1.d it = (ln1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return dVar;
            default:
                GestaltSpinner component = (GestaltSpinner) obj;
                Intrinsics.checkNotNullParameter(component, "component");
                component.u(new f(dVar, 0));
                return Unit.f80348a;
        }
    }
}
