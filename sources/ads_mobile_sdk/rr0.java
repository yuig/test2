package ads_mobile_sdk;

import a.l7;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rr0 implements l7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f10759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f10760b;

    public rr0(x xVar, Set set) {
        this.f10759a = xVar;
        this.f10760b = set;
    }

    @Override // a.l7
    public final Unit a() {
        x xVar = this.f10759a;
        Set newForegroundStateChangeListeners = this.f10760b;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(newForegroundStateChangeListeners, "newForegroundStateChangeListeners");
        xVar.f13323i.addAll(newForegroundStateChangeListeners);
        return Unit.f80348a;
    }
}
