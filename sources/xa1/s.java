package xa1;

import df.j1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134478i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ eg0.a f134479j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(eg0.a aVar, int i13) {
        super(1);
        this.f134478i = i13;
        this.f134479j = aVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f134478i;
        eg0.a aVar = this.f134479j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.p2(aVar.f58870m), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.p2(aVar.f58868k), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f134478i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                CharSequence a03 = j1.a0(this.f134479j.f58862e);
                Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
                break;
        }
        return b((yl1.b) obj);
    }
}
