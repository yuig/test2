package dy0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56562i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ xk2.w f56563j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(xk2.w wVar, int i13) {
        super(3);
        this.f56562i = i13;
        this.f56563j = wVar;
    }

    public final void b(i1.m0 AnimatedVisibility, i2.o oVar) {
        int i13 = this.f56562i;
        xk2.w wVar = this.f56563j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                d7.b.b((kc0.a) wVar.f135235b, androidx.compose.foundation.layout.e.f17184c, oVar, 56, 0);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                d7.b.b((kc0.a) wVar.f135236c, androidx.compose.foundation.layout.e.f17184c, oVar, 56, 0);
                break;
            default:
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                d7.b.b((kc0.a) wVar.f135234a, androidx.compose.foundation.layout.e.f17184c, oVar, 56, 0);
                break;
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f56562i) {
            case 0:
                ((Number) obj3).intValue();
                b((i1.m0) obj, (i2.o) obj2);
                break;
            case 1:
                ((Number) obj3).intValue();
                b((i1.m0) obj, (i2.o) obj2);
                break;
            default:
                ((Number) obj3).intValue();
                b((i1.m0) obj, (i2.o) obj2);
                break;
        }
        return Unit.f80348a;
    }
}
