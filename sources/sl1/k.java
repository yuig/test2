package sl1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f113185j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f113186k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f113187l = new k(2);

    /* renamed from: m, reason: collision with root package name */
    public static final k f113188m = new k(3);

    /* renamed from: n, reason: collision with root package name */
    public static final k f113189n = new k(4);

    /* renamed from: o, reason: collision with root package name */
    public static final k f113190o = new k(5);

    /* renamed from: p, reason: collision with root package name */
    public static final k f113191p = new k(6);

    /* renamed from: q, reason: collision with root package name */
    public static final k f113192q = new k(7);

    /* renamed from: r, reason: collision with root package name */
    public static final k f113193r = new k(8);

    /* renamed from: s, reason: collision with root package name */
    public static final k f113194s = new k(9);

    /* renamed from: t, reason: collision with root package name */
    public static final k f113195t = new k(10);

    /* renamed from: u, reason: collision with root package name */
    public static final k f113196u = new k(11);

    /* renamed from: v, reason: collision with root package name */
    public static final k f113197v = new k(12);

    /* renamed from: w, reason: collision with root package name */
    public static final k f113198w = new k(13);

    /* renamed from: x, reason: collision with root package name */
    public static final k f113199x = new k(14);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f113200i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f113200i = i13;
    }

    public final fm1.c b(i checkAndApplyDiff) {
        switch (this.f113200i) {
            case 3:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkDiff");
                break;
            default:
                Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkDiff");
                break;
        }
        return checkAndApplyDiff.f113181f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f113200i;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                return Unit.f80348a;
            case 1:
                i checkDiff = (i) obj;
                Intrinsics.checkNotNullParameter(checkDiff, "$this$checkDiff");
                return checkDiff.f113183h;
            case 2:
                i checkDiff2 = (i) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkDiff2, "$this$checkDiff");
                        return Integer.valueOf(checkDiff2.f113177b);
                    default:
                        Intrinsics.checkNotNullParameter(checkDiff2, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkDiff2.f113182g);
                }
            case 3:
                return b((i) obj);
            case 4:
                i checkDiff3 = (i) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(checkDiff3, "$this$checkDiff");
                        return Integer.valueOf(checkDiff3.f113177b);
                    default:
                        Intrinsics.checkNotNullParameter(checkDiff3, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkDiff3.f113182g);
                }
            case 5:
                i checkDiff4 = (i) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(checkDiff4, "$this$checkDiff");
                        return checkDiff4.f113178c;
                    default:
                        Intrinsics.checkNotNullParameter(checkDiff4, "$this$checkDiff");
                        return checkDiff4.f113178c;
                }
            case 6:
                i checkDiff5 = (i) obj;
                Intrinsics.checkNotNullParameter(checkDiff5, "$this$checkDiff");
                return checkDiff5.f113180e;
            case 7:
                i checkDiff6 = (i) obj;
                Intrinsics.checkNotNullParameter(checkDiff6, "$this$checkDiff");
                return checkDiff6.f113176a;
            case 8:
                return b((i) obj);
            case 9:
                i checkDiff7 = (i) obj;
                Intrinsics.checkNotNullParameter(checkDiff7, "$this$checkDiff");
                return Boolean.valueOf(checkDiff7.f113179d);
            case 10:
                i checkDiff8 = (i) obj;
                switch (i13) {
                    case 5:
                        Intrinsics.checkNotNullParameter(checkDiff8, "$this$checkDiff");
                        return checkDiff8.f113178c;
                    default:
                        Intrinsics.checkNotNullParameter(checkDiff8, "$this$checkDiff");
                        return checkDiff8.f113178c;
                }
            case 11:
                return b((i) obj);
            case 12:
                return Boolean.valueOf(obj instanceof GestaltAvatar);
            case 13:
                GestaltAvatar avatar = (GestaltAvatar) obj;
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                return avatar.O2().f108648b;
            default:
                i it = (i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return i.e(it, null, 0, null, false, null, fm1.c.GONE, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE);
        }
    }
}
