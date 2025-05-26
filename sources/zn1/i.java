package zn1;

import android.view.KeyEvent;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u5.x;

/* loaded from: classes5.dex */
public final class i extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f142309i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f142310j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(x xVar, int i13) {
        super(2);
        this.f142309i = i13;
        this.f142310j = xVar;
    }

    public final gm1.c b(int i13, KeyEvent keyEvent) {
        int i14 = this.f142309i;
        x xVar = this.f142310j;
        switch (i14) {
            case 0:
                return new xn1.d(((GestaltTextField) xVar.f120537c).getId(), keyEvent, i13);
            default:
                return new xn1.g(((GestaltTextField) xVar.f120537c).getId(), keyEvent, i13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f142309i) {
        }
        return b(((Number) obj).intValue(), (KeyEvent) obj2);
    }
}
