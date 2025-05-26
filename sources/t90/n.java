package t90;

import android.content.Context;
import com.pinterest.api.model.kr;
import com.pinterest.api.model.ln0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ym1.u;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f116814i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f116815j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13, Function1 function1) {
        super(1);
        this.f116814i = i13;
        this.f116815j = function1;
    }

    public final void b(String it) {
        int i13 = this.f116814i;
        Function1 function1 = this.f116815j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(it);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(it);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "text");
                function1.invoke(it);
                break;
            case 11:
                Intrinsics.f(it);
                function1.invoke(it);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(it, "userId");
                function1.invoke(it);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "userId");
                function1.invoke(it);
                break;
        }
    }

    public final void e(Throwable it) {
        int i13 = this.f116814i;
        Function1 function1 = this.f116815j;
        switch (i13) {
            case 8:
                function1.invoke(Boolean.FALSE);
                break;
            case 12:
                Intrinsics.f(it);
                function1.invoke(it);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(Boolean.TRUE);
                break;
        }
    }

    public final void f(on1.i it) {
        int i13 = this.f116814i;
        Function1 function1 = this.f116815j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(Boolean.valueOf(it instanceof on1.g));
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "event");
                function1.invoke(Boolean.valueOf(it instanceof on1.g));
                break;
        }
    }

    public final void h(tt1.a aVar) {
        int i13 = this.f116814i;
        Function1 function1 = this.f116815j;
        switch (i13) {
            case 21:
                Object c13 = aVar.c();
                Intrinsics.checkNotNullExpressionValue(c13, "getData(...)");
                function1.invoke(c13);
                break;
            default:
                kr krVar = (kr) aVar.c();
                String a13 = krVar != null ? krVar.a() : null;
                if (a13 == null) {
                    a13 = "";
                }
                function1.invoke(a13);
                break;
        }
    }

    public final void i(boolean z13) {
        int i13 = this.f116814i;
        Function1 function1 = this.f116815j;
        switch (i13) {
            case 16:
                function1.invoke(Boolean.valueOf(z13));
                break;
            case 17:
                function1.invoke(Boolean.valueOf(z13));
                break;
            case 18:
                function1.invoke(Boolean.valueOf(z13));
                break;
            case 19:
                function1.invoke(Boolean.valueOf(z13));
                break;
            case 20:
                function1.invoke(Boolean.valueOf(z13));
                break;
            case 21:
            case 22:
            case 23:
            default:
                function1.invoke(Boolean.valueOf(z13));
                break;
            case 24:
                function1.invoke(Boolean.valueOf(z13));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f116814i;
        Function1 function1 = this.f116815j;
        switch (i13) {
            case 0:
                function1.invoke(Integer.valueOf(((Number) obj).intValue()));
                break;
            case 1:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "context");
                break;
            case 2:
                b((String) obj);
                break;
            case 3:
                b((String) obj);
                break;
            case 4:
                b((String) obj);
                break;
            case 5:
                u result = (u) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                function1.invoke(result);
                break;
            case 6:
                dl0.e it = (dl0.e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                function1.invoke(new ej0.h(it));
                break;
            case 7:
                function1.invoke(Boolean.TRUE);
                break;
            case 8:
                e((Throwable) obj);
                break;
            case 9:
                ln0 data = (ln0) obj;
                Intrinsics.checkNotNullParameter(data, "data");
                break;
            case 10:
                ln0 ln0Var = (ln0) obj;
                Intrinsics.f(ln0Var);
                function1.invoke(ln0Var);
                break;
            case 11:
                b((String) obj);
                break;
            case 12:
                e((Throwable) obj);
                break;
            case 13:
                wb2.c it2 = (wb2.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                function1.invoke(new yy0.g(it2));
                break;
            case 14:
                f((on1.i) obj);
                break;
            case 15:
                xn1.j event = (xn1.j) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if ((event instanceof xn1.i) && function1 != null) {
                    function1.invoke(event);
                }
                break;
            case 16:
                i(((Boolean) obj).booleanValue());
                break;
            case 17:
                i(((Boolean) obj).booleanValue());
                break;
            case 18:
                i(((Boolean) obj).booleanValue());
                break;
            case 19:
                i(((Boolean) obj).booleanValue());
                break;
            case 20:
                i(((Boolean) obj).booleanValue());
                break;
            case 21:
                h((tt1.a) obj);
                break;
            case 22:
                e((Throwable) obj);
                break;
            case 23:
                function1.invoke(Boolean.FALSE);
                break;
            case 24:
                i(((Boolean) obj).booleanValue());
                break;
            case 25:
                i(((Boolean) obj).booleanValue());
                break;
            case 26:
                f((on1.i) obj);
                break;
            case 27:
                b((String) obj);
                break;
            case 28:
                b((String) obj);
                break;
            default:
                h((tt1.a) obj);
                break;
        }
        return Unit.f80348a;
    }
}
