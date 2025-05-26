package nt;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f92181i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ zq.a f92182j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m60.w f92183k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(zq.a aVar, m60.w wVar, int i13) {
        super(1);
        this.f92181i = i13;
        this.f92182j = aVar;
        this.f92183k = wVar;
    }

    public final void b(e1 dropDownQuestion) {
        int i13 = this.f92181i;
        zq.a aVar = this.f92182j;
        m60.w wVar = this.f92183k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(dropDownQuestion, "dropDownQuestion");
                zq.a.a(aVar, wVar, dropDownQuestion, new s1(wVar, dropDownQuestion, 1));
                break;
            default:
                Intrinsics.checkNotNullParameter(dropDownQuestion, "dropDownQuestion");
                zq.a.a(aVar, wVar, dropDownQuestion, new s1(wVar, dropDownQuestion, 3));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f92181i) {
            case 0:
                b((e1) obj);
                break;
            default:
                b((e1) obj);
                break;
        }
        return Unit.f80348a;
    }
}
