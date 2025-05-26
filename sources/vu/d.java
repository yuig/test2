package vu;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.o0;

/* loaded from: classes3.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126644i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f126645j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(o0 o0Var, int i13) {
        super(1);
        this.f126644i = i13;
        this.f126645j = o0Var;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f126644i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, this.f126645j, null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f126644i) {
        }
        return b((rn1.a) obj);
    }
}
