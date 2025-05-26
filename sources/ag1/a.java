package ag1;

import com.pinterest.api.model.ln0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import tb0.p;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15126i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f15127j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(1);
        this.f15126i = i13;
        this.f15127j = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f15126i;
        b bVar = this.f15127j;
        switch (i13) {
            case 0:
                bVar.f15132e = (ln0) obj;
                break;
            default:
                bVar.f15129b.q((Throwable) obj, "Error when getting initial draft", p.IDEA_PINS_CREATION);
                break;
        }
        return Unit.f80348a;
    }
}
