package ec;

import a.cb;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58337a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f58338b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58339c;

    /* renamed from: d, reason: collision with root package name */
    public final dc.a f58340d;

    /* renamed from: e, reason: collision with root package name */
    public final dc.a f58341e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f58342f;

    public r(String str, boolean z13, Path.FillType fillType, dc.a aVar, dc.a aVar2, boolean z14) {
        this.f58339c = str;
        this.f58337a = z13;
        this.f58338b = fillType;
        this.f58340d = aVar;
        this.f58341e = aVar2;
        this.f58342f = z14;
    }

    @Override // ec.b
    public final yb.c a(com.airbnb.lottie.v vVar, com.airbnb.lottie.h hVar, fc.c cVar) {
        return new yb.g(vVar, cVar, this);
    }

    public final String toString() {
        return cb.m(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f58337a, '}');
    }
}
