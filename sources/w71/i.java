package w71;

import com.pinterest.feature.search.visual.collage.database.CollageDatabase;
import ja.d0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f128188a;

    /* renamed from: b, reason: collision with root package name */
    public final zd0.a f128189b;

    /* renamed from: c, reason: collision with root package name */
    public v71.c f128190c;

    /* renamed from: d, reason: collision with root package name */
    public final ae0.b f128191d;

    public i(CollageDatabase collageDatabase) {
        this.f128188a = collageDatabase;
        this.f128189b = new zd0.a(this, collageDatabase, 4);
        this.f128191d = new ae0.b(this, collageDatabase, 3);
    }

    public static v71.c a(i iVar) {
        v71.c cVar;
        synchronized (iVar) {
            try {
                if (iVar.f128190c == null) {
                    iVar.f128190c = (v71.c) iVar.f128188a.l(v71.c.class);
                }
                cVar = iVar.f128190c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cVar;
    }
}
