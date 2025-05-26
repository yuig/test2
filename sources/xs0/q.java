package xs0;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import ni1.u0;

/* loaded from: classes5.dex */
public final class q implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f135834a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f135835b;

    /* renamed from: c, reason: collision with root package name */
    public final om1.c f135836c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f135837d;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f135838e;

    public q(boolean z13, Date activityDate, om1.c followButton, boolean z14, u0 pinRepDisplayState) {
        Intrinsics.checkNotNullParameter(activityDate, "activityDate");
        Intrinsics.checkNotNullParameter(followButton, "followButton");
        Intrinsics.checkNotNullParameter(pinRepDisplayState, "pinRepDisplayState");
        this.f135834a = z13;
        this.f135835b = activityDate;
        this.f135836c = followButton;
        this.f135837d = z14;
        this.f135838e = pinRepDisplayState;
    }

    public static q e(q qVar, boolean z13, Date date, om1.c cVar, boolean z14, u0 u0Var, int i13) {
        if ((i13 & 1) != 0) {
            z13 = qVar.f135834a;
        }
        boolean z15 = z13;
        if ((i13 & 2) != 0) {
            date = qVar.f135835b;
        }
        Date activityDate = date;
        if ((i13 & 4) != 0) {
            cVar = qVar.f135836c;
        }
        om1.c followButton = cVar;
        if ((i13 & 8) != 0) {
            z14 = qVar.f135837d;
        }
        boolean z16 = z14;
        if ((i13 & 16) != 0) {
            u0Var = qVar.f135838e;
        }
        u0 pinRepDisplayState = u0Var;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(activityDate, "activityDate");
        Intrinsics.checkNotNullParameter(followButton, "followButton");
        Intrinsics.checkNotNullParameter(pinRepDisplayState, "pinRepDisplayState");
        return new q(z15, activityDate, followButton, z16, pinRepDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f135834a == qVar.f135834a && Intrinsics.d(this.f135835b, qVar.f135835b) && Intrinsics.d(this.f135836c, qVar.f135836c) && this.f135837d == qVar.f135837d && Intrinsics.d(this.f135838e, qVar.f135838e);
    }

    public final int hashCode() {
        return this.f135838e.hashCode() + ep.b.e(this.f135837d, (this.f135836c.hashCode() + ((this.f135835b.hashCode() + (Boolean.hashCode(this.f135834a) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "SbaHfTunerPinActivityCellDisplayState(isOverlayVisible=" + this.f135834a + ", activityDate=" + this.f135835b + ", followButton=" + this.f135836c + ", followButtonSelected=" + this.f135837d + ", pinRepDisplayState=" + this.f135838e + ")";
    }

    public /* synthetic */ q() {
        this(false, new Date(), new om1.c(rm1.q.ADD, null, om1.f.DEFAULT_ALWAYS_DARK, null, bs1.c.j2(new String[0], x0.add), false, 0, 1002), false, new u0(null, 0, null, 2097151));
    }
}
