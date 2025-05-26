package jr0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f77539a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77540b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77541c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77542d;

    /* renamed from: e, reason: collision with root package name */
    public final a f77543e;

    /* renamed from: f, reason: collision with root package name */
    public final a f77544f;

    public b(String str, String title, String description, int i13, a primaryButtonState, a aVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonState, "primaryButtonState");
        this.f77539a = str;
        this.f77540b = title;
        this.f77541c = description;
        this.f77542d = i13;
        this.f77543e = primaryButtonState;
        this.f77544f = aVar;
    }

    public final int a() {
        return this.f77542d;
    }

    public final String b() {
        return this.f77539a;
    }

    public final a c() {
        return this.f77544f;
    }

    public final String d() {
        return this.f77540b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f77539a, bVar.f77539a) && Intrinsics.d(this.f77540b, bVar.f77540b) && Intrinsics.d(this.f77541c, bVar.f77541c) && this.f77542d == bVar.f77542d && Intrinsics.d(this.f77543e, bVar.f77543e) && Intrinsics.d(this.f77544f, bVar.f77544f);
    }

    public final int hashCode() {
        String str = this.f77539a;
        int hashCode = (this.f77543e.hashCode() + ep.b.b(this.f77542d, cb.d(this.f77541c, cb.d(this.f77540b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31)) * 31;
        a aVar = this.f77544f;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CreatorHubModalState(displayImageUrl=" + this.f77539a + ", title=" + this.f77540b + ", description=" + this.f77541c + ", backgroundColor=" + this.f77542d + ", primaryButtonState=" + this.f77543e + ", secondaryButtonState=" + this.f77544f + ")";
    }
}
