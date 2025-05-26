package p21;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q21.h;
import yk1.n;
import yk1.r;

/* loaded from: classes5.dex */
public final class g extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final o21.g f98718a;

    /* renamed from: b, reason: collision with root package name */
    public final List f98719b;

    /* renamed from: c, reason: collision with root package name */
    public final o21.e f98720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o21.g viewModel) {
        super(viewModel.f92835k, viewModel.f92836l);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        List pinCells = viewModel.f92833i;
        Intrinsics.checkNotNullParameter(pinCells, "pinCells");
        o21.e pinRowDecoration = viewModel.f92838n;
        Intrinsics.checkNotNullParameter(pinRowDecoration, "pinRowDecoration");
        this.f98718a = viewModel;
        this.f98719b = pinCells;
        this.f98720c = pinRowDecoration;
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        o21.f view = (o21.f) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "sizeListener");
        ((h) view).f102158c = this;
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        o21.f view = (o21.f) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "sizeListener");
        ((h) view).f102158c = this;
    }
}
