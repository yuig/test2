package u62;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import r72.i1;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final u f120828a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120829b;

    /* renamed from: c, reason: collision with root package name */
    public final bp1.h f120830c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f120831d;

    /* renamed from: e, reason: collision with root package name */
    public final String f120832e;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f120833f;

    /* renamed from: g, reason: collision with root package name */
    public final List f120834g;

    public c(u maskData, String imageAspectRatio, bp1.h state, boolean z13) {
        Intrinsics.checkNotNullParameter(maskData, "maskData");
        Intrinsics.checkNotNullParameter(imageAspectRatio, "imageAspectRatio");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f120828a = maskData;
        this.f120829b = imageAspectRatio;
        this.f120830c = state;
        this.f120831d = z13;
        this.f120832e = maskData.f120898a;
        this.f120833f = maskData.f120899b;
        this.f120834g = maskData.f120900c;
    }

    public static c a(c cVar, u maskData, String imageAspectRatio, bp1.h state, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            maskData = cVar.f120828a;
        }
        if ((i13 & 2) != 0) {
            imageAspectRatio = cVar.f120829b;
        }
        if ((i13 & 4) != 0) {
            state = cVar.f120830c;
        }
        if ((i13 & 8) != 0) {
            z13 = cVar.f120831d;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(maskData, "maskData");
        Intrinsics.checkNotNullParameter(imageAspectRatio, "imageAspectRatio");
        Intrinsics.checkNotNullParameter(state, "state");
        return new c(maskData, imageAspectRatio, state, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f120828a, cVar.f120828a) && Intrinsics.d(this.f120829b, cVar.f120829b) && Intrinsics.d(this.f120830c, cVar.f120830c) && this.f120831d == cVar.f120831d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120831d) + ((this.f120830c.hashCode() + cb.d(this.f120829b, this.f120828a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "CutoutEditorModel(maskData=" + this.f120828a + ", imageAspectRatio=" + this.f120829b + ", state=" + this.f120830c + ", imageFailedToLoad=" + this.f120831d + ")";
    }
}
