package su0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f115199i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pu0.k f115200j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(pu0.k kVar, int i13) {
        super(1);
        this.f115199i = i13;
        this.f115200j = kVar;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f115199i;
        pu0.k kVar = this.f115200j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], kVar.f101398c.getLabel()), false, null, null, null, null, kVar.f101398c.getIcon(), null, 0, null, 958);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.j2(new String[0], kVar.f101399d.getLabel()), false, null, null, null, null, kVar.f101399d.getIcon(), null, 0, null, 958);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f115199i) {
        }
        return b((yl1.b) obj);
    }
}
