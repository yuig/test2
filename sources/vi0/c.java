package vi0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tb.f;
import u50.i;
import z32.n1;

/* loaded from: classes5.dex */
public final class c extends f {

    /* renamed from: h */
    public final String f125870h;

    /* renamed from: i */
    public final List f125871i;

    /* renamed from: j */
    public final i f125872j;

    /* renamed from: k */
    public final n1 f125873k;

    public c(String titleText, List imageUrls, i dominantColor, n1 n1Var) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Intrinsics.checkNotNullParameter(dominantColor, "dominantColor");
        this.f125870h = titleText;
        this.f125871i = imageUrls;
        this.f125872j = dominantColor;
        this.f125873k = n1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f125870h, cVar.f125870h) && Intrinsics.d(this.f125871i, cVar.f125871i) && Intrinsics.d(this.f125872j, cVar.f125872j) && this.f125873k == cVar.f125873k;
    }

    public final int hashCode() {
        int hashCode = (this.f125872j.hashCode() + ep.b.c(this.f125871i, this.f125870h.hashCode() * 31, 31)) * 31;
        n1 n1Var = this.f125873k;
        return hashCode + (n1Var == null ? 0 : n1Var.hashCode());
    }

    public final String toString() {
        return "ArticleViewModel(titleText=" + this.f125870h + ", imageUrls=" + this.f125871i + ", dominantColor=" + this.f125872j + ", storyIcon=" + this.f125873k + ")";
    }
}
