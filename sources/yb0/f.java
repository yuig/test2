package yb0;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f138477a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f138478b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f138479c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f138480d;

    /* renamed from: e, reason: collision with root package name */
    public final h f138481e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f138482f;

    public f(i0 title, i0 i0Var, k0 positiveButtonText, i0 i0Var2, h hVar, boolean z13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        this.f138477a = title;
        this.f138478b = i0Var;
        this.f138479c = positiveButtonText;
        this.f138480d = i0Var2;
        this.f138481e = hVar;
        this.f138482f = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f138477a, fVar.f138477a) && Intrinsics.d(this.f138478b, fVar.f138478b) && Intrinsics.d(this.f138479c, fVar.f138479c) && Intrinsics.d(this.f138480d, fVar.f138480d) && Intrinsics.d(this.f138481e, fVar.f138481e) && this.f138482f == fVar.f138482f;
    }

    public final int hashCode() {
        int hashCode = this.f138477a.hashCode() * 31;
        i0 i0Var = this.f138478b;
        int d2 = ep.b.d(this.f138479c, (hashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31, 31);
        i0 i0Var2 = this.f138480d;
        int hashCode2 = (d2 + (i0Var2 == null ? 0 : i0Var2.hashCode())) * 31;
        h hVar = this.f138481e;
        return Boolean.hashCode(this.f138482f) + ((hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShowSimpleAlertEvent(title=");
        sb3.append(this.f138477a);
        sb3.append(", subTitle=");
        sb3.append(this.f138478b);
        sb3.append(", positiveButtonText=");
        sb3.append(this.f138479c);
        sb3.append(", negativeButtonText=");
        sb3.append(this.f138480d);
        sb3.append(", listener=");
        sb3.append(this.f138481e);
        sb3.append(", canDismiss=");
        return a.a.r(sb3, this.f138482f, ")");
    }

    public /* synthetic */ f(i0 i0Var, i0 i0Var2, k0 k0Var, k0 k0Var2, h hVar, int i13) {
        this(i0Var, i0Var2, k0Var, (i13 & 8) != 0 ? null : k0Var2, hVar, (i13 & 32) != 0);
    }
}
