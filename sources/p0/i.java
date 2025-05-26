package p0;

import a.o3;
import a.z0;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.g0;
import com.google.common.util.concurrent.c0;
import g0.m;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class i extends f1 {

    /* renamed from: c, reason: collision with root package name */
    public final z0 f98343c;

    public i(g0 g0Var, z0 z0Var) {
        super(g0Var);
        this.f98343c = z0Var;
    }

    @Override // androidx.camera.core.impl.f1, androidx.camera.core.impl.g0
    public final c0 j(int i13, int i14, List list) {
        com.bumptech.glide.d.g("Only support one capture config.", list.size() == 1);
        c0 k13 = this.f16838b.k(i13, i14);
        g0.d a13 = g0.d.a(k13);
        g0.h hVar = new g0.h(0, k13);
        f0.d s13 = l3.c.s();
        a13.getClass();
        return m.b(Collections.singletonList(m.j(m.j(m.j(a13, hVar, s13), new o3(3, this, list), l3.c.s()), new g0.h(1, k13), l3.c.s())));
    }
}
