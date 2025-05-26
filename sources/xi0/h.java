package xi0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import z32.o;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135016i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g21.a f135017j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(g21.a aVar, int i13) {
        super(1);
        this.f135016i = i13;
        this.f135017j = aVar;
    }

    public final yl1.b b(yl1.b it) {
        String str;
        int i13 = this.f135016i;
        g21.a aVar = this.f135017j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                if (aVar == null || (str = aVar.f63386h) == null) {
                    str = "";
                }
                return yl1.b.f(it, bs1.c.h2(str), false, aVar != null ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, null, null, 0, null, 1018);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.h2(aVar.f63386h), false, d7.b.Z(aVar.f63388j != o.ARROW_INDICATOR_ICON), null, null, null, null, null, 0, null, 1018);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135016i) {
            case 0:
                return b((yl1.b) obj);
            case 1:
                return b((yl1.b) obj);
            default:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                g21.a aVar = this.f135017j;
                return om1.c.e(it, null, null, null, d7.b.Z(aVar.f63388j == o.BUTTON), bs1.c.h2(aVar.f63386h), false, 0, 999);
        }
    }
}
