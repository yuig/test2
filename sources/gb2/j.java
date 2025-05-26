package gb2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public final String f64756a;

    /* renamed from: b, reason: collision with root package name */
    public final String f64757b;

    public j(String uid, String imageSignature) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(imageSignature, "imageSignature");
        this.f64756a = uid;
        this.f64757b = imageSignature;
    }

    @Override // gb2.l
    public final String a() {
        return this.f64756a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f64756a, jVar.f64756a) && Intrinsics.d(this.f64757b, jVar.f64757b);
    }

    public final int hashCode() {
        return this.f64757b.hashCode() + (this.f64756a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinOneTapSaveStateUpdate(uid=");
        sb3.append(this.f64756a);
        sb3.append(", imageSignature=");
        return a.a.p(sb3, this.f64757b, ")");
    }

    public /* synthetic */ j(String str) {
        this(str, "");
    }
}
