package com.google.firebase.installations;

import am.d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.a0;
import df.j1;
import dm.e;
import dm.f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import nl.g;
import rl.a;
import rl.b;
import sl.c;
import sl.q;
import tl.k;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static f lambda$getComponents$0(c cVar) {
        return new e((g) cVar.a(g.class), cVar.f(am.e.class), (ExecutorService) cVar.e(new q(a.class, ExecutorService.class)), new k((Executor) cVar.e(new q(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<sl.b> getComponents() {
        sl.a a13 = sl.b.a(f.class);
        a13.f113120a = LIBRARY_NAME;
        a13.a(sl.k.a(g.class));
        int i13 = 0;
        a13.a(new sl.k(0, 1, am.e.class));
        a13.a(new sl.k(new q(a.class, ExecutorService.class), 1, 0));
        a13.a(new sl.k(new q(b.class, Executor.class), 1, 0));
        a13.f113125f = new c3.e(5);
        sl.b b13 = a13.b();
        d dVar = new d(i13);
        sl.a a14 = sl.b.a(d.class);
        a14.f113124e = 1;
        a14.f113125f = new a0(dVar, i13);
        return Arrays.asList(b13, a14.b(), j1.G(LIBRARY_NAME, "17.1.3"));
    }
}
