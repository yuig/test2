package p91;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99284i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f99285j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i13) {
        super(1);
        this.f99284i = i13;
        this.f99285j = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f99284i;
        i iVar = this.f99285j;
        switch (i13) {
            case 0:
                iVar.f99288c.d(new of0.a(new mf0.l()));
                break;
            default:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ep.b.C(null, iVar.f99288c);
                break;
        }
        return Unit.f80348a;
    }
}
