package qa2;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import com.pinterest.navigation.Navigation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final l f103300j = new l(0);

    /* renamed from: k, reason: collision with root package name */
    public static final l f103301k = new l(1);

    /* renamed from: l, reason: collision with root package name */
    public static final l f103302l = new l(2);

    /* renamed from: m, reason: collision with root package name */
    public static final l f103303m = new l(3);

    /* renamed from: n, reason: collision with root package name */
    public static final l f103304n = new l(4);

    /* renamed from: o, reason: collision with root package name */
    public static final l f103305o = new l(5);

    /* renamed from: p, reason: collision with root package name */
    public static final l f103306p = new l(6);

    /* renamed from: q, reason: collision with root package name */
    public static final l f103307q = new l(7);

    /* renamed from: r, reason: collision with root package name */
    public static final l f103308r = new l(8);

    /* renamed from: s, reason: collision with root package name */
    public static final l f103309s = new l(9);

    /* renamed from: t, reason: collision with root package name */
    public static final l f103310t = new l(10);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103311i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13) {
        super(1);
        this.f103311i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f103311i;
        switch (i13) {
            case 0:
                Throwable th3 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        th3.getMessage();
                        break;
                }
                return Unit.f80348a;
            case 1:
                Throwable th4 = (Throwable) obj;
                switch (i13) {
                    case 0:
                        th4.getMessage();
                        break;
                }
                return Unit.f80348a;
            case 2:
                h32.h0 update = (h32.h0) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.f67047f = h32.u0.AD_CLICKTHROUGH_DISCLOSURE;
                return Unit.f80348a;
            case 3:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                return CollectionsKt.d0(list) instanceof gb2.k ? kotlin.collections.m0.F(list, gb2.k.class) : kotlin.collections.q0.f80391a;
            case 4:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            case 5:
                v7 it2 = (v7) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.getUid();
            case 6:
                ba it3 = (ba) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return it3.getUid();
            case 7:
                List it4 = (List) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return it4;
            case 8:
                Navigation navigateToBoard = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigateToBoard, "$this$navigateToBoard");
                navigateToBoard.m0("com.pinterest.EXTRA_BOARD_VIEW_ENTRY_TYPE", "pin_saved_overlay");
                return Unit.f80348a;
            case 9:
                rn1.a it5 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return rn1.a.y(it5, null, null, null, null, null, 0, fm1.c.INVISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                ((Boolean) obj).getClass();
                return Unit.f80348a;
        }
    }
}
