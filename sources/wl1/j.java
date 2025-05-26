package wl1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130192i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f130193j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(c cVar, int i13) {
        super(1);
        this.f130192i = i13;
        this.f130193j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f130192i;
        c cVar = this.f130193j;
        switch (i13) {
            case 0:
                cm1.d it = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return cVar.f130181c;
            case 1:
                om1.c it2 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return cVar.f130183e;
            default:
                rn1.a it3 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return cVar.f130180b;
        }
    }
}
