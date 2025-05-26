package ads_mobile_sdk;

import a.na;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bg0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(String str, String str2, bl2.c cVar) {
        super(2, cVar);
        this.f2873b = str;
        this.f2874c = str2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        bg0 bg0Var = new bg0(this.f2873b, this.f2874c, cVar);
        bg0Var.f2872a = obj;
        return bg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bg0) create((sf0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        w81 w81Var;
        w81 w81Var2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        sf0 sf0Var = (sf0) this.f2872a;
        String value = this.f2873b;
        String key = this.f2874c;
        qj0 q13 = sf0Var.q();
        Intrinsics.checkNotNullExpressionValue(q13, "toBuilder(...)");
        na builder = (na) q13;
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (value == null || value.length() == 0) {
            w81Var = ((sf0) builder.f10110b).storedSdkCoreData_;
            Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getStoredSdkCoreDataMap(...)");
            Intrinsics.checkNotNullParameter(new ca0(unmodifiableMap), "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            key.getClass();
            builder.b();
            ((sf0) builder.f10110b).v().remove(key);
        } else {
            w81Var2 = ((sf0) builder.f10110b).storedSdkCoreData_;
            Map unmodifiableMap2 = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var2));
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap2, "getStoredSdkCoreDataMap(...)");
            Intrinsics.checkNotNullParameter(new ca0(unmodifiableMap2), "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            key.getClass();
            builder.b();
            ((sf0) builder.f10110b).v().put(key, value);
        }
        sj0 a13 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (sf0) a13;
    }
}
