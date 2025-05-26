package r70;

import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.activity.task.activity.MainActivity;
import jk2.j1;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: i, reason: collision with root package name */
    public static final f0 f106349i = new f0();

    /* renamed from: j, reason: collision with root package name */
    public static b f106350j;

    /* renamed from: a, reason: collision with root package name */
    public g f106351a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f106352b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f106353c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f106354d = true;

    /* renamed from: e, reason: collision with root package name */
    public final ck2.a f106355e = new ck2.a(5, 0);

    /* renamed from: f, reason: collision with root package name */
    public boolean f106356f;

    /* renamed from: g, reason: collision with root package name */
    public final float f106357g;

    /* renamed from: h, reason: collision with root package name */
    public final uk2.d f106358h;

    public b() {
        float dimension;
        if (ff0.j.f62103a) {
            dimension = 56.0f;
        } else {
            Context context = kb0.a.f79058b;
            dimension = f0.W().getResources().getDimension(t70.b.uploader_bar_height);
        }
        this.f106357g = dimension;
        uk2.d R = uk2.d.R(0);
        Intrinsics.checkNotNullExpressionValue(R, "createDefault(...)");
        this.f106358h = R;
    }

    public static final synchronized b c() {
        b k03;
        synchronized (b.class) {
            k03 = f106349i.k0();
        }
        return k03;
    }

    public final float a() {
        float f13;
        LinearLayout view;
        g gVar = this.f106351a;
        if (gVar != null) {
            a aVar = ((MainActivity) gVar).f130611b;
            f13 = (aVar == null || (view = aVar.getView()) == null) ? 0 : view.getHeight();
        } else {
            f13 = 0.0f;
        }
        return this.f106356f ? f13 + this.f106357g : f13;
    }

    public final float b() {
        if (this.f106352b && this.f106353c) {
            return a();
        }
        return 0.0f;
    }

    public final j1 d() {
        ir.j jVar = new ir.j(12, new u00.e(this, 5));
        uk2.d dVar = this.f106358h;
        dVar.getClass();
        j1 j1Var = new j1(dVar, jVar, 0);
        Intrinsics.checkNotNullExpressionValue(j1Var, "map(...)");
        return j1Var;
    }
}
