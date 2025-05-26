package tc0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117342i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f117343j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f117344k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u2.q f117345l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f117346m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f117347n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f117348o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i13, List list, String str, u2.q qVar, Function1 function1, int i14, int i15) {
        super(2);
        this.f117342i = i13;
        this.f117343j = list;
        this.f117344k = str;
        this.f117345l = qVar;
        this.f117346m = function1;
        this.f117347n = i14;
        this.f117348o = i15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f117347n | 1);
        u2.q qVar = this.f117345l;
        Function1 function1 = this.f117346m;
        kh2.j.h(this.f117342i, this.f117343j, this.f117344k, qVar, function1, (i2.o) obj, p13, this.f117348o);
        return Unit.f80348a;
    }
}
