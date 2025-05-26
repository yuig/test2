package ej0;

import i2.o;
import i2.u;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class e extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f59088i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f59089j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f59090k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f59091l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f59092m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, String str, boolean z13, int i13, int i14) {
        super(2);
        this.f59088i = qVar;
        this.f59089j = str;
        this.f59090k = z13;
        this.f59091l = i13;
        this.f59092m = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = u.p(this.f59091l | 1);
        String str = this.f59089j;
        boolean z13 = this.f59090k;
        k3.c(this.f59088i, str, z13, (o) obj, p13, this.f59092m);
        return Unit.f80348a;
    }
}
