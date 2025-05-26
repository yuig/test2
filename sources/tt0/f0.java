package tt0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119110i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rt0.b f119111j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(rt0.b bVar, int i13) {
        super(1);
        this.f119110i = i13;
        this.f119111j = bVar;
    }

    public final om1.c b(om1.c it) {
        int i13 = this.f119110i;
        rt0.b bVar = this.f119111j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return om1.c.e(it, null, null, null, d7.b.Z(!bVar.f109952d), null, false, 0, 1015);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f119110i) {
            case 0:
                return b((om1.c) obj);
            case 1:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                rt0.b bVar = this.f119111j;
                return yl1.b.f(it, null, false, d7.b.Z(!bVar.f109952d && bVar.j()), null, null, null, null, null, 0, null, 1019);
            default:
                return b((om1.c) obj);
        }
    }
}
