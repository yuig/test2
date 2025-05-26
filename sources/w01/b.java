package w01;

import com.pinterest.api.model.q11;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126975i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f126958j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f126959k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f126960l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f126961m = new b(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b f126962n = new b(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b f126963o = new b(5);

    /* renamed from: p, reason: collision with root package name */
    public static final b f126964p = new b(6);

    /* renamed from: q, reason: collision with root package name */
    public static final b f126965q = new b(7);

    /* renamed from: r, reason: collision with root package name */
    public static final b f126966r = new b(8);

    /* renamed from: s, reason: collision with root package name */
    public static final b f126967s = new b(9);

    /* renamed from: t, reason: collision with root package name */
    public static final b f126968t = new b(10);

    /* renamed from: u, reason: collision with root package name */
    public static final b f126969u = new b(11);

    /* renamed from: v, reason: collision with root package name */
    public static final b f126970v = new b(12);

    /* renamed from: w, reason: collision with root package name */
    public static final b f126971w = new b(13);

    /* renamed from: x, reason: collision with root package name */
    public static final b f126972x = new b(14);

    /* renamed from: y, reason: collision with root package name */
    public static final b f126973y = new b(15);

    /* renamed from: z, reason: collision with root package name */
    public static final b f126974z = new b(16);
    public static final b A = new b(17);
    public static final b B = new b(18);
    public static final b C = new b(19);
    public static final b D = new b(20);
    public static final b E = new b(21);
    public static final b F = new b(22);
    public static final b G = new b(23);
    public static final b H = new b(24);
    public static final b I = new b(25);

    /* renamed from: J, reason: collision with root package name */
    public static final b f126957J = new b(26);
    public static final b K = new b(27);
    public static final b L = new b(28);
    public static final b M = new b(29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f126975i = i13;
    }

    public final Boolean b(List it) {
        switch (this.f126975i) {
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Boolean.valueOf(!it.isEmpty());
    }

    public final Boolean e(wt1.c0 it) {
        switch (this.f126975i) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf((it instanceof wt1.k) || (it instanceof wt1.s) || (it instanceof wt1.w));
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it instanceof wt1.k);
        }
    }

    public final List f(List list) {
        switch (this.f126975i) {
            case 17:
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
        return kotlin.collections.q0.f80391a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f126975i;
        switch (i13) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                vq0.e dataSource = (vq0.e) obj;
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                break;
            case 3:
                break;
            case 4:
                q11 it = (q11) obj;
                switch (i13) {
                    case 4:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        break;
                }
            case 5:
                q11 it2 = (q11) obj;
                switch (i13) {
                    case 4:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        break;
                }
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                nc2.l writeVideoState = (nc2.l) obj;
                Intrinsics.checkNotNullParameter(writeVideoState, "$this$writeVideoState");
                writeVideoState.f90409a = false;
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                List it3 = (List) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                break;
            case 20:
                break;
            case 21:
                Boolean upsellShown = (Boolean) obj;
                Intrinsics.checkNotNullParameter(upsellShown, "upsellShown");
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
