package va0;

import com.pinterest.collagesCoreLibrary.effects.EffectSliderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f125131i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f125132j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f125133k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(o oVar, float f13, int i13) {
        super(1);
        this.f125131i = i13;
        this.f125132j = oVar;
        this.f125133k = f13;
    }

    public final void b(float f13) {
        int i13 = this.f125131i;
        float f14 = this.f125133k;
        o oVar = this.f125132j;
        switch (i13) {
            case 0:
                Function2 function2 = oVar.f125140c;
                Float valueOf = Float.valueOf(f13);
                EffectSliderView effectSliderView = oVar.f125138a;
                function2.invoke(effectSliderView, valueOf);
                if (oVar.f125139b) {
                    effectSliderView.animate().translationX(f14).start();
                    break;
                }
                break;
            default:
                Function2 function22 = oVar.f125141d;
                Float valueOf2 = Float.valueOf(f13);
                EffectSliderView effectSliderView2 = oVar.f125138a;
                function22.invoke(effectSliderView2, valueOf2);
                if (oVar.f125139b) {
                    effectSliderView2.animate().translationX(f14).start();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f125131i) {
            case 0:
                b(((Number) obj).floatValue());
                break;
            default:
                b(((Number) obj).floatValue());
                break;
        }
        return Unit.f80348a;
    }
}
