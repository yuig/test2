package com.pinterest.feature.board.organize;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bk.m;
import com.google.android.material.card.MaterialCardView;
import com.pinterest.ui.components.sections.LegoSectionRep;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import nt.c2;
import yk1.n;

/* loaded from: classes5.dex */
public final class l extends MaterialCardView implements n, y92.i, ar0.d {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f45288u = 0;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f45289p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakReference f45290q;

    /* renamed from: r, reason: collision with root package name */
    public final LegoSectionRep f45291r;

    /* renamed from: s, reason: collision with root package name */
    public final ImageView f45292s;

    /* renamed from: t, reason: collision with root package name */
    public final c2 f45293t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, WeakReference weakReference) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45289p = true;
        this.f45290q = weakReference;
        LegoSectionRep legoSectionRep = new LegoSectionRep(context);
        this.f45291r = legoSectionRep;
        this.f45293t = new c2(this, 17);
        bk.l lVar = new bk.l();
        bk.l lVar2 = new bk.l();
        bk.l lVar3 = new bk.l();
        bk.l lVar4 = new bk.l();
        bk.a aVar = new bk.a(0.0f);
        bk.a aVar2 = new bk.a(0.0f);
        bk.a aVar3 = new bk.a(0.0f);
        bk.a aVar4 = new bk.a(0.0f);
        bk.f fVar = new bk.f();
        bk.f fVar2 = new bk.f();
        bk.f fVar3 = new bk.f();
        bk.f fVar4 = new bk.f();
        float W = bs1.c.W(this, eo1.c.image_corner_radius_xl);
        m mVar = new m();
        mVar.f23078a = lVar;
        mVar.f23079b = lVar2;
        mVar.f23080c = lVar3;
        mVar.f23081d = lVar4;
        mVar.f23082e = aVar;
        mVar.f23083f = aVar2;
        mVar.f23084g = aVar3;
        mVar.f23085h = aVar4;
        mVar.f23086i = fVar;
        mVar.f23087j = fVar2;
        mVar.f23088k = fVar3;
        mVar.f23089l = fVar4;
        mVar.c(W);
        Y0(mVar.a());
        l(0.0f);
        addView(legoSectionRep);
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(bs1.c.W(imageView, eo1.c.space_600), bs1.c.W(imageView, eo1.c.space_600)));
        imageView.setOnTouchListener(new j(0, imageView, this));
        bs1.c.R1(imageView, true);
        this.f45292s = imageView;
        addView(imageView);
        int W2 = bs1.c.W(this, eo1.c.space_100);
        Intrinsics.checkNotNullParameter(this, "<this>");
        s(W2, W2, W2, W2);
    }

    @Override // ar0.d
    /* renamed from: isDragAndDropEnabledForItem */
    public final boolean getF45303h() {
        return this.f45289p;
    }

    @Override // ar0.d
    public final void onItemDragEnd(int i13) {
        L(false);
        l(0.0f);
    }

    @Override // ar0.d
    public final void onItemDragStart() {
        L(true);
    }
}
