package im2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final ym2.b f72761a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f72762b;

    /* renamed from: c, reason: collision with root package name */
    public final pm2.g f72763c;

    public q(ym2.b classId, pm2.g gVar, int i13) {
        gVar = (i13 & 4) != 0 ? null : gVar;
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f72761a = classId;
        this.f72762b = null;
        this.f72763c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f72761a, qVar.f72761a) && Intrinsics.d(this.f72762b, qVar.f72762b) && Intrinsics.d(this.f72763c, qVar.f72763c);
    }

    public final int hashCode() {
        int hashCode = this.f72761a.hashCode() * 31;
        byte[] bArr = this.f72762b;
        int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        pm2.g gVar = this.f72763c;
        return hashCode2 + (gVar != null ? ((gm2.q) gVar).f65786a.hashCode() : 0);
    }

    public final String toString() {
        return "Request(classId=" + this.f72761a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f72762b) + ", outerClass=" + this.f72763c + ')';
    }
}
