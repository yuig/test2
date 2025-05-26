package mr;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import ja.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import sa.c;
import u81.m;
import ua.m0;

/* loaded from: classes3.dex */
public final class a extends PinterestToastContainer {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f88074g = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f88075e;

    /* renamed from: f, reason: collision with root package name */
    public final m f88076f;

    public a(ye2.m mVar, m mVar2) {
        super(mVar, null);
        this.f88075e = 1500;
        this.f88076f = mVar2;
    }

    @Override // com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer
    public final int c() {
        return getResources().getDimensionPixelSize(uc2.b.lens_edu_bottom_margin);
    }

    @Override // com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer
    public final float d() {
        return hf0.b.f69002b;
    }

    @Override // com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer
    public final int e() {
        return this.f88075e;
    }

    @Override // com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer
    public final void h(int i13, GestaltToast v13, ArrayList previousChildren) {
        Intrinsics.checkNotNullParameter(v13, "v");
        Intrinsics.checkNotNullParameter(previousChildren, "previousChildren");
        v13.postDelayed(new y(this, v13, previousChildren, 9), i13);
        a(v13);
    }

    @Override // com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer
    public final void i(View v13) {
        Intrinsics.checkNotNullParameter(v13, "v");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v13, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration(500L);
        ofFloat.addListener(new c(this, v13, 2));
        ofFloat.start();
    }

    @Override // com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer
    public final void j(int i13, View view, List list) {
        m mVar;
        ArrayList arrayList = this.f44922b;
        ObjectAnimator d03 = kg.a.d0(view, "translationY", c(), 0.0f, 0.75f, 0.25f);
        d03.addListener(new m0(7, this, list));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(d03, ofFloat);
        animatorSet.start();
        Intrinsics.checkNotNullExpressionValue(arrayList, "getStackableToasts(...)");
        if (true ^ arrayList.isEmpty()) {
            Intrinsics.checkNotNullExpressionValue(arrayList, "getStackableToasts(...)");
            if (!Intrinsics.d(view, (View) CollectionsKt.d0(arrayList)) || (mVar = this.f88076f) == null) {
                return;
            }
            animatorSet.addListener(new ir.b(mVar, 2));
        }
    }

    public final void m() {
        Iterator it = this.f44922b.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(0.0f);
        }
    }
}
