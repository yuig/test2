package hs1;

import android.graphics.Bitmap;
import ao2.j0;
import df.j1;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import nx.g0;

/* loaded from: classes2.dex */
public final class m extends r {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f70058o = 0;

    /* renamed from: i, reason: collision with root package name */
    public com.bumptech.glide.o f70059i;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.b f70060j;

    /* renamed from: k, reason: collision with root package name */
    public final Set f70061k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f70062l;

    /* renamed from: m, reason: collision with root package name */
    public g0 f70063m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f70064n;

    public m() {
        LinkedHashSet urlMemorySet = new LinkedHashSet();
        Intrinsics.checkNotNullParameter(urlMemorySet, "urlMemorySet");
        this.f70059i = null;
        this.f70060j = null;
        this.f70061k = urlMemorySet;
        this.f70064n = xk2.m.b(l.f70055j);
    }

    public final void h(a cacheableImage) {
        Intrinsics.checkNotNullParameter(cacheableImage, "cacheableImage");
        com.bumptech.glide.o oVar = this.f70059i;
        if (oVar != null) {
            oVar.e(cacheableImage);
        }
    }

    public final void i() {
        kotlin.jvm.internal.j.z((j0) this.f70064n.getValue(), null, null, new h(this, null), 3);
    }

    public final void j() {
        kotlin.jvm.internal.j.z((j0) this.f70064n.getValue(), null, null, new j(this, null), 3);
    }

    public final void k(String url, o callback, Integer num, Integer num2) {
        com.bumptech.glide.l c13;
        com.bumptech.glide.l K;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
        com.bumptech.glide.l lVar = null;
        if (!((url == null || url.length() <= 0 || Intrinsics.d("null", url)) ? false : true)) {
            ob0.a aVar = ob0.b.f93978b;
            if (aVar == null) {
                Intrinsics.r("crashReporter");
                throw null;
            }
            ((tb0.h) aVar).h(j1.U("GlideImageCache: Invalid ImageUrl", new Object[]{url}));
            callback.d();
            return;
        }
        com.bumptech.glide.o oVar = this.f70059i;
        if (oVar != null && (c13 = oVar.c()) != null && (K = c13.K(url)) != null) {
            lVar = (com.bumptech.glide.l) K.y(wd.m.f129185c, new wd.g());
        }
        if (num != null && num2 != null && lVar != null) {
        }
        if (lVar != null) {
            lVar.I(new k(callback, url, this, url, callback));
        }
        if (lVar != null) {
            lVar.L(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public final Bitmap l(Integer num, Integer num2, String url) {
        com.bumptech.glide.l c13;
        com.bumptech.glide.l K;
        Intrinsics.checkNotNullParameter(url, "url");
        if (!((url == null || url.length() <= 0 || Intrinsics.d("null", url)) ? false : true)) {
            ob0.a aVar = ob0.b.f93978b;
            if (aVar != null) {
                ((tb0.h) aVar).h(j1.U("GlideImageCache: Invalid ImageUrl", new Object[]{url}));
                return null;
            }
            Intrinsics.r("crashReporter");
            throw null;
        }
        try {
            com.bumptech.glide.o oVar = this.f70059i;
            com.bumptech.glide.l lVar = (oVar == null || (c13 = oVar.c()) == null || (K = c13.K(url)) == null) ? null : (com.bumptech.glide.l) K.y(wd.m.f129185c, new wd.g());
            de.f L = lVar != null ? lVar.L(num.intValue(), num2.intValue()) : null;
            if (L != null) {
                return (Bitmap) L.get();
            }
            return null;
        } catch (IOException | IllegalArgumentException | IllegalStateException | ExecutionException | Exception unused) {
            return null;
        }
    }

    public final boolean m(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.f70061k.contains(url);
    }

    public final e n(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String file2 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
        p(file2);
        return new e(this, this.f70059i, file);
    }

    public final z o(String str, boolean z13) {
        p(String.valueOf(str));
        return z13 ? new g(this, this.f70059i, str) : new e(this, this.f70059i, str);
    }

    public final void p(String str) {
        if (this.f70062l) {
            throw new RuntimeException(a.a.k("Loading ", str, " from network when throwExceptionOnNetworkAccess enabled."));
        }
    }

    public final void q(String url, Map map, p pVar) {
        com.bumptech.glide.l c13;
        com.bumptech.glide.l K;
        Intrinsics.checkNotNullParameter(url, "url");
        if (url == null || url.length() <= 0 || Intrinsics.d("null", url)) {
            return;
        }
        td.t c14 = j1.c(url, map);
        ge.d dVar = new ge.d(c14);
        de.h hVar = new de.h();
        de.a t13 = hVar.t(dVar);
        Intrinsics.checkNotNullExpressionValue(t13, "signature(...)");
        int h10 = qb0.b.h();
        ((de.h) ((de.h) t13).m(h10, h10)).b();
        com.bumptech.glide.o oVar = this.f70059i;
        com.bumptech.glide.l a13 = (oVar == null || (c13 = oVar.c()) == null || (K = c13.K(c14)) == null) ? null : K.a(hVar);
        if (this.f70073c) {
            r(url);
        } else if (a13 != null) {
            a13.I(new d(pVar, this, url, pVar, url));
        }
        if (a13 != null) {
            a13.L(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        if (url != null) {
            r.f70069g.add(url);
        }
    }

    public final void r(String str) {
        Set set = this.f70061k;
        int size = set.size();
        try {
            set.add(str);
        } catch (Exception e13) {
            ((tb0.h) ob0.b.a()).o("size of the memorySet [" + size + "] before crash, url [" + str + "]", e13);
        }
    }
}
