package ua2;

import android.content.Context;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ LegoPinGridCell f121522i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f121523j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f121524k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ vn1.c f121525l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f121526m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f121527n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f121528o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f121529p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f121530q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LegoPinGridCellImpl legoPinGridCellImpl, int i13, l lVar, vn1.c cVar, int i14, int i15, int i16, int i17, float f13) {
        super(0);
        this.f121522i = legoPinGridCellImpl;
        this.f121523j = i13;
        this.f121524k = lVar;
        this.f121525l = cVar;
        this.f121526m = i14;
        this.f121527n = i15;
        this.f121528o = i16;
        this.f121529p = i17;
        this.f121530q = f13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f121522i.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l lVar = this.f121524k;
        String str = lVar.f121549h;
        c72.o oVar = new c72.o(lVar, 11);
        return new va2.a(context, this.f121523j, str, this.f121525l, this.f121526m, this.f121527n, this.f121528o, this.f121529p, this.f121530q, oVar);
    }
}
