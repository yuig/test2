package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import df.j1;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(sl.c cVar) {
        nl.g gVar = (nl.g) cVar.a(nl.g.class);
        ep.b.A(cVar.a(bm.a.class));
        return new FirebaseMessaging(gVar, cVar.f(km.b.class), cVar.f(am.g.class), (dm.f) cVar.a(dm.f.class), (ig.d) cVar.a(ig.d.class), (zl.c) cVar.a(zl.c.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<sl.b> getComponents() {
        sl.a a13 = sl.b.a(FirebaseMessaging.class);
        a13.f113120a = LIBRARY_NAME;
        a13.a(sl.k.a(nl.g.class));
        a13.a(new sl.k(0, 0, bm.a.class));
        a13.a(new sl.k(0, 1, km.b.class));
        a13.a(new sl.k(0, 1, am.g.class));
        a13.a(new sl.k(0, 0, ig.d.class));
        a13.a(sl.k.a(dm.f.class));
        a13.a(sl.k.a(zl.c.class));
        a13.f113125f = new c3.e(6);
        if (a13.f113123d != 0) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        a13.f113123d = 1;
        return Arrays.asList(a13.b(), j1.G(LIBRARY_NAME, "23.1.2"));
    }
}
