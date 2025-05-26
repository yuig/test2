package yj;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import me.o;

/* loaded from: classes3.dex */
public final class d extends o {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f139187p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ TextPaint f139188q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f139189r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f139190s;

    public d(e eVar, Context context, TextPaint textPaint, o oVar) {
        this.f139190s = eVar;
        this.f139187p = context;
        this.f139188q = textPaint;
        this.f139189r = oVar;
    }

    @Override // me.o
    public final void d(int i13) {
        this.f139189r.d(i13);
    }

    @Override // me.o
    public final void e(Typeface typeface, boolean z13) {
        this.f139190s.g(this.f139187p, this.f139188q, typeface);
        this.f139189r.e(typeface, z13);
    }
}
