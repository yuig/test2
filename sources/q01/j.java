package q01;

import kh2.k3;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101792i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f101793j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, int i13) {
        super(0);
        this.f101792i = i13;
        this.f101793j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f101792i;
        l lVar = this.f101793j;
        switch (i13) {
            case 0:
                return lVar.f101798b.findViewById(n80.c.related_filters_carousel_container);
            default:
                return Integer.valueOf(k3.k0(lVar.f101803g));
        }
    }
}
