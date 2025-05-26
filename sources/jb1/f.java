package jb1;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f75334r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f75335s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f75335s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f75335s, cVar);
        fVar.f75334r = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f75334r;
        i iVar = this.f75335s;
        GestaltTextField gestaltTextField = iVar.f75344f0;
        if (gestaltTextField == null) {
            Intrinsics.r("codeTextField");
            throw null;
        }
        gestaltTextField.X(new e(bVar, 0));
        GestaltTextField gestaltTextField2 = iVar.f75345g0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("confirmCodeTextField");
            throw null;
        }
        gestaltTextField2.X(new e(bVar, 1));
        GestaltButton gestaltButton = iVar.f75346h0;
        if (gestaltButton != null) {
            gestaltButton.d(new e(bVar, 2));
            return Unit.f80348a;
        }
        Intrinsics.r("nextButton");
        throw null;
    }
}
