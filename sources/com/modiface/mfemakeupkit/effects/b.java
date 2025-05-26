package com.modiface.mfemakeupkit.effects;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class b extends MFEMakeupLayer {
    public String jsonPath;

    public b() {
        this.jsonPath = null;
    }

    public b(MFEMakeupProduct mFEMakeupProduct) {
        super(mFEMakeupProduct);
        this.jsonPath = null;
    }

    @Override // com.modiface.mfemakeupkit.effects.MFEMakeupLayer
    @NonNull
    /* renamed from: clone */
    public b mo112clone() {
        b bVar = new b();
        copyBasePropertiesToOther(bVar);
        bVar.jsonPath = this.jsonPath;
        return bVar;
    }
}
