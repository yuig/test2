package com.google.android.material.internal;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public float f32701c;

    /* renamed from: d, reason: collision with root package name */
    public float f32702d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f32704f;

    /* renamed from: g, reason: collision with root package name */
    public yj.e f32705g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f32699a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final nj.b f32700b = new nj.b(this, 1);

    /* renamed from: e, reason: collision with root package name */
    public boolean f32703e = true;

    public a0(z zVar) {
        this.f32704f = new WeakReference(null);
        this.f32704f = new WeakReference(zVar);
    }

    public final float a(String str) {
        if (!this.f32703e) {
            return this.f32701c;
        }
        b(str);
        return this.f32701c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.f32699a;
        this.f32701c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f32702d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f32703e = false;
    }

    public final void c(yj.e eVar, Context context) {
        if (this.f32705g != eVar) {
            this.f32705g = eVar;
            if (eVar != null) {
                TextPaint textPaint = this.f32699a;
                nj.b bVar = this.f32700b;
                eVar.f(context, textPaint, bVar);
                z zVar = (z) this.f32704f.get();
                if (zVar != null) {
                    textPaint.drawableState = zVar.getState();
                }
                eVar.e(context, textPaint, bVar);
                this.f32703e = true;
            }
            z zVar2 = (z) this.f32704f.get();
            if (zVar2 != null) {
                zVar2.a();
                zVar2.onStateChange(zVar2.getState());
            }
        }
    }
}
