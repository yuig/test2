package jg2;

import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class g extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76123i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f76124j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Application f76125k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Application application, int i13) {
        super(0);
        this.f76123i = i13;
        this.f76124j = iVar;
        this.f76125k = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Application application = this.f76125k;
        i iVar = this.f76124j;
        int i13 = this.f76123i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullExpressionValue(application, "application");
                        if (!iVar.f76134e) {
                            application.unregisterActivityLifecycleCallbacks(iVar);
                            bi2.a aVar = iVar.f76131b;
                            if (aVar != null) {
                                application.registerActivityLifecycleCallbacks(aVar);
                            }
                            iVar.f76134e = true;
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullExpressionValue(application, "application");
                        if (!iVar.f76134e) {
                            application.unregisterActivityLifecycleCallbacks(iVar);
                            bi2.a aVar2 = iVar.f76131b;
                            if (aVar2 != null) {
                                application.registerActivityLifecycleCallbacks(aVar2);
                            }
                            iVar.f76134e = true;
                            break;
                        }
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullExpressionValue(application, "application");
                        if (!iVar.f76134e) {
                            application.unregisterActivityLifecycleCallbacks(iVar);
                            bi2.a aVar3 = iVar.f76131b;
                            if (aVar3 != null) {
                                application.registerActivityLifecycleCallbacks(aVar3);
                            }
                            iVar.f76134e = true;
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullExpressionValue(application, "application");
                        if (!iVar.f76134e) {
                            application.unregisterActivityLifecycleCallbacks(iVar);
                            bi2.a aVar4 = iVar.f76131b;
                            if (aVar4 != null) {
                                application.registerActivityLifecycleCallbacks(aVar4);
                            }
                            iVar.f76134e = true;
                            break;
                        }
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
