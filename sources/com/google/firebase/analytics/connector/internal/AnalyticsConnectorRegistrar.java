package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.d1;
import com.google.firebase.components.ComponentRegistrar;
import df.j1;
import java.util.Arrays;
import java.util.List;
import nl.g;
import pl.a;
import pl.b;
import sl.c;
import sl.k;
import sl.l;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(c cVar) {
        boolean z13;
        g gVar = (g) cVar.a(g.class);
        Context context = (Context) cVar.a(Context.class);
        zl.c cVar2 = (zl.c) cVar.a(zl.c.class);
        d.t(gVar);
        d.t(context);
        d.t(cVar2);
        d.t(context.getApplicationContext());
        if (b.f100555b == null) {
            synchronized (b.class) {
                try {
                    if (b.f100555b == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.b();
                        if ("[DEFAULT]".equals(gVar.f91218b)) {
                            ((l) cVar2).a(pl.c.f100557a, pl.d.f100558a);
                            gVar.b();
                            gm.a aVar = (gm.a) gVar.f91223g.get();
                            synchronized (aVar) {
                                z13 = aVar.f65751a;
                            }
                            bundle.putBoolean("dataCollectionDefaultEnabled", z13);
                        }
                        b.f100555b = new b(d1.a(context, bundle).f31352d);
                    }
                } finally {
                }
            }
        }
        return b.f100555b;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<sl.b> getComponents() {
        sl.a a13 = sl.b.a(a.class);
        a13.a(k.a(g.class));
        a13.a(k.a(Context.class));
        a13.a(k.a(zl.c.class));
        a13.f113125f = ql.b.f104067a;
        if (a13.f113123d != 0) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        a13.f113123d = 2;
        return Arrays.asList(a13.b(), j1.G("fire-analytics", "21.5.0"));
    }
}
