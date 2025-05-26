package jm1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.divider.GestaltDivider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77018i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltDivider f77019j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltDivider gestaltDivider, int i13) {
        super(1);
        this.f77018i = i13;
        this.f77019j = gestaltDivider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GestaltDivider gestaltDivider = this.f77019j;
        int i13 = this.f77018i;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                fm1.c cVar = GestaltDivider.f49365d;
                gestaltDivider.getClass();
                fm1.c Y = d7.b.Y($receiver, g.GestaltDivider_android_visibility, GestaltDivider.f49365d);
                int i14 = g.GestaltDivider_android_paddingTop;
                int i15 = GestaltDivider.f49366e;
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 1:
                        gestaltDivider.setId(intValue);
                        break;
                    default:
                        gestaltDivider.setVisibility(intValue);
                        break;
                }
                break;
            default:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 1:
                        gestaltDivider.setId(intValue2);
                        break;
                    default:
                        gestaltDivider.setVisibility(intValue2);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
