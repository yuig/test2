package om1;

import android.view.MotionEvent;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96665i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltIconButton f96666j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(GestaltIconButton gestaltIconButton, int i13) {
        super(2);
        this.f96665i = i13;
        this.f96666j = gestaltIconButton;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f96665i;
        GestaltIconButton gestaltIconButton = this.f96666j;
        switch (i13) {
            case 0:
                MotionEvent event = (MotionEvent) obj2;
                Intrinsics.checkNotNullParameter((Unit) obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() == 0) {
                    gestaltIconButton.f49394z.invoke();
                } else {
                    gestaltIconButton.f49393y.invoke();
                }
                return Unit.f80348a;
            default:
                MotionEvent event2 = (MotionEvent) obj2;
                Intrinsics.checkNotNullParameter((Unit) obj, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event2, "event");
                return event2.getAction() == 0 ? new n(event2, gestaltIconButton.getId()) : new o(event2, gestaltIconButton.getId());
        }
    }
}
