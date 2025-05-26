package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pk.c1;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public List f18999a;

    /* renamed from: b, reason: collision with root package name */
    public b f19000b;

    /* renamed from: c, reason: collision with root package name */
    public int f19001c;

    /* renamed from: d, reason: collision with root package name */
    public float f19002d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19003e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19004f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19005g;

    /* renamed from: h, reason: collision with root package name */
    public final r0 f19006h;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18999a = Collections.emptyList();
        this.f19000b = b.f19020g;
        this.f19001c = 0;
        this.f19002d = 0.0533f;
        this.f19003e = 0.08f;
        this.f19004f = true;
        this.f19005g = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f19006h = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    public final void a(c1 c1Var) {
        c1 c1Var2 = c1Var;
        if (c1Var == null) {
            c1Var2 = Collections.emptyList();
        }
        this.f18999a = c1Var2;
        d();
    }

    public final void b() {
        CaptioningManager captioningManager;
        boolean isInEditMode = isInEditMode();
        b bVar = b.f19020g;
        if (!isInEditMode && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            bVar = b.a(captioningManager.getUserStyle());
        }
        this.f19000b = bVar;
        d();
    }

    public final void c() {
        CaptioningManager captioningManager;
        float f13 = 1.0f;
        if (!isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            f13 = captioningManager.getFontScale();
        }
        this.f19001c = 0;
        this.f19002d = f13 * 0.0533f;
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public final void d() {
        List arrayList;
        r0 r0Var = this.f19006h;
        if (this.f19004f && this.f19005g) {
            arrayList = this.f18999a;
        } else {
            arrayList = new ArrayList(this.f18999a.size());
            for (int i13 = 0; i13 < this.f18999a.size(); i13++) {
                c7.a a13 = ((c7.b) this.f18999a.get(i13)).a();
                if (!this.f19004f) {
                    kh2.n.Y(a13);
                } else if (!this.f19005g) {
                    kh2.n.Z(a13);
                }
                arrayList.add(a13.a());
            }
        }
        ((CanvasSubtitleOutput) r0Var).a(arrayList, this.f19000b, this.f19002d, this.f19001c, this.f19003e);
    }
}
