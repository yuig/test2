package tn1;

import android.content.Context;
import android.text.TextPaint;
import hk1.t;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ps0.y;
import vn1.g;
import vn1.h;

/* loaded from: classes2.dex */
public final class c extends TextPaint {

    /* renamed from: d, reason: collision with root package name */
    public static final y f118612d = new y(24, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final g f118613e = g.BODY_100;

    /* renamed from: f, reason: collision with root package name */
    public static final vn1.c f118614f = h.f126277c;

    /* renamed from: g, reason: collision with root package name */
    public static final vn1.b f118615g = h.f126276b;

    /* renamed from: h, reason: collision with root package name */
    public static final List f118616h = e0.b(h.f126279e);

    /* renamed from: i, reason: collision with root package name */
    public static final List f118617i = e0.b(vn1.e.REGULAR);

    /* renamed from: j, reason: collision with root package name */
    public static final List f118618j = e0.b(vn1.e.BOLD);

    /* renamed from: a, reason: collision with root package name */
    public final Context f118619a;

    /* renamed from: b, reason: collision with root package name */
    public b f118620b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f118621c;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f118620b = new b((vn1.c) null, (List) null, (g) null, 15);
        this.f118621c = true;
        b bVar = new b((vn1.c) null, (List) null, (g) null, 15);
        this.f118619a = context;
        a(new t(bVar, 13));
        this.f118621c = false;
    }

    public final void a(Function1 nextState) {
        Intrinsics.checkNotNullParameter(nextState, "nextState");
        t tVar = new t(this, 12);
        b bVar = (b) nextState.invoke(this.f118620b);
        if (this.f118621c || !Intrinsics.d(this.f118620b, bVar)) {
            this.f118620b = bVar;
            tVar.invoke(bVar);
        }
    }

    public final void b(vn1.c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        a(new t(color, 15));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, b displayState) {
        super(1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f118620b = new b((vn1.c) null, (List) null, (g) null, 15);
        this.f118621c = true;
        this.f118619a = context;
        a(new t(displayState, 13));
        this.f118621c = false;
    }
}
