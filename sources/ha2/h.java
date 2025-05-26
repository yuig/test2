package ha2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f68434j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f68435k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f68436l = new h(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h f68437m = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public static final h f68438n = new h(4);

    /* renamed from: o, reason: collision with root package name */
    public static final h f68439o = new h(5);

    /* renamed from: p, reason: collision with root package name */
    public static final h f68440p = new h(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68441i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f68441i = i13;
    }

    public final on1.b b(on1.b it) {
        switch (this.f68441i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, false, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, false, true, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, !it.f96708a, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, false, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f68441i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, vn1.c.DISABLED, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f68441i) {
            case 0:
                return e((rn1.a) obj);
            case 1:
                return b((on1.b) obj);
            case 2:
                return b((on1.b) obj);
            case 3:
                return b((on1.b) obj);
            case 4:
                return e((rn1.a) obj);
            case 5:
                return e((rn1.a) obj);
            default:
                return b((on1.b) obj);
        }
    }
}
