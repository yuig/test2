package xm2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f135399a;

    /* renamed from: b, reason: collision with root package name */
    public final String f135400b;

    public d(String name, String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.f135399a = name;
        this.f135400b = desc;
    }

    @Override // xm2.f
    public final String a() {
        return this.f135399a + ':' + this.f135400b;
    }

    @Override // xm2.f
    public final String b() {
        return this.f135400b;
    }

    @Override // xm2.f
    public final String c() {
        return this.f135399a;
    }

    public final String d() {
        return this.f135399a;
    }

    public final String e() {
        return this.f135400b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f135399a, dVar.f135399a) && Intrinsics.d(this.f135400b, dVar.f135400b);
    }

    public final int hashCode() {
        return this.f135400b.hashCode() + (this.f135399a.hashCode() * 31);
    }
}
