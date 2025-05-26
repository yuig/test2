package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import c3.e;
import com.google.firebase.components.ComponentRegistrar;
import df.j1;
import h6.q;
import ig.b;
import ig.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import jg.a;
import lg.i;
import lg.k;
import sl.c;
import t3.s1;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        Set singleton;
        byte[] bytes;
        Context context = (Context) cVar.a(Context.class);
        if (k.f83196d == null) {
            synchronized (k.class) {
                try {
                    if (k.f83196d == null) {
                        q qVar = new q();
                        context.getClass();
                        qVar.f67746a = context;
                        k.f83196d = qVar.b();
                    }
                } finally {
                }
            }
        }
        lg.c cVar2 = k.f83196d;
        if (cVar2 == null) {
            throw new IllegalStateException("Not initialized!");
        }
        k kVar = (k) cVar2.f83186f.get();
        a aVar = a.f75892e;
        kVar.getClass();
        if (aVar instanceof lg.d) {
            aVar.getClass();
            singleton = Collections.unmodifiableSet(a.f75891d);
        } else {
            singleton = Collections.singleton(new b("proto"));
        }
        ig.c cVar3 = ig.c.DEFAULT;
        if (cVar3 == null) {
            throw new NullPointerException("Null priority");
        }
        aVar.getClass();
        String str = aVar.f75893a;
        String str2 = aVar.f75894b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = s1.c("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        return new i(singleton, new lg.b("cct", bytes, cVar3), kVar);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<sl.b> getComponents() {
        sl.a a13 = sl.b.a(d.class);
        a13.f113120a = LIBRARY_NAME;
        a13.a(sl.k.a(Context.class));
        a13.f113125f = new e(4);
        return Arrays.asList(a13.b(), j1.G(LIBRARY_NAME, "18.1.7"));
    }
}
