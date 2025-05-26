package n91;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f90051r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f90052s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f90052s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        n nVar = new n(this.f90052s, cVar);
        nVar.f90051r = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f90051r;
        q qVar = this.f90052s;
        GestaltSpinner gestaltSpinner = qVar.f90061f0;
        if (gestaltSpinner == null) {
            Intrinsics.r("loadingView");
            throw null;
        }
        s0.w(gestaltSpinner, new m(aVar2, 0));
        GestaltText gestaltText = qVar.f90063h0;
        if (gestaltText == null) {
            Intrinsics.r("verificationCodeDescription");
            throw null;
        }
        gestaltText.i(new m(aVar2, 1));
        GestaltTextField gestaltTextField = qVar.f90064i0;
        if (gestaltTextField == null) {
            Intrinsics.r("verificationCodeInput");
            throw null;
        }
        gestaltTextField.X(new m(aVar2, 2));
        GestaltButton gestaltButton = qVar.f90065j0;
        if (gestaltButton == null) {
            Intrinsics.r("verificationCodeResend");
            throw null;
        }
        gestaltButton.d(new m(aVar2, 3));
        GestaltButton gestaltButton2 = qVar.f90066k0;
        if (gestaltButton2 != null) {
            gestaltButton2.d(new m(aVar2, 4));
            return Unit.f80348a;
        }
        Intrinsics.r("submitButton");
        throw null;
    }
}
