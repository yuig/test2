package ad1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2087i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltButton f2088j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GestaltButton gestaltButton, int i13) {
        super(1);
        this.f2087i = i13;
        this.f2088j = gestaltButton;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f2087i;
        GestaltButton gestaltButton = this.f2088j;
        switch (i13) {
            case 0:
                in1.b it = (in1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return in1.b.e(it, new hn1.d(gestaltButton.h()), false, null, 14);
            default:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                return GestaltButton.c(gestaltButton, $receiver);
        }
    }
}
