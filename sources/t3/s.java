package t3;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.p implements kl2.l {
    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ep.b.A(obj);
        c0 c0Var = (c0) this.receiver;
        Resources resources = c0Var.getContext().getResources();
        return Boolean.valueOf(y0.f116278a.a(c0Var, null, new x2.a(new n4.c(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((a3.f) obj2).f497a, (Function1) obj3)));
    }
}
