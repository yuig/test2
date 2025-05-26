package oi;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final /* synthetic */ class v4 {

    /* renamed from: a, reason: collision with root package name */
    public u4 f95230a;

    public /* synthetic */ v4(u4 u4Var) {
        this.f95230a = u4Var;
    }

    public final void a(String str, Bundle bundle) {
        String uri;
        u4 u4Var = this.f95230a;
        o4 o4Var = u4Var.f95206j;
        u4.d(o4Var);
        o4Var.p();
        if (u4Var.e()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (str == null || str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        g4 g4Var = u4Var.f95204h;
        u4.c(g4Var);
        g4Var.f94787v.m(uri);
        u4.c(g4Var);
        u4Var.f95210n.getClass();
        g4Var.f94788w.b(System.currentTimeMillis());
    }

    public final boolean b() {
        u4 u4Var = this.f95230a;
        if (!TextUtils.isEmpty(u4Var.f95198b)) {
            return false;
        }
        y3 y3Var = u4Var.f95205i;
        u4.d(y3Var);
        return y3Var.x(3);
    }

    public final boolean c() {
        g4 g4Var = this.f95230a.f95204h;
        u4.c(g4Var);
        return g4Var.f94788w.a() > 0;
    }

    public final boolean d() {
        if (!c()) {
            return false;
        }
        u4 u4Var = this.f95230a;
        u4Var.f95210n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        g4 g4Var = u4Var.f95204h;
        u4.c(g4Var);
        return currentTimeMillis - g4Var.f94788w.a() > u4Var.f95203g.v(null, s.S);
    }
}
