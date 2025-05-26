package yb1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final e f138555j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public static final e f138556k = new e(1);

    /* renamed from: l, reason: collision with root package name */
    public static final e f138557l = new e(2);

    /* renamed from: m, reason: collision with root package name */
    public static final e f138558m = new e(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f138559i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13) {
        super(1);
        this.f138559i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f138559i;
        switch (i13) {
            case 0:
                String it = (String) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
                return Unit.f80348a;
            case 1:
                String it2 = (String) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
                return Unit.f80348a;
            case 2:
                String it3 = (String) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        break;
                }
                return Unit.f80348a;
            default:
                on1.b it4 = (on1.b) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return on1.b.e(it4, false, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
        }
    }
}
