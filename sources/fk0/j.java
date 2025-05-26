package fk0;

import android.text.Editable;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62292i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f62293j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i13) {
        super(1);
        this.f62292i = i13;
        this.f62293j = kVar;
    }

    public final void b(ao1.i bind) {
        int i13 = this.f62292i;
        k kVar = this.f62293j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                GestaltTextField gestaltTextField = kVar.f62302r0;
                if (gestaltTextField != null) {
                    bind.d(StringsKt.i0(String.valueOf(gestaltTextField.z0())).toString());
                    return;
                } else {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                GestaltTextField gestaltTextField2 = kVar.f62302r0;
                if (gestaltTextField2 == null) {
                    Intrinsics.r("boardNameEt");
                    throw null;
                }
                Editable z03 = gestaltTextField2.z0();
                bind.f20099p = z03 != null ? Integer.valueOf(z03.length()) : null;
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f62292i) {
            case 0:
                b((ao1.i) obj);
                break;
            case 1:
                b((ao1.i) obj);
                break;
            default:
                on1.i event = (on1.i) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                this.f62293j.J0.h3(event);
                break;
        }
        return Unit.f80348a;
    }
}
