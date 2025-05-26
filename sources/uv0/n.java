package uv0;

import com.pinterest.api.model.ln0;
import com.pinterest.api.model.tp;
import kotlin.jvm.internal.Intrinsics;
import xk2.v;

/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final v f123180a = xk2.m.b(g.f123169l);

    public static final ln0 a(ln0 ln0Var, boolean z13, tp updatedPage) {
        Intrinsics.checkNotNullParameter(ln0Var, "<this>");
        Intrinsics.checkNotNullParameter(updatedPage, "updatedPage");
        return z13 ? ln0Var.J(updatedPage, true) : ln0Var.I(new mu0.c(updatedPage, 1));
    }
}
