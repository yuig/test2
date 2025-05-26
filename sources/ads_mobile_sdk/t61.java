package ads_mobile_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class t61 extends a.nb {

    /* renamed from: a, reason: collision with root package name */
    public final s61 f11424a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11425b;

    /* renamed from: c, reason: collision with root package name */
    public final r61 f11426c;

    /* renamed from: d, reason: collision with root package name */
    public final a.nb f11427d;

    public t61(s61 s61Var, String str, r61 r61Var, a.nb nbVar) {
        this.f11424a = s61Var;
        this.f11425b = str;
        this.f11426c = r61Var;
        this.f11427d = nbVar;
    }

    @Override // a.p6
    public final boolean a() {
        return this.f11424a != s61.f10968c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t61)) {
            return false;
        }
        t61 t61Var = (t61) obj;
        return t61Var.f11426c.equals(this.f11426c) && t61Var.f11427d.equals(this.f11427d) && t61Var.f11425b.equals(this.f11425b) && t61Var.f11424a.equals(this.f11424a);
    }

    public final int hashCode() {
        return Objects.hash(t61.class, this.f11425b, this.f11426c, this.f11427d, this.f11424a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f11425b + ", dekParsingStrategy: " + this.f11426c + ", dekParametersForNewKeys: " + this.f11427d + ", variant: " + this.f11424a + ")";
    }
}
