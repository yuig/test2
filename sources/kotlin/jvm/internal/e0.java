package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class e0 extends e implements rl2.u {
    private final boolean syntheticJavaProperty;

    public e0() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.e
    public rl2.c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            return getOwner().equals(e0Var.getOwner()) && getName().equals(e0Var.getName()) && getSignature().equals(e0Var.getSignature()) && Intrinsics.d(getBoundReceiver(), e0Var.getBoundReceiver());
        }
        if (obj instanceof rl2.u) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // rl2.u
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // rl2.u
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        rl2.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.e
    public rl2.u getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (rl2.u) super.getReflected();
    }

    public e0(Object obj, Class cls, String str, String str2, int i13) {
        super(obj, cls, str, str2, (i13 & 1) == 1);
        this.syntheticJavaProperty = (i13 & 2) == 2;
    }
}
