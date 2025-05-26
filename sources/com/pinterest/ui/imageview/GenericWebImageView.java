package com.pinterest.ui.imageview;

import af2.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import bb2.j;
import com.makeramen.RoundedImageView;
import ey.j3;
import h32.d4;
import hs1.a;
import hs1.b;
import hs1.e;
import hs1.m;
import hs1.q;
import hs1.r;
import hs1.x;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import py.g;
import py.i;
import so.jb;
import ye2.o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB%\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/ui/imageview/GenericWebImageView;", "Lcom/makeramen/RoundedImageView;", "Lhs1/a;", "Lbb2/j;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "images_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class GenericWebImageView extends RoundedImageView implements a, j, c {
    public d4 A;
    public boolean B;
    public Bitmap C;
    public x D;

    /* renamed from: m, reason: collision with root package name */
    public o f52561m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f52562n;

    /* renamed from: o, reason: collision with root package name */
    public String f52563o;

    /* renamed from: p, reason: collision with root package name */
    public hs1.c f52564p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f52565q;

    /* renamed from: r, reason: collision with root package name */
    public q f52566r;

    /* renamed from: s, reason: collision with root package name */
    public uz1.x f52567s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f52568t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f52569u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f52570v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f52571w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f52572x;

    /* renamed from: y, reason: collision with root package name */
    public int f52573y;

    /* renamed from: z, reason: collision with root package name */
    public s92.c f52574z;

    public GenericWebImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s2();
        this.f52567s = new uz1.x(r2(), 1);
        this.f52568t = true;
        this.f52574z = s92.c.UNKNOWN;
        j3 j3Var = j3.f60510a;
        Function1 function1 = j3.f60518i;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.A = (d4) function1.invoke(context2);
        this.B = true;
    }

    @Override // hs1.a
    public final void B0(Bitmap bitmap, x xVar) {
        this.C = bitmap;
        this.D = xVar;
        boolean z13 = true;
        if (getHeight() == 0) {
            this.f52568t = true;
        }
        setImageDrawable(new b(getContext(), bitmap, xVar));
        hs1.c cVar = this.f52564p;
        if (cVar != null) {
            cVar.e();
        }
        hs1.c cVar2 = this.f52564p;
        if (cVar2 != null) {
            if (xVar != x.MEMORY && xVar != x.DISK) {
                z13 = false;
            }
            cVar2.a(z13);
        }
        this.f52571w = false;
        String pinUid = this.f52563o;
        if (pinUid != null) {
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            new g(pinUid).i();
        }
        this.f52573y = bitmap.getWidth();
        this.f52574z = dl2.b.C0(xVar, null);
        r2();
    }

    @Override // bb2.j
    public final void F0(int i13) {
        Bitmap bitmap = this.C;
        if (bitmap != null && qb0.b.d(bitmap) && this.B) {
            setColorFilter(i13);
        }
    }

    public void J1() {
        p1(true);
    }

    @Override // ee.i
    /* renamed from: K0 */
    public de.c getF44637j() {
        return null;
    }

    public boolean O1() {
        String str = this.f52563o;
        if (str == null || str.length() <= 0) {
            return true;
        }
        return this.f52571w;
    }

    @Override // bb2.j
    public final void P0(File file, int i13, int i14) {
        if (file != null) {
            e n13 = ((m) r2()).n(file);
            n13.f70086d = true;
            n13.f70087e = i13;
            n13.f70088f = i14;
            n13.a(this);
        }
    }

    @Override // bb2.j
    public final void V1(String str, boolean z13, Bitmap.Config config, int i13, int i14, Drawable drawable, String str2, Map map) {
        this.f52563o = str;
        this.f52567s.b(str, z13, i13, i14, map, this, this.f52565q);
    }

    public void Y(hs1.c cVar) {
        this.f52564p = cVar;
    }

    @Override // ee.i
    public void Z(de.c cVar) {
    }

    @Override // bb2.j
    /* renamed from: a, reason: from getter */
    public final String getF52563o() {
        return this.f52563o;
    }

    @Override // bb2.j
    public final void clear() {
        this.f52563o = null;
        setImageDrawable(null);
        postInvalidate();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f52561m == null) {
            this.f52561m = new o(this);
        }
        return this.f52561m;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f52561m == null) {
            this.f52561m = new o(this);
        }
        return this.f52561m.generatedComponent();
    }

    public boolean isPWTImageDrawn() {
        return O1();
    }

    @Override // hs1.a, ee.i
    public final void j(Drawable drawable) {
        if (drawable != null) {
            setImageDrawable(drawable);
        }
        hs1.c cVar = this.f52564p;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // bb2.j
    public final int k0() {
        Bitmap bitmap = this.C;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

    @Override // bb2.j
    public final void loadUrl(String str) {
        this.f52563o = str;
        boolean z13 = this.f52565q;
        uz1.x xVar = this.f52567s;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(this, "cacheableImage");
        xVar.b(str, true, 0, 0, null, this, z13);
    }

    @Override // hs1.a
    public final void n1(String str) {
        this.f52563o = str;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        String pinUid = this.f52563o;
        if (pinUid != null) {
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            new py.e(pinUid).i();
        }
    }

    @Override // com.makeramen.RoundedImageView, android.widget.ImageView, android.view.View, eo.d
    public void onDraw(Canvas canvas) {
        String pinUid;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.f52571w && getDrawable() != null) {
            this.f52571w = true;
            hs1.c cVar = this.f52564p;
            if (cVar != null) {
                cVar.b();
            }
            String str = this.f52563o;
            if (str != null) {
                new i(str, this.f52574z, null, this.f52573y, getWidth()).i();
            }
        }
        if (this.f52572x) {
            return;
        }
        this.f52572x = true;
        if (this.f52571w || (pinUid = this.f52563o) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        new py.b(pinUid).i();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i13, int i14) {
        boolean z13 = false;
        boolean z14 = View.MeasureSpec.getMode(i13) != 1073741824;
        boolean z15 = View.MeasureSpec.getMode(i14) != 1073741824;
        if (!z14 && !z15) {
            z13 = true;
        }
        this.f52570v = z13;
        super.onMeasure(i13, i14);
    }

    @Override // hs1.a
    public final void p1(boolean z13) {
        ((m) r2()).h(this);
        if (z13) {
            setImageBitmap(null);
        }
        this.f52563o = null;
        this.f52571w = false;
        this.f52572x = false;
        this.f52573y = 0;
        this.f52574z = s92.c.UNKNOWN;
    }

    public final q r2() {
        q qVar = this.f52566r;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("imageCache");
        throw null;
    }

    @Override // android.view.View
    public final void requestLayout() {
        if (this.f52568t || this.f52569u) {
            super.requestLayout();
            this.f52568t = false;
        }
    }

    @Override // hs1.a, ee.i
    public void s(Drawable drawable) {
        hs1.c cVar = this.f52564p;
        if (cVar != null) {
            cVar.d();
        }
        String pinUid = this.f52563o;
        if (pinUid != null) {
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            new py.c(pinUid).i();
        }
    }

    @Override // hs1.a
    public final void s1(x xVar) {
        this.D = xVar;
        hs1.c cVar = this.f52564p;
        if (cVar != null) {
            cVar.e();
        }
        hs1.c cVar2 = this.f52564p;
        if (cVar2 != null) {
            if (xVar != x.MEMORY) {
                x xVar2 = x.DISK;
            }
            cVar2.c();
        }
        this.f52571w = false;
        String pinUid = this.f52563o;
        if (pinUid != null) {
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            new g(pinUid).i();
        }
        this.f52574z = dl2.b.C0(xVar, null);
    }

    public void s2() {
        if (this.f52562n) {
            return;
        }
        this.f52562n = true;
        this.f52566r = (q) ((jb) ((bb2.g) generatedComponent())).f113483a.f113875q7.get();
    }

    @Override // com.makeramen.RoundedImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        hs1.c cVar;
        this.f52568t = this.f52570v || this.f52568t;
        super.setImageBitmap(bitmap);
        if (bitmap == null || (cVar = this.f52564p) == null) {
            return;
        }
        cVar.e();
    }

    @Override // com.makeramen.RoundedImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f52568t = this.f52570v || this.f52568t;
        super.setImageDrawable(drawable);
    }

    @Override // com.makeramen.RoundedImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i13) {
        this.f52568t = this.f52570v || this.f52568t;
        super.setImageResource(i13);
    }

    @Override // com.makeramen.RoundedImageView, android.widget.ImageView, eo.d
    public final void setScaleType(ImageView.ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f52568t = true;
        super.setScaleType(scaleType);
    }

    public final void t2(File file) {
        if (file != null) {
            e n13 = ((m) r2()).n(file);
            n13.f70086d = true;
            n13.a(this);
        }
    }

    @Override // bb2.j
    public final void w1() {
        ((m) r2()).h(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:14:0x0046, B:16:0x004a), top: B:13:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w2(android.net.Uri r10) {
        /*
            r9 = this;
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r9.f52563o = r0
            uz1.x r1 = r9.f52567s
            r1.getClass()
            java.lang.String r0 = "cacheableImage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r9.J1()
            if (r10 == 0) goto Ld5
            java.lang.String r2 = r10.getScheme()
            if (r2 == 0) goto Ld5
            int r2 = r2.length()
            if (r2 != 0) goto L23
            goto Ld5
        L23:
            java.lang.String r2 = r10.getScheme()
            if (r2 == 0) goto Ld5
            int r3 = r2.hashCode()
            switch(r3) {
                case 2157948: goto Lb1;
                case 2228360: goto L97;
                case 3143036: goto L8e;
                case 3213448: goto L85;
                case 69079243: goto L7c;
                case 99617003: goto L73;
                case 951530617: goto L3c;
                case 1669513305: goto L32;
                default: goto L30;
            }
        L30:
            goto Ld5
        L32:
            java.lang.String r0 = "CONTENT"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L46
            goto Ld5
        L3c:
            java.lang.String r0 = "content"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L46
            goto Ld5
        L46:
            boolean r0 = r9 instanceof com.pinterest.ui.imageview.WebImageView     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto Ld5
            r0 = r9
            com.pinterest.ui.imageview.WebImageView r0 = (com.pinterest.ui.imageview.WebImageView) r0     // Catch: java.lang.Exception -> L5e
            android.content.Context r1 = r0.getContext()     // Catch: java.lang.Exception -> L5e
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L5e
            android.graphics.Bitmap r10 = android.provider.MediaStore.Images.Media.getBitmap(r1, r10)     // Catch: java.lang.Exception -> L5e
            r0.setImageBitmap(r10)     // Catch: java.lang.Exception -> L5e
            goto Ld5
        L5e:
            r10 = move-exception
            ob0.a r0 = ob0.b.f93978b
            if (r0 == 0) goto L6c
            java.lang.String r1 = "Failed to decode bitmap for WebImageView"
            tb0.h r0 = (tb0.h) r0
            r0.o(r1, r10)
            goto Ld5
        L6c:
            java.lang.String r10 = "crashReporter"
            kotlin.jvm.internal.Intrinsics.r(r10)
            r10 = 0
            throw r10
        L73:
            java.lang.String r3 = "https"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La0
            goto Ld5
        L7c:
            java.lang.String r3 = "HTTPS"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La0
            goto Ld5
        L85:
            java.lang.String r3 = "http"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La0
            goto Ld5
        L8e:
            java.lang.String r0 = "file"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lba
            goto Ld5
        L97:
            java.lang.String r3 = "HTTP"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La0
            goto Ld5
        La0:
            java.lang.String r2 = r10.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r3 = 1
            r6 = 0
            r4 = 0
            r5 = 0
            r8 = 0
            r7 = r9
            r1.b(r2, r3, r4, r5, r6, r7, r8)
            goto Ld5
        Lb1:
            java.lang.String r0 = "FILE"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lba
            goto Ld5
        Lba:
            java.io.File r0 = new java.io.File
            java.lang.String r10 = r10.getPath()
            if (r10 != 0) goto Lc4
            java.lang.String r10 = ""
        Lc4:
            r0.<init>(r10)
            hs1.q r10 = r1.f123326a
            hs1.m r10 = (hs1.m) r10
            hs1.e r10 = r10.n(r0)
            r0 = 1
            r10.f70086d = r0
            r10.a(r9)
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.imageview.GenericWebImageView.w2(android.net.Uri):void");
    }

    public final boolean x2(String url) {
        if (url == null) {
            return false;
        }
        m mVar = (m) r2();
        Intrinsics.checkNotNullParameter(this, "cacheableImage");
        Intrinsics.checkNotNullParameter(url, "url");
        if (!mVar.m(url)) {
            return false;
        }
        q.a(mVar, this, url, 0, 0, r.f70066d, null, null, 896);
        return true;
    }

    @Override // hs1.a
    public final void y1() {
        setImageBitmap(null);
    }

    @Override // bb2.j
    /* renamed from: z0, reason: from getter */
    public final Bitmap getC() {
        return this.C;
    }

    @Override // bb2.j
    public final int z1() {
        Bitmap bitmap = this.C;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    public GenericWebImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        s2();
        this.f52567s = new uz1.x(r2(), 1);
        this.f52568t = true;
        this.f52574z = s92.c.UNKNOWN;
        j3 j3Var = j3.f60510a;
        Function1 function1 = j3.f60518i;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.A = (d4) function1.invoke(context2);
        this.B = true;
    }
}
