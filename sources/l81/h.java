package l81;

import android.graphics.Rect;
import android.graphics.RectF;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.view.MaskedWebImageView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f82135i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f82136j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f82137k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f82138l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f82139m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f82140n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f82141o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, float f13, float f14, float f15, float f16, boolean z13, String str) {
        super(0);
        this.f82135i = lVar;
        this.f82136j = f13;
        this.f82137k = f14;
        this.f82138l = f15;
        this.f82139m = f16;
        this.f82140n = z13;
        this.f82141o = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WebImageView j13;
        i81.c cVar;
        l lVar = this.f82135i;
        f91.b bVar = lVar.E1;
        if (bVar != null && (j13 = bVar.j()) != null && (cVar = lVar.f82177p1) != null) {
            int i13 = MaskedWebImageView.f52675x0;
            Rect imageBounds = gi2.b.i0(j13);
            int i14 = lVar.f82158f2;
            com.pinterest.feature.search.visual.cropper.m mVar = lVar.K1;
            int i15 = mVar != null ? mVar.f47997h.f47953a : 0;
            Boolean valueOf = Boolean.valueOf(this.f82140n);
            k81.l lVar2 = (k81.l) cVar;
            Intrinsics.checkNotNullParameter(imageBounds, "imageBounds");
            float f13 = this.f82136j;
            float f14 = this.f82137k;
            float f15 = this.f82138l;
            float f16 = this.f82139m;
            Pair u33 = lVar2.u3(f13, f14, f15, f16, imageBounds, i14, i15);
            lVar2.B3(f13, f14, f15, f16, (RectF) u33.f80346a, (RectF) u33.f80347b, valueOf, this.f82141o, false, true);
            lVar2.K3(false);
        }
        return Unit.f80348a;
    }
}
