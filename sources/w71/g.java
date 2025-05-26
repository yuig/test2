package w71;

import com.pinterest.feature.search.visual.collage.database.CollageDatabase;
import ja.d0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f128179a;

    /* renamed from: b, reason: collision with root package name */
    public final e f128180b;

    /* renamed from: c, reason: collision with root package name */
    public v71.c f128181c;

    /* renamed from: d, reason: collision with root package name */
    public final e f128182d;

    /* renamed from: e, reason: collision with root package name */
    public final ae0.b f128183e;

    /* renamed from: f, reason: collision with root package name */
    public final zd0.b f128184f;

    public g(CollageDatabase collageDatabase) {
        this.f128179a = collageDatabase;
        this.f128180b = new e(this, collageDatabase, 0);
        this.f128182d = new e(this, collageDatabase, 1);
        this.f128183e = new ae0.b(this, collageDatabase, 2);
        this.f128184f = new zd0.b(collageDatabase, 8);
    }

    public static v71.c a(g gVar) {
        v71.c cVar;
        synchronized (gVar) {
            try {
                if (gVar.f128181c == null) {
                    gVar.f128181c = (v71.c) gVar.f128179a.l(v71.c.class);
                }
                cVar = gVar.f128181c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cVar;
    }
}
