package lr;

import android.content.Context;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import so.oa;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final o f84533j = new o(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o f84534k = new o(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84535i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13) {
        super(0);
        this.f84535i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f84535i) {
            case 0:
                nk1.g gVar = new nk1.g(null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
                Context context = kb0.a.f79058b;
                return new ok1.f(gVar, ((oa) ((so1.b) ep.b.g(so1.b.class))).G2(), null, false, null, 60);
            default:
                return Unit.f80348a;
        }
    }
}
