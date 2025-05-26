package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class o extends e implements n, rl2.g {
    private final int arity;
    private final int flags;

    public o(int i13) {
        this(i13, e.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.e
    public rl2.c computeReflected() {
        return k0.f80436a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return getName().equals(oVar.getName()) && getSignature().equals(oVar.getSignature()) && this.flags == oVar.flags && this.arity == oVar.arity && Intrinsics.d(getBoundReceiver(), oVar.getBoundReceiver()) && Intrinsics.d(getOwner(), oVar.getOwner());
        }
        if (obj instanceof rl2.g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // rl2.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // rl2.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // rl2.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // rl2.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.e, rl2.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        rl2.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public o(int i13, Object obj) {
        this(i13, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.e
    public rl2.g getReflected() {
        return (rl2.g) super.getReflected();
    }

    public o(int i13, Object obj, Class cls, String str, String str2, int i14) {
        super(obj, cls, str, str2, (i14 & 1) == 1);
        this.arity = i13;
        this.flags = 0;
    }
}
