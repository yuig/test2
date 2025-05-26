package ok;

/* loaded from: classes3.dex */
public final class a0 extends c0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hc.m f95410h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(hc.m mVar, e0 e0Var, CharSequence charSequence) {
        super(e0Var, charSequence);
        this.f95410h = mVar;
    }

    @Override // ok.c0
    public final int e(int i13) {
        return i13;
    }

    @Override // ok.c0
    public final int f(int i13) {
        int i14 = i13 + this.f95410h.f68664a;
        if (i14 < this.f95415c.length()) {
            return i14;
        }
        return -1;
    }
}
