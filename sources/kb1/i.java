package kb1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79074i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f79075j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(b bVar, int i13) {
        super(1);
        this.f79074i = i13;
        this.f79075j = bVar;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f79074i;
        b bVar = this.f79075j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(bVar.f79064a), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, bs1.c.h2(bVar.f79065b), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f79074i) {
            case 0:
                return b((ao1.b) obj);
            case 1:
                return b((ao1.b) obj);
            default:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f79075j.f79066c, null, null, null, null, null, null, 0, null, 1021);
        }
    }
}
