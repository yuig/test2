package ni1;

import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.functions.Function0;
import lh0.a4;
import lh0.z3;

/* loaded from: classes2.dex */
public final class r2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f90788i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s2 f90789j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(s2 s2Var, int i13) {
        super(0);
        this.f90788i = i13;
        this.f90789j = s2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f90788i;
        s2 s2Var = this.f90789j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(s2Var.f90793a.c0("enabled_retry"));
            default:
                lh0.r2 r2Var = s2Var.f90793a;
                r2Var.getClass();
                z3 z3Var = a4.f83298b;
                lh0.g1 g1Var = (lh0.g1) r2Var.f83469a;
                return Boolean.valueOf(g1Var.o("android_pin_rep_event_queue", "enabled", z3Var) || g1Var.l("android_pin_rep_event_queue"));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f90788i) {
            case 0:
                return invoke();
            case 1:
                return new LinkedBlockingQueue(s2.a(this.f90789j));
            default:
                return invoke();
        }
    }
}
