package vk;

import java.util.Objects;

/* loaded from: classes.dex */
public final class g0 extends c {

    /* renamed from: a, reason: collision with root package name */
    public final String f125952a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f125953b;

    public g0(String str, f0 f0Var) {
        this.f125952a = str;
        this.f125953b = f0Var;
    }

    @Override // uk.q
    public final boolean a() {
        return this.f125953b != f0.f125950c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return g0Var.f125952a.equals(this.f125952a) && g0Var.f125953b.equals(this.f125953b);
    }

    public final int hashCode() {
        return Objects.hash(g0.class, this.f125952a, this.f125953b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f125952a + ", variant: " + this.f125953b + ")";
    }
}
