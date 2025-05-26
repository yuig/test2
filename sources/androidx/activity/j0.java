package androidx.activity;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class j0 extends x {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15910p = 0;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15911w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(q4.b bVar, boolean z13) {
        super(z13);
        this.f15911w = bVar;
    }

    @Override // androidx.activity.x
    public final void handleOnBackPressed() {
        int i13 = this.f15910p;
        Object obj = this.f15911w;
        switch (i13) {
            case 0:
                ((Function1) obj).invoke(this);
                break;
            default:
                ((z9.p) obj).p();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(z9.p pVar) {
        super(false);
        this.f15911w = pVar;
    }
}
