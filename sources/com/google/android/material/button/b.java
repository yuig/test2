package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import bk.a0;
import bk.i;
import bk.o;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f32367a;

    /* renamed from: b, reason: collision with root package name */
    public o f32368b;

    /* renamed from: c, reason: collision with root package name */
    public int f32369c;

    /* renamed from: d, reason: collision with root package name */
    public int f32370d;

    /* renamed from: e, reason: collision with root package name */
    public int f32371e;

    /* renamed from: f, reason: collision with root package name */
    public int f32372f;

    /* renamed from: g, reason: collision with root package name */
    public int f32373g;

    /* renamed from: h, reason: collision with root package name */
    public int f32374h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f32375i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f32376j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f32377k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f32378l;

    /* renamed from: m, reason: collision with root package name */
    public i f32379m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f32383q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f32385s;

    /* renamed from: t, reason: collision with root package name */
    public int f32386t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32380n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f32381o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32382p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32384r = true;

    public b(MaterialButton materialButton, o oVar) {
        this.f32367a = materialButton;
        this.f32368b = oVar;
    }

    public final a0 a() {
        RippleDrawable rippleDrawable = this.f32385s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f32385s.getNumberOfLayers() > 2 ? (a0) this.f32385s.getDrawable(2) : (a0) this.f32385s.getDrawable(1);
    }

    public final i b(boolean z13) {
        RippleDrawable rippleDrawable = this.f32385s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (i) ((LayerDrawable) ((InsetDrawable) this.f32385s.getDrawable(0)).getDrawable()).getDrawable(!z13 ? 1 : 0);
    }

    public final void c() {
        this.f32381o = true;
        ColorStateList colorStateList = this.f32376j;
        MaterialButton materialButton = this.f32367a;
        materialButton.b(colorStateList);
        materialButton.p(this.f32375i);
    }

    public final void d(o oVar) {
        this.f32368b = oVar;
        if (b(false) != null) {
            b(false).Y0(oVar);
        }
        if (b(true) != null) {
            b(true).Y0(oVar);
        }
        if (a() != null) {
            a().Y0(oVar);
        }
    }

    public final void e(int i13, int i14) {
        WeakHashMap weakHashMap = v0.f102521a;
        MaterialButton materialButton = this.f32367a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i15 = this.f32371e;
        int i16 = this.f32372f;
        this.f32372f = i14;
        this.f32371e = i13;
        if (!this.f32381o) {
            f();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i13) - i15, paddingEnd, (paddingBottom + i14) - i16);
    }

    public final void f() {
        i iVar = new i(this.f32368b);
        MaterialButton materialButton = this.f32367a;
        iVar.o(materialButton.getContext());
        iVar.setTintList(this.f32376j);
        PorterDuff.Mode mode = this.f32375i;
        if (mode != null) {
            iVar.setTintMode(mode);
        }
        float f13 = this.f32374h;
        ColorStateList colorStateList = this.f32377k;
        iVar.f23052a.f23040k = f13;
        iVar.invalidateSelf();
        iVar.y(colorStateList);
        i iVar2 = new i(this.f32368b);
        iVar2.setTint(0);
        float f14 = this.f32374h;
        int u13 = this.f32380n ? b7.c.u(materialButton, fj.c.colorSurface) : 0;
        iVar2.f23052a.f23040k = f14;
        iVar2.invalidateSelf();
        iVar2.y(ColorStateList.valueOf(u13));
        i iVar3 = new i(this.f32368b);
        this.f32379m = iVar3;
        iVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(zj.a.c(this.f32378l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{iVar2, iVar}), this.f32369c, this.f32371e, this.f32370d, this.f32372f), this.f32379m);
        this.f32385s = rippleDrawable;
        materialButton.m(rippleDrawable);
        i b13 = b(false);
        if (b13 != null) {
            b13.s(this.f32386t);
            b13.setState(materialButton.getDrawableState());
        }
    }

    public final void g() {
        i b13 = b(false);
        i b14 = b(true);
        if (b13 != null) {
            float f13 = this.f32374h;
            ColorStateList colorStateList = this.f32377k;
            b13.f23052a.f23040k = f13;
            b13.invalidateSelf();
            b13.y(colorStateList);
            if (b14 != null) {
                float f14 = this.f32374h;
                int u13 = this.f32380n ? b7.c.u(this.f32367a, fj.c.colorSurface) : 0;
                b14.f23052a.f23040k = f14;
                b14.invalidateSelf();
                b14.y(ColorStateList.valueOf(u13));
            }
        }
    }
}
