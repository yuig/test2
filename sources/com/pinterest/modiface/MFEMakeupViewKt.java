package com.pinterest.modiface;

import com.modiface.mfemakeupkit.effects.MFEMakeupEyeshadowLayer;
import com.modiface.mfemakeupkit.effects.MFEMakeupLayer;
import com.modiface.mfemakeupkit.effects.MFEMakeupProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x81.g;
import x81.h;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lx81/g;", "Lcom/modiface/mfemakeupkit/effects/MFEMakeupLayer;", "toLipstickLayer", "(Lx81/g;)Lcom/modiface/mfemakeupkit/effects/MFEMakeupLayer;", "Lcom/modiface/mfemakeupkit/effects/MFEMakeupEyeshadowLayer;", "toEyeshadowLayer", "(Lx81/g;)Lcom/modiface/mfemakeupkit/effects/MFEMakeupEyeshadowLayer;", "Lx81/h;", "Lcom/modiface/mfemakeupkit/effects/MFEMakeupProduct;", "toMFEMakeupProduct", "(Lx81/h;)Lcom/modiface/mfemakeupkit/effects/MFEMakeupProduct;", "", "CLASS_NAME", "Ljava/lang/String;", "MFE_FACE_TRACKER_BUNDLE_PATH", "", "SCALE_FACTOR", "F", "modiface_productionRelease"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MFEMakeupViewKt {

    @NotNull
    public static final String CLASS_NAME = "MFEMakeupView";

    @NotNull
    public static final String MFE_FACE_TRACKER_BUNDLE_PATH = "MFEFaceTrackerBundle";
    public static final float SCALE_FACTOR = 0.01f;

    @NotNull
    public static final MFEMakeupEyeshadowLayer toEyeshadowLayer(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new MFEMakeupEyeshadowLayer(toMFEMakeupProduct(gVar.f134229h), MFEMakeupEyeshadowLayer.Style.Lid);
    }

    @NotNull
    public static final MFEMakeupLayer toLipstickLayer(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new MFEMakeupLayer(toMFEMakeupProduct(gVar.f134229h));
    }

    @NotNull
    public static final MFEMakeupProduct toMFEMakeupProduct(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        MFEMakeupProduct mFEMakeupProduct = new MFEMakeupProduct();
        mFEMakeupProduct.color = hVar.f134230h;
        mFEMakeupProduct.intensity = hVar.f134231i * 0.01f;
        mFEMakeupProduct.gloss = hVar.f134233k * 0.01f;
        mFEMakeupProduct.glossDetail = hVar.f134234l * 0.01f;
        mFEMakeupProduct.matteness = hVar.f134235m * 0.01f;
        mFEMakeupProduct.envMappingIntensity = hVar.f134236n * 0.01f;
        mFEMakeupProduct.sparkleIntensity = hVar.f134232j * 0.01f;
        mFEMakeupProduct.sparkleColor = hVar.f134237o;
        mFEMakeupProduct.sparkleDensity = hVar.f134238p * 0.01f;
        mFEMakeupProduct.sparkleSize = hVar.f134239q * 0.01f;
        mFEMakeupProduct.sparkleBaseReflectivity = hVar.f134240r * 0.01f;
        mFEMakeupProduct.sparkleColorVariation = hVar.f134241s * 0.01f;
        mFEMakeupProduct.sparkleSizeVariation = hVar.f134242t * 0.01f;
        return mFEMakeupProduct;
    }
}
