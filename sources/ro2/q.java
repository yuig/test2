package ro2;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final q f109034j = new q(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q f109035k = new q(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109036i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i13) {
        super(1);
        this.f109036i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f109036i) {
            case 0:
                oo2.a buildSerialDescriptor = (oo2.a) obj;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                oo2.a.a(buildSerialDescriptor, "JsonPrimitive", new s(p.f109028j));
                oo2.a.a(buildSerialDescriptor, "JsonNull", new s(p.f109029k));
                oo2.a.a(buildSerialDescriptor, "JsonLiteral", new s(p.f109030l));
                oo2.a.a(buildSerialDescriptor, "JsonObject", new s(p.f109031m));
                oo2.a.a(buildSerialDescriptor, "JsonArray", new s(p.f109032n));
                return Unit.f80348a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
                String str = (String) entry.getKey();
                n nVar = (n) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                so2.h0.a(str, sb3);
                sb3.append(':');
                sb3.append(nVar);
                String sb4 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
                return sb4;
        }
    }
}
