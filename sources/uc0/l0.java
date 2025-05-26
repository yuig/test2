package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121814a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121815b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f121816c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f121817d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f121818e;

    /* renamed from: f, reason: collision with root package name */
    public final int f121819f;

    /* renamed from: g, reason: collision with root package name */
    public final do2.t2 f121820g;

    /* renamed from: h, reason: collision with root package name */
    public final do2.a2 f121821h;

    public l0(int i13, int i14, j0 feedBackTypeDisplayState, k0 feedBackCommentDisplayState, i0 feedBackPersonalDataDisplayState, int i15) {
        Intrinsics.checkNotNullParameter(feedBackTypeDisplayState, "feedBackTypeDisplayState");
        Intrinsics.checkNotNullParameter(feedBackCommentDisplayState, "feedBackCommentDisplayState");
        Intrinsics.checkNotNullParameter(feedBackPersonalDataDisplayState, "feedBackPersonalDataDisplayState");
        this.f121814a = i13;
        this.f121815b = i14;
        this.f121816c = feedBackTypeDisplayState;
        this.f121817d = feedBackCommentDisplayState;
        this.f121818e = feedBackPersonalDataDisplayState;
        this.f121819f = i15;
        do2.t2 a13 = do2.u2.a("");
        this.f121820g = a13;
        this.f121821h = new do2.a2(a13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f121814a == l0Var.f121814a && this.f121815b == l0Var.f121815b && Intrinsics.d(this.f121816c, l0Var.f121816c) && Intrinsics.d(this.f121817d, l0Var.f121817d) && Intrinsics.d(this.f121818e, l0Var.f121818e) && this.f121819f == l0Var.f121819f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121819f) + ((this.f121818e.hashCode() + ep.b.b(this.f121817d.f121802a, (this.f121816c.hashCode() + ep.b.b(this.f121815b, Integer.hashCode(this.f121814a) * 31, 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FeedBackPageDisplayState(title=");
        sb3.append(this.f121814a);
        sb3.append(", subtitle=");
        sb3.append(this.f121815b);
        sb3.append(", feedBackTypeDisplayState=");
        sb3.append(this.f121816c);
        sb3.append(", feedBackCommentDisplayState=");
        sb3.append(this.f121817d);
        sb3.append(", feedBackPersonalDataDisplayState=");
        sb3.append(this.f121818e);
        sb3.append(", submitButton=");
        return a.a.n(sb3, this.f121819f, ")");
    }
}
