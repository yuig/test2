package u60;

import com.pinterest.api.model.f30;
import dl1.s0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f120764j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f120765k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f120766l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f120767m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f120768n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f120769o = new d(5);

    /* renamed from: p, reason: collision with root package name */
    public static final d f120770p = new d(6);

    /* renamed from: q, reason: collision with root package name */
    public static final d f120771q = new d(7);

    /* renamed from: r, reason: collision with root package name */
    public static final d f120772r = new d(8);

    /* renamed from: s, reason: collision with root package name */
    public static final d f120773s = new d(9);

    /* renamed from: t, reason: collision with root package name */
    public static final d f120774t = new d(10);

    /* renamed from: u, reason: collision with root package name */
    public static final d f120775u = new d(11);

    /* renamed from: v, reason: collision with root package name */
    public static final d f120776v = new d(12);

    /* renamed from: w, reason: collision with root package name */
    public static final d f120777w = new d(13);

    /* renamed from: x, reason: collision with root package name */
    public static final d f120778x = new d(14);

    /* renamed from: y, reason: collision with root package name */
    public static final d f120779y = new d(15);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120780i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f120780i = i13;
    }

    public final Boolean b(List it) {
        switch (this.f120780i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Boolean.valueOf(!it.isEmpty());
    }

    public final List e(List list) {
        switch (this.f120780i) {
            case 0:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.i)) {
                    break;
                } else {
                    break;
                }
            case 3:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.k)) {
                    break;
                } else {
                    break;
                }
            case 7:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.i)) {
                    break;
                } else {
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.k)) {
                    break;
                } else {
                    break;
                }
        }
        return q0.f80391a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f120780i;
        switch (i13) {
            case 0:
                return e((List) obj);
            case 1:
                return b((List) obj);
            case 2:
                List it = (List) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return (gb2.i) d7.b.j0(it);
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return (gb2.i) d7.b.j0(it);
                }
            case 3:
                return e((List) obj);
            case 4:
                return b((List) obj);
            case 5:
                return b((List) obj);
            case 6:
                return Unit.f80348a;
            case 7:
                return e((List) obj);
            case 8:
                return b((List) obj);
            case 9:
                List it2 = (List) obj;
                switch (i13) {
                    case 2:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return (gb2.i) d7.b.j0(it2);
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return (gb2.i) d7.b.j0(it2);
                }
            case 10:
                return Unit.f80348a;
            case 11:
                return e((List) obj);
            case 12:
                return b((List) obj);
            case 13:
                return Unit.f80348a;
            case 14:
                return Unit.f80348a;
            default:
                s0 it3 = (s0) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Boolean.valueOf(((f30) it3.f55286b).j6() == null);
        }
    }
}
