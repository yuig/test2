package com.modiface.mfemakeupkit.effects;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class MFEParticleEffectsLayer extends MFEMakeupLayer implements Cloneable {
    public String effectJSONPath;
    public Style style;

    public enum Style {
        None,
        Bubbles,
        Hearts,
        Stars,
        Custom
    }

    public MFEParticleEffectsLayer(Style style) {
        this.style = style;
        this.effectJSONPath = "";
    }

    @Override // com.modiface.mfemakeupkit.effects.MFEMakeupLayer
    @NonNull
    /* renamed from: clone */
    public MFEParticleEffectsLayer mo112clone() {
        MFEParticleEffectsLayer mFEParticleEffectsLayer = new MFEParticleEffectsLayer(this.style);
        copyBasePropertiesToOther(mFEParticleEffectsLayer);
        mFEParticleEffectsLayer.effectJSONPath = this.effectJSONPath;
        return mFEParticleEffectsLayer;
    }

    public MFEParticleEffectsLayer(String str) {
        this.style = Style.Custom;
        this.effectJSONPath = str;
    }
}
