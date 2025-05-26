package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ec0 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4801a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4802b;

    /* renamed from: c, reason: collision with root package name */
    public final ss2 f4803c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4804d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4805e;

    public ec0(Throwable exception, String label, ss2 ss2Var, boolean z13, long j13) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f4801a = exception;
        this.f4802b = label;
        this.f4803c = ss2Var;
        this.f4804d = z13;
        this.f4805e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec0)) {
            return false;
        }
        ec0 ec0Var = (ec0) obj;
        return Intrinsics.d(this.f4801a, ec0Var.f4801a) && Intrinsics.d(this.f4802b, ec0Var.f4802b) && Intrinsics.d(this.f4803c, ec0Var.f4803c) && this.f4804d == ec0Var.f4804d && this.f4805e == ec0Var.f4805e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int t13 = kh2.j1.t(this.f4801a.hashCode() * 31, this.f4802b);
        ss2 ss2Var = this.f4803c;
        int hashCode = (t13 + (ss2Var == null ? 0 : ss2Var.hashCode())) * 31;
        boolean z13 = this.f4804d;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        return Long.hashCode(this.f4805e) + ((hashCode + i13) * 31);
    }

    public final String toString() {
        Throwable th3 = this.f4801a;
        String str = this.f4802b;
        ss2 ss2Var = this.f4803c;
        boolean z13 = this.f4804d;
        long j13 = this.f4805e;
        StringBuilder sb3 = new StringBuilder("ExceptionSnapshot(exception=");
        sb3.append(th3);
        sb3.append(", label=");
        sb3.append(str);
        sb3.append(", activeTraceMeta=");
        sb3.append(ss2Var);
        sb3.append(", trapped=");
        sb3.append(z13);
        sb3.append(", timeMilliseconds=");
        return a.a.o(sb3, j13, ")");
    }
}
