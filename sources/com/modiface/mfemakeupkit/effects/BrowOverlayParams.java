package com.modiface.mfemakeupkit.effects;

import android.graphics.PointF;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public class BrowOverlayParams implements Cloneable {
    public String overlayImagePath = null;
    public float overlayAmount = 0.0f;
    public PointF[] referenceBrowPoints = null;
    public float topExpansion = 0.0f;
    public float bottomExpansion = 0.0f;
    public Side side = Side.Left;

    public enum Side {
        Left,
        Right
    }

    @NonNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BrowOverlayParams m113clone() {
        BrowOverlayParams browOverlayParams = new BrowOverlayParams();
        browOverlayParams.overlayImagePath = this.overlayImagePath;
        browOverlayParams.overlayAmount = this.overlayAmount;
        PointF[] pointFArr = this.referenceBrowPoints;
        browOverlayParams.referenceBrowPoints = pointFArr == null ? null : (PointF[]) pointFArr.clone();
        browOverlayParams.topExpansion = this.topExpansion;
        browOverlayParams.bottomExpansion = this.bottomExpansion;
        browOverlayParams.side = this.side;
        return browOverlayParams;
    }
}
