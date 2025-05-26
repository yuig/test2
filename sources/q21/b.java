package q21;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.x0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f102129j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f102130k = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102131i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f102131i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f102131i) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], x0.idea_pin_product_tagging_preview), false, null, bs1.c.j2(new String[0], x0.idea_pin_product_tagging_preview), null, null, null, null, 0, null, 1014);
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                fm1.c cVar = fm1.c.GONE;
                return rn1.a.y(it2, null, vn1.c.LIGHT, e0.b(vn1.b.BOTTOM), null, vn1.g.BODY_100, 1, cVar, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096905);
        }
    }
}
