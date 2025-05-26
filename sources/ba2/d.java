package ba2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ql2.s;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final View f22413a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f22414b;

    /* renamed from: c, reason: collision with root package name */
    public int f22415c;

    /* renamed from: d, reason: collision with root package name */
    public final a f22416d;

    /* renamed from: e, reason: collision with root package name */
    public final float f22417e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22418f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22419g;

    /* renamed from: h, reason: collision with root package name */
    public final Shader.TileMode f22420h;

    /* renamed from: i, reason: collision with root package name */
    public float f22421i;

    /* renamed from: j, reason: collision with root package name */
    public Bitmap f22422j;

    /* renamed from: k, reason: collision with root package name */
    public b f22423k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22424l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22425m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f22426n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f22427o;

    /* renamed from: p, reason: collision with root package name */
    public final int f22428p;

    /* renamed from: q, reason: collision with root package name */
    public final c f22429q;

    /* JADX WARN: Type inference failed for: r3v7, types: [ba2.c] */
    public d(View blurView, ViewGroup rootView, int i13, a blurAlgorithm, float f13, boolean z13, boolean z14, Shader.TileMode edgeTreatment) {
        Intrinsics.checkNotNullParameter(blurView, "blurView");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(blurAlgorithm, "blurAlgorithm");
        Intrinsics.checkNotNullParameter(edgeTreatment, "edgeTreatment");
        this.f22413a = blurView;
        this.f22414b = rootView;
        this.f22415c = i13;
        this.f22416d = blurAlgorithm;
        this.f22417e = f13;
        this.f22418f = z13;
        this.f22419g = z14;
        this.f22420h = edgeTreatment;
        this.f22421i = 10.0f;
        this.f22425m = true;
        this.f22426n = new int[2];
        this.f22427o = new int[2];
        Context context = blurView.getContext();
        int i14 = eo1.b.color_themed_transparent;
        Object obj = d5.a.f53679a;
        this.f22428p = context.getColor(i14);
        this.f22429q = new ViewTreeObserver.OnPreDrawListener() { // from class: ba2.c
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                d this$0 = d.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.d();
                return true;
            }
        };
        if (Build.VERSION.SDK_INT >= 31 && (blurAlgorithm instanceof e)) {
            ((e) blurAlgorithm).f22436g = blurView.getContext();
        }
        a();
    }

    public final void a() {
        b(true);
        View view = this.f22413a;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        a aVar = this.f22416d;
        aVar.getClass();
        double d2 = measuredWidth / 6.0f;
        if (((int) Math.ceil(d2)) != 0) {
            float f13 = measuredHeight;
            if (((int) Math.ceil(f13 / 6.0f)) != 0) {
                view.setWillNotDraw(false);
                int ceil = (int) Math.ceil(d2);
                int i13 = ceil % 64;
                if (i13 != 0) {
                    ceil = (ceil - i13) + 64;
                }
                this.f22422j = Bitmap.createBitmap(ceil, (int) Math.ceil(f13 / (r2 / ceil)), aVar.b());
                Bitmap bitmap = this.f22422j;
                Intrinsics.f(bitmap);
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                this.f22423k = new b(bitmap);
                this.f22424l = true;
                d();
                return;
            }
        }
        view.setWillNotDraw(true);
    }

    public final void b(boolean z13) {
        ViewGroup viewGroup = this.f22414b;
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        c cVar = this.f22429q;
        viewTreeObserver.removeOnPreDrawListener(cVar);
        View view = this.f22413a;
        view.getViewTreeObserver().removeOnPreDrawListener(cVar);
        if (z13) {
            viewGroup.getViewTreeObserver().addOnPreDrawListener(cVar);
            if (Intrinsics.d(viewGroup.getWindowId(), view.getWindowId())) {
                return;
            }
            view.getViewTreeObserver().addOnPreDrawListener(cVar);
        }
    }

    public final void c(float f13) {
        this.f22421i = s.f(f13, 0.0f, 25.0f);
    }

    public final void d() {
        if (this.f22425m && this.f22424l) {
            b bVar = this.f22423k;
            if (bVar != null) {
                Bitmap bitmap = this.f22422j;
                if (bitmap != null) {
                    bitmap.eraseColor(this.f22428p);
                }
                bVar.save();
                ViewGroup viewGroup = this.f22414b;
                int[] iArr = this.f22426n;
                viewGroup.getLocationOnScreen(iArr);
                View view = this.f22413a;
                int[] iArr2 = this.f22427o;
                view.getLocationOnScreen(iArr2);
                int i13 = iArr2[0] - iArr[0];
                int i14 = iArr2[1] - iArr[1];
                float height = view.getHeight() / (this.f22422j != null ? r7.getHeight() : 1);
                float width = view.getWidth() / (this.f22422j != null ? r7.getWidth() : 1);
                b bVar2 = this.f22423k;
                if (bVar2 != null) {
                    bVar2.translate((-i13) / width, (-i14) / height);
                    float f13 = 1;
                    bVar2.scale(f13 / width, f13 / height);
                }
                viewGroup.draw(bVar);
                bVar.restore();
            }
            a aVar = this.f22416d;
            Bitmap bitmap2 = this.f22422j;
            if (bitmap2 == null) {
                return;
            }
            try {
                this.f22422j = aVar.a(bitmap2, this.f22421i, this.f22420h);
            } catch (Exception e13) {
                e13.printStackTrace();
                Unit unit = Unit.f80348a;
            }
        }
    }
}
