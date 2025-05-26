package w80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f128263a;

    /* renamed from: b, reason: collision with root package name */
    public final float f128264b;

    /* renamed from: c, reason: collision with root package name */
    public final a f128265c;

    /* renamed from: d, reason: collision with root package name */
    public final float f128266d;

    public c(float f13, float f14, a actionStyle) {
        Intrinsics.checkNotNullParameter(actionStyle, "actionStyle");
        this.f128263a = f13;
        this.f128264b = f14;
        this.f128265c = actionStyle;
        this.f128266d = f13 + f14 + actionStyle.f128246c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n4.e.a(this.f128263a, cVar.f128263a) && n4.e.a(this.f128264b, cVar.f128264b) && Intrinsics.d(this.f128265c, cVar.f128265c);
    }

    public final int hashCode() {
        return this.f128265c.hashCode() + a.a.a(this.f128264b, Float.hashCode(this.f128263a) * 31, 31);
    }

    public final String toString() {
        StringBuilder w13 = a.a.w("BottomBarDisplayStyle(topPadding=", n4.e.b(this.f128263a), ", bottomPadding=", n4.e.b(this.f128264b), ", actionStyle=");
        w13.append(this.f128265c);
        w13.append(")");
        return w13.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ c() {
        /*
            r2 = this;
            float r0 = w80.z.f128438d
            w80.a r1 = new w80.a
            r1.<init>()
            r2.<init>(r0, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w80.c.<init>():void");
    }
}
