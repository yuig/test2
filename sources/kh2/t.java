package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79704i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f79705j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v vVar, int i13) {
        super(0);
        this.f79704i = i13;
        this.f79705j = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79704i;
        v vVar = this.f79705j;
        switch (i13) {
            case 0:
                return (xg2.a) vVar.f79720a.a(vVar, v.f79719d[0]);
            default:
                return new xg2.c((xg2.a) vVar.f79720a.a(vVar, v.f79719d[0]));
        }
    }
}
