package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class CanvasSubtitleOutput extends View implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18873a;

    /* renamed from: b, reason: collision with root package name */
    public List f18874b;

    /* renamed from: c, reason: collision with root package name */
    public int f18875c;

    /* renamed from: d, reason: collision with root package name */
    public float f18876d;

    /* renamed from: e, reason: collision with root package name */
    public b f18877e;

    /* renamed from: f, reason: collision with root package name */
    public float f18878f;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    public final void a(List list, b bVar, float f13, int i13, float f14) {
        this.f18874b = list;
        this.f18877e = bVar;
        this.f18876d = f13;
        this.f18875c = i13;
        this.f18878f = f14;
        while (true) {
            ArrayList arrayList = this.f18873a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new q0(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r40) {
        /*
            Method dump skipped, instructions count: 1261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.CanvasSubtitleOutput.dispatchDraw(android.graphics.Canvas):void");
    }

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18873a = new ArrayList();
        this.f18874b = Collections.emptyList();
        this.f18875c = 0;
        this.f18876d = 0.0533f;
        this.f18877e = b.f19020g;
        this.f18878f = 0.08f;
    }
}
