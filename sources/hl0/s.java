package hl0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final s f69496j = new s(0);

    /* renamed from: k, reason: collision with root package name */
    public static final s f69497k = new s(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69498i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i13) {
        super(0);
        this.f69498i = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f69498i) {
            case 0:
                xk1.e eVar = new xk1.e();
                eVar.u(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER);
                eVar.y();
                return eVar;
            default:
                return Unit.f80348a;
        }
    }
}
