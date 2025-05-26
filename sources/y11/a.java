package y11;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f136622j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f136623k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f136624l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f136625m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f136626n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f136627o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f136628p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f136629q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f136630r = new a(8);

    /* renamed from: s, reason: collision with root package name */
    public static final a f136631s = new a(9);

    /* renamed from: t, reason: collision with root package name */
    public static final a f136632t = new a(10);

    /* renamed from: u, reason: collision with root package name */
    public static final a f136633u = new a(11);

    /* renamed from: v, reason: collision with root package name */
    public static final a f136634v = new a(12);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136635i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f136635i = i13;
    }

    public final on1.b b(on1.b it) {
        switch (this.f136635i) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, false, true, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return on1.b.e(it, false, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f136635i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, bs1.c.h2(""), null, null, null, null, 0, fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
    }

    public final ul1.c f(ul1.c it) {
        switch (this.f136635i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return ul1.c.e(it, null, null, fm1.c.GONE, 0, 55);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f136635i) {
            case 2:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108895j = null;
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return e((rn1.a) obj);
    }
}
