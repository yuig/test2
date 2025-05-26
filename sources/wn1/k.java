package wn1;

import android.view.KeyEvent;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130561i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTextComposer f130562j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13, GestaltTextComposer gestaltTextComposer) {
        super(2);
        this.f130561i = i13;
        this.f130562j = gestaltTextComposer;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        GestaltTextComposer gestaltTextComposer = this.f130562j;
        int i13 = this.f130561i;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj).intValue();
                KeyEvent keyEvent = (KeyEvent) obj2;
                switch (i13) {
                    case 0:
                        return new u(gestaltTextComposer.getId(), keyEvent, intValue);
                    default:
                        return new q(gestaltTextComposer.getId(), keyEvent, intValue);
                }
            default:
                int intValue2 = ((Number) obj).intValue();
                KeyEvent keyEvent2 = (KeyEvent) obj2;
                switch (i13) {
                    case 0:
                        return new u(gestaltTextComposer.getId(), keyEvent2, intValue2);
                    default:
                        return new q(gestaltTextComposer.getId(), keyEvent2, intValue2);
                }
        }
    }
}
