package nt;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92083i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ln1.e f92084j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(ln1.e eVar, int i13) {
        super(1);
        this.f92083i = i13;
        this.f92084j = eVar;
    }

    public final void b(ln1.l bind) {
        int i13 = this.f92083i;
        ln1.e eVar = this.f92084j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(eVar);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(eVar);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(eVar);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(eVar);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.a(eVar);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f92083i) {
            case 0:
                b((ln1.l) obj);
                break;
            case 1:
                b((ln1.l) obj);
                break;
            case 2:
                b((ln1.l) obj);
                break;
            case 3:
                b((ln1.l) obj);
                break;
            default:
                b((ln1.l) obj);
                break;
        }
        return Unit.f80348a;
    }
}
