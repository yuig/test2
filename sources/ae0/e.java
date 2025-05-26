package ae0;

import com.pinterest.database.PinterestDatabase;
import ja.d0;
import xa0.j;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f15044a;

    /* renamed from: b, reason: collision with root package name */
    public final zd0.a f15045b;

    /* renamed from: c, reason: collision with root package name */
    public final j f15046c = new j(19);

    /* renamed from: d, reason: collision with root package name */
    public final b f15047d;

    /* renamed from: e, reason: collision with root package name */
    public final zd0.b f15048e;

    public e(PinterestDatabase pinterestDatabase) {
        this.f15044a = pinterestDatabase;
        this.f15045b = new zd0.a(this, pinterestDatabase, 1);
        this.f15047d = new b(this, pinterestDatabase, 0);
        this.f15048e = new zd0.b(pinterestDatabase, 3);
    }
}
