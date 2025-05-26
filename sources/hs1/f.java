package hs1;

import android.net.Uri;
import com.bumptech.glide.load.engine.GlideException;
import df.j1;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import nx.g0;

/* loaded from: classes4.dex */
public final class f implements de.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f70040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f70041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f70042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f70043d;

    public f(a aVar, g gVar, m mVar, a aVar2) {
        this.f70040a = aVar;
        this.f70041b = gVar;
        this.f70042c = mVar;
        this.f70043d = aVar2;
    }

    @Override // de.g
    public final void a(GlideException glideException, ee.i target) {
        g0 g0Var;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.g(glideException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        this.f70040a.s(null);
        String str = this.f70041b.f70083a;
        if (str == null || (g0Var = this.f70042c.f70063m) == null) {
            return;
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        k3.K1(g0Var.f92397a, glideException, parse);
    }

    @Override // de.g
    public final void c(Object obj, Object model, ee.i iVar, nd.a dataSource, boolean z13) {
        yd.c resource = (yd.c) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f70043d.s1(j1.e(dataSource));
    }
}
