package jn1;

import android.view.View;
import bm1.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77095a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f77096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f77097c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f77098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f77099e;

    public /* synthetic */ a(float f13, View view, i iVar, b bVar) {
        this.f77096b = f13;
        this.f77097c = view;
        this.f77098d = iVar;
        this.f77099e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f77099e;
        int i13 = this.f77095a;
        float f13 = this.f77096b;
        Object obj2 = this.f77098d;
        Object obj3 = this.f77097c;
        switch (i13) {
            case 0:
                View this_apply = (View) obj3;
                i this$0 = (i) obj2;
                b animationSpeed = (b) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(animationSpeed, "$animationSpeed");
                if (f13 == 0.0f) {
                    f13 = this_apply.getHeight();
                }
                this_apply.setTranslationY(0.0f);
                f fVar = new f(f13, this$0, this_apply);
                fVar.setDuration(this_apply.getResources().getInteger(animationSpeed.getSpeed()));
                fVar.setAnimationListener(new g(this$0));
                this_apply.startAnimation(fVar);
                break;
            default:
                ca2.e this$02 = (ca2.e) obj3;
                ca2.c cVar = (ca2.c) obj2;
                String actionSource = (String) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(actionSource, "$actionSource");
                View view = this$02.f27254m;
                if (view != null) {
                    view.setTranslationY(0.0f);
                    ca2.d dVar = new ca2.d(f13, this$02, view, cVar);
                    dVar.setDuration(view.getResources().getInteger(this$02.f27244c));
                    dVar.setAnimationListener(new p(1, this$02, actionSource));
                    view.startAnimation(dVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a(ca2.e eVar, float f13, ca2.c cVar, String str) {
        this.f77097c = eVar;
        this.f77096b = f13;
        this.f77098d = cVar;
        this.f77099e = str;
    }
}
