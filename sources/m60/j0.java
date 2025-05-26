package m60;

import kotlin.jvm.functions.Function0;
import so.oa;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85914i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f85915j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(m0 m0Var, int i13) {
        super(0);
        this.f85914i = i13;
        this.f85915j = m0Var;
    }

    public final se2.a b() {
        int i13 = this.f85914i;
        m0 m0Var = this.f85915j;
        switch (i13) {
            case 2:
                return bf2.b.a(((oa) m0Var.h()).f113907s5);
            case 3:
                return bf2.b.a(((oa) m0Var.h()).f113623c2);
            default:
                return bf2.b.a(((oa) m0Var.h()).H1);
        }
    }

    public final wk2.a e() {
        int i13 = this.f85914i;
        m0 m0Var = this.f85915j;
        switch (i13) {
            case 6:
                return ((oa) m0Var.h()).f113857p7;
            case 7:
                return ((oa) m0Var.h()).f113822n7;
            default:
                return ((oa) m0Var.h()).f113840o7;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f85914i;
        m0 m0Var = this.f85915j;
        switch (i13) {
            case 0:
                return ((oa) m0Var.h()).l2();
            case 1:
                return (vy.m) ((oa) m0Var.h()).M1.get();
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return (ff0.b) ((oa) m0Var.h()).P1.get();
            case 5:
                return new n60.s(m0Var);
            case 6:
                return e();
            case 7:
                return e();
            case 8:
                return (ip1.b) ((oa) m0Var.h()).H7.get();
            case 9:
                return e();
            case 10:
                return b();
            default:
                return (a11.b0) ((oa) m0Var.h()).I7.get();
        }
    }
}
