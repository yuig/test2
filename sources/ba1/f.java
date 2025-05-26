package ba1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22361i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f22362j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(a aVar, int i13) {
        super(1);
        this.f22361i = i13;
        this.f22362j = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f22361i;
        a aVar = this.f22362j;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, aVar.f22338a, aVar.f22340c ? vn1.c.DEFAULT : vn1.c.SUBTLE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097148);
            default:
                om1.c it2 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return om1.c.e(it2, null, null, null, aVar.f22340c ? fm1.c.VISIBLE : fm1.c.GONE, null, false, 0, 1015);
        }
    }
}
