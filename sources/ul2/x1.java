package ul2;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class x1 extends kotlin.jvm.internal.l0 {
    public static i0 j(kotlin.jvm.internal.e eVar) {
        rl2.f owner = eVar.getOwner();
        return owner instanceof i0 ? (i0) owner : f.f122517b;
    }

    @Override // kotlin.jvm.internal.l0
    public final rl2.g a(kotlin.jvm.internal.o oVar) {
        i0 container = j(oVar);
        String name = oVar.getName();
        String signature = oVar.getSignature();
        Object boundReceiver = oVar.getBoundReceiver();
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new k0(container, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.l0
    public final rl2.d b(Class cls) {
        return c.a(cls);
    }

    @Override // kotlin.jvm.internal.l0
    public final rl2.f c(Class key, String str) {
        d dVar = c.f122499a;
        Intrinsics.checkNotNullParameter(key, "jClass");
        d dVar2 = c.f122500b;
        dVar2.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap concurrentHashMap = dVar2.f122507g;
        Object obj = concurrentHashMap.get(key);
        if (obj == null) {
            Object invoke = dVar2.f122506f.invoke(key);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(key, invoke);
            obj = putIfAbsent == null ? invoke : putIfAbsent;
        }
        return (rl2.f) obj;
    }

    @Override // kotlin.jvm.internal.l0
    public final rl2.j d(kotlin.jvm.internal.u uVar) {
        return new m0(j(uVar), uVar.getName(), uVar.getSignature(), uVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.l0
    public final rl2.l e(kotlin.jvm.internal.w wVar) {
        return new o0(j(wVar), wVar.getName(), wVar.getSignature(), wVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.l0
    public final rl2.r f(kotlin.jvm.internal.a0 a0Var) {
        return new b1(j(a0Var), a0Var.getName(), a0Var.getSignature(), a0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.l0
    public final rl2.t g(kotlin.jvm.internal.c0 c0Var) {
        return new e1(j(c0Var), c0Var.getName(), c0Var.getSignature(), c0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.l0
    public final String h(kotlin.jvm.internal.n nVar) {
        k0 b13;
        k0 k03 = f0.h.k0(nVar);
        if (k03 == null || (b13 = c2.b(k03)) == null) {
            return super.h(nVar);
        }
        an2.y yVar = z1.f122650a;
        return z1.c(b13.n());
    }

    @Override // kotlin.jvm.internal.l0
    public final String i(kotlin.jvm.internal.s sVar) {
        return h(sVar);
    }
}
