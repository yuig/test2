package i91;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71865i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f71866j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f71867k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, Context context, int i13) {
        super(1);
        this.f71865i = i13;
        this.f71866j = nVar;
        this.f71867k = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        n nVar = this.f71866j;
        Context context = this.f71867k;
        int i13 = this.f71865i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        nVar.h(context);
                        break;
                    default:
                        nVar.h(context);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        nVar.h(context);
                        break;
                    default:
                        nVar.h(context);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
