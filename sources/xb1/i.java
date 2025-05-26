package xb1;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import yb1.t;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134519i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f134520j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j f134521k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f134522l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ HashMap f134523m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f134524n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Function1 function1, j jVar, String str, HashMap hashMap, Function1 function12) {
        super(1);
        this.f134520j = function1;
        this.f134521k = jVar;
        this.f134522l = str;
        this.f134523m = hashMap;
        this.f134524n = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f134519i) {
            case 0:
                String typedPasscode = (String) obj;
                Intrinsics.checkNotNullParameter(typedPasscode, "typedPasscode");
                j.w3(this.f134521k, this.f134522l, this.f134523m, this.f134520j, this.f134524n, typedPasscode, false, 32);
                break;
            default:
                Throwable th3 = (Throwable) obj;
                Intrinsics.f(th3);
                this.f134520j.invoke(th3);
                boolean c13 = r91.b.c(th3);
                j jVar = this.f134521k;
                if (c13 && jVar.isBound()) {
                    com.pinterest.feature.settings.permissions.f fVar = (com.pinterest.feature.settings.permissions.f) jVar.getView();
                    t tVar = (t) fVar;
                    tVar.y6(new i(this.f134521k, this.f134522l, this.f134523m, this.f134524n, this.f134520j));
                } else if (r91.b.d(th3) && jVar.isBound()) {
                    com.pinterest.feature.settings.permissions.f fVar2 = (com.pinterest.feature.settings.permissions.f) jVar.getView();
                    t tVar2 = (t) fVar2;
                    tVar2.z3(new q4.h(this.f134521k, this.f134522l, this.f134523m, this.f134524n, this.f134520j));
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, HashMap hashMap, Function1 function1, Function1 function12) {
        super(1);
        this.f134521k = jVar;
        this.f134522l = str;
        this.f134523m = hashMap;
        this.f134520j = function1;
        this.f134524n = function12;
    }
}
