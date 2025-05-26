package c0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.IOException;
import java.io.InputStream;
import je.c2;
import kotlin.jvm.internal.Intrinsics;
import oi.d5;
import oi.f7;
import oi.g4;
import oi.o4;
import oi.u4;
import oi.x3;
import oi.y3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class s0 implements d5, yn.c {

    /* renamed from: a */
    public Object f24333a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s0(int i13) {
        this((Object) null);
        if (i13 == 6) {
            this.f24333a = new bb.p(this, 14);
        } else if (i13 != 9) {
        } else {
            this(new ll.j(13));
        }
    }

    public abstract void b(Canvas canvas, Rect rect, float f13, boolean z13, boolean z14);

    @Override // yn.c
    public final Object c(InputStream inputStream) {
        try {
            return j(((ll.j) this.f24333a).c(inputStream));
        } catch (JSONException e13) {
            throw new IOException(e13);
        }
    }

    public boolean d(c2 c2Var) {
        return true;
    }

    public abstract void e(Canvas canvas, Paint paint, int i13, int i14);

    public abstract void f(Canvas canvas, Paint paint, xj.k kVar, int i13);

    public abstract void g(Canvas canvas, Paint paint, float f13, float f14, int i13, int i14, int i15);

    public abstract int h();

    public abstract int i();

    public abstract Object j(JSONObject jSONObject);

    public abstract void k(String str);

    public final oi.e l() {
        return ((u4) this.f24333a).f95203g;
    }

    public final x3 m() {
        return ((u4) this.f24333a).f95209m;
    }

    public final g4 n() {
        g4 g4Var = ((u4) this.f24333a).f95204h;
        u4.c(g4Var);
        return g4Var;
    }

    public final f7 o() {
        f7 f7Var = ((u4) this.f24333a).f95208l;
        u4.c(f7Var);
        return f7Var;
    }

    public void p() {
        o4 o4Var = ((u4) this.f24333a).f95206j;
        u4.d(o4Var);
        o4Var.p();
    }

    @Override // oi.d5
    public final Context zza() {
        return ((u4) this.f24333a).f95197a;
    }

    @Override // oi.d5
    public final oh.a zzb() {
        return ((u4) this.f24333a).f95210n;
    }

    @Override // oi.d5
    public final q8.m0 zzd() {
        return ((u4) this.f24333a).f95202f;
    }

    @Override // oi.d5
    public final y3 zzj() {
        y3 y3Var = ((u4) this.f24333a).f95205i;
        u4.d(y3Var);
        return y3Var;
    }

    @Override // oi.d5
    public final o4 zzl() {
        o4 o4Var = ((u4) this.f24333a).f95206j;
        u4.d(o4Var);
        return o4Var;
    }

    public /* synthetic */ s0(Object obj) {
        this.f24333a = obj;
    }

    public s0(xe1.h actionView) {
        Intrinsics.checkNotNullParameter(actionView, "actionView");
        this.f24333a = actionView;
    }

    public s0(u4 u4Var) {
        com.bumptech.glide.d.t(u4Var);
        this.f24333a = u4Var;
    }
}
