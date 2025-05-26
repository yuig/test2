package com.pinterest.shuffles.scene.composer;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Size;
import java.net.URLDecoder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r72.a2;
import r72.u1;

/* loaded from: classes4.dex */
public final class g extends ee.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1 f52039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r72.y0 f52040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f52041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n72.m f52042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f52043h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f52044i;

    public g(u1 u1Var, r72.y0 y0Var, Function0 function0, n72.m mVar, h hVar, Function0 function02) {
        this.f52039d = u1Var;
        this.f52040e = y0Var;
        this.f52041f = function0;
        this.f52042g = mVar;
        this.f52043h = hVar;
        this.f52044i = function02;
    }

    @Override // ee.c, ee.i
    public final void j(Drawable drawable) {
        this.f52043h.f52012n = false;
    }

    @Override // ee.i
    public final void m(Drawable drawable) {
        this.f52043h.c(null);
    }

    @Override // ee.c, ee.i
    public final void s(Drawable drawable) {
        this.f52043h.f52012n = true;
        this.f52044i.invoke();
    }

    @Override // ee.i
    public final void z(Object obj, fe.d dVar) {
        Bitmap resource = (Bitmap) obj;
        h hVar = this.f52043h;
        Intrinsics.checkNotNullParameter(resource, "resource");
        int width = resource.getWidth();
        Function0 function0 = this.f52041f;
        n72.m mVar = this.f52042g;
        u1 u1Var = this.f52039d;
        r72.y0 y0Var = this.f52040e;
        if (width > 4096 || resource.getHeight() > 4096) {
            String a13 = a2.a(u1Var.f106669a);
            String decode = URLDecoder.decode(y0Var.f106716a, "UTF-8");
            int width2 = resource.getWidth();
            int height = resource.getHeight();
            Object invoke = function0.invoke();
            StringBuilder w13 = a.a.w("Image too large for XRenderer: item id: ", a13, ", image url: ", decode, ", image width: ");
            a.a.z(w13, width2, ", image height: ", height, ", requested width: ");
            w13.append(y0Var.f106719d);
            w13.append(", canvas width: ");
            w13.append(invoke);
            String sb3 = w13.toString();
            mVar.b(sb3, n72.l.VERBOSE);
            mVar.d(new IllegalStateException("Image too large for XRenderer"), new s60.a(sb3, 3));
            resource = t62.a.b(resource);
        }
        try {
            hVar.c(resource);
            int i13 = z.f52181a;
            Size c13 = z.c(((Number) function0.invoke()).intValue(), y0Var.f106717b, y0Var.f106719d, resource.getWidth(), resource.getHeight());
            hVar.f52050p = c13.getHeight();
            hVar.d(c13.getHeight() * ((float) u1Var.f106671c));
        } catch (Exception e13) {
            mVar.d(e13, new et1.r0(13, u1Var, y0Var));
        }
        hVar.f52012n = true;
        this.f52044i.invoke();
    }
}
