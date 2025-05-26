package sf1;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112644i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f112645j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, int i13) {
        super(0);
        this.f112644i = i13;
        this.f112645j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.f112645j;
        int i13 = this.f112644i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        w0 w0Var = ((s) obj).D;
                        if (w0Var != null) {
                            w0Var.a();
                            break;
                        }
                        break;
                    default:
                        w0 w0Var2 = ((s) obj).D;
                        if (w0Var2 != null) {
                            w0Var2.a();
                            break;
                        }
                        break;
                }
                return Unit.f80348a;
            case 1:
                switch (i13) {
                    case 0:
                        w0 w0Var3 = ((s) obj).D;
                        if (w0Var3 != null) {
                            w0Var3.a();
                            break;
                        }
                        break;
                    default:
                        w0 w0Var4 = ((s) obj).D;
                        if (w0Var4 != null) {
                            w0Var4.a();
                            break;
                        }
                        break;
                }
                return Unit.f80348a;
            default:
                return new GestaltSpinner(6, (Context) obj, (AttributeSet) null);
        }
    }
}
