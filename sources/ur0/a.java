package ur0;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import rg0.n;
import so.oa;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123061i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f123062j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ rg0.g f123063k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f123064l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(n nVar, rg0.g gVar, Context context, int i13) {
        super(0);
        this.f123061i = i13;
        this.f123062j = nVar;
        this.f123063k = gVar;
        this.f123064l = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f123061i) {
            case 0:
                m271invoke();
                break;
            default:
                m271invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m271invoke() {
        int i13 = this.f123061i;
        Context context = this.f123064l;
        rg0.g gVar = this.f123063k;
        n nVar = this.f123062j;
        switch (i13) {
            case 0:
                nVar.a(null, null);
                String str = gVar.f108014j;
                if (str != null) {
                    Context context2 = kb0.a.f79058b;
                    ((lu1.c) ((lu1.b) ((oa) ((so1.b) ep.b.g(so1.b.class))).f113961v5.get())).m(context, str);
                    break;
                }
                break;
            default:
                nVar.c(null, null);
                String str2 = gVar.f108012h;
                if (str2 != null) {
                    Context context3 = kb0.a.f79058b;
                    ((lu1.c) ((lu1.b) ((oa) ((so1.b) ep.b.g(so1.b.class))).f113961v5.get())).m(context, str2);
                    break;
                }
                break;
        }
    }
}
