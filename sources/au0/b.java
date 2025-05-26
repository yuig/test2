package au0;

import com.pinterest.api.model.ln0;
import com.pinterest.feature.ideaPinCreation.closeup.view.q;
import com.pinterest.screens.d2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import m60.x0;
import tb0.p;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20470i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f20471j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(1);
        this.f20470i = i13;
        this.f20471j = dVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f20470i;
        d dVar = this.f20471j;
        switch (i13) {
            case 1:
                dVar.f20480f.q(th3, dVar.getClass().getSimpleName().concat(": failed to fetch StoryPinLocalData"), p.IDEA_PINS_CREATION);
                break;
            default:
                dVar.J3(x0.try_again);
                dVar.f20480f.q(th3, "IdeaPinCreationCloseupPresenter: generate adjusted image for publishing", p.IDEA_PINS_CREATION);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f20470i;
        d dVar = this.f20471j;
        switch (i13) {
            case 0:
                ln0 ln0Var = (ln0) obj;
                if (dVar.f20485k == null) {
                    dVar.f20485k = ln0Var;
                }
                dVar.f20486l = ln0Var;
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    q qVar = (q) ((yt0.d) dVar.getView());
                    if (qVar.X8()) {
                        qVar.D5();
                    } else {
                        qVar.M1(q.V8(qVar, d2.n()));
                    }
                }
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
