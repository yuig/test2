package com.modiface.mfemakeupkit.facetracking;

import androidx.annotation.NonNull;
import com.modiface.mfecommon.utils.MFEImage;
import com.modiface.mfemakeupkit.data.MFEFaceTrackingParameters;
import com.modiface.mfemakeupkit.facetracking.a;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final MFEImage f34495a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final MFEFaceTrackingParameters f34496b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final a.s f34497c;

    public /* synthetic */ n(MFEImage mFEImage, MFEFaceTrackingParameters mFEFaceTrackingParameters, a.s sVar, e eVar) {
        this(mFEImage, mFEFaceTrackingParameters, sVar);
    }

    private n(@NonNull MFEImage mFEImage, @NonNull MFEFaceTrackingParameters mFEFaceTrackingParameters, @NonNull a.s sVar) {
        this.f34495a = mFEImage;
        this.f34496b = mFEFaceTrackingParameters;
        this.f34497c = sVar;
    }
}
