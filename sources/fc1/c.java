package fc1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f61733j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f61734k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61735i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f61735i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f61735i) {
            case 0:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                return Unit.f80348a;
            default:
                on1.b it = (on1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, false, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
        }
    }
}
