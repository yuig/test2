package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import je.e;
import je.g;
import je.g2;
import je.j2;
import je.k1;
import je.m0;
import je.r;
import je.u2;
import je.v2;
import je.w;
import je.x;
import je.z;
import net.quikkly.android.utils.BitmapUtils;
import v.z1;

/* loaded from: classes3.dex */
public class SVGImageView extends ImageView {

    /* renamed from: c, reason: collision with root package name */
    public static final Method f29841c;

    /* renamed from: a, reason: collision with root package name */
    public j2 f29842a;

    /* renamed from: b, reason: collision with root package name */
    public final x f29843b;

    static {
        try {
            f29841c = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f29842a = null;
        this.f29843b = new x();
        b(attributeSet, 0);
    }

    public final void a() {
        z zVar;
        Picture f13;
        g2 g2Var;
        m0 m0Var;
        z zVar2;
        j2 j2Var = this.f29842a;
        if (j2Var == null) {
            return;
        }
        x xVar = this.f29843b;
        if (xVar == null || (zVar = xVar.f75809c) == null) {
            zVar = j2Var.f75668a.f75802o;
        }
        if (xVar == null || (zVar2 = xVar.f75811e) == null) {
            k1 k1Var = j2Var.f75668a;
            m0 m0Var2 = k1Var.f75673r;
            if (m0Var2 != null && m0Var2.f75695b != (g2Var = g2.percent) && (m0Var = k1Var.f75674s) != null && m0Var.f75695b != g2Var) {
                f13 = j2Var.f((int) Math.ceil(m0Var2.a(96.0f)), (int) Math.ceil(j2Var.f75668a.f75674s.a(96.0f)), xVar);
            } else if (m0Var2 == null || zVar == null) {
                m0 m0Var3 = k1Var.f75674s;
                if (m0Var3 == null || zVar == null) {
                    f13 = j2Var.f(BitmapUtils.BITMAP_TO_JPEG_SIZE, BitmapUtils.BITMAP_TO_JPEG_SIZE, xVar);
                } else {
                    f13 = j2Var.f((int) Math.ceil((zVar.f75825c * r3) / zVar.f75826d), (int) Math.ceil(m0Var3.a(96.0f)), xVar);
                }
            } else {
                f13 = j2Var.f((int) Math.ceil(m0Var2.a(96.0f)), (int) Math.ceil((zVar.f75826d * r3) / zVar.f75825c), xVar);
            }
        } else {
            f13 = j2Var.f((int) Math.ceil(zVar2.a()), (int) Math.ceil(xVar.f75811e.b()), xVar);
        }
        Method method = f29841c;
        if (method != null) {
            try {
                method.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
            } catch (Exception e13) {
                Log.w("SVGImageView", "Unexpected failure calling setLayerType", e13);
            }
        }
        setImageDrawable(new PictureDrawable(f13));
    }

    public final void b(AttributeSet attributeSet, int i13) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, w.SVGImageView, i13, 0);
        try {
            String string = obtainStyledAttributes.getString(w.SVGImageView_css);
            if (string != null) {
                x xVar = this.f29843b;
                xVar.getClass();
                z1 z1Var = new z1(g.screen, r.RenderOptions);
                e eVar = new e(string);
                eVar.K();
                xVar.f75807a = z1Var.q(eVar);
            }
            int resourceId = obtainStyledAttributes.getResourceId(w.SVGImageView_svg, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                obtainStyledAttributes.recycle();
                return;
            }
            String string2 = obtainStyledAttributes.getString(w.SVGImageView_svg);
            if (string2 != null) {
                if (c(Uri.parse(string2))) {
                    obtainStyledAttributes.recycle();
                    return;
                }
                try {
                    try {
                        new v2(this).execute(getContext().getAssets().open(string2));
                        obtainStyledAttributes.recycle();
                        return;
                    } catch (IOException unused) {
                        this.f29842a = j2.d(string2);
                        a();
                    }
                } catch (SVGParseException unused2) {
                    Log.e("SVGImageView", "Could not find SVG at: ".concat(string2));
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public final boolean c(Uri uri) {
        try {
            new v2(this).execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i13) {
        new u2(this, getContext(), i13).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        if (c(uri)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + uri);
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f29842a = null;
        this.f29843b = new x();
        b(attributeSet, i13);
    }
}
