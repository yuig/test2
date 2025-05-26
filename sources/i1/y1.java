package i1;

import android.view.ViewConfiguration;
import t3.f2;

/* loaded from: classes.dex */
public abstract class y1 {

    /* renamed from: a */
    public static final float f70942a = ViewConfiguration.getScrollFriction();

    public static final j1.a0 a(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        n4.b bVar = (n4.b) sVar.m(f2.f115983f);
        boolean e13 = sVar.e(bVar.b());
        Object J2 = sVar.J();
        if (e13 || J2 == i2.n.f71185a) {
            J2 = new j1.a0(new x1(bVar));
            sVar.g0(J2);
        }
        return (j1.a0) J2;
    }
}
