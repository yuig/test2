package r1;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final j f105916j = new j(0);

    /* renamed from: k, reason: collision with root package name */
    public static final j f105917k = new j(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105918i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13) {
        super(2);
        this.f105918i = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f105918i) {
            case 0:
                ((Number) obj2).intValue();
                return new d(kh2.w.g(1));
            default:
                p0 p0Var = (p0) obj2;
                return kotlin.collections.f0.j(Integer.valueOf(p0Var.f105955b.f105888a.h()), Integer.valueOf(p0Var.f105955b.f105889b.h()));
        }
    }
}
