package com.google.firebase;

import am.c;
import am.d;
import am.g;
import android.content.Context;
import android.os.Build;
import c3.e;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.a0;
import df.j1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import sl.a;
import sl.b;
import sl.k;
import sl.q;
import xk2.j;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        a a13 = b.a(km.b.class);
        a13.a(new k(2, 0, km.a.class));
        a13.f113125f = new e(7);
        arrayList.add(a13.b());
        q qVar = new q(rl.a.class, Executor.class);
        a aVar = new a(c.class, new Class[]{am.e.class, g.class});
        aVar.a(k.a(Context.class));
        aVar.a(k.a(nl.g.class));
        aVar.a(new k(2, 0, d.class));
        aVar.a(new k(1, 1, km.b.class));
        aVar.a(new k(qVar, 1, 0));
        aVar.f113125f = new a0(qVar, 2);
        arrayList.add(aVar.b());
        arrayList.add(j1.G("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(j1.G("fire-core", "20.4.2"));
        arrayList.add(j1.G("device-name", a(Build.PRODUCT)));
        arrayList.add(j1.G("device-model", a(Build.DEVICE)));
        arrayList.add(j1.G("device-brand", a(Build.BRAND)));
        arrayList.add(j1.Z("android-target-sdk", new fl.q(13)));
        arrayList.add(j1.Z("android-min-sdk", new fl.q(14)));
        arrayList.add(j1.Z("android-platform", new fl.q(15)));
        arrayList.add(j1.Z("android-installer", new fl.q(16)));
        try {
            str = j.f135215f.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(j1.G("kotlin", str));
        }
        return arrayList;
    }
}
