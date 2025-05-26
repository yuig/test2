package bg;

import java.util.LinkedList;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final a[] f22766d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f22767e = Logger.getLogger(g.class.getSimpleName());

    /* renamed from: f, reason: collision with root package name */
    public static final e f22768f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f22769a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final f f22770b = new f(this);

    /* renamed from: c, reason: collision with root package name */
    public final d f22771c;

    public g(d dVar) {
        this.f22771c = dVar;
    }

    public final cg.c a(l lVar) {
        a[] aVarArr = (a[]) this.f22769a.toArray(f22766d);
        cg.c cVar = new cg.c(lVar, this.f22771c, null, lVar.f22777c, null);
        cVar.f27677k = false;
        cVar.f27678l = false;
        cVar.f27676j = aVarArr;
        return cVar;
    }
}
