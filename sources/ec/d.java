package ec;

import android.graphics.Path;

/* loaded from: classes3.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final f f58288a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f58289b;

    /* renamed from: c, reason: collision with root package name */
    public final dc.c f58290c;

    /* renamed from: d, reason: collision with root package name */
    public final dc.a f58291d;

    /* renamed from: e, reason: collision with root package name */
    public final dc.a f58292e;

    /* renamed from: f, reason: collision with root package name */
    public final dc.a f58293f;

    /* renamed from: g, reason: collision with root package name */
    public final String f58294g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f58295h;

    public d(String str, f fVar, Path.FillType fillType, dc.c cVar, dc.a aVar, dc.a aVar2, dc.a aVar3, boolean z13) {
        this.f58288a = fVar;
        this.f58289b = fillType;
        this.f58290c = cVar;
        this.f58291d = aVar;
        this.f58292e = aVar2;
        this.f58293f = aVar3;
        this.f58294g = str;
        this.f58295h = z13;
    }

    @Override // ec.b
    public final yb.c a(com.airbnb.lottie.v vVar, com.airbnb.lottie.h hVar, fc.c cVar) {
        return new yb.h(vVar, hVar, cVar, this);
    }
}
