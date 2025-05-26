package ca0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27154a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f27155b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27156c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27157d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27158e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27159f;

    /* renamed from: g, reason: collision with root package name */
    public final c f27160g;

    public r0(String id3, j1 image, String title, String description, String altText, boolean z13, c cVar) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(altText, "altText");
        this.f27154a = id3;
        this.f27155b = image;
        this.f27156c = title;
        this.f27157d = description;
        this.f27158e = altText;
        this.f27159f = z13;
        this.f27160g = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.f27154a, r0Var.f27154a) && Intrinsics.d(this.f27155b, r0Var.f27155b) && Intrinsics.d(this.f27156c, r0Var.f27156c) && Intrinsics.d(this.f27157d, r0Var.f27157d) && Intrinsics.d(this.f27158e, r0Var.f27158e) && this.f27159f == r0Var.f27159f && Intrinsics.d(this.f27160g, r0Var.f27160g);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f27159f, cb.d(this.f27158e, cb.d(this.f27157d, cb.d(this.f27156c, (this.f27155b.hashCode() + (this.f27154a.hashCode() * 31)) * 31, 31), 31), 31), 31);
        c cVar = this.f27160g;
        return e13 + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "Publish(id=" + this.f27154a + ", image=" + this.f27155b + ", title=" + this.f27156c + ", description=" + this.f27157d + ", altText=" + this.f27158e + ", isRemixable=" + this.f27159f + ", selectedBoard=" + this.f27160g + ")";
    }
}
