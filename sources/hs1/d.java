package hs1;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bumptech.glide.load.engine.GlideException;
import df.j1;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;
import nx.g0;

/* loaded from: classes2.dex */
public final class d implements de.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70032a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f70033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f70034c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f70035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f70036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f70037f;

    public d(a aVar, e eVar, m mVar, a aVar2, m mVar2) {
        this.f70034c = aVar;
        this.f70036e = eVar;
        this.f70033b = mVar;
        this.f70035d = aVar2;
        this.f70037f = mVar2;
    }

    @Override // de.g
    public final void a(GlideException glideException, ee.i target) {
        g0 g0Var;
        int i13 = this.f70032a;
        m mVar = this.f70033b;
        Object obj = this.f70034c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(target, "target");
                Intrinsics.g(glideException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
                ((a) obj).s(null);
                String str = ((e) this.f70036e).f70083a;
                if (str != null && (g0Var = mVar.f70063m) != null) {
                    Uri parse = Uri.parse(str);
                    Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                    k3.K1(g0Var.f92397a, glideException, parse);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(target, "target");
                Intrinsics.g(glideException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
                p pVar = (p) obj;
                if (pVar != null) {
                    pVar.a(false, null);
                }
                g0 g0Var2 = mVar.f70063m;
                if (g0Var2 != null) {
                    Uri parse2 = Uri.parse((String) this.f70035d);
                    Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
                    k3.K1(g0Var2.f92397a, glideException, parse2);
                    break;
                }
                break;
        }
    }

    public final boolean b(Bitmap resource, Object model, nd.a dataSource) {
        int i13 = this.f70032a;
        Object obj = this.f70037f;
        Object obj2 = this.f70036e;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(resource, "resource");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                ((a) this.f70035d).B0(resource, j1.e(dataSource));
                String str = ((e) obj2).f70083a;
                if (str != null) {
                    int i14 = m.f70058o;
                    ((m) obj).r(str);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(resource, "resource");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                p pVar = (p) obj2;
                if (pVar != null) {
                    pVar.a(true, j1.e(dataSource));
                }
                int i15 = m.f70058o;
                this.f70033b.r((String) obj);
                break;
        }
        return false;
    }

    @Override // de.g
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2, ee.i iVar, nd.a aVar, boolean z13) {
        switch (this.f70032a) {
            case 0:
                b((Bitmap) obj, obj2, aVar);
                break;
            default:
                b((Bitmap) obj, obj2, aVar);
                break;
        }
    }

    public d(p pVar, m mVar, String str, p pVar2, String str2) {
        this.f70034c = pVar;
        this.f70033b = mVar;
        this.f70035d = str;
        this.f70036e = pVar2;
        this.f70037f = str2;
    }
}
