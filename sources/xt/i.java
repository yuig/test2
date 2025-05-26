package xt;

import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f135879a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f135880b;

    /* renamed from: c, reason: collision with root package name */
    public final int f135881c;

    /* renamed from: d, reason: collision with root package name */
    public final f30 f135882d;

    /* renamed from: e, reason: collision with root package name */
    public final List f135883e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f135884f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f135885g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f135886h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f135887i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f135888j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f135889k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f135890l;

    public i(f30 f30Var, ArrayList pages, int i13, f30 f30Var2, List currentSubpins, Integer num, Integer num2, boolean z13, boolean z14, boolean z15, boolean z16, ArrayList carouselMediaViewModel) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(currentSubpins, "currentSubpins");
        Intrinsics.checkNotNullParameter(carouselMediaViewModel, "carouselMediaViewModel");
        this.f135879a = f30Var;
        this.f135880b = pages;
        this.f135881c = i13;
        this.f135882d = f30Var2;
        this.f135883e = currentSubpins;
        this.f135884f = num;
        this.f135885g = num2;
        this.f135886h = z13;
        this.f135887i = z14;
        this.f135888j = z15;
        this.f135889k = z16;
        this.f135890l = carouselMediaViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f135879a, iVar.f135879a) && Intrinsics.d(this.f135880b, iVar.f135880b) && this.f135881c == iVar.f135881c && Intrinsics.d(this.f135882d, iVar.f135882d) && Intrinsics.d(this.f135883e, iVar.f135883e) && Intrinsics.d(this.f135884f, iVar.f135884f) && Intrinsics.d(this.f135885g, iVar.f135885g) && this.f135886h == iVar.f135886h && this.f135887i == iVar.f135887i && this.f135888j == iVar.f135888j && this.f135889k == iVar.f135889k && Intrinsics.d(this.f135890l, iVar.f135890l);
    }

    public final int hashCode() {
        f30 f30Var = this.f135879a;
        int b13 = ep.b.b(this.f135881c, (this.f135880b.hashCode() + ((f30Var == null ? 0 : f30Var.hashCode()) * 31)) * 31, 31);
        f30 f30Var2 = this.f135882d;
        int c13 = ep.b.c(this.f135883e, (b13 + (f30Var2 == null ? 0 : f30Var2.hashCode())) * 31, 31);
        Integer num = this.f135884f;
        int hashCode = (c13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f135885g;
        return this.f135890l.hashCode() + ep.b.e(this.f135889k, ep.b.e(this.f135888j, ep.b.e(this.f135887i, ep.b.e(this.f135886h, (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "Ready(parentPage=" + this.f135879a + ", pages=" + this.f135880b + ", currentIndex=" + this.f135881c + ", currentSelectedPin=" + this.f135882d + ", currentSubpins=" + this.f135883e + ", prevDominantColor=" + this.f135884f + ", nextDominantColor=" + this.f135885g + ", isFirstTime=" + this.f135886h + ", isUserSwipe=" + this.f135887i + ", isPinMediaViewRefreshNeeded=" + this.f135888j + ", isUserAction=" + this.f135889k + ", carouselMediaViewModel=" + this.f135890l + ")";
    }
}
