package gb1;

import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64702i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f64703j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f64704k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f64705l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(o oVar, String str, String str2, int i13) {
        super(0);
        this.f64702i = i13;
        this.f64703j = oVar;
        this.f64704k = str;
        this.f64705l = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f64702i) {
            case 0:
                m144invoke();
                break;
            default:
                m144invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m144invoke() {
        int i13 = this.f64702i;
        o oVar = this.f64703j;
        switch (i13) {
            case 0:
                GestaltButton gestaltButton = oVar.f64724l;
                o.a(oVar, this.f64704k, this.f64705l, false, gestaltButton, oVar.f64725m);
                break;
            default:
                GestaltButton gestaltButton2 = oVar.f64722j;
                o.a(oVar, this.f64704k, this.f64705l, false, gestaltButton2, oVar.f64723k);
                break;
        }
    }
}
