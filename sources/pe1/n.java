package pe1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import java.util.HashMap;
import kc1.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nx.t0;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99966i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f99967j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, int i13) {
        super(1);
        this.f99966i = i13;
        this.f99967j = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f99966i;
        p pVar = this.f99967j;
        switch (i13) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                t0.b(pVar.t7(), pVar.generateLoggingContext(), f1.TAP, null, null, null, null, false, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
                pVar.O5(it, new HashMap());
                break;
            default:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                l lVar = pVar.f99980r1;
                if (lVar != null) {
                    new w((r) lVar, 27).invoke(pin);
                }
                break;
        }
        return Unit.f80348a;
    }
}
