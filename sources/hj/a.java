package hj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bk.i;
import bk.o;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.z;
import fj.c;
import fj.k;
import fj.l;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import yj.e;

/* loaded from: classes3.dex */
public final class a extends Drawable implements z {

    /* renamed from: n, reason: collision with root package name */
    public static final int f69253n = l.Widget_MaterialComponents_Badge;

    /* renamed from: o, reason: collision with root package name */
    public static final int f69254o = c.badgeStyle;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f69255a;

    /* renamed from: b, reason: collision with root package name */
    public final i f69256b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f69257c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f69258d;

    /* renamed from: e, reason: collision with root package name */
    public final b f69259e;

    /* renamed from: f, reason: collision with root package name */
    public float f69260f;

    /* renamed from: g, reason: collision with root package name */
    public float f69261g;

    /* renamed from: h, reason: collision with root package name */
    public final int f69262h;

    /* renamed from: i, reason: collision with root package name */
    public float f69263i;

    /* renamed from: j, reason: collision with root package name */
    public float f69264j;

    /* renamed from: k, reason: collision with root package name */
    public float f69265k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f69266l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f69267m;

    public a(Context context, BadgeState$State badgeState$State) {
        e eVar;
        WeakReference weakReference = new WeakReference(context);
        this.f69255a = weakReference;
        d0.b(context);
        this.f69258d = new Rect();
        a0 a0Var = new a0(this);
        this.f69257c = a0Var;
        TextPaint textPaint = a0Var.f32699a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context, badgeState$State);
        this.f69259e = bVar;
        boolean f13 = f();
        BadgeState$State badgeState$State2 = bVar.f69269b;
        i iVar = new i(o.c(context, f13 ? badgeState$State2.f32208g.intValue() : badgeState$State2.f32206e.intValue(), f() ? badgeState$State2.f32209h.intValue() : badgeState$State2.f32207f.intValue()).a());
        this.f69256b = iVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && a0Var.f32705g != (eVar = new e(context2, badgeState$State2.f32205d.intValue()))) {
            a0Var.c(eVar, context2);
            textPaint.setColor(badgeState$State2.f32204c.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i13 = badgeState$State2.f32213l;
        if (i13 != -2) {
            this.f69262h = ((int) Math.pow(10.0d, i13 - 1.0d)) - 1;
        } else {
            this.f69262h = badgeState$State2.f32214m;
        }
        a0Var.f32703e = true;
        j();
        invalidateSelf();
        a0Var.f32703e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(badgeState$State2.f32203b.intValue());
        if (iVar.f23052a.f23032c != valueOf) {
            iVar.t(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(badgeState$State2.f32204c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f69266l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f69266l.get();
            WeakReference weakReference3 = this.f69267m;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(badgeState$State2.f32221t.booleanValue(), false);
    }

    @Override // com.google.android.material.internal.z
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        b bVar = this.f69259e;
        BadgeState$State badgeState$State = bVar.f69269b;
        String str = badgeState$State.f32211j;
        boolean z13 = str != null;
        WeakReference weakReference = this.f69255a;
        if (z13) {
            int i13 = badgeState$State.f32213l;
            if (i13 == -2 || str == null || str.length() <= i13) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(k.m3_exceed_max_badge_text_suffix), str.substring(0, i13 - 1), "…");
        }
        if (!g()) {
            return null;
        }
        int i14 = this.f69262h;
        BadgeState$State badgeState$State2 = bVar.f69269b;
        if (i14 == -2 || d() <= this.f69262h) {
            return NumberFormat.getInstance(badgeState$State2.f32215n).format(d());
        }
        Context context2 = (Context) weakReference.get();
        return context2 == null ? "" : String.format(badgeState$State2.f32215n, context2.getString(k.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f69262h), "+");
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.f69267m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i13 = this.f69259e.f69269b.f32212k;
        if (i13 != -1) {
            return i13;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String b13;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f69256b.draw(canvas);
        if (!f() || (b13 = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        a0 a0Var = this.f69257c;
        a0Var.f32699a.getTextBounds(b13, 0, b13.length(), rect);
        float exactCenterY = this.f69261g - rect.exactCenterY();
        canvas.drawText(b13, this.f69260f, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), a0Var.f32699a);
    }

    public final BadgeState$State e() {
        return this.f69259e.f69268a;
    }

    public final boolean f() {
        return this.f69259e.f69269b.f32211j != null || g();
    }

    public final boolean g() {
        BadgeState$State badgeState$State = this.f69259e.f69269b;
        return badgeState$State.f32211j == null && badgeState$State.f32212k != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f69259e.f69269b.f32210i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f69258d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f69258d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.f69255a.get();
        if (context == null) {
            return;
        }
        boolean f13 = f();
        b bVar = this.f69259e;
        this.f69256b.Y0(o.c(context, f13 ? bVar.f69269b.f32208g.intValue() : bVar.f69269b.f32206e.intValue(), f() ? bVar.f69269b.f32209h.intValue() : bVar.f69269b.f32207f.intValue()).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.f69266l = new WeakReference(view);
        this.f69267m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hj.a.j():void");
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.z
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        b bVar = this.f69259e;
        bVar.f69268a.f32210i = i13;
        bVar.f69269b.f32210i = i13;
        this.f69257c.f32699a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
