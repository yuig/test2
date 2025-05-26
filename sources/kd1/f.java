package kd1;

import hn1.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.k0;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f f79244j = new f(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f f79245k = new f(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79246i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(1);
        this.f79246i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f79246i) {
            case 0:
                kn1.b it = (kn1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return kn1.b.e(it, false, false, q.Center, new k0(f62.e.see_it_styled_product_carousel_title), null, null, null, 1968);
            default:
                in1.b it2 = (in1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return in1.b.e(it2, null, true, null, 13);
        }
    }
}
