package pj0;

import com.pinterest.api.model.v7;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f100214j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f100215k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f100216l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f100217m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f100218n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f100219o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f100220p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f100221q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f100222r = new a(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a f100223s = new a(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a f100224t = new a(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a f100225u = new a(11);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f100226i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f100226i = i13;
    }

    public final Boolean b(List it) {
        switch (this.f100226i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            case 3:
            case 4:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                gb2.i iVar = (gb2.i) CollectionsKt.d0(it);
                return Boolean.valueOf((iVar != null ? iVar.f64755c : null) != wa2.o.EVENT_ONLY);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
        }
    }

    public final List e(List list) {
        switch (this.f100226i) {
            case 0:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.k)) {
                    break;
                } else {
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.i)) {
                    break;
                } else {
                    break;
                }
        }
        return q0.f80391a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f100226i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                gb2.i it = (gb2.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 8:
                break;
            case 9:
                v7 it2 = (v7) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 10:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
