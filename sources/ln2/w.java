package ln2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f84140a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f84141b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f84142c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f84143d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84144e;

    /* renamed from: f, reason: collision with root package name */
    public final ym2.b f84145f;

    public w(xm2.g gVar, xm2.g gVar2, xm2.g gVar3, xm2.g gVar4, String filePath, ym2.b classId) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.f84140a = gVar;
        this.f84141b = gVar2;
        this.f84142c = gVar3;
        this.f84143d = gVar4;
        this.f84144e = filePath;
        this.f84145f = classId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f84140a, wVar.f84140a) && Intrinsics.d(this.f84141b, wVar.f84141b) && Intrinsics.d(this.f84142c, wVar.f84142c) && Intrinsics.d(this.f84143d, wVar.f84143d) && Intrinsics.d(this.f84144e, wVar.f84144e) && Intrinsics.d(this.f84145f, wVar.f84145f);
    }

    public final int hashCode() {
        Object obj = this.f84140a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f84141b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f84142c;
        int hashCode3 = (hashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f84143d;
        return this.f84145f.hashCode() + cb.d(this.f84144e, (hashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f84140a + ", compilerVersion=" + this.f84141b + ", languageVersion=" + this.f84142c + ", expectedVersion=" + this.f84143d + ", filePath=" + this.f84144e + ", classId=" + this.f84145f + ')';
    }
}
