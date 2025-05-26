package ao2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class a1 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public final m f20109c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e1 f20110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(e1 e1Var, long j13, o oVar) {
        super(j13);
        this.f20110d = e1Var;
        this.f20109c = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20109c.i(this.f20110d, Unit.f80348a);
    }

    @Override // ao2.c1
    public final String toString() {
        return super.toString() + this.f20109c;
    }
}
