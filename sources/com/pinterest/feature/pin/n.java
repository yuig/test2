package com.pinterest.feature.pin;

import android.view.ViewTreeObserver;
import com.pinterest.api.model.f30;
import java.util.Set;

/* loaded from: classes5.dex */
public final class n implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r70.a f47242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f47243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f30 f47244c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f47245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RepinAnimationData f47246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f47247f;

    public n(r70.a aVar, o oVar, f30 f30Var, Set set, RepinAnimationData repinAnimationData, boolean z13) {
        this.f47242a = aVar;
        this.f47243b = oVar;
        this.f47244c = f30Var;
        this.f47245d = set;
        this.f47246e = repinAnimationData;
        this.f47247f = z13;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        r70.a aVar = this.f47242a;
        if (aVar.a()) {
            this.f47243b.c(this.f47244c, this.f47245d, this.f47246e, this.f47247f);
            aVar.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
