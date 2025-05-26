package com.modiface.mfemakeupkit.effects;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class MFEMakeupDeformableCustomLayer extends b implements MFEMakeupBlushBaseLayer, MFEMakeupEyeshadowBaseLayer, MFEMakeupEyeLinerBaseLayer, MFEMakeupMascaraBaseLayer, MFEMakeupDeformableFoundationBaseLayer, MFEMakeupConcealerBaseLayer {
    public final ArrayList<MFEMakeupEraseDeformableCustomLayer> eraseMasks;

    public MFEMakeupDeformableCustomLayer() {
        this.eraseMasks = new ArrayList<>();
    }

    @Override // com.modiface.mfemakeupkit.effects.b, com.modiface.mfemakeupkit.effects.MFEMakeupLayer
    @NonNull
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ b mo112clone() {
        return super.mo112clone();
    }

    public MFEMakeupDeformableCustomLayer(MFEMakeupProduct mFEMakeupProduct) {
        super(mFEMakeupProduct);
        this.eraseMasks = new ArrayList<>();
    }
}
