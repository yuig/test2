package bk;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public o f23030a;

    /* renamed from: b, reason: collision with root package name */
    public rj.a f23031b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f23032c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f23033d;

    /* renamed from: e, reason: collision with root package name */
    public final ColorStateList f23034e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f23035f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f23036g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f23037h;

    /* renamed from: i, reason: collision with root package name */
    public final float f23038i;

    /* renamed from: j, reason: collision with root package name */
    public float f23039j;

    /* renamed from: k, reason: collision with root package name */
    public float f23040k;

    /* renamed from: l, reason: collision with root package name */
    public int f23041l;

    /* renamed from: m, reason: collision with root package name */
    public float f23042m;

    /* renamed from: n, reason: collision with root package name */
    public float f23043n;

    /* renamed from: o, reason: collision with root package name */
    public final float f23044o;

    /* renamed from: p, reason: collision with root package name */
    public int f23045p;

    /* renamed from: q, reason: collision with root package name */
    public int f23046q;

    /* renamed from: r, reason: collision with root package name */
    public int f23047r;

    /* renamed from: s, reason: collision with root package name */
    public final int f23048s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f23049t;

    /* renamed from: u, reason: collision with root package name */
    public Paint.Style f23050u;

    public h(o oVar) {
        this.f23032c = null;
        this.f23033d = null;
        this.f23034e = null;
        this.f23035f = null;
        this.f23036g = PorterDuff.Mode.SRC_IN;
        this.f23037h = null;
        this.f23038i = 1.0f;
        this.f23039j = 1.0f;
        this.f23041l = 255;
        this.f23042m = 0.0f;
        this.f23043n = 0.0f;
        this.f23044o = 0.0f;
        this.f23045p = 0;
        this.f23046q = 0;
        this.f23047r = 0;
        this.f23048s = 0;
        this.f23049t = false;
        this.f23050u = Paint.Style.FILL_AND_STROKE;
        this.f23030a = oVar;
        this.f23031b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.f23056e = true;
        return iVar;
    }

    public h(h hVar) {
        this.f23032c = null;
        this.f23033d = null;
        this.f23034e = null;
        this.f23035f = null;
        this.f23036g = PorterDuff.Mode.SRC_IN;
        this.f23037h = null;
        this.f23038i = 1.0f;
        this.f23039j = 1.0f;
        this.f23041l = 255;
        this.f23042m = 0.0f;
        this.f23043n = 0.0f;
        this.f23044o = 0.0f;
        this.f23045p = 0;
        this.f23046q = 0;
        this.f23047r = 0;
        this.f23048s = 0;
        this.f23049t = false;
        this.f23050u = Paint.Style.FILL_AND_STROKE;
        this.f23030a = hVar.f23030a;
        this.f23031b = hVar.f23031b;
        this.f23040k = hVar.f23040k;
        this.f23032c = hVar.f23032c;
        this.f23033d = hVar.f23033d;
        this.f23036g = hVar.f23036g;
        this.f23035f = hVar.f23035f;
        this.f23041l = hVar.f23041l;
        this.f23038i = hVar.f23038i;
        this.f23047r = hVar.f23047r;
        this.f23045p = hVar.f23045p;
        this.f23049t = hVar.f23049t;
        this.f23039j = hVar.f23039j;
        this.f23042m = hVar.f23042m;
        this.f23043n = hVar.f23043n;
        this.f23044o = hVar.f23044o;
        this.f23046q = hVar.f23046q;
        this.f23048s = hVar.f23048s;
        this.f23034e = hVar.f23034e;
        this.f23050u = hVar.f23050u;
        if (hVar.f23037h != null) {
            this.f23037h = new Rect(hVar.f23037h);
        }
    }
}
