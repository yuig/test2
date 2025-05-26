package kb1;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f79076r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f79077s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f79077s = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        j jVar = new j(this.f79077s, cVar);
        jVar.f79076r = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        b bVar = (b) this.f79076r;
        n nVar = this.f79077s;
        GestaltTextField gestaltTextField = nVar.f79087f0;
        if (gestaltTextField == null) {
            Intrinsics.r("backupEmailTextField");
            throw null;
        }
        gestaltTextField.X(new i(bVar, 0));
        GestaltTextField gestaltTextField2 = nVar.f79088g0;
        if (gestaltTextField2 == null) {
            Intrinsics.r("confirmBackupEmailTextField");
            throw null;
        }
        gestaltTextField2.X(new i(bVar, 1));
        GestaltButton gestaltButton = nVar.f79089h0;
        if (gestaltButton != null) {
            gestaltButton.d(new i(bVar, 2));
            return Unit.f80348a;
        }
        Intrinsics.r("sendEmailButton");
        throw null;
    }
}
