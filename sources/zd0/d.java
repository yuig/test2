package zd0;

import com.pinterest.database.PinterestDatabase;
import ja.d0;
import xa0.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f141666a;

    /* renamed from: b, reason: collision with root package name */
    public final a f141667b;

    /* renamed from: c, reason: collision with root package name */
    public final j f141668c = new j(18);

    /* renamed from: d, reason: collision with root package name */
    public final b f141669d;

    /* renamed from: e, reason: collision with root package name */
    public final b f141670e;

    /* renamed from: f, reason: collision with root package name */
    public final b f141671f;

    public d(PinterestDatabase pinterestDatabase) {
        this.f141666a = pinterestDatabase;
        this.f141667b = new a(this, pinterestDatabase, 0);
        this.f141669d = new b(pinterestDatabase, 0);
        this.f141670e = new b(pinterestDatabase, 1);
        this.f141671f = new b(pinterestDatabase, 2);
    }
}
