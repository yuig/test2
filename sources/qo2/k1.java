package qo2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104580i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0 f104581j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ no2.a f104582k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f104583l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(r0 r0Var, no2.a aVar, Object obj, int i13) {
        super(0);
        this.f104580i = i13;
        this.f104581j = r0Var;
        this.f104582k = aVar;
        this.f104583l = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f104580i;
        r0 r0Var = this.f104581j;
        no2.a deserializer = this.f104582k;
        switch (i13) {
            case 0:
                if (deserializer.a().b() || r0Var.A()) {
                    r0Var.getClass();
                    Intrinsics.checkNotNullParameter(deserializer, "deserializer");
                    break;
                }
                break;
            default:
                r0Var.getClass();
                Intrinsics.checkNotNullParameter(deserializer, "deserializer");
                break;
        }
        return r0Var.m(deserializer);
    }
}
