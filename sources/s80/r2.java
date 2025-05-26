package s80;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class r2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111779i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f111780j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f111781k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(Function1 function1, i2.q1 q1Var, int i13) {
        super(1);
        this.f111779i = i13;
        this.f111780j = function1;
        this.f111781k = q1Var;
    }

    public final void b(l62.w it) {
        int i13 = this.f111779i;
        i2.q1 q1Var = this.f111781k;
        Function1 function1 = this.f111780j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(new h1(it));
                if (it instanceof l62.n) {
                    q1Var.setValue(Boolean.TRUE);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(new h1(it));
                if (it instanceof l62.n) {
                    q1Var.setValue(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i13 = this.f111779i;
        i2.q1 q1Var = this.f111781k;
        Function1 function1 = this.f111780j;
        switch (i13) {
            case 0:
                b((l62.w) obj);
                break;
            case 1:
                b((l62.w) obj);
                break;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                q1Var.setValue(Float.valueOf(floatValue));
                function1.invoke(Float.valueOf(floatValue));
                break;
            case 3:
                KeyEvent it = ((l3.b) obj).f81494a;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!l3.a.a(l3.c.G(it), l3.a.f81487i)) {
                    break;
                } else {
                    function1.invoke((String) q1Var.getValue());
                    break;
                }
            case 4:
                w1.i1 $receiver = (w1.i1) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                function1.invoke((String) q1Var.getValue());
                break;
            default:
                String newValue = (String) obj;
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                int I = StringsKt.I(newValue);
                while (true) {
                    if (-1 >= I) {
                        str = "";
                    } else if (newValue.charAt(I) == '\n') {
                        I--;
                    } else {
                        str = newValue.substring(0, I + 1);
                        Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                    }
                }
                function1.invoke(Boolean.valueOf(str.length() > 0));
                q1Var.setValue(str);
                break;
        }
        return Unit.f80348a;
    }
}
