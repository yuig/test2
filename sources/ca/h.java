package ca;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class h extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f27045j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f27046k = new h(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27047i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f27047i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f27047i) {
            case 0:
                u6.c initializer = (u6.c) obj;
                Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
                return new f();
            default:
                Pair it = (Pair) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return (String) it.f80346a;
        }
    }
}
