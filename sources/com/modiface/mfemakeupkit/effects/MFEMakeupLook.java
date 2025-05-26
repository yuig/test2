package com.modiface.mfemakeupkit.effects;

import java.util.ArrayList;

/* loaded from: classes7.dex */
public class MFEMakeupLook {
    private static final String TAG = "MFEMakeupLook";
    public ArrayList<MFEMakeupLayer> lipLayers = new ArrayList<>();
    public MFEMakeupLayer innerLipLayer = null;
    public MFEMakeupLayer lipLinerLayer = null;
    public ArrayList<MFEMakeupBlushBaseLayer> blushLayers = new ArrayList<>();
    public ArrayList<MFEMakeupEyeLinerBaseLayer> eyeLinerLayers = new ArrayList<>();
    public ArrayList<MFEMakeupMascaraBaseLayer> mascaraLayers = new ArrayList<>();
    public ArrayList<MFEMakeupEyeshadowBaseLayer> eyeShadowLayers = new ArrayList<>();
    public float eyeEraseExpandFactor = 0.95f;

    @Deprecated
    public float eyeEraseExpandFactorInner = 0.9f;

    @Deprecated
    public float eyeEraseExpandFactorOuter = 0.9f;

    @Deprecated
    public float eyeEraseExpandFactorTop = 0.9f;

    @Deprecated
    public float eyeEraseExpandFactorBottom = 0.9f;
    public MFEMakeupLayer foundationLayer = null;
    public MFEMakeupLayer primerLayer = null;
    public MFEMakeupLayer cushionLayer = null;
    public MFEMakeupLayer settingSprayLayer = null;
    public ArrayList<MFEMakeupDeformableFoundationBaseLayer> deformableFoundationLayers = new ArrayList<>();
    public MFEMakeupConcealerBaseLayer concealerLayer = null;
    public float skinClearingAmount = 0.0f;
    public float skinGlowAmount = 0.0f;
    public float skinBrighteningAmount = 0.0f;
    public boolean shouldApplySkinEffectsToBaseLook = false;
    public BrowLayer browLayer = null;
    public float intensity = 1.0f;
    public float nostrilThinning = 0.0f;
    public float noseBridgeThinning = 0.0f;
    public float jawSlimming = 0.0f;
    public float eyeHeightEnlarge = 0.0f;
    public float eyeWidthEnlarge = 0.0f;
    public float lipVolume = 0.0f;
    public MFEParticleEffectsLayer particleEffectsLayer = null;

    private int getBlushCount() {
        return this.blushLayers.size();
    }

    private MFEMakeupBlushBaseLayer getBlushLayer(int i13) {
        if (i13 < 0 || i13 >= this.blushLayers.size()) {
            return null;
        }
        return this.blushLayers.get(i13);
    }

    private int getEyelinerCount() {
        return this.eyeLinerLayers.size();
    }

    private MFEMakeupEyeLinerBaseLayer getEyelinerLayer(int i13) {
        if (i13 < 0 || i13 >= this.eyeLinerLayers.size()) {
            return null;
        }
        return this.eyeLinerLayers.get(i13);
    }

    private int getEyeshadowCount() {
        return this.eyeShadowLayers.size();
    }

    private MFEMakeupEyeshadowBaseLayer getEyeshadowLayer(int i13) {
        if (i13 < 0 || i13 >= this.eyeShadowLayers.size()) {
            return null;
        }
        return this.eyeShadowLayers.get(i13);
    }

    private int getMascaraCount() {
        return this.mascaraLayers.size();
    }

    private MFEMakeupMascaraBaseLayer getMascaraLayer(int i13) {
        if (i13 < 0 || i13 >= this.mascaraLayers.size()) {
            return null;
        }
        return this.mascaraLayers.get(i13);
    }
}
