package n70;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final q f89653j = new q(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q f89654k = new q(1);

    /* renamed from: l, reason: collision with root package name */
    public static final q f89655l = new q(2);

    /* renamed from: m, reason: collision with root package name */
    public static final q f89656m = new q(3);

    /* renamed from: n, reason: collision with root package name */
    public static final q f89657n = new q(4);

    /* renamed from: o, reason: collision with root package name */
    public static final q f89658o = new q(5);

    /* renamed from: p, reason: collision with root package name */
    public static final q f89659p = new q(6);

    /* renamed from: q, reason: collision with root package name */
    public static final q f89660q = new q(7);

    /* renamed from: r, reason: collision with root package name */
    public static final q f89661r = new q(8);

    /* renamed from: s, reason: collision with root package name */
    public static final q f89662s = new q(9);

    /* renamed from: t, reason: collision with root package name */
    public static final q f89663t = new q(10);

    /* renamed from: u, reason: collision with root package name */
    public static final q f89664u = new q(11);

    /* renamed from: v, reason: collision with root package name */
    public static final q f89665v = new q(12);

    /* renamed from: w, reason: collision with root package name */
    public static final q f89666w = new q(13);

    /* renamed from: x, reason: collision with root package name */
    public static final q f89667x = new q(14);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89668i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13) {
        super(1);
        this.f89668i = i13;
    }

    public final Boolean b(List it) {
        switch (this.f89668i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                gb2.i iVar = (gb2.i) CollectionsKt.d0(it);
                return Boolean.valueOf((iVar != null ? iVar.f64755c : null) != wa2.o.EVENT_ONLY);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
        }
    }

    public final List e(List list) {
        switch (this.f89668i) {
            case 0:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.i)) {
                    break;
                } else {
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof gb2.j)) {
                    break;
                } else {
                    break;
                }
        }
        return kotlin.collections.q0.f80391a;
    }

    public final o0 f(o0 vmState) {
        switch (this.f89668i) {
            case 11:
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return o0.b(vmState, null, 2, null, null, 7167);
            case 12:
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return o0.b(vmState, null, 1, null, null, 7167);
            default:
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return o0.b(vmState, null, 0, null, null, 7167);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f89668i;
        switch (i13) {
            case 0:
                return e((List) obj);
            case 1:
                return b((List) obj);
            case 2:
                return b((List) obj);
            case 3:
                gb2.i it = (gb2.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.f64755c != wa2.o.EVENT_ONLY);
            case 4:
                return Unit.f80348a;
            case 5:
                return e((List) obj);
            case 6:
                return b((List) obj);
            case 7:
                return Unit.f80348a;
            case 8:
                o70.c vmState = (o70.c) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return vmState.f93227a;
            case 9:
                o70.a vmState2 = (o70.a) obj;
                switch (i13) {
                    case 9:
                        Intrinsics.checkNotNullParameter(vmState2, "vmState");
                        return vmState2.f93223a;
                    default:
                        Intrinsics.checkNotNullParameter(vmState2, "vmState");
                        return vmState2.f93223a;
                }
            case 10:
                o70.a vmState3 = (o70.a) obj;
                switch (i13) {
                    case 9:
                        Intrinsics.checkNotNullParameter(vmState3, "vmState");
                        return vmState3.f93223a;
                    default:
                        Intrinsics.checkNotNullParameter(vmState3, "vmState");
                        return vmState3.f93223a;
                }
            case 11:
                return f((o0) obj);
            case 12:
                return f((o0) obj);
            case 13:
                return f((o0) obj);
            default:
                a displayState = (a) obj;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                return a.e(displayState, null, null, null, null, null, 15);
        }
    }
}
