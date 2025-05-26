package go0;

import com.pinterest.api.model.v7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65868i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f65869j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, int i13) {
        super(1);
        this.f65868i = i13;
        this.f65869j = mVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f65868i;
        m mVar = this.f65869j;
        switch (i13) {
            case 1:
                mVar.f65878n.i(((yk1.a) mVar.f65879o).f139224a.getString(l70.d.bulk_move_pins_error_message));
                mVar.f65880p.o("Couldn't load pin move origin board in MovePinsBoardSectionPickerPresenter", th3);
                break;
            case 2:
            default:
                Intrinsics.f(th3);
                if (mVar.isBound()) {
                    ((ho0.d) ((fo0.b) mVar.getView())).setLoadState(yk1.i.LOADED);
                }
                mVar.f65878n.i(th3.getMessage());
                break;
            case 3:
                Intrinsics.f(th3);
                if (mVar.isBound()) {
                    ((ho0.d) ((fo0.b) mVar.getView())).setLoadState(yk1.i.LOADED);
                }
                mVar.f65878n.i(th3.getMessage());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m mVar = this.f65869j;
        int i13 = this.f65868i;
        switch (i13) {
            case 0:
                v7 v7Var = (v7) obj;
                switch (i13) {
                    case 0:
                        mVar.f65884t = v7Var;
                        break;
                    default:
                        mVar.f65883s = v7Var;
                        break;
                }
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                v7 v7Var2 = (v7) obj;
                switch (i13) {
                    case 0:
                        mVar.f65884t = v7Var2;
                        break;
                    default:
                        mVar.f65883s = v7Var2;
                        break;
                }
                break;
            case 3:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
