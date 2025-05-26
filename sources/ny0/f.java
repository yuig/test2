package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements u50.o {

    /* renamed from: g, reason: collision with root package name */
    public static final vo.i f92581g = new vo.i(6, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final yl1.b f92582h = new yl1.b(bs1.c.j2(new String[0], m60.x0.next), false, null, null, yl1.d.PRIMARY.getColorPalette(), yl1.c.LARGE, null, null, 0, null, 972);

    /* renamed from: a, reason: collision with root package name */
    public final o82.a0 f92583a;

    /* renamed from: b, reason: collision with root package name */
    public final yl1.b f92584b;

    /* renamed from: c, reason: collision with root package name */
    public final bb2.e f92585c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.a0 f92586d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.b f92587e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f92588f;

    public f(o82.a0 multiSectionDisplayState, yl1.b cta, bb2.e eVar, zy.a0 pinalyticsDisplayState, zy.b impressionDisplayState, Integer num) {
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        this.f92583a = multiSectionDisplayState;
        this.f92584b = cta;
        this.f92585c = eVar;
        this.f92586d = pinalyticsDisplayState;
        this.f92587e = impressionDisplayState;
        this.f92588f = num;
    }

    public static f e(f fVar, o82.a0 a0Var, yl1.b bVar, bb2.e eVar, zy.a0 a0Var2, Integer num, int i13) {
        if ((i13 & 1) != 0) {
            a0Var = fVar.f92583a;
        }
        o82.a0 multiSectionDisplayState = a0Var;
        if ((i13 & 2) != 0) {
            bVar = fVar.f92584b;
        }
        yl1.b cta = bVar;
        if ((i13 & 4) != 0) {
            eVar = fVar.f92585c;
        }
        bb2.e eVar2 = eVar;
        if ((i13 & 8) != 0) {
            a0Var2 = fVar.f92586d;
        }
        zy.a0 pinalyticsDisplayState = a0Var2;
        zy.b impressionDisplayState = fVar.f92587e;
        if ((i13 & 32) != 0) {
            num = fVar.f92588f;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(cta, "cta");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        return new f(multiSectionDisplayState, cta, eVar2, pinalyticsDisplayState, impressionDisplayState, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f92583a, fVar.f92583a) && Intrinsics.d(this.f92584b, fVar.f92584b) && Intrinsics.d(this.f92585c, fVar.f92585c) && Intrinsics.d(this.f92586d, fVar.f92586d) && Intrinsics.d(this.f92587e, fVar.f92587e) && Intrinsics.d(this.f92588f, fVar.f92588f);
    }

    public final Integer f() {
        return this.f92588f;
    }

    public final int hashCode() {
        int hashCode = (this.f92584b.hashCode() + (this.f92583a.f93524a.hashCode() * 31)) * 31;
        bb2.e eVar = this.f92585c;
        int hashCode2 = (this.f92586d.hashCode() + ((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31)) * 31;
        this.f92587e.getClass();
        int i13 = (hashCode2 + 172602875) * 31;
        Integer num = this.f92588f;
        return i13 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "NuxPinFeedDisplayState(multiSectionDisplayState=" + this.f92583a + ", cta=" + this.f92584b + ", pinFixedHeightImageSpec=" + this.f92585c + ", pinalyticsDisplayState=" + this.f92586d + ", impressionDisplayState=" + this.f92587e + ", autoScrollingToPosition=" + this.f92588f + ")";
    }
}
