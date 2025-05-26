package i1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final f0 f70757j = new f0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final f0 f70758k = new f0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final f0 f70759l = new f0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final f0 f70760m = new f0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final f0 f70761n = new f0(4);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70762i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i13) {
        super(1);
        this.f70762i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f70762i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                return bool2;
            case 2:
                long j13 = ((b3.b1) obj).f21306a;
                return new j1.q(b3.b1.b(j13), b3.b1.c(j13));
            case 3:
                j1.q qVar = (j1.q) obj;
                float f13 = qVar.f74199a;
                float f14 = qVar.f74200b;
                return new b3.b1((Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L));
            default:
                return j1.e.q(0.0f, 0.0f, null, 7);
        }
    }
}
