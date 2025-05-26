package u80;

import b3.w;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import u50.i0;
import u50.k0;
import xk2.d0;
import xk2.e0;

/* loaded from: classes5.dex */
public final class j implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f120947a;

    /* renamed from: b, reason: collision with root package name */
    public final vn1.c f120948b;

    /* renamed from: c, reason: collision with root package name */
    public final vn1.c f120949c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f120950d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f120951e;

    /* renamed from: f, reason: collision with root package name */
    public final long f120952f;

    /* renamed from: g, reason: collision with root package name */
    public final g f120953g;

    /* renamed from: h, reason: collision with root package name */
    public final int f120954h;

    /* renamed from: i, reason: collision with root package name */
    public final n4.e f120955i;

    /* renamed from: j, reason: collision with root package name */
    public final float f120956j;

    /* renamed from: k, reason: collision with root package name */
    public final i0 f120957k;

    public j(i0 title, vn1.c textColor, vn1.c cVar, Integer num, Integer num2, long j13, g previewStack, int i13, n4.e eVar, float f13, i0 i0Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(previewStack, "previewStack");
        this.f120947a = title;
        this.f120948b = textColor;
        this.f120949c = cVar;
        this.f120950d = num;
        this.f120951e = num2;
        this.f120952f = j13;
        this.f120953g = previewStack;
        this.f120954h = i13;
        this.f120955i = eVar;
        this.f120956j = f13;
        this.f120957k = i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [u50.i0] */
    public static j e(j jVar, g gVar, k0 k0Var, int i13) {
        i0 title = jVar.f120947a;
        vn1.c textColor = jVar.f120948b;
        vn1.c cVar = jVar.f120949c;
        Integer num = jVar.f120950d;
        Integer num2 = jVar.f120951e;
        long j13 = jVar.f120952f;
        g previewStack = (i13 & 64) != 0 ? jVar.f120953g : gVar;
        int i14 = jVar.f120954h;
        n4.e eVar = jVar.f120955i;
        float f13 = jVar.f120956j;
        k0 k0Var2 = (i13 & 1024) != 0 ? jVar.f120957k : k0Var;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(previewStack, "previewStack");
        return new j(title, textColor, cVar, num, num2, j13, previewStack, i14, eVar, f13, k0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f120947a, jVar.f120947a) && this.f120948b == jVar.f120948b && this.f120949c == jVar.f120949c && Intrinsics.d(this.f120950d, jVar.f120950d) && Intrinsics.d(this.f120951e, jVar.f120951e) && w.c(this.f120952f, jVar.f120952f) && Intrinsics.d(this.f120953g, jVar.f120953g) && this.f120954h == jVar.f120954h && Intrinsics.d(this.f120955i, jVar.f120955i) && Float.compare(this.f120956j, jVar.f120956j) == 0 && Intrinsics.d(this.f120957k, jVar.f120957k);
    }

    public final int hashCode() {
        int hashCode = (this.f120948b.hashCode() + (this.f120947a.hashCode() * 31)) * 31;
        vn1.c cVar = this.f120949c;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.f120950d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f120951e;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        int i13 = w.f21391o;
        d0 d0Var = e0.f135207b;
        int b13 = ep.b.b(this.f120954h, (this.f120953g.hashCode() + a.a.c(this.f120952f, hashCode4, 31)) * 31, 31);
        n4.e eVar = this.f120955i;
        int a13 = a.a.a(this.f120956j, (b13 + (eVar == null ? 0 : Float.hashCode(eVar.f89175a))) * 31, 31);
        i0 i0Var = this.f120957k;
        return a13 + (i0Var != null ? i0Var.hashCode() : 0);
    }

    public final String toString() {
        String i13 = w.i(this.f120952f);
        StringBuilder sb3 = new StringBuilder("CarouselCardState(title=");
        sb3.append(this.f120947a);
        sb3.append(", textColor=");
        sb3.append(this.f120948b);
        sb3.append(", darkModeTextColor=");
        sb3.append(this.f120949c);
        sb3.append(", backgroundImageResId=");
        sb3.append(this.f120950d);
        sb3.append(", backgroundColorResId=");
        sb3.append(this.f120951e);
        sb3.append(", backgroundColor=");
        sb3.append(i13);
        sb3.append(", previewStack=");
        sb3.append(this.f120953g);
        sb3.append(", id=");
        sb3.append(this.f120954h);
        sb3.append(", textMarginTop=");
        sb3.append(this.f120955i);
        sb3.append(", cardWidthFactor=");
        sb3.append(this.f120956j);
        sb3.append(", ctaLabel=");
        return jq.b.k(sb3, this.f120957k, ")");
    }

    public /* synthetic */ j(k0 k0Var, vn1.c cVar, vn1.c cVar2, Integer num, Integer num2, long j13, g gVar, int i13, n4.e eVar, float f13, k0 k0Var2, int i14) {
        this(k0Var, (i14 & 2) != 0 ? vn1.c.DARK : cVar, (i14 & 4) != 0 ? null : cVar2, num, (i14 & 16) != 0 ? null : num2, j13, gVar, i13, (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : eVar, (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? 0.4f : f13, (i14 & 1024) != 0 ? null : k0Var2);
    }
}
