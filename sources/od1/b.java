package od1;

import a.cb;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f94108a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94109b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94110c;

    /* renamed from: d, reason: collision with root package name */
    public final String f94111d;

    /* renamed from: e, reason: collision with root package name */
    public final List f94112e;

    /* renamed from: f, reason: collision with root package name */
    public final o82.a0 f94113f;

    /* renamed from: g, reason: collision with root package name */
    public final zy.a0 f94114g;

    /* renamed from: h, reason: collision with root package name */
    public final zy.b f94115h;

    public b(int i13, String heroTitle, String heroImageUrl, String imageToolbar, List oneBarModules, o82.a0 multiSectionDisplayState, zy.a0 pinalyticsDisplayState, zy.b impressionDisplayState) {
        Intrinsics.checkNotNullParameter(heroTitle, "heroTitle");
        Intrinsics.checkNotNullParameter(heroImageUrl, "heroImageUrl");
        Intrinsics.checkNotNullParameter(imageToolbar, "imageToolbar");
        Intrinsics.checkNotNullParameter(oneBarModules, "oneBarModules");
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        this.f94108a = i13;
        this.f94109b = heroTitle;
        this.f94110c = heroImageUrl;
        this.f94111d = imageToolbar;
        this.f94112e = oneBarModules;
        this.f94113f = multiSectionDisplayState;
        this.f94114g = pinalyticsDisplayState;
        this.f94115h = impressionDisplayState;
    }

    public static b e(b bVar, String str, List list, o82.a0 a0Var, int i13) {
        int i14 = bVar.f94108a;
        String heroTitle = bVar.f94109b;
        if ((i13 & 4) != 0) {
            str = bVar.f94110c;
        }
        String heroImageUrl = str;
        String imageToolbar = bVar.f94111d;
        if ((i13 & 16) != 0) {
            list = bVar.f94112e;
        }
        List oneBarModules = list;
        if ((i13 & 32) != 0) {
            a0Var = bVar.f94113f;
        }
        o82.a0 multiSectionDisplayState = a0Var;
        zy.a0 pinalyticsDisplayState = bVar.f94114g;
        zy.b impressionDisplayState = bVar.f94115h;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(heroTitle, "heroTitle");
        Intrinsics.checkNotNullParameter(heroImageUrl, "heroImageUrl");
        Intrinsics.checkNotNullParameter(imageToolbar, "imageToolbar");
        Intrinsics.checkNotNullParameter(oneBarModules, "oneBarModules");
        Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        return new b(i14, heroTitle, heroImageUrl, imageToolbar, oneBarModules, multiSectionDisplayState, pinalyticsDisplayState, impressionDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f94108a == bVar.f94108a && Intrinsics.d(this.f94109b, bVar.f94109b) && Intrinsics.d(this.f94110c, bVar.f94110c) && Intrinsics.d(this.f94111d, bVar.f94111d) && Intrinsics.d(this.f94112e, bVar.f94112e) && Intrinsics.d(this.f94113f, bVar.f94113f) && Intrinsics.d(this.f94114g, bVar.f94114g) && Intrinsics.d(this.f94115h, bVar.f94115h);
    }

    public final int f() {
        return this.f94108a;
    }

    public final String g() {
        return this.f94110c;
    }

    public final String h() {
        return this.f94109b;
    }

    public final int hashCode() {
        int hashCode = (this.f94114g.hashCode() + ep.b.c(this.f94113f.f93524a, ep.b.c(this.f94112e, cb.d(this.f94111d, cb.d(this.f94110c, cb.d(this.f94109b, Integer.hashCode(this.f94108a) * 31, 31), 31), 31), 31), 31)) * 31;
        this.f94115h.getClass();
        return hashCode + 172602875;
    }

    public final List i() {
        return this.f94112e;
    }

    public final String toString() {
        return "STLLandingPageDisplayState(columnCount=" + this.f94108a + ", heroTitle=" + this.f94109b + ", heroImageUrl=" + this.f94110c + ", imageToolbar=" + this.f94111d + ", oneBarModules=" + this.f94112e + ", multiSectionDisplayState=" + this.f94113f + ", pinalyticsDisplayState=" + this.f94114g + ", impressionDisplayState=" + this.f94115h + ")";
    }

    public b(String str, o82.a0 a0Var, zy.a0 a0Var2, int i13) {
        this(2, (i13 & 2) != 0 ? "" : str, "", "", q0.f80391a, (i13 & 32) != 0 ? new o82.a0() : a0Var, (i13 & 64) != 0 ? new zy.a0() : a0Var2, zy.b.f143058a);
    }
}
