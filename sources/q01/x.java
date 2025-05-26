package q01;

import kh2.k3;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101839i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f101840j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, int i13) {
        super(0);
        this.f101839i = i13;
        this.f101840j = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f101839i;
        y yVar = this.f101840j;
        switch (i13) {
            case 0:
                return yVar.f101841a.findViewById(n80.c.related_filters_carousel_container);
            default:
                return Integer.valueOf(k3.k0(yVar.f101841a.getContext()));
        }
    }
}
