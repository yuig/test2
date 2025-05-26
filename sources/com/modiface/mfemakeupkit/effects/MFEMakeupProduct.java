package com.modiface.mfemakeupkit.effects;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class MFEMakeupProduct implements Cloneable {
    public int color = 0;
    public float intensity = 1.0f;
    public boolean useIntenseDynamicColorParameters = false;
    public float gloss = 0.0f;
    public float glossDetail = 0.0f;
    public float matteness = 0.0f;
    public boolean useNormalizedGloss = false;
    public float contrastBoost = 0.0f;
    public float envMappingIntensity = 0.0f;
    public float envMappingRotationY = 0.0f;
    public float envMappingCurve = 2.3f;
    public float envMappingBumpIntensity = 0.6f;
    public int envMappingColor = -1;
    public float sparkleIntensity = 0.0f;
    public int sparkleColor = -1;
    public float sparkleDensity = 0.5f;
    public float sparkleSize = 1.0f;
    public float sparkleColorVariation = 0.0f;
    public float sparkleSizeVariation = 0.0f;
    public float sparkleBaseReflectivity = 0.3f;
    public float sparkleGlowSize = 0.3f;
    public int sparkleGlowColor = -1;
    public boolean useLegacyGlitter = false;
    public float twinkleIntensity = 0.0f;
    public float twinkleDensity = 0.5f;
    public int twinkleColor = -1;
    public float twinkleSize = 1.0f;
    public float twinkleColorVariation = 0.0f;
    public float twinkleSizeVariation = 0.0f;
    public float skinClearing = 0.0f;
    public float skinGlow = 0.0f;
    public boolean isSkinGlowDynamicByRotation = true;
    public boolean useDynamicColor = true;
    public float metallicIntensity = 0.0f;
    public float vinylIntensity = 0.0f;
    public float specularShininess = 0.8f;
    public float specularCoarseness = 0.0f;
    public float textureBoost = 0.0f;
    public float lustre = 0.0f;
    public float opaqueness = 0.0f;
    public float blushGlow = 0.0f;
    public boolean isGlowOnlyOnBlush = false;
    public MFEDynamicColorParameters dynamicColorParameters = null;

    @NonNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public MFEMakeupProduct m115clone() {
        MFEMakeupProduct mFEMakeupProduct = new MFEMakeupProduct();
        mFEMakeupProduct.color = this.color;
        mFEMakeupProduct.intensity = this.intensity;
        mFEMakeupProduct.useIntenseDynamicColorParameters = this.useIntenseDynamicColorParameters;
        mFEMakeupProduct.gloss = this.gloss;
        mFEMakeupProduct.glossDetail = this.glossDetail;
        mFEMakeupProduct.matteness = this.matteness;
        mFEMakeupProduct.useNormalizedGloss = this.useNormalizedGloss;
        mFEMakeupProduct.contrastBoost = this.contrastBoost;
        mFEMakeupProduct.envMappingIntensity = this.envMappingIntensity;
        mFEMakeupProduct.envMappingRotationY = this.envMappingRotationY;
        mFEMakeupProduct.envMappingCurve = this.envMappingCurve;
        mFEMakeupProduct.envMappingBumpIntensity = this.envMappingBumpIntensity;
        mFEMakeupProduct.envMappingColor = this.envMappingColor;
        mFEMakeupProduct.sparkleIntensity = this.sparkleIntensity;
        mFEMakeupProduct.sparkleColor = this.sparkleColor;
        mFEMakeupProduct.sparkleDensity = this.sparkleDensity;
        mFEMakeupProduct.sparkleSize = this.sparkleSize;
        mFEMakeupProduct.sparkleColorVariation = this.sparkleColorVariation;
        mFEMakeupProduct.sparkleSizeVariation = this.sparkleSizeVariation;
        mFEMakeupProduct.sparkleBaseReflectivity = this.sparkleBaseReflectivity;
        mFEMakeupProduct.sparkleGlowSize = this.sparkleGlowSize;
        mFEMakeupProduct.sparkleGlowColor = this.sparkleGlowColor;
        mFEMakeupProduct.useLegacyGlitter = this.useLegacyGlitter;
        mFEMakeupProduct.twinkleIntensity = this.twinkleIntensity;
        mFEMakeupProduct.twinkleDensity = this.twinkleDensity;
        mFEMakeupProduct.twinkleColor = this.twinkleColor;
        mFEMakeupProduct.twinkleSize = this.twinkleSize;
        mFEMakeupProduct.twinkleColorVariation = this.twinkleColorVariation;
        mFEMakeupProduct.twinkleSizeVariation = this.twinkleSizeVariation;
        mFEMakeupProduct.skinClearing = this.skinClearing;
        mFEMakeupProduct.skinGlow = this.skinGlow;
        mFEMakeupProduct.isSkinGlowDynamicByRotation = this.isSkinGlowDynamicByRotation;
        mFEMakeupProduct.useDynamicColor = this.useDynamicColor;
        mFEMakeupProduct.metallicIntensity = this.metallicIntensity;
        mFEMakeupProduct.vinylIntensity = this.vinylIntensity;
        mFEMakeupProduct.specularShininess = this.specularShininess;
        mFEMakeupProduct.specularCoarseness = this.specularCoarseness;
        mFEMakeupProduct.textureBoost = this.textureBoost;
        mFEMakeupProduct.lustre = this.lustre;
        mFEMakeupProduct.opaqueness = this.opaqueness;
        mFEMakeupProduct.blushGlow = this.blushGlow;
        mFEMakeupProduct.isGlowOnlyOnBlush = this.isGlowOnlyOnBlush;
        if (this.dynamicColorParameters != null) {
            MFEDynamicColorParameters mFEDynamicColorParameters = new MFEDynamicColorParameters();
            mFEMakeupProduct.dynamicColorParameters = mFEDynamicColorParameters;
            MFEDynamicColorParameters mFEDynamicColorParameters2 = this.dynamicColorParameters;
            mFEDynamicColorParameters.productValueBalancing = mFEDynamicColorParameters2.productValueBalancing;
            mFEDynamicColorParameters.darkValueThreshold = mFEDynamicColorParameters2.darkValueThreshold;
            mFEDynamicColorParameters.saturationBalancing = mFEDynamicColorParameters2.saturationBalancing;
            mFEDynamicColorParameters.saturationAdjustment = mFEDynamicColorParameters2.saturationAdjustment;
            mFEDynamicColorParameters.sceneBrightnessInfluence = mFEDynamicColorParameters2.sceneBrightnessInfluence;
        } else {
            mFEMakeupProduct.dynamicColorParameters = null;
        }
        return mFEMakeupProduct;
    }
}
