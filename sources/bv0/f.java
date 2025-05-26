package bv0;

import com.pinterest.api.model.ln0;
import com.pinterest.feature.ideaPinCreation.closeup.view.r0;
import com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta;
import dv0.n;
import dv0.o;
import jk2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uj2.q;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23920i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f23921j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, int i13) {
        super(1);
        this.f23920i = i13;
        this.f23921j = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g gVar = this.f23921j;
        int i13 = this.f23920i;
        switch (i13) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        o oVar = gVar.f23926o;
                        PinEditAdvanceMeta pinEditAdvanceMeta = oVar.f56371a;
                        if (pinEditAdvanceMeta == null) {
                            o.x3(oVar, false, new n(booleanValue, 0), 1);
                            break;
                        } else {
                            pinEditAdvanceMeta.f46538d = booleanValue;
                            break;
                        }
                    default:
                        gVar.f23924m.v3(booleanValue);
                        break;
                }
                return Unit.f80348a;
            case 1:
                ln0 storyPinData = (ln0) obj;
                Intrinsics.checkNotNullParameter(storyPinData, "storyPinData");
                String e13 = storyPinData.getMetadata().e();
                return e13 != null ? new j1(gVar.f23928q.P(e13), new wr0.l(24, new r0(7, gVar, storyPinData)), 0) : q.y(gVar.w(storyPinData, null));
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                switch (i13) {
                    case 0:
                        o oVar2 = gVar.f23926o;
                        PinEditAdvanceMeta pinEditAdvanceMeta2 = oVar2.f56371a;
                        if (pinEditAdvanceMeta2 == null) {
                            o.x3(oVar2, false, new n(booleanValue2, 0), 1);
                            break;
                        } else {
                            pinEditAdvanceMeta2.f46538d = booleanValue2;
                            break;
                        }
                    default:
                        gVar.f23924m.v3(booleanValue2);
                        break;
                }
                return Unit.f80348a;
        }
    }
}
