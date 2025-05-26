package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends ag2.e {

    /* renamed from: c, reason: collision with root package name */
    public final eh0.a f108038c;

    /* renamed from: d, reason: collision with root package name */
    public final String f108039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(eh0.a completeButton, String image) {
        super(null, null);
        Intrinsics.checkNotNullParameter(completeButton, "completeButton");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f108038c = completeButton;
        this.f108039d = image;
    }

    public static final j0 c(vd0.c json) {
        String d2;
        vd0.c json2;
        Intrinsics.checkNotNullParameter(json, "json");
        String d13 = json.d("title");
        String d14 = json.d("body");
        vd0.c m13 = json.m("image");
        if (m13 == null || (d2 = m13.d("url")) == null || (json2 = json.m("complete_button")) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(json2, "json");
        String d15 = json2.d("text");
        eh0.a aVar = d15 == null ? null : new eh0.a(d15, json2.d("url"));
        if (aVar == null) {
            return null;
        }
        j0 j0Var = new j0(aVar, d2);
        j0Var.f15163a = d13;
        j0Var.f15164b = d14;
        return j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.f108038c, j0Var.f108038c) && Intrinsics.d(this.f108039d, j0Var.f108039d);
    }

    public final int hashCode() {
        return this.f108039d.hashCode() + (this.f108038c.hashCode() * 31);
    }

    public final String toString() {
        return "SchoolTeenPromptDisplayData(completeButton=" + this.f108038c + ", image=" + this.f108039d + ")";
    }
}
