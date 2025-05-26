package zd1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends h {

    /* renamed from: a, reason: collision with root package name */
    public final t32.f f141766a;

    /* renamed from: b, reason: collision with root package name */
    public final q f141767b;

    /* renamed from: c, reason: collision with root package name */
    public final String f141768c;

    /* renamed from: d, reason: collision with root package name */
    public final int f141769d;

    /* renamed from: e, reason: collision with root package name */
    public final String f141770e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f141771f;

    /* renamed from: g, reason: collision with root package name */
    public final String f141772g;

    public v(t32.f fVar, q filterType, String label, int i13, String str, boolean z13, String filterId) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        this.f141766a = fVar;
        this.f141767b = filterType;
        this.f141768c = label;
        this.f141769d = i13;
        this.f141770e = str;
        this.f141771f = z13;
        this.f141772g = filterId;
    }

    @Override // zd1.h
    public final h a() {
        boolean z13 = this.f141771f;
        q filterType = this.f141767b;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        String label = this.f141768c;
        Intrinsics.checkNotNullParameter(label, "label");
        String filterId = this.f141772g;
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        return new v(this.f141766a, filterType, label, this.f141769d, this.f141770e, z13, filterId);
    }

    @Override // zd1.h
    public final q b() {
        return this.f141767b;
    }

    @Override // zd1.h
    public final t32.f c() {
        return this.f141766a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f141766a == vVar.f141766a && this.f141767b == vVar.f141767b && Intrinsics.d(this.f141768c, vVar.f141768c) && this.f141769d == vVar.f141769d && Intrinsics.d(this.f141770e, vVar.f141770e) && this.f141771f == vVar.f141771f && Intrinsics.d(this.f141772g, vVar.f141772g);
    }

    public final int hashCode() {
        t32.f fVar = this.f141766a;
        int b13 = ep.b.b(this.f141769d, cb.d(this.f141768c, (this.f141767b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31)) * 31, 31), 31);
        String str = this.f141770e;
        return this.f141772g.hashCode() + ep.b.e(this.f141771f, (b13 + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        boolean z13 = this.f141771f;
        StringBuilder sb3 = new StringBuilder("StandardListFilter(thriftProductFilterType=");
        sb3.append(this.f141766a);
        sb3.append(", filterType=");
        sb3.append(this.f141767b);
        sb3.append(", label=");
        sb3.append(this.f141768c);
        sb3.append(", index=");
        sb3.append(this.f141769d);
        sb3.append(", imageUrl=");
        sb3.append(this.f141770e);
        sb3.append(", isSelected=");
        sb3.append(z13);
        sb3.append(", filterId=");
        return a.a.p(sb3, this.f141772g, ")");
    }
}
