package i1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70939i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n1 f70940j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o1 f70941k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(n1 n1Var, o1 o1Var, int i13) {
        super(1);
        this.f70939i = i13;
        this.f70940j = n1Var;
        this.f70941k = o1Var;
    }

    public final j1.h0 b(j1.z1 z1Var) {
        int i13 = this.f70939i;
        o1 o1Var = this.f70941k;
        n1 n1Var = this.f70940j;
        switch (i13) {
            case 0:
                w0 w0Var = w0.PreEnter;
                w0 w0Var2 = w0.Visible;
                if (!z1Var.b(w0Var, w0Var2)) {
                    if (!z1Var.b(w0Var2, w0.PostExit)) {
                        break;
                    } else {
                        p1 p1Var = o1Var.f70860a.f70946a;
                        if (p1Var == null || (r5 = p1Var.f70871b) == null) {
                            break;
                        }
                    }
                } else {
                    p1 p1Var2 = n1Var.f70855a.f70946a;
                    if (p1Var2 == null || (r5 = p1Var2.f70871b) == null) {
                        break;
                    }
                }
                break;
            default:
                w0 w0Var3 = w0.PreEnter;
                w0 w0Var4 = w0.Visible;
                if (!z1Var.b(w0Var3, w0Var4)) {
                    if (!z1Var.b(w0Var4, w0.PostExit)) {
                        break;
                    } else {
                        t1 t1Var = o1Var.f70860a.f70949d;
                        if (t1Var == null || (r5 = t1Var.f70903c) == null) {
                            break;
                        }
                    }
                } else {
                    t1 t1Var2 = n1Var.f70855a.f70949d;
                    if (t1Var2 == null || (r5 = t1Var2.f70903c) == null) {
                        break;
                    }
                }
                break;
        }
        return androidx.compose.animation.a.f17067b;
    }

    public final Float e(w0 w0Var) {
        int i13 = this.f70939i;
        n1 n1Var = this.f70940j;
        o1 o1Var = this.f70941k;
        float f13 = 1.0f;
        switch (i13) {
            case 1:
                int i14 = z0.f70945a[w0Var.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        p1 p1Var = n1Var.f70855a.f70946a;
                        if (p1Var != null) {
                            f13 = p1Var.f70870a;
                        }
                    } else {
                        if (i14 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        p1 p1Var2 = o1Var.f70860a.f70946a;
                        if (p1Var2 != null) {
                            f13 = p1Var2.f70870a;
                        }
                    }
                }
                return Float.valueOf(f13);
            default:
                int i15 = b1.f70729a[w0Var.ordinal()];
                if (i15 != 1) {
                    if (i15 == 2) {
                        t1 t1Var = n1Var.f70855a.f70949d;
                        if (t1Var != null) {
                            f13 = t1Var.f70901a;
                        }
                    } else {
                        if (i15 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        t1 t1Var2 = o1Var.f70860a.f70949d;
                        if (t1Var2 != null) {
                            f13 = t1Var2.f70901a;
                        }
                    }
                }
                return Float.valueOf(f13);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f70939i) {
            case 0:
                return b((j1.z1) obj);
            case 1:
                return e((w0) obj);
            case 2:
                return b((j1.z1) obj);
            default:
                return e((w0) obj);
        }
    }
}
