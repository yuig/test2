package xl2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135284i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f135285j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i13) {
        super(0);
        this.f135284i = i13;
        this.f135285j = oVar;
    }

    public final ym2.c b() {
        int i13 = this.f135284i;
        o oVar = this.f135285j;
        switch (i13) {
            case 0:
                ym2.c c13 = r.f135332l.c(oVar.getArrayTypeName());
                Intrinsics.checkNotNullExpressionValue(c13, "child(...)");
                return c13;
            default:
                ym2.c c14 = r.f135332l.c(oVar.getTypeName());
                Intrinsics.checkNotNullExpressionValue(c14, "child(...)");
                return c14;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f135284i) {
        }
        return b();
    }
}
