package ec;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f58352a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.b f58353b;

    /* renamed from: c, reason: collision with root package name */
    public final List f58354c;

    /* renamed from: d, reason: collision with root package name */
    public final dc.a f58355d;

    /* renamed from: e, reason: collision with root package name */
    public final dc.a f58356e;

    /* renamed from: f, reason: collision with root package name */
    public final dc.b f58357f;

    /* renamed from: g, reason: collision with root package name */
    public final v f58358g;

    /* renamed from: h, reason: collision with root package name */
    public final w f58359h;

    /* renamed from: i, reason: collision with root package name */
    public final float f58360i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f58361j;

    public x(String str, dc.b bVar, ArrayList arrayList, dc.a aVar, dc.a aVar2, dc.b bVar2, v vVar, w wVar, float f13, boolean z13) {
        this.f58352a = str;
        this.f58353b = bVar;
        this.f58354c = arrayList;
        this.f58355d = aVar;
        this.f58356e = aVar2;
        this.f58357f = bVar2;
        this.f58358g = vVar;
        this.f58359h = wVar;
        this.f58360i = f13;
        this.f58361j = z13;
    }

    @Override // ec.b
    public final yb.c a(com.airbnb.lottie.v vVar, com.airbnb.lottie.h hVar, fc.c cVar) {
        return new yb.v(vVar, cVar, this);
    }
}
