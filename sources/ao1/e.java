package ao1;

import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20071i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltTextField f20072j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f20073k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(GestaltTextField gestaltTextField, b bVar, int i13) {
        super(1);
        this.f20071i = i13;
        this.f20072j = gestaltTextField;
        this.f20073k = bVar;
    }

    public final void b(int i13) {
        int i14 = this.f20071i;
        GestaltTextField gestaltTextField = this.f20072j;
        b bVar = this.f20073k;
        switch (i14) {
            case 1:
                int i15 = bVar.f20037h;
                yn1.f fVar = GestaltTextField.f49669t;
                gestaltTextField.o0().setMinLines(i15);
                break;
            default:
                int i16 = bVar.f20038i;
                yn1.f fVar2 = GestaltTextField.f49669t;
                if (i16 <= 0) {
                    gestaltTextField.getClass();
                    break;
                } else {
                    gestaltTextField.o0().setMaxLines(i16);
                    break;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20071i) {
            case 0:
                b newState = (b) obj;
                Intrinsics.checkNotNullParameter(newState, "newState");
                yn1.f fVar = GestaltTextField.f49669t;
                this.f20072j.I0(this.f20073k, newState);
                break;
            case 1:
                b(((Number) obj).intValue());
                break;
            default:
                b(((Number) obj).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
