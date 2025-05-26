package gg0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64937i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f64938j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(String str, int i13) {
        super(1);
        this.f64937i = i13;
        this.f64938j = str;
    }

    public final void b(yl1.l bind) {
        int i13 = this.f64937i;
        String str = this.f64938j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d(str);
                bind.a(yl1.i.b());
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.d(str);
                bind.f139349b = false;
                bind.a(yl1.i.a());
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f64937i) {
            case 0:
                b((yl1.l) obj);
                break;
            default:
                b((yl1.l) obj);
                break;
        }
        return Unit.f80348a;
    }
}
