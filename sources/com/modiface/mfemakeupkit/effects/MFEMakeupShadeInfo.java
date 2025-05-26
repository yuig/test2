package com.modiface.mfemakeupkit.effects;

/* loaded from: classes7.dex */
public class MFEMakeupShadeInfo {
    public float lipPlumping = 0.0f;
    public final MFEMakeupLayer makeupLayer;

    public MFEMakeupShadeInfo(MFEMakeupLayer mFEMakeupLayer) {
        this.makeupLayer = mFEMakeupLayer;
    }

    public boolean applyToLook(MFEMakeupLook mFEMakeupLook, MFEMakeupProductCategory mFEMakeupProductCategory, boolean z13) {
        if (this.makeupLayer == null) {
            return false;
        }
        switch (a.f34441a[mFEMakeupProductCategory.ordinal()]) {
            case 1:
                if (z13) {
                    mFEMakeupLook.lipLayers.clear();
                }
                mFEMakeupLook.lipLayers.add(this.makeupLayer);
                mFEMakeupLook.lipVolume = this.lipPlumping;
                break;
            case 2:
                mFEMakeupLook.lipLinerLayer = this.makeupLayer;
                break;
            case 3:
            case 4:
            case 5:
                if (z13) {
                    mFEMakeupLook.blushLayers.clear();
                }
                MFEMakeupLayer mFEMakeupLayer = this.makeupLayer;
                if (!(mFEMakeupLayer instanceof MFEMakeupDeformableCustomLayer)) {
                    if (mFEMakeupLayer instanceof MFEMakeupBlushLayer) {
                        mFEMakeupLook.blushLayers.add((MFEMakeupBlushLayer) mFEMakeupLayer);
                        break;
                    }
                } else {
                    mFEMakeupLook.blushLayers.add((MFEMakeupDeformableCustomLayer) mFEMakeupLayer);
                    break;
                }
                break;
            case 6:
                MFEMakeupLayer mFEMakeupLayer2 = this.makeupLayer;
                if (!(mFEMakeupLayer2 instanceof MFEMakeupDeformableCustomLayer)) {
                    if (mFEMakeupLayer2 instanceof MFEMakeupConcealerLayer) {
                        mFEMakeupLook.concealerLayer = (MFEMakeupConcealerLayer) mFEMakeupLayer2;
                        break;
                    }
                } else {
                    mFEMakeupLook.concealerLayer = (MFEMakeupDeformableCustomLayer) mFEMakeupLayer2;
                    break;
                }
                break;
            case 7:
                if (z13) {
                    mFEMakeupLook.eyeLinerLayers.clear();
                }
                MFEMakeupLayer mFEMakeupLayer3 = this.makeupLayer;
                if (!(mFEMakeupLayer3 instanceof MFEMakeupDeformableCustomLayer)) {
                    if (mFEMakeupLayer3 instanceof MFEMakeupEyeLinerLayer) {
                        mFEMakeupLook.eyeLinerLayers.add((MFEMakeupEyeLinerLayer) mFEMakeupLayer3);
                        break;
                    }
                } else {
                    mFEMakeupLook.eyeLinerLayers.add((MFEMakeupDeformableCustomLayer) mFEMakeupLayer3);
                    break;
                }
                break;
            case 8:
            case 9:
                if (z13) {
                    mFEMakeupLook.mascaraLayers.clear();
                }
                MFEMakeupLayer mFEMakeupLayer4 = this.makeupLayer;
                if (!(mFEMakeupLayer4 instanceof MFEMakeupDeformableCustomLayer)) {
                    if (mFEMakeupLayer4 instanceof MFEMakeupMascaraLayer) {
                        mFEMakeupLook.mascaraLayers.add((MFEMakeupMascaraLayer) mFEMakeupLayer4);
                        break;
                    }
                } else {
                    mFEMakeupLook.mascaraLayers.add((MFEMakeupDeformableCustomLayer) mFEMakeupLayer4);
                    break;
                }
                break;
            case 10:
                if (z13) {
                    mFEMakeupLook.eyeShadowLayers.clear();
                }
                MFEMakeupLayer mFEMakeupLayer5 = this.makeupLayer;
                if (!(mFEMakeupLayer5 instanceof MFEMakeupDeformableCustomLayer)) {
                    if (mFEMakeupLayer5 instanceof MFEMakeupEyeshadowLayer) {
                        mFEMakeupLook.eyeShadowLayers.add((MFEMakeupEyeshadowLayer) mFEMakeupLayer5);
                        break;
                    }
                } else {
                    mFEMakeupLook.eyeShadowLayers.add((MFEMakeupDeformableCustomLayer) mFEMakeupLayer5);
                    break;
                }
                break;
            case 11:
                mFEMakeupLook.foundationLayer = this.makeupLayer;
                break;
            case 12:
                mFEMakeupLook.cushionLayer = this.makeupLayer;
                break;
            case 13:
                mFEMakeupLook.settingSprayLayer = this.makeupLayer;
                break;
            case 14:
                MFEMakeupLayer mFEMakeupLayer6 = this.makeupLayer;
                if (mFEMakeupLayer6 instanceof BrowLayer) {
                    mFEMakeupLook.browLayer = (BrowLayer) mFEMakeupLayer6;
                    break;
                }
                break;
        }
        return false;
    }
}
