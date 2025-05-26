package kl0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80069i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f80070j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(f0 f0Var, int i13) {
        super(0);
        this.f80069i = i13;
        this.f80070j = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f80069i;
        f0 f0Var = this.f80070j;
        switch (i13) {
            case 0:
                return com.bumptech.glide.d.Z(f0Var, "com.pinterest.EXTRA_BOARD_ID", "");
            default:
                zo.a aVar = zo.c.Companion;
                zo.c cVar = zo.c.DEFAULT;
                int O = com.bumptech.glide.d.O(f0Var, "com.pinterest.EXTRA_BOARD_VIEW_TYPE", cVar.ordinal());
                aVar.getClass();
                return O != 0 ? O != 1 ? zo.c.DENSE : cVar : zo.c.SINGLE;
        }
    }
}
