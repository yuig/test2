package com.modiface.mfemakeupkit.effects;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class BrowColoringParams implements Cloneable {
    public float colorR = 0.0f;
    public float colorG = 0.0f;
    public float colorB = 0.0f;
    public float colorAmount = 0.0f;
    public float sparkleIntensity = 0.0f;
    public float sparkleR = 255.0f;
    public float sparkleG = 255.0f;
    public float sparkleB = 255.0f;
    public float sparkleSize = 1.0f;
    public float sparkleDensity = 0.5f;
    public float sparkleColorVariation = 0.0f;
    public float sparkleSizeVariation = 0.0f;
    public float sparkleBaseReflectivity = 0.3f;

    @NonNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BrowColoringParams m111clone() {
        BrowColoringParams browColoringParams = new BrowColoringParams();
        browColoringParams.colorR = this.colorR;
        browColoringParams.colorG = this.colorG;
        browColoringParams.colorB = this.colorB;
        browColoringParams.colorAmount = this.colorAmount;
        browColoringParams.sparkleIntensity = this.sparkleIntensity;
        browColoringParams.sparkleR = this.sparkleR;
        browColoringParams.sparkleG = this.sparkleG;
        browColoringParams.sparkleB = this.sparkleB;
        browColoringParams.sparkleSize = this.sparkleSize;
        browColoringParams.sparkleDensity = this.sparkleDensity;
        browColoringParams.sparkleColorVariation = this.sparkleColorVariation;
        browColoringParams.sparkleSizeVariation = this.sparkleSizeVariation;
        browColoringParams.sparkleBaseReflectivity = this.sparkleBaseReflectivity;
        return browColoringParams;
    }
}
