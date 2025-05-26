package to2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Map f118706a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f118707b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f118708c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f118709d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f118710e;

    public d(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f118706a = class2ContextualFactory;
        this.f118707b = polyBase2Serializers;
        this.f118708c = polyBase2DefaultSerializerProvider;
        this.f118709d = polyBase2NamedSerializers;
        this.f118710e = polyBase2DefaultDeserializerProvider;
    }

    public final void a(f collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        for (Map.Entry entry : this.f118706a.entrySet()) {
            rl2.d dVar = (rl2.d) entry.getKey();
            c cVar = (c) entry.getValue();
            if (cVar instanceof a) {
                Intrinsics.g(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                no2.b bVar = ((a) cVar).f118704a;
                Intrinsics.g(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.c(dVar, bVar);
            } else if (cVar instanceof b) {
                collector.e(dVar, ((b) cVar).f118705a);
            }
        }
        for (Map.Entry entry2 : this.f118707b.entrySet()) {
            rl2.d dVar2 = (rl2.d) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                rl2.d dVar3 = (rl2.d) entry3.getKey();
                no2.b bVar2 = (no2.b) entry3.getValue();
                Intrinsics.g(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.g(dVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.g(bVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.b(dVar2, dVar3, bVar2);
            }
        }
        for (Map.Entry entry4 : this.f118708c.entrySet()) {
            rl2.d dVar4 = (rl2.d) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            Intrinsics.g(dVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.g(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            dl2.b.y(1, function1);
            collector.d(dVar4, function1);
        }
        for (Map.Entry entry5 : this.f118710e.entrySet()) {
            rl2.d dVar5 = (rl2.d) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            Intrinsics.g(dVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.g(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            dl2.b.y(1, function12);
            collector.a(dVar5, function12);
        }
    }

    public final no2.b b(rl2.d kClass, List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        c cVar = (c) this.f118706a.get(kClass);
        no2.b a13 = cVar != null ? cVar.a(typeArgumentsSerializers) : null;
        if (a13 instanceof no2.b) {
            return a13;
        }
        return null;
    }
}
