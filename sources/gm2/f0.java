package gm2;

import java.lang.annotation.Annotation;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f0 extends u implements pm2.d {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f65768a;

    /* renamed from: b, reason: collision with root package name */
    public final Annotation[] f65769b;

    /* renamed from: c, reason: collision with root package name */
    public final String f65770c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65771d;

    public f0(d0 type, Annotation[] reflectAnnotations, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reflectAnnotations, "reflectAnnotations");
        this.f65768a = type;
        this.f65769b = reflectAnnotations;
        this.f65770c = str;
        this.f65771d = z13;
    }

    @Override // pm2.d
    public final pm2.a a(ym2.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return bs1.c.j0(this.f65769b, fqName);
    }

    @Override // pm2.d
    public final Collection getAnnotations() {
        return bs1.c.n0(this.f65769b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f0.class.getName());
        sb3.append(": ");
        sb3.append(this.f65771d ? "vararg " : "");
        String str = this.f65770c;
        sb3.append(str != null ? ym2.g.d(str) : null);
        sb3.append(": ");
        sb3.append(this.f65768a);
        return sb3.toString();
    }
}
