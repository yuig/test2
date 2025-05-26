package i1;

import j1.g2;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70731i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g2 f70732j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(g2 g2Var, int i13) {
        super(0);
        this.f70731i = i13;
        this.f70732j = g2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f70731i;
        g2 g2Var = this.f70732j;
        switch (i13) {
            case 0:
                Object c13 = g2Var.c();
                w0 w0Var = w0.PostExit;
                return Boolean.valueOf(c13 == w0Var && g2Var.f74078d.getValue() == w0Var);
            default:
                return Long.valueOf(g2Var.b());
        }
    }
}
