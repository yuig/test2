package ir1;

import br1.a0;
import dl1.b0;
import kk2.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u5.l;

/* loaded from: classes2.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73526i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f73527j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(1);
        this.f73526i = i13;
        this.f73527j = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f73526i;
        j jVar = this.f73527j;
        switch (i13) {
            case 0:
                l credentialManager = (l) obj;
                Intrinsics.checkNotNullParameter(credentialManager, "credentialManager");
                return new m(jVar.i(credentialManager, j.j(jVar, true)), new b0(20, new a0(1, jVar, credentialManager)), 2);
            default:
                u5.i credential = (u5.i) obj;
                Intrinsics.checkNotNullParameter(credential, "credential");
                return jVar.h(credential);
        }
    }
}
