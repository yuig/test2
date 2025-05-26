package kn1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80249i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hn1.b f80250j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(hn1.b bVar, int i13) {
        super(1);
        this.f80249i = i13;
        this.f80250j = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f80249i;
        hn1.b bVar = this.f80250j;
        switch (i13) {
            case 0:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                hn1.c cVar = (hn1.c) bVar;
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                return new om1.c(cVar.f69645a, om1.e.LG, om1.f.TRANSPARENT_DARK_GRAY, cVar.f69647c, cVar.f69646b, false, 0, 992);
            default:
                yl1.b it2 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                hn1.a aVar = (hn1.a) bVar;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                return new yl1.b(aVar.f69638a, aVar.f69639b, aVar.f69640c, aVar.f69641d, aVar.f69642e, aVar.f69643f, null, null, aVar.f69644g, null, 704);
        }
    }
}
