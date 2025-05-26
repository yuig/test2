package qg2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103865i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f103866j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f103867k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, String str, int i13) {
        super(1);
        this.f103865i = i13;
        this.f103866j = iVar;
        this.f103867k = str;
    }

    public final void b(pg2.i it) {
        int i13 = this.f103865i;
        String str = this.f103867k;
        i iVar = this.f103866j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                ((g) iVar.f103868a).a(str);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                ((g) iVar.f103868a).a(str);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f103865i) {
            case 0:
                b((pg2.i) obj);
                break;
            default:
                b((pg2.i) obj);
                break;
        }
        return Unit.f80348a;
    }
}
