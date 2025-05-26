package ae;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.fragment.app.w0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements he.h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15016a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15017b;

    public k(wc.j jVar) {
        this.f15016a = new HashMap();
        this.f15017b = jVar;
    }

    public final com.bumptech.glide.o a(Context context, com.bumptech.glide.b bVar, androidx.lifecycle.s sVar, w0 w0Var, boolean z13) {
        he.n.a();
        he.n.a();
        Object obj = this.f15016a;
        com.bumptech.glide.o oVar = (com.bumptech.glide.o) ((Map) obj).get(sVar);
        if (oVar != null) {
            return oVar;
        }
        h hVar = new h(sVar);
        wc.j jVar = (wc.j) this.f15017b;
        sp2.i iVar = new sp2.i(this, w0Var, 27);
        jVar.getClass();
        com.bumptech.glide.o oVar2 = new com.bumptech.glide.o(bVar, hVar, iVar, context);
        ((Map) obj).put(sVar, oVar2);
        hVar.h(new j(this, sVar));
        if (z13) {
            oVar2.x();
        }
        return oVar2;
    }

    @Override // he.h
    public final Object get() {
        return (ConnectivityManager) ((Context) this.f15016a).getSystemService("connectivity");
    }

    public k(s sVar, Context context) {
        this.f15017b = sVar;
        this.f15016a = context;
    }
}
