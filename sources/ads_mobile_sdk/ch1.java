package ads_mobile_sdk;

import a.yc;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ch1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch1(String str, bl2.c cVar, boolean z13) {
        super(2, cVar);
        this.f3915b = str;
        this.f3916c = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        ch1 ch1Var = new ch1(this.f3915b, cVar, this.f3916c);
        ch1Var.f3914a = obj;
        return ch1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ch1) create((ug1) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        w81 w81Var;
        w81 w81Var2;
        w81 w81Var3;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ug1 ug1Var = (ug1) this.f3914a;
        String key = this.f3915b;
        boolean z13 = this.f3916c;
        qj0 q13 = ug1Var.q();
        Intrinsics.checkNotNullExpressionValue(q13, "toBuilder(...)");
        yc builder = (yc) q13;
        Intrinsics.checkNotNullParameter(builder, "builder");
        w81Var = ((ug1) builder.f10110b).adUnitToUseMediaView_;
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getAdUnitToUseMediaViewMap(...)");
        Intrinsics.checkNotNullParameter(new ca0(unmodifiableMap), "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        key.getClass();
        builder.b();
        ug1 ug1Var2 = (ug1) builder.f10110b;
        w81Var2 = ug1Var2.adUnitToUseMediaView_;
        if (!w81Var2.f12897a) {
            ug1Var2.adUnitToUseMediaView_ = w81Var2.b();
        }
        w81Var3 = ug1Var2.adUnitToUseMediaView_;
        w81Var3.put(key, Boolean.valueOf(z13));
        sj0 a13 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (ug1) a13;
    }
}
