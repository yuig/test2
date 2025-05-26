package n3;

import android.view.MotionEvent;
import k1.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s3.a2;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89035i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p4.j f89036j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(p4.j jVar, int i13) {
        super(1);
        this.f89035i = i13;
        this.f89036j = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean dispatchTouchEvent;
        int i13 = this.f89035i;
        p4.j jVar = this.f89036j;
        switch (i13) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = jVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = jVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
            default:
                a2 a2Var = (a2) obj;
                t3.c0 c0Var = a2Var instanceof t3.c0 ? (t3.c0) a2Var : null;
                if (c0Var != null) {
                    v0 v0Var = new v0(14, c0Var, jVar);
                    k2.e eVar = c0Var.f115900p0;
                    if (!eVar.i(v0Var)) {
                        eVar.b(v0Var);
                    }
                }
                jVar.removeAllViewsInLayout();
                return Unit.f80348a;
        }
    }
}
