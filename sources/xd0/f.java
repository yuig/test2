package xd0;

import com.pinterest.database.PinterestDatabase;
import ja.d0;
import tb.x;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f134608a;

    /* renamed from: b, reason: collision with root package name */
    public final tb.b f134609b;

    /* renamed from: c, reason: collision with root package name */
    public h f134610c;

    /* renamed from: d, reason: collision with root package name */
    public final x f134611d;

    /* renamed from: e, reason: collision with root package name */
    public final d f134612e;

    /* renamed from: f, reason: collision with root package name */
    public final d f134613f;

    /* renamed from: g, reason: collision with root package name */
    public final d f134614g;

    /* renamed from: h, reason: collision with root package name */
    public final d f134615h;

    /* renamed from: i, reason: collision with root package name */
    public final d f134616i;

    public f(PinterestDatabase pinterestDatabase) {
        this.f134608a = pinterestDatabase;
        this.f134609b = new tb.b(this, pinterestDatabase, 7);
        this.f134611d = new x(this, pinterestDatabase, 1);
        this.f134612e = new d(pinterestDatabase, 0);
        this.f134613f = new d(pinterestDatabase, 1);
        this.f134614g = new d(pinterestDatabase, 2);
        this.f134615h = new d(pinterestDatabase, 3);
        this.f134616i = new d(pinterestDatabase, 4);
    }

    public static h a(f fVar) {
        h hVar;
        synchronized (fVar) {
            try {
                if (fVar.f134610c == null) {
                    fVar.f134610c = (h) fVar.f134608a.l(h.class);
                }
                hVar = fVar.f134610c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return hVar;
    }
}
