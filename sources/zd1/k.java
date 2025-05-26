package zd1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final k f141732j = new k(0);

    /* renamed from: k, reason: collision with root package name */
    public static final k f141733k = new k(1);

    /* renamed from: l, reason: collision with root package name */
    public static final k f141734l = new k(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141735i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13) {
        super(1);
        this.f141735i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f141735i) {
            case 0:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, rm1.q.FILTER, null, om1.f.TRANSPARENT_DARK_GRAY, null, bs1.c.j2(new String[0], le0.h.content_description_product_filter), false, 0, 1002);
            case 1:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return rn1.a.y(it2, null, null, kotlin.collections.e0.b(vn1.b.CENTER_VERTICAL), null, vn1.g.UI_400, 0, null, null, null, null, false, 0, bs1.c.j2(new String[0], le0.h.content_description_product_filter), null, null, null, null, false, null, null, 2093035);
            default:
                t32.f it3 = (t32.f) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return String.valueOf(it3.getValue());
        }
    }
}
