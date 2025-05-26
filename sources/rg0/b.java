package rg0;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107959i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f107960j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e3.a f107961k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f107962l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f107963m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(n nVar, e3.a aVar, Context context, g gVar, int i13) {
        super(0);
        this.f107959i = i13;
        this.f107960j = nVar;
        this.f107961k = aVar;
        this.f107962l = context;
        this.f107963m = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f107959i) {
            case 0:
                m247invoke();
                break;
            default:
                m247invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m247invoke() {
        int i13 = this.f107959i;
        Context context = this.f107962l;
        g gVar = this.f107963m;
        e3.a aVar = this.f107961k;
        n nVar = this.f107960j;
        switch (i13) {
            case 0:
                nVar.a(null, null);
                ((m60.w) aVar.f56996b).d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
                aVar.f56995a = false;
                ((lu1.c) ((lu1.b) aVar.f56999e)).m(context, gVar.f108010f);
                break;
            default:
                nVar.c(null, null);
                ((m60.w) aVar.f56996b).d(new yb0.c(yb0.d.CANCEL_BUTTON_CLICK));
                aVar.f56995a = false;
                ((lu1.c) ((lu1.b) aVar.f56999e)).m(context, gVar.f108008d);
                break;
        }
    }
}
