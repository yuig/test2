package hr1;

import com.facebook.login.x;
import dl1.b0;
import hk1.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69998i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f69999j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i13) {
        super(1);
        this.f69998i = i13;
        this.f69999j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f69998i;
        k kVar = this.f69999j;
        switch (i13) {
            case 0:
                b attributes = (b) obj;
                Intrinsics.checkNotNullParameter(attributes, "attributes");
                kVar.getClass();
                String str = attributes.f69984b.f29918a;
                if (str == null) {
                    str = "";
                }
                return kVar.f70001j.a(str, attributes.f69983a.f29851e, true).b();
            default:
                x loginManager = (x) obj;
                Intrinsics.checkNotNullParameter(loginManager, "loginManager");
                fk2.c cVar = new fk2.c(4, kVar.f84602b.I5(), new b0(16, new t(loginManager, 20)));
                Intrinsics.checkNotNullExpressionValue(cVar, "flatMapCompletable(...)");
                return cVar;
        }
    }
}
