package ub1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.g0;
import wm1.k0;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121728i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f121729j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(a aVar, int i13) {
        super(1);
        this.f121728i = i13;
        this.f121729j = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f121728i;
        a aVar = this.f121729j;
        switch (i13) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, aVar.f121708c ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                k0 bind = (k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wm1.q middleItem = new wm1.q(g0.b(new String[0], c52.e.automatically_tag_title), g0.b(new String[0], c52.e.automatically_tag_description), false, 4);
                bind.getClass();
                Intrinsics.checkNotNullParameter(middleItem, "middleItem");
                bind.f130312c = middleItem;
                wm1.k endItem = new wm1.k(aVar.f121706a, !aVar.f121708c, 4);
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind.f130313d = endItem;
                return Unit.f80348a;
        }
    }
}
