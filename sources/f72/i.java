package f72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* renamed from: a, reason: collision with root package name */
    public final f f61269a;

    /* renamed from: b, reason: collision with root package name */
    public final f f61270b;

    /* renamed from: c, reason: collision with root package name */
    public final f f61271c;

    /* renamed from: d, reason: collision with root package name */
    public final f f61272d;

    /* renamed from: e, reason: collision with root package name */
    public final f f61273e;

    public i(int i13, f fVar, f fVar2, f fVar3, f fVar4, f fVar5) {
        if ((i13 & 1) == 0) {
            this.f61269a = null;
        } else {
            this.f61269a = fVar;
        }
        if ((i13 & 2) == 0) {
            this.f61270b = null;
        } else {
            this.f61270b = fVar2;
        }
        if ((i13 & 4) == 0) {
            this.f61271c = null;
        } else {
            this.f61271c = fVar3;
        }
        if ((i13 & 8) == 0) {
            this.f61272d = null;
        } else {
            this.f61272d = fVar4;
        }
        if ((i13 & 16) == 0) {
            this.f61273e = null;
        } else {
            this.f61273e = fVar5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f61269a, iVar.f61269a) && Intrinsics.d(this.f61270b, iVar.f61270b) && Intrinsics.d(this.f61271c, iVar.f61271c) && Intrinsics.d(this.f61272d, iVar.f61272d) && Intrinsics.d(this.f61273e, iVar.f61273e);
    }

    public final int hashCode() {
        f fVar = this.f61269a;
        int hashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        f fVar2 = this.f61270b;
        int hashCode2 = (hashCode + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        f fVar3 = this.f61271c;
        int hashCode3 = (hashCode2 + (fVar3 == null ? 0 : fVar3.hashCode())) * 31;
        f fVar4 = this.f61272d;
        int hashCode4 = (hashCode3 + (fVar4 == null ? 0 : fVar4.hashCode())) * 31;
        f fVar5 = this.f61273e;
        return hashCode4 + (fVar5 != null ? fVar5.hashCode() : 0);
    }

    public final String toString() {
        return "ImageEntity(oldLarge=" + this.f61269a + ", large=" + this.f61270b + ", medium=" + this.f61271c + ", small=" + this.f61272d + ", original=" + this.f61273e + ")";
    }
}
