package m7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements d7.r, ak2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f86496c;

    public /* synthetic */ z(Object obj, int i13, int i14) {
        this.f86494a = i14;
        this.f86496c = obj;
        this.f86495b = i13;
    }

    @Override // ak2.c
    public final Object apply(Object obj, Object obj2) {
        String str = (String) this.f86496c;
        Throwable error = (Throwable) obj;
        Integer num = (Integer) obj2;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(error, "error");
        if (!og0.b.b(str, error)) {
            throw error;
        }
        if (intValue <= this.f86495b) {
            return num;
        }
        throw error;
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        int i13 = this.f86494a;
        int i14 = this.f86495b;
        Object obj2 = this.f86496c;
        switch (i13) {
            case 0:
                ((a7.t0) obj).s5(((o1) obj2).f86330a, i14);
                break;
            default:
                ((a7.t0) obj).o((a7.i0) obj2, i14);
                break;
        }
    }
}
