package od1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final n f94143j = new n(0);

    /* renamed from: k, reason: collision with root package name */
    public static final n f94144k = new n(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94145i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13) {
        super(1);
        this.f94145i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94145i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.c cVar = vn1.c.DEFAULT;
                vn1.g gVar = vn1.g.HEADING_600;
                rn1.b bVar = rn1.b.END;
                return rn1.a.y(it, null, cVar, kotlin.collections.e0.b(vn1.b.CENTER), kotlin.collections.e0.b(vn1.e.BOLD), gVar, 1, null, bVar, null, null, false, 0, null, null, null, null, null, false, null, null, 2096961);
            default:
                pd1.b vmState = (pd1.b) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                return vmState.f99803a;
        }
    }
}
