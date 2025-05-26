package qn2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import pn2.b0;

/* loaded from: classes4.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.o implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104519a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, int i13) {
        super(2, obj);
        this.f104519a = i13;
    }

    @Override // kotlin.jvm.internal.e, rl2.c
    public final String getName() {
        switch (this.f104519a) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    @Override // kotlin.jvm.internal.e
    public final rl2.f getOwner() {
        switch (this.f104519a) {
            case 0:
                return k0.f80436a.b(x.class);
            default:
                return k0.f80436a.b(o.class);
        }
    }

    @Override // kotlin.jvm.internal.e
    public final String getSignature() {
        switch (this.f104519a) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    public final Boolean h(b0 p03, b0 p13) {
        switch (this.f104519a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                ((x) this.receiver).getClass();
                n.f104513b.getClass();
                o oVar = m.f104512b;
                return Boolean.valueOf(oVar.b(p03, p13) && !oVar.b(p13, p03));
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                return Boolean.valueOf(((o) this.receiver).a(p03, p13));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f104519a) {
        }
        return h((b0) obj, (b0) obj2);
    }
}
