package n3;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89141i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f89142j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(a0 a0Var, int i13) {
        super(1);
        this.f89141i = i13;
        this.f89142j = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a0 a0Var = this.f89142j;
        int i13 = this.f89141i;
        switch (i13) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (i13) {
                    case 0:
                        Function1 function1 = a0Var.f89029b;
                        if (function1 == null) {
                            Intrinsics.r("onTouchEvent");
                            throw null;
                        }
                        function1.invoke(motionEvent);
                        break;
                    default:
                        Function1 function12 = a0Var.f89029b;
                        if (function12 == null) {
                            Intrinsics.r("onTouchEvent");
                            throw null;
                        }
                        function12.invoke(motionEvent);
                        break;
                }
                return Unit.f80348a;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                switch (i13) {
                    case 0:
                        Function1 function13 = a0Var.f89029b;
                        if (function13 == null) {
                            Intrinsics.r("onTouchEvent");
                            throw null;
                        }
                        function13.invoke(motionEvent2);
                        break;
                    default:
                        Function1 function14 = a0Var.f89029b;
                        if (function14 == null) {
                            Intrinsics.r("onTouchEvent");
                            throw null;
                        }
                        function14.invoke(motionEvent2);
                        break;
                }
                return Unit.f80348a;
        }
    }
}
