package com.modiface.mfecommon.utils;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class a0 extends MFEImage {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final WeakReference<i> f34263a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f34264b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final l0 f34265c;

    public a0(int i13, int i14, @NonNull Bitmap bitmap, @NonNull MFESharedGLTexture mFESharedGLTexture, i iVar) {
        super(i13, i14, bitmap, mFESharedGLTexture);
        this.f34264b = false;
        this.f34263a = new WeakReference<>(iVar);
        l0 l0Var = new l0();
        this.f34265c = l0Var;
        l0Var.b();
    }

    private void a() {
        if (isClosed() || this.f34264b) {
            return;
        }
        boolean a13 = this.f34265c.a();
        i iVar = this.f34263a.get();
        if (a13 && iVar != null) {
            boolean a14 = iVar.a(this);
            this.f34264b = a14;
            if (a14) {
                this.f34265c.b();
            }
        }
        if (this.f34264b) {
            return;
        }
        super.close(false);
    }

    public void b() {
        if (isClosed()) {
            return;
        }
        this.f34265c.a();
        super.close(false);
    }

    public void c() {
        this.f34264b = false;
    }

    @Override // com.modiface.mfecommon.utils.MFEImage
    public void close(boolean z13) {
        if (z13) {
            b();
        } else {
            a();
        }
    }

    @Override // com.modiface.mfecommon.utils.MFEImage
    @NonNull
    public MFEImage createCopy() {
        if (isClosed()) {
            throw new IllegalStateException("Cannot create a copy of a closed image: " + getFrameID());
        }
        if (!this.f34264b) {
            return new a0(getWidth(), getHeight(), getBitmap(), getTexture().createCopy(), getFrameID(), this.f34263a.get(), this.f34265c);
        }
        throw new IllegalStateException("Cannot create a copy of an image in the cache: " + getFrameID());
    }

    private a0(int i13, int i14, @NonNull Bitmap bitmap, @NonNull MFESharedGLTexture mFESharedGLTexture, int i15, i iVar, @NonNull l0 l0Var) {
        super(i13, i14, bitmap, mFESharedGLTexture, i15);
        this.f34264b = false;
        this.f34263a = new WeakReference<>(iVar);
        this.f34265c = l0Var;
        l0Var.b();
    }
}
