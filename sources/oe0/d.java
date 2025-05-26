package oe0;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.pinterest.design.brio.widget.voice.PinterestVoiceLayout;

/* loaded from: classes5.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinterestVoiceLayout f94218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve0.b f94219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup.LayoutParams f94220c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f94221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f94222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f94223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f94224g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int[] f94225h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94226i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f94227j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f94228k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f94229l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f94230m;

    public d(g gVar, PinterestVoiceLayout pinterestVoiceLayout, ve0.b bVar, ViewGroup.LayoutParams layoutParams, int i13, int i14, int i15, boolean z13, int[] iArr, int i16, int i17, boolean z14, f fVar) {
        this.f94230m = gVar;
        this.f94218a = pinterestVoiceLayout;
        this.f94219b = bVar;
        this.f94220c = layoutParams;
        this.f94221d = i13;
        this.f94222e = i14;
        this.f94223f = i15;
        this.f94224g = z13;
        this.f94225h = iArr;
        this.f94226i = i16;
        this.f94227j = i17;
        this.f94228k = z14;
        this.f94229l = fVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f94218a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f94230m.d(this.f94218a, this.f94219b, this.f94220c, this.f94221d, this.f94222e, this.f94223f, this.f94224g, this.f94225h, this.f94226i, this.f94227j, this.f94228k, this.f94229l);
    }
}
