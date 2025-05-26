package i1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70823i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m1 f70824j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(m1 m1Var, int i13) {
        super(1);
        this.f70823i = i13;
        this.f70824j = m1Var;
    }

    public final j1.h0 b(j1.z1 z1Var) {
        j1.h0 h0Var;
        j1.h0 h0Var2;
        int i13 = this.f70823i;
        m1 m1Var = this.f70824j;
        switch (i13) {
            case 0:
                w0 w0Var = w0.PreEnter;
                w0 w0Var2 = w0.Visible;
                j1.h0 h0Var3 = null;
                if (z1Var.b(w0Var, w0Var2)) {
                    p0 p0Var = m1Var.f70836r.f70855a.f70948c;
                    if (p0Var != null) {
                        h0Var3 = p0Var.f70868c;
                    }
                } else if (z1Var.b(w0Var2, w0.PostExit)) {
                    p0 p0Var2 = m1Var.f70837s.f70860a.f70948c;
                    if (p0Var2 != null) {
                        h0Var3 = p0Var2.f70868c;
                    }
                } else {
                    h0Var3 = androidx.compose.animation.a.f17069d;
                }
                return h0Var3 == null ? androidx.compose.animation.a.f17069d : h0Var3;
            default:
                w0 w0Var3 = w0.PreEnter;
                w0 w0Var4 = w0.Visible;
                if (z1Var.b(w0Var3, w0Var4)) {
                    w1 w1Var = m1Var.f70836r.f70855a.f70947b;
                    return (w1Var == null || (h0Var2 = w1Var.f70925b) == null) ? androidx.compose.animation.a.f17068c : h0Var2;
                }
                if (!z1Var.b(w0Var4, w0.PostExit)) {
                    return androidx.compose.animation.a.f17068c;
                }
                w1 w1Var2 = m1Var.f70837s.f70860a.f70947b;
                return (w1Var2 == null || (h0Var = w1Var2.f70925b) == null) ? androidx.compose.animation.a.f17068c : h0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f70823i) {
        }
        return b((j1.z1) obj);
    }
}
