package iz;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f73815j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f73816k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f73817l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f73818m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f73819n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f73820o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f73821p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f73822q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f73823r = new a(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73824i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f73824i = i13;
    }

    public final bm1.m b(bm1.m it) {
        switch (this.f73824i) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return bm1.m.e(it, null, bm1.n.SELECTED, null, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return bm1.m.e(it, null, bm1.n.UNSELECTED, null, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
        }
    }

    public final om1.c e(om1.c it) {
        switch (this.f73824i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.DEFAULT_DARK_GRAY, null, null, false, 0, 1019);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.DEFAULT_LIGHT_GRAY, null, null, false, 0, 1019);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.DEFAULT_DARK_GRAY, null, null, false, 0, 1019);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, om1.f.DEFAULT_LIGHT_GRAY, null, null, false, 0, 1019);
        }
    }

    public final rn1.a f(rn1.a it) {
        switch (this.f73824i) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.LIGHT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, vn1.c.DARK, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73824i) {
            case 4:
                em1.d state = (em1.d) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                break;
        }
        return f((rn1.a) obj);
    }
}
