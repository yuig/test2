package c2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final w f24842a;

    /* renamed from: b, reason: collision with root package name */
    public n4.b f24843b;

    public i2(j2 j2Var, Function1 function1) {
        int i13 = 1;
        this.f24842a = new w(j2Var, new w1(this, i13), new d2(this, i13), g2.f24762d, function1);
    }

    public static final n4.b a(i2 i2Var) {
        n4.b bVar = i2Var.f24843b;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + i2Var + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }
}
