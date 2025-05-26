package mj1;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import wa2.l;

/* loaded from: classes5.dex */
public final class a extends LayerDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final View f87278a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l[] layers, View pinRepView) {
        super(layers);
        Intrinsics.checkNotNullParameter(layers, "layers");
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        this.f87278a = pinRepView;
    }
}
