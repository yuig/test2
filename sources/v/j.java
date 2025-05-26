package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Toast;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.gestalt.toast.GestaltToast;
import com.pinterest.ui.imageview.WebImageView;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f123516c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f123517d;

    public /* synthetic */ j(int i13, String str, Function1 function1) {
        this.f123514a = 10;
        this.f123516c = i13;
        this.f123515b = str;
        this.f123517d = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i13 = this.f123514a;
        int i14 = this.f123516c;
        Object obj = this.f123517d;
        Object obj2 = this.f123515b;
        switch (i13) {
            case 0:
                ((androidx.camera.core.impl.n) obj2).c(i14, (androidx.camera.core.impl.r) obj);
                break;
            case 1:
                ((androidx.camera.core.impl.n) obj2).b(i14, (androidx.camera.core.impl.z) obj);
                break;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((w.e) obj2).f126919b).onCaptureSequenceAborted((CameraCaptureSession) obj, i14);
                break;
            case 3:
                ((CameraDevice.StateCallback) ((u) obj2).f123682b).onError((CameraDevice) obj, i14);
                break;
            case 4:
                Pair pair = (Pair) obj;
                ((n7.c0) ((m7.j1) obj2).f86222b.f86322h).i(((Integer) pair.first).intValue(), (g8.e0) pair.second, i14);
                break;
            case 5:
                s7.m mVar = (s7.m) obj2;
                ((s7.n) obj).i(mVar.f111327a, mVar.f111328b, i14);
                break;
            case 6:
                ((ha.d) ((ha.a) obj2).f68319d).i(i14, obj);
                break;
            case 7:
                ((ha.d) obj2).i(i14, obj);
                break;
            case 8:
                com.google.common.util.concurrent.b0 b0Var = com.google.common.util.concurrent.i.f33565j;
                ((com.google.common.util.concurrent.i) obj2).K(i14, (com.google.common.util.concurrent.c0) obj);
                break;
            case 9:
                qb0.a this$0 = (qb0.a) obj2;
                Function1 callback = (Function1) obj;
                LinkedHashMap linkedHashMap = qb0.a.f103388a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(callback, "$callback");
                this$0.getClass();
                wj2.c.a().b(new j(i14, qb0.j.b(i14), callback));
                break;
            case 10:
                String formattedNumber = (String) obj2;
                Function1 callback2 = (Function1) obj;
                LinkedHashMap linkedHashMap2 = qb0.a.f103388a;
                Intrinsics.checkNotNullParameter(formattedNumber, "$formattedNumber");
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                qb0.a.f103388a.put(Integer.valueOf(i14), formattedNumber);
                callback2.invoke(formattedNumber);
                break;
            case 11:
                a41.r this$02 = (a41.r) obj2;
                a41.o0 tabState = (a41.o0) obj;
                int i15 = a41.r.P1;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(tabState, "$tabState");
                this$02.v8(tabState, i14);
                break;
            case 12:
                de1.x this$03 = (de1.x) obj2;
                zd1.h it = (zd1.h) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it, "$it");
                this$03.u1(i14, it);
                break;
            case 13:
                de1.a0 this$04 = (de1.a0) obj2;
                zd1.h it2 = (zd1.h) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(it2, "$it");
                this$04.u1(i14, it2);
                break;
            case 14:
                WebImageView currentImage = (WebImageView) obj2;
                gh1.b this$05 = (gh1.b) obj;
                int i16 = gh1.b.f64999r;
                Intrinsics.checkNotNullParameter(currentImage, "$currentImage");
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                currentImage.setVisibility(8);
                this$05.L(i14);
                break;
            case 15:
                jn1.i this$06 = (jn1.i) obj2;
                Animation.AnimationListener animationListener = (Animation.AnimationListener) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                BottomSheetBehavior bottomSheetBehavior = this$06.f77118i;
                if (bottomSheetBehavior != null && (view = this$06.f77117h) != null) {
                    bottomSheetBehavior.W(i14);
                    if (i14 == 0) {
                        i14 = view.getHeight();
                    }
                    view.setTranslationY(view.getHeight());
                    jn1.h hVar = new jn1.h(i14, view, this$06, 0);
                    hVar.setDuration(view.getResources().getInteger(hn1.u.anim_speed_fast));
                    if (animationListener != null) {
                        hVar.setAnimationListener(animationListener);
                    }
                    view.startAnimation(hVar);
                    this$06.c(h32.f1.BOTTOM_SHEET_SNAP_DEFAULT, jn1.c.INITIAL_SLIDE_UP);
                    break;
                }
                break;
            default:
                i92.k this$07 = (i92.k) obj2;
                GestaltToast gestaltToast = (GestaltToast) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(gestaltToast, "$gestaltToast");
                Toast toast = new Toast(this$07.f71939c);
                toast.setView(gestaltToast);
                toast.setGravity(i14 | 1, 0, 0);
                toast.setDuration(1);
                toast.show();
                break;
        }
    }

    public /* synthetic */ j(Object obj, int i13, Object obj2, int i14) {
        this.f123514a = i14;
        this.f123515b = obj;
        this.f123516c = i13;
        this.f123517d = obj2;
    }

    public /* synthetic */ j(Object obj, Object obj2, int i13, int i14) {
        this.f123514a = i14;
        this.f123515b = obj;
        this.f123517d = obj2;
        this.f123516c = i13;
    }
}
