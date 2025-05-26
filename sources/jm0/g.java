package jm0;

import android.view.View;
import com.pinterest.api.model.ba;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76966i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f76967j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i13) {
        super(2);
        this.f76966i = i13;
        this.f76967j = jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        j jVar = this.f76967j;
        int i13 = this.f76966i;
        switch (i13) {
            case 0:
                View view = (View) obj;
                ba section = (ba) obj2;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(section, "section");
                lm0.k kVar = new lm0.k(view, section);
                int i14 = j.f76978k1;
                jVar.n9(kVar);
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                switch (i13) {
                    case 1:
                        lm0.o oVar = new lm0.o(intValue, intValue2);
                        int i15 = j.f76978k1;
                        jVar.n9(oVar);
                        break;
                    default:
                        lm0.n nVar = new lm0.n(intValue, intValue2);
                        int i16 = j.f76978k1;
                        jVar.n9(nVar);
                        break;
                }
                break;
            default:
                int intValue3 = ((Number) obj).intValue();
                int intValue4 = ((Number) obj2).intValue();
                switch (i13) {
                    case 1:
                        lm0.o oVar2 = new lm0.o(intValue3, intValue4);
                        int i17 = j.f76978k1;
                        jVar.n9(oVar2);
                        break;
                    default:
                        lm0.n nVar2 = new lm0.n(intValue3, intValue4);
                        int i18 = j.f76978k1;
                        jVar.n9(nVar2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
