package qa2;

import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes4.dex */
public final class r1 extends androidx.recyclerview.widget.j0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ os.f f103350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GridLayoutManager f103351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.j0 f103352e;

    public r1(os.f fVar, GridLayoutManager gridLayoutManager, androidx.recyclerview.widget.j0 j0Var) {
        this.f103350c = fVar;
        this.f103351d = gridLayoutManager;
        this.f103352e = j0Var;
    }

    @Override // androidx.recyclerview.widget.j0
    public final int c(int i13) {
        int c13;
        os.f fVar = this.f103350c;
        if (fVar.L(i13)) {
            return this.f103351d.F;
        }
        if (i13 < fVar.f97495d.e() && (c13 = this.f103352e.c(i13)) != 1) {
            return c13;
        }
        return 1;
    }
}
