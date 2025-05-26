package c92;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26998i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f26999j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o oVar, int i13) {
        super(1);
        this.f26998i = i13;
        this.f26999j = oVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f26998i;
        o oVar = this.f26999j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, oVar.f27021c, false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, oVar.f27022d, false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f26998i) {
        }
        return b((yl1.b) obj);
    }
}
