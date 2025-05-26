package com.pinterest.modiface;

import a91.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.modiface.mfecommon.camera.MFEAndroidCameraErrorCallback;
import com.modiface.mfecommon.camera.MFEAndroidCameraParameters;
import com.modiface.mfecommon.camera.MFEAndroidCameraParametersCallback;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.effects.MFEMakeupEyeshadowBaseLayer;
import com.modiface.mfemakeupkit.effects.MFEMakeupLayer;
import com.modiface.mfemakeupkit.effects.MFEMakeupLook;
import com.pinterest.component.camera.WhiteFlashView;
import com.pinterest.ui.view.TopBottomGradientView;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.w0;
import h32.x3;
import hf0.b;
import hf0.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kg.t;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import ut1.a;
import ut1.g;
import x81.j;
import x81.k;
import x81.l;
import yk1.i;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B'\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010>\u001a\u000207\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bp\u0010qJ\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\fJ\u000f\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\fJ-\u0010)\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b)\u0010*J#\u0010.\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b.\u0010/J#\u00105\u001a\u00020\b2\n\u00102\u001a\u000600R\u0002012\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J'\u0010\u000b\u001a\u00020\b2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b\u000b\u0010<J\u000f\u0010=\u001a\u00020\bH\u0002¢\u0006\u0004\b=\u0010\fR\u0014\u0010>\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010K\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\u0016R\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010h\u001a\u00020g8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0016\u0010o\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006r"}, d2 = {"Lcom/pinterest/modiface/MFEMakeupView;", "Landroid/widget/FrameLayout;", "Lx81/k;", "Lcom/modiface/mfemakeupkit/MFEMakeupEngine$MFEMakeupEngineErrorCallback;", "Lcom/modiface/mfecommon/camera/MFEAndroidCameraErrorCallback;", "Lcom/modiface/mfecommon/camera/MFEAndroidCameraParametersCallback;", "Landroid/graphics/Bitmap;", "photo", "", "loadMakeupEngineResourceWithPhoto", "(Landroid/graphics/Bitmap;)V", "loadMakeupEngineResourcesAndStartCamera", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lnx/d0;", "pinalytics", "setPinalytics", "(Lnx/d0;)V", "Lx81/l;", "listener", "setTryOnViewListener", "(Lx81/l;)V", "Lx81/g;", "viewModel", "updateLipstick", "(Lx81/g;)V", "updateEyeshadow", "clearLipLayer", "clearEyeLayer", "takePhoto", "resumeCamera", "pauseCamera", "playHapticFeedback", "Lcom/modiface/mfemakeupkit/MFEMakeupEngine$ErrorSeverity;", "severity", "Lcom/modiface/mfemakeupkit/MFEMakeupEngine$ErrorType;", "errorType", "Ljava/util/ArrayList;", "", "errors", "onMakeupEngineError", "(Lcom/modiface/mfemakeupkit/MFEMakeupEngine$ErrorSeverity;Lcom/modiface/mfemakeupkit/MFEMakeupEngine$ErrorType;Ljava/util/ArrayList;)V", "", "errorMessage", "cause", "onCameraFailedToStart", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "parameters", "Lcom/modiface/mfecommon/camera/MFEAndroidCameraParameters;", "mfeParameters", "onCameraSetParameters", "(Landroid/hardware/Camera$Parameters;Lcom/modiface/mfecommon/camera/MFEAndroidCameraParameters;)V", "Landroid/content/Context;", "context", "contextWithFaceTrackerBundle", "Lcom/modiface/mfemakeupkit/MFEMakeupEngine;", "engine", "(Landroid/content/Context;Landroid/content/Context;Lcom/modiface/mfemakeupkit/MFEMakeupEngine;)V", "displayErrorToast", "packageContext", "Landroid/content/Context;", "Lnx/d0;", "Li92/k;", "toastUtils", "Li92/k;", "Lx81/j;", "tryOnCameraState", "Lx81/j;", "getTryOnCameraState", "()Lx81/j;", "setTryOnCameraState", "(Lx81/j;)V", "tryOnListener", "Lx81/l;", "getTryOnListener", "()Lx81/l;", "setTryOnListener", "Lcom/modiface/mfemakeupkit/widgets/MFEMakeupView;", "makeupCameraView", "Lcom/modiface/mfemakeupkit/widgets/MFEMakeupView;", "Lcom/pinterest/component/camera/WhiteFlashView;", "whiteFlash", "Lcom/pinterest/component/camera/WhiteFlashView;", "Lcom/pinterest/ui/view/TopBottomGradientView;", "makeupCameraGradient", "Lcom/pinterest/ui/view/TopBottomGradientView;", "makeupEngine", "Lcom/modiface/mfemakeupkit/MFEMakeupEngine;", "", "isTakingPhoto", "Z", "", "minValueCameraWidth", "F", "Lhf0/c;", "deviceInfoProvider", "Lhf0/c;", "Lcom/modiface/mfemakeupkit/effects/MFEMakeupLook;", "currentMakeupLook", "Lcom/modiface/mfemakeupkit/effects/MFEMakeupLook;", "Lh32/d4;", "viewType", "Lh32/d4;", "getViewType", "()Lh32/d4;", "Landroid/view/ViewParent;", "getViewParent", "()Landroid/view/ViewParent;", "viewParent", "<init>", "(Landroid/content/Context;Landroid/content/Context;Lnx/d0;Li92/k;)V", "modiface_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class MFEMakeupView extends FrameLayout implements k, MFEMakeupEngine.MFEMakeupEngineErrorCallback, MFEAndroidCameraErrorCallback, MFEAndroidCameraParametersCallback {
    private MFEMakeupLook currentMakeupLook;

    @NotNull
    private final c deviceInfoProvider;
    private boolean isTakingPhoto;

    @NotNull
    private final TopBottomGradientView makeupCameraGradient;

    @NotNull
    private final com.modiface.mfemakeupkit.widgets.MFEMakeupView makeupCameraView;
    private MFEMakeupEngine makeupEngine;
    private final float minValueCameraWidth;

    @NotNull
    private final Context packageContext;

    @NotNull
    private final d0 pinalytics;

    @NotNull
    private final i92.k toastUtils;

    @NotNull
    private j tryOnCameraState;
    private l tryOnListener;

    @NotNull
    private final d4 viewType;

    @NotNull
    private final WhiteFlashView whiteFlash;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed A[Catch: Exception -> 0x0122, TryCatch #0 {Exception -> 0x0122, blocks: (B:9:0x00c0, B:11:0x00d3, B:14:0x00d9, B:18:0x00ed, B:23:0x0108, B:26:0x00df, B:29:0x00e5), top: B:8:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0108 A[Catch: Exception -> 0x0122, TRY_LEAVE, TryCatch #0 {Exception -> 0x0122, blocks: (B:9:0x00c0, B:11:0x00d3, B:14:0x00d9, B:18:0x00ed, B:23:0x0108, B:26:0x00df, B:29:0x00e5), top: B:8:0x00c0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MFEMakeupView(@org.jetbrains.annotations.NotNull android.content.Context r18, @org.jetbrains.annotations.NotNull android.content.Context r19, @org.jetbrains.annotations.NotNull nx.d0 r20, @org.jetbrains.annotations.NotNull i92.k r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.modiface.MFEMakeupView.<init>(android.content.Context, android.content.Context, nx.d0, i92.k):void");
    }

    public static final void _init_$lambda$7(MFEMakeupView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        l tryOnListener = this$0.getTryOnListener();
        if (tryOnListener != null) {
            ((d) tryOnListener).p3();
        }
    }

    private final void displayErrorToast() {
        this.toastUtils.m("Something's not right. Restart Pinterest to try again.");
    }

    public static final void loadMakeupEngineResourcesAndStartCamera$lambda$9$lambda$8() {
    }

    public static final void takePhoto$lambda$18(Camera.Parameters parameters) {
    }

    public static final void takePhoto$lambda$21(MFEMakeupView this$0, Bitmap bitmap, Bitmap bitmap2, Throwable th3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.post(new ut1.c(0, bitmap2, this$0));
        this$0.isTakingPhoto = false;
    }

    public static final void takePhoto$lambda$21$lambda$20(Bitmap bitmap, MFEMakeupView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bitmap != null) {
            l tryOnListener = this$0.getTryOnListener();
            if (tryOnListener != null) {
                ((d) tryOnListener).s3(bitmap);
            }
            this$0.isTakingPhoto = false;
        }
    }

    @Override // x81.k
    public void clearEyeLayer() {
        ArrayList<MFEMakeupEyeshadowBaseLayer> arrayList;
        MFEMakeupLook mFEMakeupLook = this.currentMakeupLook;
        if (mFEMakeupLook != null && (arrayList = mFEMakeupLook.eyeShadowLayers) != null) {
            arrayList.clear();
        }
        MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
        if (mFEMakeupEngine != null) {
            mFEMakeupEngine.setMakeupLook(this.currentMakeupLook);
        }
    }

    @Override // x81.k
    public void clearLipLayer() {
        ArrayList<MFEMakeupLayer> arrayList;
        MFEMakeupLook mFEMakeupLook = this.currentMakeupLook;
        if (mFEMakeupLook != null && (arrayList = mFEMakeupLook.lipLayers) != null) {
            arrayList.clear();
        }
        MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
        if (mFEMakeupEngine != null) {
            mFEMakeupEngine.setMakeupLook(this.currentMakeupLook);
        }
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public /* bridge */ /* synthetic */ HashMap getO0() {
        return null;
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public /* bridge */ /* synthetic */ g0 getF73409e1() {
        return null;
    }

    public /* bridge */ /* synthetic */ w0 getEventData() {
        return null;
    }

    @NotNull
    public final j getTryOnCameraState() {
        return this.tryOnCameraState;
    }

    @Override // x81.k
    public l getTryOnListener() {
        return this.tryOnListener;
    }

    public /* bridge */ /* synthetic */ x3 getViewData() {
        return null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public /* bridge */ /* synthetic */ a4 getS0() {
        return null;
    }

    @Override // x81.k
    public ViewParent getViewParent() {
        return getParent();
    }

    @Override // uk1.c
    @NotNull
    /* renamed from: getViewType, reason: from getter */
    public d4 getR0() {
        return this.viewType;
    }

    @Override // x81.k
    public void loadMakeupEngineResourceWithPhoto(Bitmap photo) {
    }

    @Override // x81.k
    public void loadMakeupEngineResourcesAndStartCamera() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resumeCamera();
    }

    @Override // com.modiface.mfecommon.camera.MFEAndroidCameraErrorCallback
    public void onCameraFailedToStart(String errorMessage, Throwable cause) {
    }

    @Override // com.modiface.mfecommon.camera.MFEAndroidCameraParametersCallback
    public void onCameraSetParameters(@NotNull Camera.Parameters parameters, @NotNull MFEAndroidCameraParameters mfeParameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(mfeParameters, "mfeParameters");
        ((b) this.deviceInfoProvider).getClass();
        float f13 = b.f69002b;
        ((b) this.deviceInfoProvider).getClass();
        Pair V0 = t.V0(parameters, this.minValueCameraWidth, f13 / b.f69003c);
        mfeParameters.setHintSize(((Number) V0.f80346a).intValue(), ((Number) V0.f80347b).intValue());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        pauseCamera();
        super.onDetachedFromWindow();
    }

    @Override // com.modiface.mfemakeupkit.MFEMakeupEngine.MFEMakeupEngineErrorCallback
    public void onMakeupEngineError(@NotNull MFEMakeupEngine.ErrorSeverity severity, @NotNull MFEMakeupEngine.ErrorType errorType, @NotNull ArrayList<Throwable> errors) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(errors, "errors");
        Iterator<Throwable> it = errors.iterator();
        while (it.hasNext()) {
            Objects.toString(it.next());
            Objects.toString(severity);
            Objects.toString(errorType);
        }
    }

    @Override // x81.k
    public void pauseCamera() {
        if (this.tryOnCameraState == j.RESUMED) {
            MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
            if (mFEMakeupEngine != null) {
                mFEMakeupEngine.onPause();
            }
            this.tryOnCameraState = j.PAUSED;
        }
    }

    @Override // x81.k
    public void playHapticFeedback() {
        performHapticFeedback(3);
    }

    @Override // x81.k
    public void resumeCamera() {
        if (this.tryOnCameraState == j.PAUSED) {
            MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
            if (mFEMakeupEngine != null) {
                mFEMakeupEngine.onResume(getContext());
            }
            this.tryOnCameraState = j.RESUMED;
        }
    }

    @Override // yk1.n
    public /* bridge */ /* synthetic */ void setLoadState(i iVar) {
    }

    @Override // yk1.r
    public void setPinalytics(@NotNull d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
    }

    public final void setTryOnCameraState(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.tryOnCameraState = jVar;
    }

    public void setTryOnListener(l lVar) {
        this.tryOnListener = lVar;
    }

    @Override // x81.k
    public void setTryOnViewListener(@NotNull l listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setTryOnListener(listener);
    }

    @Override // x81.k
    public void takePhoto() {
        if (this.isTakingPhoto) {
            return;
        }
        int i13 = 1;
        this.isTakingPhoto = true;
        this.whiteFlash.a();
        MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
        if (mFEMakeupEngine != null) {
            mFEMakeupEngine.takePictureFromCameraWithCompletionHandler(false, new a(i13), new g(this, 2));
        }
    }

    @Override // x81.k
    public void updateEyeshadow(@NotNull x81.g viewModel) {
        ArrayList<MFEMakeupEyeshadowBaseLayer> arrayList;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        MFEMakeupLook mFEMakeupLook = this.currentMakeupLook;
        if (mFEMakeupLook != null) {
            arrayList = mFEMakeupLook.eyeShadowLayers;
            arrayList.clear();
            arrayList.add(MFEMakeupViewKt.toEyeshadowLayer(viewModel));
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            MFEMakeupLook mFEMakeupLook2 = new MFEMakeupLook();
            mFEMakeupLook2.eyeShadowLayers.add(MFEMakeupViewKt.toEyeshadowLayer(viewModel));
            this.currentMakeupLook = mFEMakeupLook2;
        }
        MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
        if (mFEMakeupEngine != null) {
            mFEMakeupEngine.setMakeupLook(this.currentMakeupLook);
        }
    }

    @Override // x81.k
    public void updateLipstick(@NotNull x81.g viewModel) {
        ArrayList<MFEMakeupLayer> arrayList;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        MFEMakeupLook mFEMakeupLook = this.currentMakeupLook;
        if (mFEMakeupLook != null) {
            arrayList = mFEMakeupLook.lipLayers;
            arrayList.clear();
            arrayList.add(MFEMakeupViewKt.toLipstickLayer(viewModel));
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            MFEMakeupLook mFEMakeupLook2 = new MFEMakeupLook();
            mFEMakeupLook2.lipLayers.add(MFEMakeupViewKt.toLipstickLayer(viewModel));
            this.currentMakeupLook = mFEMakeupLook2;
        }
        MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
        if (mFEMakeupEngine != null) {
            mFEMakeupEngine.setMakeupLook(this.currentMakeupLook);
        }
    }

    private final void loadMakeupEngineResourcesAndStartCamera(Context context, Context contextWithFaceTrackerBundle, MFEMakeupEngine engine) {
        engine.loadResources(contextWithFaceTrackerBundle, new a(0));
        engine.setCameraErrorCallback(this);
        engine.setCameraParametersCallback(this);
        engine.setCameraParameters(context, new MFEAndroidCameraParameters());
        engine.attachMakeupView(this.makeupCameraView);
        engine.startRunningWithCamera(context);
    }
}
