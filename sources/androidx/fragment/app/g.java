package androidx.fragment.app;

import android.view.View;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f18322a;

    /* renamed from: b, reason: collision with root package name */
    public final j5.d f18323b;

    public g(z1 operation, j5.d signal) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(signal, "signal");
        this.f18322a = operation;
        this.f18323b = signal;
    }

    public final void a() {
        z1 z1Var = this.f18322a;
        z1Var.getClass();
        j5.d signal = this.f18323b;
        Intrinsics.checkNotNullParameter(signal, "signal");
        LinkedHashSet linkedHashSet = z1Var.f18512e;
        if (linkedHashSet.remove(signal) && linkedHashSet.isEmpty()) {
            z1Var.b();
        }
    }

    public final boolean b() {
        x1 x1Var;
        v1 v1Var = x1.Companion;
        z1 z1Var = this.f18322a;
        View view = z1Var.f18510c.mView;
        Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
        v1Var.getClass();
        x1 a13 = v1.a(view);
        x1 x1Var2 = z1Var.f18508a;
        return a13 == x1Var2 || !(a13 == (x1Var = x1.VISIBLE) || x1Var2 == x1Var);
    }
}
