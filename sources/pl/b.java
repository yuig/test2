package pl;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.n1;
import java.util.concurrent.ConcurrentHashMap;
import rd.j;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile b f100555b;

    /* renamed from: a, reason: collision with root package name */
    public final j f100556a;

    public b(j jVar) {
        com.bumptech.glide.d.t(jVar);
        this.f100556a = jVar;
        new ConcurrentHashMap();
    }

    public final void a(String str, Bundle bundle) {
        if (ql.a.c() && ql.a.a(str, bundle) && ql.a.b(str, bundle)) {
            d1 d1Var = (d1) this.f100556a.f107506b;
            d1Var.getClass();
            d1Var.b(new n1(d1Var, "fcm", str, bundle, true));
        }
    }
}
