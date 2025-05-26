package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
final class WebViewSubtitleOutput extends FrameLayout implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f19012a;

    /* renamed from: b, reason: collision with root package name */
    public final List f19013b;

    /* renamed from: c, reason: collision with root package name */
    public final b f19014c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19015d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19016e;

    /* renamed from: f, reason: collision with root package name */
    public final float f19017f;

    public WebViewSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19013b = Collections.emptyList();
        this.f19014c = b.f19020g;
        this.f19015d = 0.0533f;
        this.f19016e = 0;
        this.f19017f = 0.08f;
        View canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        u0 u0Var = new u0(context, attributeSet);
        this.f19012a = u0Var;
        u0Var.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(u0Var);
    }

    public final String a(int i13, float f13) {
        float a03 = kh2.n.a0(f13, i13, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (a03 == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(a03 / getContext().getResources().getDisplayMetrics().density)};
        int i14 = d7.n0.f53866a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x01f5, code lost:
    
        if (r8 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01f8, code lost:
    
        r27 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01fb, code lost:
    
        if (r8 != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.WebViewSubtitleOutput.b():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        if (!z13 || this.f19013b.isEmpty()) {
            return;
        }
        b();
    }
}
