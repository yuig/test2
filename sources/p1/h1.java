package p1;

import c2.j2;
import c2.r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class h1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98519i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f98520j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f98521k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(float f13, float f14, int i13) {
        super(1);
        this.f98519i = i13;
        this.f98520j = f13;
        this.f98521k = f14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f13 = this.f98520j;
        float f14 = this.f98521k;
        int i13 = this.f98519i;
        switch (i13) {
            case 4:
                r1 r1Var = (r1) obj;
                switch (i13) {
                    case 4:
                        r1Var.f25127a.put(j2.Closed, Float.valueOf(f13));
                        r1Var.f25127a.put(j2.Open, Float.valueOf(f14));
                        break;
                    default:
                        r1Var.f25127a.put(Boolean.FALSE, Float.valueOf(f13));
                        r1Var.f25127a.put(Boolean.TRUE, Float.valueOf(f14));
                        break;
                }
                break;
            default:
                r1 r1Var2 = (r1) obj;
                switch (i13) {
                    case 4:
                        r1Var2.f25127a.put(j2.Closed, Float.valueOf(f13));
                        r1Var2.f25127a.put(j2.Open, Float.valueOf(f14));
                        break;
                    default:
                        r1Var2.f25127a.put(Boolean.FALSE, Float.valueOf(f13));
                        r1Var2.f25127a.put(Boolean.TRUE, Float.valueOf(f14));
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
