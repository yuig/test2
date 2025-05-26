package bb1;

import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22564i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f22565j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, int i13) {
        super(1);
        this.f22564i = i13;
        this.f22565j = wVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f22564i;
        w wVar = this.f22565j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "state");
                break;
        }
        return yl1.b.f(it, null, w.b8(wVar), null, null, null, null, null, null, 0, null, 1021);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22564i) {
            case 0:
                return b((yl1.b) obj);
            case 1:
                return b((yl1.b) obj);
            default:
                ao1.i bind = (ao1.i) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                GestaltTextField gestaltTextField = this.f22565j.f22571n0;
                if (gestaltTextField != null) {
                    bind.d(gestaltTextField.B0());
                    return Unit.f80348a;
                }
                Intrinsics.r("phoneNumberEdit");
                throw null;
        }
    }
}
