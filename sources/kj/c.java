package kj;

import android.view.View;
import androidx.appcompat.app.z;
import com.airbnb.lottie.k;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79820a;

    /* renamed from: b, reason: collision with root package name */
    public int f79821b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f79822c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f79823d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f79824e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BottomSheetBehavior bottomSheetBehavior, int i13) {
        this(bottomSheetBehavior);
        this.f79820a = 0;
    }

    public final void a(int i13) {
        switch (this.f79820a) {
            case 0:
                WeakReference weakReference = ((BottomSheetBehavior) this.f79824e).U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f79821b = i13;
                    if (!this.f79822c) {
                        View view = (View) ((BottomSheetBehavior) this.f79824e).U.get();
                        Runnable runnable = (Runnable) this.f79823d;
                        WeakHashMap weakHashMap = v0.f102521a;
                        view.postOnAnimation(runnable);
                        this.f79822c = true;
                        break;
                    }
                }
                break;
            default:
                WeakReference weakReference2 = ((SideSheetBehavior) this.f79824e).f33034p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f79821b = i13;
                    if (!this.f79822c) {
                        View view2 = (View) ((SideSheetBehavior) this.f79824e).f33034p.get();
                        Runnable runnable2 = (Runnable) this.f79823d;
                        WeakHashMap weakHashMap2 = v0.f102521a;
                        view2.postOnAnimation(runnable2);
                        this.f79822c = true;
                        break;
                    }
                }
                break;
        }
    }

    public c(SideSheetBehavior sideSheetBehavior) {
        this.f79820a = 1;
        this.f79824e = sideSheetBehavior;
        this.f79823d = new k(this, 17);
    }

    public c(BottomSheetBehavior bottomSheetBehavior) {
        this.f79820a = 0;
        this.f79824e = bottomSheetBehavior;
        this.f79823d = new z(this, 27);
    }
}
