package rl1;

import com.pinterest.gestalt.avatar.GestaltAvatar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f108658i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltAvatar f108659j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(GestaltAvatar gestaltAvatar, int i13) {
        super(2);
        this.f108658i = i13;
        this.f108659j = gestaltAvatar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        GestaltAvatar gestaltAvatar = this.f108659j;
        int i13 = this.f108658i;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                switch (i13) {
                    case 0:
                        super/*com.pinterest.ui.imageview.GenericWebImageView*/.onMeasure(intValue, intValue2);
                        break;
                    default:
                        gestaltAvatar.setMeasuredDimension(intValue, intValue2);
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
                        gestaltAvatar.setMeasuredDimension(intValue3, intValue4);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
