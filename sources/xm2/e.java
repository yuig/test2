package xm2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f135401a;

    /* renamed from: b, reason: collision with root package name */
    public final String f135402b;

    public e(String name, String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.f135401a = name;
        this.f135402b = desc;
    }

    public static e d(e eVar, String desc) {
        String name = eVar.f135401a;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new e(name, desc);
    }

    @Override // xm2.f
    public final String a() {
        return this.f135401a + this.f135402b;
    }

    @Override // xm2.f
    public final String b() {
        return this.f135402b;
    }

    @Override // xm2.f
    public final String c() {
        return this.f135401a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f135401a, eVar.f135401a) && Intrinsics.d(this.f135402b, eVar.f135402b);
    }

    public final int hashCode() {
        return this.f135402b.hashCode() + (this.f135401a.hashCode() * 31);
    }
}
