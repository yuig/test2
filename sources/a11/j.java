package a11;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import ey.e5;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f287j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f288k = new j(1);

    /* renamed from: l, reason: collision with root package name */
    public static final j f289l = new j(2);

    /* renamed from: m, reason: collision with root package name */
    public static final j f290m = new j(3);

    /* renamed from: n, reason: collision with root package name */
    public static final j f291n = new j(4);

    /* renamed from: o, reason: collision with root package name */
    public static final j f292o = new j(5);

    /* renamed from: p, reason: collision with root package name */
    public static final j f293p = new j(6);

    /* renamed from: q, reason: collision with root package name */
    public static final j f294q = new j(7);

    /* renamed from: r, reason: collision with root package name */
    public static final j f295r = new j(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f296i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(1);
        this.f296i = i13;
    }

    public final cm1.d b(cm1.d state) {
        switch (this.f296i) {
            case 6:
                Intrinsics.checkNotNullParameter(state, "state");
                break;
            case 7:
                Intrinsics.checkNotNullParameter(state, "state");
                break;
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                break;
        }
        return cm1.d.e(state, yl1.b.f(state.f28012a, null, false, null, null, null, null, null, null, 0, null, 1021), null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
    }

    public final void e(Throwable throwable) {
        switch (this.f296i) {
            case 2:
                new e5(1).i();
                break;
            case 3:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                throwable.getMessage();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f296i) {
            case 0:
                break;
            case 1:
                e((Throwable) obj);
                break;
            case 2:
                e((Throwable) obj);
                break;
            case 3:
                e((Throwable) obj);
                break;
            case 4:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                e((Throwable) obj);
                break;
        }
        return b((cm1.d) obj);
    }
}
