package s90;

import android.view.View;
import com.pinterest.design.brio.widget.progress.LoadingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f112017r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f112018s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f112018s = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        s sVar = new s(this.f112018s, cVar);
        sVar.f112017r = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f112017r;
        int i13 = v.f112028l0;
        v vVar = this.f112018s;
        vVar.getClass();
        vVar.f112036j0 = aVar2.f111961e;
        u62.c cVar = aVar2.f111957a.f112157a;
        if (cVar != null) {
            bn0.a aVar3 = vVar.f112035i0;
            if (aVar3 == null) {
                Intrinsics.r("cutoutEditorViewHelper");
                throw null;
            }
            aVar3.n(cVar);
        }
        if (aVar2.f111959c) {
            View view = vVar.f112033g0;
            if (view == null) {
                Intrinsics.r("savingOverlay");
                throw null;
            }
            if (view.getVisibility() != 0) {
                View view2 = vVar.f112033g0;
                if (view2 == null) {
                    Intrinsics.r("savingOverlay");
                    throw null;
                }
                kg.a.s(view2, 0L, null, 6);
                LoadingView loadingView = vVar.f112034h0;
                if (loadingView == null) {
                    Intrinsics.r("savingOverlayLoadingView");
                    throw null;
                }
                loadingView.g2(se0.f.LOADING);
            }
        } else {
            View view3 = vVar.f112033g0;
            if (view3 == null) {
                Intrinsics.r("savingOverlay");
                throw null;
            }
            if (view3.getVisibility() == 0) {
                View view4 = vVar.f112033g0;
                if (view4 == null) {
                    Intrinsics.r("savingOverlay");
                    throw null;
                }
                bs1.c.X0(view4);
                LoadingView loadingView2 = vVar.f112034h0;
                if (loadingView2 == null) {
                    Intrinsics.r("savingOverlayLoadingView");
                    throw null;
                }
                loadingView2.g2(se0.f.NONE);
            }
        }
        vVar.f112031e0.setValue(aVar2.f111960d);
        vVar.f112032f0.setValue(aVar2.f111958b);
        return Unit.f80348a;
    }
}
