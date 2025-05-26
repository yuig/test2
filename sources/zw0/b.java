package zw0;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import o82.a0;
import o82.y0;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f142896a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f142897b;

    /* renamed from: c, reason: collision with root package name */
    public final String f142898c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f142899d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.b f142900e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f142901f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f142902g;

    public b(ArrayList arrayList, String str, a0 a0Var, boolean z13, int i13) {
        this((i13 & 1) != 0 ? q0.f80391a : arrayList, new a0(e0.b(new y0(null, null, false, 7))), (i13 & 4) != 0 ? "complete_the_look" : str, true, zy.b.f143058a, (i13 & 32) != 0 ? new a0() : a0Var, (i13 & 64) != 0 ? false : z13);
    }

    public static b e(b bVar, a0 a0Var, boolean z13, int i13) {
        List recyclerItems = bVar.f142896a;
        if ((i13 & 2) != 0) {
            a0Var = bVar.f142897b;
        }
        a0 listDisplayState = a0Var;
        String storyTypeForLogging = bVar.f142898c;
        boolean z14 = bVar.f142899d;
        zy.b impressionDisplayState = bVar.f142900e;
        a0 pinListDisplayState = bVar.f142901f;
        if ((i13 & 64) != 0) {
            z13 = bVar.f142902g;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(recyclerItems, "recyclerItems");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(storyTypeForLogging, "storyTypeForLogging");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        Intrinsics.checkNotNullParameter(pinListDisplayState, "pinListDisplayState");
        return new b(recyclerItems, listDisplayState, storyTypeForLogging, z14, impressionDisplayState, pinListDisplayState, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f142896a, bVar.f142896a) && Intrinsics.d(this.f142897b, bVar.f142897b) && Intrinsics.d(this.f142898c, bVar.f142898c) && this.f142899d == bVar.f142899d && Intrinsics.d(this.f142900e, bVar.f142900e) && Intrinsics.d(this.f142901f, bVar.f142901f) && this.f142902g == bVar.f142902g;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f142899d, cb.d(this.f142898c, ep.b.c(this.f142897b.f93524a, this.f142896a.hashCode() * 31, 31), 31), 31);
        this.f142900e.getClass();
        return Boolean.hashCode(this.f142902g) + ep.b.c(this.f142901f.f93524a, (e13 + 172602875) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CompleteTheLookCarouselDisplayState(recyclerItems=");
        sb3.append(this.f142896a);
        sb3.append(", listDisplayState=");
        sb3.append(this.f142897b);
        sb3.append(", storyTypeForLogging=");
        sb3.append(this.f142898c);
        sb3.append(", shouldAddSwipeListener=");
        sb3.append(this.f142899d);
        sb3.append(", impressionDisplayState=");
        sb3.append(this.f142900e);
        sb3.append(", pinListDisplayState=");
        sb3.append(this.f142901f);
        sb3.append(", showLoadingSpinner=");
        return a.a.r(sb3, this.f142902g, ")");
    }

    public b(List recyclerItems, a0 listDisplayState, String storyTypeForLogging, boolean z13, zy.b impressionDisplayState, a0 pinListDisplayState, boolean z14) {
        Intrinsics.checkNotNullParameter(recyclerItems, "recyclerItems");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(storyTypeForLogging, "storyTypeForLogging");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        Intrinsics.checkNotNullParameter(pinListDisplayState, "pinListDisplayState");
        this.f142896a = recyclerItems;
        this.f142897b = listDisplayState;
        this.f142898c = storyTypeForLogging;
        this.f142899d = z13;
        this.f142900e = impressionDisplayState;
        this.f142901f = pinListDisplayState;
        this.f142902g = z14;
    }
}
