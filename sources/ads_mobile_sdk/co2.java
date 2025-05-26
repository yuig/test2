package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class co2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f3990a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3991b;

    public /* synthetic */ co2(Object obj) {
        this(obj, null);
    }

    public final Object getValue(Object thisRef, rl2.u property) {
        Object obj;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        synchronized (this) {
            obj = this.f3991b;
        }
        return obj;
    }

    public final void setValue(Object thisRef, rl2.u property, Object obj) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        synchronized (this) {
            this.f3991b = obj;
            Function1 function1 = this.f3990a;
            if (function1 != null) {
                function1.invoke(obj);
                Unit unit = Unit.f80348a;
            }
        }
    }

    public co2(Object obj, Function1 function1) {
        this.f3990a = function1;
        this.f3991b = obj;
    }
}
