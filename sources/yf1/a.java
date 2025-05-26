package yf1;

import a42.r;
import com.pinterest.gestalt.button.view.GestaltButton;
import jc0.s;
import jc0.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import m60.u;
import m60.w;

/* loaded from: classes5.dex */
public final /* synthetic */ class a extends p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138963a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, int i13) {
        super(1, obj, b.class, "goToNextStep", "goToNextStep(Lcom/pinterest/schemas/story_pin/StoryPinSatisfaction;)V", 0);
        this.f138963a = i13;
        if (i13 != 1) {
        } else {
            super(1, obj, i.class, "toggleSubmitButton", "toggleSubmitButton(Z)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f138963a) {
            case 0:
                r p03 = (r) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                b bVar = (b) this.receiver;
                bVar.getClass();
                w wVar = u.f85943a;
                wVar.d(new s());
                wVar.d(new v(new i(bVar.f138964a, p03), false, 0L, 30));
                return Unit.f80348a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                GestaltButton gestaltButton = ((i) this.receiver).f138983d;
                if (gestaltButton != null) {
                    gestaltButton.d(new fd1.h(booleanValue, 14));
                    return Unit.f80348a;
                }
                Intrinsics.r("submitButton");
                throw null;
        }
    }
}
