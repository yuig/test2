package oq;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c0 f96965i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f96966j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f96967k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f96968l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f96969m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f96970n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f96971o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f96972p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f96973q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, List list, int i13, boolean z13, boolean z14, String str, float f13, float f14, boolean z15) {
        super(0);
        this.f96965i = c0Var;
        this.f96966j = list;
        this.f96967k = i13;
        this.f96968l = z13;
        this.f96969m = z14;
        this.f96970n = str;
        this.f96971o = f13;
        this.f96972p = f14;
        this.f96973q = z15;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f96965i.r(this.f96966j, this.f96967k, this.f96968l, this.f96969m, this.f96970n, this.f96971o, this.f96972p, this.f96973q);
        return Unit.f80348a;
    }
}
