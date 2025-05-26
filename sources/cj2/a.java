package cj2;

/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f27894a;

    public a(String str) {
        if (str == null) {
            throw new NullPointerException("Null asString");
        }
        this.f27894a = str;
    }

    @Override // cj2.c
    public final String asString() {
        return this.f27894a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f27894a.equals(((a) obj).f27894a);
    }

    public final int hashCode() {
        return this.f27894a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("StringBody{asString="), this.f27894a, "}");
    }
}
