package dv0;

import com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class m extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56367i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f56368j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, int i13) {
        super(0);
        this.f56367i = i13;
        this.f56368j = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f56367i) {
            case 0:
                m130invoke();
                break;
            case 1:
                m130invoke();
                break;
            case 2:
                m130invoke();
                break;
            default:
                m130invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m130invoke() {
        int i13 = 9;
        int i14 = this.f56367i;
        o oVar = this.f56368j;
        switch (i14) {
            case 0:
                oVar.getPinalytics().X(u0.STORY_PIN_PARTNER_TAG_REMOVE_BUTTON);
                c cVar = c.f56305s;
                PinEditAdvanceMeta pinEditAdvanceMeta = oVar.f56371a;
                if (pinEditAdvanceMeta == null) {
                    oVar.w3(new t90.n(i13, cVar), false);
                } else {
                    pinEditAdvanceMeta.f46542h = (String) cVar.invoke(null);
                    oVar.f56376f.i2();
                }
                oVar.onRecyclerRefresh();
                break;
            case 1:
                oVar.getPinalytics().X(u0.CANCEL_BUTTON);
                oVar.onRecyclerRefresh();
                break;
            case 2:
                oVar.getPinalytics().X(u0.STORY_PIN_PARTNER_TAG_REMOVE_BUTTON);
                xk1.c cVar2 = oVar.f56376f;
                PinEditAdvanceMeta pinEditAdvanceMeta2 = oVar.f56371a;
                if (pinEditAdvanceMeta2 != null) {
                    c cVar3 = c.f56307u;
                    if (pinEditAdvanceMeta2 == null) {
                        oVar.w3(new t90.n(i13, cVar3), false);
                        break;
                    } else {
                        pinEditAdvanceMeta2.f46542h = (String) cVar3.invoke(null);
                        cVar2.i2();
                        break;
                    }
                } else {
                    c cVar4 = c.f56308v;
                    if (pinEditAdvanceMeta2 != null) {
                        pinEditAdvanceMeta2.f46542h = (String) cVar4.invoke(null);
                        cVar2.i2();
                        break;
                    } else {
                        oVar.w3(new t90.n(i13, cVar4), true);
                        break;
                    }
                }
            default:
                oVar.getPinalytics().X(u0.CANCEL_BUTTON);
                break;
        }
    }
}
