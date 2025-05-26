package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s9 implements z40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f133259a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133260b;

    public s9(String message, String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f133259a = message;
        this.f133260b = str;
    }

    @Override // z40.a
    public final String a() {
        return this.f133260b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9)) {
            return false;
        }
        s9 s9Var = (s9) obj;
        return Intrinsics.d(this.f133259a, s9Var.f133259a) && Intrinsics.d(this.f133260b, s9Var.f133260b);
    }

    @Override // z40.a
    public final String getMessage() {
        return this.f133259a;
    }

    public final int hashCode() {
        int hashCode = this.f133259a.hashCode() * 31;
        String str = this.f133260b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Error(message=");
        sb3.append(this.f133259a);
        sb3.append(", paramPath=");
        return a.a.p(sb3, this.f133260b, ")");
    }
}
