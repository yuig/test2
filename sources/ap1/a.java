package ap1;

import gv1.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.c2;
import lh0.d;
import lh0.d3;
import lh0.g2;
import lh0.k3;
import lh0.k4;
import lh0.n1;

/* loaded from: classes2.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20324i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ se2.a f20325j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(se2.a aVar, int i13) {
        super(0);
        this.f20324i = i13;
        this.f20325j = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f20324i;
        se2.a aVar = this.f20325j;
        switch (i13) {
            case 0:
                Object obj = ((bf2.b) aVar).get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (d3) obj;
            case 1:
                Object obj2 = ((bf2.b) aVar).get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return (k4) obj2;
            case 2:
                Object obj3 = ((bf2.b) aVar).get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                return (g2) obj3;
            case 3:
                Object obj4 = ((bf2.b) aVar).get();
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                return (c2) obj4;
            case 4:
                Object obj5 = ((bf2.b) aVar).get();
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                return (k3) obj5;
            case 5:
                Object obj6 = ((bf2.b) aVar).get();
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                return (f) obj6;
            case 6:
                Object obj7 = ((bf2.b) aVar).get();
                Intrinsics.checkNotNullExpressionValue(obj7, "get(...)");
                return (d) obj7;
            default:
                Object obj8 = ((bf2.b) aVar).get();
                Intrinsics.checkNotNullExpressionValue(obj8, "get(...)");
                return (n1) obj8;
        }
    }
}
