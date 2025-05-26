package b02;

/* loaded from: classes4.dex */
public final class i extends m {

    /* renamed from: a, reason: collision with root package name */
    public final int f20780a;

    public i(int i13) {
        this.f20780a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f20780a == ((i) obj).f20780a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20780a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("GoToPriorStep(priorStepIndex="), this.f20780a, ")");
    }
}
