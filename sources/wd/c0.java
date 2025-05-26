package wd;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes3.dex */
public final class c0 implements pd.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129160a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f129161b;

    public /* synthetic */ c0(Object obj, int i13) {
        this.f129160a = i13;
        this.f129161b = obj;
    }

    @Override // pd.g0
    public final int a() {
        int intrinsicWidth;
        int intrinsicHeight;
        int i13 = this.f129160a;
        Object obj = this.f129161b;
        switch (i13) {
            case 0:
                return he.n.c((Bitmap) obj);
            case 1:
                return ((byte[]) obj).length;
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
                intrinsicWidth = animatedImageDrawable.getIntrinsicWidth();
                intrinsicHeight = animatedImageDrawable.getIntrinsicHeight();
                return he.n.d(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
            default:
                return 1;
        }
    }

    @Override // pd.g0
    public final void c() {
        switch (this.f129160a) {
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f129161b;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                break;
        }
    }

    @Override // pd.g0
    public final Class d() {
        switch (this.f129160a) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return this.f129161b.getClass();
        }
    }

    @Override // pd.g0
    public final Object get() {
        int i13 = this.f129160a;
        Object obj = this.f129161b;
        switch (i13) {
            case 0:
                return (Bitmap) obj;
            case 1:
                return (byte[]) obj;
            case 2:
                return (AnimatedImageDrawable) obj;
            default:
                return obj;
        }
    }

    public c0(byte[] bArr) {
        this.f129160a = 1;
        d7.b.p(bArr, "Argument must not be null");
        this.f129161b = bArr;
    }

    public c0(File file) {
        this.f129160a = 3;
        d7.b.p(file, "Argument must not be null");
        this.f129161b = file;
    }
}
