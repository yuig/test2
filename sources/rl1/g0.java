package rl1;

import com.pinterest.gestalt.avatar.LegacyGestaltAvatar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108586i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegacyGestaltAvatar f108587j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(LegacyGestaltAvatar legacyGestaltAvatar, int i13) {
        super(2);
        this.f108586i = i13;
        this.f108587j = legacyGestaltAvatar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        LegacyGestaltAvatar legacyGestaltAvatar = this.f108587j;
        int i13 = this.f108586i;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                switch (i13) {
                    case 0:
                        super/*com.pinterest.ui.imageview.GenericWebImageView*/.onMeasure(intValue, intValue2);
                        break;
                    default:
                        legacyGestaltAvatar.setMeasuredDimension(intValue, intValue2);
                        break;
                }
                break;
            default:
                int intValue3 = ((Number) obj).intValue();
                int intValue4 = ((Number) obj2).intValue();
                switch (i13) {
                    case 0:
                        super/*com.pinterest.ui.imageview.GenericWebImageView*/.onMeasure(intValue3, intValue4);
                        break;
                    default:
                        legacyGestaltAvatar.setMeasuredDimension(intValue3, intValue4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
