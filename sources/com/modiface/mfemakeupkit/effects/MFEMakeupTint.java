package com.modiface.mfemakeupkit.effects;

/* loaded from: classes7.dex */
public class MFEMakeupTint {
    public String lutImagePath;
    public Style style;

    public enum Style {
        None,
        Rosie,
        Dawn,
        Dusk,
        Cool,
        Peachy,
        Golden,
        SunKissed,
        Custom
    }

    public MFEMakeupTint(Style style) {
        this.style = style;
        this.lutImagePath = "";
    }

    public boolean isValid() {
        return (this.style == Style.Custom && this.lutImagePath.isEmpty()) ? false : true;
    }

    public MFEMakeupTint(String str) {
        this.style = Style.Custom;
        this.lutImagePath = str;
    }

    public MFEMakeupTint(MFEMakeupTint mFEMakeupTint) {
        this.style = mFEMakeupTint.style;
        this.lutImagePath = mFEMakeupTint.lutImagePath;
    }
}
