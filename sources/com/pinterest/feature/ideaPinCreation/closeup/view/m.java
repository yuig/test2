package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* loaded from: classes5.dex */
public final class m extends ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f46229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f46230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float[] f46231c;

    public m(float f13, int[] iArr, float[] fArr) {
        this.f46229a = f13;
        this.f46230b = iArr;
        this.f46231c = fArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public final Shader resize(int i13, int i14) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, this.f46229a, this.f46230b, this.f46231c, Shader.TileMode.CLAMP);
    }
}
