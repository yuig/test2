package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79638i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f79639j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(k kVar, int i13) {
        super(0);
        this.f79638i = i13;
        this.f79639j = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79638i;
        k kVar = this.f79639j;
        switch (i13) {
            case 0:
                return ((m) kVar).b();
            default:
                return new rh2.c(((m) kVar).b());
        }
    }
}
