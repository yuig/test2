package mm2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87701a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, int i13) {
        super(1, obj);
        this.f87701a = i13;
    }

    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        switch (this.f87701a) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }
    }

    @Override // kotlin.jvm.internal.e
    public final rl2.f getOwner() {
        switch (this.f87701a) {
        }
        return kotlin.jvm.internal.k0.f80436a.b(o.class);
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        switch (this.f87701a) {
            case 0:
                return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
            default:
                return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f87701a;
        switch (i13) {
            case 0:
                ym2.g p03 = (ym2.g) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(p03, "p0");
                        return o.v((o) this.receiver, p03);
                    default:
                        Intrinsics.checkNotNullParameter(p03, "p0");
                        return o.w((o) this.receiver, p03);
                }
            default:
                ym2.g p04 = (ym2.g) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(p04, "p0");
                        return o.v((o) this.receiver, p04);
                    default:
                        Intrinsics.checkNotNullParameter(p04, "p0");
                        return o.w((o) this.receiver, p04);
                }
        }
    }
}
