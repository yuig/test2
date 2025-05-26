package androidx.appcompat.app;

import android.view.View;
import q5.a2;

/* loaded from: classes.dex */
public final class w implements q5.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f16143a;

    public /* synthetic */ w(n0 n0Var) {
        this.f16143a = n0Var;
    }

    @Override // q5.v
    public final a2 k(View view, a2 a2Var) {
        int e13 = a2Var.e();
        int T = this.f16143a.T(null, a2Var);
        if (e13 != T) {
            a2Var = a2Var.g(a2Var.c(), T, a2Var.d(), a2Var.b());
        }
        return q5.v0.j(view, a2Var);
    }
}
