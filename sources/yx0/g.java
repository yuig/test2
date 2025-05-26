package yx0;

import com.pinterest.gestalt.text.GestaltText;
import e82.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140333i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f140334j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i13) {
        super(1);
        this.f140333i = i13;
        this.f140334j = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f140333i;
        h hVar = this.f140334j;
        switch (i13) {
            case 0:
                w12.a it = (w12.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it == w12.a.None && it != hVar.f140344j.getNewsType());
            case 1:
                hVar.getClass();
                hVar.f140344j = c.All;
                GestaltText gestaltText = ((zx0.f) ((xx0.a) hVar.getView())).f143020w0;
                if (gestaltText != null) {
                    gestaltText.i(zx0.b.f143009i);
                    return Unit.f80348a;
                }
                Intrinsics.r("filterBadge");
                throw null;
            default:
                xx0.a aVar = (xx0.a) hVar.getView();
                n nVar = n.f57884a;
                int b13 = n.b();
                if (b13 > 99) {
                    b13 = 99;
                }
                ((zx0.f) aVar).l8(1, b13);
                return Unit.f80348a;
        }
    }
}
