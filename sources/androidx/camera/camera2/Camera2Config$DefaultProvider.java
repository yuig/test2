package androidx.camera.camera2;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.v1;
import c0.x;
import t.a;
import t.b;

/* loaded from: classes2.dex */
public final class Camera2Config$DefaultProvider {
    @NonNull
    public x getCameraXConfig() {
        a aVar = new a();
        b bVar = new b();
        a aVar2 = new a();
        u.a aVar3 = new u.a(2);
        c cVar = x.f24380b;
        q1 q1Var = aVar3.f119717b;
        q1Var.s(cVar, aVar);
        q1Var.s(x.f24381c, bVar);
        q1Var.s(x.f24382d, aVar2);
        return new x(v1.b(q1Var));
    }
}
