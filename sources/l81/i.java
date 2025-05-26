package l81;

import c71.b0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class i extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82142i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f82143j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b0 f82144k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, b0 b0Var, int i13) {
        super(0);
        this.f82142i = i13;
        this.f82143j = lVar;
        this.f82144k = b0Var;
    }

    public final b0 b() {
        int i13 = this.f82142i;
        l lVar = this.f82143j;
        switch (i13) {
            case 0:
                String str = lVar.f82187u1;
                return b0.a(this.f82144k, null, null, null, "hs", null, null, false, null, null, null, null, null, null, null, null, null, null, null, lVar.f82185t1, str, null, null, -1025, 1900543);
            default:
                String str2 = lVar.f82187u1;
                return b0.a(this.f82144k, null, null, null, "hs", null, null, false, null, null, null, null, null, null, null, null, null, null, null, lVar.f82185t1, str2, null, null, -1025, 1900543);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f82142i) {
        }
        return b();
    }
}
