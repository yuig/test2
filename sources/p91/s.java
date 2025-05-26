package p91;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99322i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f99323j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f99324k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(w wVar, uv0.f fVar, int i13) {
        super(1);
        this.f99322i = i13;
        this.f99323j = wVar;
        this.f99324k = fVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f99322i;
        Function0 function0 = this.f99324k;
        w wVar = this.f99323j;
        switch (i13) {
            case 0:
                if (wVar.isBound()) {
                    function0.invoke();
                    ((q91.u) ((l91.i) wVar.getView())).W8(b52.c.edit_account_settings_error, true);
                    break;
                }
                break;
            default:
                if (wVar.isBound()) {
                    function0.invoke();
                    ((q91.u) ((l91.i) wVar.getView())).W8(b52.c.edit_account_settings_error, true);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f99322i) {
            case 0:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }
}
