package xp0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135643i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f135644j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(1);
        this.f135643i = i13;
        this.f135644j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f135643i;
        d dVar = this.f135644j;
        switch (i13) {
            case 0:
                br.d it = (br.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = it.f23703a;
                break;
            case 1:
                br.d dVar2 = (br.d) obj;
                Intrinsics.f(dVar2);
                dVar.j2(dVar2);
                break;
            default:
                String str2 = (String) obj;
                Intrinsics.f(str2);
                dVar.G3(str2);
                break;
        }
        return Unit.f80348a;
    }
}
