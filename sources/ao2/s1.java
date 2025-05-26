package ao2;

/* loaded from: classes2.dex */
public final class s1 extends o {

    /* renamed from: i, reason: collision with root package name */
    public final a2 f20204i;

    public s1(bl2.c cVar, a2 a2Var) {
        super(1, cVar);
        this.f20204i = a2Var;
    }

    @Override // ao2.o
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // ao2.o
    public final Throwable t(a2 a2Var) {
        Throwable c13;
        a2 a2Var2 = this.f20204i;
        a2Var2.getClass();
        Object obj = a2.f20111a.get(a2Var2);
        return (!(obj instanceof u1) || (c13 = ((u1) obj).c()) == null) ? obj instanceof z ? ((z) obj).f20242a : a2Var.getCancellationException() : c13;
    }
}
