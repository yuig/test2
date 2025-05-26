package u81;

import com.pinterest.feature.search.visual.lens.view.RoomStylePickerView;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121019i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f121020j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, int i13) {
        super(0);
        this.f121019i = i13;
        this.f121020j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f121019i) {
            case 0:
                m268invoke();
                break;
            case 1:
                m268invoke();
                break;
            default:
                m268invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m268invoke() {
        s81.h hVar;
        int i13 = this.f121019i;
        Object obj = this.f121020j;
        switch (i13) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                ((Function0) obj).invoke();
                break;
            default:
                m mVar = ((RoomStylePickerView) obj).f48059h;
                if (mVar != null) {
                    r rVar = mVar.f121049a;
                    bs1.c.R1(rVar.f121082m1, false);
                    m81.r rVar2 = rVar.X1;
                    if (rVar2 != null) {
                        s81.p pVar = (s81.p) rVar2;
                        if (pVar.f111924b) {
                            if (pVar.f111937o) {
                                q81.a aVar = ((r) ((m81.q) pVar.getView())).J1;
                                if (aVar != null) {
                                    aVar.e();
                                }
                            } else {
                                i iVar = ((r) ((m81.q) pVar.getView())).I1;
                                if (iVar != null) {
                                    iVar.g();
                                }
                            }
                            hVar = s81.h.ACTIVE_CAMERA;
                        } else {
                            hVar = s81.h.CAMERA_DENIED;
                        }
                        pVar.g4(hVar);
                        pVar.getPinalytics().X(u0.ROOM_REPAINT_STYLE_PICKER_CANCEL);
                        pVar.g4(pVar.f111924b ? s81.h.ACTIVE_CAMERA : s81.h.CAMERA_DENIED);
                        break;
                    }
                }
                break;
        }
    }
}
