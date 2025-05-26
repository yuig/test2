package bv0;

import com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta;
import dv0.n;
import dv0.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23908i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f23909j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(1);
        this.f23908i = i13;
        this.f23909j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d dVar = this.f23909j;
        int i13 = this.f23908i;
        switch (i13) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        o oVar = dVar.f23913n;
                        PinEditAdvanceMeta pinEditAdvanceMeta = oVar.f56371a;
                        if (pinEditAdvanceMeta == null) {
                            o.x3(oVar, false, new n(booleanValue, 0), 1);
                            break;
                        } else {
                            pinEditAdvanceMeta.f46538d = booleanValue;
                            break;
                        }
                    default:
                        dVar.f23912m.v3(booleanValue);
                        break;
                }
                break;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        o oVar2 = dVar.f23913n;
                        PinEditAdvanceMeta pinEditAdvanceMeta2 = oVar2.f56371a;
                        if (pinEditAdvanceMeta2 == null) {
                            o.x3(oVar2, false, new n(booleanValue2, 0), 1);
                            break;
                        } else {
                            pinEditAdvanceMeta2.f46538d = booleanValue2;
                            break;
                        }
                    default:
                        dVar.f23912m.v3(booleanValue2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
