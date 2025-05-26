package je;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f75759a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f75760b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f75761c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f75762d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f75763e;

    /* renamed from: f, reason: collision with root package name */
    public z f75764f;

    /* renamed from: g, reason: collision with root package name */
    public z f75765g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f75766h;

    public r2() {
        Paint paint = new Paint();
        this.f75762d = paint;
        paint.setFlags(RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.f75763e = paint2;
        paint2.setFlags(RecyclerViewTypes.VIEW_TYPE_LENS_HISTORY);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f75759a = j1.a();
    }

    public r2(r2 r2Var) {
        this.f75760b = r2Var.f75760b;
        this.f75761c = r2Var.f75761c;
        this.f75762d = new Paint(r2Var.f75762d);
        this.f75763e = new Paint(r2Var.f75763e);
        z zVar = r2Var.f75764f;
        if (zVar != null) {
            this.f75764f = new z(zVar);
        }
        z zVar2 = r2Var.f75765g;
        if (zVar2 != null) {
            this.f75765g = new z(zVar2);
        }
        this.f75766h = r2Var.f75766h;
        try {
            this.f75759a = (j1) r2Var.f75759a.clone();
        } catch (CloneNotSupportedException e13) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e13);
            this.f75759a = j1.a();
        }
    }
}
