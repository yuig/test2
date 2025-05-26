package j1;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class f2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74061i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f74062j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f74063k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f74064l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(Object obj, Object obj2, int i13, int i14) {
        super(2);
        this.f74061i = i14;
        this.f74064l = obj;
        this.f74062j = obj2;
        this.f74063k = i13;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f74061i;
        int i15 = this.f74063k;
        Object obj = this.f74062j;
        Object obj2 = this.f74064l;
        switch (i14) {
            case 0:
                ((g2) obj2).a(obj, oVar, i2.u.p(i15 | 1));
                break;
            case 1:
                ((q2.h) obj2).b(obj, oVar, i2.u.p(i15) | 1);
                break;
            case 2:
                AndroidCompositionLocals_androidKt.a((t3.c0) obj2, (Function2) obj, oVar, i2.u.p(i15 | 1));
                break;
            default:
                br1.e0.c((p1.u) obj2, (br1.f0) obj, oVar, i2.u.p(i15 | 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f74061i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
