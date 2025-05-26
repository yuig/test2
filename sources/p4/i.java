package p4;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s3.c2;
import t3.c0;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98791i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f98792j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(0);
        this.f98791i = i13;
        this.f98792j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f98791i) {
            case 0:
                m229invoke();
                break;
            default:
                m229invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m229invoke() {
        int i13 = this.f98791i;
        j jVar = this.f98792j;
        switch (i13) {
            case 0:
                jVar.f98815v.B();
                return;
            default:
                if (jVar.f98798e && jVar.isAttachedToWindow() && jVar.f98795b.getParent() == jVar) {
                    if (jVar.isAttachedToWindow()) {
                        c2 c2Var = ((c0) jVar.f98796c).A;
                        int i14 = j.f98793w;
                        c2Var.b(jVar, b.f98770j, jVar.f98797d);
                        return;
                    }
                    jk.r.y("Expected AndroidViewHolder to be attached when observing reads.");
                    throw null;
                }
                return;
        }
    }
}
