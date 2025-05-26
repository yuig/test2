package ml0;

import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f87471i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f87472j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(w wVar, int i13) {
        super(1);
        this.f87471i = i13;
        this.f87472j = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f87471i;
        w wVar = this.f87472j;
        switch (i13) {
            case 0:
                GestaltText gestaltText = wVar.W0;
                if (gestaltText != null) {
                    gestaltText.animate().alpha(1.0f).setDuration(300L).start();
                    return Unit.f80348a;
                }
                Intrinsics.r("repositionText");
                throw null;
            default:
                t0 itemPin = (t0) obj;
                Intrinsics.checkNotNullParameter(itemPin, "itemPin");
                i iVar = new i(itemPin);
                int i14 = w.f87509e1;
                kh2.j.x2((r0) wVar.O0.getValue(), iVar);
                return Unit.f80348a;
        }
    }
}
