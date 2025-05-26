package n60;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final u f89309j = new u(0);

    /* renamed from: k, reason: collision with root package name */
    public static final u f89310k = new u(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89311i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i13) {
        super(1);
        this.f89311i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f89311i) {
            case 0:
                if (((m60.a) obj) == m60.a.BACKGROUNDING) {
                    cy.d.f53395a.getClass();
                    synchronized (cy.c.f53391b) {
                        try {
                            ox.b bVar = cy.c.f53392c;
                            boolean z13 = cy.c.f53391b.e() > 0;
                            if (bVar != null && z13) {
                                ((vy.m) bVar).i(cy.c.f53391b, ox.a.f97979i);
                                cy.c.f53391b = new ms0.b();
                                cy.c.f53393d = System.currentTimeMillis();
                            }
                            Unit unit = Unit.f80348a;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                return Unit.f80348a;
            default:
                return Unit.f80348a;
        }
    }
}
