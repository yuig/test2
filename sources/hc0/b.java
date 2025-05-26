package hc0;

import android.widget.ImageView;
import i2.o;
import i2.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68689i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f68690j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f68691k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ImageView.ScaleType f68692l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f68693m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f68694n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f68695o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, q qVar, ImageView.ScaleType scaleType, Function1 function1, int i13, int i14, int i15) {
        super(2);
        this.f68689i = i15;
        this.f68690j = str;
        this.f68691k = qVar;
        this.f68692l = scaleType;
        this.f68693m = function1;
        this.f68694n = i13;
        this.f68695o = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f68689i;
        int i15 = this.f68694n;
        switch (i14) {
            case 0:
                int p13 = u.p(i15 | 1);
                dl2.b.f(this.f68690j, this.f68691k, this.f68692l, this.f68693m, oVar, p13, this.f68695o);
                break;
            default:
                int p14 = u.p(i15 | 1);
                dl2.b.h(this.f68690j, this.f68691k, this.f68692l, this.f68693m, oVar, p14, this.f68695o);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f68689i) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
