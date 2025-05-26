package ro2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: j, reason: collision with root package name */
    public static final p f109028j = new p(0);

    /* renamed from: k, reason: collision with root package name */
    public static final p f109029k = new p(1);

    /* renamed from: l, reason: collision with root package name */
    public static final p f109030l = new p(2);

    /* renamed from: m, reason: collision with root package name */
    public static final p f109031m = new p(3);

    /* renamed from: n, reason: collision with root package name */
    public static final p f109032n = new p(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109033i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i13) {
        super(0);
        this.f109033i = i13;
    }

    public final oo2.g b() {
        switch (this.f109033i) {
            case 0:
                return i0.f109010b;
            case 1:
                return a0.f108974b;
            case 2:
                return w.f109044b;
            case 3:
                return f0.f108987b;
            default:
                return h.f108992b;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f109033i) {
        }
        return b();
    }
}
