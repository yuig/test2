package sw0;

import a.cb;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f115569a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115570b;

    /* renamed from: c, reason: collision with root package name */
    public String f115571c;

    /* renamed from: d, reason: collision with root package name */
    public long f115572d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f115573e;

    public s(String dirPath, String displayName, String lastUpdatedPath, long j13, ArrayList mediaPaths) {
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(lastUpdatedPath, "lastUpdatedPath");
        Intrinsics.checkNotNullParameter(mediaPaths, "mediaPaths");
        this.f115569a = dirPath;
        this.f115570b = displayName;
        this.f115571c = lastUpdatedPath;
        this.f115572d = j13;
        this.f115573e = mediaPaths;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f115569a, sVar.f115569a) && Intrinsics.d(this.f115570b, sVar.f115570b) && Intrinsics.d(this.f115571c, sVar.f115571c) && this.f115572d == sVar.f115572d && Intrinsics.d(this.f115573e, sVar.f115573e);
    }

    public final int hashCode() {
        return this.f115573e.hashCode() + a.a.c(this.f115572d, cb.d(this.f115571c, cb.d(this.f115570b, this.f115569a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = this.f115571c;
        long j13 = this.f115572d;
        StringBuilder sb3 = new StringBuilder("Directory(dirPath=");
        sb3.append(this.f115569a);
        sb3.append(", displayName=");
        a.a.B(sb3, this.f115570b, ", lastUpdatedPath=", str, ", lastUpdatedTimestamp=");
        sb3.append(j13);
        sb3.append(", mediaPaths=");
        sb3.append(this.f115573e);
        sb3.append(")");
        return sb3.toString();
    }
}
