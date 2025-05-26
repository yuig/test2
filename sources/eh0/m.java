package eh0;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class m extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58937i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rg0.n f58938j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a f58939k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f58940l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ob0.a f58941m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(rg0.n nVar, a aVar, Context context, tb0.h hVar, int i13) {
        super(0);
        this.f58937i = i13;
        this.f58938j = nVar;
        this.f58939k = aVar;
        this.f58940l = context;
        this.f58941m = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f58937i) {
            case 0:
                m135invoke();
                break;
            default:
                m135invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m135invoke() {
        Context context = this.f58940l;
        ob0.a aVar = this.f58941m;
        int i13 = this.f58937i;
        a aVar2 = this.f58939k;
        rg0.n nVar = this.f58938j;
        switch (i13) {
            case 0:
                o.f58945a = false;
                nVar.a(null, null);
                String str = aVar2.f58914b;
                if (str != null) {
                    f0.h.P(context, str, aVar);
                    break;
                }
                break;
            default:
                o.f58945a = false;
                nVar.c(null, null);
                String str2 = aVar2.f58914b;
                if (str2 != null) {
                    f0.h.P(context, str2, aVar);
                    break;
                }
                break;
        }
    }
}
