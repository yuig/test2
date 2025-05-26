package q1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.s implements kl2.m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101904i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kl2.l f101905j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13, q2.h hVar) {
        super(4);
        this.f101904i = i13;
        this.f101905j = hVar;
    }

    @Override // kl2.m
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13 = this.f101904i;
        kl2.l lVar = this.f101905j;
        switch (i13) {
            case 0:
                c cVar = (c) obj;
                ((Number) obj2).intValue();
                i2.o oVar = (i2.o) obj3;
                int intValue = ((Number) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((i2.s) oVar).h(cVar) ? 4 : 2;
                }
                if ((intValue & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL) == 130) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                lVar.invoke(cVar, oVar, Integer.valueOf(intValue & 14));
            default:
                r1.q qVar = (r1.q) obj;
                ((Number) obj2).intValue();
                i2.o oVar2 = (i2.o) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((i2.s) oVar2).h(qVar) ? 4 : 2;
                }
                if ((intValue2 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_VIDEO_GRID_CELL) == 130) {
                    i2.s sVar2 = (i2.s) oVar2;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                lVar.invoke(qVar, oVar2, Integer.valueOf(intValue2 & 14));
        }
        return Unit.f80348a;
    }
}
