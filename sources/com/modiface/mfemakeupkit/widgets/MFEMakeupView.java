package com.modiface.mfemakeupkit.widgets;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.k;
import com.modiface.mfecommon.utils.q;
import com.modiface.mfemakeupkit.c;
import com.modiface.mfemakeupkit.data.MFEFacePoints;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class MFEMakeupView extends TextureView implements TextureView.SurfaceTextureListener, c.e {
    private static final String TAG = "MFEMakeupView";
    private static final String kMFEDisplayMakeupDebugInfoName = "Display";
    private static final String kMFEMakeupViewDebugInfoName = "MFE Makeup View";
    private static final String kMFESurfaceTextureDebugInfoName = "Surface Texture";
    private final MFEDebugInfo mDebugInfo;
    private double mDisplayFPS;
    private final q mDisplayTimer;
    private final com.modiface.mfemakeupkit.c mMakeupSurface;
    private AtomicReference<MFEMakeupZoomArea> mZoomAreaRef;

    static {
        k.a("MFEMakeupKit");
        registerNatives();
    }

    public MFEMakeupView(Context context) {
        super(context);
        this.mMakeupSurface = new e(this);
        this.mDebugInfo = new MFEDebugInfo(kMFEMakeupViewDebugInfoName);
        this.mDisplayTimer = new q();
        this.mDisplayFPS = 0.0d;
        this.mZoomAreaRef = new AtomicReference<>(MFEMakeupZoomArea.None);
        init();
    }

    private void init() {
        setSurfaceTextureListener(this);
        this.mMakeupSurface.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniCalculateZoomArea(MFEMakeupZoomArea mFEMakeupZoomArea, int i13, int i14, MFEFacePoints mFEFacePoints, RectF rectF);

    private static native void registerNatives();

    private void setNewSurfaceTexture(SurfaceTexture surfaceTexture, int i13, int i14) {
        MFEDebugInfo mFEDebugInfo = new MFEDebugInfo(kMFESurfaceTextureDebugInfoName);
        mFEDebugInfo.addSimpleDebugInfo("available", true);
        mFEDebugInfo.addDetailedDebugInfo("width", i13);
        mFEDebugInfo.addDetailedDebugInfo("height", i14);
        this.mMakeupSurface.a(surfaceTexture, i13, i14);
        this.mDebugInfo.addSubDebugInfo(mFEDebugInfo);
    }

    public void clear() {
        this.mMakeupSurface.a();
    }

    public MFEDebugInfo getDebugInfo() {
        return this.mDebugInfo.getNewCopy();
    }

    @Override // com.modiface.mfemakeupkit.c.e
    public MFEDebugInfo getDebugInfoToPopulateOn() {
        return new MFEDebugInfo(kMFEDisplayMakeupDebugInfoName);
    }

    public com.modiface.mfemakeupkit.c getMakeupSurface() {
        return this.mMakeupSurface;
    }

    @Override // com.modiface.mfemakeupkit.c.e
    public void onRenderDone(MFEDebugInfo mFEDebugInfo) {
        this.mDisplayFPS = (this.mDisplayFPS * 0.9d) + (this.mDisplayTimer.a() * 0.1d);
        this.mDisplayTimer.c();
        mFEDebugInfo.addSimpleDebugInfo("display FPS", this.mDisplayFPS);
        this.mDebugInfo.addSubDebugInfo(mFEDebugInfo);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i13, int i14) {
        setNewSurfaceTexture(surfaceTexture, i13, i14);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.mMakeupSurface.b();
        MFEDebugInfo mFEDebugInfo = new MFEDebugInfo(kMFESurfaceTextureDebugInfoName);
        mFEDebugInfo.addSimpleDebugInfo("available", false);
        this.mDebugInfo.addSubDebugInfo(mFEDebugInfo);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i13, int i14) {
        setNewSurfaceTexture(surfaceTexture, i13, i14);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setShowBefore(boolean z13) {
        this.mMakeupSurface.a(z13);
    }

    public void setZoomArea(MFEMakeupZoomArea mFEMakeupZoomArea) {
        if (mFEMakeupZoomArea == null) {
            mFEMakeupZoomArea = MFEMakeupZoomArea.None;
        }
        this.mZoomAreaRef.set(mFEMakeupZoomArea);
        this.mMakeupSurface.g();
    }

    public MFEMakeupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMakeupSurface = new e(this);
        this.mDebugInfo = new MFEDebugInfo(kMFEMakeupViewDebugInfoName);
        this.mDisplayTimer = new q();
        this.mDisplayFPS = 0.0d;
        this.mZoomAreaRef = new AtomicReference<>(MFEMakeupZoomArea.None);
        init();
    }

    public MFEMakeupView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.mMakeupSurface = new e(this);
        this.mDebugInfo = new MFEDebugInfo(kMFEMakeupViewDebugInfoName);
        this.mDisplayTimer = new q();
        this.mDisplayFPS = 0.0d;
        this.mZoomAreaRef = new AtomicReference<>(MFEMakeupZoomArea.None);
        init();
    }
}
