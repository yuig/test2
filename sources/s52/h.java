package s52;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f111175j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f111176k = new h(1);

    /* renamed from: l, reason: collision with root package name */
    public static final h f111177l = new h(2);

    /* renamed from: m, reason: collision with root package name */
    public static final h f111178m = new h(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111179i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f111179i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f111179i) {
            case 0:
                kn1.b it = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return kn1.b.e(it, false, true, hn1.q.Center, bs1.c.j2(new String[0], s42.j.select_pins), null, null, null, 2032);
            case 1:
                om1.c it2 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return om1.c.e(it2, rm1.q.ARROW_BACK, null, null, null, null, false, 0, 1022);
            case 2:
                r52.a itemPin = (r52.a) obj;
                Intrinsics.checkNotNullParameter(itemPin, "itemPin");
                return itemPin;
            default:
                yl1.b it3 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return yl1.b.f(it3, bs1.c.j2(new String[0], x0.done), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }
}
