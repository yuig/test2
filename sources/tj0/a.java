package tj0;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f117850j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f117851k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f117852l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f117853m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f117854n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f117855o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f117856p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f117857q = new a(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117858i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f117858i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f117858i) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, null, new rm1.d(new rm1.f(rm1.q.LOCK, rm1.i.XS), rm1.c.SUBTLE, null, 0, null, 28), false, 0, null, null, null, null, null, false, null, null, 2096639);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.HEADING_700, 1, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096971);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f117858i) {
            case 0:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                return CollectionsKt.d0(list) instanceof gb2.i ? m0.F(list, gb2.i.class) : q0.f80391a;
            case 1:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.isEmpty());
            case 2:
                List it2 = (List) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return (gb2.i) CollectionsKt.d0(it2);
            case 3:
                return Unit.f80348a;
            case 4:
                kn1.b it3 = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return kn1.b.e(it3, false, false, hn1.q.Center, bs1.c.j2(new String[0], t60.d.more_idea_half_sheet_title), null, null, null, 1971);
            case 5:
                return b((rn1.a) obj);
            case 6:
                return Unit.f80348a;
            default:
                return b((rn1.a) obj);
        }
    }
}
