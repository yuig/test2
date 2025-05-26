package jl;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class j extends bl.v {

    /* renamed from: a, reason: collision with root package name */
    public final i f76859a;

    public j(i iVar) {
        this.f76859a = iVar;
    }

    @Override // uk.q
    public final boolean a() {
        return this.f76859a != i.f76857e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j) && ((j) obj).f76859a == this.f76859a;
    }

    public final int hashCode() {
        return Objects.hash(j.class, this.f76859a);
    }

    public final String toString() {
        return "Ed25519 Parameters (variant: " + this.f76859a + ")";
    }
}
