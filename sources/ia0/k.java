package ia0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71973i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f71974j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13, int i14) {
        super(0);
        this.f71973i = i14;
        this.f71974j = i13;
    }

    public final Integer b() {
        int i13 = this.f71973i;
        int i14 = this.f71974j;
        switch (i13) {
            case 0:
                return Integer.valueOf(i14);
            case 1:
                return Integer.valueOf(i14);
            default:
                return Integer.valueOf(ml2.c.c((i14 * 1.0f) / 0.5625f));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f71973i) {
        }
        return b();
    }
}
