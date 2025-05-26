package ln2;

import am2.w0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final vm2.f f84084a;

    /* renamed from: b, reason: collision with root package name */
    public final tm2.k f84085b;

    /* renamed from: c, reason: collision with root package name */
    public final vm2.a f84086c;

    /* renamed from: d, reason: collision with root package name */
    public final w0 f84087d;

    public h(vm2.f nameResolver, tm2.k classProto, vm2.a metadataVersion, w0 sourceElement) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f84084a = nameResolver;
        this.f84085b = classProto;
        this.f84086c = metadataVersion;
        this.f84087d = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f84084a, hVar.f84084a) && Intrinsics.d(this.f84085b, hVar.f84085b) && Intrinsics.d(this.f84086c, hVar.f84086c) && Intrinsics.d(this.f84087d, hVar.f84087d);
    }

    public final int hashCode() {
        return this.f84087d.hashCode() + ((this.f84086c.hashCode() + ((this.f84085b.hashCode() + (this.f84084a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f84084a + ", classProto=" + this.f84085b + ", metadataVersion=" + this.f84086c + ", sourceElement=" + this.f84087d + ')';
    }
}
