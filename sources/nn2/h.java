package nn2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import ln2.l0;
import tm2.s0;

/* loaded from: classes4.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91593a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i13) {
        super(1, obj);
        this.f91593a = i13;
    }

    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        switch (this.f91593a) {
            case 0:
                return "simpleType";
            default:
                return "getValueClassPropertyType";
        }
    }

    @Override // kotlin.jvm.internal.e
    public final rl2.f getOwner() {
        switch (this.f91593a) {
            case 0:
                return k0.f80436a.b(kotlin.jvm.internal.r.class);
            default:
                return k0.f80436a.b(j.class);
        }
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        switch (this.f91593a) {
            case 0:
                return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
            default:
                return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91593a) {
            case 0:
                s0 p03 = (s0) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                return ((l0) this.receiver).d(p03, true);
            default:
                ym2.g p04 = (ym2.g) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                return ((j) this.receiver).v0(p04);
        }
    }
}
