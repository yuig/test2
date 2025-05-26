package n70;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o82.t1;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89651i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t0 f89652j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(t0 t0Var, int i13) {
        super(2);
        this.f89651i = i13;
        this.f89652j = t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f89651i;
        t0 t0Var = this.f89652j;
        switch (i13) {
            case 0:
                ((Number) obj).intValue();
                o70.d item = (o70.d) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof o70.a) {
                    return t1.f93713a;
                }
                if (!(item instanceof o70.c)) {
                    return t1.f93716d;
                }
                if (t0Var.f89677c.c(((o70.c) item).f93227a) == 32) {
                    o82.j jVar = t1.f93713a;
                }
                return t1.f93714b;
            default:
                ((Number) obj).intValue();
                o70.d item2 = (o70.d) obj2;
                Intrinsics.checkNotNullParameter(item2, "item");
                return Integer.valueOf(item2 instanceof o70.a ? ((o70.a) item2).f93224b ? 10002 : 10001 : item2 instanceof o70.c ? t0Var.f89677c.c(((o70.c) item2).f93227a) : -1);
        }
    }
}
