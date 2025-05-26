package androidx.media3.ui;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f19020g = new b(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f19021a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19023c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19024d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19025e;

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f19026f;

    public b(int i13, int i14, int i15, int i16, int i17, Typeface typeface) {
        this.f19021a = i13;
        this.f19022b = i14;
        this.f19023c = i15;
        this.f19024d = i16;
        this.f19025e = i17;
        this.f19026f = typeface;
    }

    public static b a(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : -1, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : -16777216, captionStyle.hasWindowColor() ? captionStyle.windowColor : 0, captionStyle.hasEdgeType() ? captionStyle.edgeType : 0, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : -1, captionStyle.getTypeface());
    }
}
