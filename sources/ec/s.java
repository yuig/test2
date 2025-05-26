package ec;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f58343a;

    /* renamed from: b, reason: collision with root package name */
    public final List f58344b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58345c;

    public s(String str, List list, boolean z13) {
        this.f58343a = str;
        this.f58344b = list;
        this.f58345c = z13;
    }

    @Override // ec.b
    public final yb.c a(com.airbnb.lottie.v vVar, com.airbnb.lottie.h hVar, fc.c cVar) {
        return new yb.d(vVar, cVar, this, hVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f58343a + "' Shapes: " + Arrays.toString(this.f58344b.toArray()) + '}';
    }
}
