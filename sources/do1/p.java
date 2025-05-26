package do1;

import com.pinterest.gestalt.toast.GestaltToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f55686i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f55687j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ GestaltToast f55688k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(GestaltToast gestaltToast, d dVar) {
        super(1);
        this.f55688k = gestaltToast;
        this.f55687j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f55686i;
        GestaltToast gestaltToast = this.f55688k;
        d dVar = this.f55687j;
        switch (i13) {
            case 0:
                d newState = (d) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                rm1.i iVar = GestaltToast.E;
                gestaltToast.C(dVar, newState);
                break;
            default:
                ((Number) obj).intValue();
                if (dVar.f55670f < 5000) {
                    gestaltToast.v(s.f55694k);
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(d dVar, GestaltToast gestaltToast) {
        super(1);
        this.f55687j = dVar;
        this.f55688k = gestaltToast;
    }
}
