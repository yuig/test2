package mn0;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import java.util.List;
import jk2.d0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import n60.o;
import uk2.p;
import yk1.i;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87754i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f87755j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e eVar, int i13) {
        super(1);
        this.f87754i = i13;
        this.f87755j = eVar;
    }

    public final void b(Throwable throwable) {
        int i13 = this.f87754i;
        e eVar = this.f87755j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (eVar.isBound()) {
                    ((rn0.e) ((ln0.b) eVar.getView())).setLoadState(i.ERROR);
                }
                eVar.f87775n.i(throwable.getMessage());
                return;
            case 1:
            case 3:
            case 5:
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (eVar.isBound()) {
                    ((rn0.e) ((ln0.b) eVar.getView())).setLoadState(i.ERROR);
                }
                eVar.f87775n.i(throwable.getMessage());
                return;
            case 2:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (eVar.isBound()) {
                    ((rn0.e) ((ln0.b) eVar.getView())).setLoadState(i.ERROR);
                }
                eVar.f87775n.i(throwable.getMessage());
                List list = eVar.f87767f;
                if (list == null || ((String) CollectionsKt.firstOrNull(list)) == null) {
                    return;
                }
                try {
                    eVar.f87773l.L((String) list.get(0)).d(new d0(new hk2.b(new xl0.a(6, new b(eVar, 5)), new xl0.a(7, new b(eVar, 6)), ck2.i.f27923c), 0L));
                    return;
                } catch (NullPointerException e13) {
                    throw e13;
                } catch (Throwable th3) {
                    throw o.g(th3, "subscribeActual failed", th3);
                }
            case 4:
                ((rn0.e) ((ln0.b) eVar.getView())).setLoadState(i.LOADED);
                eVar.f87775n.i(((yk1.a) eVar.f87776o).f139224a.getString(l70.d.bulk_move_pins_error_message));
                eVar.f87778q.o("Couldn't load board object in BoardSectionCreatePresenter", throwable);
                return;
            case 6:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                eVar.f87778q.p(throwable);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f87754i;
        e eVar = this.f87755j;
        switch (i13) {
            case 0:
                b((Throwable) obj);
                break;
            case 1:
                ba createdBoardSection = (ba) obj;
                Intrinsics.checkNotNullParameter(createdBoardSection, "boardSection");
                if (qb0.b.o(eVar.f87767f)) {
                    if (eVar.isBound()) {
                        ((rn0.e) ((ln0.b) eVar.getView())).setLoadState(i.LOADED);
                        rn0.e eVar2 = (rn0.e) ((ln0.b) eVar.getView());
                        if (eVar2.U6()) {
                            eVar2.D5();
                        } else {
                            eVar2.P7();
                        }
                    }
                    j12.b bVar = eVar.f87777p;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(createdBoardSection, "createdBoardSection");
                    Object value = bVar.f74410a.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((p) value).c(createdBoardSection);
                } else {
                    List list = eVar.f87767f;
                    if (list != null) {
                        d dVar = new d(0, eVar, createdBoardSection);
                        eVar.f87773l.L((String) list.get(0)).s().p(dVar);
                        Intrinsics.checkNotNullExpressionValue(dVar, "subscribeWith(...)");
                        eVar.addDisposable(dVar);
                    }
                }
                break;
            case 2:
                b((Throwable) obj);
                break;
            case 3:
                eVar.f87783v = (v7) obj;
                ((rn0.e) ((ln0.b) eVar.getView())).setLoadState(i.LOADED);
                break;
            case 4:
                b((Throwable) obj);
                break;
            case 5:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                e.p3(eVar, pin, eVar.f87763b);
                break;
            case 6:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
