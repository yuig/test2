package com.pinterest.modiface;

import a91.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.modiface.mfecommon.camera.MFEAndroidCameraErrorCallback;
import com.modiface.mfecommon.camera.MFEAndroidCameraParameters;
import com.modiface.mfecommon.camera.MFEAndroidCameraParametersCallback;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.effects.MFEMakeupEyeshadowBaseLayer;
import com.modiface.mfemakeupkit.effects.MFEMakeupLayer;
import com.modiface.mfemakeupkit.effects.MFEMakeupLook;
import com.pinterest.component.camera.WhiteFlashView;
import com.pinterest.modiface.MakeupPhotoView;
import com.pinterest.ui.view.TopBottomGradientView;
import el2.a;
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
import lb.l0;
import m60.f0;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import so.oa;
import ut1.e;
import ut1.f;
import ut1.g;
import x81.j;
import x81.k;
import x81.l;
import yk1.i;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001qB\u001f\u0012\u0006\u0010n\u001a\u000208\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\bo\u0010pJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\bJ-\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b)\u0010*J#\u0010.\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b.\u0010/J#\u00105\u001a\u00020\u00062\n\u00102\u001a\u000600R\u0002012\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u0010\bR\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010K\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\u0016R\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010f\u001a\u00020e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0016\u0010m\u001a\u0004\u0018\u00010j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006r"}, d2 = {"Lcom/pinterest/modiface/MakeupPhotoView;", "Landroid/widget/FrameLayout;", "Lx81/k;", "Lcom/modiface/mfemakeupkit/MFEMakeupEngine$MFEMakeupEngineErrorCallback;", "Lcom/modiface/mfecommon/camera/MFEAndroidCameraErrorCallback;", "Lcom/modiface/mfecommon/camera/MFEAndroidCameraParametersCallback;", "", "loadMakeupEngineResourcesAndStartCamera", "()V", "Landroid/graphics/Bitmap;", "photo", "loadMakeupEngineResourceWithPhoto", "(Landroid/graphics/Bitmap;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lnx/d0;", "pinalytics", "setPinalytics", "(Lnx/d0;)V", "Lx81/l;", "listener", "setTryOnViewListener", "(Lx81/l;)V", "Lx81/g;", "viewModel", "updateLipstick", "(Lx81/g;)V", "updateEyeshadow", "clearLipLayer", "clearEyeLayer", "takePhoto", "resumeCamera", "pauseCamera", "playHapticFeedback", "Lcom/modiface/mfemakeupkit/MFEMakeupEngine$ErrorSeverity;", "severity", "Lcom/modiface/mfemakeupkit/MFEMakeupEngine$ErrorType;", "errorType", "Ljava/util/ArrayList;", "", "errors", "onMakeupEngineError", "(Lcom/modiface/mfemakeupkit/MFEMakeupEngine$ErrorSeverity;Lcom/modiface/mfemakeupkit/MFEMakeupEngine$ErrorType;Ljava/util/ArrayList;)V", "", "errorMessage", "cause", "onCameraFailedToStart", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "parameters", "Lcom/modiface/mfecommon/camera/MFEAndroidCameraParameters;", "mfeParameters", "onCameraSetParameters", "(Landroid/hardware/Camera$Parameters;Lcom/modiface/mfecommon/camera/MFEAndroidCameraParameters;)V", "displayErrorToast", "Landroid/content/Context;", "packageContext", "Landroid/content/Context;", "Lnx/d0;", "Lx81/j;", "tryOnCameraState", "Lx81/j;", "getTryOnCameraState", "()Lx81/j;", "setTryOnCameraState", "(Lx81/j;)V", "Lcom/pinterest/modiface/MakeupPhotoView$MakeupType;", "currentMakeupType", "Lcom/pinterest/modiface/MakeupPhotoView$MakeupType;", "currentPhoto", "Landroid/graphics/Bitmap;", "", "minValueCameraWidth", "F", "tryOnListener", "Lx81/l;", "getTryOnListener", "()Lx81/l;", "setTryOnListener", "Lcom/modiface/mfemakeupkit/widgets/MFEMakeupView;", "makeupCameraView", "Lcom/modiface/mfemakeupkit/widgets/MFEMakeupView;", "Lcom/pinterest/component/camera/WhiteFlashView;", "whiteFlash", "Lcom/pinterest/component/camera/WhiteFlashView;", "Lcom/pinterest/ui/view/TopBottomGradientView;", "makeupCameraGradient", "Lcom/pinterest/ui/view/TopBottomGradientView;", "Lcom/modiface/mfemakeupkit/MFEMakeupEngine;", "makeupEngine", "Lcom/modiface/mfemakeupkit/MFEMakeupEngine;", "", "isTakingPhoto", "Z", "Lhf0/c;", "deviceInfoProvider", "Lhf0/c;", "Lcom/modiface/mfemakeupkit/effects/MFEMakeupLook;", "currentMakeupLook", "Lcom/modiface/mfemakeupkit/effects/MFEMakeupLook;", "Lh32/d4;", "viewType", "Lh32/d4;", "getViewType", "()Lh32/d4;", "Landroid/view/ViewParent;", "getViewParent", "()Landroid/view/ViewParent;", "viewParent", "context", "<init>", "(Landroid/content/Context;Landroid/content/Context;Lnx/d0;)V", "MakeupType", "modiface_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class MakeupPhotoView extends FrameLayout implements k, MFEMakeupEngine.MFEMakeupEngineErrorCallback, MFEAndroidCameraErrorCallback, MFEAndroidCameraParametersCallback {
    private MFEMakeupLook currentMakeupLook;

    @NotNull
    private MakeupType currentMakeupType;
    private Bitmap currentPhoto;

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
    private j tryOnCameraState;
    private l tryOnListener;

    @NotNull
    private final d4 viewType;

    @NotNull
    private final WhiteFlashView whiteFlash;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/modiface/MakeupPhotoView$MakeupType;", "", "(Ljava/lang/String;I)V", "NONE", "VIDEO", "PHOTO", "modiface_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class MakeupType extends Enum<MakeupType> {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ MakeupType[] $VALUES;
        public static final MakeupType NONE = new MakeupType("NONE", 0);
        public static final MakeupType VIDEO = new MakeupType("VIDEO", 1);
        public static final MakeupType PHOTO = new MakeupType("PHOTO", 2);

        private static final /* synthetic */ MakeupType[] $values() {
            return new MakeupType[]{NONE, VIDEO, PHOTO};
        }

        static {
            MakeupType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = l0.b0($values);
        }

        private MakeupType(String str, int i13) {
            super(str, i13);
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static MakeupType valueOf(String str) {
            return (MakeupType) Enum.valueOf(MakeupType.class, str);
        }

        public static MakeupType[] values() {
            return (MakeupType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MakeupType.values().length];
            try {
                iArr[MakeupType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MakeupType.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MakeupType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5 A[Catch: Exception -> 0x0110, TryCatch #0 {Exception -> 0x0110, blocks: (B:6:0x00a8, B:8:0x00ba, B:11:0x00c0, B:15:0x00d5, B:19:0x00f7, B:22:0x00c6, B:25:0x00cc), top: B:5:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f7 A[Catch: Exception -> 0x0110, TRY_LEAVE, TryCatch #0 {Exception -> 0x0110, blocks: (B:6:0x00a8, B:8:0x00ba, B:11:0x00c0, B:15:0x00d5, B:19:0x00f7, B:22:0x00c6, B:25:0x00cc), top: B:5:0x00a8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MakeupPhotoView(@org.jetbrains.annotations.NotNull android.content.Context r18, @org.jetbrains.annotations.NotNull android.content.Context r19, @org.jetbrains.annotations.NotNull nx.d0 r20) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.modiface.MakeupPhotoView.<init>(android.content.Context, android.content.Context, nx.d0):void");
    }

    public static final void _init_$lambda$10(MakeupPhotoView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        l tryOnListener = this$0.getTryOnListener();
        if (tryOnListener != null) {
            ((d) tryOnListener).p3();
        }
    }

    private final void displayErrorToast() {
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) l0.k0(f0.X().getApplicationContext(), j92.a.class))).E2().m("Something's not right. Restart Pinterest to try again.");
    }

    public static final void lambda$9$lambda$5$lambda$3() {
    }

    public static final void loadMakeupEngineResourceWithPhoto$lambda$15$lambda$13(MakeupPhotoView this$0, MFETrackingData mFETrackingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new Handler(Looper.getMainLooper()).post(new ut1.c(1, this$0, mFETrackingData));
    }

    public static final void loadMakeupEngineResourceWithPhoto$lambda$15$lambda$13$lambda$12(MakeupPhotoView this$0, MFETrackingData mFETrackingData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        l tryOnListener = this$0.getTryOnListener();
        if (tryOnListener != null) {
            ((d) tryOnListener).q3(mFETrackingData.hasFacePoints());
        }
    }

    public static final void takePhoto$lambda$24(Camera.Parameters parameters) {
    }

    public static final void takePhoto$lambda$27(MakeupPhotoView this$0, Bitmap bitmap, Bitmap bitmap2, Throwable th3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.post(new f(bitmap2, this$0, 0));
        this$0.isTakingPhoto = false;
    }

    public static final void takePhoto$lambda$27$lambda$26(Bitmap bitmap, MakeupPhotoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bitmap != null) {
            l tryOnListener = this$0.getTryOnListener();
            if (tryOnListener != null) {
                ((d) tryOnListener).s3(bitmap);
            }
            this$0.isTakingPhoto = false;
        }
    }

    public static final void takePhoto$lambda$30(MakeupPhotoView this$0, Bitmap bitmap, Bitmap bitmap2, Throwable th3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.post(new f(bitmap2, this$0, 1));
    }

    public static final void takePhoto$lambda$30$lambda$29(Bitmap bitmap, MakeupPhotoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bitmap != null) {
            l tryOnListener = this$0.getTryOnListener();
            if (tryOnListener != null) {
                ((d) tryOnListener).s3(bitmap);
            }
            this$0.isTakingPhoto = false;
        }
        this$0.isTakingPhoto = false;
    }

    @Override // x81.k
    public void clearEyeLayer() {
        ArrayList<MFEMakeupEyeshadowBaseLayer> arrayList;
        try {
            MFEMakeupLook mFEMakeupLook = this.currentMakeupLook;
            if (mFEMakeupLook != null && (arrayList = mFEMakeupLook.eyeShadowLayers) != null) {
                arrayList.clear();
            }
            MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
            if (mFEMakeupEngine != null) {
                mFEMakeupEngine.setMakeupLook(this.currentMakeupLook);
            }
        } catch (Exception unused) {
        }
    }

    @Override // x81.k
    public void clearLipLayer() {
        ArrayList<MFEMakeupLayer> arrayList;
        try {
            MFEMakeupLook mFEMakeupLook = this.currentMakeupLook;
            if (mFEMakeupLook != null && (arrayList = mFEMakeupLook.lipLayers) != null) {
                arrayList.clear();
            }
            MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
            if (mFEMakeupEngine != null) {
                mFEMakeupEngine.setMakeupLook(this.currentMakeupLook);
            }
        } catch (Exception unused) {
        }
    }

    @Override // uk1.c
    /* renamed from: getAuxData */
    public /* bridge */ /* synthetic */ HashMap getO0() {
        return null;
    }

    @Override // uk1.c
    /* renamed from: getComponentType */
    public /* bridge */ /* synthetic */ g0 getF50445f() {
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
    public /* bridge */ /* synthetic */ a4 getF87513d1() {
        return null;
    }

    @Override // x81.k
    public ViewParent getViewParent() {
        return getParent();
    }

    @Override // uk1.c
    @NotNull
    /* renamed from: getViewType, reason: from getter */
    public d4 getF70541u0() {
        return this.viewType;
    }

    @Override // x81.k
    public void loadMakeupEngineResourceWithPhoto(Bitmap photo) {
        MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
        if (mFEMakeupEngine != null) {
            this.currentPhoto = photo;
            mFEMakeupEngine.startRunningWithPhoto(photo, true, new MFEMakeupEngine.MFEMakeupEngineDetectionCallback() { // from class: ut1.d
                @Override // com.modiface.mfemakeupkit.MFEMakeupEngine.MFEMakeupEngineDetectionCallback
                public final void onMFEMakeupFinishedDetection(MFETrackingData mFETrackingData) {
                    MakeupPhotoView.loadMakeupEngineResourceWithPhoto$lambda$15$lambda$13(MakeupPhotoView.this, mFETrackingData);
                }
            }, new e());
            this.currentMakeupType = MakeupType.PHOTO;
        }
    }

    @Override // x81.k
    public void loadMakeupEngineResourcesAndStartCamera() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!qy1.d.a(context, "android.permission.CAMERA")) {
            vb0.j.f125466a.G("Please ask for camera permissions before adding this view!", new Object[0]);
        }
        MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
        if (mFEMakeupEngine != null) {
            this.currentPhoto = null;
            MakeupType makeupType = this.currentMakeupType;
            MakeupType makeupType2 = MakeupType.VIDEO;
            if (makeupType != makeupType2) {
                mFEMakeupEngine.setCameraErrorCallback(this);
                mFEMakeupEngine.setCameraParametersCallback(this);
                mFEMakeupEngine.setCameraParameters(getContext(), new MFEAndroidCameraParameters());
                mFEMakeupEngine.startRunningWithCamera(getContext());
                this.currentMakeupType = makeupType2;
            }
        }
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
        int i13 = WhenMappings.$EnumSwitchMapping$0[this.currentMakeupType.ordinal()];
        int i14 = 1;
        if (i13 == 1) {
            if (this.isTakingPhoto) {
                return;
            }
            this.isTakingPhoto = true;
            this.whiteFlash.a();
            MFEMakeupEngine mFEMakeupEngine = this.makeupEngine;
            if (mFEMakeupEngine != null) {
                mFEMakeupEngine.takePictureFromCameraWithCompletionHandler(false, new ut1.a(3), new g(this, 0));
                return;
            }
            return;
        }
        if (i13 != 2 || this.isTakingPhoto || this.currentPhoto == null) {
            return;
        }
        this.isTakingPhoto = true;
        this.whiteFlash.a();
        MFEMakeupEngine mFEMakeupEngine2 = this.makeupEngine;
        if (mFEMakeupEngine2 != null) {
            mFEMakeupEngine2.applyMakeupToPhotoInBackground(this.currentPhoto, true, new g(this, i14));
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
}
